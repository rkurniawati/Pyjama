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
import pj.parser.ast.body.VariableDeclarator;
import pj.parser.ast.expr.AssignExpr;
import pj.parser.ast.expr.BinaryExpr;
import pj.parser.ast.expr.Expression;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.expr.UnaryExpr;
import pj.parser.ast.expr.VariableDeclarationExpr;
import pj.parser.ast.omp.OmpForConstruct;
import pj.parser.ast.omp.OmpScheduleClause;
import pj.parser.ast.stmt.ForStmt;
import pj.parser.ast.stmt.ForeachStmt;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.visitor.SourcePrinter;
import pj.parser.ast.visitor.SymbolSubstitutionVisitor;
import pj.parser.ast.visitor.dataclausehandler.DataClausesHandler;



public class WorkShareBlockBuilder extends ConstructWrapper{
	
	private SourcePrinter printer;
	private PyjamaToJavaVisitor visitor;
	private OmpForConstruct ompForConstruct;
	
	private int workshareId;
	public HashMap<String, String> varSubstitutionSet = new HashMap<String, String>();
	
	private boolean iteratorDeclaration = false; // whether identifier is declared in for loop
	private Expression identifier = null; //the flag variable name in for statement
	private Expression init_expression = null; //the starting number of the iterations
	private Expression end_expression = null; //the ending number of the iterations
	private Expression compareOperator = null; //compare operator
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
		this.generateMethod();
		return printer.getSource();
	}
	
	private void parseForLoop() {
		Statement forStmt = this.ompForConstruct.getForStmt();
		
		if (forStmt instanceof ForStmt) {
			parseSimpleForStmt(forStmt);
		} else if (forStmt instanceof ForeachStmt) {
			throw new RuntimeException("Pyjama currently cannot support for-each loop parallisation");
		}
	}
	
	private void parseSimpleForStmt(Statement forStmt) {
		ForStmt forSimpleStmt = null;
		forSimpleStmt = (ForStmt)forStmt;
		
		forBody = forSimpleStmt.getBody();
		
		Expression firstInitExpr = forSimpleStmt.getInit().get(0);
		if (firstInitExpr instanceof VariableDeclarationExpr) {
			VariableDeclarator declarator = ((VariableDeclarationExpr) firstInitExpr).getVars().get(0);
			iteratorDeclaration = true;
			identifier = new NameExpr(declarator.getId().getName());
			init_expression = declarator.getInit();
		} else if (firstInitExpr instanceof AssignExpr){
			identifier = ((AssignExpr)firstInitExpr).getTarget();
			init_expression = ((AssignExpr)firstInitExpr).getValue();
		} else {
			throw new RuntimeException("Pyjama cannot parse the init expression in omp for");
		}
		
		BinaryExpr compareExpr = (BinaryExpr)forSimpleStmt.getCompare();
		BinaryExpr.Operator opt = compareExpr.getOperator();
		if (!(   (opt == BinaryExpr.Operator.greater) 
			  || (opt == BinaryExpr.Operator.greaterEquals)
			  || (opt == BinaryExpr.Operator.less)
			  || (opt == BinaryExpr.Operator.lessEquals) )) {
			throw new RuntimeException("illegal compare operator '" + opt.toString() + "' in omp for");
		}
		compareOperator = new NameExpr(compareExpr.getOperator().toString());
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
		if (compareOperator.toString().equals("<") || compareOperator.toString().equals(">")) {
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
	private void generateMethod() {
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
		generateLoop();
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
