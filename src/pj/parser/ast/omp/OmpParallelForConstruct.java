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

import pj.parser.ast.expr.Expression;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpParallelForConstruct extends OpenMPStatement{

	private OmpIfClause ifExpr = null;
	private OmpNumthreadsClause numThreads = null;
	private Statement forStmt = null;
	private List<OmpDataClause> dataClauseList;
	private OmpScheduleClause scheduleClause = null;
	private boolean ordered;
	
	public OmpParallelForConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			Statement statement,  
			List<OmpDataClause> dataClausesList, 
			OmpScheduleClause scheduleClause,
			OmpIfClause ifExpr,
			OmpNumthreadsClause numThreads,
			boolean ordered){
		super(beginLine, beginColumn, endLine, endColumn);
		this.forStmt = statement;
		this.dataClauseList = dataClausesList;
		this.scheduleClause = scheduleClause;
		this.ifExpr = ifExpr;
		this.numThreads = numThreads;
		this.ordered = ordered;
	}
	
	public OmpParallelForConstruct(
			Statement statement,  
			List<OmpDataClause> dataClausesList, 
			OmpScheduleClause scheduleClause,
			OmpIfClause ifExpr,
			OmpNumthreadsClause numThreads,
			boolean ordered){
		this.forStmt = statement;
		this.dataClauseList = dataClausesList;
		this.scheduleClause = scheduleClause;
		this.ifExpr = ifExpr;
		this.numThreads = numThreads;
		this.ordered = ordered;
	}
	
	public Statement getForStmt() {
		return this.forStmt;
	}
	public List<OmpDataClause> getDataClauseList() {
		return this.dataClauseList;
	}
	public OmpScheduleClause getScheduleClause() {
		return this.scheduleClause;
	}
	public OmpIfClause getIfClause() {
		return ifExpr;
	}

	public OmpNumthreadsClause getNumThreadsExpression() {
		return numThreads;
	}
	
	public OmpParallelConstruct normalisation() {
		List<OmpDataClause> forDataClauseList = new ArrayList<OmpDataClause>();
		List<OmpDataClause> parallelDataClauseList = new ArrayList<OmpDataClause>();
		/*
		 * all arguments appear in //#omp parallel for directive clauses should be
		 * normalised as //#omp parallel shared(n1,n2,n3...)
		 * 				//#omp for private(n1) reduction(+:n2) 
		 */
		OmpSharedDataClause sharedClauseParallel = new OmpSharedDataClause();
		parallelDataClauseList.add(sharedClauseParallel);
		
		for (OmpDataClause clause: this.dataClauseList) {	
			switch (clause.type) {
			case Shared:
				//shared data clause needn't to be added to //#omp for
				parallelDataClauseList.add(clause);
				break;
			case Private:
			case Lastprivate:
				for (Expression arg:clause.getArgumentSet()) {
					sharedClauseParallel.addArgument(arg);
				}
				forDataClauseList.add(clause);
				break;
			case Reduction:
				for (Expression arg: ((OmpReductionDataClause)clause).getArgumentMap().keySet()) {
					sharedClauseParallel.addArgument(arg);
				}
				forDataClauseList.add(clause);
				break;
			default:
				break;
			}
		}
		
		OmpForConstruct forConstruct = new OmpForConstruct(forStmt, forDataClauseList, this.scheduleClause, false, this.ordered);
		OmpParallelConstruct normalised = new OmpParallelConstruct(forConstruct, parallelDataClauseList, this.ifExpr, this.numThreads);
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
