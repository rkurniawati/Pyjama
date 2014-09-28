package pj.parser.ast.omp;

import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpGuiConstruct extends OpenMPStatement{

	private Statement statement;
	private boolean nowait =false;

	public OmpGuiConstruct(Statement statement) {
		this.statement = statement;
	}
	
	public OmpGuiConstruct(int beginLine, int beginColumn, int endLine, int endColumn, Statement statement, boolean nowait) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.statement = statement;
		this.nowait = nowait;
	}
	
	public Statement getStatement() {
		return this.statement;
	}
	
	public boolean isNowait() {
		return this.nowait;
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
