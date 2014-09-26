package pj.parser.ast.omp;

import java.util.List;

import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpParallelSectionsConstruct extends OpenMPStatement{

	private OmpIfClause ifExpr = null;
	private OmpNumthreadsClause numThreads = null;
	private List<OmpSectionConstruct> sectionList;
	private List<OmpDataClause> dataClauseList;
	
	public OmpParallelSectionsConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			List<OmpSectionConstruct> sectionList,  
			List<OmpDataClause> dataClausesList, 
			OmpIfClause ifExpr,
			OmpNumthreadsClause numThreads){
		super(beginLine, beginColumn, endLine, endColumn);
		this.sectionList = sectionList;
		this.dataClauseList = dataClausesList;
		this.ifExpr = ifExpr;
		this.numThreads = numThreads;
	}
	
	public OmpParallelSectionsConstruct(
			List<OmpSectionConstruct> sectionList,  
			List<OmpDataClause> dataClausesList, 
			OmpIfClause ifExpr,
			OmpNumthreadsClause numThreads){
		this.sectionList = sectionList;
		this.dataClauseList = dataClausesList;
		this.ifExpr = ifExpr;
		this.numThreads = numThreads;
	}
	
	public List<OmpSectionConstruct> getSectionList() {
		return sectionList;
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
