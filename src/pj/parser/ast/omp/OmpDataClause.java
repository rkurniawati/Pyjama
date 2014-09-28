package pj.parser.ast.omp;

import java.util.Set;

import pj.parser.ast.Node;
import pj.parser.ast.expr.Expression;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public abstract class OmpDataClause extends Node{
	
	public static enum Type { Shared, Private, Lastprivate, Reduction, Copyprivate, Default };
	
	protected OmpDataClause.Type type;
	
	public OmpDataClause(){}
	
	public OmpDataClause(int beginLine, int beginColumn, int endLine, int endColumn) {
		super(beginLine, beginColumn, endLine, endColumn);
	}
	
	public OmpDataClause.Type DataClauseType() {
		return this.type;
	}
	
	public void setDataClauseType(OmpDataClause.Type type) {
		this.type = type;
	}
	
	public abstract Set<Expression> getArgumentSet();
	
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
