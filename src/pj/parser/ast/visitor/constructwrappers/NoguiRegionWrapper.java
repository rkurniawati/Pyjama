package pj.parser.ast.visitor.constructwrappers;

import java.util.HashMap;
import java.util.List;

import pj.parser.ast.expr.OpenMP_DataClause;
import pj.parser.ast.stmt.OpenMP_Nogui_Construct;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.type.Type;
import pj.symbol.Scope;

/**
 * The representation of the GUI-aware 
 * <code>freeguithread</code> construct 
 * 
 * @author vikassingh
 * @version 1.0.1
 */
public class NoguiRegionWrapper extends ConstructWrapper  {

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
	 * actual freeguithread node from the AST
	 */
	private OpenMP_Nogui_Construct noguiConstruct;
	
	/*
	 * we keep the task id name in this field
	 */
	public String taskIDName = null;
	
	/*
	 * we keep the name of the notify method for a 
	 * particular freeguithread construct
	 */
	public String notifyMethodName = null;
	
	public boolean isStatic = false;

	public NoguiRegionWrapper(OpenMP_Nogui_Construct noguiConstruct) {
		this.noguiConstruct = noguiConstruct;
	}
	public Statement getUserCode() {
		return noguiConstruct.getStatements().get(0);
	}
	@Override
	public Scope getVarScope() {
		return noguiConstruct.getVarScope();
	}
	@Override
	public List<OpenMP_DataClause> getDataClauses() {
		System.err.println("Error:freeguithread:cannot specify data clauses");
		return null;
	}
	@Override
	public int getBeginLine() {
		return noguiConstruct.getBeginLine();
	}
	@Override
	public int getEndLine() {
		return noguiConstruct.getEndLine();
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
