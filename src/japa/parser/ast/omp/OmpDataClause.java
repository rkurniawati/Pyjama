package japa.parser.ast.omp;

import japa.parser.ast.Node;
import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

public class OmpDataClause extends Node{
	
	public static enum Type { Shared, Private, Lastprivate, Reduction, Copyprivate };
	
	private final OmpDataClause.Type type = OmpDataClause.Type.Reduction;
	
	public OmpDataClause(){}
	
	public OmpDataClause(int beginLine, int beginColumn, int endLine, int endColumn) {
		super(beginLine, beginColumn, endLine, endColumn);
	}
	
	public OmpDataClause.Type DataClauseType() {
		return this.type;
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
