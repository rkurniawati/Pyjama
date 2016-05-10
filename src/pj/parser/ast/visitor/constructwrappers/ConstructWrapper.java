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

package pj.parser.ast.visitor.constructwrappers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Encapsulates the runtime generic wrapper for OpenMP 2.5 - like 
 * constructs and GUI-aware constructs in Pyjama
 * 
 * @author vikassingh
 * @author Xing Fan
 * 
 * @version 1.1.1
 */
public abstract class ConstructWrapper {
		
	/*
	 * @return line number where construct begins
	 */
	abstract public int getBeginLine();
	
	/*
	 * @return line number where construct ends
	 */
	abstract public int getEndLine();
	
	
	/*
	 * Keeps the variables that have been re-named
	 */
	public List<String> varsAutoSaved = new ArrayList<String>();

	/*
	 * Keeps the <code>threadprivate</code> elements
	 */
	public List<String> varsThreadPrivate = new ArrayList<String>();

	/*
	 * container for keeping the declared variables in the smallest scope 
	 */
	private List<String>  nestedDeclaredVars = new ArrayList<String>();

	/*
	 * container for all the variables that are present outside the current scope 
	 */
	private Set<String> outerVars = new HashSet<String>();

	/*
	 * container for all the variables that are used in current scope
	 */
	private List<String>  neededVar = new ArrayList<String>();

	
	public List<String> getNestedDeclaredVars() {
		return nestedDeclaredVars;
	}

	public void setNestedDeclaredVars(List<String> nestedDeclaredVars) {
		this.nestedDeclaredVars = nestedDeclaredVars;
	}

	public Set<String> getOuterVars() {
		return this.outerVars;
	}

	public void setOuterVars(Set<String> outerVars) {
		this.outerVars = outerVars;
	}

	public List<String> getNeededVar() {
		return this.neededVar;
	}

	public void setNeededVar(List<String> neededVar) {
		this.neededVar = neededVar;
	}

}
