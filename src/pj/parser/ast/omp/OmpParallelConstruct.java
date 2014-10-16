package pj.parser.ast.omp;


import java.util.HashSet;
import java.util.List;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.symbolscope.ScopeInfo;
import pj.parser.ast.symbolscope.Symbol;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpParallelConstruct extends OpenMPStatement {

	private OmpIfClause ifExpr = null;
	private OmpNumthreadsClause numThreads = null;
	private Statement body = null;
	private List<OmpDataClause> dataClauseList;
	
	//this symbol is true when default(shared) data clause happens. Default is none.
	private boolean defaultShared = false;
		
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
	
	/*
	 * This method is responsible to convert default(shared) clause (if any) to
	 * normal shared clauses: shared(v1,v2,...vn), where v1-vn are variables current
	 * parallel region can get acess. 
	 * This method only takes effect when default(shared) clause exists in current 
	 * parallel directive, if not, this method just does nothing. 
	 * 
	 * The reachable variable is based on scope
	 */
	public void processAllReachableVariablesIfNecessary() {
		//search data clause, if default data clause exists, get the policy(none, shared).
		for(OmpDataClause clause: this.dataClauseList) {
			if (clause instanceof OmpDefaultDataClause) {
				OmpDefaultDataClause defaultClause = (OmpDefaultDataClause) clause;
				if (OmpDefaultDataClause.Policy.Shared == defaultClause.getPolicy()) {
					this.defaultShared = true;
				}
				break;
			}
		}
		if (false == this.defaultShared) {
			//needn't do anything
			return;
		}
		HashSet<Expression> variableSet = new HashSet<Expression>();
		for(Symbol symbol: scope.getAllReachableSymbols()) {
			if (Symbol.SymbolType.ScopeLocalParameter == symbol.getSymbolType() || Symbol.SymbolType.MethodParameter == symbol.getSymbolType()) {
				NameExpr varExpr = new NameExpr(symbol.getName());
				variableSet.add(varExpr);
			}
		}
		OmpSharedDataClause sharedDataClause = new OmpSharedDataClause(variableSet);
		this.dataClauseList.add(sharedDataClause);
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
