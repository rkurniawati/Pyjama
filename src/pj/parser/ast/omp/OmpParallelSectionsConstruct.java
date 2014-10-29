package pj.parser.ast.omp;

import java.util.ArrayList;
import java.util.List;

import pj.parser.ast.expr.Expression;
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
		/*
		 * all arguments appear in //#omp parallel sections directive clauses should be
		 * normalised as //#omp parallel shared(n1,n2,n3...)
		 * 				//#omp sections private(n1) reduction(+:n2) 
		 */
		OmpSharedDataClause sharedClauseParallel = new OmpSharedDataClause();
		parallelDataClauseList.add(sharedClauseParallel);
		
		for (OmpDataClause clause: this.dataClauseList) {	
			switch (clause.type) {
			case Shared:
				//shared data clause needn't to be added to //#omp sections
				parallelDataClauseList.add(clause);
				break;
			case Private:
			case Lastprivate:
				for (Expression arg:clause.getArgumentSet()) {
					sharedClauseParallel.addArgument(arg);
				}
				sectionDataClauseList.add(clause);
				break;
			case Reduction:
				for (Expression arg: ((OmpReductionDataClause)clause).getArgumentMap().keySet()) {
					sharedClauseParallel.addArgument(arg);
				}
				sectionDataClauseList.add(clause);
				break;
			default:
				break;
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
