package japa.parser.ast.omp;

import java.util.HashMap;
import java.util.Map;


import japa.parser.ast.expr.Expression;
import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

public class OmpReductionDataClause extends OmpDataClause{

	private final OmpDataClause.Type type = OmpDataClause.Type.Reduction;
	Map<Expression, Expression> argumentMap;
	
	public OmpReductionDataClause() {
		this.argumentMap = new HashMap<Expression, Expression>();
	}
	
	public OmpReductionDataClause(HashMap<Expression, Expression> variableSet) {
		this.argumentMap = variableSet;
	}
	
	public OmpReductionDataClause(int beginLine, int beginColumn, int endLine, int endColumn, HashMap<Expression, Expression> variableList) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.argumentMap = variableList;
	}
	
	public Map<Expression, Expression> getArgumentMap() {
		return this.argumentMap;
	}
	
	public void addArgument(Expression operator, Expression argument) {
		this.argumentMap.put(argument, operator);
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
