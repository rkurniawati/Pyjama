package pj.parser.ast.visitor.constructwrappers;
/**
 * This is the representation for <code>omp target virtual</code>
 * construct.
 * @author Xing Fan
 * @version 0.1
 */


import java.util.HashMap;
import java.util.List;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.omp.OmpDataClause;
import pj.parser.ast.omp.OmpPrivateDataClause;
import pj.parser.ast.omp.OmpReductionDataClause;
import pj.parser.ast.omp.OmpSharedDataClause;
import pj.parser.ast.omp.OmpTargetConstruct;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.dataclausehandler.DataClausesHandler;

public class TargetTaskCodeClassBuilder extends ConstructWrapper  {
	
	private static HashMap<OmpTargetConstruct, TargetTaskCodeClassBuilder> pairs = new HashMap<OmpTargetConstruct, TargetTaskCodeClassBuilder>();

	public String className = "";
	
	private SourcePrinter printer = new SourcePrinter();
	
	private String staticPrefix = "";
	
	public PyjamaToJavaVisitor visitor;
	public OmpTargetConstruct targetConstruct;
	private List<OmpDataClause> dataClauseList;
	
	public static TargetTaskCodeClassBuilder create(OmpTargetConstruct targetConstruct) {
		TargetTaskCodeClassBuilder ttb = pairs.get(targetConstruct);
		if (null == ttb) {
			throw new RuntimeException("Try to create TargetTaskCodeClassBuilder from pre-visited targetConstruct node, but node not found!");
		}
		return ttb;
	}
			
	public static TargetTaskCodeClassBuilder create(OmpTargetConstruct targetConstruct, 
			boolean isStatic, 
			PyjamaToJavaVisitor visitor,
			String className) {
		TargetTaskCodeClassBuilder ttb = pairs.get(targetConstruct);
		if (null == ttb) {
			ttb = new TargetTaskCodeClassBuilder(targetConstruct, isStatic, visitor, className);
			pairs.put(targetConstruct, ttb);
		}
		return ttb;
	}
	
	private TargetTaskCodeClassBuilder(OmpTargetConstruct targetConstruct, 
			boolean isStatic, 
			PyjamaToJavaVisitor visitor,
			String className)
	{	
		this.targetConstruct = targetConstruct;
		this.dataClauseList = targetConstruct.getDataClauseList();
		if (isStatic) {
			this.staticPrefix = "static ";
		}
		this.visitor = visitor;
		this.className = className;
	}
	
	public void setPrinterIndentLevel(int level) {
		this.printer.setIndentLevel(level);
	}

	private Statement getUserCode() {
		return targetConstruct.getBody();
	}

	@Override
	public int getBeginLine() {
		return targetConstruct.getBeginLine();
	}
	
	@Override
	public int getEndLine() {
		return targetConstruct.getEndLine();
	}
	

	public String get_inputlist() {
		return "inputlist_" + this.className;
	}
	
	public String get_outputlist() {
		return "outputlist_" + this.className;
	}
		
	public String getSource()
	{
		this.generateClass();
		return printer.getSource();
	}
	
	private void generateClass() {
		printer.printLn();
		//////////////////////////////////////////////
		printer.printLn(this.staticPrefix +"class " + this.className + " extends pj.pr.target.TargetTask<Void>{");
		printer.indent();
		printer.printLn("private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();");
		printer.printLn("private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();");
		printer.printLn();
		//#BEGIN shared variables defined here
		printer.printLn("//#BEGIN shared variables defined here");
		for(OmpDataClause sharedClause: this.dataClauseList) {
			if (sharedClause instanceof OmpSharedDataClause) {
				((OmpSharedDataClause) sharedClause).printSharedVariableDefination(targetConstruct, printer);
			} else {
				continue;
			}
		}
		printer.printLn("//#END shared variables defined here");
		//#END shared variables defined here
		//#BEGIN firstprivate reduction variables defined for each thread here
		printer.printLn("//#BEGIN private/firstprivate reduction variables defined here");
		for(OmpDataClause clause: this.dataClauseList) {
			if (clause instanceof OmpReductionDataClause) {
				((OmpReductionDataClause) clause).printReductionVariableDefination(targetConstruct, printer);
			} else {
				continue;
			}
		}
		printer.printLn("//#END private/firstprivate reduction variables  defined here");
		//#END firstprivate reduction variables defined for each thread here
		printer.printLn("public " + this.className + "(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {");
		printer.indent();
		printer.printLn("this.OMP_inputList = inputlist;");
		printer.printLn("this.OMP_outputList = outputlist;");
		//#BEGIN shared variables initialised here
		printer.printLn("//#BEGIN shared variables initialised here");
		for(OmpDataClause sharedClause: this.dataClauseList) {
			if (sharedClause instanceof OmpSharedDataClause) {
				((OmpSharedDataClause) sharedClause).printSharedVariableInitialisation(targetConstruct, printer);
			} else {
				continue;
			}
		}
		printer.printLn("//#END shared variables initialised here");
		//#END shared variables initialised here

		//#BEGIN firstprivate reduction variables initialised for each thread here
		printer.printLn("//#BEGIN firstprivate reduction variables initialised here");
		for(OmpDataClause clause: this.dataClauseList) {
			if (clause instanceof OmpPrivateDataClause) {
				((OmpPrivateDataClause) clause).printPrivateVariableInitialisation(targetConstruct, printer);
			} else {
				continue;
			}
		}
		printer.printLn("//#END firstprivate reduction variables initialised here");
		//#END firstprivate reduction variables initialised for each thread here
		printer.unindent();
		printer.printLn("}");
		printer.printLn();
		printer.printLn("private void updateOutputListForSharedVars() {");
		printer.indent();
		//BEGIN put shared variables lastprivate(if any, though no available) to outputlist
		printer.printLn("//BEGIN update outputlist");
		DataClausesHandler.updateOutputlistForSharedVariablesInTTClass(this, printer);
		printer.printLn("//END update outputlist");
		//END put shared variables lastprivate(if any, though no available) to outputlist
		printer.unindent();
		printer.printLn("}");
	
		printer.printLn("@Override");
		printer.printLn("public Void call() {");
		printer.indent();
		//BEGIN get construct user code
		printer.printLn("/****User Code BEGIN***/");
		this.getUserCode().accept(visitor, printer);
		printer.printLn();
		printer.printLn("/****User Code END***/");
		//END get construct user code
		printer.printLn("updateOutputListForSharedVars();");
		printer.printLn("return null;");
		printer.unindent();
		printer.printLn("}");

		printer.unindent();
		printer.printLn("}");
	}	
	
}
