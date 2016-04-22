package pj.parser.ast.omp;

import pj.parser.ast.body.MethodDeclaration;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpAsyncFunction extends OpenMPStatement{
	
	private MethodDeclaration function;

	public OmpAsyncFunction(MethodDeclaration function) {
		this.function = function;
	}
	
	public OmpAsyncFunction(int beginLine, int beginColumn, int endLine, int endColumn, MethodDeclaration function) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.function = function;
	}
	
	public MethodDeclaration getFunction() {
		return this.function;
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
