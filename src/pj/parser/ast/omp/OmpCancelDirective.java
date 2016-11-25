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

import pj.parser.ast.expr.Expression;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpCancelDirective extends OpenMPStatement{
	
	public static enum Region  {Parallel, For, Sections, Taskgroup};
	public static enum ThreadAffiliate {Local, Global};
	
	private Region region;
	private ThreadAffiliate threadAffiliate;
	private Expression ifStmt;
	private String tag;
	private String exceptionToThrow;
	
	public OmpCancelDirective(Region r, ThreadAffiliate ta, Expression ifS, NameExpr t, NameExpr e) {
		this.region = r;
		this.threadAffiliate = ta;
		this.ifStmt = ifS;
		this.tag = (t==null)?null:t.toString();
		this.exceptionToThrow = (e==null)?null:e.toString();
	}
	
	public OmpCancelDirective(int beginLine, int beginColumn, int endLine, int endColumn,
			Region r, ThreadAffiliate ta, Expression ifS, NameExpr t, NameExpr e) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.region = r;
		this.threadAffiliate = ta;
		this.ifStmt = ifS;
		this.tag = (t==null)?null:t.toString();
		this.exceptionToThrow = (e==null)?null:e.toString();
	}
	
	public Region getRegion() {
		return this.region;
	}
	
	public ThreadAffiliate getThreadAffiliate() {
		return this.threadAffiliate;
	}
	
	public Expression getIfStmt() {
		return this.ifStmt;
	}
	
	public String getTag() {
		return tag;
	}
	
	public String getException() {
		return exceptionToThrow;
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
