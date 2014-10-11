package pj.parser.ast.omp;

import pj.parser.ast.expr.Expression;
import pj.parser.ast.symbolscope.ScopeInfo;
import pj.parser.ast.symbolscope.Symbol;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.VoidVisitor;
import pj.parser.ast.visitor.dataclausehandler.DataClauseHandlerUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class OmpLastprivateDataClause extends OmpDataClause{

	private Set<Expression> argumentSet;
	
	public OmpLastprivateDataClause() {
		this.type = OmpDataClause.Type.Lastprivate;
		this.argumentSet = new HashSet<Expression>();
	}
	
	public OmpLastprivateDataClause(Set<Expression> variableSet) {
		this.type = OmpDataClause.Type.Lastprivate;
		this.argumentSet = variableSet;
	}
	
	public OmpLastprivateDataClause(int beginLine, int beginColumn, int endLine, int endColumn, Set<Expression> variableList) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.type = OmpDataClause.Type.Lastprivate;
		this.argumentSet = variableList;
	}
	
	public Set<Expression> getArgumentSet() {
		return this.argumentSet;
	}
	
	public void addArgument(Expression argument) {
		this.argumentSet.add(argument);
	}
	
	public void printLastprivateVariableDefinationAndInitialisation(OpenMPStatement n, SourcePrinter printer) {
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
	
	public HashMap<String, String> getArgsTypes(OpenMPStatement n) {
		HashMap<String, String> varTypes = new HashMap<String, String>();
		ScopeInfo scope = n.scope;
		LinkedList<Symbol> symbols = scope.getAllReachableSymbols();
		for (Expression v: this.argumentSet) {
			String varName = v.toString();
			for (Symbol s: symbols) {
				if (s.isVariableNameAs(varName)) {
					String varType = s.getSymbolDataType();
					varTypes.put(varName, varType);
				}
			}
		}
		return varTypes;
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
