package pj.parser.ast.omp;

import java.util.List;

import pj.parser.ast.stmt.ForStmt;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpParallelForConstruct extends OpenMPStatement{

	private OmpIfClause ifExpr = null;
	private OmpNumthreadsClause numThreads = null;
	private Statement forStmt = null;
	private List<OmpDataClause> dataClauseList;
	
	public OmpParallelForConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			Statement statement,  
			List<OmpDataClause> dataClausesList, 
			OmpIfClause ifExpr,
			OmpNumthreadsClause numThreads){
		super(beginLine, beginColumn, endLine, endColumn);
		this.forStmt = statement;
		this.dataClauseList = dataClausesList;
		this.ifExpr = ifExpr;
		this.numThreads = numThreads;
	}
	
	public OmpParallelForConstruct(
			Statement statement,  
			List<OmpDataClause> dataClausesList, 
			OmpIfClause ifExpr,
			OmpNumthreadsClause numThreads){
		this.forStmt = statement;
		this.dataClauseList = dataClausesList;
		this.ifExpr = ifExpr;
		this.numThreads = numThreads;
	}
	
	public Statement getForStmt() {
		return this.forStmt;
	}
	public List<OmpDataClause> getDataClauseList() {
		return this.dataClauseList;
	}
	public OmpIfClause getIfClause() {
		return ifExpr;
	}

	public OmpNumthreadsClause getNumThreadsExpression() {
		return numThreads;
	}
	
	@Override
	public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <A> void accept(VoidVisitor<A> v, A arg) {
		// TODO Auto-generated method stub
		
	}

}
