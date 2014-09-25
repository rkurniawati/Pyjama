package japa.parser.ast.omp;

import japa.parser.ast.expr.Expression;
import japa.parser.ast.Node;
import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

public class OmpScheduleClause extends Node{
	public static enum Type { Static, Dynamic, Guided, Runtime, Ordered };
	
	private Type type;
	private Expression chunkSize;
	
	public OmpScheduleClause(Type type, Expression chunk) {
		this.type = type;
		this.chunkSize = chunk;
	}
	
	public OmpScheduleClause(int beginLine, int beginColumn, int endLine, int endColumn, Type type, Expression chunk) {
		super(beginLine, beginColumn, endLine, endColumn);

	}
	
	public Type getScheduleType() {
		return type;
	}
	
	public Expression getChunkSize() {
		return chunkSize;
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
