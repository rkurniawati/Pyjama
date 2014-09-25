package japa.parser.ast.omp;

import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

public class OmpDefaultDataClause extends OmpDataClause{

	public static enum Policy { Shared,None };
	private final OmpDataClause.Type type = OmpDataClause.Type.Reduction;
	private OmpDefaultDataClause.Policy policy;
	
	public OmpDefaultDataClause() {
		this.policy = OmpDefaultDataClause.Policy.None; 
	}
		
	public OmpDefaultDataClause(int beginLine, int beginColumn, int endLine, int endColumn) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.policy = OmpDefaultDataClause.Policy.None;
	}
	
	public void setPolicy(OmpDefaultDataClause.Policy policy) {
		this.policy = OmpDefaultDataClause.Policy.None;
	}
	
	public OmpDefaultDataClause.Policy getPolicy() {
		return this.policy;
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
