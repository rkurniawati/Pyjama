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

import java.util.ArrayList;
import java.util.List;

import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.symbolscope.ScopeInfo;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpFreeguiConstruct extends OpenMPStatement{

	private Statement body = null;
	private OpenMPStatement ompStatement= null;
	
	public ScopeInfo scope;
	
	public OmpFreeguiConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			Statement statement) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.body = statement;
	}
	
	public OmpFreeguiConstruct(Statement statement) {
		this.body = statement;
	}
	
	public OmpFreeguiConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			OpenMPStatement ompStatement) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.ompStatement = ompStatement;

	}
	
	public OmpFreeguiConstruct(OpenMPStatement ompStatement) {
		this.ompStatement = ompStatement;

	}
	
	public Statement getBody() {
		return body;
	}
	
	public OpenMPStatement getOpenMPStatement() {
		return this.ompStatement;
	}
	
	public OmpParallelConstruct normalisation() {
		OmpParallelConstruct normalised = null;
		
		if (null != this.body) {
			/*
			 * transform //#omp freeguithread
			 */
			/*
			 * give generated data clause as default(shared)
			 */
			List<OmpDataClause> parallelDataClauseList = new ArrayList<OmpDataClause>();
			OmpDefaultDataClause defaultSharedClause = new OmpDefaultDataClause();
			defaultSharedClause.setPolicy(OmpDefaultDataClause.Policy.Shared);
			parallelDataClauseList.add(defaultSharedClause);
			OmpNumthreadsClause numThreads = new OmpNumthreadsClause(new NameExpr("1")); 
			normalised = new OmpParallelConstruct(this.body, parallelDataClauseList, null, numThreads);
		} else {
			/*
			 * transform //#omp freeguithread parallel {for/sections}
			 */
			if (this.ompStatement instanceof OmpParallelConstruct) {
				normalised = ((OmpParallelConstruct)this.ompStatement);
			} else if (this.ompStatement instanceof OmpParallelForConstruct) {
				normalised = ((OmpParallelForConstruct)this.ompStatement).normalisation();
			} else if (this.ompStatement instanceof OmpParallelSectionsConstruct) {
				normalised = ((OmpParallelSectionsConstruct)this.ompStatement).normalisation();
			}
		}
		normalised.setFreegui();
		return normalised;
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
