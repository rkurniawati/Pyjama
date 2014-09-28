package pj.parser.ast.omp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpReductionDataClause extends OmpDataClause{

	Map<Expression, Expression> argumentMap;
	
	public OmpReductionDataClause() {
		this.type = OmpDataClause.Type.Reduction;
		this.argumentMap = new HashMap<Expression, Expression>();
	}
	
	public OmpReductionDataClause(HashMap<Expression, Expression> variableSet) {
		this.type = OmpDataClause.Type.Reduction;
		this.argumentMap = variableSet;
	}
	
	public OmpReductionDataClause(int beginLine, int beginColumn, int endLine, int endColumn, HashMap<Expression, Expression> variableList) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.type = OmpDataClause.Type.Reduction;
		this.argumentMap = variableList;
	}
	
	public Map<Expression, Expression> getArgumentMap() {
		return this.argumentMap;
	}
	
	public void addArgument(Expression operator, Expression argument) {
		this.argumentMap.put(argument, operator);
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
		v.visit(this, arg);	
	}



}
