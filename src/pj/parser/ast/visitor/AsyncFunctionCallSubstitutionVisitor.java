package pj.parser.ast.visitor;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import pj.parser.ast.body.Parameter;
import pj.parser.ast.expr.Expression;
import pj.parser.ast.expr.MethodCallExpr;
import pj.parser.ast.omp.OmpAwaitFunctionCallDeclaration;
import pj.parser.ast.symbolscope.ScopeInfo;
import pj.parser.ast.symbolscope.Symbol;
import pj.parser.ast.type.Type;

/*
 * This visitor is used by Pyjama await block visiting. 
 * This visitor is responsible for finding out all marked async function in different statements within //#omp await block.
 * 
 */
public class AsyncFunctionCallSubstitutionVisitor extends PyjamaToJavaVisitor{
	private static int awaitFunctionResultUniqueID = 0;
	private static final String prefixAwaitFunctionResult = "OMP_AwaitFunctionResult_";

	private ScopeInfo scope;
	//This map contains all the method calls should be substituted by itermediate result variables.
	private List<SubstitutionInfo> methodCallSubstitutions = new LinkedList<SubstitutionInfo>();
	private List<OmpAwaitFunctionCallDeclaration> declaredFunctions;
	
	public class SubstitutionInfo {
		public String methodCall;
		public String awaitResult;
		public String returnType;
		public boolean returnVoid = false;
		
		public SubstitutionInfo(String methodName, String variableName, Type returnType) {
			this.methodCall = methodName;
			this.awaitResult = variableName;
			this.returnType = returnType.toString();
			if (this.returnType.toString().equals("void")) {
				returnVoid = true;
			} else {
				returnVoid = false;
			}
		}
	}

	public AsyncFunctionCallSubstitutionVisitor(ScopeInfo scope, List<OmpAwaitFunctionCallDeclaration> functionList) {
		super(null, true);
		this.scope = scope;
		this.declaredFunctions = functionList;
		//Debug_PrintAllSymbols();
	}
	
	@Override
	public void visit(MethodCallExpr n, SourcePrinter printer) {
		OmpAwaitFunctionCallDeclaration matchedAsyncFunctionDeclaration = isDeclaredAsyncMethod(n);
		String methodCall = dumpMethodCallToString(n);
		if (null != matchedAsyncFunctionDeclaration) {
			String substitutionVariable = prefixAwaitFunctionResult + n.getName() + (awaitFunctionResultUniqueID++);
			this.methodCallSubstitutions.add(new SubstitutionInfo(methodCall, substitutionVariable, matchedAsyncFunctionDeclaration.getType()));
			printer.print(substitutionVariable);
			//System.out.println("is declared method:" + n);
		} else {
			//System.out.println("NOT declared method:" + n);
		}
	}
	
	
	private String getMethodExprFullName(MethodCallExpr method) {
		String methodFullname;
		if (method.getScope() != null) {
			methodFullname = method.getScope().toString() + method.getName();
		} else {
			methodFullname = method.getName();
		}
		return methodFullname;
	}
	
	private String dumpMethodCallToString(MethodCallExpr methodExpr) {
		DumpVisitor dump = new DumpVisitor();
		methodExpr.accept(dump, null);
        return dump.getSource();
	}
	
	/*
	 * Check if this method call is declared as an async call, if yes, return the async call declaration.
	 */
	private OmpAwaitFunctionCallDeclaration isDeclaredAsyncMethod(MethodCallExpr method) {
		String methodFullname = getMethodExprFullName(method);
		//System.out.println("check method full name is:" + methodFullname);
		for (OmpAwaitFunctionCallDeclaration asyncFunction: this.declaredFunctions) {
			if (asyncFunction.getName().equals(methodFullname) 
				&&	parametersMatch(method, asyncFunction)) {
				return asyncFunction;
			}
		}

		return null;
	}
	
	private boolean parametersMatch(MethodCallExpr method, OmpAwaitFunctionCallDeclaration asyncFunction) {
		List<Parameter> asyncParameters = asyncFunction.getParameters();
		List<Expression> methodParameters = method.getArgs();
		
		if (null == asyncParameters && null == methodParameters) {
			//If both methods have no argument, directly return true;
			return true;
		} else if (null == asyncParameters || null == methodParameters){
			//Else, if one of the method has no argument, directly return false;
			return false;
		}
		
		if (asyncParameters.size() != methodParameters.size()) {
			return false;
		}
		
		for (int i=0; i<asyncParameters.size(); i++) {
			String type1 = asyncParameters.get(i).getType().toString();
			String type2 = findVariableType(methodParameters.get(i).toString()).toString();
			if (type1.equals(type2)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
	
	private Type findVariableType(String varName) {
		Collection<Symbol> symbols = this.scope.getAllReachableSymbols();
		symbols.addAll(this.scope.getAllDefinedSymbols());
		for (Symbol symbol: symbols) {
			if (symbol.getName().equals(varName)) {
				return symbol.getSymbolDataType();
			}
		}
		return null;
	}
	
	/*This is only used for Debug*/
	private void Debug_PrintAllSymbols() {
		List<Symbol> symbols = this.scope.getAllReachableSymbols();
		for (Symbol symbol: symbols) {
			System.err.println(symbol.getName() + " " + symbol.getSymbolDataType());
		}
		System.err.println("----");
		Collection<Symbol> symbols1 = this.scope.getAllDefinedSymbols();
		for (Symbol symbol: symbols1) {
			System.err.println(symbol.getName() + " " + symbol.getSymbolDataType());
		}
	}
	
	public List<SubstitutionInfo> getSubstitutionInfos() {
		return this.methodCallSubstitutions;
	}

	
}
