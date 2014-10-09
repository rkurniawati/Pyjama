package pj.parser.ast.symbolscope;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import pj.parser.ast.Node;

public class ScopeInfo {
	
	public static enum Type { RootScope, ClassScope, MethodScope, BlockScope, StatementScope, OpenMPConstructScope }
	
	private static int nextID = 0;
	
	private Node node;
	private ScopeInfo parentScope = null;
	private String scopeName = null;
	private Type type;
	private int id;

	private Set<ScopeInfo> childernScopes = new HashSet<ScopeInfo>();
	private HashMap<String, Symbol> symbolsDeclared = new HashMap<String, Symbol>();
	private HashMap<String, Symbol> symbolsUsed = new HashMap<String, Symbol>();
	
	public ScopeInfo(Node n, String scopeName, Type type) {
		this.node = n;
		this.parentScope = null;
		this.scopeName = scopeName;
		this.type = type;
		id = nextID++;
	}
	
	public ScopeInfo(Node n, ScopeInfo parentScope, String scopeName, Type type) {
		this.node = n;
		this.parentScope = parentScope;
		this.scopeName = scopeName;
		this.type = type;
		id = nextID++;
	}
	
	public Node getNode() {
		return this.node;
	}
	
	public int getID() {
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
	
	public Set<String> getAllDefinedSymbolNames() {
		return this.symbolsDeclared.keySet();
	}
	
	public Collection<Symbol> getAllDefinedSymbols() {
		return this.symbolsDeclared.values();
	}
	
	
	public Set<String> getAllUsedSymbolNames() {
		return this.symbolsUsed.keySet();
	}
	
	public Collection<Symbol> getAllUsedSymbols() {
		return this.symbolsUsed.values();
	}
	
	public LinkedList<Symbol> getAllReachableSymbols() {
		LinkedList<Symbol> ret = new LinkedList<Symbol>();
		ret.addAll(this.getAllDefinedSymbols());
		ScopeInfo parentScope = this.getParent();
		while (parentScope != null) {
			ret.addAll(parentScope.getAllDefinedSymbols());
			parentScope = parentScope.getParent();
		}
		return ret;
	}
	
	public LinkedList<Symbol> getAllCurrentMethodDefinedVariables(Set<String> vars) {
		LinkedList<Symbol> ret = new LinkedList<Symbol>();
		ScopeInfo parentScope = this;
		while (parentScope != null) {
			ret.addAll(parentScope.getAllDefinedSymbols());
			if (ScopeInfo.Type.MethodScope == parentScope.getType()) {
				return ret;
			}
			parentScope = parentScope.getParent();
		}
		return null;
	}
	
	public boolean isDefinedInThisScope(String varName) {
		if (this.symbolsDeclared.containsKey(varName)) {
			return true;
		}
		return false;
	}
	
	//-- determines if the variable is defined in the same method scope (e.g. if this is a block scope, then might be defined in a higher block scope within the same method)
	public boolean isDefinedWithinCurrentMethodScope(String varName) {
		return false;
	}
	

}
