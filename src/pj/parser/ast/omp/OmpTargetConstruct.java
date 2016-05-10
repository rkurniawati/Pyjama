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

import java.util.HashSet;
import java.util.List;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.symbolscope.Symbol;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpTargetConstruct extends OpenMPStatement{
	
	public enum ExecutionType {Await, NoWait, Wait};
	private OmpIfClause ifExpr = null;
	private Statement body = null;
	private List<OmpDataClause> dataClauseList;
	private ExecutionType waitType = null;
	private boolean virtualTarget = true;
	private String targetName;
	private String taskName;
	
	//this symbol is true when default(shared) data clause happens. Default is none.
	private boolean defaultShared = false;
	
	public OmpTargetConstruct(
			Statement statement, 
			boolean isVirtual,
			NameExpr targetName,
			List<OmpDataClause> dataClausesList, 
			OmpIfClause ifExpr,
			ExecutionType executionType,
			NameExpr taskName){
		this.body = statement;
		this.virtualTarget = isVirtual;
		this.targetName = targetName.toString();
		this.dataClauseList = dataClausesList;
		this.ifExpr = ifExpr;
		this.waitType = executionType;
		if (null != taskName) {
			this.taskName = taskName.toString();
		}
	}
	
	public OmpTargetConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			Statement statement, 
			boolean isVirtual,
			NameExpr targetName,
			List<OmpDataClause> dataClausesList, 
			OmpIfClause ifExpr,
			ExecutionType executionType,
			NameExpr taskName){
		super(beginLine, beginColumn, endLine, endColumn);
		this.body = statement;
		this.virtualTarget = isVirtual;
		this.targetName = targetName.toString();
		this.dataClauseList = dataClausesList;
		this.ifExpr = ifExpr;
		this.waitType = executionType;
		if (null != taskName) {
			this.taskName = taskName.toString();
		}
	}
	
	public Statement getBody() {
		return body;
	}
	
	public String getTargetName() {
		return this.targetName;
	}
	
	public String getTaskName() {
		return this.taskName;
	}
	
	public boolean isVirtual() {
		return this.virtualTarget;
	}
	
	public boolean isAwait() {
		if(this.waitType == ExecutionType.Await) {
			return true;
		}
		return false;
	}
	
	public boolean isTaskAs() {
		if (null == this.taskName) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean isNoWait() {
		if(this.waitType == ExecutionType.NoWait) {
			return true;
		}
		return false;
	}
	
	public boolean isSync() {
		if(this.waitType == ExecutionType.Wait) {
			return true;
		}
		return false;
	}
	public List<OmpDataClause> getDataClauseList() {
		return this.dataClauseList;
	}
	public OmpIfClause getIfClause() {
		return ifExpr;
	}
	
	/*
	 * This method is responsible to convert default(shared) clause (if any) to
	 * normal shared clauses: shared(v1,v2,...vn), where v1-vn are variables current
	 * parallel region can get acess. 
	 * This method only takes effect when default(shared) clause exists in current 
	 * parallel directive, if not, this method just does nothing. 
	 * 
	 * The reachable variable is based on scope
	 */
	public void processAllReachableVariablesIfNecessary() {
		//search data clause, if default data clause exists, get the policy(none, shared).
		for(OmpDataClause clause: this.dataClauseList) {
			if (clause instanceof OmpDefaultDataClause) {
				OmpDefaultDataClause defaultClause = (OmpDefaultDataClause) clause;
				if (OmpDefaultDataClause.Policy.Shared == defaultClause.getPolicy()) {
					this.defaultShared = true;
				}
				break;
			}
		}
		if (false == this.defaultShared) {
			//needn't do anything
			return;
		}
		HashSet<Expression> variableSet = new HashSet<Expression>();
		for(Symbol symbol: scope.getAllReachableSymbols()) {
			if (Symbol.SymbolType.ScopeLocalParameter == symbol.getSymbolType() || Symbol.SymbolType.MethodParameter == symbol.getSymbolType()) {
				NameExpr varExpr = new NameExpr(symbol.getName());
				variableSet.add(varExpr);
			}
		}
		OmpSharedDataClause sharedDataClause = new OmpSharedDataClause(variableSet);
		this.dataClauseList.add(sharedDataClause);
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
