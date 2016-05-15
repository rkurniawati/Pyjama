package pj.parser.ast.visitor.constructwrappers;

import java.util.LinkedList;
import pj.parser.ast.expr.VariableDeclarationExpr;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.visitor.SourcePrinter;

public abstract class StateMachineClassBuilder extends ConstructWrapper{
	
	public static final String stateMachineIdentifier = "OmpStateMachine_"; 

	protected String staticPrefix = "";
	
	protected SourcePrinter printer = new SourcePrinter();
	
	//This list contains all the variables should be declared as field variables in this state machine class.
	protected LinkedList<VariableDeclarationExpr> variableDeclarations = new LinkedList<VariableDeclarationExpr>();
	
	protected String generatedCodeVarDeclarations;

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
}
