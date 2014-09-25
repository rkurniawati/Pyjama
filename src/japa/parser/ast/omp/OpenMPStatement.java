package japa.parser.ast.omp;

import japa.parser.ast.stmt.Statement;
import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

public abstract class OpenMPStatement extends Statement{
	
	public OpenMPStatement() {
	}
	
	public OpenMPStatement(int beginLine, int beginColumn, int endLine, int endColumn) {
		super(beginLine, beginColumn, endLine, endColumn);
	}
}
