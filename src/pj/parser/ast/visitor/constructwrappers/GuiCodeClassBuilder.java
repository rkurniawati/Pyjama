package pj.parser.ast.visitor.constructwrappers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import pj.parser.ast.omp.OmpGuiConstruct;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.symbolscope.Symbol;
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
		HashMap<String, String> variablesForGuiCode = this.getUsedVariablesInWapperCodeBlock();
    	printer.printLn("try {");
    	printer.indent();
    	//////////////////
		printer.printLn("class "+ this.guiName + " implements Runnable{");
		printer.indent();
		this.printVariablesDefinitionForGuiRegion(variablesForGuiCode);
		printer.print(this.guiName + "(");
		this.printVariableParametersForGuiRegion(variablesForGuiCode);
		printer.printLn("){");
		printer.indent();
		this.printVariablesInitForGuiRegion(variablesForGuiCode);
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
    	this.printVariablesForGuiRegionInvocation(variablesForGuiCode);
    	printer.printLn("));");
       	printer.unindent();
       	printer.printLn("} catch (InvocationTargetException e) {e.printStackTrace();}");
    	printer.printLn("catch (InterruptedException e) {e.printStackTrace();}");
	}
	
	private Statement getUserCode() {
		return this.node.getStatement();
	}
	/************************Print helper functions**************************/
	private HashMap<String, String> getUsedVariablesInWapperCodeBlock() {
		HashMap<String, String> allVariablesDefinationSet = new HashMap<String, String>();
		Collection<Symbol> symbols = this.node.scope.getAllUsedSymbols();
		for(Symbol s: symbols) {
			String varName = s.getName();
			String varType = s.getSymbolDataType();
			allVariablesDefinationSet.put(varName, varType);
		}	
		return allVariablesDefinationSet;
	}
	private void printVariablesDefinitionForGuiRegion(HashMap<String, String> variablesForGuiCode) {
		for (String varName : variablesForGuiCode.keySet()) {
			printer.printLn(variablesForGuiCode.get(varName)+" "+varName+";");
		}
	}
	private void printVariableParametersForGuiRegion(HashMap<String, String> variablesForGuiCode) {
		Iterator iter = variablesForGuiCode.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, String> entry = (Entry<String, String>) iter.next();
			String varName = (String) entry.getKey();
			String varType = entry.getValue();
			printer.print(varType + " " + varName);
			if (iter.hasNext()) {
				printer.print(", ");
			}
		}
	}
	private void printVariablesInitForGuiRegion(HashMap<String, String> variablesForGuiCode) {
		for (String varName : variablesForGuiCode.keySet()) {
			printer.printLn("this."+varName+"="+varName+";");
		}
	}
	private void printVariablesForGuiRegionInvocation(HashMap<String, String> variablesForGuiCode) {
		Iterator iter = variablesForGuiCode.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, String> entry = (Entry<String, String>) iter.next();
			String varName = (String) entry.getKey();
			printer.print(varName);
			if (iter.hasNext()) {
				printer.print(", ");
			}
		}
	}
}
