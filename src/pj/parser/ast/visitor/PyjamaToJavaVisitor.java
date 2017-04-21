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

/**
 * @author Xing Fan
 * @version 1.0
 */
package pj.parser.ast.visitor;

import pj.PjRuntime;
import pj.parser.ast.*;
import pj.parser.ast.body.*;
import pj.parser.ast.expr.*;
import pj.parser.ast.omp.*;
import pj.parser.ast.stmt.*;
import pj.parser.ast.symbolscope.SymbolTable;
import pj.parser.ast.type.*;
import pj.parser.ast.visitor.constructwrappers.*;
import pj.parser.ast.visitor.dataclausehandler.DataClausesHandler;
import pj.parser.ast.visitor.dataclausehandler.DataClauseHandlerUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class PyjamaToJavaVisitor implements VoidVisitor<SourcePrinter> {
	
	protected File file;
	protected String compilationFileName;
	protected final static String PYJAMA_FILE_EXTENSION = ".pj";
	
	static protected int nextOpenMPRegionUniqueID = 0;
	static protected int nextTargetBlockID = 0;
	static protected int nextTaskBlockID = 0;
	static protected int nextWorkShareID = 0;
	static protected int nextGuiCodeID = 0;
	protected static final String prefixTaskNameForParallelRegion = "_OMP_ParallelRegion_";
	protected static final String prefixTaskNameForTargetTaskRegion = "_OMP_TargetTaskRegion_";
	protected static final String prefixTaskNameForTaskRegion = "_OMP_TaskRegion_";
	protected static final String prefixTaskNameForWorkShare = "_OMP_WorkShare_";
	protected static final String prefixTaskNameForGuiCode = "_OMP_GuiCode_";
	
	//this hashmap stores the id of each generated region, in order to avoid id mismatch for same OpenMP construct. 
	static HashMap<OpenMPStatement, Integer> OpenMPStatementIDPairing = new HashMap<OpenMPStatement, Integer>();
	//this hashmap stores the virtual targets with their name_as names. A name may pair multiple target blocks.
	static HashMap<String, HashSet<TargetTaskCodeClassBuilder>> nameAsTargetBlocks = new HashMap<String, HashSet<TargetTaskCodeClassBuilder>>();
	
	protected Stack<Boolean> stateMachineVisitingMode = new Stack<Boolean>();
	
	protected SourcePrinter CodePrinter = new SourcePrinter();
	protected SourcePrinter PrinterForAuxiliaryClasses = new SourcePrinter();
	protected SourcePrinter PrinterForAsyncMethodStateMachineBuilder = new SourcePrinter();
	protected SourcePrinter PrinterForAsyncTargetTaskStateMachineBuilder = new SourcePrinter();

	//keep track of current method whether is static, used for the generate of parallel region class, and work share method
	public boolean currentMethodIsStatic = false; 
	//keep track of current method or constructor's statements, this statements may used in freeguithread visitor
	protected List<Statement> currentMethodOrConstructorStmts = null;

	//keep track of current type of declaration of variables 2014.7.14
	protected Type currentVarDeclarationType = null;
	//if current var declaration is in foreach header, do not give initial value 2014.7.4 => 2014.10.27
	protected boolean needNotVarInit = false;
	//keep track of current worksharing block's private variables, including firstprivate, lastprivate, and reduction
	/* 2015.6.29
	 * currentPrivateVariableInOMPWorksharingBlock: contain all variable name inside current //#omp for or //#omp sections
	 * need to be renamed. This is used in NameExpr visitor.
	 */
	protected HashMap<String,String>  currentPrivateVariableInOMPWorksharingBlock = new HashMap<String,String>();
	
	private SymbolTable symbolTable = null;
	
	public PyjamaToJavaVisitor(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}
	
	public PyjamaToJavaVisitor(SymbolTable symbolTable, Stack<Boolean> visitingMode) {
		this.symbolTable = symbolTable;
		this.stateMachineVisitingMode = visitingMode;
	}
	
	public SymbolTable getSymbolTable() {
		return symbolTable;
	}
	
	public Stack<Boolean> getVisitingModeTrack() {
		return this.stateMachineVisitingMode;
	}
	
	//OpenMP add BEGIN*******************************************************************************OpenMP add BEGIN//
	public void visit(Node n, SourcePrinter printer){
		throw new RuntimeException("Node: This abstract class should not appear.");
	}
	
	//------------------------------------------------------
    public void visit(OmpParallelConstruct n, SourcePrinter printer){
    	
    	//get current OmpParallelConstruct's scopeinfo from symbolTable
    	n.scope = this.symbolTable.getScopeOfNode(n);
    	n.processAllReachableVariablesIfNecessary();
    	
    	int uniqueOpenMPRegionID = -1;
    	if (OpenMPStatementIDPairing.get(n) == null) {
    		uniqueOpenMPRegionID = nextOpenMPRegionUniqueID++;
    		OpenMPStatementIDPairing.put(n, uniqueOpenMPRegionID);
    	} else {
    		uniqueOpenMPRegionID = OpenMPStatementIDPairing.get(n);
    	}
		
		ParallelRegionClassBuilder currentPRClass = ParallelRegionClassBuilder.create(n, this.currentMethodIsStatic, this, this.currentMethodOrConstructorStmts);
		currentPRClass.className = prefixTaskNameForParallelRegion + uniqueOpenMPRegionID;
		
		printer.printLn("/*OpenMP Parallel region (#" + uniqueOpenMPRegionID + ") -- START */");

		this.PrinterForAuxiliaryClasses.printLn(currentPRClass.getSource());
		
		String previous_icv = "icv_previous_" + currentPRClass.className;
		String new_icv = "icv_" + currentPRClass.className;
		String thread_number = "_threadNum_" + currentPRClass.className;
		printer.printLn("InternalControlVariables " + previous_icv + " = PjRuntime.getCurrentThreadICV();");
		printer.printLn("InternalControlVariables " + new_icv + " = PjRuntime.inheritICV(" + previous_icv + ");");
		if (null != n.getNumThreadsExpression()) {
			String numThreadsClause = n.getNumThreadsExpression().getNumExpression().toString();
			printer.printLn("int " + thread_number + " = " + numThreadsClause + ";");
		} else {
			printer.printLn("int " + thread_number + " = " + new_icv + ".nthreads_var.get("+ new_icv + ".levels_var);");
		}
		
		printer.printLn(currentPRClass.className + " " + currentPRClass.className + "_in = new "+ currentPRClass.className + "(" + thread_number + "," + new_icv + ");");
		DataClausesHandler.processDataClausesBeforePRClassInvocation(currentPRClass, printer);
		
		printer.printLn(currentPRClass.className + "_in" + ".runParallelCode();");
		
		if (!n.isFreegui()) {
			// if directive is normal parallel directive, recovery data from PRClass
			DataClausesHandler.processDataClausesAfterPRClassInvocation(currentPRClass, printer);
			printer.printLn("PjRuntime.recoverParentICV(" + previous_icv + ");");
			printer.printLn("RuntimeException OMP_ee_" + uniqueOpenMPRegionID + " = (RuntimeException) " + currentPRClass.className + "_in.OMP_CurrentParallelRegionExceptionSlot.get();");
			printer.printLn("if (OMP_ee_" + uniqueOpenMPRegionID + " != null) {throw OMP_ee_" + uniqueOpenMPRegionID + ";}");
		} else if (n.isFreegui()) {
			// if directive is freeguithread property, return after region, following code is invoked in region.
			printer.printLn("if (PjRuntime.getCurrentThreadICV() != null) {", -1);
			printer.indent();
			DataClausesHandler.processDataClausesAfterPRClassInvocation(currentPRClass, printer);
			printer.printLn("PjRuntime.recoverParentICV(" + previous_icv + ");");
			printer.printLn("return;", -1);
			printer.unindent();
			printer.printLn("}", -1);
		}
		printer.printLn("/*OpenMP Parallel region (#" + uniqueOpenMPRegionID + ") -- END */");
    }
    
    public void visit(OmpParallelForConstruct n, SourcePrinter printer){
    	throw new RuntimeException("//#omp parallel for: This should have been normalised.");
    	// --------------------------- Normalised --------------------//
    }
    
    public void visit(OmpParallelSectionsConstruct n, SourcePrinter printer){
    	throw new RuntimeException("//#omp parallel sections: This should have been normalised.");
    	// --------------------------- Normalised --------------------//
    }
    public void visit(OmpForConstruct n, SourcePrinter printer){
    	//get current OmpParallelConstruct's scopeinfo from symbolTable
    	n.scope = this.symbolTable.getScopeOfNode(n);
    	
    	int uniqueWorkShareRegionID = -1;
    	if (OpenMPStatementIDPairing.get(n) == null) {
    		uniqueWorkShareRegionID = nextOpenMPRegionUniqueID++;
    		OpenMPStatementIDPairing.put(n, uniqueWorkShareRegionID);
    	} else {
    		uniqueWorkShareRegionID = OpenMPStatementIDPairing.get(n);
    	}
    	
    	WorkShareBlockBuilder currentWSBlock = new WorkShareBlockBuilder(n, this, uniqueWorkShareRegionID);
		
    	printer.printLn("/*OpenMP Work Share region (#" + uniqueWorkShareRegionID + ") -- START */");
		
    	//Print Work Share Region
		printer.printLn(currentWSBlock.getSource());
		
		printer.printLn("PjRuntime.setBarrier();");
		printer.printLn("PjRuntime.reset_OMP_orderCursor();");
	
    	printer.printLn("/*OpenMP Work Share region (#" + uniqueWorkShareRegionID + ") -- END */");
    }
    
	public void visit(OmpSectionsConstruct n, SourcePrinter printer){
		throw new RuntimeException("//#omp sections: This should have been normalised.");
    	// --------------------------- Normalised --------------------//
	}

    public void visit(OmpSingleConstruct n, SourcePrinter printer){
    	throw new RuntimeException("//#omp single: This should have been normalised.");
    	// --------------------------- Normalised --------------------//
    }
    public void visit(OmpMasterConstruct n, SourcePrinter printer){
    	printer.printLn("if (0 == Pyjama.omp_get_thread_num()) {");
    	printer.indent();
    	n.getStatement().accept(this, printer);
    	printer.unindent();
    	printer.printLn("}");
    }
    public void visit(OmpCriticalConstruct n, SourcePrinter printer){
    	printer.printLn("PjRuntime.OMP_lock.lock();");
    	printer.printLn("try {");
    	printer.indent();
    	n.getStatement().accept(this, printer);
    	printer.unindent();
    	printer.printLn("} finally {");
    	printer.printLn("PjRuntime.OMP_lock.unlock();");
    	printer.unindent();
    	printer.printLn("}");
    }
    public void visit(OmpOrderedConstruct n, SourcePrinter printer){
    	printer.printLn("while (PjRuntime.get_OMP_orderCursor().get() < OMP_local_iterator) {}");
    	n.getStatement().accept(this, printer);
    	printer.printLn();
    	printer.printLn("PjRuntime.get_OMP_orderCursor().incrementAndGet();");
    }
    public void visit(OmpAtomicConstruct n, SourcePrinter printer){
    	//    	throw new RuntimeException("//#omp atomic: This should have been normalised.");
    	// --------------------------- Normalised --------------------//
    	printer.printLn("PjRuntime.OMP_lock.lock();");
    	printer.printLn("try {");
    	printer.indent();
    	n.getStatement().accept(this, printer);
    	printer.unindent();
    	printer.printLn("} finally {");
    	printer.printLn("PjRuntime.OMP_lock.unlock();");
    	printer.unindent();
    	printer.printLn("}");
    }
    

	@Override
	public void visit(OmpTaskConstruct n, SourcePrinter printer) {
		// TODO Auto-generated method stub
		
	 	//get current OmpTaskConstruct's scope info from symbolTable
    	n.scope = this.symbolTable.getScopeOfNode(n);
    	n.processAllReachableVariablesIfNecessary();
    	
    	int uniqueTaskBlockID = -1;
    	if (OpenMPStatementIDPairing.get(n) == null) {
    		uniqueTaskBlockID = nextTaskBlockID++;
    		OpenMPStatementIDPairing.put(n, uniqueTaskBlockID);
    	} else {
    		uniqueTaskBlockID = OpenMPStatementIDPairing.get(n);
    	}
    	
    	TaskCodeClassBuilder currentTClass = TaskCodeClassBuilder.create(n, this.currentMethodIsStatic, this, prefixTaskNameForTaskRegion + uniqueTaskBlockID);
    	printer.printLn("/*OpenMP Task block (#" + uniqueTaskBlockID + ") -- START */");
    	printer.printLn(currentTClass.className + " " + currentTClass.className + "_in = new "+ currentTClass.className + "();");
    	DataClausesHandler.processDataClausesBeforeTaskClassInvocation(currentTClass, printer);
    	printer.printLn("if (PjRuntime.currentThreadInParallelRegion()) {");
    	printer.indent();
    	printer.printLn();
    	printer.unindent();
    	printer.printLn("} else {");
    	printer.printLn("	" + currentTClass.className + "_in.run();");
    	printer.printLn("}");
     	DataClausesHandler.processDataClausesAfterTaskClassInvocation(currentTClass, printer);
    	printer.printLn("/*OpenMP Task block (#" + uniqueTaskBlockID + ") -- END */");
    	
    	this.PrinterForAuxiliaryClasses.printLn(currentTClass.getSource());
	}

	@Override
	public void visit(OmpTaskwaitDirective n, SourcePrinter printer) {
		// TODO Auto-generated method stub
		
	}
	
    public void visit(OmpBarrierDirective n, SourcePrinter printer){
    	printer.printLn("PjRuntime.setBarrier();");
    }
    public void visit(OmpFlushDirective n, SourcePrinter printer){
    	printer.printLn("PjRuntime.flushMemory();");
    }

    public void visit(OmpFreeguiConstruct n, SourcePrinter printer){
    	throw new RuntimeException("OmpFreeguiConstruct should be normalised as OmpParallelConstruct with freegui property");
    }

    public void visit(OmpGuiConstruct n, SourcePrinter printer){
    	//get current OmpParallelConstruct's scopeinfo from symbolTable
    	n.scope = this.symbolTable.getScopeOfNode(n);
    	
    	int uniqueGuiCodeID = nextGuiCodeID++;
    	if (OpenMPStatementIDPairing.get(n) == null) {
    		uniqueGuiCodeID = nextOpenMPRegionUniqueID++;
    		OpenMPStatementIDPairing.put(n, uniqueGuiCodeID);
    	} else {
    		uniqueGuiCodeID = OpenMPStatementIDPairing.get(n);
    	}

    	GuiCodeClassBuilder currentGuiCode = new GuiCodeClassBuilder(n, this);
    	currentGuiCode.guiName = prefixTaskNameForGuiCode + uniqueGuiCodeID;
  	
    	printer.printLn("//#BEGIN GUI execution block");
    	printer.printLn("if (SwingUtilities.isEventDispatchThread()) {");
    	printer.indent();
    	n.getStatement().accept(this, printer);
    	printer.unindent();
    	printer.printLn("}");
    	printer.printLn("else {");
    	printer.indent();
    	printer.printLn(currentGuiCode.getSource());
    	printer.printLn("}");
    	printer.printLn("//#END GUI execution block");
    }
    
	public void visit(OmpCopyprivateDataClause n, SourcePrinter arg) {
		throw new RuntimeException("copyprivate Clause should not be visited by PyjamaToJavaVisitor.");
	}

    public void visit(OmpDataClause n, SourcePrinter arg) {
    	throw new RuntimeException("OpenMPStatement: This abstract class should not appear.");
	}
	
	public void visit(OmpDefaultDataClause n, SourcePrinter arg) {
		throw new RuntimeException("default Clause should not be visited by PyjamaToJavaVisitor.");
	}

	public void visit(OmpIfClause n, SourcePrinter arg) {
		throw new RuntimeException("if Clause should not be visited by PyjamaToJavaVisitor.");
	}

	public void visit(OmpLastprivateDataClause n, SourcePrinter arg) {
		throw new RuntimeException("lastprivate Clause should not be visited by PyjamaToJavaVisitor.");
	}

	public void visit(OmpNumthreadsClause n, SourcePrinter arg) {
		throw new RuntimeException("num_threads Clause should not be visited by PyjamaToJavaVisitor.");
	}

	public void visit(OmpPrivateDataClause n, SourcePrinter arg) {
		throw new RuntimeException("private Clause should not be visited by PyjamaToJavaVisitor.");
	}

	public void visit(OmpReductionDataClause n, SourcePrinter arg) {
		throw new RuntimeException("reduction Clause should not be visited by PyjamaToJavaVisitor.");
	}
	@Override
	public void visit(OmpReductionOperator n, SourcePrinter arg) {
		throw new RuntimeException("reduction Operator should not be visited by PyjamaToJavaVisitor.");
	}

	public void visit(OmpScheduleClause n, SourcePrinter arg) {
		throw new RuntimeException("schedule Clause should not be visited by PyjamaToJavaVisitor.");
	}

	public void visit(OmpSectionConstruct n, SourcePrinter arg) {
		throw new RuntimeException("//#omp section: This should have been normalised.");
		// --------------------------- Normalised --------------------//
	}

	public void visit(OmpSharedDataClause n, SourcePrinter arg) {
		throw new RuntimeException("shared Clause should not be visited by PyjamaToJavaVisitor.");
	}

	public void visit(OpenMPStatement n, SourcePrinter arg) {
		throw new RuntimeException("OpenMPStatement: This abstract class should not appear.");	
	}
	
	public void visit(OmpNeglectExceptionClause n, SourcePrinter arg) {
		throw new RuntimeException("neglect_exception Clause should not be visited by PyjamaToJavaVisitor.");
	}
	

	public void visit(OmpCancellationPointDirective n, SourcePrinter printer) {
		if (n.getRegion() == OmpCancellationPointDirective.Region.Parallel) {
			printer.printLn("PjRuntime.checkParallelCancellationPoint();");
		} else if (n.getRegion() == OmpCancellationPointDirective.Region.For) {	
			printer.printLn("PjRuntime.checkWorksharingCancellationPoint();");
		} else if (n.getRegion() == OmpCancellationPointDirective.Region.Sections) {
			printer.printLn("PjRuntime.checkWorksharingCancellationPoint();");
		} else if (n.getRegion() == OmpCancellationPointDirective.Region.Taskgroup) {
			throw new RuntimeException("Pyjama does not support omp task yet!");
		}
	}

	public void visit(OmpCancelDirective n, SourcePrinter printer) {
		if (n.getRegion() == OmpCancelDirective.Region.Parallel) {
			if (n.getThreadAffiliate() == OmpCancelDirective.ThreadAffiliate.Global) {
				printer.print("throw new pj.pr.exceptions.OmpParallelRegionGlobalCancellationException(");
				if (null != n.getException()) {
					printer.print(n.getException());
				}
				printer.printLn(");");
			} else if (n.getThreadAffiliate() == OmpCancelDirective.ThreadAffiliate.Local) {
				printer.printLn("throw new pj.pr.exceptions.OmpParallelRegionLocalCancellationException(");
				if (null != n.getException()) {
					printer.print(n.getException());
				}
				printer.printLn(");");
			}

		} else if (n.getRegion() == OmpCancelDirective.Region.For || n.getRegion() == OmpCancelDirective.Region.Sections){
			if (n.getThreadAffiliate() == OmpCancelDirective.ThreadAffiliate.Global) {
				printer.printLn("throw new pj.pr.exceptions.OmpWorksharingGlobalCancellationException(");
				if (null != n.getException()) {
					printer.print(n.getException());
				}
				printer.printLn(");");
			} else if (n.getThreadAffiliate() == OmpCancelDirective.ThreadAffiliate.Local) {
				printer.printLn("throw new pj.pr.exceptions.OmpWorksharingLocalCancellationException(");
				if (null != n.getException()) {
					printer.print(n.getException());
				}
				printer.printLn(");");
			}
		} else if (n.getRegion() == OmpCancelDirective.Region.Taskgroup) {
			throw new RuntimeException("Pyjama does not support omp task yet!");
		}
	}
	
	public void visit(OmpTargetConstruct n, SourcePrinter printer) {
		//return if current visiting is in a state-machine building mode.
		boolean stateMachineBuildingMode = this.stateMachineVisitingMode.peek();
		
		//if current target block contains await, the indicate the compiler, the inside visiting should also visited by a state machine builder.
		if (n.containAwait()) {
			this.stateMachineVisitingMode.push(true);
		} else {
			this.stateMachineVisitingMode.push(false);
		}
		
	 	//get current OmpTargetConstruct's scope info from symbolTable
		n.scope = this.symbolTable.getScopeOfNode(n);
		n.processAllReachableVariablesIfNecessary();
    	    	
		int uniqueTargetBlockID = -1;
		if (OpenMPStatementIDPairing.get(n) == null) {
			uniqueTargetBlockID = nextTargetBlockID++;
			OpenMPStatementIDPairing.put(n, uniqueTargetBlockID);
		} else {
			uniqueTargetBlockID = OpenMPStatementIDPairing.get(n);
		}

		TargetTaskCodeClassBuilder currentTTClass = TargetTaskCodeClassBuilder.create(n, this.currentMethodIsStatic, this,
														prefixTaskNameForTargetTaskRegion + uniqueTargetBlockID, n.containAwait());
		
		printer.printLn("/*OpenMP Target region (#" + uniqueTargetBlockID + ") -- START */");
				
		if (stateMachineBuildingMode) {
			printer.printLn(currentTTClass.className + "_in = new "+ currentTTClass.className + "();");
		} else {			
			printer.printLn(currentTTClass.className + " " + currentTTClass.className + "_in = new "+ currentTTClass.className + "();");
		}
		DataClausesHandler.processDataClausesBeforeTTClassInvocation(currentTTClass, printer);
		this.PrinterForAsyncMethodStateMachineBuilder.printLn("private " + currentTTClass.className + " " + currentTTClass.className + "_in;");
		this.PrinterForAsyncTargetTaskStateMachineBuilder.printLn("private " + currentTTClass.className + " " + currentTTClass.className + "_in;");
		
		printer.printLn("if (PjRuntime.currentThreadIsTheTarget(\"" + n.getTargetName() + "\")) {");
		printer.indent();
		/*
		 * If current thread is already the target, we needn't submit the target task.
		 * Instead, we execute the target task in current thread.
		 */
		printer.printLn(currentTTClass.className + "_in.run();");
		DataClausesHandler.processDataClausesAfterTTClassInvocation(currentTTClass, printer);
		printer.unindent();
		printer.printLn("} else {");
		printer.indent();
		//If this is a state machine building mode, we set completion call back function of current target task.
		if (n.isAwait() && stateMachineBuildingMode) {
			printer.printLn(currentTTClass.className + "_in.setOnCompleteCall(this, PjRuntime.getVirtualTargetOfCurrentThread());");
		}
		printer.printLn("PjRuntime.submitTask(Thread.currentThread(), \"" + n.getTargetName() + "\", " + currentTTClass.className + "_in);");

		if (n.isSync()) {
			/*
			 * If default policy is applied, the encountering thread waits until the target block is finished. 
			 */
			printer.printLn("PjRuntime.waitTaskTillFinish(" + currentTTClass.className + "_in);");
			DataClausesHandler.processDataClausesAfterTTClassInvocation(currentTTClass, printer);
		} else if (n.isAwait()) {
			/*
			 * If await is applied, the current thread gives up current function execution, backs when target
			 * block is finished. For current implementation, we simply adopt an IHP (Irrelevant Handling Processing).
			 */
			if (!stateMachineBuildingMode) {
				/*
				 * In normal method mode, we simply use IHP, essentially it will do a busy waiting in current implementation.
				 */
				printer.printLn("PjRuntime.IrrelevantHandlingProcessing(" + currentTTClass.className + "_in);");
			} else if (stateMachineBuildingMode){
				printer.printLn("if (false == PjRuntime.checkFinish(" + currentTTClass.className + "_in))  {");
				printer.indent();
				printer.printLn("this.OMP_state++;");
				printer.printLn("return null;");
				printer.unindent();
				printer.printLn("}");
			}
		} else if (n.isNoWait()) {
			/*
			 * We safely do nothing because we need not care about nowait the finish of the target block.
			 */
		}
		printer.unindent();
		printer.printLn("}");
		
		if (n.isTaskAs()) {
			storeTargetClassNameByTaskName(n.getTaskName(), currentTTClass);
			printer.printLn("PjRuntime.storeTargetHandlerByName(" + currentTTClass.className + "_in, \"" + n.getTaskName() + "\");");
		}
		
		if (n.isAwait() && stateMachineBuildingMode) {
			printer.printLn("this.OMP_state++;");
		}
		printer.printLn("/*OpenMP Target region (#" + uniqueTargetBlockID + ") -- END */");
		
		//---Print Auxilary class
		this.PrinterForAuxiliaryClasses.printLn(currentTTClass.getSource());
		
		//---pop visiting mode.
		this.stateMachineVisitingMode.pop();
	}
	    
	@Override
	public void visit(OmpWaitDirective n, SourcePrinter printer) {
		printer.printLn("PjRuntime.waitTargetBlocksWithTaskNameUntilFinish(\"" + n.getTaskName() + "\");");
		Set<TargetTaskCodeClassBuilder> targetBuilders = getTargetClassBuilders(n.getTaskName());
		for (TargetTaskCodeClassBuilder targetBuilder: targetBuilders) {
			DataClausesHandler.processDataClausesAfterTTClassInvocation(targetBuilder, printer);
		}
	}
	
	@Override
	public void visit(OmpAwaitConstruct n, SourcePrinter printer) {
		/* For an async function, the prototype of this function still call the await block synchronously;
		 * So, directly visit this block. The states are used in state machine class.
		 */
		n.getBody().accept(this, this.CodePrinter);
		/* The states should be generated in favor of state machine class building. However, this type of 
		 * visiting is implemented by AsyncFunctionCallSubstitutionVisitor visitor.
		 */
	}
	
	@Override
	public void visit(OmpAwaitFunctionCallDeclaration n, SourcePrinter printer) {
		throw new RuntimeException("OmpAwaitFunctionCallDeclaration should not be visited by PyjamaToJavaVisitor.");
	}
	
	//OpenMP add END*********************************************************************************OpenMP add END//
	   public void visit(CompilationUnit n, SourcePrinter printer) {
		   //print the compiler information at the beginning of the file.
		   this.CodePrinter.printLn("//Pyjama compiler version:" + pj.Version.getCompilerVersion());
	        if (n.getPackage() != null) {
	            n.getPackage().accept(this, this.CodePrinter);
	        }
	        if (n.getImports() != null) {
	            for (ImportDeclaration i : n.getImports()) {
	                i.accept(this, this.CodePrinter);
	            }
	            this.CodePrinter.printLn();
	        }
	        this.CodePrinter.printLn(this.printRuntimeImports());
	        if (n.getTypes() != null) {
	            for (Iterator<TypeDeclaration> i = n.getTypes().iterator(); i.hasNext();) {
	                i.next().accept(this, this.CodePrinter);
	                this.CodePrinter.printLn();
	                if (i.hasNext()) {
	                	this.CodePrinter.printLn();
	                }
	            }
	        }
	    }

	    public void visit(PackageDeclaration n, SourcePrinter printer) {
	        printAnnotations(n.getAnnotations(), printer);
	        printer.print("package ");
	        n.getName().accept(this, printer);
	        printer.printLn(";");
	        printer.printLn();
	    }

	    public void visit(NameExpr n, SourcePrinter printer) {
	    	/*Xing added at 2014.8.3: Renaming variable which has private property 
	    	 * (firstprivate, lastprivate, reduction) for worksharing methods.
	    	 * conversion i => OMP_WoRkShArInG_PRIVATE_i; 
	    	 */
	    	if (currentPrivateVariableInOMPWorksharingBlock.keySet().contains(n.toString())) {
	    		printer.print(currentPrivateVariableInOMPWorksharingBlock.get(n.toString()));
	    	} else {
	    		printer.print(n.getName());
	    	}
	    }

	    public void visit(QualifiedNameExpr n, SourcePrinter printer) {
	        n.getQualifier().accept(this, printer);
	        printer.print(".");
	        printer.print(n.getName());
	    }

	    public void visit(ImportDeclaration n, SourcePrinter printer) {
	        printer.print("import ");
	        if (n.isStatic()) {
	            printer.print("static ");
	        }
	        n.getName().accept(this, printer);
	        if (n.isAsterisk()) {
	            printer.print(".*");
	        }
	        printer.printLn(";");
	    }

	    public void visit(ClassOrInterfaceDeclaration n, SourcePrinter printer) {
	        printJavadoc(n.getJavaDoc(), printer);
	        printMemberAnnotations(n.getAnnotations(), printer);
	        printModifiers(n.getModifiers(), printer);

	        if (n.isInterface()) {
	            printer.print("interface ");
	        } else {
	            printer.print("class ");
	        }

	        printer.print(n.getName());

	        printTypeParameters(n.getTypeParameters(), printer);

	        if (n.getExtends() != null) {
	            printer.print(" extends ");
	            for (Iterator<ClassOrInterfaceType> i = n.getExtends().iterator(); i.hasNext();) {
	                ClassOrInterfaceType c = i.next();
	                c.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	        }

	        if (n.getImplements() != null) {
	            printer.print(" implements ");
	            for (Iterator<ClassOrInterfaceType> i = n.getImplements().iterator(); i.hasNext();) {
	                ClassOrInterfaceType c = i.next();
	                c.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	        }

	        printer.printLn(" {");
	        printer.indent();
	        if (n.getMembers() != null) {
	            printMembers(n.getMembers(), printer);
	        }

	        printer.unindent();
	        printer.print("}");
	    }

	    public void visit(EmptyTypeDeclaration n, SourcePrinter printer) {
	        printJavadoc(n.getJavaDoc(), printer);
	        printer.print(";");
	    }

	    public void visit(JavadocComment n, SourcePrinter printer) {
	        printer.print("/**");
	        printer.print(n.getContent());
	        printer.printLn("*/");
	    }

	    public void visit(ClassOrInterfaceType n, SourcePrinter printer) {
	        if (n.getScope() != null) {
	            n.getScope().accept(this, printer);
	            printer.print(".");
	        }
	        printer.print(n.getName());
	        printTypeArgs(n.getTypeArgs(), printer);
	    }

	    public void visit(TypeParameter n, SourcePrinter printer) {
	        printer.print(n.getName());
	        if (n.getTypeBound() != null) {
	            printer.print(" extends ");
	            for (Iterator<ClassOrInterfaceType> i = n.getTypeBound().iterator(); i.hasNext();) {
	                ClassOrInterfaceType c = i.next();
	                c.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(" & ");
	                }
	            }
	        }
	    }

	    public void visit(PrimitiveType n, SourcePrinter printer) {
	        switch (n.getType()) {
	            case Boolean:
	                printer.print("boolean");
	                break;
	            case Byte:
	                printer.print("byte");
	                break;
	            case Char:
	                printer.print("char");
	                break;
	            case Double:
	                printer.print("double");
	                break;
	            case Float:
	                printer.print("float");
	                break;
	            case Int:
	                printer.print("int");
	                break;
	            case Long:
	                printer.print("long");
	                break;
	            case Short:
	                printer.print("short");
	                break;
	        }
	    }

	    public void visit(ReferenceType n, SourcePrinter printer) {
	        n.getType().accept(this, printer);
	        for (int i = 0; i < n.getArrayCount(); i++) {
	            printer.print("[]");
	        }
	    }

	    public void visit(WildcardType n, SourcePrinter printer) {
	        printer.print("?");
	        if (n.getExtends() != null) {
	            printer.print(" extends ");
	            n.getExtends().accept(this, printer);
	        }
	        if (n.getSuper() != null) {
	            printer.print(" super ");
	            n.getSuper().accept(this, printer);
	        }
	    }

	    public void visit(FieldDeclaration n, SourcePrinter printer) {
	        printJavadoc(n.getJavaDoc(), printer);
	        printMemberAnnotations(n.getAnnotations(), printer);
	        printModifiers(n.getModifiers(), printer);
	        n.getType().accept(this, printer);
	        //Xing add code at 2014.7.29 BEGIN
	        /*this code snippet intends force initialize variables in declaration expression.
	         * The goal is solving uninitalization problem for parallel code generation.
	         */
	        currentVarDeclarationType  = n.getType();
	        //Xing add code at 2014.7.29 END
	        
	        printer.print(" ");
	        for (Iterator<VariableDeclarator> i = n.getVariables().iterator(); i.hasNext();) {
	            VariableDeclarator var = i.next();
	            var.accept(this, printer);
	            if (i.hasNext()) {
	                printer.print(", ");
	            }
	        }

	        printer.print(";");
	    }

	    public void visit(VariableDeclarator n, SourcePrinter printer) {
	        n.getId().accept(this, printer);
	        if (n.getInit() != null) {
	            printer.print(" = ");
	            n.getInit().accept(this, printer);
	        } else if (!this.needNotVarInit){
	        	printer.print(" = ");
	        	printer.print(DataClauseHandlerUtils.getDefaultValuesForPrimitiveType(currentVarDeclarationType.toString()));
	        }
	    }

	    public void visit(VariableDeclaratorId n, SourcePrinter printer) {
	        printer.print(n.getName());
	        for (int i = 0; i < n.getArrayCount(); i++) {
	            printer.print("[]");
	        }
	    }

	    public void visit(ArrayInitializerExpr n, SourcePrinter printer) {
	        printer.print("{");
	        if (n.getValues() != null) {
	            printer.print(" ");
	            for (Iterator<Expression> i = n.getValues().iterator(); i.hasNext();) {
	                Expression expr = i.next();
	                expr.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	            printer.print(" ");
	        }
	        printer.print("}");
	    }

	    public void visit(VoidType n, SourcePrinter printer) {
	        printer.print("void");
	    }

	    public void visit(ArrayAccessExpr n, SourcePrinter printer) {
	        n.getName().accept(this, printer);
	        printer.print("[");
	        n.getIndex().accept(this, printer);
	        printer.print("]");
	    }

	    public void visit(ArrayCreationExpr n, SourcePrinter printer) {
	        printer.print("new ");
	        n.getType().accept(this, printer);

	        if (n.getDimensions() != null) {
	            for (Expression dim : n.getDimensions()) {
	                printer.print("[");
	                dim.accept(this, printer);
	                printer.print("]");
	            }
	            for (int i = 0; i < n.getArrayCount(); i++) {
	                printer.print("[]");
	            }
	        } else {
	            for (int i = 0; i < n.getArrayCount(); i++) {
	                printer.print("[]");
	            }
	            printer.print(" ");
	            n.getInitializer().accept(this, printer);
	        }
	    }

	    public void visit(AssignExpr n, SourcePrinter printer) {
	        n.getTarget().accept(this, printer);
	        printer.print(" ");
	        switch (n.getOperator()) {
	            case assign:
	                printer.print("=");
	                break;
	            case and:
	                printer.print("&=");
	                break;
	            case or:
	                printer.print("|=");
	                break;
	            case xor:
	                printer.print("^=");
	                break;
	            case plus:
	                printer.print("+=");
	                break;
	            case minus:
	                printer.print("-=");
	                break;
	            case rem:
	                printer.print("%=");
	                break;
	            case slash:
	                printer.print("/=");
	                break;
	            case star:
	                printer.print("*=");
	                break;
	            case lShift:
	                printer.print("<<=");
	                break;
	            case rSignedShift:
	                printer.print(">>=");
	                break;
	            case rUnsignedShift:
	                printer.print(">>>=");
	                break;
	        }
	        printer.print(" ");
	        n.getValue().accept(this, printer);
	    }

	    public void visit(BinaryExpr n, SourcePrinter printer) {
	        n.getLeft().accept(this, printer);
	        printer.print(" ");
	        switch (n.getOperator()) {
	            case or:
	                printer.print("||");
	                break;
	            case and:
	                printer.print("&&");
	                break;
	            case binOr:
	                printer.print("|");
	                break;
	            case binAnd:
	                printer.print("&");
	                break;
	            case xor:
	                printer.print("^");
	                break;
	            case equals:
	                printer.print("==");
	                break;
	            case notEquals:
	                printer.print("!=");
	                break;
	            case less:
	                printer.print("<");
	                break;
	            case greater:
	                printer.print(">");
	                break;
	            case lessEquals:
	                printer.print("<=");
	                break;
	            case greaterEquals:
	                printer.print(">=");
	                break;
	            case lShift:
	                printer.print("<<");
	                break;
	            case rSignedShift:
	                printer.print(">>");
	                break;
	            case rUnsignedShift:
	                printer.print(">>>");
	                break;
	            case plus:
	                printer.print("+");
	                break;
	            case minus:
	                printer.print("-");
	                break;
	            case times:
	                printer.print("*");
	                break;
	            case divide:
	                printer.print("/");
	                break;
	            case remainder:
	                printer.print("%");
	                break;
	        }
	        printer.print(" ");
	        n.getRight().accept(this, printer);
	    }

	    public void visit(CastExpr n, SourcePrinter printer) {
	        printer.print("(");
	        n.getType().accept(this, printer);
	        printer.print(") ");
	        n.getExpr().accept(this, printer);
	    }

	    public void visit(ClassExpr n, SourcePrinter printer) {
	        n.getType().accept(this, printer);
	        printer.print(".class");
	    }

	    public void visit(ConditionalExpr n, SourcePrinter printer) {
	        n.getCondition().accept(this, printer);
	        printer.print(" ? ");
	        n.getThenExpr().accept(this, printer);
	        printer.print(" : ");
	        n.getElseExpr().accept(this, printer);
	    }

	    public void visit(EnclosedExpr n, SourcePrinter printer) {
	        printer.print("(");
	        n.getInner().accept(this, printer);
	        printer.print(")");
	    }

	    public void visit(FieldAccessExpr n, SourcePrinter printer) {
	        n.getScope().accept(this, printer);
	        printer.print(".");
	        printer.print(n.getField());
	    }

	    public void visit(InstanceOfExpr n, SourcePrinter printer) {
	        n.getExpr().accept(this, printer);
	        printer.print(" instanceof ");
	        n.getType().accept(this, printer);
	    }

	    public void visit(CharLiteralExpr n, SourcePrinter printer) {
	        printer.print("'");
	        printer.print(n.getValue());
	        printer.print("'");
	    }

	    public void visit(DoubleLiteralExpr n, SourcePrinter printer) {
	        printer.print(n.getValue());
	    }

	    public void visit(IntegerLiteralExpr n, SourcePrinter printer) {
	        printer.print(n.getValue());
	    }

	    public void visit(LongLiteralExpr n, SourcePrinter printer) {
	        printer.print(n.getValue());
	    }

	    public void visit(IntegerLiteralMinValueExpr n, SourcePrinter printer) {
	        printer.print(n.getValue());
	    }

	    public void visit(LongLiteralMinValueExpr n, SourcePrinter printer) {
	        printer.print(n.getValue());
	    }

	    public void visit(StringLiteralExpr n, SourcePrinter printer) {
	        printer.print("\"");
	        printer.print(n.getValue());
	        printer.print("\"");
	    }

	    public void visit(BooleanLiteralExpr n, SourcePrinter printer) {
	        printer.print(String.valueOf(n.getValue()));
	    }

	    public void visit(NullLiteralExpr n, SourcePrinter printer) {
	        printer.print("null");
	    }

	    public void visit(ThisExpr n, SourcePrinter printer) {
	        if (n.getClassExpr() != null) {
	            n.getClassExpr().accept(this, printer);
	            printer.print(".");
	        }
	        printer.print("this");
	    }

	    public void visit(SuperExpr n, SourcePrinter printer) {
	        if (n.getClassExpr() != null) {
	            n.getClassExpr().accept(this, printer);
	            printer.print(".");
	        }
	        printer.print("super");
	    }

	    public void visit(MethodCallExpr n, SourcePrinter printer) {
	        if (n.getScope() != null) {
	            n.getScope().accept(this, printer);
	            printer.print(".");
	        }
	        printTypeArgs(n.getTypeArgs(), printer);
	        printer.print(n.getName());
	        printArguments(n.getArgs(), printer);
	    }

	    public void visit(ObjectCreationExpr n, SourcePrinter printer) {
	        if (n.getScope() != null) {
	            n.getScope().accept(this, printer);
	            printer.print(".");
	        }

	        printer.print("new ");

	        printTypeArgs(n.getTypeArgs(), printer);
	        n.getType().accept(this, printer);

	        printArguments(n.getArgs(), printer);

	        if (n.getAnonymousClassBody() != null) {
	            printer.printLn(" {");
	            printer.indent();
	            printMembers(n.getAnonymousClassBody(), printer);
	            printer.unindent();
	            printer.print("}");
	        }
	    }

	    public void visit(UnaryExpr n, SourcePrinter printer) {
	        switch (n.getOperator()) {
	            case positive:
	                printer.print("+");
	                break;
	            case negative:
	                printer.print("-");
	                break;
	            case inverse:
	                printer.print("~");
	                break;
	            case not:
	                printer.print("!");
	                break;
	            case preIncrement:
	                printer.print("++");
	                break;
	            case preDecrement:
	                printer.print("--");
	                break;
	            default:
	            	break;
	        }

	        n.getExpr().accept(this, printer);

	        switch (n.getOperator()) {
	            case posIncrement:
	                printer.print("++");
	                break;
	            case posDecrement:
	                printer.print("--");
	                break;
	            default:
	            	break;
	        }
	    }

	    public void visit(ConstructorDeclaration n, SourcePrinter printer) {
	        printJavadoc(n.getJavaDoc(), printer);
	        printMemberAnnotations(n.getAnnotations(), printer);
	        printModifiers(n.getModifiers(), printer);
	        //Xing added to keep track of current constructor's statements
	        this.currentMethodOrConstructorStmts = new ArrayList<Statement>();
	        this.currentMethodOrConstructorStmts = n.getBlock().getStmts();
	        //Xing added
	        printTypeParameters(n.getTypeParameters(), printer);
	        if (n.getTypeParameters() != null) {
	            printer.print(" ");
	        }
	        printer.print(n.getName());

	        printer.print("(");
	        if (n.getParameters() != null) {
	            for (Iterator<Parameter> i = n.getParameters().iterator(); i.hasNext();) {
	                Parameter p = i.next();
	                p.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	        }
	        printer.print(")");

	        if (n.getThrows() != null) {
	            printer.print(" throws ");
	            for (Iterator<NameExpr> i = n.getThrows().iterator(); i.hasNext();) {
	                NameExpr name = i.next();
	                name.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	        }
	        printer.print(" ");
	        n.getBlock().accept(this, printer);
	        //Xing added 
	        this.currentMethodOrConstructorStmts = null;
	        //Xing added
	    }

	    public void visit(MethodDeclaration n, SourcePrinter printer) {
	        printJavadoc(n.getJavaDoc(), printer);
	        printMemberAnnotations(n.getAnnotations(), printer);
	        printModifiers(n.getModifiers(), printer);

	        this.currentMethodOrConstructorStmts = new ArrayList<Statement>();
	        if (n.getBody() != null) {
	        	/*
	        	 * We do null pointer check because it is possible current method
	        	 * does not have body (e.g. abstract method); or current method 
	        	 * does not have any statement (e.g.empty method).
	        	 */
	        	if (n.getBody().getStmts() != null) {
	    	        this.currentMethodOrConstructorStmts = n.getBody().getStmts();
	        	}
	        }

	        //Xing added for checking current method is static or not
	        if (ModifierSet.isStatic(n.getModifiers())) {
	            this.currentMethodIsStatic = true;
	        }
	        else {
	        	this.currentMethodIsStatic = false;
	        }
	        //Xing added for checking if current method should be annotated as an async method.
	        if (!n.isAsyncMethod() && n.containAwait()) {
	            throw new RuntimeException("Pyjama parsing error: Using the await block within a non-async method(" + n.getBeginLine() + ":" + n.getBeginColumn() + ").");
	        }
	        
	        this.stateMachineVisitingMode.push(false);

	        printTypeParameters(n.getTypeParameters(), printer);
	        if (n.getTypeParameters() != null) {
	            printer.print(" ");
	        }

	        n.getType().accept(this, printer);
	        printer.print(" ");
	        printer.print(n.getName());

	        printer.print("(");
	        if (n.getParameters() != null) {
	            for (Iterator<Parameter> i = n.getParameters().iterator(); i.hasNext();) {
	                Parameter p = i.next();
	                p.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	        }
	        printer.print(")");

	        for (int i = 0; i < n.getArrayCount(); i++) {
	            printer.print("[]");
	        }

	        if (n.getThrows() != null) {
	            printer.print(" throws ");
	            for (Iterator<NameExpr> i = n.getThrows().iterator(); i.hasNext();) {
	                NameExpr name = i.next();
	                name.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	        }
	        if (n.getBody() == null) {
	            printer.print(";");
	        } else {
		        printer.print(" ");
				printer.print("{");
				n.getBody().accept(this, printer);
				printer.printLn();
				printer.print("}");
	        }
	        
	        this.stateMachineVisitingMode.pop();
	        /*Xing added to print Auxiliary parallel region classes
	         *if current method has PR regions or the current method is async.
	         */
	        if (n.isAsyncMethod()) {
	        	this.stateMachineVisitingMode.push(true);
				StateMachineClassBuilder stateMachineMethodBuilder = new AsyncMethodStateMachineClassBuilder(n, this.currentMethodIsStatic, this, this.PrinterForAsyncMethodStateMachineBuilder.getSource());
				this.PrinterForAuxiliaryClasses.printLn(stateMachineMethodBuilder.getSource());
				this.PrinterForAsyncMethodStateMachineBuilder.clear();
				this.stateMachineVisitingMode.pop();
	        }
	        
			printer.printLn(this.PrinterForAuxiliaryClasses.getSource());
			this.PrinterForAuxiliaryClasses.clear();
			
			// reset flag to default, for next method visiting
			this.currentMethodOrConstructorStmts = null;
			///Xing added end
			
	    }

	    public void visit(Parameter n, SourcePrinter printer) {
	        printAnnotations(n.getAnnotations(), printer);
	        printModifiers(n.getModifiers(), printer);

	        n.getType().accept(this, printer);
	        if (n.isVarArgs()) {
	            printer.print("...");
	        }
	        printer.print(" ");
	        n.getId().accept(this, printer);
	    }

	    public void visit(ExplicitConstructorInvocationStmt n, SourcePrinter printer) {
	        if (n.isThis()) {
	            printTypeArgs(n.getTypeArgs(), printer);
	            printer.print("this");
	        } else {
	            if (n.getExpr() != null) {
	                n.getExpr().accept(this, printer);
	                printer.print(".");
	            }
	            printTypeArgs(n.getTypeArgs(), printer);
	            printer.print("super");
	        }
	        printArguments(n.getArgs(), printer);
	        printer.print(";");
	    }

	    public void visit(VariableDeclarationExpr n, SourcePrinter printer) {
	        printAnnotations(n.getAnnotations(), printer);
	        printModifiers(n.getModifiers(), printer);

	        n.getType().accept(this, printer);
	        //Xing add code at 2014.7.29 BEGIN
	        /*this code snippet intends force initialize variables in declaration expression.
	         * The goal is solving uninitalization problem for parallel code generation.
	         */
	        /*
	         * This cause another bugs: foreach loop local variable needn't to be initialised:
	         * however, this visitor will convert for(int i: list) => for(int i=0: list) 
	         */
	        currentVarDeclarationType  = n.getType();
	        //Xing add code at 2014.7.29 END
	        printer.print(" ");

	        for (Iterator<VariableDeclarator> i = n.getVars().iterator(); i.hasNext();) {
	            VariableDeclarator v = i.next();
	            v.accept(this, printer);
	            if (i.hasNext()) {
	                printer.print(", ");
	            }
	        }
	    }

	    public void visit(TypeDeclarationStmt n, SourcePrinter printer) {
	        n.getTypeDeclaration().accept(this, printer);
	    }

	    public void visit(AssertStmt n, SourcePrinter printer) {
	        printer.print("assert ");
	        n.getCheck().accept(this, printer);
	        if (n.getMessage() != null) {
	            printer.print(" : ");
	            n.getMessage().accept(this, printer);
	        }
	        printer.print(";");
	    }

	    public void visit(BlockStmt n, SourcePrinter printer) {
	        printer.printLn("{");
	        if (n.getStmts() != null) {
	            printer.indent();
	            for (Statement s : n.getStmts()) {
	                s.accept(this, printer);
	                printer.printLn();
	            }
	            printer.unindent();
	        }
	        printer.print("}");

	    }

	    public void visit(LabeledStmt n, SourcePrinter printer) {
	        printer.print(n.getLabel());
	        printer.print(": ");
	        n.getStmt().accept(this, printer);
	    }

	    public void visit(EmptyStmt n, SourcePrinter printer) {
	        printer.print(";");
	    }

	    public void visit(ExpressionStmt n, SourcePrinter printer) {
	        n.getExpression().accept(this, printer);
	        printer.print(";");
	    }

	    public void visit(SwitchStmt n, SourcePrinter printer) {
	        printer.print("switch(");
	        n.getSelector().accept(this, printer);
	        printer.printLn(") {");
	        if (n.getEntries() != null) {
	            printer.indent();
	            for (SwitchEntryStmt e : n.getEntries()) {
	                e.accept(this, printer);
	            }
	            printer.unindent();
	        }
	        printer.print("}");

	    }

	    public void visit(SwitchEntryStmt n, SourcePrinter printer) {
	        if (n.getLabel() != null) {
	            printer.print("case ");
	            n.getLabel().accept(this, printer);
	            printer.print(":");
	        } else {
	            printer.print("default:");
	        }
	        printer.printLn();
	        printer.indent();
	        if (n.getStmts() != null) {
	            for (Statement s : n.getStmts()) {
	                s.accept(this, printer);
	                printer.printLn();
	            }
	        }
	        printer.unindent();
	    }

	    public void visit(BreakStmt n, SourcePrinter printer) {
	        printer.print("break");
	        if (n.getId() != null) {
	            printer.print(" ");
	            printer.print(n.getId());
	        }
	        printer.print(";");
	    }

	    public void visit(ReturnStmt n, SourcePrinter printer) {
	        printer.print("return");
	        if (n.getExpr() != null) {
	            printer.print(" ");
	            n.getExpr().accept(this, printer);
	        }
	        printer.print(";");
	    }

	    public void visit(EnumDeclaration n, SourcePrinter printer) {
	        printJavadoc(n.getJavaDoc(), printer);
	        printMemberAnnotations(n.getAnnotations(), printer);
	        printModifiers(n.getModifiers(), printer);

	        printer.print("enum ");
	        printer.print(n.getName());

	        if (n.getImplements() != null) {
	            printer.print(" implements ");
	            for (Iterator<ClassOrInterfaceType> i = n.getImplements().iterator(); i.hasNext();) {
	                ClassOrInterfaceType c = i.next();
	                c.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	        }

	        printer.printLn(" {");
	        printer.indent();
	        if (n.getEntries() != null) {
	            printer.printLn();
	            for (Iterator<EnumConstantDeclaration> i = n.getEntries().iterator(); i.hasNext();) {
	                EnumConstantDeclaration e = i.next();
	                e.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	        }
	        if (n.getMembers() != null) {
	            printer.printLn(";");
	            printMembers(n.getMembers(), printer);
	        } else {
	            if (n.getEntries() != null) {
	                printer.printLn();
	            }
	        }
	        printer.unindent();
	        printer.print("}");
	    }

	    public void visit(EnumConstantDeclaration n, SourcePrinter printer) {
	        printJavadoc(n.getJavaDoc(), printer);
	        printMemberAnnotations(n.getAnnotations(), printer);
	        printer.print(n.getName());

	        if (n.getArgs() != null) {
	            printArguments(n.getArgs(), printer);
	        }

	        if (n.getClassBody() != null) {
	            printer.printLn(" {");
	            printer.indent();
	            printMembers(n.getClassBody(), printer);
	            printer.unindent();
	            printer.printLn("}");
	        }
	    }

	    public void visit(EmptyMemberDeclaration n, SourcePrinter printer) {
	        printJavadoc(n.getJavaDoc(), printer);
	        printer.print(";");
	    }

	    public void visit(InitializerDeclaration n, SourcePrinter printer) {
	        printJavadoc(n.getJavaDoc(), printer);
	        if (n.isStatic()) {
	            printer.print("static ");
	        }
	        n.getBlock().accept(this, printer);
	    }

	    public void visit(IfStmt n, SourcePrinter printer) {
	        printer.print("if (");
	        n.getCondition().accept(this, printer);
	        printer.print(") ");
	        n.getThenStmt().accept(this, printer);
	        if (n.getElseStmt() != null) {
	            printer.print(" else ");
	            n.getElseStmt().accept(this, printer);
	        }
	    }

	    public void visit(WhileStmt n, SourcePrinter printer) {
	        printer.print("while (");
	        n.getCondition().accept(this, printer);
	        printer.print(") ");
	        n.getBody().accept(this, printer);
	    }

	    public void visit(ContinueStmt n, SourcePrinter printer) {
	        printer.print("continue");
	        if (n.getId() != null) {
	            printer.print(" ");
	            printer.print(n.getId());
	        }
	        printer.print(";");
	    }

	    public void visit(DoStmt n, SourcePrinter printer) {
	        printer.print("do ");
	        n.getBody().accept(this, printer);
	        printer.print(" while (");
	        n.getCondition().accept(this, printer);
	        printer.print(");");
	    }

	    public void visit(ForeachStmt n, SourcePrinter printer) {
	        printer.print("for (");
	        //Xing added at 2014.10.27, fix init bug at foreach loop
	        this.needNotVarInit = true;
	        n.getVariable().accept(this, printer);
	        this.needNotVarInit = false;
	        printer.print(" : ");
	        n.getIterable().accept(this, printer);
	        printer.print(") ");
	        n.getBody().accept(this, printer);
	    }

	    public void visit(ForStmt n, SourcePrinter printer) {
	        printer.print("for (");
	        if (n.getInit() != null) {
	            for (Iterator<Expression> i = n.getInit().iterator(); i.hasNext();) {
	                Expression e = i.next();
	                e.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	        }
	        printer.print("; ");
	        if (n.getCompare() != null) {
	            n.getCompare().accept(this, printer);
	        }
	        printer.print("; ");
	        if (n.getUpdate() != null) {
	            for (Iterator<Expression> i = n.getUpdate().iterator(); i.hasNext();) {
	                Expression e = i.next();
	                e.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	        }
	        printer.print(") ");
	        n.getBody().accept(this, printer);
	    }

	    public void visit(ThrowStmt n, SourcePrinter printer) {
	        printer.print("throw ");
	        n.getExpr().accept(this, printer);
	        printer.print(";");
	    }

	    public void visit(SynchronizedStmt n, SourcePrinter printer) {
	        printer.print("synchronized (");
	        n.getExpr().accept(this, printer);
	        printer.print(") ");
	        n.getBlock().accept(this, printer);
	    }

	    public void visit(TryStmt n, SourcePrinter printer) {
	        printer.print("try ");
	        n.getTryBlock().accept(this, printer);
	        if (n.getCatchs() != null) {
	            for (CatchClause c : n.getCatchs()) {
	                c.accept(this, printer);
	            }
	        }
	        if (n.getFinallyBlock() != null) {
	            printer.print(" finally ");
	            n.getFinallyBlock().accept(this, printer);
	        }
	    }

	    public void visit(CatchClause n, SourcePrinter printer) {
	        printer.print(" catch (");
	        n.getExcept().accept(this, printer);
	        printer.print(") ");
	        n.getCatchBlock().accept(this, printer);

	    }

	    public void visit(AnnotationDeclaration n, SourcePrinter printer) {
	        printJavadoc(n.getJavaDoc(), printer);
	        printMemberAnnotations(n.getAnnotations(), printer);
	        printModifiers(n.getModifiers(), printer);

	        printer.print("@interface ");
	        printer.print(n.getName());
	        printer.printLn(" {");
	        printer.indent();
	        if (n.getMembers() != null) {
	            printMembers(n.getMembers(), printer);
	        }
	        printer.unindent();
	        printer.print("}");
	    }

	    public void visit(AnnotationMemberDeclaration n, SourcePrinter printer) {
	        printJavadoc(n.getJavaDoc(), printer);
	        printMemberAnnotations(n.getAnnotations(), printer);
	        printModifiers(n.getModifiers(), printer);

	        n.getType().accept(this, printer);
	        printer.print(" ");
	        printer.print(n.getName());
	        printer.print("()");
	        if (n.getDefaultValue() != null) {
	            printer.print(" default ");
	            n.getDefaultValue().accept(this, printer);
	        }
	        printer.print(";");
	    }

	    public void visit(MarkerAnnotationExpr n, SourcePrinter printer) {
	        printer.print("@");
	        n.getName().accept(this, printer);
	    }

	    public void visit(SingleMemberAnnotationExpr n, SourcePrinter printer) {
	        printer.print("@");
	        n.getName().accept(this, printer);
	        printer.print("(");
	        n.getMemberValue().accept(this, printer);
	        printer.print(")");
	    }

	    public void visit(NormalAnnotationExpr n, SourcePrinter printer) {
	        printer.print("@");
	        n.getName().accept(this, printer);
	        printer.print("(");
	        if (n.getPairs() != null) {
	            for (Iterator<MemberValuePair> i = n.getPairs().iterator(); i.hasNext();) {
	                MemberValuePair m = i.next();
	                m.accept(this, printer);
	                if (i.hasNext()) {
	                    printer.print(", ");
	                }
	            }
	        }
	        printer.print(")");
	    }

	    public void visit(MemberValuePair n, SourcePrinter printer) {
	        printer.print(n.getName());
	        printer.print(" = ");
	        n.getValue().accept(this, printer);
	    }

	    public void visit(LineComment n, SourcePrinter printer) {
	        printer.print("//");
	        printer.printLn(n.getContent());
	    }

	    public void visit(BlockComment n, SourcePrinter printer) {
	        printer.print("/*");
	        printer.print(n.getContent());
	        printer.printLn("*/");
	    }
	
	////////////////////PRIVATE METHODS   BEGIN///////////////////////////////
	private void printModifiers(int modifiers, SourcePrinter printer) {
        if (ModifierSet.isPrivate(modifiers)) {
            printer.print("private ");
        }
        if (ModifierSet.isProtected(modifiers)) {
            printer.print("protected ");
        }
        if (ModifierSet.isPublic(modifiers)) {
            printer.print("public ");
        }
        if (ModifierSet.isAbstract(modifiers)) {
            printer.print("abstract ");
        }
        if (ModifierSet.isStatic(modifiers)) {
            printer.print("static ");
        }
        if (ModifierSet.isFinal(modifiers)) {
            printer.print("final ");
        }
        if (ModifierSet.isNative(modifiers)) {
            printer.print("native ");
        }
        if (ModifierSet.isStrictfp(modifiers)) {
            printer.print("strictfp ");
        }
        if (ModifierSet.isSynchronized(modifiers)) {
            printer.print("synchronized ");
        }
        if (ModifierSet.isTransient(modifiers)) {
            printer.print("transient ");
        }
        if (ModifierSet.isVolatile(modifiers)) {
            printer.print("volatile ");
        }
    }

    private void printMembers(List<BodyDeclaration> members, SourcePrinter printer) {
        for (BodyDeclaration member : members) {
            printer.printLn();
            member.accept(this, printer);
            printer.printLn();
        }
    }

    private void printMemberAnnotations(List<AnnotationExpr> annotations, SourcePrinter printer) {
        if (annotations != null) {
            for (AnnotationExpr a : annotations) {
                a.accept(this, printer);
                printer.printLn();
            }
        }
    }

    private void printAnnotations(List<AnnotationExpr> annotations, SourcePrinter printer) {
        if (annotations != null) {
            for (AnnotationExpr a : annotations) {
                a.accept(this, printer);
                printer.print(" ");
            }
        }
    }

    private void printTypeArgs(List<pj.parser.ast.type.Type> args, SourcePrinter printer) {
        if (args != null) {
            printer.print("<");
            for (Iterator<pj.parser.ast.type.Type> i = args.iterator(); i.hasNext();) {
            	pj.parser.ast.type.Type t = i.next();
                t.accept(this, printer);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
            printer.print(">");
        }
    }

    private void printTypeParameters(List<TypeParameter> args, SourcePrinter printer) {
        if (args != null) {
            printer.print("<");
            for (Iterator<TypeParameter> i = args.iterator(); i.hasNext();) {
                TypeParameter t = i.next();
                t.accept(this, printer);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
            printer.print(">");
        }
    }

    private void printArguments(List<Expression> args, SourcePrinter printer) {
        printer.print("(");
        if (args != null) {
            for (Iterator<Expression> i = args.iterator(); i.hasNext();) {
                Expression e = i.next();
                e.accept(this, printer);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
        }
        printer.print(")");
    }

    private void printJavadoc(JavadocComment javadoc, SourcePrinter printer) {
        if (javadoc != null) {
            javadoc.accept(this, printer);
        }
    }
    
    private  String printRuntimeImports(){
    	SourcePrinter printer = new SourcePrinter();
    	printer.printLn("import pj.pr.*;");
    	printer.printLn("import pj.PjRuntime;");
    	printer.printLn("import pj.Pyjama;");
    	printer.printLn("import pi.*;");
    	printer.printLn("import java.util.concurrent.*;");
    	printer.printLn("import java.util.concurrent.atomic.AtomicBoolean;");
    	printer.printLn("import java.util.concurrent.atomic.AtomicInteger;");
    	printer.printLn("import java.util.concurrent.atomic.AtomicReference;");
    	printer.printLn("import java.util.concurrent.locks.ReentrantLock;");
    	printer.printLn("import java.lang.reflect.InvocationTargetException;");
    	printer.printLn("import pj.pr.exceptions.*;");
    	
    	return printer.getSource();
    }
    
    //---OpenMP Target construct visiting helper methods
    private void storeTargetClassNameByTaskName(String taskName, TargetTaskCodeClassBuilder targetClassBuilder) {
    	HashSet<TargetTaskCodeClassBuilder> targetBuilders = nameAsTargetBlocks.get(taskName);
    	if (null == targetBuilders) {
    		targetBuilders = new HashSet<TargetTaskCodeClassBuilder>();
    		nameAsTargetBlocks.put(taskName, targetBuilders);
    	}
    	targetBuilders.add(targetClassBuilder);
    }
    
    private HashSet<TargetTaskCodeClassBuilder> getTargetClassBuilders(String taskName) {
    	HashSet<TargetTaskCodeClassBuilder> targetBuilders = nameAsTargetBlocks.get(taskName);
    	if (null != targetBuilders) {
    		return targetBuilders;
    	} else {
    		//return empty list.
    		return new HashSet<TargetTaskCodeClassBuilder>();
    	}
    }
    
    ////////////////////PRIVATE METHODS END////////////////////
	public PyjamaToJavaVisitor(File file) {
		this.file = file;
		this.compilationFileName = this.file.getName().substring(0,
				this.file.getName().indexOf(PYJAMA_FILE_EXTENSION));
	}
	
	public SourcePrinter getPriter() {
		return this.CodePrinter;
	}
	
	public String getSource() {
		return CodePrinter.getSource();
	}
	
	public String getAuxiliaryClassesSource() {
		return this.PrinterForAuxiliaryClasses.getSource();
	}
	public void appendAuxiliaryClassesSource(String source) {
		this.PrinterForAuxiliaryClasses.printLn(source);
	}
	public SourcePrinter getPrinterForAsyncTargetTaskStateMachineBuilder() {
		return this.PrinterForAsyncTargetTaskStateMachineBuilder;
	}
	/********************************************************************************************************************************/
}