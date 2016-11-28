package pj.parser.ast.omp;

import java.util.HashSet;
import java.util.Set;

import pj.parser.ast.Node;
import pj.parser.ast.expr.Expression;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpNeglectExceptionClause extends Node{

	private Set<Expression> exceptionSet;
	
	public OmpNeglectExceptionClause() {
		this.exceptionSet = new HashSet<Expression>();
	}
	
	public OmpNeglectExceptionClause(Set<Expression> nameSet) {
		this.exceptionSet = nameSet;
	}
	
	public OmpNeglectExceptionClause(int beginLine, int beginColumn, int endLine, int endColumn, Set<Expression> variableList) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.exceptionSet = variableList;
	}
	
	public Set<Expression> getExceptionSet() {
		return this.exceptionSet;
	}
	
	public void addException(Expression ecp) {
		this.exceptionSet.add(ecp);
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
