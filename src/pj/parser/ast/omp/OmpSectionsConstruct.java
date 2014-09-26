package pj.parser.ast.omp;

import java.util.List;

import pj.parser.ast.stmt.ForStmt;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpSectionsConstruct extends OpenMPStatement{

	private List<OmpSectionConstruct> sectionList;
	private List<OmpDataClause> dataClauseList;
	
	private boolean nowait;

	
	public OmpSectionsConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			List<OmpSectionConstruct> sectionList,  
			List<OmpDataClause> dataClausesList, 
			boolean nowait
			){
		super(beginLine, beginColumn, endLine, endColumn);
		this.sectionList = sectionList;
		this.dataClauseList = dataClausesList;
		this.nowait = nowait;

	}
	
	public OmpSectionsConstruct( 
			List<OmpSectionConstruct> sectionList,  
			List<OmpDataClause> dataClausesList, 
			boolean nowait
			){
		this.sectionList = sectionList;
		this.dataClauseList = dataClausesList;
		this.nowait = nowait;
	}
	
	public List<OmpSectionConstruct> getSectionList() {
		return this.sectionList;
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
