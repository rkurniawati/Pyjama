package pj.parser.ast.symbolscope;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class ScopeInfo {
	
	public static enum Type { RootScope, ClassScope, MethodScope, BlockScope, StatementScope, OpenMPConstructScope }
	
	private static int nextID = 0;
	
	private ScopeInfo parentScope = null;
	private String scopeName = null;
	private Type type;
	private int id;

	private Set<ScopeInfo> childernScopes = new HashSet<ScopeInfo>();
	private HashMap<String, Symbol> symbolsDeclared = new HashMap<String, Symbol>();
	private HashMap<String, Symbol> symbolsUsed = new HashMap<String, Symbol>();
	
	public ScopeInfo(String scopeName, Type type) {
		this.parentScope = null;
		this.scopeName = scopeName;
		this.type = type;
		id = nextID++;
	}
	
	public ScopeInfo(ScopeInfo parentScope, String scopeName, Type type) {
		this.parentScope = parentScope;
		this.scopeName = scopeName;
		this.type = type;
		id = nextID++;
	}
	
	int getID() {
		return id;
	}
	
	public Type getType() {
		return type;
	}
	
	public String getName() {
		return this.scopeName;
	}
	
	public ScopeInfo getParent() {
		return this.parentScope;
	}
	
	public void setParent(ScopeInfo parent) {
		this.parentScope = parent;
	}

	void setAsChild(ScopeInfo child) {
		this.childernScopes.add(child);
	}
	
	public void addSymbolUse(String symbolName, Symbol symbol) {
		if (this.symbolsUsed.containsKey(symbolName)) {
			return;
		}
		this.symbolsUsed.put(symbolName, symbol);
	}
	
	public void addSymbolDeclaration(String symbolName, Symbol symbol) {
		if (this.symbolsDeclared.containsKey(symbolName)) {
			return;
		}
		this.symbolsDeclared.put(symbolName, symbol);
	}
	
	public Set<String> getAllDefinedVariables() {
		return null;
	}
	
	public boolean isDefinedInThisScope(String varName) {
		return false;
	}
	
	//-- determines if the variable is defined in the same method scope (e.g. if this is a block scope, then might be defined in a higher block scope within the same method)
	public boolean isDefinedWithinCurrentMethodScope(String varName) {
		return false;
	}
	

}
