package pj.parser.ast.omp;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpCriticalConstruct extends OpenMPStatement{

	private Statement statement;
	private Expression identifier;

	public OmpCriticalConstruct(Statement statement, Expression identifier) {
		this.statement = statement;
		this.identifier = identifier;
	}
	
	public OmpCriticalConstruct(int beginLine, int beginColumn, int endLine, int endColumn, Statement statement, Expression identifier) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.statement = statement;
		this.identifier = identifier;
	}
	
	public Statement getStatement() {
		return this.statement;
	}
	
	public Expression getIdentifier() {
		return this.identifier;
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
