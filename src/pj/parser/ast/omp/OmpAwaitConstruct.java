package pj.parser.ast.omp;

import java.util.List;

import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpAwaitConstruct extends OpenMPStatement{

	private Statement statement;
	
	private List<String> functionList;

	public OmpAwaitConstruct(List<String> functionList, Statement statement) {
		this.functionList = functionList;
		this.statement = statement;
	}
	
	public OmpAwaitConstruct(int beginLine, int beginColumn, int endLine, int endColumn, List<String> functionList, Statement statement) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.functionList = functionList;
		this.statement = statement;
	}
	
	public List<String> getAwaitFunctions() {
		return this.functionList;
	}
	
	public Statement getBody() {
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
