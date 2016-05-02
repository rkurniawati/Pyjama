package pj.parser.ast.visitor;

import pj.parser.ast.expr.MethodCallExpr;
import pj.parser.ast.stmt.BlockStmt;
import pj.parser.ast.stmt.ExpressionStmt;
/*
 * This visitor is used by Pyjama await block visiting. 
 * This visitor is responsible for finding out all marked async function in different statements within //#omp await block.
 * 
 */
public class AsyncFunctionCallSubstitutionVisitor extends VoidVisitorAdapter<Object>{
	
	//Main actor
	@Override
	public void visit(MethodCallExpr n, Object arg) {
		
	}
	
	//Statement wrapper
	@Override
	public void visit(ExpressionStmt n, Object arg) {
		
	}
	//block statement
	@Override
	public void visit(BlockStmt n, Object arg) {
		
	}
	
	//-----------------------------expressions
	
}
