package japa.parser.ast.omp;

import java.util.HashSet;
import java.util.Set;

import japa.parser.ast.expr.Expression;
import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

public class OmpCopyprivateDataClause extends OmpDataClause{

	private final OmpDataClause.Type type = OmpDataClause.Type.Copyprivate;
	Set<Expression> argumentSet;
	
	public OmpCopyprivateDataClause() {
		this.argumentSet = new HashSet<Expression>();
	}
	
	public OmpCopyprivateDataClause(Set<Expression> variableSet) {
		this.argumentSet = variableSet;
	}
	
	public OmpCopyprivateDataClause(int beginLine, int beginColumn, int endLine, int endColumn, Set<Expression> variableList) {
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
