package pj.parser.ast.visitor;


import java.util.Hashtable;

import pj.parser.ast.expr.NameExpr;

public class SymbolSubstitutionVisitor extends VoidVisitorAdapter<Object>{
	
	private Hashtable<String, String> symbolSubstitutionDictionary;
	
	SymbolSubstitutionVisitor(Hashtable<String, String> dictionary) {
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
