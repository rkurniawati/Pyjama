package pj.parser.ast.omp;

import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpAwaitDirective extends OpenMPStatement{
	
	private String taskName;
	
	public OmpAwaitDirective(String tag) {
		this.taskName = tag;
	}
	
	public OmpAwaitDirective(int beginLine, int beginColumn, int endLine, int endColumn, String tag) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.taskName = tag;
	}
	
	public String getTaskName() {
		return this.taskName;
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
