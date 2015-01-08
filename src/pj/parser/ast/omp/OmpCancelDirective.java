package pj.parser.ast.omp;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpCancelDirective extends OpenMPStatement{
	
	public static enum Region  {Parallel, For, Sections, Taskgroup};
	public static enum ThreadAffiliate {Local, Global};
	
	private Region region;
	private ThreadAffiliate threadAffiliate;
	private Expression ifStmt;
	private String tag;
	
	public OmpCancelDirective(Region r, ThreadAffiliate ta, Expression ifS, NameExpr t) {
		this.region = r;
		this.threadAffiliate = ta;
		this.ifStmt = ifS;
		this.tag = t.toString();
	}
	
	public OmpCancelDirective(int beginLine, int beginColumn, int endLine, int endColumn,
			Region r, ThreadAffiliate ta, Expression ifS, NameExpr t) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.region = r;
		this.threadAffiliate = ta;
		this.ifStmt = ifS;
		this.tag = t.toString();
	}
	
	public Region getRegion() {
		return this.region;
	}
	
	public ThreadAffiliate getThreadAffiliate() {
		return this.threadAffiliate;
	}
	
	public Expression getIfStmt() {
		return this.ifStmt;
	}
	
	public String getTag() {
		return tag;
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
