/*
 * Copyright (C) 2013-2016 Parallel and Reconfigurable Computing Group, University of Auckland.
 *
 * Authors: <http://homepages.engineering.auckland.ac.nz/~parallel/ParallelIT/People.html>
 * 
 * This file is part of Pyjama, a Java implementation of OpenMP-like directive-based 
 * parallelisation compiler and its runtime routines.
 *
 * Pyjama is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Pyjama is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Pyjama. If not, see <http://www.gnu.org/licenses/>.
 */

package pj.parser.ast.symbolscope;

import pj.parser.ast.type.Type;

public class Symbol {
	
	public static enum SymbolType {Constructor, ClassMemberField, ClassMemberMethod, MethodParameter, ScopeLocalParameter};

	private static int nextID = 0;
	
	//the unique id of this symbol
	private int id;
	
	//the scope this symbol appears
	private ScopeInfo scope = null;
	
	//the scope which declared this symbol
	private ScopeInfo declarationScope = null;
	
	//the literal name of this symbol
	private String name = null;
	
	//the data type of this symbol, e.g. int, double, Object, List...
	/* The data type of this symbol, in the form of Type class, not only a String. e.g. int, double, Object, ArrayList<E>...
	 * this is mainly for the argument type of collections like HashMap<String, Integer>, ArrayList<Boolean>
	 */
	private Type dataType = null;
	
	//what the symbol is indicating for, a variable or a method name, etc.
	private SymbolType symbolType  = null;
	
	//indicate whether this is only be 
	private boolean readonly; 
	
	
	public Symbol(String name, ScopeInfo scope, Type dataType, SymbolType symbolType) {
		this.id = nextID++;
		this.name = name;
		this.scope = scope;
		this.dataType = dataType;
		this.symbolType = symbolType;
	}
	
	public Symbol(String name) {
		this.id = nextID++;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Type getSymbolDataType() {
		return this.dataType;
	}
	
	public SymbolType getSymbolType() {
		return this.symbolType;
	}
	
	public boolean isVariableNameAs(String name) {
		if (this.symbolType == SymbolType.ClassMemberMethod) {
		 return false;
		}
		if (this.name.equals(name)) {
			return true;
		} else {
			return false;	 
		}
	}
}
