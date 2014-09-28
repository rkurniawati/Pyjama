package pj.parser.ast.omp;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

import java.util.HashSet;
import java.util.Set;

public class OmpLastprivateDataClause extends OmpDataClause{

	private Set<Expression> argumentSet;
	
	public OmpLastprivateDataClause() {
		this.type = OmpDataClause.Type.Lastprivate;
		this.argumentSet = new HashSet<Expression>();
	}
	
	public OmpLastprivateDataClause(Set<Expression> variableSet) {
		this.type = OmpDataClause.Type.Lastprivate;
		this.argumentSet = variableSet;
	}
	
	public OmpLastprivateDataClause(int beginLine, int beginColumn, int endLine, int endColumn, Set<Expression> variableList) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.type = OmpDataClause.Type.Lastprivate;
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
		v.visit(this, arg);	
	}
}
