package pj.parser.ast.visitor;

import pj.parser.ast.symbolscope.SymbolTable;

public class AsyncMethodStateMachineBuildingVisitor extends PyjamaToJavaVisitor{

	public AsyncMethodStateMachineBuildingVisitor(SymbolTable symbolTable) {
		super(symbolTable);
	}

}
