package pj.parser.ast.omp;

import java.util.ArrayList;
import java.util.List;

import pj.parser.ast.body.VariableDeclarator;
import pj.parser.ast.body.VariableDeclaratorId;
import pj.parser.ast.expr.BinaryExpr;
import pj.parser.ast.expr.Expression;
import pj.parser.ast.expr.IntegerLiteralExpr;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.expr.UnaryExpr;
import pj.parser.ast.expr.VariableDeclarationExpr;
import pj.parser.ast.stmt.BreakStmt;
import pj.parser.ast.stmt.ForStmt;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.stmt.SwitchEntryStmt;
import pj.parser.ast.stmt.SwitchStmt;
import pj.parser.ast.type.PrimitiveType;
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
	
	public OmpParallelConstruct normalisation() {
		List<OmpDataClause> sectionDataClauseList = new ArrayList<OmpDataClause>();
		List<OmpDataClause> parallelDataClauseList = new ArrayList<OmpDataClause>();
		for (OmpDataClause clause: this.dataClauseList) {
			if (clause.DataClauseType() == OmpDataClause.Type.Shared) {
				parallelDataClauseList.add(clause);
			} else if (clause.DataClauseType() == OmpDataClause.Type.Lastprivate) {
				sectionDataClauseList.add(clause);
			} else {
				parallelDataClauseList.add(clause);
				sectionDataClauseList.add(clause);
			}
			
		}

		OmpSectionsConstruct sectionsConstruct = new OmpSectionsConstruct(this.sectionList, sectionDataClauseList, false);
		OmpForConstruct forConstruct = sectionsConstruct.normalisation();
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
