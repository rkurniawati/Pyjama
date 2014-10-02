package pj.parser.ast.visitor.constructwrappers;

import java.util.HashMap;
import java.util.List;

import pj.parser.ast.expr.OpenMP_DataClause;
import pj.parser.ast.stmt.OpenMP_Parallel_Construct;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.type.Type;
import pj.symbol.Scope;

/**
 * This is the representation for <code>parallel</code>
 * construct.
 * 
 * It should be noted that this is an 
 * elementary directive. In scenarios, where
 * combined directives are used, they are again 
 * normalised into the elementary ones.
 * 
 * @author vikassingh
 * @version 1.0.1
 */
public class ParallelRegionWrapper extends ConstructWrapper  {

	/*
	 * the name of the TASK containing the parallel region.
	 * the current version of Pyjama utilises PT for the 
	 * backend. This field should be deprecated in 
	 * case that dependency is removed.
	 */
	public String taskName = "";
	
	/*
	 * we keep the multi-task size here
	 */
	public String numThreads = "Pyjama.omp_get_num_threads()";

	/*
	 * actual parallel node from the AST
	 */
	private OpenMP_Parallel_Construct parallelConstruct;
	
	/*
	 * we keep the task id name in this field
	 */
	public String taskIDName = null;
		
	public String notifyMethodName = null;
	public boolean isStatic = false;

	public ParallelRegionWrapper(OpenMP_Parallel_Construct parallelConstruct) {
		this.parallelConstruct = parallelConstruct;
	}
	public Statement getUserCode() {
		return parallelConstruct.getStatements().get(0);
	}
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
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String get_outputlist() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public HashMap<String, Type> autoGetAllLocalMethodVariables() {
		// TODO Auto-generated method stub
		return null;
	}
}
