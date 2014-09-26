package pj.parser.ast.omp;

import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpCriticalConstruct extends OpenMPStatement{

	private Statement statement;

	public OmpCriticalConstruct(Statement statement) {
		this.statement = statement;
	}
	
	public OmpCriticalConstruct(int beginLine, int beginColumn, int endLine, int endColumn, Statement statement) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.statement = statement;
	}
	
	public Statement getStatement() {
		return this.statement;
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
