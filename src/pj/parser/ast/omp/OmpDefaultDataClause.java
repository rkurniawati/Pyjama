package pj.parser.ast.omp;

import java.util.Set;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpDefaultDataClause extends OmpDataClause{

	public static enum Policy { Shared,None };
	private OmpDefaultDataClause.Policy policy;
	
	public OmpDefaultDataClause() {
		this.type = OmpDataClause.Type.Default;
		this.policy = OmpDefaultDataClause.Policy.None; 
	}
		
	public OmpDefaultDataClause(int beginLine, int beginColumn, int endLine, int endColumn) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.type = OmpDataClause.Type.Default;
		this.policy = OmpDefaultDataClause.Policy.None;
	}
	
	public void setPolicy(OmpDefaultDataClause.Policy policy) {
		this.type = OmpDataClause.Type.Default;
		this.policy = OmpDefaultDataClause.Policy.None;
	}
	
	public OmpDefaultDataClause.Policy getPolicy() {
		return this.policy;
	}
	
	@Override
	public Set<Expression> getArgumentSet() {
		return null;
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
