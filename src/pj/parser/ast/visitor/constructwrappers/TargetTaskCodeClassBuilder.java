package pj.parser.ast.visitor.constructwrappers;
/**
 * This is the representation for <code>omp target virtual</code>
 * construct.
 * @author Xing Fan
 * @version 0.1
 */


import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import pj.PjRuntime;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.omp.OmpDataClause;
import pj.parser.ast.omp.OmpParallelConstruct;
import pj.parser.ast.omp.OmpPrivateDataClause;
import pj.parser.ast.omp.OmpReductionDataClause;
import pj.parser.ast.omp.OmpSharedDataClause;
import pj.parser.ast.omp.OmpTargetConstruct;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.dataclausehandler.DataClausesHandler;
import pj.pr.PjExecutor;
import pj.pr.exceptions.OmpParallelRegionLocalCancellationException;


public class TargetTaskCodeClassBuilder extends ConstructWrapper  {

	public String className = "";
	
	private SourcePrinter printer = new SourcePrinter();
	
	private String staticPrefix = "";
	
	public List<Statement> currentMethodOrConstructorStmts = null;

	public PyjamaToJavaVisitor visitor;
	public OmpTargetConstruct targetConstruct;
	private List<OmpDataClause> dataClauseList;
		
	public TargetTaskCodeClassBuilder(OmpTargetConstruct parallelConstruct, 
			boolean isStatic, 
			PyjamaToJavaVisitor visitor,
			List<Statement> stmts)
	{	
		this.targetConstruct = parallelConstruct;
		this.dataClauseList = parallelConstruct.getDataClauseList();
		if (isStatic) {
			this.staticPrefix = "static ";
		}
		this.visitor = visitor;
		this.currentMethodOrConstructorStmts = stmts;
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
		printer.printLn(this.staticPrefix +"class " + this.className + "{");
		printer.indent();
		printer.printLn("private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();");
		printer.printLn("private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();");
		printer.printLn("public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);");
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
		printer.printLn("class MyCallable implements Callable<ConcurrentHashMap<String,Object>> {");
		printer.indent();
		printer.printLn("private ConcurrentHashMap<String, Object> OMP_inputList;");
		printer.printLn("private ConcurrentHashMap<String, Object> OMP_outputList;");
		
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
		
		printer.printLn("MyCallable(ConcurrentHashMap<String,Object> inputlist, ConcurrentHashMap<String,Object> outputlist){");
		printer.indent();
		printer.printLn("this.OMP_inputList = inputlist;");
		printer.printLn("this.OMP_outputList = outputlist;");
		
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
		printer.printLn("@Override");
		printer.printLn("public ConcurrentHashMap<String,Object> call() {");
		printer.indent();
		printer.printLn("try {");
		printer.indent();
		//BEGIN get construct user code
		printer.printLn("/****User Code BEGIN***/");
		this.getUserCode().accept(visitor, printer);
		printer.printLn();
		printer.printLn("/****User Code END***/");
		//BEGIN Master thread updateOutputList
		printer.unindent();
		printer.printLn("} catch (OmpParallelRegionLocalCancellationException e) {");
		printer.printLn(" 	PjRuntime.decreaseBarrierCount();");
		printer.printLn("} catch (Exception e) {");
		printer.printLn("    PjRuntime.decreaseBarrierCount();");
		printer.printLn("	PjExecutor.cancelCurrentThreadGroup();");
		printer.printLn("OMP_CurrentParallelRegionExceptionSlot.compareAndSet(null, e);");
		printer.unindent();
		printer.printLn("}");
		printer.printLn("updateOutputListForSharedVars();");
		//END Master thread updateOutputList
		//END get construct user code
		printer.printLn("return null;");
		printer.unindent();
		printer.printLn("}");
		printer.unindent();
		printer.printLn("}");
		printer.printLn("public void runTaskCode() {");
		printer.indent();
		this.generateRunnable();
		printer.unindent();
		printer.printLn("}");
		printer.unindent();
		printer.printLn("}");
		
	}	
	
	private void generateRunnable() {

		printer.printLn("Callable<ConcurrentHashMap<String,Object>> targetTask = new MyCallable(OMP_inputList, OMP_outputList);");
		//printer.printLn("PjRuntime.submit(i, slaveThread, icv);");
		printer.printLn("ExecutorService threadPoolExecutor = new ThreadPoolExecutor(1, 2, 3, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());");
		printer.printLn("threadPoolExecutor.submit(targetTask);");
	
	}

}
