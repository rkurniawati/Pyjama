package pj.parser.ast.omp;


import java.util.List;

import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpParallelConstruct extends OpenMPStatement {

	private OmpIfClause ifExpr = null;
	private OmpNumthreadsClause numThreads = null;
	private Statement body = null;
	private List<OmpDataClause> dataClauseList;
		
	public OmpParallelConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			Statement statement,  
			List<OmpDataClause> dataClausesList, 
			OmpIfClause ifExpr,
			OmpNumthreadsClause numThreads){
		super(beginLine, beginColumn, endLine, endColumn);
		this.body = statement;
		this.dataClauseList = dataClausesList;
		this.ifExpr = ifExpr;
		this.numThreads = numThreads;
	}
	
	public OmpParallelConstruct(
			Statement statement,  
			List<OmpDataClause> dataClausesList, 
			OmpIfClause ifExpr,
			OmpNumthreadsClause numThreads){
		this.body = statement;
		this.dataClauseList = dataClausesList;
		this.ifExpr = ifExpr;
		this.numThreads = numThreads;
	}
	
	public Statement getBody() {
		return body;
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
		return v.visit(this, arg);
	}

	@Override
	public <A> void accept(VoidVisitor<A> v, A arg) {
		v.visit(this, arg);	
	}

}
