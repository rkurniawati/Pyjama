package pj.parser.ast.visitor.dataclausehandler;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.expr.OpenMP_DataClause;
import pj.parser.ast.expr.OpenMP_ReductionOperator;
import pj.parser.ast.stmt.BlockStmt;
import pj.parser.ast.stmt.OpenMP_Gui_Construct;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.type.Type;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.VariableNameFindVisitor;
import pj.parser.ast.visitor.constructwrappers.ConstructWrapper;
import pj.parser.ast.visitor.constructwrappers.GuiCodeClassBuilder;
import pj.parser.ast.visitor.constructwrappers.ParallelRegionClassBuilder;
import pj.parser.ast.visitor.constructwrappers.WorkShareMethodBuilder;


/**
 * This class implements utility routines to processes OpenMP 2.5 - like data
 * clauses. These methods translate the use of data clauses into explicitly
 * parallel programs
 * 
 * The data clauses are handled in three stages. Firstly, they are translated
 * into different internal veriables before the invocation of user code in a
 * Pyjama region. Secondly, within the Pyjama region. Thirdly, the after the
 * region, where result collection may be processed.
 * 
 * Also, OpenMP specification lays down certain constraints on the usage of data
 * clauses, which this class enforces.
 * 
 * @author vikassingh
 * @author Xing Fan
 * 
 * @version 1.1.1
 */
public class DataClauseHandlerBack {

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
	 * Prefix for worksharing private variables renaming, added by Xing in 2014.8.3
	 */
	
	private static final String WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX = "OMP_WoRkShArInG_PRIVATE_";

	/*
	 * this is the stage before the invocation of Pyjama regions
	 */
	public static void processDataClausesBeforeInvocation(ConstructWrapper wrapper, SourcePrinter printer) {
		List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
		if (null == clauses) {
			//no data clauses so needn't process
			return;
		}
		
		Iterator <OpenMP_DataClause> itDCs = clauses.iterator();
		OpenMP_DataClause dc;
		Collection<Expression> vars;
		while(itDCs.hasNext()) {
			dc = itDCs.next();
			switch(dc.getType()) {
			
			case Copyprivate:
				throw new RuntimeException(STR_UNSUPPORTED_ON_PYJAMA + "copyprivate clause");
				
			case Private:
				throw new RuntimeException(STR_UNSUPPORTED_ON_PYJAMA + "private clause");

			case LastPrivate:
				if (wrapper instanceof ParallelRegionClassBuilder)
					throw new RuntimeException("lastprivate may not be used with the parallel construct");
				/*
				 * in parallel for directive, lastprivate need put to into outputlist before invocation
				 */
				vars = dc.getArgumentList();
				for (Expression v : vars) {
					printer.printLn(wrapper.get_outputlist() + ".put(\"" + v.toString() + "\"," + v.toString() + ");");
					//e.g. outputlist.put("sp", sp);
				}
				break;
				
			case FirstPrivate:
				if (wrapper instanceof ParallelRegionClassBuilder) {
					vars = dc.getCopyConstructorList().keySet();
					for (Expression v : vars) {
						printer.printLn(wrapper.get_inputlist() + ".put(\"" + v.toString() + "\"," + v.toString() + ");");
						//e.g. inputlist.put("sp",sp);
					}
				}
				break;
				
			case Shared:
				if (wrapper instanceof WorkShareMethodBuilder)
					throw new RuntimeException("shared dataclause may not be used with the for directives");
				
				vars = dc.getArgumentList();
				for (Expression v : vars) {
					printer.printLn(wrapper.get_inputlist() + ".put(\"" + v.toString() + "\"," + v.toString() + ");");
					//e.g. inputlist.put("sp",sp);
				}
				break;
				
			case Reduction:
				if (wrapper instanceof WorkShareMethodBuilder) {
					vars = dc.getCopyConstructorList().keySet();
					for (Expression v : vars) {
						printer.printLn(wrapper.get_outputlist() + ".put(\"" + v.toString() + "\"," + v.toString() + ");");
						//e.g. outputlist.put("sp", sp);
						/*
						 * reduction variables should put both inputlist and outputlist,
						 * in for directive the process of puting into inputlist has been
						 * done by processAllVariablesUsedInForLoop().
						 */
					}
				}
				else if (wrapper instanceof ParallelRegionClassBuilder) {
					vars = dc.getCopyConstructorList().keySet();
					for (Expression v : vars) {
						printer.printLn(wrapper.get_inputlist() + ".put(\"" + v.toString() + "\"," + v.toString() + ");");
						printer.printLn(wrapper.get_outputlist() + ".put(\"" + v.toString() + "\"," + v.toString() + ");");
						//e.g. inputlist.put("sp",sp);
						//e.g. outputlist.put("sp", sp);
						/*
						 * reduction variables should put both inputlist and outputlist
						 */
					}
				}
				break;
				
			default:
				break;
			}
		}
	}
	
	
	public static void processDataClausesAfterInvocation(ConstructWrapper wrapper, SourcePrinter printer) {
		List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
		if (null == clauses) {
			//no data clauses so needn't process
			return;
		}
		Iterator <OpenMP_DataClause> itDCs = clauses.iterator();
		OpenMP_DataClause dc;
		Collection<Expression> vars;
		while(itDCs.hasNext()) {
			dc = itDCs.next();
			switch(dc.getType()) {
			
			case Copyprivate:
				throw new RuntimeException(STR_UNSUPPORTED_ON_PYJAMA + "copyprivate clause");
				
			case Private:
				throw new RuntimeException(STR_UNSUPPORTED_ON_PYJAMA + "private clause");
				
			case LastPrivate:
				if (wrapper instanceof ParallelRegionClassBuilder)
					throw new RuntimeException("Last-private may not be used with the parallel construct");
				vars = dc.getArgumentList();
				for (Expression v : vars) {
					String varType = wrapper.autoGetAllLocalMethodVariables().get(v.toString()).toString();
					if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
						printer.printLn(v.toString() + " = " + "(" + DataClauseHandlerUtils.autoBox(varType) + ")" 
								+ wrapper.get_outputlist() +".get(" + "\"" + v.toString() + "\");");
						//e.g. i = (Integer)outputList.get("i");
					}
					else {
						printer.printLn(v.toString() + " = " + "(" + varType + ")" 
								+ wrapper.get_outputlist() +".get(" + "\"" + v.toString() + "\");");
						//e.g. sp = (Point)outputList.get("sp");
						//e.g. sp1 = (String)outputList.get("sp1");
					}
				}
				break;
				
			case FirstPrivate:
				/*
				 * firstprivate variables needn't do anything after invocation
				 */
				break;
				
			case Shared:
				vars = dc.getArgumentList();
				for (Expression v : vars) {
					String varType = wrapper.autoGetAllLocalMethodVariables().get(v.toString()).toString();
					if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
						printer.printLn(v.toString() + " = " + "(" + DataClauseHandlerUtils.autoBox(varType) + ")" 
								+ wrapper.get_outputlist() +".get(" + "\"" + v.toString() + "\");");
						//e.g. i = (Integer)outputList.get("i");
					}
					else {
						printer.printLn(v.toString() + " = " + "(" + varType + ")" 
								+ wrapper.get_outputlist() +".get(" + "\"" + v.toString() + "\");");
						//e.g. sp = (Point)outputList.get("sp");
						//e.g. sp1 = (String)outputList.get("sp1");
					}
				}
				break;
				
			case Reduction:
				vars = dc.getCopyConstructorList().keySet();
				for (Expression v : vars) {
					String varType = wrapper.autoGetAllLocalMethodVariables().get(v.toString()).toString();
					if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
						printer.printLn(v.toString() + " = " + "(" + DataClauseHandlerUtils.autoBox(varType) + ")" 
								+ wrapper.get_outputlist() +".get(" + "\"" + v.toString() + "\");");
						//e.g. i = (Integer)outputList.get("i");
					}
					else {
						printer.printLn(v.toString() + " = " + "(" + varType + ")" 
								+ wrapper.get_outputlist() +".get(" + "\"" + v.toString() + "\");");
						//e.g. sp = (Point)outputList.get("sp");
						//e.g. sp1 = (String)outputList.get("sp1");
					}
				}
				break;
				
			default:
				break;
			}
		}	
		
	}
	public static void processAllVariablesUsedInForLoopToInputlist(WorkShareMethodBuilder wrapper, SourcePrinter printer) {
		////////;;
		HashMap<String, Type> variablesInForLoop = getUsedVariablesInWapperCodeBlock(wrapper);
		for (String s: variablesInForLoop.keySet()) {
			printer.printLn(wrapper.get_inputlist() + ".put(\"" + s + "\"," + s + ");");
				//e.g. outputlist.put("sp", sp);
		}
	}
	
	public static void sharedVariablesDefine(ConstructWrapper wrapper, SourcePrinter printer) {
		if (wrapper instanceof ParallelRegionClassBuilder) {
			List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
			Iterator<OpenMP_DataClause> iterator;
			if (null != clauses) {
				iterator = clauses.iterator();
				while (iterator.hasNext()) {
					OpenMP_DataClause dc = iterator.next();
					if (OpenMP_DataClause.Type.Shared == dc.getType()) {
						Collection<Expression> vars = dc.getArgumentList();
						if (vars.isEmpty() || (null == vars)) break;
						for (Expression v : vars) {
							String varType = wrapper.autoGetAllLocalMethodVariables().get(v.toString()).toString();
							printer.print(varType + " " + v.toString());
							if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
								printer.printLn(" = " + DataClauseHandlerUtils.getDefaultValuesForPrimitiveType(varType) + ";");
							}
							else {
								printer.printLn(" = null;");
							}
							//e.g. Point p=null;
							//e.g. int i=0;
						}
					}
				}
			}
		}
		else if (wrapper instanceof WorkShareMethodBuilder) {
			for (Entry<String, Type> varItem: ((WorkShareMethodBuilder)wrapper).variablesUsedInForLoop.entrySet()) {
				String varType = varItem.getValue().toString();
				printer.print(varType + " " + varItem.getKey().toString());
				if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
					printer.printLn(" = " + DataClauseHandlerUtils.getDefaultValuesForPrimitiveType(varType) + ";");
				}
				else {
					printer.printLn(" = null;");
				}
			}
		}
	}
	
	public static void sharedVariablesInitialize(ConstructWrapper wrapper, SourcePrinter printer) {
		if (wrapper instanceof ParallelRegionClassBuilder) {
			List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
			Iterator<OpenMP_DataClause> iterator;
			if (null != clauses) {
				iterator = clauses.iterator();
				while (iterator.hasNext()) {
					OpenMP_DataClause dc = iterator.next();
					if (OpenMP_DataClause.Type.Shared == dc.getType()) {
						Collection<Expression> vars = dc.getArgumentList();
						if (vars.isEmpty() || (null == vars)) break;
						for (Expression v : vars) {
							String varType = wrapper.autoGetAllLocalMethodVariables().get(v.toString()).toString();
							if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
								printer.printLn(v.toString() + " = " + "(" + DataClauseHandlerUtils.autoBox(varType) + ")" 
										+ "OMP_inputList.get(" + "\"" + v.toString() + "\");");
								//e.g. i = (Integer)this.inputlist.get("i");
								//directly cast object type to primitive type is unsupported in java1.6
							}
							else {
								printer.printLn(v.toString() + " = " + "(" + varType + ")" 
										+ "OMP_inputList.get(" + "\"" + v.toString() + "\");");
								//e.g. sp = (Point)this.inputList.get("sp");
								//e.g. sp1 = (String)this.inputList.get("sp1");
							}
						}
					}
				}
			}
		}
		else if (wrapper instanceof WorkShareMethodBuilder) {
			for (Entry<String, Type> varItem: ((WorkShareMethodBuilder)wrapper).variablesUsedInForLoop.entrySet()) {
				String varType = varItem.getValue().toString();
				if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
					printer.printLn(varItem.getKey().toString() + " = " + "(" + DataClauseHandlerUtils.autoBox(varType) + ")" 
							+ "OMP_inputList.get(" + "\"" + varItem.getKey().toString() + "\");");
					//e.g. i = (Integer)this.inputlist.get("i");
					//directly cast object type to primitive type is unsupported in java1.6
				}
				else {
					printer.printLn(varItem.getKey().toString() + " = " + "(" + varType + ")" 
							+ "OMP_inputList.get(" + "\"" + varItem.getKey().toString() + "\");");
					//e.g. sp = (Point)this.inputList.get("sp");
					//e.g. sp1 = (String)this.inputList.get("sp1");
				}
			}
		}	
	}
	
	public static void firstprivateReductionVarialbesDefine(ConstructWrapper wrapper, SourcePrinter printer) {
		List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
		Iterator<OpenMP_DataClause> iterator;
		if (null != clauses) {
			iterator = clauses.iterator();
			while (iterator.hasNext()) {
				OpenMP_DataClause dc = iterator.next();
				if (OpenMP_DataClause.Type.FirstPrivate == dc.getType() || OpenMP_DataClause.Type.Reduction == dc.getType()) {
					//I have to say this is an expedient, firstprivate and reduction vars is store in CopyConstructorList instead of argList
					Collection<Expression> vars = dc.getCopyConstructorList().keySet();
					if ((null == vars) || vars.isEmpty()) break;
					for (Expression v : vars) {
						String varType = wrapper.autoGetAllLocalMethodVariables().get(v.toString()).toString();
						printer.print(varType + " " + v.toString());
						if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
							printer.printLn(" = " + DataClauseHandlerUtils.getDefaultValuesForPrimitiveType(varType) + ";");
						}
						else {
							printer.printLn(" = null;");
						}
						//e.g. Point p=null;
						//e.g. int i=0;
						/*
						 * if current wrapper is for directive wrapper, delete var in 
						 * WorkShareMethodBuilder.variablesUsedInForLoop
						 */
						if (wrapper instanceof WorkShareMethodBuilder) {
							((WorkShareMethodBuilder)wrapper).variablesUsedInForLoop.remove(v.toString());
						}
					}
				}
			}
		}
	}
	
	public static void firstprivateReductionVarialbesInitialize(ConstructWrapper wrapper, SourcePrinter printer) {
		List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
		Iterator<OpenMP_DataClause> iterator;
		if (null != clauses) {
			iterator = clauses.iterator();
			while (iterator.hasNext()) {
				OpenMP_DataClause dc = iterator.next();
				if (OpenMP_DataClause.Type.FirstPrivate == dc.getType() || OpenMP_DataClause.Type.Reduction == dc.getType()) {
					//I have to say this is an expedient, firstprivate and reduction vars is store in CopyConstructorList instead of argList
					Collection<Expression> vars = dc.getCopyConstructorList().keySet();
					if ((null == vars) || vars.isEmpty()) break;
					for (Expression v : vars) {
						String varType = wrapper.autoGetAllLocalMethodVariables().get(v.toString()).toString();
						if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
							printer.printLn(v.toString() + " = "
									+ "(" + DataClauseHandlerUtils.autoBox(varType) + ")" + "OMP_inputList.get(" + "\"" + v.toString() + "\");");
							//e.g. p = (int)this.inputList.get("p");
						}
						else {
							printer.printLn(v.toString() + " = new "
									+ varType + "((" + varType + ")" 
									+ "OMP_inputList.get(" + "\"" + v.toString() + "\"));");
							//e.g. p = new Point((Point)this.inputList.get("p"));
						}
					}
				}
			}
		}
	}
	
	public static void lastprivateDefineAndInitialize(ConstructWrapper wrapper, SourcePrinter printer) {
		List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
		Iterator<OpenMP_DataClause> iterator;
		if (null != clauses) {
			iterator = clauses.iterator();
			while (iterator.hasNext()) {
				OpenMP_DataClause dc = iterator.next();
				if (OpenMP_DataClause.Type.LastPrivate == dc.getType()) {
					Collection<Expression> vars = dc.getArgumentList();
					if (vars.isEmpty() || (null == vars)) break;
					for (Expression v : vars) {
						String varType = wrapper.autoGetAllLocalMethodVariables().get(v.toString()).toString();
						printer.print(varType + " " + v.toString());
						if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
							printer.printLn(" = " + DataClauseHandlerUtils.getDefaultValuesForPrimitiveType(varType) + ";");
						}
						else {
							printer.printLn(" = null;");
						}
						//e.g. Point p=null;
						//e.g. int i=0;
						/*
						 * if current wrapper is for directive wrapper, delete var in 
						 * WorkShareMethodBuilder.variablesUsedInForLoop
						 */
						if (wrapper instanceof WorkShareMethodBuilder) {
							((WorkShareMethodBuilder)wrapper).variablesUsedInForLoop.remove(v.toString());
						}
					}
				}
			}
		}
	}
	
	public static void reductionProcedure(ConstructWrapper wrapper, SourcePrinter printer) {
		List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
		Iterator<OpenMP_DataClause> iterator;
		if (null != clauses) {
			iterator = clauses.iterator();
			while (iterator.hasNext()) {
				OpenMP_DataClause dc = iterator.next();
				/*
				 * execute reduction procedure for reduction variables
				 */
				if (OpenMP_DataClause.Type.Reduction == dc.getType()) {
					Collection<Expression> vars = dc.getCopyConstructorList().keySet();
					if (vars.isEmpty() || (null == vars)) break;
					for (Expression v : vars) {
						OpenMP_ReductionOperator ReductionOperator  = dc.getReductionOperator();
						if (null != ReductionOperator.getUserDefinedReduction()) {
							/*
							 * user defined reduction operation
							 */
							String userDefinedReduction = ReductionOperator.getOperatorString();
							printer.print("synchronized(OMP_outputList){ ");
							printer.print("OMP_outputList.put(" + "\"" + v.toString() + "\", "
									+ userDefinedReduction +"((" + wrapper.autoGetAllLocalMethodVariables().get(v.toString()).toString() + ")OMP_outputList.get(\"" 
									+ v.toString() + "\")," + v + "));");
							printer.printLn(" }");
							//e.g. OMP_outputList.put("val", reductionxing((int)OMP_outputList.get("val"),val));
						}
						else {
							/*
							 * primitive type reduction operation
							 */
							String varType = wrapper.autoGetAllLocalMethodVariables().get(v.toString()).toString();
							printer.print("synchronized(OMP_outputList){ ");
							printer.print("OMP_outputList.put(" + "\"" + v.toString() + "\", "
										+ "((" + DataClauseHandlerUtils.autoBox(varType) + ")OMP_outputList.get(\"" 
										+ v.toString() + "\")" + dc.getReductionOperator().getOperatorString() + v + "));");
							printer.printLn(" }");
							//e.g. OMP_outputList.put("s", ((int)this.outputList.get("s") + s));
						}
					}
				}
			}
		}
	}
	
	public static void updateOutputlistForSharedVariables(ConstructWrapper wrapper, SourcePrinter printer) {
		List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
		if (null != clauses) {
			Iterator <OpenMP_DataClause> itDCs = clauses.iterator();
			while (itDCs.hasNext()) {
				OpenMP_DataClause dc = itDCs.next();
				if (OpenMP_DataClause.Type.Shared == dc.getType()) {
					Collection<Expression> vars = dc.getArgumentList();
					for (Expression v : vars) {
						printer.printLn("OMP_outputList.put(\"" + v.toString() + "\"," + v.toString() + ");");
						//e.g. this.outputList.put("sp", sp);
					}
				}
			}
		}
	}
	
	public static void updateOutputlistForLastprivateVariables(ConstructWrapper wrapper, SourcePrinter printer) {
		List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
		if (null != clauses) {
			Iterator <OpenMP_DataClause> itDCs = clauses.iterator();
			while (itDCs.hasNext()) {
				OpenMP_DataClause dc = itDCs.next();
				if (OpenMP_DataClause.Type.LastPrivate == dc.getType()) {
					Collection<Expression> vars = dc.getArgumentList();
					for (Expression v : vars) {
						//printer.printLn("OMP_outputList.put(\"" + v.toString() + "\"," + v.toString() + ");");
						printer.printLn(v.toString() + " = " + WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX + v.toString() + ";");
						//e.g. this.outputList.put("sp", sp);
					}
				}
			}
		}
	}
	
	public static HashMap<String, Type> getUsedVariablesInWapperCodeBlock(ConstructWrapper wrapper) {
		HashMap<String, Type> allVariablesDefinationSet = wrapper.autoGetAllLocalMethodVariables();
		VariableNameFindVisitor v = new VariableNameFindVisitor();
		if (wrapper instanceof WorkShareMethodBuilder) {
			((WorkShareMethodBuilder)wrapper).getForNode().getStatements().get(0).accept(v, null);
		}
		else if (wrapper instanceof GuiCodeClassBuilder) {
			((GuiCodeClassBuilder)wrapper).getNode().getStatements().get(0).accept(v, null);
		}
		else if (wrapper instanceof ParallelRegionClassBuilder) {
			((ParallelRegionClassBuilder)wrapper).parallelConstruct.getStatements().get(0).accept(v, null);
		}
		HashSet<String> nameExprUsedInCodeBlock = v.getVariablesSet();
		HashMap<String, Type> variablesInCodeBlock = new HashMap<String, Type>();
		for (String varName : nameExprUsedInCodeBlock) {
			Type type = allVariablesDefinationSet.get(varName);
			if (null == type) {
				continue;
			} else {
				variablesInCodeBlock.put(varName, type);
				//System.out.println("DEBUG:get var:"+ varName);
			}
		}
		return variablesInCodeBlock;
	}

	public static GuiCodeClassBuilder generateDummyGuiRegionForNoguiRemainingCode(ParallelRegionClassBuilder PRBuilder) {
		String returnCode = "";
		//check remain statements after current parallel region, if any, wrap it into gui wrapper
		String PRCodeString = PRBuilder.parallelConstruct.toString();
		PRCodeString = PRCodeString.replaceFirst("//#omp parallel freeguithread", "//#omp freeguithread parallel");
		ArrayList<String> currentMethodOrConstructorStmtsStrings = new ArrayList<String>();
		for (Statement s: PRBuilder.currentMethodOrConstructorStmts) {
			currentMethodOrConstructorStmtsStrings.add(s.toString());
		}
		int indexOfcurrentPR = currentMethodOrConstructorStmtsStrings.indexOf(PRCodeString);
		ArrayList<Statement> GuiStmt = new ArrayList<Statement>();
//		if (indexOfcurrentPR == currentMethodOrConstructorStmtsStrings.size()-1) {
//			//if current PR is the last statement of current method's statements, return directively;
//			return null;
//		}
		GuiCodeClassBuilder currentGuiCode = null;
		if (-1 != indexOfcurrentPR) {
			for (int i=indexOfcurrentPR+1; i<PRBuilder.currentMethodOrConstructorStmts.size(); i++) {
				GuiStmt.add(PRBuilder.currentMethodOrConstructorStmts.get(i));
			}
			// Create dummy GuiNode
			BlockStmt GuiBlock = new BlockStmt(0,0,0,0,GuiStmt);
			ArrayList<Statement> dummyStmt = new ArrayList<Statement>();
			dummyStmt.add(GuiBlock);
			OpenMP_Gui_Construct dummyGuiRegion = new OpenMP_Gui_Construct(PRBuilder.parallelConstruct,dummyStmt);
			dummyGuiRegion.setVarScope(PRBuilder.parallelConstruct.getVarScope());
			currentGuiCode = new GuiCodeClassBuilder(dummyGuiRegion, PRBuilder.visitor);
			currentGuiCode.guiName = "OMP_AfterInvocationOf_" + PRBuilder.className;
		}
		return currentGuiCode;
	}
	
	public static void addMissedSharedVariablesForRemaingGuiRegion(GuiCodeClassBuilder GuiBuilder, ParallelRegionClassBuilder PRBuilder) {
		HashMap<String, Type> variablesForGuiCode = getUsedVariablesInWapperCodeBlock(GuiBuilder);
		List<OpenMP_DataClause> clauses = PRBuilder.getDataClauses();
		if (null ==  clauses) {
			PRBuilder.parallelConstruct.setDataClauses(new ArrayList<OpenMP_DataClause>());
			clauses = PRBuilder.getDataClauses();
		}
		boolean haveNoSharedClause = true;
		for(OpenMP_DataClause c: clauses) {
			if (OpenMP_DataClause.Type.Shared == c.getType()) {
				haveNoSharedClause = false;
			}
		}
		if (haveNoSharedClause) {
			PRBuilder.parallelConstruct.getDataClauses().add(
					new OpenMP_DataClause(0, 0, OpenMP_DataClause.Type.Shared, new ArrayList<Expression>(),
							null, null));
		}
		Collection<Expression> sharedVariablesInPR = null;
		Collection<String> sharedVars = new ArrayList<String>();
		Iterator<OpenMP_DataClause> iterator;
		iterator = clauses.iterator();
		while (iterator.hasNext()) {
			OpenMP_DataClause dc = iterator.next();
			if (OpenMP_DataClause.Type.Shared == dc.getType()) {
				sharedVariablesInPR = dc.getArgumentList();
				for (Expression expr: sharedVariablesInPR) {
					sharedVars.add(expr.toString());
				}
			}
		}

		for (String guiVar: variablesForGuiCode.keySet()) {
			if (sharedVars.contains(guiVar)) {
				continue;
			}
			else {
				sharedVariablesInPR.add(new NameExpr(0,0,guiVar));
			}
		}
	}
	
	public static void printVariableParametersForGuiRegion(HashMap<String, Type> variablesForGuiCode, SourcePrinter printer) {
		Iterator iter = variablesForGuiCode.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, Type> entry = (Entry<String, Type>) iter.next();
			String varName = (String) entry.getKey();
			Type varType = (Type)entry.getValue();
			printer.print(varType.toString() + " " + varName);
			if (iter.hasNext()) {
				printer.print(", ");
			}
		}
	}
	
	public static void printVariablesDefinitionForGuiRegion(HashMap<String, Type> variablesForGuiCode, SourcePrinter printer) {
		for (String varName : variablesForGuiCode.keySet()) {
			printer.printLn(variablesForGuiCode.get(varName).toString()+" "+varName+";");
		}
	}
	
	public static void printVariablesForGuiRegionInvocation(HashMap<String, Type> variablesForGuiCode, SourcePrinter printer) {
		Iterator iter = variablesForGuiCode.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, Type> entry = (Entry<String, Type>) iter.next();
			String varName = (String) entry.getKey();
			Type varType = (Type)entry.getValue();
			printer.print(varName);
			if (iter.hasNext()) {
				printer.print(", ");
			}
		}
	}
	
	public static void printVariablesInitForGuiRegion(HashMap<String, Type> variablesForGuiCode, SourcePrinter printer) {
		for (String varName : variablesForGuiCode.keySet()) {
			printer.printLn("this."+varName+"="+varName+";");
		}
	}
	
	/*
	 * Xing added at 2014.8.4, Clause handlers for worksharing variables: firstprivate, lastprivate, reduction
	 * Shared variables needn't any refactory operation, they are in nature visible for worksharing 
	 */
	
	public static void redeclareFirstprivateReductionLastPrivateVariablesForWorksharing(WorkShareMethodBuilder wrapper, SourcePrinter printer) {
		List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
		Iterator<OpenMP_DataClause> iterator;
		if (null != clauses) {
			iterator = clauses.iterator();
			while (iterator.hasNext()) {
				OpenMP_DataClause dc = iterator.next();
				if (OpenMP_DataClause.Type.FirstPrivate == dc.getType() || OpenMP_DataClause.Type.Reduction == dc.getType()) {
					Collection<Expression> vars = dc.getCopyConstructorList().keySet();
					if ((null == vars) || vars.isEmpty()) break;
					for (Expression v : vars) {
						String varType = wrapper.autoGetAllLocalMethodVariables().get(v.toString()).toString();
						if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
							printer.printLn(varType+ " " + WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX + v.toString() + " = " + v.toString() + ";");
							//e.g. int OMP_WoRkShArInG_PRIVATE_a = a;
						}
						else {
							printer.printLn(varType+ " " + WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX + v.toString() + " = new "
									+ varType + "(" + v.toString() + ");");
							//e.g. Point OMP_WoRkShArInG_PRIVATE_p = new Point(p);
						}
					}
				} else if (OpenMP_DataClause.Type.LastPrivate == dc.getType()) {
					Collection<Expression> vars = dc.getArgumentList();
					for (Expression v : vars) {
						String varType = wrapper.autoGetAllLocalMethodVariables().get(v.toString()).toString();
						if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
							printer.printLn(varType+ " " + WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX + v.toString() + "= " + DataClauseHandlerUtils.getDefaultValuesForPrimitiveType(varType) + ";");
							//e.g. int OMP_WoRkShArInG_PRIVATE_a = 0;
						}
						else {
							printer.printLn(varType+ " " + WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX + v.toString() + " = new "
									+ varType + "(" + v.toString() + ");");
							//e.g. Point OMP_WoRkShArInG_PRIVATE_p = new Point();
						}
					}
				}
			}
		}
	}
	
	/*
	 * Xing added at 2014.8.4, Clause handlers for worksharing variables: firstprivate, lastprivate, reduction
	 * Collect all variable need to be privatised (remane by adding prefix), used by Pyjama NameExpression Visitors 
	 * Notice private means every variable needs to be threadlocaled, includes firstprivate, lastprivate and reduction
	 */
	public static HashMap<String, String> collectPrivateVariablesForWorksharing(WorkShareMethodBuilder wrapper) {
		HashMap<String, String> privateVariableSet = new HashMap<String, String>();
		List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
		Iterator<OpenMP_DataClause> iterator;
		if (null != clauses) {
			iterator = clauses.iterator();
			while (iterator.hasNext()) {
				OpenMP_DataClause dc = iterator.next();
				if (OpenMP_DataClause.Type.FirstPrivate == dc.getType() || OpenMP_DataClause.Type.Reduction == dc.getType()) {
					Collection<Expression> vars = dc.getCopyConstructorList().keySet();
					for (Expression v : vars) {
						privateVariableSet.put(v.toString(), WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX + v.toString());
					}
				} else if (OpenMP_DataClause.Type.LastPrivate == dc.getType()) {
					Collection<Expression> vars = dc.getArgumentList();
					for (Expression v : vars) {
						privateVariableSet.put(v.toString(), WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX + v.toString());
					}
				}
			}
		}
		return privateVariableSet;
	}
	/*
	 * Xing added at 2014.8.4, worksharing reduction rewrite
	 */
	
	public static void reductionForWorksharingBlock(WorkShareMethodBuilder wrapper, SourcePrinter printer) {
		HashMap<String, String> privateVariableSet = new HashMap<String, String>();
		List<OpenMP_DataClause> clauses = wrapper.getDataClauses();
		Iterator<OpenMP_DataClause> iterator;
		if (null != clauses) {
			iterator = clauses.iterator();
			while (iterator.hasNext()) {
				OpenMP_DataClause dc = iterator.next();
				if (OpenMP_DataClause.Type.Reduction == dc.getType()) {
					Collection<Expression> vars = dc.getCopyConstructorList().keySet();
					for (Expression v : vars) {
						OpenMP_ReductionOperator ReductionOperator  = dc.getReductionOperator();
						if (null != ReductionOperator.getUserDefinedReduction()) {
							/*
							 * user defined reduction operation
							 */
							String userDefinedReduction = ReductionOperator.getOperatorString();
							printer.printLn(v.toString() + "=" + userDefinedReduction + "(" + v.toString() + ", " + WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX + v.toString() + ");");
							//e.g. point = reductionFunction(point, OMP_WoRkShArInG_PRIVATE_point);
						}
						else {
							/*
							 * primitive type reduction operation
							 */
							printer.printLn(v.toString() + "=" + v.toString() + dc.getReductionOperator().getOperatorString() + WORKSHARING_PRIVATE_VARIABLE_RENAMING_PREFIX + v.toString() + ";");
							//e.g. i = i + OMP_WoRkShArInG_PRIVATE_i;
						}
					}
				}
			}
		}
	}
	/*
	 * utility method to print elements into the data passing classes
	 */
	

	private String formatException(String msg, int line) {
		return "\n\n\t" + "-------------------------------\n\t" + ": " + msg
				+ ", line " + line + "\n\t-------------------------------\n";
	}

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
