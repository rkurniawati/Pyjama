package pj.parser.ast.omp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.symbolscope.ScopeInfo;
import pj.parser.ast.symbolscope.Symbol;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.VoidVisitor;
import pj.parser.ast.visitor.dataclausehandler.DataClauseHandlerUtils;

public class OmpReductionDataClause extends OmpDataClause{

	Map<Expression, OmpReductionOperator> argumentMap;
	
	public OmpReductionDataClause() {
		this.type = OmpDataClause.Type.Reduction;
		this.argumentMap = new HashMap<Expression, OmpReductionOperator>();
	}
	
	public OmpReductionDataClause(HashMap<Expression, OmpReductionOperator> variableSet) {
		this.type = OmpDataClause.Type.Reduction;
		this.argumentMap = variableSet;
	}
	
	public OmpReductionDataClause(int beginLine, int beginColumn, int endLine, int endColumn, HashMap<Expression, OmpReductionOperator> variableList) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.type = OmpDataClause.Type.Reduction;
		this.argumentMap = variableList;
	}
	
	public Map<Expression, OmpReductionOperator> getArgumentMap() {
		return this.argumentMap;
	}
	
	public void addArgument(OmpReductionOperator operator, Expression argument) {
		this.argumentMap.put(argument, operator);
	}
	
	public void printReductionVariableDefination(OpenMPStatement n, SourcePrinter printer) {
		HashMap<String, String> args = this.getArgsTypes(n);
		for (String varName: args.keySet()) {
			String varType = args.get(varName);
			printer.print(varType + " " + varName);
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
	
	public void printReductionVariableInitialisation(OpenMPStatement n, SourcePrinter printer) {
		HashMap<String, String> args = this.getArgsTypes(n);
		for (String varName: args.keySet()) {
			String varType = args.get(varName);
			if (DataClauseHandlerUtils.isPrimitiveType(varType)) {
				printer.printLn(varName + " = " + "(" + DataClauseHandlerUtils.autoBox(varType) + ")" 
						+ "OMP_inputList.get(" + "\"" + varName + "\");");
				//e.g. i = (Integer)this.inputlist.get("i");
				//directly cast object type to primitive type is unsupported in java1.6
			}
			else {
				printer.printLn(varName + " = " + "(" + varType + ")" 
						+ "OMP_inputList.get(" + "\"" + varName + "\");");
				//e.g. sp = (Point)this.inputList.get("sp");
				//e.g. sp1 = (String)this.inputList.get("sp1");
			}
		}
	}
	
	public HashMap<String, String> getArgsTypes(OpenMPStatement n) {
		HashMap<String, String> varTypes = new HashMap<String, String>();
		ScopeInfo scope = n.scope;
		LinkedList<Symbol> symbols = scope.getAllReachableSymbols();
		for (Expression v: this.argumentMap.keySet()) {
			String varName = v.toString();
			boolean findVarName = false;
			for (Symbol s: symbols) {
				if (s.isVariableNameAs(varName)) {
					String varType = s.getSymbolDataType().toString();
					varTypes.put(varName, varType);
					findVarName = true;
					break;
				}
			}
			if (!findVarName) {
				throw new RuntimeException("Illegal variable '" + varName + "' in reduction data clause");
			}
		}
		return varTypes;
	}
	
	
	@Override
	public Set<Expression> getArgumentSet() {
		throw new RuntimeException("It is not allowed to use getArgumentSet in reduction clause");
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
