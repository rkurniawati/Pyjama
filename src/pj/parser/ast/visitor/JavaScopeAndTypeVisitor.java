package pj.parser.ast.visitor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import pj.ErrorParser;
import pj.IncompatibleType;
import pj.parser.ast.BlockComment;
import pj.parser.ast.CompilationUnit;
import pj.parser.ast.ImportDeclaration;
import pj.parser.ast.LineComment;
import pj.parser.ast.Node;
import pj.parser.ast.PackageDeclaration;
import pj.parser.ast.TypeParameter;
import pj.parser.ast.body.AnnotationDeclaration;
import pj.parser.ast.body.AnnotationMemberDeclaration;
import pj.parser.ast.body.BodyDeclaration;
import pj.parser.ast.body.ClassOrInterfaceDeclaration;
import pj.parser.ast.body.ConstructorDeclaration;
import pj.parser.ast.body.EmptyMemberDeclaration;
import pj.parser.ast.body.EmptyTypeDeclaration;
import pj.parser.ast.body.EnumConstantDeclaration;
import pj.parser.ast.body.EnumDeclaration;
import pj.parser.ast.body.FieldDeclaration;
import pj.parser.ast.body.InitializerDeclaration;
import pj.parser.ast.body.JavadocComment;
import pj.parser.ast.body.MethodDeclaration;
import pj.parser.ast.body.ModifierSet;
import pj.parser.ast.body.OpenMP_ThreadPrivate;
import pj.parser.ast.body.Parameter;
import pj.parser.ast.body.TypeDeclaration;
import pj.parser.ast.body.VariableDeclarator;
import pj.parser.ast.body.VariableDeclaratorId;
import pj.parser.ast.expr.AnnotationExpr;
import pj.parser.ast.expr.ArrayAccessExpr;
import pj.parser.ast.expr.ArrayCreationExpr;
import pj.parser.ast.expr.ArrayInitializerExpr;
import pj.parser.ast.expr.AssignExpr;
import pj.parser.ast.expr.BinaryExpr;
import pj.parser.ast.expr.BooleanLiteralExpr;
import pj.parser.ast.expr.CastExpr;
import pj.parser.ast.expr.CharLiteralExpr;
import pj.parser.ast.expr.ClassExpr;
import pj.parser.ast.expr.ConditionalExpr;
import pj.parser.ast.expr.DoubleLiteralExpr;
import pj.parser.ast.expr.EnclosedExpr;
import pj.parser.ast.expr.Expression;
import pj.parser.ast.expr.FieldAccessExpr;
import pj.parser.ast.expr.InstanceOfExpr;
import pj.parser.ast.expr.IntegerLiteralExpr;
import pj.parser.ast.expr.IntegerLiteralMinValueExpr;
import pj.parser.ast.expr.LongLiteralExpr;
import pj.parser.ast.expr.LongLiteralMinValueExpr;
import pj.parser.ast.expr.MarkerAnnotationExpr;
import pj.parser.ast.expr.MemberValuePair;
import pj.parser.ast.expr.MethodCallExpr;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.expr.NormalAnnotationExpr;
import pj.parser.ast.expr.NullLiteralExpr;
import pj.parser.ast.expr.ObjectCreationExpr;
import pj.parser.ast.expr.OpenMP_CompareExpression;
import pj.parser.ast.expr.OpenMP_DataClause;
import pj.parser.ast.expr.OpenMP_ScheduleClause;
import pj.parser.ast.expr.OpenMP_UpdateExpression;
import pj.parser.ast.expr.QualifiedNameExpr;
import pj.parser.ast.expr.SingleMemberAnnotationExpr;
import pj.parser.ast.expr.StringLiteralExpr;
import pj.parser.ast.expr.SuperExpr;
import pj.parser.ast.expr.SuperMemberAccessExpr;
import pj.parser.ast.expr.ThisExpr;
import pj.parser.ast.expr.UnaryExpr;
import pj.parser.ast.expr.VariableDeclarationExpr;
import pj.parser.ast.stmt.AssertStmt;
import pj.parser.ast.stmt.BlockStmt;
import pj.parser.ast.stmt.BreakStmt;
import pj.parser.ast.stmt.CatchClause;
import pj.parser.ast.stmt.ContinueStmt;
import pj.parser.ast.stmt.DoStmt;
import pj.parser.ast.stmt.EmptyStmt;
import pj.parser.ast.stmt.ExplicitConstructorInvocationStmt;
import pj.parser.ast.stmt.ExpressionStmt;
import pj.parser.ast.stmt.FakeStatement;
import pj.parser.ast.stmt.ForStmt;
import pj.parser.ast.stmt.ForStmtSimple;
import pj.parser.ast.stmt.ForeachStmt;
import pj.parser.ast.stmt.IfStmt;
import pj.parser.ast.stmt.LabeledStmt;
import pj.parser.ast.stmt.OpenMP_Atomic_Construct;
import pj.parser.ast.stmt.OpenMP_Barrier_Directive;
import pj.parser.ast.stmt.OpenMP_Critical_Construct;
import pj.parser.ast.stmt.OpenMP_Flush_Directive;
import pj.parser.ast.stmt.OpenMP_For_Construct;
import pj.parser.ast.stmt.OpenMP_Gui_Construct;
import pj.parser.ast.stmt.OpenMP_Interrupt_Construct;
import pj.parser.ast.stmt.OpenMP_Master_Construct;
import pj.parser.ast.stmt.OpenMP_Nogui_Construct;
import pj.parser.ast.stmt.OpenMP_Ordered_Construct;
import pj.parser.ast.stmt.OpenMP_Parallel_Construct;
import pj.parser.ast.stmt.OpenMP_Parallel_For_Construct;
import pj.parser.ast.stmt.OpenMP_Parallel_Sections_Construct;
import pj.parser.ast.stmt.OpenMP_Sections_Construct;
import pj.parser.ast.stmt.OpenMP_Single_Construct;
import pj.parser.ast.stmt.ReturnStmt;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.stmt.SwitchEntryStmt;
import pj.parser.ast.stmt.SwitchStmt;
import pj.parser.ast.stmt.SynchronizedStmt;
import pj.parser.ast.stmt.ThrowStmt;
import pj.parser.ast.stmt.TryStmt;
import pj.parser.ast.stmt.TypeDeclarationStmt;
import pj.parser.ast.stmt.WhileStmt;
import pj.parser.ast.type.ClassOrInterfaceType;
import pj.parser.ast.type.FakeType;
import pj.parser.ast.type.PrimitiveType;
import pj.parser.ast.type.ReferenceType;
import pj.parser.ast.type.Type;
import pj.parser.ast.type.VoidType;
import pj.parser.ast.type.WildcardType;
import pj.symbol.Scope;
import pj.symbol.SymbolTable;

/**
 * Stores scoping and typing information for the AST being traversed. Uses the
 * original DumpVisitor as a foundation to determine the variable types. Usage: <br>
 * <br>
 * <code>
 * <pre>
 * File file = new File("/home/user/MyProject/src/mypackage/Test.java");
 * InputStream is = new FileInputStream(file);
 * CompilationUnit cu = JavaParser.parse(is);	// create AST as usual
 * JavaScopeAndTypeVisitor scopeVisitor = new JavaScopeAndTypeVisitor(file);
 * cu.accept(scopeVisitor, null);
 * // after visiting, the CompulationUnit now stores scoping and type info.
 * 
 * MyVisitor myVisitor = new MyVisitor();
 * cu.accept(myVisitor, null);		// use your own visitor on the same AST
 * 
 * // Then, inside your visitor implementation, access the scope from each node as required, e.g.:
 * 
 * public void visit(NameExpr n, Object arg) {
 *    String varName = n.getName();
 *    printer.print(varName);
 *    Scope currentScope = n.getVarScope();
 *    if (currentScope.isDefined(varName)) {
 *       String type = currentScope.getType(varName);
 *       System.out.println("NameExpr: "+varName+" is of type: "+type);
 *    }
 * }
 * 
 * // Similarly in visit(FieldAccessExpr):
 * 
 * if (currentScope.isDefined(varName)) {
 *    System.out.println("FieldAccessExpr: "+varName+" is of type: "+currentScope.getType(varName));
 * }
 * </pre>
 * </code>
 * 
 * @author vikassingh (modifications for scoping and typing)
 * @author Nasser Giacaman (modifications for scoping and typing)
 * @author Oliver Sinnen (modifications for scoping and typing)
 * @author Julio Vilmar Gesser (original AST DumpVisitor implementation)
 * @version 1.0.1
 */
public final class JavaScopeAndTypeVisitor implements VoidVisitor<Object> {

	/*
	 * We use this prefix before the name of
	 * temporary file 
	 */
	private static String TEMP_PREFIX = "Temp_";
	private boolean mInsideMethod = false;
	private File mOriginalFile;
	private SymbolTable mSymbolTable = new SymbolTable();

	/*
	 * The different source printers that we use
	 */
	private final SourcePrinter mPrinter = new SourcePrinter();
	private final SourcePrinter mDelayedPrinter = new SourcePrinter();
	private final SourcePrinter mDelayedPrinterForDataClauses = new SourcePrinter();

	public JavaScopeAndTypeVisitor(File fileOriginal) {
		this.mOriginalFile = fileOriginal;
	}

	/*
	 * The overloaded visit methods follow. This is in line with the
	 * overall visitor pattern 
	 * 
	 * @see pj.parser.ast.visitor.VoidVisitor#visit(pj.parser.ast.expr.NameExpr, java.lang.Object)
	 */
	public void visit(NameExpr n, Object arg) {
		String varName = n.getName();

		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(varName);
		if (mInsideMethod) {
			if (mDelayedPrinter.isEmpty())
				mDelayedPrinter.setIndentLevel(0);
			else
				mDelayedPrinter.setIndentLevel(mPrinter.getIndentLevel());

			mDelayedPrinter.printLn(varName
					+ " = new DummyClassToDetermineVariableType();"
					+ ErrorParser.separator
					+ mSymbolTable.getCurrentScope().getFullScopeName());
		}
	}

	public void visit(FieldAccessExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		n.getScope().accept(this, arg);
		mPrinter.print(".");
		mPrinter.print(n.getField());
		if (mDelayedPrinter.isEmpty())
			mDelayedPrinter.setIndentLevel(0);
		else
			mDelayedPrinter.setIndentLevel(mPrinter.getIndentLevel());
		mDelayedPrinter.printLn(n.getScope() + "." + n.getField()
				+ " = new DummyClassToDetermineVariableType();"
				+ ErrorParser.separator
				+ mSymbolTable.getCurrentScope().getFullScopeName());
	}

	public void visit(Parameter n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		printAnnotations(n.getAnnotations(), arg);
		printModifiers(n.getModifiers());

		Type varType = n.getType();

		varType.accept(this, arg);
		if (n.isVarArgs()) {
			mPrinter.print("...");
		}
		mPrinter.print(" ");
		VariableDeclaratorId id = n.getId();
		id.accept(this, arg);

		mSymbolTable.addVariable(id.toString(), varType);
	}

	public void visit(VariableDeclarationExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		printAnnotations(n.getAnnotations(), arg);
		printModifiers(n.getModifiers());

		Type varType = n.getType();
		varType.accept(this, arg);
		mPrinter.print(" ");

		for (Iterator<VariableDeclarator> i = n.getVars().iterator(); i
				.hasNext();) {
			VariableDeclarator v = i.next();
			v.accept(this, arg);
			if (i.hasNext()) {
				mPrinter.print(", ");
			}
			mSymbolTable.addVariable(v.getId().toString(), varType);
		}
	}

	public void visit(FieldDeclaration n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getJavaDoc() != null) {
			n.getJavaDoc().accept(this, arg);
		}
		printMemberAnnotations(n.getAnnotations(), arg);
		printModifiers(n.getModifiers());

		Type varType = n.getType();
		varType.accept(this, arg);

		mPrinter.print(" ");
		for (Iterator<VariableDeclarator> i = n.getVariables().iterator(); i
				.hasNext();) {
			VariableDeclarator var = i.next();
			var.accept(this, arg);
			if (i.hasNext()) {
				mPrinter.print(", ");
			}
			mSymbolTable.addVariable(var.getId().toString(), varType);
		}
		mPrinter.print(";");
	}

	public void visit(CompilationUnit n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getPackage() != null) {
			n.getPackage().accept(this, arg);
		}
		mPrinter.printLn("import jump.parser.ast.visitor.DummyClassToDetermineVariableType;");

		if (n.getImports() != null) {
			for (ImportDeclaration i : n.getImports()) {
				i.accept(this, arg);
			}
			mPrinter.printLn();
		}
		if (n.getTypes() != null) {
			for (Iterator<TypeDeclaration> i = n.getTypes().iterator(); i
					.hasNext();) {
				i.next().accept(this, arg);
				mPrinter.printLn();
				if (i.hasNext()) {
					mPrinter.printLn();
				}
			}
		}
		
		/*
		 * we create the temporary file
		 */
		File tempFile = new File(mOriginalFile.getParent(), TEMP_PREFIX
				+ mOriginalFile.getName().substring(0,
						mOriginalFile.getName().lastIndexOf('.')) + ".java");
		writeToFile(tempFile, getSource());

		/*
		 * now we compile the temporary file
		 */
		String classpath = System.getProperty("java.class.path");
		HashMap<String, List<IncompatibleType>> errors = ErrorParser
				.getAllIncompatibleTypeErrors(tempFile.getAbsolutePath(),
						classpath);

		/*
		 * add the variable type to the respective scope.
		 * the scope is saved in the AST.
		 * these variables were not declared within the respective file,
		 *  so treated as being declared in a Root scope
		 */
		for (String s : errors.keySet()) {
			Scope scope = mSymbolTable.getScope(s);
			for (IncompatibleType error : errors.get(s)) {
				if (!scope.isDefined(error.getVariableName())) {
					FakeType type = new FakeType(error.getRequired(), 0, 0);
					mSymbolTable.addVariableToRootScope(
							error.getVariableName(), type);
				}
			}
		}
		/*
		 * temporary file is no longer needed
		 */
		tempFile.delete();
	}

	public void visit(BlockStmt n, Object arg) {
		Scope scope = mSymbolTable.newScope("Block", Scope.Type.BlockScope);
		n.setVarScope(scope);

		mPrinter.printLn("{");
		if (n.getStmts() != null) {
			mPrinter.indent();
			for (Statement s : n.getStmts()) {
				s.accept(this, arg);
				mPrinter.printLn();
				String delayedCode = mDelayedPrinter.getSource(); // in some use
																	// cases, we
																	// will
																	// clear it
																	// off:
																	// vikas
				if (0 != delayedCode.length()) {
					mPrinter.printLn(delayedCode);
					mDelayedPrinter.clear();
				}

			}
			mPrinter.unindent();
		}
		mPrinter.print("}");
		mSymbolTable.closeScope();
	}

	public void visit(Node n, Object arg) {
		throw new IllegalStateException(n.getClass().getName());
	}


	public void visit(PackageDeclaration n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		printAnnotations(n.getAnnotations(), arg);
		mPrinter.print("package ");
		n.getName().accept(this, arg);
		mPrinter.printLn(";");
		mPrinter.printLn();
	}

	public void visit(QualifiedNameExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		n.getQualifier().accept(this, arg);
		mPrinter.print(".");
		mPrinter.print(n.getName());
	}

	public void visit(ImportDeclaration n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("import ");
		if (n.isStatic()) {
			mPrinter.print("static ");
		}
		n.getName().accept(this, arg);
		if (n.isAsterisk()) {
			mPrinter.print(".*");
		}
		mPrinter.printLn(";");
	}

	public void visit(ClassOrInterfaceDeclaration n, Object arg) {
		Scope scope = mSymbolTable.newScope(n.getName(), Scope.Type.ClassScope);
		n.setVarScope(scope);

		if (n.getJavaDoc() != null) {
			n.getJavaDoc().accept(this, arg);
		}
		printMemberAnnotations(n.getAnnotations(), arg);
		printModifiers(n.getModifiers());

		if (n.isInterface()) {
			mPrinter.print("interface ");
		} else {
			mPrinter.print("class ");
		}

		mPrinter.print(n.getName());

		printTypeParameters(n.getTypeParameters(), arg);

		if (n.getExtends() != null) {
			mPrinter.print(" extends ");
			for (Iterator<ClassOrInterfaceType> i = n.getExtends().iterator(); i
					.hasNext();) {
				ClassOrInterfaceType c = i.next();
				c.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}

		if (n.getImplements() != null) {
			mPrinter.print(" implements ");
			for (Iterator<ClassOrInterfaceType> i = n.getImplements()
					.iterator(); i.hasNext();) {
				ClassOrInterfaceType c = i.next();
				c.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}

		mPrinter.printLn(" {");
		mPrinter.indent();
		if (n.getMembers() != null) {
			printMembers(n.getMembers(), arg);
		}
		mPrinter.unindent();
		mPrinter.print("}");

		mSymbolTable.closeScope();
	}

	public void visit(EmptyTypeDeclaration n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getJavaDoc() != null) {
			n.getJavaDoc().accept(this, arg);
		}
		mPrinter.print(";");
	}

	public void visit(JavadocComment n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("/**");
		mPrinter.print(n.getContent());
		mPrinter.printLn("*/");
	}

	public void visit(ClassOrInterfaceType n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getScope() != null) {
			n.getScope().accept(this, arg);
			mPrinter.print(".");
		}
		mPrinter.print(n.getName());
		printTypeArgs(n.getTypeArgs(), arg);
	}

	public void visit(TypeParameter n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getName());
		if (n.getTypeBound() != null) {
			mPrinter.print(" extends ");
			for (Iterator<ClassOrInterfaceType> i = n.getTypeBound().iterator(); i
					.hasNext();) {
				ClassOrInterfaceType c = i.next();
				c.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(" & ");
				}
			}
		}
	}

	public void visit(PrimitiveType n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		switch (n.getType()) {
		case Boolean:
			mPrinter.print("boolean");
			break;
		case Byte:
			mPrinter.print("byte");
			break;
		case Char:
			mPrinter.print("char");
			break;
		case Double:
			mPrinter.print("double");
			break;
		case Float:
			mPrinter.print("float");
			break;
		case Int:
			mPrinter.print("int");
			break;
		case Long:
			mPrinter.print("long");
			break;
		case Short:
			mPrinter.print("short");
			break;
		}
	}

	public void visit(ReferenceType n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		n.getType().accept(this, arg);
		for (int i = 0; i < n.getArrayCount(); i++) {
			mPrinter.print("[]");
		}
	}

	public void visit(WildcardType n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("?");
		if (n.getExtends() != null) {
			mPrinter.print(" extends ");
			n.getExtends().accept(this, arg);
		}
		if (n.getSuper() != null) {
			mPrinter.print(" super ");
			n.getSuper().accept(this, arg);
		}
	}

	public void visit(VariableDeclarator n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		n.getId().accept(this, arg);
		if (n.getInit() != null) {
			mPrinter.print(" = ");
			n.getInit().accept(this, arg);
		}
	}

	public void visit(VariableDeclaratorId n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getName());
		for (int i = 0; i < n.getArrayCount(); i++) {
			mPrinter.print("[]");
		}
	}

	public void visit(ArrayInitializerExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("{");
		if (n.getValues() != null) {
			mPrinter.print(" ");
			for (Iterator<Expression> i = n.getValues().iterator(); i.hasNext();) {
				Expression expr = i.next();
				expr.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
			mPrinter.print(" ");
		}
		mPrinter.print("}");
	}

	public void visit(VoidType n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("void");
	}

	public void visit(ArrayAccessExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		n.getName().accept(this, arg);
		mPrinter.print("[");
		n.getIndex().accept(this, arg);
		mPrinter.print("]");
	}

	public void visit(ArrayCreationExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("new ");
		n.getType().accept(this, arg);
		printTypeArgs(n.getTypeArgs(), arg);

		if (n.getDimensions() != null) {
			for (Expression dim : n.getDimensions()) {
				mPrinter.print("[");
				dim.accept(this, arg);
				mPrinter.print("]");
			}
			for (int i = 0; i < n.getArrayCount(); i++) {
				mPrinter.print("[]");
			}
		} else {
			for (int i = 0; i < n.getArrayCount(); i++) {
				mPrinter.print("[]");
			}
			mPrinter.print(" ");
			n.getInitializer().accept(this, arg);
		}
	}

	public void visit(AssignExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		n.getTarget().accept(this, arg);
		mPrinter.print(" ");
		switch (n.getOperator()) {
		case assign:
			mPrinter.print("=");
			break;
		case and:
			mPrinter.print("&=");
			break;
		case or:
			mPrinter.print("|=");
			break;
		case xor:
			mPrinter.print("^=");
			break;
		case plus:
			mPrinter.print("+=");
			break;
		case minus:
			mPrinter.print("-=");
			break;
		case rem:
			mPrinter.print("%=");
			break;
		case slash:
			mPrinter.print("/=");
			break;
		case star:
			mPrinter.print("*=");
			break;
		case lShift:
			mPrinter.print("<<=");
			break;
		case rSignedShift:
			mPrinter.print(">>=");
			break;
		case rUnsignedShift:
			mPrinter.print(">>>=");
			break;
		}
		mPrinter.print(" ");
		n.getValue().accept(this, arg);
	}

	public void visit(BinaryExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		n.getLeft().accept(this, arg);
		mPrinter.print(" ");
		switch (n.getOperator()) {
		case or:
			mPrinter.print("||");
			break;
		case and:
			mPrinter.print("&&");
			break;
		case binOr:
			mPrinter.print("|");
			break;
		case binAnd:
			mPrinter.print("&");
			break;
		case xor:
			mPrinter.print("^");
			break;
		case equals:
			mPrinter.print("==");
			break;
		case notEquals:
			mPrinter.print("!=");
			break;
		case less:
			mPrinter.print("<");
			break;
		case greater:
			mPrinter.print(">");
			break;
		case lessEquals:
			mPrinter.print("<=");
			break;
		case greaterEquals:
			mPrinter.print(">=");
			break;
		case lShift:
			mPrinter.print("<<");
			break;
		case rSignedShift:
			mPrinter.print(">>");
			break;
		case rUnsignedShift:
			mPrinter.print(">>>");
			break;
		case plus:
			mPrinter.print("+");
			break;
		case minus:
			mPrinter.print("-");
			break;
		case times:
			mPrinter.print("*");
			break;
		case divide:
			mPrinter.print("/");
			break;
		case remainder:
			mPrinter.print("%");
			break;
		}
		mPrinter.print(" ");
		n.getRight().accept(this, arg);
	}

	public void visit(CastExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("(");
		n.getType().accept(this, arg);
		mPrinter.print(") ");
		n.getExpr().accept(this, arg);
	}

	public void visit(ClassExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		n.getType().accept(this, arg);
		mPrinter.print(".class");
	}

	public void visit(ConditionalExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		n.getCondition().accept(this, arg);
		mPrinter.print(" ? ");
		n.getThenExpr().accept(this, arg);
		mPrinter.print(" : ");
		n.getElseExpr().accept(this, arg);
	}

	public void visit(EnclosedExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("(");
		n.getInner().accept(this, arg);
		mPrinter.print(")");
	}

	public void visit(InstanceOfExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		n.getExpr().accept(this, arg);
		mPrinter.print(" instanceof ");
		n.getType().accept(this, arg);
	}

	public void visit(CharLiteralExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("'");
		mPrinter.print(n.getValue());
		mPrinter.print("'");
	}

	public void visit(DoubleLiteralExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getValue());
	}

	public void visit(IntegerLiteralExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getValue());
	}

	public void visit(LongLiteralExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getValue());
	}

	public void visit(IntegerLiteralMinValueExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getValue());
	}

	public void visit(LongLiteralMinValueExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getValue());
	}

	public void visit(StringLiteralExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("\"");
		mPrinter.print(n.getValue());
		mPrinter.print("\"");
	}

	public void visit(BooleanLiteralExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getValue().toString());
	}

	public void visit(NullLiteralExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("null");
	}

	public void visit(ThisExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getClassExpr() != null) {
			n.getClassExpr().accept(this, arg);
			mPrinter.print(".");
		}
		mPrinter.print("this");
	}

	public void visit(SuperExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getClassExpr() != null) {
			n.getClassExpr().accept(this, arg);
			mPrinter.print(".");
		}
		mPrinter.print("super");
	}

	public void visit(MethodCallExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getScope() != null) {
			n.getScope().accept(this, arg);
			mPrinter.print(".");
		}
		printTypeArgs(n.getTypeArgs(), arg);
		mPrinter.print(n.getName());
		mPrinter.print("(");
		if (n.getArgs() != null) {
			for (Iterator<Expression> i = n.getArgs().iterator(); i.hasNext();) {
				Expression e = i.next();
				e.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}
		mPrinter.print(")");
	}

	public void visit(ObjectCreationExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getScope() != null) {
			n.getScope().accept(this, arg);
			mPrinter.print(".");
		}

		mPrinter.print("new ");

		printTypeArgs(n.getTypeArgs(), arg);
		n.getType().accept(this, arg);

		mPrinter.print("(");
		if (n.getArgs() != null) {
			for (Iterator<Expression> i = n.getArgs().iterator(); i.hasNext();) {
				Expression e = i.next();
				e.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}
		mPrinter.print(")");

		if (n.getAnonymousClassBody() != null) {
			mPrinter.printLn(" {");
			mPrinter.indent();
			printMembers(n.getAnonymousClassBody(), arg);
			mPrinter.unindent();
			mPrinter.print("}");
		}
	}

	public void visit(SuperMemberAccessExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("super.");
		mPrinter.print(n.getName());
	}

	public void visit(UnaryExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		switch (n.getOperator()) {
		case positive:
			mPrinter.print("+");
			break;
		case negative:
			mPrinter.print("-");
			break;
		case inverse:
			mPrinter.print("~");
			break;
		case not:
			mPrinter.print("!");
			break;
		case preIncrement:
			mPrinter.print("++");
			break;
		case preDecrement:
			mPrinter.print("--");
			break;
		}

		n.getExpr().accept(this, arg);
		// delayedPrinter.clear(); 
		/* 
		 * unary+primitive types, our generated code
		 * just generates incompatible type error: vikas
		 */
		switch (n.getOperator()) {
		case posIncrement:
			mPrinter.print("++");
			break;
		case posDecrement:
			mPrinter.print("--");
			break;
		}
	}

	public void visit(ConstructorDeclaration n, Object arg) {
		mInsideMethod = true;
		Scope scope = mSymbolTable
				.newScope(n.getName(), Scope.Type.MethodScope);
		n.setVarScope(scope);

		if (n.getJavaDoc() != null) {
			n.getJavaDoc().accept(this, arg);
		}
		printMemberAnnotations(n.getAnnotations(), arg);
		printModifiers(n.getModifiers());

		printTypeParameters(n.getTypeParameters(), arg);
		if (n.getTypeParameters() != null) {
			mPrinter.print(" ");
		}
		mPrinter.print(n.getName());

		mPrinter.print("(");
		if (n.getParameters() != null) {
			for (Iterator<Parameter> i = n.getParameters().iterator(); i
					.hasNext();) {
				Parameter p = i.next();
				p.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}
		mPrinter.print(")");

		if (n.getThrows() != null) {
			mPrinter.print(" throws ");
			for (Iterator<NameExpr> i = n.getThrows().iterator(); i.hasNext();) {
				NameExpr name = i.next();
				name.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}
		mPrinter.print(" ");
		n.getBlock().accept(this, arg);
		mSymbolTable.closeScope();
		mInsideMethod = false;
	}

	public void visit(MethodDeclaration n, Object arg) {
		mInsideMethod = true;
		Scope scope = mSymbolTable
				.newScope(n.getName(), Scope.Type.MethodScope);
		n.setVarScope(scope);

		if (n.getJavaDoc() != null) {
			n.getJavaDoc().accept(this, arg);
		}
		printMemberAnnotations(n.getAnnotations(), arg);
		printModifiers(n.getModifiers());

		printTypeParameters(n.getTypeParameters(), arg);
		if (n.getTypeParameters() != null) {
			mPrinter.print(" ");
		}

		n.getType().accept(this, arg);
		mPrinter.print(" ");
		mPrinter.print(n.getName());

		mPrinter.print("(");
		if (n.getParameters() != null) {
			for (Iterator<Parameter> i = n.getParameters().iterator(); i
					.hasNext();) {
				Parameter p = i.next();
				p.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}
		mPrinter.print(")");

		for (int i = 0; i < n.getArrayCount(); i++) {
			mPrinter.print("[]");
		}

		if (n.getThrows() != null) {
			mPrinter.print(" throws ");
			for (Iterator<NameExpr> i = n.getThrows().iterator(); i.hasNext();) {
				NameExpr name = i.next();
				name.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}
		if (n.getBody() == null) {
			mPrinter.print(";");
		} else {
			mPrinter.print(" ");
			n.getBody().accept(this, arg);
		}
		mSymbolTable.closeScope();
		mInsideMethod = false;
	}

	public void visit(ExplicitConstructorInvocationStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.isThis()) {
			printTypeArgs(n.getTypeArgs(), arg);
			mPrinter.print("this");
		} else {
			if (n.getExpr() != null) {
				n.getExpr().accept(this, arg);
				mPrinter.print(".");
			}
			printTypeArgs(n.getTypeArgs(), arg);
			mPrinter.print("super");
		}
		mPrinter.print("(");
		if (n.getArgs() != null) {
			for (Iterator<Expression> i = n.getArgs().iterator(); i.hasNext();) {
				Expression e = i.next();
				e.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}
		mPrinter.print(");");
	}

	public void visit(TypeDeclarationStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		n.getTypeDeclaration().accept(this, arg);
	}

	public void visit(AssertStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("assert ");
		n.getCheck().accept(this, arg);
		if (n.getMessage() != null) {
			mPrinter.print(" : ");
			n.getMessage().accept(this, arg);
		}
		mPrinter.print(";");
	}

	public void visit(LabeledStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getLabel());
		mPrinter.print(": ");
		n.getStmt().accept(this, arg);
	}

	public void visit(EmptyStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(";");
	}

	public void visit(ExpressionStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		n.getExpression().accept(this, arg);
		mPrinter.print(";");
	}

	public void visit(SwitchStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("switch(");
		n.getSelector().accept(this, arg);
		mPrinter.printLn(") {");
		Scope scope = mSymbolTable.newScope("Switch", Scope.Type.BlockScope);
		n.setVarScope(scope);

		if (n.getEntries() != null) {
			mPrinter.indent();
			for (SwitchEntryStmt e : n.getEntries()) {
				e.accept(this, arg);
			}
			mPrinter.unindent();
		}
		mPrinter.print("}");
		mSymbolTable.closeScope();
	}

	public void visit(SwitchEntryStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getLabel() != null) {
			mPrinter.print("case ");
			n.getLabel().accept(this, arg);
			mPrinter.print(":");
		} else {
			mPrinter.print("default:");
		}
		mPrinter.printLn();
		mPrinter.indent();
		if (n.getStmts() != null) {
			for (Statement s : n.getStmts()) {
				s.accept(this, arg);
				mPrinter.printLn();
			}
		}
		mPrinter.unindent();
	}

	public void visit(BreakStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("break");
		if (n.getId() != null) {
			mPrinter.print(" ");
			mPrinter.print(n.getId());
		}
		mPrinter.print(";");
	}

	public void visit(ReturnStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("return");
		if (n.getExpr() != null) {
			mPrinter.print(" ");
			n.getExpr().accept(this, arg);
		}
		mPrinter.print(";");
	}

	public void visit(EnumDeclaration n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getJavaDoc() != null) {
			n.getJavaDoc().accept(this, arg);
		}
		printMemberAnnotations(n.getAnnotations(), arg);
		printModifiers(n.getModifiers());

		mPrinter.print("enum ");
		mPrinter.print(n.getName());

		if (n.getImplements() != null) {
			mPrinter.print(" implements ");
			for (Iterator<ClassOrInterfaceType> i = n.getImplements()
					.iterator(); i.hasNext();) {
				ClassOrInterfaceType c = i.next();
				c.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}

		mPrinter.printLn(" {");
		mPrinter.indent();
		if (n.getEntries() != null) {
			mPrinter.printLn();
			for (Iterator<EnumConstantDeclaration> i = n.getEntries()
					.iterator(); i.hasNext();) {
				EnumConstantDeclaration e = i.next();
				e.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}
		if (n.getMembers() != null) {
			mPrinter.printLn(";");
			printMembers(n.getMembers(), arg);
		} else {
			if (n.getEntries() != null) {
				mPrinter.printLn();
			}
		}
		mPrinter.unindent();
		mPrinter.print("}");
	}

	public void visit(EnumConstantDeclaration n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getJavaDoc() != null) {
			n.getJavaDoc().accept(this, arg);
		}
		printMemberAnnotations(n.getAnnotations(), arg);
		mPrinter.print(n.getName());

		if (n.getArgs() != null) {
			mPrinter.print("(");
			for (Iterator<Expression> i = n.getArgs().iterator(); i.hasNext();) {
				Expression e = i.next();
				e.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
			mPrinter.print(")");
		}

		if (n.getClassBody() != null) {
			mPrinter.printLn(" {");
			mPrinter.indent();
			printMembers(n.getClassBody(), arg);
			mPrinter.unindent();
			mPrinter.printLn("}");
		}
	}

	public void visit(EmptyMemberDeclaration n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getJavaDoc() != null) {
			n.getJavaDoc().accept(this, arg);
		}
		mPrinter.print(";");
	}

	public void visit(InitializerDeclaration n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getJavaDoc() != null) {
			n.getJavaDoc().accept(this, arg);
		}
		if (n.isStatic()) {
			mPrinter.print("static ");
		}
		n.getBlock().accept(this, arg);
	}

	public void visit(IfStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("if (");
		n.getCondition().accept(this, arg);
		mPrinter.print(") ");
		n.getThenStmt().accept(this, arg);
		if (n.getElseStmt() != null) {
			mPrinter.print(" else ");
			n.getElseStmt().accept(this, arg);
		}
	}

	public void visit(WhileStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("while (");
		n.getCondition().accept(this, arg);
		mPrinter.print(") ");
		n.getBody().accept(this, arg);
	}

	public void visit(ContinueStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("continue");
		if (n.getId() != null) {
			mPrinter.print(" ");
			mPrinter.print(n.getId());
		}
		mPrinter.print(";");
	}

	public void visit(DoStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("do ");
		n.getBody().accept(this, arg);
		mPrinter.print(" while (");
		n.getCondition().accept(this, arg);
		mPrinter.print(");");
	}

	public void visit(ForeachStmt n, Object arg) {
		Scope newScope = mSymbolTable.newScope("ForBlock",
				Scope.Type.BlockScope);
		n.setVarScope(newScope);
		mPrinter.print("for (");
		n.getVariable().accept(this, arg);
		mPrinter.print(" : ");
		n.getIterable().accept(this, arg);
		mPrinter.print(") ");
		n.getBody().accept(this, arg);
		mSymbolTable.closeScope();
	}

	public void visit(ForStmt n, Object arg) {
		Scope newScope = mSymbolTable.newScope("ForBlock",
				Scope.Type.BlockScope);
		n.setVarScope(newScope);
		mPrinter.print("for (");
		if (n.getInit() != null) {
			for (Iterator<Expression> i = n.getInit().iterator(); i.hasNext();) {
				Expression e = i.next();
				e.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}
		mPrinter.print("; ");
		if (n.getCompare() != null) {
			n.getCompare().accept(this, arg);
		}
		mPrinter.print("; ");
		if (n.getUpdate() != null) {
			for (Iterator<Expression> i = n.getUpdate().iterator(); i.hasNext();) {
				Expression e = i.next();
				e.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
		}
		mPrinter.print(") ");
		n.getBody().accept(this, arg);
		mSymbolTable.closeScope();
	}

	public void visit(ForStmtSimple n, Object arg) {
		Scope newScope = mSymbolTable.newScope("ForBlock",
				Scope.Type.BlockScope);
		n.setVarScope(newScope);
		mPrinter.print("for (");
		if (n.getInit() != null) {
			Expression e = n.getInit();
			e.accept(this, arg);
		}
		mPrinter.print("; ");
		if (n.getCompare() != null) {
			n.getCompare().accept(this, arg);
		}
		mPrinter.print("; ");
		if (n.getUpdate() != null) {
			Expression e = n.getUpdate();
			e.accept(this, arg);
		}
		mPrinter.print(") ");
		n.getBody().accept(this, arg);
		mSymbolTable.closeScope();
	}

	public void visit(ThrowStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("throw ");
		n.getExpr().accept(this, arg);
		mPrinter.print(";");
	}

	public void visit(SynchronizedStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("synchronized (");
		n.getExpr().accept(this, arg);
		mPrinter.print(") ");
		n.getBlock().accept(this, arg);
	}

	public void visit(TryStmt n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("try ");
		n.getTryBlock().accept(this, arg);
		if (n.getCatchs() != null) {
			for (CatchClause c : n.getCatchs()) {
				c.accept(this, arg);
			}
		}
		if (n.getFinallyBlock() != null) {
			mPrinter.print(" finally ");
			n.getFinallyBlock().accept(this, arg);
		}
	}

	public void visit(CatchClause n, Object arg) {
		Scope newScope = mSymbolTable.newScope("CatchBlock",
				Scope.Type.BlockScope);
		n.setVarScope(newScope);
		mPrinter.print(" catch (");
		n.getExcept().accept(this, arg);
		mPrinter.print(") ");
		n.getCatchBlock().accept(this, arg);
		mSymbolTable.closeScope();
	}

	public void visit(AnnotationDeclaration n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getJavaDoc() != null) {
			n.getJavaDoc().accept(this, arg);
		}
		printMemberAnnotations(n.getAnnotations(), arg);
		printModifiers(n.getModifiers());

		mPrinter.print("@interface ");
		mPrinter.print(n.getName());
		mPrinter.printLn(" {");
		mPrinter.indent();
		if (n.getMembers() != null) {
			printMembers(n.getMembers(), arg);
		}
		mPrinter.unindent();
		mPrinter.print("}");
	}

	public void visit(AnnotationMemberDeclaration n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		if (n.getJavaDoc() != null) {
			n.getJavaDoc().accept(this, arg);
		}
		printMemberAnnotations(n.getAnnotations(), arg);
		printModifiers(n.getModifiers());

		n.getType().accept(this, arg);
		mPrinter.print(" ");
		mPrinter.print(n.getName());
		mPrinter.print("()");
		if (n.getDefaultValue() != null) {
			mPrinter.print(" default ");
			n.getDefaultValue().accept(this, arg);
		}
		mPrinter.print(";");
	}

	public void visit(MarkerAnnotationExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("@");
		n.getName().accept(this, arg);
	}

	public void visit(SingleMemberAnnotationExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("@");
		n.getName().accept(this, arg);
		mPrinter.print("(");
		n.getMemberValue().accept(this, arg);
		mPrinter.print(")");
	}

	public void visit(NormalAnnotationExpr n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("@");
		n.getName().accept(this, arg);
		mPrinter.print("(");
		for (Iterator<MemberValuePair> i = n.getPairs().iterator(); i.hasNext();) {
			MemberValuePair m = i.next();
			m.accept(this, arg);
			if (i.hasNext()) {
				mPrinter.print(", ");
			}
		}
		mPrinter.print(")");
	}

	public void visit(MemberValuePair n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getName());
		mPrinter.print(" = ");
		n.getValue().accept(this, arg);
	}

	public void visit(LineComment n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("//");
		mPrinter.printLn(n.getContent());
	}

	public void visit(BlockComment n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print("/*");
		mPrinter.print(n.getContent());
		mPrinter.printLn("*/");
	}

	public void visit(OpenMP_Parallel_Construct n, Object arg) {
		Scope scope = mSymbolTable.newScope("OpenMP_Parallel",
				pj.symbol.Scope.Type.OpenMPConstructScope);
		n.setVarScope(scope);

		mPrinter.print("//#omp parallel ");
		if (n.isNoGui())
			mPrinter.print("freeguithread ");
		if (n.isIO())
			mPrinter.print("iotask ");
		if (n.isAsync())
			mPrinter.print("async ");
		if (n.getIfExpression() != null) {
			mPrinter.print("if (");
			n.getIfExpression().accept(this, arg);
			mPrinter.print(") ");
		}

		if (n.getDataClauses() != null)
			printDataClauses(n.getDataClauses());
		mPrinter.printLn();

		n.getStatements().get(0).accept(this, arg);

		mPrinter.printLn();
		String vars = mDelayedPrinterForDataClauses.getSource();
		mPrinter.printLn(vars);
		mDelayedPrinterForDataClauses.clear();

		mSymbolTable.closeScope();
	}

	public void visit(OpenMP_CompareExpression n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getLeft() + " ");
		switch (n.getOperator()) {
		case LessThan:
			mPrinter.print("<");
			break;
		case LessThanOrEqual:
			mPrinter.print("<=");
			break;
		case GreaterThan:
			mPrinter.print(">");
			break;
		case GreaterThanOrEqual:
			mPrinter.print(">=");
		}
		mPrinter.print(" " + n.getRight());
	}

	public void visit(OpenMP_For_Construct n, Object arg) {
		Scope scope = mSymbolTable.newScope("OpenMP_For",
				pj.symbol.Scope.Type.OpenMPConstructScope);
		n.setVarScope(scope);
		mPrinter.print("//#omp for ");
		if (n.getDataClauses() != null)
			printDataClauses(n.getDataClauses());
		if (n.getScheduleClause() != null)
			printScheduleClause(n.getScheduleClause());
		mPrinter.printLn();
		n.getStatements().get(0).accept(this, arg);

		mSymbolTable.closeScope();
	}



	@Override
	public void visit(OpenMP_UpdateExpression n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		String parity = "+";
		if (n.getIncrement().startsWith("-"))
			parity = "";
		mPrinter.print(n.getVar() + " = " + n.getVar() + parity
				+ n.getIncrement());
	}

	@Override
	public void visit(OpenMP_Master_Construct n, Object arg) {
		Scope scope = mSymbolTable.newScope("OpenMP_Master",
				pj.symbol.Scope.Type.OpenMPConstructScope);
		n.setVarScope(scope);
		n.getStatements().get(0).accept(this, arg);
	}

	@Override
	public void visit(OpenMP_Nogui_Construct n, Object arg) {
		Scope newScope = mSymbolTable.newScope("OpenMP_Freeguithread",
				pj.symbol.Scope.Type.OpenMPConstructScope);
		n.setVarScope(newScope);
		mPrinter.print("//#omp freeguithread ");
		if (null != n.get_ParallelConstruct()) {
			n.get_ParallelConstruct().accept(this, arg);
		}
	}

	@Override
	public void visit(OpenMP_Gui_Construct n, Object arg) {
		Scope newScope = mSymbolTable.newScope("OpenMP_Gui",
				pj.symbol.Scope.Type.OpenMPConstructScope);
		n.setVarScope(newScope);
		mPrinter.print("//#omp gui ");
		n.getStatements().get(0).accept(this, arg);
	}

	@Override
	public void visit(OpenMP_Critical_Construct n, Object arg) {
		Scope scope = mSymbolTable.newScope("OpenMP_Critical",
				pj.symbol.Scope.Type.OpenMPConstructScope);
		n.setVarScope(scope);
		n.getStatements().get(0).accept(this, arg);
	}

	@Override
	public void visit(OpenMP_Ordered_Construct n, Object arg) {
		Scope scope = mSymbolTable.newScope("OpenMP_Ordered",
				pj.symbol.Scope.Type.BlockScope);
		n.setVarScope(scope);
		n.getStatements().get(0).accept(this, arg);
	}

	@Override
	public void visit(OpenMP_Atomic_Construct n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
	}

	@Override
	public void visit(OpenMP_Barrier_Directive n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
	}

	@Override
	public void visit(OpenMP_Flush_Directive n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
	}

	@Override
	public void visit(OpenMP_ThreadPrivate n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		// throw new RuntimeException("Still to implement");
	}

	// --------------------------- Normalised -------------------------------
	@Override
	public void visit(OpenMP_Sections_Construct n, Object arg) {
		// throw new RuntimeException("This should have been normalised.");
	}

	// --------------------------- Normalised -------------------------------
	@Override
	public void visit(OpenMP_Parallel_For_Construct n, Object arg) {
		// throw new RuntimeException("This should have been normalised.");
	}

	// --------------------------- Normalised -------------------------------
	@Override
	public void visit(OpenMP_Parallel_Sections_Construct n, Object arg) {
		// throw new RuntimeException("This should have been normalised.");
	}

	// --------------------------- Normalised -------------------------------
	@Override
	public void visit(OpenMP_Single_Construct n, Object arg) {
		throw new RuntimeException("This should have been normalised.");
	}

	@Override
	public void visit(FakeStatement n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getStatementImage());
	}

	@Override
	public void visit(FakeType n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
		mPrinter.print(n.getName());
	}

	@Override
	public void visit(OpenMP_Interrupt_Construct n, Object arg) {
		n.setVarScope(mSymbolTable.getCurrentScope());
	}
	
	/*
	 * we implement various utility methods here
	 */
	
	public String getSource() {
		return mPrinter.getSource();
	}
	
	private void printDataClauses(List<OpenMP_DataClause> clauses) {
		Iterator<OpenMP_DataClause> itDCs = clauses.iterator();
		while (itDCs.hasNext()) {
			OpenMP_DataClause dc = itDCs.next();
			HashMap<Expression, Expression> copyConstructorList = dc
					.getCopyConstructorList();
			switch (dc.getType()) {
			case Private:
				printDataClause("private", dc.getArgumentList());
				break;
			case Shared:
				printDataClause("shared", dc.getArgumentList());
				break;
			case FirstPrivate:
				printDataClauseWithCopyConstructors("firstprivate", null,
						copyConstructorList);
				break;
			case LastPrivate:
				printDataClause("lastprivate", dc.getArgumentList());
				break;
			case Reduction:
				printDataClauseWithCopyConstructors("reduction", dc
						.getReductionOperator().getOperatorString(),
						copyConstructorList);
				break;
			case DefaultNone:
				mPrinter.print("default(none)");
				break;
			case DefaultShared:
				mPrinter.print("default(shared)");
				break;
			case Copyin:
				printDataClause("copyin", dc.getArgumentList());
				break;
			}
			mPrinter.print(" ");
		}
	}

	private void printDataClause(String name, List<Expression> args) {
		mPrinter.print(name + "(");
		Iterator<Expression> itExpr = args.iterator();
		while (itExpr.hasNext()) {
			String var = itExpr.next().toString();
			mPrinter.print(var);
			mDelayedPrinterForDataClauses.printLn(var
					+ " = new DummyClassToDetermineVariableType();"
					+ ErrorParser.separator
					+ mSymbolTable.getCurrentScope().getFullScopeName());
			if (itExpr.hasNext())
				mPrinter.print(", ");
		}
		mPrinter.print(")");
	}

	private void printDataClauseWithCopyConstructors(String name,
			String operator, HashMap<Expression, Expression> args) {
		mPrinter.print(name + "(" + operator + ": ");
		Iterator<Expression> itExpr = args.keySet().iterator();
		while (itExpr.hasNext()) {
			Expression var = itExpr.next();
			Expression copyConstr = args.get(var);
			if (copyConstr != null)
				mPrinter.print(copyConstr + "#");
			mPrinter.print(var.toString());
			mDelayedPrinterForDataClauses.printLn(var
					+ " = new DummyClassToDetermineVariableType();"
					+ ErrorParser.separator
					+ mSymbolTable.getCurrentScope().getFullScopeName());
			if (itExpr.hasNext())
				mPrinter.print(", ");
		}
		mPrinter.print(")");
	}

	// private void printReductionClause(OpenMP_ReductionOperator operator,
	// HashMap<Expression, Expression> copyConstructorList) {
	// printer.print("reduction ("+operator+":");
	// Iterator<Expression> itExpr = copyConstructorList.keySet().iterator();
	// while (itExpr.hasNext()) {
	// Expression key = itExpr.next();
	// if (copyConstructorList.get(key) != null)
	// printer.print(copyConstructorList.get(key).toString()+"#");
	// printer.print(key.toString());
	// if (itExpr.hasNext())
	// printer.print(", ");
	// }
	// printer.print(")");
	// }
	
	private void printScheduleClause(OpenMP_ScheduleClause scheduleClause) {
		switch (scheduleClause.getScheduleType()) {
		case Ordered:
			mPrinter.print("ordered");
			break;
		case Static:
			printSchedule("static", scheduleClause.getChunkSize());
			break;
		case Dynamic:
			printSchedule("dynamic", scheduleClause.getChunkSize());
			break;
		case Guided:
			printSchedule("guided", scheduleClause.getChunkSize());
			break;
		case Runtime:
			printSchedule("runtime", scheduleClause.getChunkSize());
			break;
		}
	}

	private void printSchedule(String name, Expression chunk) {
		mPrinter.print("schedule(" + name);
		if (chunk != null)
			mPrinter.print(", " + chunk);
		mPrinter.print(")");
	}
	

	private void printMembers(List<BodyDeclaration> members, Object arg) {
		for (BodyDeclaration member : members) {
			member.accept(this, arg);
			mPrinter.printLn();
		}
	}
	
	private void writeToFile(File file, String contents) {
		try {
			Writer output = null;
			output = new BufferedWriter(new FileWriter(file));
			output.write(contents);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void printMemberAnnotations(List<AnnotationExpr> annotations,
			Object arg) {
		if (annotations != null) {
			for (AnnotationExpr a : annotations) {
				a.accept(this, arg);
			}
		}
	}

	private void printModifiers(int modifiers) {
		if (ModifierSet.isPrivate(modifiers)) {
			mPrinter.print("private ");
		}
		if (ModifierSet.isProtected(modifiers)) {
			mPrinter.print("protected ");
		}
		if (ModifierSet.isPublic(modifiers)) {
			mPrinter.print("public ");
		}
		if (ModifierSet.isAbstract(modifiers)) {
			mPrinter.print("abstract ");
		}
		if (ModifierSet.isStatic(modifiers)) {
			mPrinter.print("static ");
		}
		if (ModifierSet.isFinal(modifiers)) {
			mPrinter.print("final ");
		}
		if (ModifierSet.isNative(modifiers)) {
			mPrinter.print("native ");
		}
		if (ModifierSet.isStrictfp(modifiers)) {
			mPrinter.print("strictfp ");
		}
		if (ModifierSet.isSynchronized(modifiers)) {
			mPrinter.print("synchronized ");
		}
		if (ModifierSet.isTransient(modifiers)) {
			mPrinter.print("transient ");
		}
		if (ModifierSet.isVolatile(modifiers)) {
			mPrinter.print("volatile ");
		}
	}

	private void printAnnotations(List<AnnotationExpr> annotations, Object arg) {
		if (annotations != null) {
			for (AnnotationExpr a : annotations) {
				a.accept(this, arg);
				mPrinter.print(" ");
			}
		}
	}

	private void printTypeArgs(List<Type> args, Object arg) {
		if (args != null) {
			mPrinter.print("<");
			for (Iterator<Type> i = args.iterator(); i.hasNext();) {
				Type t = i.next();
				t.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
			mPrinter.print(">");
		}
	}

	private void printTypeParameters(List<TypeParameter> args, Object arg) {
		if (args != null) {
			mPrinter.print("<");
			for (Iterator<TypeParameter> i = args.iterator(); i.hasNext();) {
				TypeParameter t = i.next();
				t.accept(this, arg);
				if (i.hasNext()) {
					mPrinter.print(", ");
				}
			}
			mPrinter.print(">");
		}
	}

}
