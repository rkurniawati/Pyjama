package pj.parser.ast.visitor.constructwrappers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import pj.PjRuntime;
import pj.parser.ast.body.MethodDeclaration;
import pj.parser.ast.body.Parameter;
import pj.parser.ast.body.VariableDeclarator;
import pj.parser.ast.body.VariableDeclaratorId;
import pj.parser.ast.expr.VariableDeclarationExpr;
import pj.parser.ast.omp.OmpAwaitConstruct;
import pj.parser.ast.omp.OmpAwaitFunctionCallDeclaration;
import pj.parser.ast.omp.OmpTargetConstruct;
import pj.parser.ast.stmt.BlockStmt;
import pj.parser.ast.stmt.ExpressionStmt;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.symbolscope.ScopeInfo;
import pj.parser.ast.type.ClassOrInterfaceType;
import pj.parser.ast.type.Type;
import pj.parser.ast.visitor.AsyncFunctionCallSubstitutionVisitor;
import pj.parser.ast.visitor.DumpVisitor;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.dataclausehandler.DataClauseHandlerUtils;
import pj.parser.ast.visitor.dataclausehandler.DataClausesHandler;


public class StateMachineClassBuilder extends ConstructWrapper {

	public static final String stateMachineIdentifier = "OmpStateMachine_"; 
	
	private String staticPrefix = "";
	
	private SourcePrinter printer = new SourcePrinter();
	
	//This list contains all the variables should be declared as field variables in this state machine class.
	private LinkedList<VariableDeclarationExpr> variableDeclarations = new LinkedList<VariableDeclarationExpr>();
	
	private String generatedCodeVarDeclarations;

	private MethodDeclaration method;

	public PyjamaToJavaVisitor visitor;
		
	public StateMachineClassBuilder(MethodDeclaration methodConstruct, boolean isStatic, PyjamaToJavaVisitor visitor, String generatedCodeVarDeclarations)
	{	
		this.method = methodConstruct;
		this.visitor = visitor;
		if (isStatic) {
			this.staticPrefix = "static ";
		}
		this.generatedCodeVarDeclarations = generatedCodeVarDeclarations;
	}

	@Override
	public int getBeginLine() {
		return method.getBeginLine();
	}
	
	@Override
	public int getEndLine() {
		return method.getEndLine();
	}
	
	public void setPrinterIndentLevel(int level) {
		this.printer.setIndentLevel(level);
	}
			
	public String getSource()
	{
		this.generateClass();
		return printer.getSource();
	}
	
	private void generateConstructor() {
	        printer.print("public ");
	        printer.print(stateMachineIdentifier + method.getName());

	        printer.print("(");
	        if (method.getParameters() != null) {
	            for (Iterator<Parameter> i = method.getParameters().iterator(); i.hasNext();) {
	                Parameter p = i.next();
	                LinkedList<VariableDeclarator> declarators = new LinkedList<VariableDeclarator>();
	                declarators.add(new VariableDeclarator(p.getId()));
	                this.variableDeclarations.add(new VariableDeclarationExpr(p.getType(), declarators));
	                DumpVisitor codeDumper = new DumpVisitor();
	                p.accept(codeDumper, null);
	                printer.print(codeDumper.getSource());
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	        }
	        printer.printLn(") {");
	        printer.indent();
	        if (method.getParameters() != null) {
	        	for (Iterator<Parameter> j = method.getParameters().iterator(); j.hasNext();) {
	        		Parameter p = j.next();
	        		printer.printLn("this." + p.getId() + " = " + p.getId() + ";");
	        	};
	        }
	        printer.unindent();
	        printer.printLn("}");
	       
	}
	
	private void generateStates() {
		int stateCounter = 0;
		BlockStmt body = this.method.getBody();
		if (null == body) {
			throw new RuntimeException("Pyjama unexpected situation: converting an abstract method to state machine.");
		}
		List<Statement> stmts = body.getStmts();
		Iterator<Statement> iter = stmts.iterator();
		Statement s;
		while (iter.hasNext()) {
			s = iter.next();
			if (s instanceof OmpAwaitConstruct) {

				ScopeInfo currentOmpAwaitConstructScopeInfo = visitor.getSymbolTable().getScopeOfNode(s);
				List<OmpAwaitFunctionCallDeclaration> functions = ((OmpAwaitConstruct)s).getAwaitFunctions();
				AsyncFunctionCallSubstitutionVisitor substitutionVisitor = new AsyncFunctionCallSubstitutionVisitor(currentOmpAwaitConstructScopeInfo, functions);
				substitutionVisitor.getPriter().setIndentLevel(printer.getIndentLevel());
				((OmpAwaitConstruct)s).getBody().accept(substitutionVisitor, substitutionVisitor.getPriter());
				for(AsyncFunctionCallSubstitutionVisitor.SubstitutionInfo substitution: substitutionVisitor.getSubstitutionInfos()) {
					String stateMachineCall = substitution.resultAwaiter;
					String methodCall = substitution.methodCall;
					//Declare this auxiliary awaiter variable as statemachine field variable.
					LinkedList<VariableDeclarator> declarators = new LinkedList<VariableDeclarator>();
	                declarators.add(new VariableDeclarator(new VariableDeclaratorId(stateMachineCall)));
	                this.variableDeclarations.add(new VariableDeclarationExpr(new ClassOrInterfaceType(substitution.returnType), declarators));
					printer.printLn(stateMachineCall + " = new " + stateMachineIdentifier + methodCall + ";");
					printer.printLn(stateMachineCall + ".setOnCompleteCall(this, PjRuntime.getVirtualTargetOfCurrentThread());");
	                printer.printLn("PjRuntime.runTaskDirectly(" + stateMachineCall + ");");
					printer.printLn("if (false == PjRuntime.checkFinish(" +stateMachineCall + "))  {");
					printer.indent();
					printer.printLn("this.OMP_state++;");
					printer.printLn("return null;");
					printer.unindent();
					printer.printLn("} else {");
					printer.indent();
					printer.printLn("this.OMP_state++;");
					printer.unindent();
					printer.printLn("}");
					stateCounter++;
					printer.unindent();
					printer.printLn("case " + stateCounter + ":");
					printer.indent();
				}
				this.variableDeclarations.addAll(substitutionVisitor.getVariableDeclarations());
				printer.printLn(substitutionVisitor.getSource());
				//System.err.println("encoutering await block:"+s.toString());
				continue;
			}
			if (s instanceof OmpTargetConstruct) {
				PyjamaToJavaVisitor yetAnotherPjVisitor = new PyjamaToJavaVisitor(visitor.getSymbolTable(), true);
				yetAnotherPjVisitor.getPriter().setIndentLevel(printer.getIndentLevel());
                s.accept(yetAnotherPjVisitor, yetAnotherPjVisitor.getPriter());
                printer.printLn(yetAnotherPjVisitor.getSource());
				if (((OmpTargetConstruct)s).isAwait()) {
					//if current statement is an await target construct, then, this statement is a separator
					stateCounter++;
					printer.unindent();
					printer.printLn("case " + stateCounter + ":");
					printer.indent();
					DataClausesHandler.processDataClausesAfterTTClassInvocation(TargetTaskCodeClassBuilder.create((OmpTargetConstruct)s), printer);
				}
				continue;
			}
			if (s instanceof ExpressionStmt && (((ExpressionStmt) s).getExpression() instanceof VariableDeclarationExpr)) {
				/*
				 * We find all VariableDeclarationExpr in this method,
				 * and declare all variables in state machine class as
				 * field member. The midway variable declaration becomes
				 * variable value assignment.   --Xing 2016.5.3
				 */
				VariableDeclarationExpr varDeclExpr = (VariableDeclarationExpr) ((ExpressionStmt) s).getExpression();
				this.variableDeclarations.add(varDeclExpr);
				for (Iterator<VariableDeclarator> i = varDeclExpr.getVars().iterator(); i.hasNext();) {
					VariableDeclarator v = i.next();
					if (v.getInit() != null) {
			        	DumpVisitor codeDumper = new DumpVisitor();
					 	v.accept(codeDumper, null);
					 	printer.printLn(codeDumper.getSource() + ";");
			        } else {
			        	//If the variable declaration is no initialized value, simply ignore that.
			        }   
				}
				continue;
			}
			/*DEFAULT
			 * Simply using PyjamaToJavaVisitor to visit other ExpressionStmts.
			 */
			PyjamaToJavaVisitor yetAnotherPjVisitor = new PyjamaToJavaVisitor(visitor.getSymbolTable(), true);
			yetAnotherPjVisitor.getPriter().setIndentLevel(printer.getIndentLevel());
	        s.accept(yetAnotherPjVisitor, yetAnotherPjVisitor.getPriter());
	        printer.printLn(yetAnotherPjVisitor.getSource());
			 
		}		
	}
	
	private void generateVariableDeclaration() {
		printer.printLn(this.generatedCodeVarDeclarations);
		for(VariableDeclarationExpr varDeclExpr: this.variableDeclarations) {
			Type type = varDeclExpr.getType();
			for (Iterator<VariableDeclarator> i = varDeclExpr.getVars().iterator(); i.hasNext();) {
		           VariableDeclarator v = i.next();
		           DumpVisitor codeDumper = new DumpVisitor();
		           v.accept(codeDumper, null);
		           printer.printLn("private " + type.toString() + " " + v.getId() + ";");   
		    }
		}
	}
	
	private void generateClass() {
		String returnType = DataClauseHandlerUtils.autoBox(this.method.getType().toString());
		printer.printLn(this.staticPrefix + "class " + stateMachineIdentifier + this.method.getName() + " extends pj.pr.target.TargetTask<" + returnType + "> {");
		printer.indent();
		//printer class constructor, with same method parameter
		this.generateConstructor();
		printer.printLn("int OMP_state = 0;");
		printer.printLn("@Override");
		printer.printLn("public " + returnType  + " call() {");
		printer.indent();
		printer.printLn("switch(OMP_state) {");
		printer.printLn("case 0:");
		printer.indent();
		this.generateStates();
		printer.printLn("default:");
		printer.indent();
		printer.printLn("this.setFinish();");
		printer.unindent();
		printer.unindent();
		printer.printLn("}");
		printer.printLn("return null;");
		printer.unindent();
		printer.printLn("}");
		printer.unindent();
		generateVariableDeclaration();
		printer.unindent();
		printer.printLn("}");
	}
	
}
