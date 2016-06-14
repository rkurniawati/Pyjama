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
/**
 * This is the representation for <code>omp target virtual</code>
 * construct.
 * @author Xing Fan
 * @version 0.1
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import pj.parser.ast.visitor.DumpVisitor;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.body.VariableDeclarator;
import pj.parser.ast.expr.VariableDeclarationExpr;
import pj.parser.ast.omp.OmpAwaitConstruct;
import pj.parser.ast.omp.OmpDataClause;
import pj.parser.ast.omp.OmpPrivateDataClause;
import pj.parser.ast.omp.OmpReductionDataClause;
import pj.parser.ast.omp.OmpSharedDataClause;
import pj.parser.ast.omp.OmpTargetConstruct;
import pj.parser.ast.stmt.BlockStmt;
import pj.parser.ast.stmt.ExpressionStmt;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.type.Type;
import pj.parser.ast.visitor.dataclausehandler.DataClausesHandler;

public class TargetTaskCodeClassBuilder extends StateMachineClassBuilder  {
	
	private static HashMap<OmpTargetConstruct, TargetTaskCodeClassBuilder> pairs = new HashMap<OmpTargetConstruct, TargetTaskCodeClassBuilder>();

	//This list contains all the variables should be declared as field variables in this state machine class.
	private LinkedList<VariableDeclarationExpr> variableDeclarations = new LinkedList<VariableDeclarationExpr>();
	
	public String className = "";
	
	private boolean stateMachineVisitingMode;
	
	/* This flag indicates whether this auxilary class has been printed once by the PyjamaToJava visitor, if has been printed,
	 * the getSource() method will return empty string. 
	 */
	private boolean hasPrinted = false;
	
	/*
	 * This printer prints other TargetTaskCodeClass built for the inner task blocks.
	 */
	private SourcePrinter PrinterForNestedAuxiliaryClasses = new SourcePrinter();
	
	public OmpTargetConstruct targetConstruct;
	
	private List<OmpDataClause> dataClauseList;
	
	public static TargetTaskCodeClassBuilder create(OmpTargetConstruct targetConstruct) {
		TargetTaskCodeClassBuilder ttb = pairs.get(targetConstruct);
		if (null == ttb) {
			throw new RuntimeException("Try to create TargetTaskCodeClassBuilder from pre-visited targetConstruct node, but node not found!");
		}
		return ttb;
	}
			
	public static TargetTaskCodeClassBuilder create(OmpTargetConstruct targetConstruct, 
			boolean isStatic, 
			PyjamaToJavaVisitor visitor,
			String className,
			boolean containAwait) {
		TargetTaskCodeClassBuilder ttb = pairs.get(targetConstruct);
		if (null == ttb) {
			ttb = new TargetTaskCodeClassBuilder(targetConstruct, isStatic, visitor, className, containAwait);
			pairs.put(targetConstruct, ttb);
		}
		return ttb;
	}
	
	private TargetTaskCodeClassBuilder(OmpTargetConstruct targetConstruct, 
			boolean isStatic, 
			PyjamaToJavaVisitor visitor,
			String className,
			boolean containAwait)
	{	
		this.targetConstruct = targetConstruct;
		this.dataClauseList = targetConstruct.getDataClauseList();
		if (isStatic) {
			this.staticPrefix = "static ";
			this.currentClassIsStatic = true;
		}
		this.visitor = visitor;
		this.className = className;
		this.stateMachineVisitingMode = containAwait;
	}
	
	public void setPrinterIndentLevel(int level) {
		this.printer.setIndentLevel(level);
	}
	
	private void extractExtraFieldDeclarations(SourcePrinter printer) {
		String declarations = printer.getSource();
		this.generatedCodeVarDeclarations = this.generatedCodeVarDeclarations.concat(declarations);
		printer.clear();
	}
	
	private void generateVariableDeclaration() {
		printer.printLn(this.generatedCodeVarDeclarations);
		for(VariableDeclarationExpr varDeclExpr: this.variableDeclarations) {
			Type type = varDeclExpr.getType();
			for (Iterator<VariableDeclarator> i = varDeclExpr.getVars().iterator(); i.hasNext();) {
		           VariableDeclarator v = i.next();
		           DumpVisitor codeDumper = new DumpVisitor();
		           v.accept(codeDumper, null);
		           printer.printLn("private " + type.toString() + " " + v.getId() + ";");   
		    }
		}
	}

	private Statement getUserCode() {
		return targetConstruct.getBody();
	}

	@Override
	public int getBeginLine() {
		return targetConstruct.getBeginLine();
	}
	
	@Override
	public int getEndLine() {
		return targetConstruct.getEndLine();
	}
	

	public String get_inputlist() {
		return "inputlist_" + this.className;
	}
	
	public String get_outputlist() {
		return "outputlist_" + this.className;
	}
		
	public String getSource()
	{
		/*
		 * Ensure the auxilary class can only be printed once.
		 */
		if (this.hasPrinted) {
			return "";
		} else {
			this.generateClass();
			this.hasPrinted = true;
			return printer.getSource();
		}
	}
	
	protected void generateClass() {
		printer.printLn();
		//////////////////////////////////////////////
		printer.printLn(this.staticPrefix +"class " + this.className + " extends pj.pr.target.TargetTask<Void>{");
		printer.indent();
		printer.printLn("private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();");
		printer.printLn("private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();");
		printer.printLn();
		//#BEGIN shared variables defined here
		printer.printLn("//#BEGIN shared variables defined here");
		for(OmpDataClause sharedClause: this.dataClauseList) {
			if (sharedClause instanceof OmpSharedDataClause) {
				((OmpSharedDataClause) sharedClause).printSharedVariableDefination(targetConstruct, printer);
			} else {
				continue;
			}
		}
		printer.printLn("//#END shared variables defined here");
		//#END shared variables defined here
		//#BEGIN firstprivate reduction variables defined for each thread here
		printer.printLn("//#BEGIN private/firstprivate reduction variables defined here");
		for(OmpDataClause clause: this.dataClauseList) {
			if (clause instanceof OmpReductionDataClause) {
				((OmpReductionDataClause) clause).printReductionVariableDefination(targetConstruct, printer);
			} else {
				continue;
			}
		}
		printer.printLn("//#END private/firstprivate reduction variables  defined here");
		//#END firstprivate reduction variables defined for each thread here
		printer.printLn("public " + this.className + "(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {");
		printer.indent();
		printer.printLn("this.OMP_inputList = inputlist;");
		printer.printLn("this.OMP_outputList = outputlist;");
		//#BEGIN shared variables initialised here
		printer.printLn("//#BEGIN shared variables initialised here");
		for(OmpDataClause sharedClause: this.dataClauseList) {
			if (sharedClause instanceof OmpSharedDataClause) {
				((OmpSharedDataClause) sharedClause).printSharedVariableInitialisation(targetConstruct, printer);
			} else {
				continue;
			}
		}
		printer.printLn("//#END shared variables initialised here");
		//#END shared variables initialised here

		//#BEGIN firstprivate reduction variables initialised for each thread here
		printer.printLn("//#BEGIN firstprivate reduction variables initialised here");
		for(OmpDataClause clause: this.dataClauseList) {
			if (clause instanceof OmpPrivateDataClause) {
				((OmpPrivateDataClause) clause).printPrivateVariableInitialisation(targetConstruct, printer);
			} else {
				continue;
			}
		}
		printer.printLn("//#END firstprivate reduction variables initialised here");
		//#END firstprivate reduction variables initialised for each thread here
		printer.unindent();
		printer.printLn("}");
		printer.printLn();
		printer.printLn("private void updateOutputListForSharedVars() {");
		printer.indent();
		//BEGIN put shared variables lastprivate(if any, though no available) to outputlist
		printer.printLn("//BEGIN update outputlist");
		DataClausesHandler.updateOutputlistForSharedVariablesInTTClass(this, printer);
		printer.printLn("//END update outputlist");
		//END put shared variables lastprivate(if any, though no available) to outputlist
		printer.unindent();
		printer.printLn("}");
		printer.printLn("private int OMP_state = 0;");
		printer.printLn("@Override");
		printer.printLn("public Void call() {");
		printer.indent();
		//BEGIN get construct user code
		printer.printLn("/****User Code BEGIN***/");
		if (this.stateMachineVisitingMode) {
			this.generateStates();
		} else {
			this.getUserCode().accept(visitor, printer);
		}
		printer.printLn();
		printer.printLn("/****User Code END***/");
		//END get construct user code
		printer.printLn("updateOutputListForSharedVars();");
		printer.printLn("this.setFinish();");
		printer.printLn("return null;");
		printer.unindent();
		printer.printLn("}");
		generateVariableDeclaration();
		printer.unindent();
		printer.printLn("}");
		
		//---print other auxilary classes generated before
		printer.printLn(this.PrinterForNestedAuxiliaryClasses.getSource());
	}	
	
	protected void generateStates() {
		printer.printLn("switch(OMP_state) {");
		printer.printLn("case 0:");
		printer.indent();
		//----------------------------------------------------
		Statement body = this.targetConstruct.getBody();
		if (null == body) {
			throw new RuntimeException("Pyjama unexpected situation: converting an abstract method to state machine.");
		}
		List<Statement> stmts;
		if (body instanceof BlockStmt) {
			stmts = ((BlockStmt)body).getStmts();
		} else {
			stmts = new LinkedList<Statement>();
			stmts.add(body);
		}
		
		Iterator<Statement> iter = stmts.iterator();
		Statement s;
		while (iter.hasNext()) {
			s = iter.next();
			if (s instanceof OmpAwaitConstruct) {
				this.visitOmpAwaitConstruct((OmpAwaitConstruct)s);
				continue;
			}
			if (s instanceof OmpTargetConstruct) {
				this.visitOmpTargetConstruct((OmpTargetConstruct)s);
				continue;
			}
			if (s instanceof ExpressionStmt && (((ExpressionStmt) s).getExpression() instanceof VariableDeclarationExpr)) {
				VariableDeclarationExpr varDeclExpr = (VariableDeclarationExpr) ((ExpressionStmt) s).getExpression();
				this.visitVariableDeclarationExpr(varDeclExpr);
				continue;
			}
			/* DEFAULT
			 * Simply using PyjamaToJavaVisitor to visit other ExpressionStmts.
			 */
			PyjamaToJavaVisitor yetAnotherPjVisitor = new PyjamaToJavaVisitor(visitor.getSymbolTable(), this.visitor.getVisitingModeTrack());
			yetAnotherPjVisitor.getPriter().setIndentLevel(printer.getIndentLevel());
	        s.accept(yetAnotherPjVisitor, yetAnotherPjVisitor.getPriter());
	        printer.printLn(yetAnotherPjVisitor.getSource()); 
		}		
		//----------------------------------------------------
		printer.printLn("default:");
		printer.indent();
		printer.printLn("this.setFinish();");
		printer.unindent();
		printer.unindent();
		printer.printLn("}");
	}
	
	private void visitOmpTargetConstruct(OmpTargetConstruct n) {
		//Use another Pyjama visitor, using statemachine visiting mode
		PyjamaToJavaVisitor yetAnotherPjVisitor = new PyjamaToJavaVisitor(visitor.getSymbolTable(), this.visitor.getVisitingModeTrack());
		yetAnotherPjVisitor.currentMethodIsStatic = this.currentClassIsStatic;
		yetAnotherPjVisitor.getPriter().setIndentLevel(printer.getIndentLevel());
        n.accept(yetAnotherPjVisitor, yetAnotherPjVisitor.getPriter());
        this.PrinterForNestedAuxiliaryClasses.printLn(yetAnotherPjVisitor.getAuxiliaryClassesSource());
        this.extractExtraFieldDeclarations(yetAnotherPjVisitor.getPrinterForAsyncTargetTaskStateMachineBuilder());
        printer.printLn(yetAnotherPjVisitor.getSource());
		if (n.isAwait()) {
			//if current statement is an await target construct, then, this statement is a separator
			stateCounter++;
			printer.unindent();
			printer.printLn("case " + stateCounter + ":");
			printer.indent();
			DataClausesHandler.processDataClausesAfterTTClassInvocation(TargetTaskCodeClassBuilder.create(n), printer);
		}
	}
	

}
