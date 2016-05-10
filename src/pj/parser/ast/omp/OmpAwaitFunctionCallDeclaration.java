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

package pj.parser.ast.omp;

import java.util.List;

import pj.parser.ast.Node;
import pj.parser.ast.body.Parameter;
import pj.parser.ast.type.Type;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpAwaitFunctionCallDeclaration extends Node{
	
	private Type type;
	private String name;
	private List<Parameter> parameters;
	
	public OmpAwaitFunctionCallDeclaration(Type type, String name, List<Parameter> parameters) {
		this.type = type;
		this.name = name;
		this.parameters = parameters;
	}
	
	public OmpAwaitFunctionCallDeclaration(int beginLine, int beginColumn, int endLine, int endColumn, Type type, String name, List<Parameter> parameters) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.type = type;
		this.name = name;
		this.parameters = parameters;
	}
	
	public Type getType() {
		return type;
	}
	
	public String getName() {
	    return name;
	}

	public List<Parameter> getParameters() {
	    return parameters;
	}	

	@Override
	public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	@Override
	public <A> void accept(VoidVisitor<A> v, A arg) {
		v.visit(this, arg);	
	}

}
