package pj.parser.ast.visitor.constructwrappers;
/**
 * This is the representation for <code>parallel for</code>
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pi.ParIterator;
import pi.ParIteratorFactory;
import pj.PjRuntime;
import pj.Pyjama;
import pj.parser.ast.body.VariableDeclarator;
import pj.parser.ast.expr.AssignExpr;
import pj.parser.ast.expr.BinaryExpr;
import pj.parser.ast.expr.Expression;
import pj.parser.ast.expr.MethodCallExpr;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.expr.UnaryExpr;
import pj.parser.ast.expr.VariableDeclarationExpr;
import pj.parser.ast.omp.OmpForConstruct;
import pj.parser.ast.omp.OmpScheduleClause;
import pj.parser.ast.stmt.ForStmt;
import pj.parser.ast.stmt.ForeachStmt;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.symbolscope.ScopeInfo;
import pj.parser.ast.symbolscope.Symbol;
import pj.parser.ast.symbolscope.SymbolTable;
import pj.parser.ast.type.Type;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.SymbolSubstitutionVisitor;
import pj.parser.ast.visitor.dataclausehandler.DataClausesHandler;



public class WorkShareBlockBuilder extends ConstructWrapper{
	
	enum LoopType {Numerical, Iterator};
	
	private SourcePrinter printer;
	private PyjamaToJavaVisitor visitor;
	private OmpForConstruct ompForConstruct;
	
	private int workshareId;
	public HashMap<String, String> varSubstitutionSet = new HashMap<String, String>();
	
	//To indicate whether this loop is number based or iterator based
	LoopType loopType = null;
	
	//These fields are only used for iterator for-loops (The collection the iterator works on)
	private Expression iterOnCollection  = null;
	private String iteratorType = null;
	
	//These fields are used for numerical for-loops 
	private boolean iteratorDeclaration = false; // whether identifier is declared in for loop
	private Expression identifier = null; //the flag variable name in for statement
	private Expression init_expression = null; //the starting number of the iterations
	private Expression end_expression = null; //the ending number of the iterations
	private BinaryExpr.Operator compareOperator = null; //compare operator
	private Expression stride = null; //the increment after each iteration
	
	private Statement forBody = null;
		
	public WorkShareBlockBuilder(OmpForConstruct forNode, PyjamaToJavaVisitor visitor, int id) {	
		this.ompForConstruct = forNode;
		this.visitor = visitor;
		this.printer = new SourcePrinter();
		
		this.workshareId = id;
	}
	
	public OmpForConstruct getForConstruct() {
		return this.ompForConstruct;
	}
	
	public int getID() {
		return this.workshareId;
	}
	
	
	@Override
	public int getBeginLine() {
		return ompForConstruct.getBeginLine();
	}
	@Override
	public int getEndLine() {
		return ompForConstruct.getEndLine();
	}
	
	public String getSource()
	{
		this.parseForLoop();
		this.generateBlock();
		return printer.getSource();
	}
	
	private void parseForLoop() {
		Statement forStmt = this.ompForConstruct.getForStmt();
		if (forStmt instanceof ForStmt) {
			parseSimpleForStmt(forStmt);
		} else if (forStmt instanceof ForeachStmt) {
			parseForEachStmt(forStmt);
		} else {
			throw new RuntimeException("Encountering for-loop that is not an instance of ForStmt or ForeachStmt");
		}
	}
	
	private void parseForEachStmt(Statement forStmt) {
		
		ForeachStmt foreachStmt = (ForeachStmt) forStmt;
		
		forBody = foreachStmt.getBody();
		
		SymbolTable symbolTable = visitor.getSymbolTable();
		ScopeInfo scope = symbolTable.getScopeOfNode(forStmt);
		
		Expression iterExpr = foreachStmt.getIterable();
		VariableDeclarationExpr varDeclExpr = foreachStmt.getVariable();
		VariableDeclarator declarator = ((VariableDeclarationExpr)varDeclExpr).getVars().get(0);
		//Iterator always declared in for-each title
		iteratorDeclaration = true;
		iteratorType = varDeclExpr.getType().toString();
		identifier = new NameExpr(declarator.getId().getName());
		
		if (iterExpr instanceof NameExpr) {
			Symbol symbol = scope.getSymbolByName(((NameExpr)iterExpr).getName());
			String symbolName = symbol.getName();
			String symbolDataType = symbol.getSymbolDataType().toString();
			if (symbolDataType.contains("[]")) {
				/*Iteration on an array, so this for-each is a numerical loop				
				 * The loop of for-each statement always starts from '0', 
				 * end to "array.length", stride is "1"*/
				init_expression = new NameExpr("0");
				end_expression = new NameExpr(symbolName + ".length");
				compareOperator = BinaryExpr.Operator.less;
				stride = new NameExpr("1");

				loopType = LoopType.Numerical;
				return;
			} else {
				//This is a iterator loop
				loopType = LoopType.Iterator;
				// e.g. for(String x : list) 
				this.iterOnCollection = iterExpr;
				return;
			}	
		} else {
			throw new RuntimeException("Pyjama cannot parse the for-each loop in omp for");
		}
	}
		
	private void parseSimpleForStmt(Statement forStmt) {
		ForStmt forSimpleStmt = (ForStmt)forStmt;
		
		forBody = forSimpleStmt.getBody();
		
		Expression firstInitExpr = forSimpleStmt.getInit().get(0);
		if (firstInitExpr instanceof VariableDeclarationExpr) {
			VariableDeclarator declarator = ((VariableDeclarationExpr) firstInitExpr).getVars().get(0);
			iteratorDeclaration = true;
			String initType = ((VariableDeclarationExpr) firstInitExpr).getType().toString();
			Pattern pattern = Pattern.compile("<(.*?)>");
			Matcher matcher = pattern.matcher(initType);
			if (matcher.find()) {
				iteratorType = matcher.group(1);
			}
			identifier = new NameExpr(declarator.getId().getName());
			init_expression = declarator.getInit();
		} else if (firstInitExpr instanceof AssignExpr){
			SymbolTable symbolTable = visitor.getSymbolTable();
			ScopeInfo scope = symbolTable.getScopeOfNode(forStmt);
			Symbol iteratorSymbol = scope.getSymbolByName(((AssignExpr)firstInitExpr).getTarget().toString());
			String initType = iteratorSymbol.getSymbolDataType().toString();
			Pattern pattern = Pattern.compile("<(.*?)>");
			Matcher matcher = pattern.matcher(initType);
			if (matcher.find()) {
				iteratorType = matcher.group(1);
			}

			identifier = ((AssignExpr)firstInitExpr).getTarget();
			init_expression = ((AssignExpr)firstInitExpr).getValue();
		} else {
			throw new RuntimeException("Pyjama cannot parse the init expression in omp for");
		}
		
		
		/*If in a simple for-loop, the second expression(compare expression) is a method call,
		 * then we say this for-loop uses iterator, so don't parse it as an integer-based loop. 
		 * (This may cause problem, but it's temporarily enough for Pyjama, 2015.6.14)
		 */
		if (forSimpleStmt.getCompare() instanceof MethodCallExpr) {
			/*If in a standard for-loop, the second expression is a method call, such as 
		 	 *=> for (Iterator<String> iter = list.iterator(); iter.hasNext();)
		 	 *Then call this for-loop is an iterator for-loop 
			 */
			Expression hasNextExpr = forSimpleStmt.getCompare();
			if (null == hasNextExpr) {
				throw new RuntimeException("Pyjama cannot parse the iterator hasNext expression in omp for");
			}
			this.iterOnCollection = ((MethodCallExpr)init_expression).getScope();
			loopType = LoopType.Iterator;
			return;
		} else {
			loopType = LoopType.Numerical;
		}
		
		BinaryExpr compareExpr = (BinaryExpr)forSimpleStmt.getCompare();
		BinaryExpr.Operator opt = compareExpr.getOperator();
		if (!(   (opt == BinaryExpr.Operator.greater) 
			  || (opt == BinaryExpr.Operator.greaterEquals)
			  || (opt == BinaryExpr.Operator.less)
			  || (opt == BinaryExpr.Operator.lessEquals) )) {
			throw new RuntimeException("illegal compare operator '" + opt.toString() + "' in omp for");
		}
		compareOperator = compareExpr.getOperator();
		end_expression = compareExpr.getRight();
		
		Expression firstUpdateExpr = forSimpleStmt.getUpdate().get(0);
		if (firstUpdateExpr instanceof UnaryExpr) {
			/*
			 * Parse updates such like: i--; i++; ++i; --i;
			 */
			UnaryExpr.Operator unaryOpt = ((UnaryExpr)firstUpdateExpr).getOperator();
			if ((UnaryExpr.Operator.posDecrement == unaryOpt) || (UnaryExpr.Operator.preDecrement == unaryOpt)) {
				stride = new NameExpr("-1");
			} else if ((UnaryExpr.Operator.posIncrement == unaryOpt) || (UnaryExpr.Operator.preIncrement == unaryOpt)) {
				stride = new NameExpr("1");
			}
		} else if (firstUpdateExpr instanceof AssignExpr) {

			AssignExpr.Operator binaryOpt = ((AssignExpr)firstUpdateExpr).getOperator();
			if (AssignExpr.Operator.plus == binaryOpt) {
				/*
				 * Parse updates such like i+=stride;
				 */
				Expression strideNum = ((AssignExpr)firstUpdateExpr).getTarget();
				stride = new NameExpr(strideNum.toString());
			} else if (AssignExpr.Operator.minus == binaryOpt) {
				/*
				 * Parse updates such like i-=stride;
				 */
				Expression strideNum = ((AssignExpr)firstUpdateExpr).getTarget();
				stride = new NameExpr("-"+strideNum.toString());
			} else if (AssignExpr.Operator.assign == binaryOpt) {
				/*
				 * Parse updates such like i=i[+-]stride;
				 */
				NameExpr targetIdentifier = (NameExpr) ((AssignExpr)firstUpdateExpr).getTarget();
				BinaryExpr valueExpr = (BinaryExpr) ((AssignExpr)firstUpdateExpr).getValue();
				NameExpr updateIdentifier = (NameExpr) valueExpr.getLeft();
				if (!updateIdentifier.toString().equals(this.identifier.toString()) ||
						!targetIdentifier.toString().equals(this.identifier.toString())) {
					throw new RuntimeException("Pyjama cannot parse the update expression in omp for");
				}
				BinaryExpr.Operator strideOpt = valueExpr.getOperator();
				Expression strideExpr = valueExpr.getRight();
				if (BinaryExpr.Operator.plus == strideOpt) {
					stride = new NameExpr(strideExpr.toString());
				} else if (BinaryExpr.Operator.minus == strideOpt) {
					stride = new NameExpr("-" + strideExpr.toString());
				} else {
					throw new RuntimeException("Pyjama cannot parse the update expression in omp for");
				}
			}
		} else  {
			throw new RuntimeException("Pyjama cannot parse the update expression in omp for");
		}
	}
	
	private void varSubstitution() {
		SymbolSubstitutionVisitor substitutionVisitor = new SymbolSubstitutionVisitor(this.varSubstitutionSet);
		this.forBody.accept(substitutionVisitor, null);
	}
	
	private void generateLoop() {
		switch(this.loopType) {
		case Numerical:
			generateNumericalLoop();
			break;
		case Iterator:
			generateIteratorLoop();
			break;
		}
	}
	
	private void generateIteratorLoop() {

		this.varSubstitution();
		
		OmpScheduleClause schClause = this.ompForConstruct.getScheduleClause();
		//For iterators, we set default schedule type as dynamic, and default chunkSize is 1.
		OmpScheduleClause.Type schType = OmpScheduleClause.Type.Dynamic;
		Expression chunkSize = new NameExpr("1");
		
		if (null != schClause) {
			schType = schClause.getScheduleType();
			if (schClause.getChunkSize() != null) {
				chunkSize = schClause.getChunkSize();
			}
		}
		
		String chunkSizeStr = chunkSize.toString();
		String schTypeStr = null;
		switch (schType) {
		case Static:
			schTypeStr = "STATIC";
			break;
		case Dynamic:
			schTypeStr = "DYNAMIC";
			break;
		case Guided:
			schTypeStr = "GUIDED";
			break;
		default:
		}

		/*
		 * using Parallel Iterator to ensure thread-safety
		 */
		
		/*
		 * Master thread is responsible for creating Parallel Iterator
		 * iter = ParIteratorFactory.createParIterator(list, this.OMP_threadNumber, ParIterator.Schedule.STATIC, 3);
		 */
		printer.printLn("ParIterator<" + this.iteratorType + "> " + identifier + " = null;");
		printer.printLn("if (0 == Pyjama.omp_get_thread_num()) {");
		printer.indent();
		printer.printLn("OMP__ParIteratorCreator = " + "ParIteratorFactory.createParIterator("
					+ this.iterOnCollection + ", Pyjama.omp_get_num_threads(), ParIterator.Schedule." 
					+ schTypeStr + ", "
					+ chunkSizeStr + ");");
		printer.unindent();
		printer.printLn("}");
		printer.printLn("PjRuntime.setBarrier();");
		printer.printLn(identifier + " = (ParIterator<" + this.iteratorType + ">)" + "OMP__ParIteratorCreator;");
		///////////
		printer.printLn();
		printer.printLn("while (" + identifier + ".hasNext()) {");
		printer.indent();
		//BEGIN user code 
		this.forBody.accept(visitor, printer);
		//END user code
		printer.unindent();
		printer.printLn("}");
	}
	
	private void generateNumericalLoop() {
		
		this.varSubstitution();
		
		OmpScheduleClause schClause = this.ompForConstruct.getScheduleClause();
		OmpScheduleClause.Type schType = null;
		Expression chunkSize = null;
		
		if (null != schClause) {
			schType = schClause.getScheduleType();
			if (schClause.getChunkSize() != null) {
				chunkSize = schClause.getChunkSize();
			}
		}
		
		printer.printLn((iteratorDeclaration?"int ":"")+identifier+"=0;");
		
		printer.printLn("int OMP_iterator = 0;");
		printer.printLn("int OMP_end = (int)((" + end_expression + ")-(" + init_expression + "))/(" + stride + ");");
		if (BinaryExpr.Operator.less == compareOperator || BinaryExpr.Operator.greater == compareOperator) {
			printer.printLn("if (((" + end_expression + ")-(" + init_expression + "))%(" + stride + ") == 0) {");
			printer.indent();
			printer.printLn("OMP_end = OMP_end - 1;");
			printer.unindent();
			printer.printLn("}");
		}
		/*
		 * Default scheduling type
		 */
		if(null == schClause){
			printer.printLn("int OMP_local_iterator = 0;");
			printer.printLn("int OMP_Chunk_Starting_point = 0;");
			printer.printLn("int OMP_Default_chunkSize_autoGenerated = (OMP_end+1)/Pyjama.omp_get_num_threads();");
			printer.printLn("if (Pyjama.omp_get_thread_num() < (OMP_end+1) % Pyjama.omp_get_num_threads()) {");
			printer.indent();
			printer.printLn("++OMP_Default_chunkSize_autoGenerated;");
			printer.printLn("OMP_Chunk_Starting_point = Pyjama.omp_get_thread_num() * OMP_Default_chunkSize_autoGenerated;");
			printer.unindent();
			printer.printLn("} else {");
			printer.indent();
			printer.printLn("OMP_Chunk_Starting_point = Pyjama.omp_get_thread_num() * OMP_Default_chunkSize_autoGenerated + (OMP_end+1) % Pyjama.omp_get_num_threads();");
			printer.unindent();
			printer.printLn("}");

			printer.printLn("for (OMP_local_iterator=OMP_Chunk_Starting_point; OMP_local_iterator<OMP_Chunk_Starting_point+OMP_Default_chunkSize_autoGenerated && OMP_Default_chunkSize_autoGenerated>0; ++OMP_local_iterator) {");
			printer.indent();
			printer.printLn(identifier+" = " + init_expression + " + OMP_local_iterator * (" + stride + ");");
			//BEGIN user code 
			this.forBody.accept(visitor, printer);
			//END user code
			//BEGIN lastprivate value return
			printer.printLn("if (OMP_end == OMP_local_iterator) {");
			printer.indent();
			printer.printLn("//BEGIN lastprivate variables value set");
			DataClausesHandler.updateLastprivateForWorksharingBlock(this, printer);
			printer.printLn("//END lastprivate variables value set");
			printer.unindent();
			printer.printLn("}");
			//END lastprivate value return
			printer.unindent();
			printer.printLn("}");
		}	
		/*
		 * Static and default scheduling type
		 */
		if(OmpScheduleClause.Type.Static == schType){
			
			if (null == chunkSize) {
				chunkSize= new NameExpr("1");
			}
			
			printer.printLn("int __omp_loop_thread_num = Pyjama.omp_get_thread_num();");
			printer.printLn("int __omp_loop_num_threads = Pyjama.omp_get_num_threads();");
			
			printer.printLn("for (OMP_iterator=__omp_loop_thread_num*"+chunkSize+"; OMP_iterator<="+"OMP_end && " + chunkSize +">0; OMP_iterator=OMP_iterator+__omp_loop_num_threads*"+chunkSize+") {");
			printer.indent();
			printer.printLn("for (int OMP_local_iterator = OMP_iterator; OMP_local_iterator<OMP_iterator+"+chunkSize+" && OMP_local_iterator<=OMP_end; "
							+"OMP_local_iterator++){");
			printer.indent();
			printer.printLn(identifier+" = " + init_expression + " + OMP_local_iterator * (" + stride + ");");
			//BEGIN user code 
			this.forBody.accept(visitor, printer);
			//END user code
			//BEGIN lastprivate value return
			printer.printLn("if (OMP_end == OMP_local_iterator) {");
			printer.indent();
			printer.printLn("//BEGIN lastprivate variables value set");
			DataClausesHandler.updateLastprivateForWorksharingBlock(this, printer);
			printer.printLn("//END lastprivate variables value set");
			printer.unindent();
			printer.printLn("}");
			//END lastprivate value return
			printer.unindent();
			printer.printLn("}");
			printer.unindent();
			printer.printLn("}");
		}	
		
		/*
		 * dynamic scheduling type
		 */
		if(OmpScheduleClause.Type.Dynamic == schType){
			
			if (null == chunkSize) {
				chunkSize= new NameExpr("1");
			}
			
			printer.printLn("if (0 == Pyjama.omp_get_thread_num()) {");
			printer.indent();
			printer.print("PjRuntime.get_OMP_loopCursor().getAndSet(0);");
			printer.unindent();
			printer.printLn("}");
			printer.printLn("PjRuntime.setBarrier();");

			printer.printLn("while ((OMP_iterator = PjRuntime.get_OMP_loopCursor().getAndAdd("+chunkSize+")) <= OMP_end) {");	
			printer.indent();
			printer.printLn("for (int OMP_local_iterator = OMP_iterator; OMP_local_iterator<OMP_iterator+"+chunkSize+" && OMP_local_iterator<=OMP_end; "
							+"OMP_local_iterator++){");
			printer.indent();
			printer.printLn(identifier+" = " + init_expression + " + OMP_local_iterator * (" + stride + ");");
			//BEGIN user code 
			this.forBody.accept(visitor, printer);
			//END user code
			//BEGIN lastprivate value return
			printer.printLn("if (OMP_end == OMP_local_iterator) {");
			printer.indent();
			printer.printLn("//BEGIN lastprivate variables value set");
			DataClausesHandler.updateLastprivateForWorksharingBlock(this, printer);
			printer.printLn("//END lastprivate variables value set");
			printer.unindent();
			printer.printLn("}");
			//END lastprivate value return
			printer.printLn();
			printer.unindent();
			printer.printLn("}");
			///
			printer.unindent();
			printer.printLn("}");
			
		}	
		/*
		 * guided scheduling type
		 */
		if(OmpScheduleClause.Type.Guided == schType){
			
			if (null == chunkSize) {
				chunkSize= new NameExpr("1");
			}
						
			printer.printLn("int OMP_chunkSize = " + chunkSize + ";");
			printer.print("if (0 == Pyjama.omp_get_thread_num()) {");
			printer.printLn("PjRuntime.get_OMP_loopCursor().getAndSet(0);}");
			printer.printLn("PjRuntime.setBarrier();");

			printer.printLn("while ((OMP_iterator = PjRuntime.get_OMP_loopCursor().getAndAdd(OMP_chunkSize)) <= OMP_end) {");	
			printer.indent();
			printer.printLn("for (int OMP_local_iterator = OMP_iterator; OMP_local_iterator<OMP_iterator+OMP_chunkSize && OMP_local_iterator<=OMP_end; "
							+"OMP_local_iterator++){");
			printer.indent();
			printer.printLn(identifier+" = " + init_expression + " + OMP_local_iterator * (" + stride + ");");
			//BEGIN user code 
			this.forBody.accept(visitor, printer);
			//END user code
			//BEGIN lastprivate value return
			printer.printLn("if (OMP_end == OMP_local_iterator) {");
			printer.indent();
			printer.printLn("//BEGIN lastprivate variables value set");
			DataClausesHandler.updateLastprivateForWorksharingBlock(this, printer);
			printer.printLn("//END lastprivate variables value set");
			printer.unindent();
			printer.printLn("}");
			//END lastprivate value return
			printer.printLn();
			printer.unindent();
			printer.printLn("}");
			printer.printLn("if(OMP_chunkSize>1)OMP_chunkSize--;");
			///
			printer.unindent();
			printer.printLn("}");
			
		}	
	}
	private void generateBlock() {
		printer.printLn();
		printer.indent();printer.indent();printer.indent();printer.indent();
		//////////////////////////////////////////////
		printer.print("{");
		printer.indent();
		/////////////////BEGIN parallel worksharing code conversion///////////////////
		printer.printLn("//#BEGIN firstprivate lastprivate reduction variables defined and initialized here");
		DataClausesHandler.redeclarePrivateVariablesForWorksharingBlock(this, printer);
		printer.printLn("//#set implicit barrier here, otherwise unexpected initial value happens");
		printer.printLn("PjRuntime.setBarrier();");
		printer.printLn("//#END firstprivate lastprivate reduction variables defined and initialized here");
		
		// print the real for-loop code and enclosed user code
		printer.printLn("try{");
		printer.indent();
		generateLoop();
		printer.unindent();
		printer.printLn("} catch (pj.pr.exceptions.OmpWorksharingLocalCancellationException wse){");
		printer.printLn("} catch (Exception e){throw e;}");
		printer.printLn("//BEGIN  reduction");
		printer.printLn("PjRuntime.reductionLockForWorksharing.lock();");
		DataClausesHandler.reductionForWorksharingBlock(this, printer);
		printer.print("PjRuntime.reductionLockForWorksharing.unlock();");
		printer.printLn("//END reduction");

		if (!this.ompForConstruct.isNowait()) {
			printer.printLn("PjRuntime.setBarrier();");
		}
		printer.unindent();
		printer.printLn("}");
		
		/////////////////END parallel worksharing code conversion///////////////////

	}
}
