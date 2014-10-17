package pj.parser.ast.visitor.constructwrappers;

import java.util.HashMap;
import java.util.List;


import pj.parser.ast.omp.OmpGuiConstruct;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.type.Type;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.dataclausehandler.DataClausesHandler;


/**
 * The representation for GUI-aware <code>gui</code> construct
 * 
 * @author vikassingh
 * @author fxin927
 * @version 1.2.1
 */
public class GuiCodeClassBuilder extends ConstructWrapper {

	public String guiName = "";	
	
	private SourcePrinter printer = new SourcePrinter();
	/*
	 * the actual representation of <code>gui</code> node
	 * from the AST
	 */
	private OmpGuiConstruct node;	
	

	public StringBuffer onceChecker = new StringBuffer("");
	private PyjamaToJavaVisitor visitor;
	/*
	 * though Pyjama does not support nested constructs,
	 * the <code>gui</code> construct can be used in nested scenarios
	 * with other Pyjama directives.
	 * we keep a track of visiting the variables using this
	 */
	public StringBuffer variableNested = new StringBuffer("");

	public GuiCodeClassBuilder(OmpGuiConstruct guiNode, PyjamaToJavaVisitor visitor) {
		this.node = guiNode;
		this.visitor = visitor;
	}

	@Override
	public int getBeginLine() {
		return node.getBeginLine();
	}

	@Override
	public int getEndLine() {
		return node.getEndLine();
	}

//	@Override
//	public HashMap<String, Type> autoGetAllLocalMethodVariables() {
//		Scope currentScope = this.getVarScope();
//		HashMap<String, pj.parser.ast.type.Type> currentMethodVariablesSet = new HashMap<String, pj.parser.ast.type.Type>();
//		currentScope.getMethodDefinedVariablesSet(currentMethodVariablesSet);
//
//		return currentMethodVariablesSet;
//	}
	
//	public HashMap<String, Type> autoGetAllParallelRegionVariables() {
//		Scope currentScope = this.getVarScope();
//		HashMap<String, pj.parser.ast.type.Type> currentPRVariablesSet = new HashMap<String, pj.parser.ast.type.Type>();
//		currentScope.getParallelRegionDefinedVariablesSet(currentPRVariablesSet);
//
//		return currentPRVariablesSet;
//	}
	
	public OmpGuiConstruct getNode() {
		return this.node;
	}
	
	public String getSource()
	{
		this.generateClass();
		return printer.getSource();
	}
	
	private void generateClass() {
		HashMap<String, Type> variablesForGuiCode = DataClausesHandler.getUsedVariablesInWapperCodeBlock(this);
    	printer.printLn("try {");
    	printer.indent();
    	//////////////////
		printer.printLn("class "+ this.guiName + " implements Runnable{");
		printer.indent();
		DataClausesHandler.printVariablesDefinitionForGuiRegion(variablesForGuiCode, printer);
		printer.print(this.guiName + "(");
		DataClausesHandler.printVariableParametersForGuiRegion(variablesForGuiCode, printer);
		printer.printLn("){");
		printer.indent();
		DataClausesHandler.printVariablesInitForGuiRegion(variablesForGuiCode, printer);
		printer.unindent();
		printer.printLn("}");
		printer.printLn("@Override");
		printer.printLn("public void run() {");
		printer.indent();
		//BEGIN get construct user code
		printer.printLn("/****User Code BEGIN***/");
		this.getUserCode().accept(visitor, printer);
		printer.printLn();
		printer.printLn("/****User Code END***/");
		//END get construct user code
		printer.unindent();
		printer.printLn("}");
		printer.unindent();
		printer.printLn("}");
		/////////////////////
		if (true == this.node.isNowait()) {
			printer.print("SwingUtilities.invokeLater(new ");
		}
		else {
			printer.print("SwingUtilities.invokeAndWait(new ");
		}
    	printer.print(this.guiName + "(");
    	DataClausesHandler.printVariablesForGuiRegionInvocation(variablesForGuiCode, printer);
    	printer.printLn("));");
       	printer.unindent();
       	printer.printLn("} catch (InvocationTargetException e) {e.printStackTrace();}");
    	printer.printLn("catch (InterruptedException e) {e.printStackTrace();}");
	}
	
	private Statement getUserCode() {
		return this.node.getStatement();
	}
}
