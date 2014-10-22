package pj.parser.ast.omp;

import java.util.ArrayList;
import java.util.List;

import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpParallelForConstruct extends OpenMPStatement{

	private OmpIfClause ifExpr = null;
	private OmpNumthreadsClause numThreads = null;
	private Statement forStmt = null;
	private List<OmpDataClause> dataClauseList;
	private OmpScheduleClause scheduleClause = null;
	private boolean ordered;
	
	public OmpParallelForConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			Statement statement,  
			List<OmpDataClause> dataClausesList, 
			OmpScheduleClause scheduleClause,
			OmpIfClause ifExpr,
			OmpNumthreadsClause numThreads,
			boolean ordered){
		super(beginLine, beginColumn, endLine, endColumn);
		this.forStmt = statement;
		this.dataClauseList = dataClausesList;
		this.scheduleClause = scheduleClause;
		this.ifExpr = ifExpr;
		this.numThreads = numThreads;
		this.ordered = ordered;
	}
	
	public OmpParallelForConstruct(
			Statement statement,  
			List<OmpDataClause> dataClausesList, 
			OmpScheduleClause scheduleClause,
			OmpIfClause ifExpr,
			OmpNumthreadsClause numThreads,
			boolean ordered){
		this.forStmt = statement;
		this.dataClauseList = dataClausesList;
		this.scheduleClause = scheduleClause;
		this.ifExpr = ifExpr;
		this.numThreads = numThreads;
		this.ordered = ordered;
	}
	
	public Statement getForStmt() {
		return this.forStmt;
	}
	public List<OmpDataClause> getDataClauseList() {
		return this.dataClauseList;
	}
	public OmpScheduleClause getScheduleClause() {
		return this.scheduleClause;
	}
	public OmpIfClause getIfClause() {
		return ifExpr;
	}

	public OmpNumthreadsClause getNumThreadsExpression() {
		return numThreads;
	}
	
	public OmpParallelConstruct normalisation() {
		List<OmpDataClause> forDataClauseList = new ArrayList<OmpDataClause>();
		List<OmpDataClause> parallelDataClauseList = new ArrayList<OmpDataClause>();

		for (OmpDataClause clause: this.dataClauseList) {
			if (clause.DataClauseType() == OmpDataClause.Type.Shared) {
				parallelDataClauseList.add(clause);
			} else if (clause.DataClauseType() == OmpDataClause.Type.Lastprivate) {
				forDataClauseList.add(clause);
			} else {
				parallelDataClauseList.add(clause);
				forDataClauseList.add(clause);
			}
			
		}
		OmpForConstruct forConstruct = new OmpForConstruct(forStmt, forDataClauseList, this.scheduleClause, false, this.ordered);
		OmpParallelConstruct normalised = new OmpParallelConstruct(forConstruct, parallelDataClauseList, this.ifExpr, this.numThreads);
		return normalised;
	}
	
	@Override
	public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	@Override
	public <A> void accept(VoidVisitor<A> v, A arg) {
		v.visit(this, arg);	
	}

}
