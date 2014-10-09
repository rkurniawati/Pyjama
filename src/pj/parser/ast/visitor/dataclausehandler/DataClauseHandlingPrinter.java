package pj.parser.ast.visitor.dataclausehandler;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.type.Type;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.constructwrappers.ConstructWrapper;
import pj.parser.ast.visitor.constructwrappers.ParallelRegionClassBuilder;
import pj.parser.ast.visitor.constructwrappers.WorkShareMethodBuilder;

public class DataClauseHandlingPrinter {
	
	public static void sharedVariablesDefine(OpenMPStatement owner, OmpSharedDataClause  SourcePrinter printer) {
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
}
