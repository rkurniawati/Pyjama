package pj.parser.ast.visitor.constructwrappers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import pj.parser.ast.body.VariableDeclarator;
import pj.parser.ast.body.VariableDeclaratorId;
import pj.parser.ast.expr.VariableDeclarationExpr;
import pj.parser.ast.omp.OmpAwaitConstruct;
import pj.parser.ast.omp.OmpFunctionCallDeclaration;
import pj.parser.ast.symbolscope.ScopeInfo;
import pj.parser.ast.type.ClassOrInterfaceType;
import pj.parser.ast.visitor.AsyncFunctionCallSubstitutionVisitor;
import pj.parser.ast.visitor.DumpVisitor;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.visitor.SourcePrinter;

public abstract class StateMachineClassBuilder extends ConstructWrapper{
	
	public static final String stateMachineIdentifier = "OmpStateMachine_"; 

	protected String staticPrefix = "";
	
	protected boolean currentClassIsStatic = false;
	
	protected SourcePrinter printer = new SourcePrinter();
	
	//This list contains all the variables should be declared as field variables in this state machine class.
	protected LinkedList<VariableDeclarationExpr> variableDeclarations = new LinkedList<VariableDeclarationExpr>();
	
	protected String generatedCodeVarDeclarations = "";

	public PyjamaToJavaVisitor visitor;
	
	protected int stateCounter = 0;
	
	public void setPrinterIndentLevel(int level) {
		this.printer.setIndentLevel(level);
	}
	
	abstract protected void generateClass();
	
	abstract protected void generateStates();
			
	public String getSource() {
		this.generateClass();
		return printer.getSource();
	}
	
	protected void visitOmpAwaitConstruct(OmpAwaitConstruct n) {
		ScopeInfo currentOmpAwaitConstructScopeInfo = visitor.getSymbolTable().getScopeOfNode(n);
		List<OmpFunctionCallDeclaration> functions = n.getAwaitFunctions();
		AsyncFunctionCallSubstitutionVisitor substitutionVisitor = new AsyncFunctionCallSubstitutionVisitor(currentOmpAwaitConstructScopeInfo, functions);
		substitutionVisitor.getPriter().setIndentLevel(printer.getIndentLevel());
		n.getBody().accept(substitutionVisitor, substitutionVisitor.getPriter());
		for(AsyncFunctionCallSubstitutionVisitor.SubstitutionInfo substitution: substitutionVisitor.getSubstitutionInfos()) {
			String stateMachineCall = substitution.resultAwaiter;
			String methodScope = substitution.methodScope;
			String methodCall = substitution.methodCall;
			//Declare this auxiliary awaiter variable as statemachine field variable.
			LinkedList<VariableDeclarator> declarators = new LinkedList<VariableDeclarator>();
            declarators.add(new VariableDeclarator(new VariableDeclaratorId(stateMachineCall)));
            this.variableDeclarations.add(new VariableDeclarationExpr(new ClassOrInterfaceType(substitution.returnType), declarators));
			printer.printLn(stateMachineCall + " = " + methodScope + "new " + stateMachineIdentifier + methodCall + ";");
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
		variableDeclarations.addAll(substitutionVisitor.getVariableDeclarations());
		printer.printLn(substitutionVisitor.getSource());
	}
	
	protected void visitVariableDeclarationExpr(VariableDeclarationExpr n) {
		/*
		 * We find all VariableDeclarationExpr in this method,
		 * and declare all variables in state machine class as
		 * field member. The midway variable declaration becomes
		 * variable value assignment.   --Xing 2016.5.3
		 */
		this.variableDeclarations.add(n);
		for (Iterator<VariableDeclarator> i = n.getVars().iterator(); i.hasNext();) {
			VariableDeclarator v = i.next();
			if (v.getInit() != null) {
	        	DumpVisitor codeDumper = new DumpVisitor();
			 	v.accept(codeDumper, null);
			 	printer.printLn(codeDumper.getSource() + ";");
	        } else {
	        	//If the variable declaration is no initialized value, simply ignore that.
	        }   
		}
	}
}
