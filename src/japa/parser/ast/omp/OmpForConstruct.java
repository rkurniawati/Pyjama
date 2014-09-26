package japa.parser.ast.omp;

import java.util.List;

import japa.parser.ast.stmt.ForStmt;
import japa.parser.ast.stmt.Statement;
import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

public class OmpForConstruct extends OpenMPStatement{

	private OmpScheduleClause scheduleClause = null;
	private Statement forStmt = null;
	private List<OmpDataClause> dataClauseList;
	
	private boolean nowait;
	private boolean ordered;
	
	public OmpForConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			Statement statement,  
			List<OmpDataClause> dataClausesList, 
			OmpScheduleClause scheduleClause,
			boolean nowait,
			boolean ordered
			){
		super(beginLine, beginColumn, endLine, endColumn);
		this.forStmt = statement;
		this.dataClauseList = dataClausesList;
		this.scheduleClause = scheduleClause;
		this.nowait = nowait;
		this.ordered = ordered;
	}
	
	public OmpForConstruct( 
			Statement statement,  
			List<OmpDataClause> dataClausesList, 
			OmpScheduleClause scheduleClause,
			boolean nowait,
			boolean ordered
			){
		this.forStmt = statement;
		this.dataClauseList = dataClausesList;
		this.scheduleClause = scheduleClause;
		this.nowait = nowait;
		this.ordered = ordered;
	}
	
	public Statement  getForStmt() {
		return forStmt;
	}
	public List<OmpDataClause> getDataClauseList() {
		return this.dataClauseList;
	}
	
	public OmpScheduleClause getScheduleClause() {
		return this.scheduleClause;
	}
	
	public boolean isNowait() {
		return this.nowait;
	}
	
	public boolean isOrdered() {
		return this.ordered;
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
