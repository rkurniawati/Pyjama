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

package pj.parser.ast.visitor.dataclausehandler;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.omp.OmpDataClause;
import pj.parser.ast.omp.OmpForConstruct;
import pj.parser.ast.omp.OmpGuiConstruct;
import pj.parser.ast.omp.OmpLastprivateDataClause;
import pj.parser.ast.omp.OmpParallelConstruct;
import pj.parser.ast.omp.OmpPrivateDataClause;
import pj.parser.ast.omp.OmpReductionDataClause;
import pj.parser.ast.omp.OmpReductionOperator;
import pj.parser.ast.stmt.BlockStmt;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.symbolscope.ScopeInfo;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.SymbolScopingVisitor;
import pj.parser.ast.visitor.constructwrappers.GuiCodeClassBuilder;
import pj.parser.ast.visitor.constructwrappers.ParallelRegionClassBuilder;
import pj.parser.ast.visitor.constructwrappers.TargetTaskCodeClassBuilder;
import pj.parser.ast.visitor.constructwrappers.TaskCodeClassBuilder;
import pj.parser.ast.visitor.constructwrappers.WorkShareBlockBuilder;

public class DataClausesHandler {
	/*
	 * set to true, to print debug messages
	 * 
	 * @see showErr(), showMsg()
	 */
	private static boolean mDebug = true;

	/*
	 * Commonly used error string
	 */
	private static final String STR_UNSUPPORTED_ON_PYJAMA = "Unsupported: The following is not supported on current version of Pyjama:";
	
	/*
	 * Prefix for worksharing private variables renaming, added by Xing on 2014.8.3
	 */
	private static final String WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX = "OMP_WoRkShArInG_PRIVATE_";
	/*
	 * Prefix for private(firstprivate), reduction, lastprivate variable declaration, add by Xing on 2016.7.16
	 */
	public static final String PRIVATE_VARIABLE_DECLARATION_PREFIX = "OMP_PRIVATE_";
	public static final String LASTPRIVATE_VARIABLE_DECLARATION_PREFIX = "OMP_LASTPRIVATE_";
	public static final String REDUCTION_VARIABLE_DECLARATION_PREFIX = "OMP_REDUCTION_";
	
	public static void processDataClausesBeforePRClassInvocation(ParallelRegionClassBuilder parallelWrapper, SourcePrinter printer) {
		List<OmpDataClause> dataClauseList = parallelWrapper.parallelConstruct.getDataClauseList();
		String classInstanceName = parallelWrapper.className + "_in";
		if (null == dataClauseList) {
			return;
		}
		
		for (OmpDataClause dataClause: dataClauseList) {
			switch (dataClause.DataClauseType()) {
			case Shared:
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					printer.printLn(classInstanceName + "." + varName + " = " + varName + ";");
					//e.g. ParallelRegion_0_in.sp = sp;
				}
				break;
			case Private:
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					printer.printLn(classInstanceName + "." + PRIVATE_VARIABLE_DECLARATION_PREFIX + varName + " = " + varName + ";");
					//e.g. ParallelRegion_0_in.OMP_PR_PRIVATE_sp = sp;
				}
				break;
			case Lastprivate:
				/*
				 * lastprivate variables needn't do anything before invocation
				 */
				break;
			case Reduction:
				for(Expression varExpression: ((OmpReductionDataClause)dataClause).getArgumentMap().keySet()) {
					String varName = varExpression.toString();
					printer.printLn(classInstanceName + "." + REDUCTION_VARIABLE_DECLARATION_PREFIX + varName + " = " + varName + ";");
					//e.g. ParallelRegion_0_in.sp = sp;
				}
				break;
			case Copyprivate:
				throw new RuntimeException(STR_UNSUPPORTED_ON_PYJAMA + "copyprivate clause");
			case Default:
				// do nothing.
				break;
			default:
				throw new RuntimeException("Find unexpected Data clause:" + dataClause.DataClauseType().toString());	
			}
		}
	}
	
	public static void processDataClausesAfterPRClassInvocation(ParallelRegionClassBuilder parallelWrapper, SourcePrinter printer) {
		OmpParallelConstruct parallelConstruct = parallelWrapper.parallelConstruct;
		List<OmpDataClause> dataClauseList = parallelConstruct.getDataClauseList();
		String classInstanceName = parallelWrapper.className + "_in";
		if (null == dataClauseList) {
			return;
		}
		
		for (OmpDataClause dataClause: dataClauseList) {
			switch (dataClause.DataClauseType()) {
			
			case Shared:
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					printer.printLn(varName + " = " + classInstanceName + "." + varName + ";");
					//e.g. sp = ParallelRegion_0_in.sp;
				}
				break;
				
			case Private:
				/*
				 * private variables needn't do anything after invocation
				 */
				break;
				
			case Lastprivate:
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					printer.printLn(varName + " = " + classInstanceName + "." + LASTPRIVATE_VARIABLE_DECLARATION_PREFIX + varName + ";");
				}
				break;
				
			case Reduction:
				for(Expression varExpression: ((OmpReductionDataClause)dataClause).getArgumentMap().keySet()) {
					String varName = varExpression.toString();
					printer.printLn(varName + " = " + classInstanceName + "." + REDUCTION_VARIABLE_DECLARATION_PREFIX + varName + ";");
					//e.g. sp = ParallelRegion_0_in.sp;
				}
				break;
				
			case Copyprivate:
				throw new RuntimeException(STR_UNSUPPORTED_ON_PYJAMA + "copyprivate clause");
			case Default:
				// do nothing.
				break;
			default:
				throw new RuntimeException("Find unexpected Data clause");	
			}
		}
	}
	
	public static void processDataClausesBeforeTTClassInvocation(TargetTaskCodeClassBuilder targetWrapper, SourcePrinter printer) {
		List<OmpDataClause> dataClauseList = targetWrapper.targetConstruct.getDataClauseList();
		String classInstanceName = targetWrapper.className + "_in";
		if (null == dataClauseList) {
			return;
		}
		
		for (OmpDataClause dataClause: dataClauseList) {
			switch (dataClause.DataClauseType()) {
			case Shared:
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					printer.printLn(classInstanceName + "." + varName + " = " + varName + ";");
					//e.g. TargetRegion_0_in.sp = sp;
				}
				break;
			case Private:
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					printer.printLn(classInstanceName + "." + varName + " = " + varName + ";");
					//e.g. TargetRegion_0_in.sp = sp;
				}
				break;
			default:
				throw new RuntimeException("Find unexpected Data clause:" + dataClause.DataClauseType().toString());	
			}
		}
	}
	
	public static void processDataClausesAfterTTClassInvocation(TargetTaskCodeClassBuilder targetWrapper, SourcePrinter printer) {
		List<OmpDataClause> dataClauseList = targetWrapper.targetConstruct.getDataClauseList();
		String classInstanceName = targetWrapper.className + "_in";
		if (null == dataClauseList) {
			return;
		}
		
		for (OmpDataClause dataClause: dataClauseList) {
			switch (dataClause.DataClauseType()) {
			case Shared:
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					printer.printLn(varName + " = " + classInstanceName + "." + varName + ";");
					//e.g. sp = TargetRegion_0_in.sp;
				}
				break;
				
			case Private:
				/*
				 * private variables needn't do anything after invocation
				 */
				break;
			default:
				throw new RuntimeException("Find unexpected Data clause:" + dataClause);	
			}
		}
	}
	
	public static void processDataClausesBeforeTaskClassInvocation(TaskCodeClassBuilder taskWrapper, SourcePrinter printer) {
		List<OmpDataClause> dataClauseList = taskWrapper.taskConstruct.getDataClauseList();
		String classInstanceName = taskWrapper.className + "_in";
		if (null == dataClauseList) {
			return;
		}
		
		for (OmpDataClause dataClause: dataClauseList) {
			switch (dataClause.DataClauseType()) {
			case Shared:
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					printer.printLn(classInstanceName + "." + varName + " = " + varName + ";");
					//e.g. TaskRegion_0_in.sp = sp;
				}
				break;
			case Private:
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					printer.printLn(classInstanceName + "." + varName + " = " + varName + ";");
					//e.g. TaskRegion_0_in.sp = sp;
				}
				break;
			default:
				throw new RuntimeException("Find unexpected Data clause:" + dataClause.DataClauseType().toString());	
			}
		}
	}
	
	public static void processDataClausesAfterTaskClassInvocation(TaskCodeClassBuilder taskWrapper, SourcePrinter printer) {
		List<OmpDataClause> dataClauseList = taskWrapper.taskConstruct.getDataClauseList();
		String classInstanceName = taskWrapper.className + "_in";
		if (null == dataClauseList) {
			return;
		}
		
		for (OmpDataClause dataClause: dataClauseList) {
			switch (dataClause.DataClauseType()) {
			case Shared:
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					printer.printLn(varName + " = " + classInstanceName + "." + varName + ";");
					//e.g. sp = TaskRegion_0_in.sp;
				}
				break;
				
			case Private:
				/*
				 * private variables needn't do anything after invocation
				 */
				break;
			default:
				throw new RuntimeException("Find unexpected Data clause:" + dataClause);	
			}
		}
	}
		
	public static HashMap<String, String> collectVariableNamesInWorksharingDataClauses(WorkShareBlockBuilder worksharingWrapper) {
		HashMap<String, String> privateVariableSet = new HashMap<String, String>();
		OmpForConstruct forConstruct = worksharingWrapper.getForConstruct();
		List<OmpDataClause> dataClauseList = forConstruct.getDataClauseList();
		if (null == dataClauseList) {
			return privateVariableSet;
		} else {
			for (OmpDataClause dataClause: dataClauseList) {
				switch (dataClause.DataClauseType()) {
				
				case Private:
				case Lastprivate:
					for(Expression varExpression: dataClause.getArgumentSet()) {
						String varName = varExpression.toString();
						privateVariableSet.put(varName, WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX + varName);
					}
					break;
					
				case Reduction:
					for(Expression varExpression: ((OmpReductionDataClause)dataClause).getArgumentMap().keySet()) {
						String varName = varExpression.toString();
						privateVariableSet.put(varName, WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX + varName);
					}
					break;
					
				case Copyprivate:
					throw new RuntimeException(STR_UNSUPPORTED_ON_PYJAMA + "copyprivate clause");
				case Shared:
					throw new RuntimeException("shared data clause should not be used in worksharing directive");
				case Default:
					// donothing
					break;
				default:
					throw new RuntimeException("Find unexpected Data clause in //#omp for ");	
				}
			}
			return privateVariableSet;
		}
	}
	
	
	/*
	 * this method is used for redeclaration and initilisation of private/lastprivate/reduction variable
	 * for openMP worksharing construct
	 */
	public static void redeclarePrivateVariablesForWorksharingBlock(WorkShareBlockBuilder worksharingWrapper, SourcePrinter printer) {


		OmpForConstruct forConstruct = worksharingWrapper.getForConstruct();
		final String RENAMING_PREFIX  = WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX+ Integer.toString(worksharingWrapper.getID());
		List<OmpDataClause> dataClauseList = forConstruct.getDataClauseList();
		if (null == dataClauseList) {
			return;
		}
		
		for (OmpDataClause dataClause: dataClauseList) {
			switch (dataClause.DataClauseType()) {
			
			case Private:
				HashMap<String, String> privateArgs = ((OmpPrivateDataClause)dataClause).getArgsTypes(forConstruct);
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					String varType = privateArgs.get(varName);
					worksharingWrapper.varSubstitutionSet.put(varName, RENAMING_PREFIX + varName);
					if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
						printer.printLn(varType+ " " + RENAMING_PREFIX + varName + " = " + varName + ";");
						//e.g. int OMP_WoRkShArInG_PRIVATE_a = a;
					}
					else {
						printer.printLn(varType+ " " + RENAMING_PREFIX + varName + " = new "
								+ varType + "(" + varName + ");");
						//e.g. Point OMP_WoRkShArInG_PRIVATE_p = new Point(p);
					}
				}
				break;
			case Lastprivate:
				HashMap<String, String> lastprivateArgs = ((OmpLastprivateDataClause)dataClause).getArgsTypes(forConstruct);
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					String varType = lastprivateArgs.get(varName);
					worksharingWrapper.varSubstitutionSet.put(varName, RENAMING_PREFIX + varName);
					if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
						printer.printLn(varType+ " " + RENAMING_PREFIX + varName + " = " + DataClauseHandlerUtils.getDefaultValuesForPrimitiveType(varType) + ";");
						//e.g. int OMP_WoRkShArInG_PRIVATE_a = 0;
					}
					else {
						printer.printLn(varType+ " " + RENAMING_PREFIX + varName + " = new "
								+ varType + "();");
						//e.g. Point OMP_WoRkShArInG_PRIVATE_p = new Point();
					}
				}
				break;
				
			case Reduction:
				HashMap<Expression, String> reductionArgs = ((OmpReductionDataClause)dataClause).getArgsTypes(forConstruct);
				for(Expression varExpression: ((OmpReductionDataClause)dataClause).getArgumentMap().keySet()) {
					String varName = varExpression.toString();
					String varType = reductionArgs.get(varExpression);
					worksharingWrapper.varSubstitutionSet.put(varName, RENAMING_PREFIX + varName);
					if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
						printer.printLn(varType+ " " + RENAMING_PREFIX + varName + " = " + ((OmpReductionDataClause)dataClause).getArgumentMap().get(varExpression).getOperatorIdentity(varType) + ";");
						//e.g. int OMP_WoRkShArInG_PRIVATE_a = a;
					}
					else {
						printer.printLn(varType+ " " + RENAMING_PREFIX + varName + " = new "
								+ varType + "(" + varName + ");");
						//e.g. Point OMP_WoRkShArInG_PRIVATE_p = new Point(p);
					}
				}
				break;
				
			case Copyprivate:
				throw new RuntimeException(STR_UNSUPPORTED_ON_PYJAMA + "copyprivate clause");
			case Shared:
				throw new RuntimeException("shared data clause should not be used in worksharing directive");
			case Default:
				// donothing
				break;
			default:
				throw new RuntimeException("Find unexpected Data clause in //#omp for ");		
			}
		}

	}
	
	public static void updateLastprivateForWorksharingBlock(WorkShareBlockBuilder worksharingWrapper, SourcePrinter printer) {
		OmpForConstruct forConstruct = worksharingWrapper.getForConstruct();
		final String RENAMING_PREFIX  = WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX+ Integer.toString(worksharingWrapper.getID());
		List<OmpDataClause> dataClauseList = forConstruct.getDataClauseList();
		if (null == dataClauseList) {
			return;
		}
		
		for (OmpDataClause dataClause: dataClauseList) {
			switch (dataClause.DataClauseType()) {
			
			case Lastprivate:
				for(Expression varExpression: dataClause.getArgumentSet()) {
					String varName = varExpression.toString();
					printer.printLn(varName + " = " + RENAMING_PREFIX + varName + ";");
					//e.g. a = OMP_WoRkShArInG_PRIVATE_a;
				}
				break;
			default:
				break;
			}
		}
	}
	
	public static void reductionForPRClass(ParallelRegionClassBuilder wrapper, SourcePrinter printer) {
		List<OmpDataClause> dataClauseList = wrapper.parallelConstruct.getDataClauseList();
		if (null == dataClauseList) {
			return;
		}
		
		for (OmpDataClause dataClause: dataClauseList) {
			if (OmpDataClause.Type.Reduction == dataClause.DataClauseType()) {
				for(Expression varExpression: ((OmpReductionDataClause)dataClause).getArgumentMap().keySet()) {
					String varName = varExpression.toString();
					OmpReductionOperator operator = ((OmpReductionDataClause)dataClause).getArgumentMap().get(varExpression);
					
					//String reductionOpr = operator.getOperatorString();
					//if (DataClauseHandlerUtils.isPrimitiveReductionOperator(reductionOpr)) {
						/*
						 * primitive type reduction operation
						 */
						printer.print("synchronized(OMP_reduction_lock){ ");
						printer.print(REDUCTION_VARIABLE_DECLARATION_PREFIX + varName + "= "+operator.getOperatorReductionString(REDUCTION_VARIABLE_DECLARATION_PREFIX+varName, varName)+";");
						printer.printLn(" }");
						//e.g. this.outputList.s + s;
					//}
					//else {
						/*
						 * user defined reduction operation
						 */
						//printer.print("synchronized(OMP_reduction_lock){ ");
						//printer.print(reductionOpr + "(" + REDUCTION_VARIABLE_DECLARATION_PREFIX + varName + "," + varName + ");");
						//printer.printLn(" }");
						//e.g. reductionxing(this.val,val);
					//}		
				}
			}
		}
	}
	
	public static void reductionForWorksharingBlock(WorkShareBlockBuilder worksharingWrapper, SourcePrinter printer) {
		OmpForConstruct forConstruct = worksharingWrapper.getForConstruct();
		final String RENAMING_PREFIX  = WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX+ Integer.toString(worksharingWrapper.getID());
		List<OmpDataClause> dataClauseList = forConstruct.getDataClauseList();
		if (null == dataClauseList) {
			return;
		}
		
		for (OmpDataClause dataClause: dataClauseList) {
			switch (dataClause.DataClauseType()) {
			
			case Reduction:
				for(Expression varExpression: ((OmpReductionDataClause)dataClause).getArgumentMap().keySet()) {
					String varName = varExpression.toString();
					OmpReductionOperator operator = ((OmpReductionDataClause)dataClause).getArgumentMap().get(varExpression);
					//String reductionOpr = operator.getOperatorString();
					//if (DataClauseHandlerUtils.isPrimitiveReductionOperator(reductionOpr)) {
						/*
						 * primitive type reduction operation
						 */
						printer.printLn(varName + "=" + operator.getOperatorReductionString(varName,RENAMING_PREFIX + varName) + ";");
						//e.g. i = i + OMP_WoRkShArInG_PRIVATE_i;
					//}
					//else {
						/*
						 * user defined reduction operation
						 */
						//String userDefinedReduction = reductionOpr;
						//printer.printLn(varName + "=" + userDefinedReduction + "(" + varName + ", " + RENAMING_PREFIX + varName + ");");
						//e.g. point = reductionFunction(point, OMP_WoRkShArInG_PRIVATE_point);
					//}		
					
				}
				break;
			default:
				break;
			}
		}
	}
	
	public static GuiCodeClassBuilder generateDummyGuiRegionForNoguiRemainingCode(ParallelRegionClassBuilder PRBuilder) {
		//check remain statements after current parallel region, if any, wrap it into gui wrapper
		String PRCodeString = PRBuilder.parallelConstruct.toString();

		ArrayList<String> currentMethodOrConstructorStmtsStrings = new ArrayList<String>();
		for (Statement s: PRBuilder.currentMethodOrConstructorStmts) {
			currentMethodOrConstructorStmtsStrings.add(s.toString());
		}
		int indexOfcurrentPR = currentMethodOrConstructorStmtsStrings.indexOf(PRCodeString);
		ArrayList<Statement> GuiStmt = new ArrayList<Statement>();

		GuiCodeClassBuilder currentGuiCode = null;
		if (-1 != indexOfcurrentPR) {
			for (int i=indexOfcurrentPR+1; i<PRBuilder.currentMethodOrConstructorStmts.size(); i++) {
				GuiStmt.add(PRBuilder.currentMethodOrConstructorStmts.get(i));
			}
			// Create dummy GuiNode
			BlockStmt GuiBlock = new BlockStmt(0,0,0,0,GuiStmt);
			
			OmpGuiConstruct dummyGuiRegion = new OmpGuiConstruct(GuiBlock);
			currentGuiCode = new GuiCodeClassBuilder(dummyGuiRegion, PRBuilder.visitor);
			currentGuiCode.guiName = "OMP_AfterInvocationOf_" + PRBuilder.className;
		}
		/*
		 * give this dummy gui region a scope info
		 */
		SymbolScopingVisitor scopeVisitor = new SymbolScopingVisitor();
		currentGuiCode.getNode().getBody().accept(scopeVisitor, null);
		ScopeInfo scope = scopeVisitor.getSymbolTable().getScopeOfNode(currentGuiCode.getNode().getBody());
		scope.setParent(PRBuilder.parallelConstruct.scope);

		currentGuiCode.getNode().scope = scope;

		return currentGuiCode;
	}
	
	/**************************************************************************/
	/*
	 * Utility method to print debug message
	 * 
	 * @param msg Debug Message String
	 * 
	 * @note Should use this method instead of System.out/err calls, so that
	 * 
	 * @note we can switch off/on the debug messages.
	 */
	public void showMsg(String msg) {
		if (true == mDebug) {
			System.out.println(msg);
		}
	}

	/*
	 * Utility method to print debug error
	 * 
	 * @param msg Debug Error String
	 * 
	 * @note Should use this method instead of System.out/err calls, so that
	 * 
	 * @note we can switch off/on the debug messages.
	 */
	public void showErr(String err) {
		if (true == mDebug) {
			System.err.println(err);
		}
	}
}
