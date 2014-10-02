package pj.parser.ast.visitor.constructwrappers;
/**
 * This is the representation for <code>parallel</code>
 * construct.
 * 
 * It should be noted that this is an 
 * elementary directive. In scenarios, where
 * combined directives are used, they are again 
 * normalised into the elementary ones.
 * 
 * @author Xing Fan
 * @version 0.9
 */



import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

import pj.parser.ast.expr.OpenMP_DataClause;
import pj.parser.ast.visitor.PyjamaVisitor;
import pj.parser.ast.stmt.OpenMP_Parallel_Construct;
import pj.parser.ast.stmt.Statement;
import pj.symbol.Scope;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.dataclausehandler.DataClauseHandler;




public class ParallelRegionClassBuilder extends ConstructWrapper  {

	public String className = "";
	
	private SourcePrinter printer = new SourcePrinter();
	
	private String staticPrefix = "";
	public List<Statement> currentMethodOrConstructorStmts = null;
	public PyjamaVisitor visitor;
	public OpenMP_Parallel_Construct parallelConstruct;

	
		
	public ParallelRegionClassBuilder(OpenMP_Parallel_Construct parallelConstruct, boolean isStatic, PyjamaVisitor visitor, List<Statement> stmts)
	{	
		this.parallelConstruct = parallelConstruct;
		if (isStatic) {
			this.staticPrefix = "static ";
		}
		this.visitor = visitor;
		this.currentMethodOrConstructorStmts = stmts;

	}

	
//	public Statement getUserCode() {
//		return parallelConstruct.getStatements().get(0);
//	}

	@Override
	public Scope getVarScope() {
		return parallelConstruct.getVarScope();
	}
	@Override
	public List<OpenMP_DataClause> getDataClauses() {
		return parallelConstruct.getDataClauses();
	}

	@Override
	public int getBeginLine() {
		return parallelConstruct.getBeginLine();
	}
	@Override
	public int getEndLine() {
		return parallelConstruct.getEndLine();
	}
	
	@Override
	public String get_inputlist() {
		return "inputlist_" + this.className;
	}
	
	@Override
	public String get_outputlist() {
		return "outputlist_" + this.className;
	}
	
	@Override
	public HashMap<String, pj.parser.ast.type.Type> autoGetAllLocalMethodVariables()
	{
		Scope currentScope = parallelConstruct.getVarScope();
		HashMap<String, pj.parser.ast.type.Type> currentMethodVariablesSet = new HashMap<String, pj.parser.ast.type.Type>();
		currentScope.getMethodDefinedVariablesSet(currentMethodVariablesSet);

		return currentMethodVariablesSet;
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
		printer.indent();
		printer.printLn("private int OMP_threadNumber = 1;");
		printer.printLn("private InternalControlVariables icv;");
		printer.printLn("private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();");
		printer.printLn("private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();");
		printer.printLn("private CyclicBarrier OMP_barrier;");
		printer.printLn("private ReentrantLock OMP_lock;");
		printer.printLn();
		//#BEGIN shared variables defined here
		printer.printLn("//#BEGIN shared variables defined here");
		DataClauseHandler.sharedVariablesDefine(this, printer);
		printer.printLn("//#END shared variables defined here");
		//#END shared variables defined here
		printer.printLn("public " + this.className + "(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {");
		printer.indent();
		printer.printLn("this.icv = icv;");
		printer.printLn("if ((false == Pyjama.omp_get_nested()) && (Pyjama.omp_get_level() > 0)) {");
		printer.indent();
		printer.printLn("this.OMP_threadNumber = 1;");
		printer.unindent();
		printer.printLn("}else {");
		printer.indent();
		printer.printLn("this.OMP_threadNumber = thread_num;");
		printer.unindent();
		printer.printLn("}");
		printer.printLn("icv.currentParallelRegionThreadNumber = this.OMP_threadNumber;");
		printer.printLn("this.OMP_inputList = inputlist;");
		printer.printLn("this.OMP_outputList = outputlist;");
		printer.printLn("this.OMP_barrier = new CyclicBarrier(this.OMP_threadNumber);");
		printer.printLn("icv.OMP_CurrentParallelRegionBarrier = new CyclicBarrier(this.OMP_threadNumber);");
		printer.printLn("icv.OMP_orderCursor = new AtomicInteger(0);");
		//#BEGIN shared variables initialised here
		printer.printLn("//#BEGIN shared variables initialised here");
		DataClauseHandler.sharedVariablesInitialize(this, printer);
		printer.printLn("//#END shared variables initialised here");
		//#END shared variables initialised here
		printer.unindent();
		printer.printLn("}");
		printer.printLn();
		printer.printLn("private void updateOutputListForSharedVars() {");
		printer.indent();
		//BEGIN put shared variables lastprivate(if any, though no available) to outputlist
		printer.printLn("//BEGIN update outputlist");
		DataClauseHandler.updateOutputlistForSharedVariables(this, printer);
		printer.printLn("//END update outputlist");
		//END put shared variables lastprivate(if any, though no available) to outputlist
		printer.unindent();
		printer.printLn("}");
		printer.printLn("class MyCallable implements Callable<ConcurrentHashMap<String,Object>> {");
		printer.indent();
		printer.printLn("private int alias_id;");
		printer.printLn("private ConcurrentHashMap<String, Object> OMP_inputList;");
		printer.printLn("private ConcurrentHashMap<String, Object> OMP_outputList;");
		
		//#BEGIN firstprivate reduction variables defined for each thread here
		printer.printLn("//#BEGIN firstprivate reduction variables defined here");
		DataClauseHandler.firstprivateReductionVarialbesDefine(this, printer);
		printer.printLn("//#END firstprivate reduction variables  defined here");
		//#END firstprivate reduction variables defined for each thread here
		
		//#BEGIN setBarrier method
		printer.printLn("void setBarrier() {");
		printer.indent();
		printer.printLn("try {OMP_barrier.await();}");
		printer.printLn("catch (InterruptedException e) {e.printStackTrace();}");
		printer.printLn("catch (BrokenBarrierException e) {e.printStackTrace();}");
		printer.unindent();
		printer.printLn("}");
		//#END setBarrier method
		
		printer.printLn("MyCallable(int id, ConcurrentHashMap<String,Object> inputlist, ConcurrentHashMap<String,Object> outputlist){");
		printer.indent();
		printer.printLn("this.alias_id = id;");
		printer.printLn("this.OMP_inputList = inputlist;");
		printer.printLn("this.OMP_outputList = outputlist;");
		
		//#BEGIN firstprivate reduction variables initialised for each thread here
		printer.printLn("//#BEGIN firstprivate reduction variables initialised here");
		DataClauseHandler.firstprivateReductionVarialbesInitialize(this, printer);
		printer.printLn("//#END firstprivate reduction variables initialised here");
		//#END firstprivate reduction variables initialised for each thread here
		
		printer.unindent();
		printer.printLn("}");
		printer.printLn();
		printer.printLn("@Override");
		printer.printLn("public ConcurrentHashMap<String,Object> call() {");
		printer.indent();
		printer.printLn("InternalControlVariables currentThreadICV = new InternalControlVariables(icv);");
		printer.printLn("currentThreadICV.currentThreadAliasID = this.alias_id;");
		printer.printLn("PjRuntime.setCurrentThreadICV(currentThreadICV);");
		printer.printLn();
		printer.printLn("");
		//BEGIN get construct user code
		printer.printLn("/****User Code BEGIN***/");
		this.parallelConstruct.getStatements().get(0).accept(visitor, printer);
		printer.printLn();
		printer.printLn("/****User Code END***/");
		//BEGIN reduction procedure
		printer.printLn("//BEGIN reduction procedure");
		DataClauseHandler.reductionProcedure(this, printer);
		printer.printLn("//END reduction procedure");
		//END reduction procedure
		printer.printLn("setBarrier();");
		//BEGIN Master thread updateOutputList
		printer.printLn("if (0 == this.alias_id) {");
    	printer.indent();
    	printer.printLn("updateOutputListForSharedVars();");
    	if (this.parallelConstruct.isNoGui()) {
    		/*
    		 * if current parallel region is freeguithread region, master
    		 * thread also should do invoke remaining code in current method.
    		 */
    		printer.printLn(this.getDummyGuiCode());
    	}
    	printer.unindent();
    	printer.printLn("}");
		//END Master thread updateOutputList
		//END get construct user code
		printer.printLn("return null;");
		printer.unindent();
		printer.printLn("}");
		printer.unindent();
		printer.printLn("}");
		printer.printLn("public void runParallelCode() {");
		printer.indent();
		/*
		 * If current directive is //#omp freeguithread, free edt thread and make another more thread
		 * to substitute edt thread.
		 */
		if (this.parallelConstruct.isNoGui()) {
			if (null != this.parallelConstruct.getNumThreadsExpression()) {
				printer.printLn("Callable<ConcurrentHashMap<String,Object>> slaveThread = new MyCallable(0, OMP_inputList, OMP_outputList);");
				printer.printLn("PjRuntime.submit(slaveThread);");
			}
			else {
				printer.printLn("for (int i = 0; i <= this.OMP_threadNumber-1; i++) {");
				printer.indent();
				printer.printLn("Callable<ConcurrentHashMap<String,Object>> slaveThread = new MyCallable(i, OMP_inputList, OMP_outputList);");
				printer.printLn("PjRuntime.submit(slaveThread);");
				printer.unindent();
				printer.printLn("}");
			}
		}
		/*
		 * else the current directive is //#omp parallel, master thread is current thread, doesn't escape
		 * from parallel region.
		 */
		else {
			printer.printLn("for (int i = 1; i <= this.OMP_threadNumber-1; i++) {");
			printer.indent();
			printer.printLn("Callable<ConcurrentHashMap<String,Object>> slaveThread = new MyCallable(i, OMP_inputList, OMP_outputList);");
			printer.printLn("PjRuntime.submit(slaveThread);");
			printer.unindent();
			printer.printLn("}");
			printer.printLn("Callable<ConcurrentHashMap<String,Object>> masterThread = new MyCallable(0, OMP_inputList, OMP_outputList);");
			printer.printLn("try {");
			printer.indent();
			printer.printLn("masterThread.call();");
			printer.unindent();
			printer.printLn("} catch (Exception e) {");
			printer.indent();
			printer.printLn("e.printStackTrace();");
			printer.unindent();
			printer.printLn("}");
		}
		printer.unindent();
		printer.printLn("}");
		printer.unindent();
		printer.printLn("}");
		
	}
	
	private String getDummyGuiCode() {
		GuiCodeClassBuilder currentGuiCode = DataClauseHandler.generateDummyGuiRegionForNoguiRemainingCode(this);
		String returnCode = currentGuiCode.getSource();
		return returnCode;
	}
	
}
