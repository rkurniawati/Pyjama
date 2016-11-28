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

import pj.parser.ast.body.VariableDeclarator;
import pj.parser.ast.body.VariableDeclaratorId;
import pj.parser.ast.expr.BinaryExpr;
import pj.parser.ast.expr.Expression;
import pj.parser.ast.expr.IntegerLiteralExpr;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.expr.UnaryExpr;
import pj.parser.ast.expr.VariableDeclarationExpr;
import pj.parser.ast.stmt.BreakStmt;
import pj.parser.ast.stmt.ForStmt;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.stmt.SwitchEntryStmt;
import pj.parser.ast.stmt.SwitchStmt;
import pj.parser.ast.type.PrimitiveType;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpSectionsConstruct extends OpenMPStatement{

	private List<OmpSectionConstruct> sectionList;
	private List<OmpDataClause> dataClauseList;
	private OmpNeglectExceptionClause neglectException = null;
	
	private boolean nowait;

	
	public OmpSectionsConstruct(int beginLine, int beginColumn, int endLine, int endColumn, 
			List<OmpSectionConstruct> sectionList,  
			List<OmpDataClause> dataClausesList, 
			OmpNeglectExceptionClause neglectException,
			boolean nowait
			){
		super(beginLine, beginColumn, endLine, endColumn);
		this.sectionList = sectionList;
		this.dataClauseList = dataClausesList;
		this.neglectException = neglectException;
		this.nowait = nowait;

	}
	
	public OmpSectionsConstruct( 
			List<OmpSectionConstruct> sectionList,  
			List<OmpDataClause> dataClausesList, 
			OmpNeglectExceptionClause neglectException,
			boolean nowait
			){
		this.sectionList = sectionList;
		this.dataClauseList = dataClausesList;
		this.neglectException = neglectException;
		this.nowait = nowait;
	}
	
	public List<OmpSectionConstruct> getSectionList() {
		return this.sectionList;
	}
	public List<OmpDataClause> getDataClauseList() {
		return this.dataClauseList;
	}
	public OmpNeglectExceptionClause getNeglectException() {
		return neglectException;
	}
		
	public boolean isNowait() {
		return this.nowait;
	}
	
	public OmpForConstruct normalisation() {
		ForStmt forStmt = generateForLoop();
		OmpScheduleClause scheduleClause = new OmpScheduleClause(OmpScheduleClause.Type.Dynamic, new IntegerLiteralExpr("1"));
		OmpForConstruct forConstruct = new OmpForConstruct(forStmt, this.dataClauseList, scheduleClause, this.neglectException, this.nowait, false);
		return forConstruct;
	}
	
	private ForStmt generateForLoop() {
		List<Expression> init = new ArrayList<Expression>();
		Expression compare;
	    List<Expression> update = new ArrayList<Expression>();
    
	    /* BEGIN generate init*/
	    //generate type name: int
	    PrimitiveType intType = new PrimitiveType(PrimitiveType.Primitive.Int);  
	    //generate: 
	    ArrayList<VariableDeclarator> varDeclaratorList = new ArrayList<VariableDeclarator>();
	    //generate identifier:  _OMP_VANCY_ITERATOR_
	    VariableDeclaratorId varIdentifier = new VariableDeclaratorId(0,0,0,0,"_OMP_VANCY_ITERATOR_",0);
	    //generate initial value: 0
	    Expression varInitialValue = new IntegerLiteralExpr("0");
	    //generate: _OMP_VANCY_ITERATOR_ = 0
	    VariableDeclarator declarator = new VariableDeclarator(varIdentifier, varInitialValue);
	    varDeclaratorList.add(declarator);
	    //finally we got what we want(init): 
	    VariableDeclarationExpr localIterator = new VariableDeclarationExpr(0, 0, 0, 0, 0, null, intType, varDeclaratorList);
	    init.add(localIterator);
	    /*END generate init*/
	    
	    /* BEGIN generate compare*/
	    NameExpr leftVar = new NameExpr("_OMP_VANCY_ITERATOR_");
	    IntegerLiteralExpr rightVal = new IntegerLiteralExpr(Integer.toString((this.sectionList.size())));
	    //generate _OMP_VANCY_ITERATOR_ < sectionList.size()
	    compare = new BinaryExpr(leftVar, rightVal, BinaryExpr.Operator.less);
	    /* END generate compare*/
	    
	    /* BEGIN generate update*/
	    //generate ++_OMP_VANCY_ITERATOR_
	    Expression iteratorUpdate = new UnaryExpr(0, 0, 0, 0, new NameExpr("_OMP_VANCY_ITERATOR_"), UnaryExpr.Operator.preIncrement);
	    update.add(iteratorUpdate);
	    /* END generate update*/
	    
	    // generate for(int _OMP_VANCY_ITERATOR_=0; _OMP_VANCY_ITERATOR_<1; ++_OMP_VANCY_ITERATOR_)
	    Expression selector = new NameExpr("_OMP_VANCY_ITERATOR_");
	    ArrayList<SwitchEntryStmt> entries = new ArrayList<SwitchEntryStmt>();
	    OmpSectionConstruct section;
	    for (int j = 0; j<this.sectionList.size(); j++ ) {
	    	section = this.sectionList.get(j);
	    	NameExpr label = new NameExpr(Integer.toString(j));
	    	ArrayList<Statement> entryStatements = new ArrayList<Statement>();
	    	entryStatements.add(section.getStatement());
	    	entryStatements.add(new BreakStmt());
	    	entries.add(new SwitchEntryStmt(label, entryStatements));
	    }
	    //add default entry
	    ArrayList<Statement> defaultEntryStatements = new ArrayList<Statement>();
	    defaultEntryStatements.add(new BreakStmt());
	    entries.add(new SwitchEntryStmt(null, defaultEntryStatements));
	    
	    SwitchStmt switchStmt = new SwitchStmt(selector, entries);
	    ForStmt forStmt = new ForStmt(init, compare, update, switchStmt);
	    return forStmt;  
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
