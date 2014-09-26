package pj.parser.ast.omp;

import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public abstract class OpenMPStatement extends Statement{
	
	public OpenMPStatement() {
	}
	
	public OpenMPStatement(int beginLine, int beginColumn, int endLine, int endColumn) {
		super(beginLine, beginColumn, endLine, endColumn);
	}
}
