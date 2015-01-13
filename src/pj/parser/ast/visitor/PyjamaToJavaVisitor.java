package pj.parser.ast.visitor;
/**
 * @author Xing Fan
 * @version 1.0
 */

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
import java.util.Iterator;
import java.util.List;

public class PyjamaToJavaVisitor implements VoidVisitor<SourcePrinter> {
	
	protected File file;
	protected String compilationFileName;
	protected final static String PYJAMA_FILE_EXTENSION = ".pj";
	
	protected int nextOpenMPRegionUniqueID = 0;
	protected int nextWorkShareID = 0;
	protected int nextGuiCodeID = 0;
	protected final String prefixTaskNameForParallelRegion = "_OMP_ParallelRegion_";
	protected final String prefixTaskNameForWorkShare = "_OMP_WorkShare_";
	protected final String prefixTaskNameForGuiCode = "_OMP_GuiCode_";
	
	protected SourcePrinter CodePrinter = new SourcePrinter();
	protected SourcePrinter PrinterForPRClass = new SourcePrinter();
//	public SourcePrinter PrinterForWSMethod = new SourcePrinter();
	
	//keep track of current method whether is static, used for the generate of parallel region class, and work share method
	protected boolean currentMethodIsStatic = false; 
	//keep track of current method or constructor's statements, this statements may used in freeguithread visitor
	protected List<Statement> currentMethodOrConstructorStmts = null;
	//keep track of current method return type
	protected Type currentMethodType = null;
	//keep track of current type of declaration of variables 2014.7.14
	protected Type currentVarDeclarationType = null;
	//if current var declaration is in foreach header, do not give initial value 2014.7.4 => 2014.10.27
	protected boolean needNotVarInit = false;
	//keep track of current worksharing block's private variables, including firstprivate, lastprivate, and reduction
	/*
	 * currentPrivateVariableInOMPWorksharingBlock: contain all variable name inside current //#omp for or //#omp sections
	 * need to be renamed. This is used in NameExpr visitor.
	 */
	protected HashMap<String,String>  currentPrivateVariableInOMPWorksharingBlock = new HashMap<String,String>();
	
	private SymbolTable symbolTable = null;
	
	public PyjamaToJavaVisitor(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}
	
	//OpenMP add BEGIN*******************************************************************************OpenMP add BEGIN//
	public void visit(Node n, SourcePrinter printer){
		throw new RuntimeException("Node: This abstract class should not appear.");
	}
	
//	public void visit(ForStmtSimple n, SourcePrinter printer) {
//		n.getBody().accept(this, printer);
//		//Visit the user code in for loop instead of all the for loop statement
//	}
	//------------------------------------------------------
    public void visit(OmpParallelConstruct n, SourcePrinter printer){
    	
    	//get current OmpParallelConstruct's scopeinfo from symbolTable
    	n.scope = this.symbolTable.getScopeOfNode(n);
    	n.processAllReachableVariablesIfNecessary();
    	
		int uniqueOpenMPRegionID = nextOpenMPRegionUniqueID++;

		ParallelRegionClassBuilder currentPRClass = new ParallelRegionClassBuilder(n, this.currentMethodIsStatic, this, this.currentMethodOrConstructorStmts);
		currentPRClass.className = prefixTaskNameForParallelRegion + uniqueOpenMPRegionID;

		
		printer.printLn("/*OpenMP Parallel region (#" + uniqueOpenMPRegionID + ") -- START */");
		String numThreadsClause = "";

		//Print Parallel Region Class Code
		this.PrinterForPRClass.printLn(currentPRClass.getSource());
		
		String previous_icv = "icv_previous_" + currentPRClass.className;
		String new_icv = "icv_" + currentPRClass.className;
		String thread_number = "_threadNum_" + currentPRClass.className;
		String inputlist = "inputlist_" + currentPRClass.className;
		String outputlist = "outputlist_" + currentPRClass.className;
		printer.printLn("InternalControlVariables " + previous_icv + " = PjRuntime.getCurrentThreadICV();");
		printer.printLn("InternalControlVariables " + new_icv + " = PjRuntime.inheritICV(" + previous_icv + ");");
		printer.printLn("int " + thread_number + " = " + new_icv + ".nthreads_var.get("+ new_icv + ".levels_var);");
		printer.printLn("ConcurrentHashMap<String, Object> " + inputlist + " = new ConcurrentHashMap<String,Object>();");
		printer.printLn("ConcurrentHashMap<String, Object> " + outputlist + " = new ConcurrentHashMap<String,Object>();");
		
		DataClausesHandler.processDataClausesBeforePRClassInvocation(currentPRClass, printer);
		
		printer.printLn(currentPRClass.className + " " + currentPRClass.className + "_in = new "+ currentPRClass.className + "(" + thread_number +numThreadsClause+ "," + new_icv + "," + inputlist + "," + outputlist + ");");
		printer.printLn(currentPRClass.className + "_in" + ".runParallelCode();");
		
		
		if (!n.isFreegui()) {
			// if directive is normal parallel directive, recovery data from PRClass
			DataClausesHandler.processDataClausesAfterPRClassInvocation(currentPRClass, printer);
			printer.printLn("PjRuntime.recoverParentICV(" + previous_icv + ");");
		}else if (n.isFreegui()) {
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
    	
    	int uniqueWorkShareRegionID = nextWorkShareID++;
    	
		WorkShareBlockBuilder currentWSBlock = new WorkShareBlockBuilder(n, this, uniqueWorkShareRegionID);
		
    	printer.printLn("/*OpenMP Work Share region (#" + uniqueWorkShareRegionID + ") -- START */");
		
    	//Print Work Share Region
		printer.printLn(currentWSBlock.getSource());
		
		printer.printLn("PjRuntime.setBarrier();");
	
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
    public void visit(OmpBarrierDirective n, SourcePrinter printer){
    	printer.printLn("PjRuntime.setBarrier();");
    }
    public void visit(OmpFlushDirective n, SourcePrinter printer){
    	printer.printLn("PjRuntime.flushMemory();");
    }

    public void visit(OmpFreeguiConstruct n, SourcePrinter printer){
    	throw new RuntimeException("OmpFreeguiConstruct should be normalised ad OmpParallelConstruct with freegui property");
    }

    public void visit(OmpGuiConstruct n, SourcePrinter printer){
    	//get current OmpParallelConstruct's scopeinfo from symbolTable
    	n.scope = this.symbolTable.getScopeOfNode(n);
    	
    	int uniqueGuiCodeID = nextGuiCodeID++;

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
	


	public void visit(OmpCancellationPointDirective n, SourcePrinter printer) {
		if (n.getRegion() == OmpCancellationPointDirective.Region.Parallel) {
			printer.printLn("PjRuntime.checkParallelCancellationPoint();");
		} else {	
		}
	}

	public void visit(OmpCancelDirective n, SourcePrinter printer) {
		if (n.getRegion() == OmpCancelDirective.Region.Parallel) {
			if (n.getThreadAffiliate() == OmpCancelDirective.ThreadAffiliate.Global) {
				printer.printLn("throw new pj.pr.exceptions.OmpParallelRegionGlobalCancellationException();");
			} else if (n.getThreadAffiliate() == OmpCancelDirective.ThreadAffiliate.Local) {
				printer.printLn("throw new pj.pr.exceptions.OmpParallelRegionLocalCancellationException();");
			}

		} else if (n.getRegion() == OmpCancelDirective.Region.For || n.getRegion() == OmpCancelDirective.Region.Sections){
			if (n.getThreadAffiliate() == OmpCancelDirective.ThreadAffiliate.Global) {
				printer.printLn("throw new pj.pr.exceptions.OmpParallelRegionGlobalCancellationException();");
			} else if (n.getThreadAffiliate() == OmpCancelDirective.ThreadAffiliate.Local) {
				printer.printLn("throw new pj.pr.exceptions.OmpWorksharingLocalCancellationException();");
			}
		} else if (n.getRegion() == OmpCancelDirective.Region.Taskgroup) {
			throw new RuntimeException("Pyjama does not support omp task yet!");
		}
	}
	    
	//OpenMP add END*********************************************************************************OpenMP add END//
	   public void visit(CompilationUnit n, SourcePrinter printer) {
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
	        //Xing added for keep track of current method's all statements
	        this.currentMethodOrConstructorStmts = new ArrayList<Statement>();
	        this.currentMethodOrConstructorStmts = n.getBody().getStmts();
	        this.currentMethodType = n.getType();
	        //Xing added for checking current method is static or not
	        if (ModifierSet.isStatic(n.getModifiers())) {
	            this.currentMethodIsStatic = true;
	        }
	        else {
	        	this.currentMethodIsStatic = false;
	        }
	        
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
				//XING add -- shutdown Pyjama runtime at the end of main method
				//Xing commented at 2015.1.11, needn't shutdown because don't use ThreadPoolExecutor
//				if (n.getName().equals("main")) {
//					printer.printLn();
//					printer.printLn("//Pyjama runtime shutdown at the end of main method");
//					printer.printLn("PjRuntime.shutdown();");
//				}
				printer.print("}");
	        }
	        ///Xing added to print Auxilary parallel region class if current method have PR region.
			printer.printLn(this.PrinterForPRClass.getSource());
			this.PrinterForPRClass.clear();
			this.currentMethodOrConstructorStmts = null;
			this.currentMethodType = null;
			///Xing added
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
    	printer.printLn("import java.util.concurrent.*;");
    	printer.printLn("import java.util.concurrent.atomic.AtomicBoolean;");
    	printer.printLn("import java.util.concurrent.atomic.AtomicInteger;");
    	printer.printLn("import java.util.concurrent.atomic.AtomicReference;");
    	printer.printLn("import java.util.concurrent.locks.ReentrantLock;");
    	printer.printLn("import javax.swing.SwingUtilities;");
    	printer.printLn("import java.lang.reflect.InvocationTargetException;");
    	printer.printLn("import pj.pr.exceptions.OmpParallelRegionLocalCancellationException;");
    	
    	return printer.getSource();
    }
    
    ////////////////////PRIVATE METHODS END////////////////////
	public PyjamaToJavaVisitor(File file) {
		this.file = file;
		this.compilationFileName = this.file.getName().substring(0,
				this.file.getName().indexOf(PYJAMA_FILE_EXTENSION));
	}
	
	public String getSource() {
		return CodePrinter.getSource();
	}
	/********************************************************************************************************************************/
}