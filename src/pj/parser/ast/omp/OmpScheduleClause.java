package pj.parser.ast.omp;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.Node;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpScheduleClause extends Node{
	public static enum Type { Static, Dynamic, Guided, Runtime, Ordered, Auto };
	
	private OmpScheduleClause.Type type;
	private Expression chunkSize;
	
	public OmpScheduleClause(OmpScheduleClause.Type type, Expression chunk) {
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
		v.visit(this, arg);	
	}
}
