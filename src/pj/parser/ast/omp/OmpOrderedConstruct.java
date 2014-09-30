package pj.parser.ast.omp;

import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpOrderedConstruct extends OpenMPStatement{
	
	private Statement statement;

	public OmpOrderedConstruct(Statement statement) {
		this.statement = statement;
	}
	
	public OmpOrderedConstruct(int beginLine, int beginColumn, int endLine, int endColumn, Statement statement) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.statement = statement;
	}
	
	public Statement getStatement() {
		return this.statement;
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
