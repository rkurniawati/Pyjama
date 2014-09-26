package japa.parser.ast.omp;

import japa.parser.ast.stmt.Statement;
import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

public class OmpBarrierDirective extends OpenMPStatement{
	
	public OmpBarrierDirective() {
	}
	
	public OmpBarrierDirective(int beginLine, int beginColumn, int endLine, int endColumn) {
		super(beginLine, beginColumn, endLine, endColumn);
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
