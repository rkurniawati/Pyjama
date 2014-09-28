package pj.parser.ast.omp;

import pj.parser.ast.Node;
import pj.parser.ast.expr.Expression;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpIfClause extends Node{
	
	private Expression ifExpression;
	
	public OmpIfClause(Expression ifExpr) {
		this.ifExpression = ifExpr;
	}
	
	public OmpIfClause(int beginLine, int beginColumn, int endLine, int endColumn, Expression ifExpr) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.ifExpression = ifExpr;
	}
	
	public Expression getIfExpression() {
		return this.ifExpression;
	}
	
	@Override
	public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <A> void accept(VoidVisitor<A> v, A arg) {
		v.visit(this, arg);	
	}

}
