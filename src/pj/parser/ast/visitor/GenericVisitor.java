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
import pj.parser.ast.body.Parameter;
import pj.parser.ast.body.VariableDeclarator;
import pj.parser.ast.body.VariableDeclaratorId;
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
import pj.parser.ast.omp.OmpBarrierDirective;
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
import pj.parser.ast.omp.OmpScheduleClause;
import pj.parser.ast.omp.OmpSectionConstruct;
import pj.parser.ast.omp.OmpSectionsConstruct;
import pj.parser.ast.omp.OmpSharedDataClause;
import pj.parser.ast.omp.OmpSingleConstruct;
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
import pj.parser.ast.type.VoidType;
import pj.parser.ast.type.WildcardType;

/**
 * @author Julio Vilmar Gesser
 */
public interface GenericVisitor<R, A> {

    //- Compilation Unit ----------------------------------

    public R visit(CompilationUnit n, A arg);

    public R visit(PackageDeclaration n, A arg);

    public R visit(ImportDeclaration n, A arg);

    public R visit(TypeParameter n, A arg);

    public R visit(LineComment n, A arg);

    public R visit(BlockComment n, A arg);

    //- Body ----------------------------------------------

    public R visit(ClassOrInterfaceDeclaration n, A arg);

    public R visit(EnumDeclaration n, A arg);

    public R visit(EmptyTypeDeclaration n, A arg);

    public R visit(EnumConstantDeclaration n, A arg);

    public R visit(AnnotationDeclaration n, A arg);

    public R visit(AnnotationMemberDeclaration n, A arg);

    public R visit(FieldDeclaration n, A arg);

    public R visit(VariableDeclarator n, A arg);

    public R visit(VariableDeclaratorId n, A arg);

    public R visit(ConstructorDeclaration n, A arg);

    public R visit(MethodDeclaration n, A arg);

    public R visit(Parameter n, A arg);

    public R visit(EmptyMemberDeclaration n, A arg);

    public R visit(InitializerDeclaration n, A arg);

    public R visit(JavadocComment n, A arg);

    //- Type ----------------------------------------------

    public R visit(ClassOrInterfaceType n, A arg);

    public R visit(PrimitiveType n, A arg);

    public R visit(ReferenceType n, A arg);

    public R visit(VoidType n, A arg);

    public R visit(WildcardType n, A arg);

    //- Expression ----------------------------------------

    public R visit(ArrayAccessExpr n, A arg);

    public R visit(ArrayCreationExpr n, A arg);

    public R visit(ArrayInitializerExpr n, A arg);

    public R visit(AssignExpr n, A arg);

    public R visit(BinaryExpr n, A arg);

    public R visit(CastExpr n, A arg);

    public R visit(ClassExpr n, A arg);

    public R visit(ConditionalExpr n, A arg);

    public R visit(EnclosedExpr n, A arg);

    public R visit(FieldAccessExpr n, A arg);

    public R visit(InstanceOfExpr n, A arg);

    public R visit(StringLiteralExpr n, A arg);

    public R visit(IntegerLiteralExpr n, A arg);

    public R visit(LongLiteralExpr n, A arg);

    public R visit(IntegerLiteralMinValueExpr n, A arg);

    public R visit(LongLiteralMinValueExpr n, A arg);

    public R visit(CharLiteralExpr n, A arg);

    public R visit(DoubleLiteralExpr n, A arg);

    public R visit(BooleanLiteralExpr n, A arg);

    public R visit(NullLiteralExpr n, A arg);

    public R visit(MethodCallExpr n, A arg);

    public R visit(NameExpr n, A arg);

    public R visit(ObjectCreationExpr n, A arg);

    public R visit(QualifiedNameExpr n, A arg);

    public R visit(ThisExpr n, A arg);

    public R visit(SuperExpr n, A arg);

    public R visit(UnaryExpr n, A arg);

    public R visit(VariableDeclarationExpr n, A arg);

    public R visit(MarkerAnnotationExpr n, A arg);

    public R visit(SingleMemberAnnotationExpr n, A arg);

    public R visit(NormalAnnotationExpr n, A arg);

    public R visit(MemberValuePair n, A arg);

    //- Statements ----------------------------------------

    public R visit(ExplicitConstructorInvocationStmt n, A arg);

    public R visit(TypeDeclarationStmt n, A arg);

    public R visit(AssertStmt n, A arg);

    public R visit(BlockStmt n, A arg);

    public R visit(LabeledStmt n, A arg);

    public R visit(EmptyStmt n, A arg);

    public R visit(ExpressionStmt n, A arg);

    public R visit(SwitchStmt n, A arg);

    public R visit(SwitchEntryStmt n, A arg);

    public R visit(BreakStmt n, A arg);

    public R visit(ReturnStmt n, A arg);

    public R visit(IfStmt n, A arg);

    public R visit(WhileStmt n, A arg);

    public R visit(ContinueStmt n, A arg);

    public R visit(DoStmt n, A arg);

    public R visit(ForeachStmt n, A arg);

    public R visit(ForStmt n, A arg);

    public R visit(ThrowStmt n, A arg);

    public R visit(SynchronizedStmt n, A arg);

    public R visit(TryStmt n, A arg);

    public R visit(CatchClause n, A arg);
    
    //- OpenMP expansion ----------------------------------------
    
    public R visit(OmpAtomicConstruct n, A arg);
    
    public R visit(OmpBarrierDirective n, A arg);
    
    public R visit(OmpCopyprivateDataClause n, A arg);
    
    public R visit(OmpCriticalConstruct n, A arg);
    
    public R visit(OmpDataClause n, A arg);
    
    public R visit(OmpDefaultDataClause n, A arg);
    
    public R visit(OmpFlushDirective n, A arg);
    
    public R visit(OmpForConstruct n, A arg);
    
    public R visit(OmpFreeguiConstruct n, A arg);
    
    public R visit(OmpGuiConstruct n, A arg);
    
    public R visit(OmpIfClause n, A arg);
    
    public R visit(OmpLastprivateDataClause n, A arg);
    
    public R visit(OmpMasterConstruct n, A arg);
    
    public R visit(OmpNumthreadsClause n, A arg);
    
    public R visit(OmpOrderedConstruct n, A arg);
    
    public R visit(OmpParallelConstruct n, A arg);
    
    public R visit(OmpParallelForConstruct n, A arg);
    
    public R visit(OmpParallelSectionsConstruct n, A arg);
    
    public R visit(OmpPrivateDataClause n, A arg);
    
    public R visit(OmpReductionDataClause n, A arg);
    
    public R visit(OmpScheduleClause n, A arg);
    
    public R visit(OmpSectionConstruct n, A arg);
    
    public R visit(OmpSectionsConstruct n, A arg);
    
    public R visit(OmpSharedDataClause n, A arg);
    
    public R visit(OmpSingleConstruct n, A arg);
    
    public R visit(OpenMPStatement n, A arg);


}
