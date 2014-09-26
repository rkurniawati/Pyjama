package pj.parser.ast.omp;

import java.util.List;

import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpSingleConstruct extends OpenMPStatement{

	private Statement statement;
	private List<OmpDataClause> dataClauseList;
	private boolean nowait;

	public OmpSingleConstruct(Statement statement,	List<OmpDataClause> dataClauseList,	boolean nowait) {
		this.statement = statement;
		this.dataClauseList = dataClauseList;
		this.nowait = nowait;
	}
	
	public OmpSingleConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			Statement statement,
			List<OmpDataClause> dataClauseList,
			boolean nowait) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.statement = statement;
		this.dataClauseList = dataClauseList;
		this.nowait = nowait;
	}
	
	public Statement getStatement() {
		return this.statement;
	}
	
	public List<OmpDataClause> getDataClauseList() {
		return this.dataClauseList;
	}
	
	public boolean isNowait() {
		return this.nowait;
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
