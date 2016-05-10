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

package pj.parser.ast.visitor;

import java.util.HashMap;
import pj.parser.ast.expr.NameExpr;


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
