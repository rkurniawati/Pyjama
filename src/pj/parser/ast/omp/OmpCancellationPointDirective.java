package pj.parser.ast.omp;

import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpCancellationPointDirective extends OpenMPStatement{
	
	public static enum Region  {Parallel, For, Sections, Taskgroup};
	
	private Region region;
	
	public OmpCancellationPointDirective(Region region) {
		this.region = region;
	}
	
	public OmpCancellationPointDirective(int beginLine, int beginColumn, int endLine, int endColumn, Region region) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.region = region;
	}
	
	public Region getRegion() {
		return this.region;
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
