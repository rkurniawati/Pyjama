package japa.parser.ast.omp;

import japa.parser.ast.stmt.Statement;
import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

public class OmpSectionConstruct extends OpenMPStatement{

	private Statement statement;

	public OmpSectionConstruct(Statement statement) {
		this.statement = statement;
	}
	
	public OmpSectionConstruct(int beginLine, int beginColumn, int endLine, int endColumn, Statement statement) {
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
