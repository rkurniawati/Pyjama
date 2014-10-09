package pj.parser.ast.symbolscope;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Stack;

import pj.parser.ast.Node;

public class SymbolTable {
	
	private ScopeInfo rootScope = null;
	
	private Stack<ScopeInfo> history = null;
	
	private HashMap<Node, ScopeInfo> allScopes = null;
	
	public SymbolTable() {
		this.allScopes = new HashMap<Node, ScopeInfo>();
		this.history = new Stack<ScopeInfo>();
		this.rootScope = new ScopeInfo(null, "RootScope", ScopeInfo.Type.RootScope);
		this.history.push(this.rootScope);
	}
	
	public ScopeInfo enterNewScope(Node n, String name, ScopeInfo.Type type) {
		ScopeInfo newScope = new ScopeInfo(n, this.history.peek(),name, type);
		newScope.setParent(this.history.peek());
		this.getCurrentScope().setAsChild(newScope);
		this.history.push(newScope);
		this.allScopes.put(n, newScope);
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
	
	public ScopeInfo getScopeOfNode(Node node) {
		ScopeInfo scope = this.allScopes.get(node);
		if (scope == null) {
			throw new SymbolException("Cannot find scope related to this node");
		} else {
			return scope;
		}
	}
	
	/*
	 * This method is for debug, print all info to file
	 */
	public void printOut() {
		PrintWriter out = null;
		try {
			out = new PrintWriter("ScopeTable.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Node node : this.allScopes.keySet()) {
			ScopeInfo scope = this.allScopes.get(node);
			out.println("********Scope Name:" + scope.getName()+"*************");
			out.println("--------Defined variables--------------");
			for (String s: scope.getAllDefinedSymbolNames()) {
				out.println(s);
			}
			out.println("---------Used variables--------------");
			for (String s: scope.getAllUsedSymbolNames()) {
				out.println(s);
			}
		}
		out.close();
	}

}
