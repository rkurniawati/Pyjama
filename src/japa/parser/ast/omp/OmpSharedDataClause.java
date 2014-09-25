package japa.parser.ast.omp;

import japa.parser.ast.expr.Expression;
import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

import java.util.HashSet;
import java.util.Set;

public class OmpSharedDataClause extends OmpDataClause{
	
	private final OmpDataClause.Type type = OmpDataClause.Type.Shared;
	Set<Expression> argumentSet;
	
	public OmpSharedDataClause() {
		this.argumentSet = new HashSet<Expression>();
	}
	
	public OmpSharedDataClause(Set<Expression> variableSet) {
		this.argumentSet = variableSet;
	}
	
	public OmpSharedDataClause(int beginLine, int beginColumn, int endLine, int endColumn, Set<Expression> variableList) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.argumentSet = variableList;
	}
	
	public Set<Expression> getArgumentSet() {
		return this.argumentSet;
	}
	
	public void addArgument(Expression argument) {
		this.argumentSet.add(argument);
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
