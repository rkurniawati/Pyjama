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

import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpForConstruct extends OpenMPStatement{

	private OmpScheduleClause scheduleClause = null;
	private Statement forStmt = null;
	private OmpNeglectExceptionClause neglectException = null;
	private List<OmpDataClause> dataClauseList;
	
	private boolean nowait;
	private boolean ordered;
	
	public OmpForConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			Statement statement,  
			List<OmpDataClause> dataClausesList, 
			OmpScheduleClause scheduleClause,
			OmpNeglectExceptionClause neglectException,
			boolean nowait,
			boolean ordered
			){
		super(beginLine, beginColumn, endLine, endColumn);
		this.forStmt = statement;
		this.dataClauseList = dataClausesList;
		this.scheduleClause = scheduleClause;
		this.neglectException = neglectException;
		this.nowait = nowait;
		this.ordered = ordered;
	}
	
	public OmpForConstruct( 
			Statement statement,  
			List<OmpDataClause> dataClausesList, 
			OmpScheduleClause scheduleClause,
			OmpNeglectExceptionClause neglectException,
			boolean nowait,
			boolean ordered
			){
		this.forStmt = statement;
		this.dataClauseList = dataClausesList;
		this.scheduleClause = scheduleClause;
		this.neglectException = neglectException;
		this.nowait = nowait;
		this.ordered = ordered;
	}
	
	public Statement  getForStmt() {
		return forStmt;
	}
	public List<OmpDataClause> getDataClauseList() {
		return this.dataClauseList;
	}
	
	public OmpScheduleClause getScheduleClause() {
		return this.scheduleClause;
	}
	
	public OmpNeglectExceptionClause getNeglectException() {
		return neglectException;
	}
	
	public boolean isNowait() {
		return this.nowait;
	}
	
	public boolean isOrdered() {
		return this.ordered;
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
