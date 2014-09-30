package pj.parser.ast.omp;

import java.util.HashSet;
import java.util.Set;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpCopyprivateDataClause extends OmpDataClause{

	Set<Expression> argumentSet;
	
	public OmpCopyprivateDataClause() {
		this.type = OmpDataClause.Type.Copyprivate;
		this.argumentSet = new HashSet<Expression>();
	}
	
	public OmpCopyprivateDataClause(Set<Expression> variableSet) {
		this.type = OmpDataClause.Type.Copyprivate;
		this.argumentSet = variableSet;
	}
	
	public OmpCopyprivateDataClause(int beginLine, int beginColumn, int endLine, int endColumn, Set<Expression> variableList) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.type = OmpDataClause.Type.Copyprivate;
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
		return v.visit(this, arg);
	}

	@Override
	public <A> void accept(VoidVisitor<A> v, A arg) {
		v.visit(this, arg);	
	}

}
