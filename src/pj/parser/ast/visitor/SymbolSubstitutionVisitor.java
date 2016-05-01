package pj.parser.ast.visitor;

import java.util.HashMap;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.omp.OmpAwaitFunctionCallDeclaration;

public class SymbolSubstitutionVisitor extends VoidVisitorAdapter<Object>{
	
	private HashMap<String, String> symbolSubstitutionDictionary;
	
	public SymbolSubstitutionVisitor(HashMap<String, String> dictionary) {
		this.symbolSubstitutionDictionary = dictionary;
	}
	
	@Override
	public void visit(NameExpr n, Object arg) {
		String symbolName = n.getName();
		if (this.symbolSubstitutionDictionary.containsKey(symbolName)) {
			n.setName(this.symbolSubstitutionDictionary.get(symbolName));
		}
	}

}
