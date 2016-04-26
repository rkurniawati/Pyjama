/*
 * Copyright (C) 2007 Julio Vilmar Gesser.
 * 
 * This file is part of Java 1.5 parser and Abstract Syntax Tree.
 *
 * Java 1.5 parser and Abstract Syntax Tree is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Java 1.5 parser and Abstract Syntax Tree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java 1.5 parser and Abstract Syntax Tree.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 05/10/2006
 */
package pj.parser.ast.visitor;

import pj.parser.ast.BlockComment;
import pj.parser.ast.CompilationUnit;
import pj.parser.ast.ImportDeclaration;
import pj.parser.ast.LineComment;
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
import pj.parser.ast.expr.QualifiedNameExpr;
import pj.parser.ast.expr.SingleMemberAnnotationExpr;
import pj.parser.ast.expr.StringLiteralExpr;
import pj.parser.ast.expr.SuperExpr;
import pj.parser.ast.expr.ThisExpr;
import pj.parser.ast.expr.UnaryExpr;
import pj.parser.ast.expr.VariableDeclarationExpr;
import pj.parser.ast.omp.OmpAtomicConstruct;
import pj.parser.ast.omp.OmpAwaitConstruct;
import pj.parser.ast.omp.OmpWaitDirective;
import pj.parser.ast.omp.OmpBarrierDirective;
import pj.parser.ast.omp.OmpCancelDirective;
import pj.parser.ast.omp.OmpCancellationPointDirective;
import pj.parser.ast.omp.OmpCopyprivateDataClause;
import pj.parser.ast.omp.OmpCriticalConstruct;
import pj.parser.ast.omp.OmpDataClause;
import pj.parser.ast.omp.OmpDefaultDataClause;
import pj.parser.ast.omp.OmpFlushDirective;
import pj.parser.ast.omp.OmpForConstruct;
import pj.parser.ast.omp.OmpFreeguiConstruct;
import pj.parser.ast.omp.OmpGuiConstruct;
import pj.parser.ast.omp.OmpIfClause;
import pj.parser.ast.omp.OmpLastprivateDataClause;
import pj.parser.ast.omp.OmpMasterConstruct;
import pj.parser.ast.omp.OmpNumthreadsClause;
import pj.parser.ast.omp.OmpOrderedConstruct;
import pj.parser.ast.omp.OmpParallelConstruct;
import pj.parser.ast.omp.OmpParallelForConstruct;
import pj.parser.ast.omp.OmpParallelSectionsConstruct;
import pj.parser.ast.omp.OmpPrivateDataClause;
import pj.parser.ast.omp.OmpReductionDataClause;
import pj.parser.ast.omp.OmpReductionOperator;
import pj.parser.ast.omp.OmpScheduleClause;
import pj.parser.ast.omp.OmpSectionConstruct;
import pj.parser.ast.omp.OmpSectionsConstruct;
import pj.parser.ast.omp.OmpSharedDataClause;
import pj.parser.ast.omp.OmpSingleConstruct;
import pj.parser.ast.omp.OmpTargetConstruct;
import pj.parser.ast.omp.OpenMPStatement;
import pj.parser.ast.stmt.AssertStmt;
import pj.parser.ast.stmt.BlockStmt;
import pj.parser.ast.stmt.BreakStmt;
import pj.parser.ast.stmt.CatchClause;
import pj.parser.ast.stmt.ContinueStmt;
import pj.parser.ast.stmt.DoStmt;
import pj.parser.ast.stmt.EmptyStmt;
import pj.parser.ast.stmt.ExplicitConstructorInvocationStmt;
import pj.parser.ast.stmt.ExpressionStmt;
import pj.parser.ast.stmt.ForStmt;
import pj.parser.ast.stmt.ForeachStmt;
import pj.parser.ast.stmt.IfStmt;
import pj.parser.ast.stmt.LabeledStmt;
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
import pj.parser.ast.type.PrimitiveType;
import pj.parser.ast.type.ReferenceType;
import pj.parser.ast.type.Type;
import pj.parser.ast.type.VoidType;
import pj.parser.ast.type.WildcardType;

import java.util.Iterator;
import java.util.List;

/**
 * @author Julio Vilmar Gesser
 */

public final class DumpVisitor implements VoidVisitor<Object> {

    private static class SourcePrinter {

        private int level = 0;

        private boolean indented = false;

        private final StringBuilder buf = new StringBuilder();

        public void indent() {
            level++;
        }

        public void unindent() {
            level--;
        }

        private void makeIndent() {
            for (int i = 0; i < level; i++) {
                buf.append("    ");
            }
        }

        public void print(String arg) {
            if (!indented) {
                makeIndent();
                indented = true;
            }
            buf.append(arg);
        }

        public void printLn(String arg) {
            print(arg);
            printLn();
        }

        public void printLn() {
            buf.append("\n");
            indented = false;
        }

        public String getSource() {
            return buf.toString();
        }

        @Override
        public String toString() {
            return getSource();
        }
    }

    private final SourcePrinter printer = new SourcePrinter();

    public String getSource() {
        return printer.getSource();
    }

    private void printModifiers(int modifiers) {
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

    private void printMembers(List<BodyDeclaration> members, Object arg) {
        for (BodyDeclaration member : members) {
            printer.printLn();
            member.accept(this, arg);
            printer.printLn();
        }
    }

    private void printMemberAnnotations(List<AnnotationExpr> annotations, Object arg) {
        if (annotations != null) {
            for (AnnotationExpr a : annotations) {
                a.accept(this, arg);
                printer.printLn();
            }
        }
    }

    private void printAnnotations(List<AnnotationExpr> annotations, Object arg) {
        if (annotations != null) {
            for (AnnotationExpr a : annotations) {
                a.accept(this, arg);
                printer.print(" ");
            }
        }
    }

    private void printTypeArgs(List<Type> args, Object arg) {
        if (args != null) {
            printer.print("<");
            for (Iterator<Type> i = args.iterator(); i.hasNext();) {
                Type t = i.next();
                t.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
            printer.print(">");
        }
    }

    private void printTypeParameters(List<TypeParameter> args, Object arg) {
        if (args != null) {
            printer.print("<");
            for (Iterator<TypeParameter> i = args.iterator(); i.hasNext();) {
                TypeParameter t = i.next();
                t.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
            printer.print(">");
        }
    }

    private void printArguments(List<Expression> args, Object arg) {
        printer.print("(");
        if (args != null) {
            for (Iterator<Expression> i = args.iterator(); i.hasNext();) {
                Expression e = i.next();
                e.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
        }
        printer.print(")");
    }

    private void printJavadoc(JavadocComment javadoc, Object arg) {
        if (javadoc != null) {
            javadoc.accept(this, arg);
        }
    }

    public void visit(CompilationUnit n, Object arg) {
        if (n.getPackage() != null) {
            n.getPackage().accept(this, arg);
        }
        if (n.getImports() != null) {
            for (ImportDeclaration i : n.getImports()) {
                i.accept(this, arg);
            }
            printer.printLn();
        }
        if (n.getTypes() != null) {
            for (Iterator<TypeDeclaration> i = n.getTypes().iterator(); i.hasNext();) {
                i.next().accept(this, arg);
                printer.printLn();
                if (i.hasNext()) {
                    printer.printLn();
                }
            }
        }
    }

    public void visit(PackageDeclaration n, Object arg) {
        printAnnotations(n.getAnnotations(), arg);
        printer.print("package ");
        n.getName().accept(this, arg);
        printer.printLn(";");
        printer.printLn();
    }

    public void visit(NameExpr n, Object arg) {
        printer.print(n.getName());
    }

    public void visit(QualifiedNameExpr n, Object arg) {
        n.getQualifier().accept(this, arg);
        printer.print(".");
        printer.print(n.getName());
    }

    public void visit(ImportDeclaration n, Object arg) {
        printer.print("import ");
        if (n.isStatic()) {
            printer.print("static ");
        }
        n.getName().accept(this, arg);
        if (n.isAsterisk()) {
            printer.print(".*");
        }
        printer.printLn(";");
    }

    public void visit(ClassOrInterfaceDeclaration n, Object arg) {
        printJavadoc(n.getJavaDoc(), arg);
        printMemberAnnotations(n.getAnnotations(), arg);
        printModifiers(n.getModifiers());

        if (n.isInterface()) {
            printer.print("interface ");
        } else {
            printer.print("class ");
        }

        printer.print(n.getName());

        printTypeParameters(n.getTypeParameters(), arg);

        if (n.getExtends() != null) {
            printer.print(" extends ");
            for (Iterator<ClassOrInterfaceType> i = n.getExtends().iterator(); i.hasNext();) {
                ClassOrInterfaceType c = i.next();
                c.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
        }

        if (n.getImplements() != null) {
            printer.print(" implements ");
            for (Iterator<ClassOrInterfaceType> i = n.getImplements().iterator(); i.hasNext();) {
                ClassOrInterfaceType c = i.next();
                c.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
        }

        printer.printLn(" {");
        printer.indent();
        if (n.getMembers() != null) {
            printMembers(n.getMembers(), arg);
        }
        printer.unindent();
        printer.print("}");
    }

    public void visit(EmptyTypeDeclaration n, Object arg) {
        printJavadoc(n.getJavaDoc(), arg);
        printer.print(";");
    }

    public void visit(JavadocComment n, Object arg) {
        printer.print("/**");
        printer.print(n.getContent());
        printer.printLn("*/");
    }

    public void visit(ClassOrInterfaceType n, Object arg) {
        if (n.getScope() != null) {
            n.getScope().accept(this, arg);
            printer.print(".");
        }
        printer.print(n.getName());
        printTypeArgs(n.getTypeArgs(), arg);
    }

    public void visit(TypeParameter n, Object arg) {
        printer.print(n.getName());
        if (n.getTypeBound() != null) {
            printer.print(" extends ");
            for (Iterator<ClassOrInterfaceType> i = n.getTypeBound().iterator(); i.hasNext();) {
                ClassOrInterfaceType c = i.next();
                c.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(" & ");
                }
            }
        }
    }

    public void visit(PrimitiveType n, Object arg) {
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

    public void visit(ReferenceType n, Object arg) {
        n.getType().accept(this, arg);
        for (int i = 0; i < n.getArrayCount(); i++) {
            printer.print("[]");
        }
    }

    public void visit(WildcardType n, Object arg) {
        printer.print("?");
        if (n.getExtends() != null) {
            printer.print(" extends ");
            n.getExtends().accept(this, arg);
        }
        if (n.getSuper() != null) {
            printer.print(" super ");
            n.getSuper().accept(this, arg);
        }
    }

    public void visit(FieldDeclaration n, Object arg) {
        printJavadoc(n.getJavaDoc(), arg);
        printMemberAnnotations(n.getAnnotations(), arg);
        printModifiers(n.getModifiers());
        n.getType().accept(this, arg);

        printer.print(" ");
        for (Iterator<VariableDeclarator> i = n.getVariables().iterator(); i.hasNext();) {
            VariableDeclarator var = i.next();
            var.accept(this, arg);
            if (i.hasNext()) {
                printer.print(", ");
            }
        }

        printer.print(";");
    }

    public void visit(VariableDeclarator n, Object arg) {
        n.getId().accept(this, arg);
        if (n.getInit() != null) {
            printer.print(" = ");
            n.getInit().accept(this, arg);
        }
    }

    public void visit(VariableDeclaratorId n, Object arg) {
        printer.print(n.getName());
        for (int i = 0; i < n.getArrayCount(); i++) {
            printer.print("[]");
        }
    }

    public void visit(ArrayInitializerExpr n, Object arg) {
        printer.print("{");
        if (n.getValues() != null) {
            printer.print(" ");
            for (Iterator<Expression> i = n.getValues().iterator(); i.hasNext();) {
                Expression expr = i.next();
                expr.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
            printer.print(" ");
        }
        printer.print("}");
    }

    public void visit(VoidType n, Object arg) {
        printer.print("void");
    }

    public void visit(ArrayAccessExpr n, Object arg) {
        n.getName().accept(this, arg);
        printer.print("[");
        n.getIndex().accept(this, arg);
        printer.print("]");
    }

    public void visit(ArrayCreationExpr n, Object arg) {
        printer.print("new ");
        n.getType().accept(this, arg);

        if (n.getDimensions() != null) {
            for (Expression dim : n.getDimensions()) {
                printer.print("[");
                dim.accept(this, arg);
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
            n.getInitializer().accept(this, arg);
        }
    }

    public void visit(AssignExpr n, Object arg) {
        n.getTarget().accept(this, arg);
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
        n.getValue().accept(this, arg);
    }

    public void visit(BinaryExpr n, Object arg) {
        n.getLeft().accept(this, arg);
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
        n.getRight().accept(this, arg);
    }

    public void visit(CastExpr n, Object arg) {
        printer.print("(");
        n.getType().accept(this, arg);
        printer.print(") ");
        n.getExpr().accept(this, arg);
    }

    public void visit(ClassExpr n, Object arg) {
        n.getType().accept(this, arg);
        printer.print(".class");
    }

    public void visit(ConditionalExpr n, Object arg) {
        n.getCondition().accept(this, arg);
        printer.print(" ? ");
        n.getThenExpr().accept(this, arg);
        printer.print(" : ");
        n.getElseExpr().accept(this, arg);
    }

    public void visit(EnclosedExpr n, Object arg) {
        printer.print("(");
        n.getInner().accept(this, arg);
        printer.print(")");
    }

    public void visit(FieldAccessExpr n, Object arg) {
        n.getScope().accept(this, arg);
        printer.print(".");
        printer.print(n.getField());
    }

    public void visit(InstanceOfExpr n, Object arg) {
        n.getExpr().accept(this, arg);
        printer.print(" instanceof ");
        n.getType().accept(this, arg);
    }

    public void visit(CharLiteralExpr n, Object arg) {
        printer.print("'");
        printer.print(n.getValue());
        printer.print("'");
    }

    public void visit(DoubleLiteralExpr n, Object arg) {
        printer.print(n.getValue());
    }

    public void visit(IntegerLiteralExpr n, Object arg) {
        printer.print(n.getValue());
    }

    public void visit(LongLiteralExpr n, Object arg) {
        printer.print(n.getValue());
    }

    public void visit(IntegerLiteralMinValueExpr n, Object arg) {
        printer.print(n.getValue());
    }

    public void visit(LongLiteralMinValueExpr n, Object arg) {
        printer.print(n.getValue());
    }

    public void visit(StringLiteralExpr n, Object arg) {
        printer.print("\"");
        printer.print(n.getValue());
        printer.print("\"");
    }

    public void visit(BooleanLiteralExpr n, Object arg) {
        printer.print(String.valueOf(n.getValue()));
    }

    public void visit(NullLiteralExpr n, Object arg) {
        printer.print("null");
    }

    public void visit(ThisExpr n, Object arg) {
        if (n.getClassExpr() != null) {
            n.getClassExpr().accept(this, arg);
            printer.print(".");
        }
        printer.print("this");
    }

    public void visit(SuperExpr n, Object arg) {
        if (n.getClassExpr() != null) {
            n.getClassExpr().accept(this, arg);
            printer.print(".");
        }
        printer.print("super");
    }

    public void visit(MethodCallExpr n, Object arg) {
        if (n.getScope() != null) {
            n.getScope().accept(this, arg);
            printer.print(".");
        }
        printTypeArgs(n.getTypeArgs(), arg);
        printer.print(n.getName());
        printArguments(n.getArgs(), arg);
    }

    public void visit(ObjectCreationExpr n, Object arg) {
        if (n.getScope() != null) {
            n.getScope().accept(this, arg);
            printer.print(".");
        }

        printer.print("new ");

        printTypeArgs(n.getTypeArgs(), arg);
        n.getType().accept(this, arg);

        printArguments(n.getArgs(), arg);

        if (n.getAnonymousClassBody() != null) {
            printer.printLn(" {");
            printer.indent();
            printMembers(n.getAnonymousClassBody(), arg);
            printer.unindent();
            printer.print("}");
        }
    }

    public void visit(UnaryExpr n, Object arg) {
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

        n.getExpr().accept(this, arg);

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

    public void visit(ConstructorDeclaration n, Object arg) {
        printJavadoc(n.getJavaDoc(), arg);
        printMemberAnnotations(n.getAnnotations(), arg);
        printModifiers(n.getModifiers());

        printTypeParameters(n.getTypeParameters(), arg);
        if (n.getTypeParameters() != null) {
            printer.print(" ");
        }
        printer.print(n.getName());

        printer.print("(");
        if (n.getParameters() != null) {
            for (Iterator<Parameter> i = n.getParameters().iterator(); i.hasNext();) {
                Parameter p = i.next();
                p.accept(this, arg);
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
                name.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
        }
        printer.print(" ");
        n.getBlock().accept(this, arg);
    }

    public void visit(MethodDeclaration n, Object arg) {
        printJavadoc(n.getJavaDoc(), arg);
        printMemberAnnotations(n.getAnnotations(), arg);
        printModifiers(n.getModifiers());

        printTypeParameters(n.getTypeParameters(), arg);
        if (n.getTypeParameters() != null) {
            printer.print(" ");
        }

        n.getType().accept(this, arg);
        printer.print(" ");
        printer.print(n.getName());

        printer.print("(");
        if (n.getParameters() != null) {
            for (Iterator<Parameter> i = n.getParameters().iterator(); i.hasNext();) {
                Parameter p = i.next();
                p.accept(this, arg);
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
                name.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
        }
        if (n.getBody() == null) {
            printer.print(";");
        } else {
            printer.print(" ");
            n.getBody().accept(this, arg);
        }
    }

    public void visit(Parameter n, Object arg) {
        printAnnotations(n.getAnnotations(), arg);
        printModifiers(n.getModifiers());

        n.getType().accept(this, arg);
        if (n.isVarArgs()) {
            printer.print("...");
        }
        printer.print(" ");
        n.getId().accept(this, arg);
    }

    public void visit(ExplicitConstructorInvocationStmt n, Object arg) {
        if (n.isThis()) {
            printTypeArgs(n.getTypeArgs(), arg);
            printer.print("this");
        } else {
            if (n.getExpr() != null) {
                n.getExpr().accept(this, arg);
                printer.print(".");
            }
            printTypeArgs(n.getTypeArgs(), arg);
            printer.print("super");
        }
        printArguments(n.getArgs(), arg);
        printer.print(";");
    }

    public void visit(VariableDeclarationExpr n, Object arg) {
        printAnnotations(n.getAnnotations(), arg);
        printModifiers(n.getModifiers());

        n.getType().accept(this, arg);
        printer.print(" ");

        for (Iterator<VariableDeclarator> i = n.getVars().iterator(); i.hasNext();) {
            VariableDeclarator v = i.next();
            v.accept(this, arg);
            if (i.hasNext()) {
                printer.print(", ");
            }
        }
    }

    public void visit(TypeDeclarationStmt n, Object arg) {
        n.getTypeDeclaration().accept(this, arg);
    }

    public void visit(AssertStmt n, Object arg) {
        printer.print("assert ");
        n.getCheck().accept(this, arg);
        if (n.getMessage() != null) {
            printer.print(" : ");
            n.getMessage().accept(this, arg);
        }
        printer.print(";");
    }

    public void visit(BlockStmt n, Object arg) {
        printer.printLn("{");
        if (n.getStmts() != null) {
            printer.indent();
            for (Statement s : n.getStmts()) {
                s.accept(this, arg);
                printer.printLn();
            }
            printer.unindent();
        }
        printer.print("}");

    }

    public void visit(LabeledStmt n, Object arg) {
        printer.print(n.getLabel());
        printer.print(": ");
        n.getStmt().accept(this, arg);
    }

    public void visit(EmptyStmt n, Object arg) {
        printer.print(";");
    }

    public void visit(ExpressionStmt n, Object arg) {
        n.getExpression().accept(this, arg);
        printer.print(";");
    }

    public void visit(SwitchStmt n, Object arg) {
        printer.print("switch(");
        n.getSelector().accept(this, arg);
        printer.printLn(") {");
        if (n.getEntries() != null) {
            printer.indent();
            for (SwitchEntryStmt e : n.getEntries()) {
                e.accept(this, arg);
            }
            printer.unindent();
        }
        printer.print("}");

    }

    public void visit(SwitchEntryStmt n, Object arg) {
        if (n.getLabel() != null) {
            printer.print("case ");
            n.getLabel().accept(this, arg);
            printer.print(":");
        } else {
            printer.print("default:");
        }
        printer.printLn();
        printer.indent();
        if (n.getStmts() != null) {
            for (Statement s : n.getStmts()) {
                s.accept(this, arg);
                printer.printLn();
            }
        }
        printer.unindent();
    }

    public void visit(BreakStmt n, Object arg) {
        printer.print("break");
        if (n.getId() != null) {
            printer.print(" ");
            printer.print(n.getId());
        }
        printer.print(";");
    }

    public void visit(ReturnStmt n, Object arg) {
        printer.print("return");
        if (n.getExpr() != null) {
            printer.print(" ");
            n.getExpr().accept(this, arg);
        }
        printer.print(";");
    }

    public void visit(EnumDeclaration n, Object arg) {
        printJavadoc(n.getJavaDoc(), arg);
        printMemberAnnotations(n.getAnnotations(), arg);
        printModifiers(n.getModifiers());

        printer.print("enum ");
        printer.print(n.getName());

        if (n.getImplements() != null) {
            printer.print(" implements ");
            for (Iterator<ClassOrInterfaceType> i = n.getImplements().iterator(); i.hasNext();) {
                ClassOrInterfaceType c = i.next();
                c.accept(this, arg);
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
                e.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
        }
        if (n.getMembers() != null) {
            printer.printLn(";");
            printMembers(n.getMembers(), arg);
        } else {
            if (n.getEntries() != null) {
                printer.printLn();
            }
        }
        printer.unindent();
        printer.print("}");
    }

    public void visit(EnumConstantDeclaration n, Object arg) {
        printJavadoc(n.getJavaDoc(), arg);
        printMemberAnnotations(n.getAnnotations(), arg);
        printer.print(n.getName());

        if (n.getArgs() != null) {
            printArguments(n.getArgs(), arg);
        }

        if (n.getClassBody() != null) {
            printer.printLn(" {");
            printer.indent();
            printMembers(n.getClassBody(), arg);
            printer.unindent();
            printer.printLn("}");
        }
    }

    public void visit(EmptyMemberDeclaration n, Object arg) {
        printJavadoc(n.getJavaDoc(), arg);
        printer.print(";");
    }

    public void visit(InitializerDeclaration n, Object arg) {
        printJavadoc(n.getJavaDoc(), arg);
        if (n.isStatic()) {
            printer.print("static ");
        }
        n.getBlock().accept(this, arg);
    }

    public void visit(IfStmt n, Object arg) {
        printer.print("if (");
        n.getCondition().accept(this, arg);
        printer.print(") ");
        n.getThenStmt().accept(this, arg);
        if (n.getElseStmt() != null) {
            printer.print(" else ");
            n.getElseStmt().accept(this, arg);
        }
    }

    public void visit(WhileStmt n, Object arg) {
        printer.print("while (");
        n.getCondition().accept(this, arg);
        printer.print(") ");
        n.getBody().accept(this, arg);
    }

    public void visit(ContinueStmt n, Object arg) {
        printer.print("continue");
        if (n.getId() != null) {
            printer.print(" ");
            printer.print(n.getId());
        }
        printer.print(";");
    }

    public void visit(DoStmt n, Object arg) {
        printer.print("do ");
        n.getBody().accept(this, arg);
        printer.print(" while (");
        n.getCondition().accept(this, arg);
        printer.print(");");
    }

    public void visit(ForeachStmt n, Object arg) {
        printer.print("for (");
        n.getVariable().accept(this, arg);
        printer.print(" : ");
        n.getIterable().accept(this, arg);
        printer.print(") ");
        n.getBody().accept(this, arg);
    }

    public void visit(ForStmt n, Object arg) {
        printer.print("for (");
        if (n.getInit() != null) {
            for (Iterator<Expression> i = n.getInit().iterator(); i.hasNext();) {
                Expression e = i.next();
                e.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
        }
        printer.print("; ");
        if (n.getCompare() != null) {
            n.getCompare().accept(this, arg);
        }
        printer.print("; ");
        if (n.getUpdate() != null) {
            for (Iterator<Expression> i = n.getUpdate().iterator(); i.hasNext();) {
                Expression e = i.next();
                e.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
        }
        printer.print(") ");
        n.getBody().accept(this, arg);
    }

    public void visit(ThrowStmt n, Object arg) {
        printer.print("throw ");
        n.getExpr().accept(this, arg);
        printer.print(";");
    }

    public void visit(SynchronizedStmt n, Object arg) {
        printer.print("synchronized (");
        n.getExpr().accept(this, arg);
        printer.print(") ");
        n.getBlock().accept(this, arg);
    }

    public void visit(TryStmt n, Object arg) {
        printer.print("try ");
        n.getTryBlock().accept(this, arg);
        if (n.getCatchs() != null) {
            for (CatchClause c : n.getCatchs()) {
                c.accept(this, arg);
            }
        }
        if (n.getFinallyBlock() != null) {
            printer.print(" finally ");
            n.getFinallyBlock().accept(this, arg);
        }
    }

    public void visit(CatchClause n, Object arg) {
        printer.print(" catch (");
        n.getExcept().accept(this, arg);
        printer.print(") ");
        n.getCatchBlock().accept(this, arg);

    }

    public void visit(AnnotationDeclaration n, Object arg) {
        printJavadoc(n.getJavaDoc(), arg);
        printMemberAnnotations(n.getAnnotations(), arg);
        printModifiers(n.getModifiers());

        printer.print("@interface ");
        printer.print(n.getName());
        printer.printLn(" {");
        printer.indent();
        if (n.getMembers() != null) {
            printMembers(n.getMembers(), arg);
        }
        printer.unindent();
        printer.print("}");
    }

    public void visit(AnnotationMemberDeclaration n, Object arg) {
        printJavadoc(n.getJavaDoc(), arg);
        printMemberAnnotations(n.getAnnotations(), arg);
        printModifiers(n.getModifiers());

        n.getType().accept(this, arg);
        printer.print(" ");
        printer.print(n.getName());
        printer.print("()");
        if (n.getDefaultValue() != null) {
            printer.print(" default ");
            n.getDefaultValue().accept(this, arg);
        }
        printer.print(";");
    }

    public void visit(MarkerAnnotationExpr n, Object arg) {
        printer.print("@");
        n.getName().accept(this, arg);
    }

    public void visit(SingleMemberAnnotationExpr n, Object arg) {
        printer.print("@");
        n.getName().accept(this, arg);
        printer.print("(");
        n.getMemberValue().accept(this, arg);
        printer.print(")");
    }

    public void visit(NormalAnnotationExpr n, Object arg) {
        printer.print("@");
        n.getName().accept(this, arg);
        printer.print("(");
        if (n.getPairs() != null) {
            for (Iterator<MemberValuePair> i = n.getPairs().iterator(); i.hasNext();) {
                MemberValuePair m = i.next();
                m.accept(this, arg);
                if (i.hasNext()) {
                    printer.print(", ");
                }
            }
        }
        printer.print(")");
    }

    public void visit(MemberValuePair n, Object arg) {
        printer.print(n.getName());
        printer.print(" = ");
        n.getValue().accept(this, arg);
    }

    public void visit(LineComment n, Object arg) {
        printer.print("//");
        printer.printLn(n.getContent());
    }

    public void visit(BlockComment n, Object arg) {
        printer.print("/*");
        printer.print(n.getContent());
        printer.printLn("*/");
    }
    
    /**************************************************
     * OpenMP DumpVisotors                            *
     **************************************************/
    
	@Override
	public void visit(OmpAtomicConstruct n, Object arg) {
		printer.print("//#omp atomic ");
		printer.printLn();
		n.getStatement().accept(this, arg);	
	}

	@Override
	public void visit(OmpBarrierDirective n, Object arg) {
		printer.print("//#omp barrier ");
		printer.printLn();
	}

	@Override
	public void visit(OmpCopyprivateDataClause n, Object arg) {
		printer.print("cpoyprivate ");
		printer.print("(");
		Iterator<Expression> var = n.getArgumentSet().iterator();
		while (var.hasNext()) {
			var.next().accept(this, arg);
			if (var.hasNext())
				printer.print(", ");
		}
		printer.print(") ");
	}

	@Override
	public void visit(OmpCriticalConstruct n, Object arg) {
		printer.print("//#omp critical ");
		if (null != n.getIdentifier()) {
			n.getIdentifier().accept(this, arg);
		}
		printer.printLn();
		n.getStatement().accept(this, arg);
		
	}

	@Override
	public void visit(OmpDataClause n, Object arg) {
		throw new RuntimeException("OmpDataClause is abstract class, should not appear here");		
	}

	@Override
	public void visit(OmpDefaultDataClause n, Object arg) {
		printer.print("default ");
		printer.print("(");
		switch (n.getPolicy()) {
		case None:
			printer.print("none");
			break;
		case Shared:
			printer.print("shared");
			break;
		}
		printer.print(") ");
		
	}

	@Override
	public void visit(OmpFlushDirective n, Object arg) {
		printer.print("//#omp flush ");
		printer.printLn();
	}

	@Override
	public void visit(OmpForConstruct n, Object arg) {
		printer.print("//#omp for ");
		if (n.getDataClauseList() != null) {
			for (OmpDataClause dataClause: n.getDataClauseList()) {
				dataClause.accept(this, arg);
			}
		}	
		if (n.getScheduleClause() != null)
			n.getScheduleClause().accept(this, arg);
		if (n.isNowait())
			printer.print("nowait ");
		if (n.isOrdered())
			printer.print("ordered ");
		printer.printLn();
		n.getForStmt().accept(this, arg);
	}

	@Override
	public void visit(OmpFreeguiConstruct n, Object arg) {
		printer.print("//#omp freeguithread ");
		if (null != n.getBody()) {
			n.getBody().accept(this, arg);
		}else if (n.getOpenMPStatement() != null) {
			n.getOpenMPStatement().accept(this, arg);
		}
	}

	@Override
	public void visit(OmpGuiConstruct n, Object arg) {
		printer.printLn("//#omp gui ");
		if (n.isNowait())
			printer.print("nowait ");
		printer.printLn();
		n.getStatement().accept(this, arg);
	}

	@Override
	public void visit(OmpIfClause n, Object arg) {
		printer.print("if");
		printer.print("(");
		n.getIfExpression().accept(this, arg);
		printer.print(") ");
	}

	@Override
	public void visit(OmpLastprivateDataClause n, Object arg) {
		printer.print("lastprivate");
		printer.print("(");
		Iterator<Expression> var = n.getArgumentSet().iterator();
		while (var.hasNext()) {
			var.next().accept(this, arg);
			if (var.hasNext())
				printer.print(", ");
		}
		printer.print(") ");
	}

	@Override
	public void visit(OmpMasterConstruct n, Object arg) {
		printer.print("//#omp master ");
		printer.printLn();
		n.getStatement().accept(this, arg);
	}

	@Override
	public void visit(OmpNumthreadsClause n, Object arg) {
		printer.print("num_threads");
		printer.print("(");
		n.getNumExpression().accept(this, arg);
		printer.print(") "); 
	}

	@Override
	public void visit(OmpOrderedConstruct n, Object arg) {
		printer.print("//#omp ordered ");
		printer.printLn();
		n.getStatement().accept(this, arg);
	}

	@Override
	public void visit(OmpParallelConstruct n, Object arg) {
		printer.print("//#omp parallel ");
		if (n.getNumThreadsExpression() != null)
			n.getNumThreadsExpression().accept(this, arg);
		if (n.getIfClause() != null) 
			n.accept(this, arg);
		if (n.getDataClauseList() != null) {
			for (OmpDataClause clause: n.getDataClauseList()) {
				clause.accept(this, arg);
			}
		}
		printer.printLn();
		printer.printLn("{");
		printer.indent();
		n.getBody().accept(this, arg);
		printer.printLn();
		printer.unindent();
		printer.print("}");
	}

	@Override
	public void visit(OmpParallelForConstruct n, Object arg) {
		throw new RuntimeException("ParallelForConstruct should already be normalised");
		
	}

	@Override
	public void visit(OmpParallelSectionsConstruct n, Object arg) {
		throw new RuntimeException("ParallelSectionConstruct should already be normalised");
		
	}

	@Override
	public void visit(OmpPrivateDataClause n, Object arg) {
		printer.print("private");
		printer.print("(");
		Iterator<Expression> var = n.getArgumentSet().iterator();
		while (var.hasNext()) {
			var.next().accept(this, arg);
			if (var.hasNext())
				printer.print(", ");
		}
		printer.print(") ");
	}
	

	@Override
	public void visit(OmpReductionDataClause n, Object arg) {
		printer.print("reduction");
		printer.print("(");
		Iterator<Expression> varIter = n.getArgumentMap().keySet().iterator();
		while (varIter.hasNext()) {
			Expression var = varIter.next();
			n.getArgumentMap().get(var).accept(this, arg);
			printer.print(":");
			var.accept(this, arg);
			if (varIter.hasNext())
				printer.print(", ");
		}
		printer.print(") ");
	}
	
	@Override
    public void visit(OmpReductionOperator n, Object arg) {
		if (null != n.getUserDefinedReduction()) {
			printer.print(n.getUserDefinedReduction().toString());
		} else {
			printer.print(n.getOperatorString());
		}
	}

	@Override
	public void visit(OmpScheduleClause n, Object arg) {
		printer.print("schedule");
		printer.print("(");
		switch (n.getScheduleType()) {
		case Dynamic:
			printer.print("dynamic");
			break;
		case Static:
			printer.print("static");
			break;
		case Guided:
			printer.print("guided");
			break;
		case Runtime:
			printer.print("runtime");
			break;
		case Auto:
			printer.print("auto");
			break;
		default:
			throw new RuntimeException("Unexpected schedule type.");
		}
		if (n.getChunkSize() != null) {
			printer.print(",");
			n.getChunkSize().accept(this, arg);
		}
		printer.print(") ");
	}

	@Override
	public void visit(OmpSectionConstruct n, Object arg) {
		throw new RuntimeException("SectionConstruct should already be normalised");
	}

	@Override
	public void visit(OmpSectionsConstruct n, Object arg) {
		throw new RuntimeException("SectionConstruct should already be normalised");
	}

	@Override
	public void visit(OmpSharedDataClause n, Object arg) {
		printer.print("shared");
		printer.print("(");
		Iterator<Expression> var = n.getArgumentSet().iterator();
		while (var.hasNext()) {
			var.next().accept(this, arg);
			if (var.hasNext())
				printer.print(", ");
		}
		printer.print(") ");
	}

	@Override
	public void visit(OmpSingleConstruct n, Object arg) {
		printer.print("//#omp single ");
		if (n.isNowait()) 
			printer.print("nowait ");
		if (n.getDataClauseList() != null) {
			for(OmpDataClause clause: n.getDataClauseList()) {
				clause.accept(this, arg);
			}
		}
		printer.printLn();
		n.getStatement().accept(this, arg);
	}

	@Override
	public void visit(OpenMPStatement n, Object arg) {
		throw new RuntimeException("OpenMPStatement is abstract class, should not appear here");
		
	}
	
	/*provide cancellation directives Xing added at 2015.1.8*/
	@Override
	public void visit(OmpCancellationPointDirective n, Object arg) {
		printer.print("//#omp cancellation point ");
		if (n.getRegion() != null) {
			switch (n.getRegion()) {
			case Parallel:
				printer.print("parallel ");
			case For:
				printer.print("for ");
			case Sections:
				printer.print("sections ");
			case Taskgroup:
				printer.print("taskgroup ");
			}
		}
		printer.printLn();
	}

	@Override
	public void visit(OmpCancelDirective n, Object arg) {
		printer.print("//#omp cancel ");
		if (n.getRegion() != null) {
			switch (n.getRegion()) {
			case Parallel:
				printer.print("parallel ");
			case For:
				printer.print("for ");
			case Sections:
				printer.print("sections ");
			case Taskgroup:
				printer.print("taskgroup ");
			}
		}
		if (n.getThreadAffiliate() != null) {
			switch (n.getThreadAffiliate()) {
			case Local:
				printer.print("local ");
			case Global:
				printer.print("global ");
			}
		}
		if (n.getIfStmt() != null) {
			printer.print(n.getIfStmt().toString());
		}
		if (n.getTag() != null) {
			printer.print(n.getTag());
		}
		printer.printLn();
		printer.printLn();
	}

	@Override
	public void visit(OmpTargetConstruct n, Object arg) {
		printer.print("//#omp target");
		
		if (n.isVirtual()) {
			printer.print(" virtual");
		}
		
		printer.print("(" + n.getTargetName() + ") ");
		
		if (n.isAwait()) {
			printer.print("await ");
		} else if (n.isNoWait()) {
			printer.print("nowait ");
		} else if (n.isSync()) {
			printer.print("astask(" + n.getTaskName() + ") ");
		}
		
		if (n.getIfClause() != null) {
			n.accept(this, arg);
		}

		if (n.getDataClauseList() != null) {
			for (OmpDataClause clause: n.getDataClauseList()) {
				clause.accept(this, arg);
			}
		}
		
		printer.printLn();
		printer.printLn("{");
		printer.indent();
		n.getBody().accept(this, arg);
		printer.printLn();
		printer.unindent();
		printer.print("}");
	}
	
	@Override
	public void visit(OmpWaitDirective n, Object arg) {
		printer.print("//omp wait");
		printer.print("(");
		printer.print(n.getTaskName());
		printer.printLn(")");
	}

	@Override
	public void visit(OmpAwaitConstruct n, Object arg) {
		printer.print("//#omp await ");
		printer.printLn();
		n.getBody().accept(this, arg);
	}

}
