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
 * This is the representation for <code>omp task virtual</code>
 * construct.
 * @author Xing Fan
 * @version 0.1
 */

import java.util.HashMap;
import java.util.List;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.omp.OmpDataClause;
import pj.parser.ast.omp.OmpPrivateDataClause;
import pj.parser.ast.omp.OmpSharedDataClause;
import pj.parser.ast.omp.OmpTaskConstruct;
import pj.parser.ast.stmt.Statement;

public class TaskCodeClassBuilder extends ConstructWrapper  {
	
	private static HashMap<OmpTaskConstruct, TaskCodeClassBuilder> pairs = new HashMap<OmpTaskConstruct, TaskCodeClassBuilder>();
	
	public String className = "";
	
	protected String staticPrefix = "";
	
	protected boolean currentClassIsStatic = false;	

	public PyjamaToJavaVisitor visitor;
	
	/*
	 * This printer prints other TargetTaskCodeClass built for the inner task blocks.
	 */
	private SourcePrinter PrinterForNestedAuxiliaryClasses = new SourcePrinter();
	
	/* This flag indicates whether this auxilary class has been printed once by the PyjamaToJava visitor, if has been printed,
	 * the getSource() method will return empty string. 
	 */
	private boolean hasPrinted = false;
	
	protected SourcePrinter printer = new SourcePrinter();
	
	public OmpTaskConstruct taskConstruct;
	
	private List<OmpDataClause> dataClauseList;
	
	public static TaskCodeClassBuilder create(OmpTaskConstruct taskConstruct) {
		TaskCodeClassBuilder tb = pairs.get(taskConstruct);
		if (null == tb) {
			throw new RuntimeException("Try to create TaskCodeClassBuilder from pre-visited taskConstruct node, but node not found!");
		}
		return tb;
	}
			
	public static TaskCodeClassBuilder create(OmpTaskConstruct taskConstruct, 
			boolean isStatic, 
			PyjamaToJavaVisitor visitor,
			String className) {
		TaskCodeClassBuilder tb = pairs.get(taskConstruct);
		if (null == tb) {
			tb = new TaskCodeClassBuilder(taskConstruct, isStatic, visitor, className);
			pairs.put(taskConstruct, tb);
		}
		return tb;
	}
	
	private TaskCodeClassBuilder(OmpTaskConstruct taskConstruct, 
			boolean isStatic, 
			PyjamaToJavaVisitor visitor,
			String className)
	{	
		this.taskConstruct = taskConstruct;
		this.dataClauseList = taskConstruct.getDataClauseList();
		if (isStatic) {
			this.staticPrefix = "static ";
			this.currentClassIsStatic = true;
		}
		this.visitor = visitor;
		this.className = className;
	}
	
	public void setPrinterIndentLevel(int level) {
		this.printer.setIndentLevel(level);
	}

	private Statement getUserCode() {
		return taskConstruct.getBody();
	}

	@Override
	public int getBeginLine() {
		return taskConstruct.getBeginLine();
	}
	
	@Override
	public int getEndLine() {
		return taskConstruct.getEndLine();
	}
	
	public String getSource() {
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
		printer.printLn(this.staticPrefix +"class " + this.className + " extends pj.pr.task.TargetTask<Void>{");
		printer.indent();
		printer.printLn();
		//#BEGIN shared variables defined here
		printer.printLn("//#BEGIN shared, private variables defined here");
		for(OmpDataClause clause: this.dataClauseList) {
			if (clause instanceof OmpSharedDataClause) {
				clause.printVariableDefination(taskConstruct, printer, null);
			} else if (clause instanceof OmpPrivateDataClause) {
				clause.printVariableDefination(taskConstruct, printer, null);
			}
		}
		printer.printLn("//#END shared, private variables defined here");
		//#END shared variables defined here

		printer.printLn();
		printer.printLn("private int OMP_state = 0;");
		printer.printLn("@Override");
		printer.printLn("public Void call() {");
		printer.indent();
		//BEGIN get construct user code
		printer.printLn("/****User Code BEGIN***/");
		this.getUserCode().accept(visitor, printer);
		printer.printLn("/****User Code END***/");
		//END get construct user code
		printer.printLn("this.setFinish();");
		printer.printLn("return null;");
		printer.unindent();
		printer.printLn("}");
		printer.unindent();
		printer.printLn("}");
		
		//---print other auxilary classes generated before
		printer.printLn(this.PrinterForNestedAuxiliaryClasses.getSource());
	}

}
