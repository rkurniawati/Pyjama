package pj.parser.ast.symbolscope;

import java.util.HashMap;
import java.util.Stack;

public class SymbolTable {
	
	private ScopeInfo rootScope = null;
	
	private Stack<ScopeInfo> history = null;
	
	private HashMap<String, ScopeInfo> allScopes = new HashMap<String, ScopeInfo>();
	
	public SymbolTable() {
		this.history = new Stack<ScopeInfo>();
		this.rootScope = new ScopeInfo(null, "RootScope", ScopeInfo.Type.RootScope);
	}
	
	public ScopeInfo enterNewScope(String name, ScopeInfo.Type type) {
		ScopeInfo newScope = new ScopeInfo(this.history.peek(),name, type);
		newScope.setParent(this.history.peek());
		this.history.push(newScope);
		return newScope;
	}
		
	public ScopeInfo exitScope() {
		return this.history.pop();
	}
		
	public ScopeInfo getCurrentScope() {
		return this.history.peek();
	}
	
	public void addSymbolUse(String symbolName, Symbol symbol) {
		//currently just save the key and ignore the value
		this.history.peek().addSymbolUse(symbolName, null);
	}
	
	public void addSymbolDeclaration(String symbolName, Symbol symbol) {
		this.history.peek().addSymbolDeclaration(symbolName, symbol);
	}

}
