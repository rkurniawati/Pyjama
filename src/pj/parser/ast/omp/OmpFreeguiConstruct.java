package pj.parser.ast.omp;

import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpFreeguiConstruct extends OpenMPStatement{

	private Statement body = null;
	private OpenMPStatement ompStatement= null;
	
	public OmpFreeguiConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			Statement statement) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.body = statement;
	}
	
	public OmpFreeguiConstruct(Statement statement) {
		this.body = statement;
	}
	
	public OmpFreeguiConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			OpenMPStatement ompStatement) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.ompStatement = ompStatement;

	}
	
	public OmpFreeguiConstruct(OpenMPStatement ompStatement) {
		this.ompStatement = ompStatement;

	}
	
	public Statement getBody() {
		return body;
	}
	
	public OpenMPStatement getOpenMPStatement() {
		return this.ompStatement;
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
