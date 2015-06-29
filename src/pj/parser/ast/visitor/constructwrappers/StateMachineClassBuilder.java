package pj.parser.ast.visitor.constructwrappers;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import pj.parser.ast.body.MethodDeclaration;
import pj.parser.ast.body.Parameter;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.omp.OmpTargetConstruct;
import pj.parser.ast.stmt.BlockStmt;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.DumpVisitor;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.visitor.SourcePrinter;


public class StateMachineClassBuilder extends ConstructWrapper {

	
	private SourcePrinter printer = new SourcePrinter();
	
	//private DumpVisitor codeDumper = new DumpVisitor();

	private MethodDeclaration method;

	public PyjamaToJavaVisitor visitor;

		
	public StateMachineClassBuilder(MethodDeclaration methodConstruct, PyjamaToJavaVisitor visitor)
	{	
		this.method = methodConstruct;
		this.visitor = visitor;
	}

	private Statement getUserCode() {
		return this.method.getBody();
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
	        printer.print(method.getName());

	        printer.print("(");
	        if (method.getParameters() != null) {
	            for (Iterator<Parameter> i = method.getParameters().iterator(); i.hasNext();) {
	                Parameter p = i.next();
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
	        printer.unindent();
	        printer.printLn("}");
	       
	}
	
	private void generateStates() {
		int stateCounter = 0;
		BlockStmt body = this.method.getBody();
		if (null == body) {
			throw new RuntimeException("Pyjama unexpected situation: converting an abstract method to state machine");
		}
		List<Statement> stmts = body.getStmts();
		Iterator<Statement> iter = stmts.iterator();
		Statement s;
		while (iter.hasNext()) {
			s = iter.next();
			if ((s instanceof OmpTargetConstruct) && ((OmpTargetConstruct)s).isAwait()) {
				//if current statement is an await target construct, then, this statement is a seperator
				stateCounter++;
				printer.unindent();
				printer.printLn("case " + stateCounter + ":");
				printer.indent();
			} else {
				DumpVisitor codeDumper = new DumpVisitor();
                s.accept(codeDumper, null);
                printer.printLn(codeDumper.getSource());
			}
		}
			
	}
	
	private void generateClass() {
		printer.printLn("class " + this.method.getName() + " extends pj.pr.target.TargetTask{");
		printer.indent();
		//printer class constructor, with same method parameter
		this.generateConstructor();
		printer.printLn("int state;");
		printer.printLn("@Override");
		printer.printLn("public ConcurrentHashMap<String,Object> call() {");
		printer.indent();
		printer.printLn("switch(state) {");
		printer.printLn("case 0:");
		printer.indent();
		this.generateStates();
		printer.printLn("default:");
		printer.printLn("}");
		printer.unindent();
		printer.printLn("}");
		printer.unindent();
		printer.printLn("}");
	}
	
	
	
}
