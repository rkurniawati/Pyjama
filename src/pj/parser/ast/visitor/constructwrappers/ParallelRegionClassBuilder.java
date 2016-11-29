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
 * This is the representation for <code>parallel</code>
 * construct.
 * 
 * It should be noted that this is an 
 * elementary directive. In scenarios, where
 * combined directives are used, they are again 
 * normalised into the elementary ones.
 * 
 * @author Xing Fan
 * @version 0.9
 */

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.expr.Expression;
import pj.parser.ast.omp.OmpDataClause;
import pj.parser.ast.omp.OmpLastprivateDataClause;
import pj.parser.ast.omp.OmpNeglectExceptionClause;
import pj.parser.ast.omp.OmpParallelConstruct;
import pj.parser.ast.omp.OmpPrivateDataClause;
import pj.parser.ast.omp.OmpReductionDataClause;
import pj.parser.ast.omp.OmpSharedDataClause;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.dataclausehandler.DataClausesHandler;
import pj.pr.exceptions.OmpParallelRegionGlobalCancellationException;

public class ParallelRegionClassBuilder extends ConstructWrapper  {
	
	private static HashMap<OmpParallelConstruct, ParallelRegionClassBuilder> pairs = new HashMap<OmpParallelConstruct, ParallelRegionClassBuilder>();

	public String className = "";
	
	/* This flag indicates whether this auxilary class has been printed once by the PyjamaToJava visitor, if has been printed,
	 * the getSource() method will return empty string. 
	 */
	private boolean hasPrinted = false;
	private SourcePrinter printer = new SourcePrinter();
	
	private String staticPrefix = "";
	
	public List<Statement> currentMethodOrConstructorStmts = null;

	public PyjamaToJavaVisitor visitor;
	public OmpParallelConstruct parallelConstruct;
	private List<OmpDataClause> dataClauseList;
	
	public static ParallelRegionClassBuilder create(OmpParallelConstruct parallelConstruct) {
		ParallelRegionClassBuilder prc = pairs.get(parallelConstruct);
		if (null == prc) {
			throw new RuntimeException("Try to create ParallelRegionClassBuilder from pre-visited parallelConstruct node, but node not found!");
		}
		return prc;
	}
	
	public static ParallelRegionClassBuilder create(OmpParallelConstruct parallelConstruct, 
			boolean isStatic, 
			PyjamaToJavaVisitor visitor,
			List<Statement> stmts) {
		ParallelRegionClassBuilder prc = pairs.get(parallelConstruct);
		if (null == prc) {
			prc = new ParallelRegionClassBuilder(parallelConstruct, isStatic, visitor, stmts);
			pairs.put(parallelConstruct, prc);
		}
		return prc;
	}
		
	private ParallelRegionClassBuilder(OmpParallelConstruct parallelConstruct, 
			boolean isStatic, 
			PyjamaToJavaVisitor visitor,
			List<Statement> stmts)
	{	
		this.parallelConstruct = parallelConstruct;
		this.dataClauseList = parallelConstruct.getDataClauseList();
		if (isStatic) {
			this.staticPrefix = "static ";
		}
		this.visitor = visitor;
		
		this.currentMethodOrConstructorStmts = stmts;
	}

	private Statement getUserCode() {
		return parallelConstruct.getBody();
	}

	@Override
	public int getBeginLine() {
		return parallelConstruct.getBeginLine();
	}
	
	@Override
	public int getEndLine() {
		return parallelConstruct.getEndLine();
	}
		
	public void setPrinterIndentLevel(int level) {
		this.printer.setIndentLevel(level);
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
	
	private void generateClass() {
		printer.printLn();
		//////////////////////////////////////////////
		printer.printLn(this.staticPrefix +"class " + this.className + "{");
		printer.indent();
		printer.indent();
		printer.printLn("private int OMP_threadNumber = 1;");
		printer.printLn("private InternalControlVariables icv;");
		printer.printLn("private ReentrantLock OMP_lock;");
		printer.printLn("private Object OMP_reduction_lock = new Object();");
		printer.printLn("private ParIterator<?> OMP__ParIteratorCreator;");
		printer.printLn("public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);");
		printer.printLn();
		//#BEGIN variables defined here
		printer.printLn("//#BEGIN shared, private, lastprivate, reduction variables defined here");
		for(OmpDataClause clause: this.dataClauseList) {
			if (clause instanceof OmpSharedDataClause) {
				clause.printVariableDefination(parallelConstruct, printer, null);
			} else if (clause instanceof OmpPrivateDataClause) {
				clause.printVariableDefination(parallelConstruct, printer, DataClausesHandler.PRIVATE_VARIABLE_DECLARATION_PREFIX);
			} else if (clause instanceof OmpLastprivateDataClause) {
				clause.printVariableDefination(parallelConstruct, printer, DataClausesHandler.LASTPRIVATE_VARIABLE_DECLARATION_PREFIX);
			} else if (clause instanceof OmpReductionDataClause) {
				clause.printVariableDefination(parallelConstruct, printer, DataClausesHandler.REDUCTION_VARIABLE_DECLARATION_PREFIX);
			}
		}
		printer.printLn("//#END shared, private, lastprivate, reduction variables defined here");
		//#END variables defined here
		printer.printLn("public " + this.className + "(int thread_num, InternalControlVariables icv) {");
		printer.indent();
		printer.printLn("this.icv = icv;");
		printer.printLn("if ((false == Pyjama.omp_get_nested()) && (Pyjama.omp_get_level() > 0)) {");
		printer.indent();
		printer.printLn("this.OMP_threadNumber = 1;");
		printer.unindent();
		printer.printLn("}else {");
		printer.indent();
		printer.printLn("this.OMP_threadNumber = thread_num;");
		printer.unindent();
		printer.printLn("}");
		printer.printLn("icv.currentParallelRegionThreadNumber = this.OMP_threadNumber;");
		printer.printLn("icv.OMP_CurrentParallelRegionBarrier = new PjCyclicBarrier(this.OMP_threadNumber);");
		printer.unindent();
		printer.printLn("}");
		printer.printLn();
		printer.printLn("class MyCallable implements Callable<Void> {");
		printer.indent();
		printer.printLn("private int alias_id;");
		
		//#BEGIN firstprivate reduction variables defined for each thread here
		printer.printLn("//#BEGIN private/firstprivate reduction variables defined and initialised here");
		for(OmpDataClause clause: this.dataClauseList) {
			if (clause instanceof OmpPrivateDataClause) {
				clause.printVariableDefinationAndInitialisation(parallelConstruct, printer, null, DataClausesHandler.PRIVATE_VARIABLE_DECLARATION_PREFIX);
			} else if (clause instanceof OmpLastprivateDataClause) {
				clause.printVariableDefinationAndInitialisation(parallelConstruct, printer, null, DataClausesHandler.LASTPRIVATE_VARIABLE_DECLARATION_PREFIX);
			} else if (clause instanceof OmpReductionDataClause) {
				clause.printVariableDefinationAndInitialisation(parallelConstruct, printer, null, DataClausesHandler.REDUCTION_VARIABLE_DECLARATION_PREFIX);
			}
		}
		printer.printLn("//#END private/firstprivate reduction variables defined and initialised here");
		//#END firstprivate reduction variables defined for each thread here
		
		printer.printLn("MyCallable(int id){");
		printer.indent();
		printer.printLn("this.alias_id = id;");		
		printer.unindent();
		printer.printLn("}");
		printer.printLn();
		printer.printLn("@Override");
		printer.printLn("public Void call() {");
		printer.indent();
		printer.printLn("try {");
		printer.indent();
		//BEGIN get construct user code
		printer.printLn("/****User Code BEGIN***/");
		this.getUserCode().accept(visitor, printer);
		printer.printLn();
		printer.printLn("/****User Code END***/");
		//BEGIN reduction procedure
		printer.printLn("//BEGIN reduction procedure");
		DataClausesHandler.reductionForPRClass(this, printer);
		printer.printLn("//END reduction procedure");
		//END reduction procedure
		printer.printLn("PjRuntime.setBarrier();");
		//BEGIN Master thread updateOutputList
		printer.unindent();
		printer.printLn("} catch (OmpParallelRegionLocalCancellationException e) {");
		printer.printLn("    PjRuntime.decreaseBarrierCount();");
		printer.printLn("    if (null != e.getThrow()) {throw e.getThrow();}");
		printer.printLn("} catch (OmpParallelRegionGlobalCancellationException e) {");
		printer.printLn("    PjRuntime.decreaseBarrierCount();");
		printer.printLn("    PjExecutor.cancelCurrentThreadGroup();");
		printer.printLn("    Exception OMP_registered_e = e.getThrow();");
		printer.printLn("    if (null != OMP_registered_e) {");
		printer.printLn("        OMP_CurrentParallelRegionExceptionSlot.compareAndSet(null, OMP_registered_e);");
		printer.printLn("    }");
		//catch neglect_exceptions
		if (null != this.parallelConstruct.getNeglectException()) {
			OmpNeglectExceptionClause exceptionClause= this.parallelConstruct.getNeglectException();
			Set<Expression> exceptions = exceptionClause.getExceptionSet();
			if (null != exceptions) {
				for (Expression exception : exceptions) {
					printer.printLn("//neglect exception:"+exception.toString());
					printer.printLn("} catch (" + exception.toString() + " e) {");
					printer.printLn(" 	PjRuntime.decreaseBarrierCount();");
				}
			}
		}
		printer.printLn("} catch (Exception e) {");
		printer.printLn("    PjRuntime.decreaseBarrierCount();");
		printer.printLn("    PjExecutor.cancelCurrentThreadGroup();");
		printer.printLn("    OMP_CurrentParallelRegionExceptionSlot.compareAndSet(null, e);");
		printer.printLn("}");
		printer.printLn("if (0 == this.alias_id) {");
		printer.indent();
		if (this.parallelConstruct.isFreegui()) {
		    /*
		     * if current parallel region has freegui attribute, master
		     * thread also should do invoke remaining code in current method.
		     */
		    printer.printLn(this.generateDummyGuiCode());
		}
		printer.unindent();
		printer.printLn("}");
		//END Master thread updateOutputList
		//END get construct user code
		printer.printLn("return null;");
		printer.unindent();
		printer.printLn("}");
		printer.unindent();
		printer.printLn("}");
		printer.printLn("public void runParallelCode() {");
		printer.indent();
		this.generateRunnable();
		printer.unindent();
		printer.printLn("}");
		printer.unindent();
		printer.printLn("}");
		
	}	
	
	private void generateRunnable() {
		/*
		 * If current directive is //#omp freeguithread, free edt thread and make another more thread
		 * to substitute edt thread.
		 */
		if (this.parallelConstruct.isFreegui()) {
			printer.printLn("for (int i = 0; i <= this.OMP_threadNumber-1; i++) {");
			printer.indent();
			printer.printLn("Callable<ConcurrentHashMap<String,Object>> slaveThread = new MyCallable(i);");
			printer.printLn("PjRuntime.submit(i, slaveThread, icv);");
			printer.unindent();
			printer.printLn("}");
		}
		/*
		 * else the current directive is //#omp parallel, master thread is current thread, doesn't escape
		 * from parallel region.
		 */
		else {
			printer.printLn("for (int i = 1; i <= this.OMP_threadNumber-1; i++) {");
			printer.indent();
			printer.printLn("Callable<Void> slaveThread = new MyCallable(i);");
			printer.printLn("PjRuntime.submit(i, slaveThread, icv);");
			printer.unindent();
			printer.printLn("}");
			printer.printLn("Callable<Void> masterThread = new MyCallable(0);");
			printer.printLn("PjRuntime.getCurrentThreadICV().currentThreadAliasID = 0;");
			printer.printLn("try {");
			printer.indent();
			printer.printLn("masterThread.call();");
			printer.unindent();
			printer.printLn("} catch (Exception e) {");
			printer.indent();
			printer.printLn("e.printStackTrace();");
			printer.unindent();
			printer.printLn("}");
		}
	}
	
	private String generateDummyGuiCode() {
		GuiCodeClassBuilder currentGuiCode = DataClausesHandler.generateDummyGuiRegionForNoguiRemainingCode(this);
		String returnCode = currentGuiCode.getSource();
		return returnCode;
	}
}
