package japa;

import java.util.ArrayList;
import java.util.List;

import japa.Java8Parser.*;
import japa.parser.ast.*;
import japa.parser.ast.body.*;
import japa.parser.ast.expr.*;
import japa.parser.ast.stmt.*;
import japa.parser.ast.type.*;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class Java8AstVisitor<Node> extends AbstractParseTreeVisitor<Node> implements Java8Visitor<Node> {

	@Override
	public Node visitFieldAccess(FieldAccessContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitConstructorDeclarator(ConstructorDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMethodModifier(MethodModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTypeDeclaration(TypeDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitLambdaParameters(LambdaParametersContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitClassMemberDeclaration(ClassMemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInterfaceMethodModifier(InterfaceMethodModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOpenmpConstruct(OpenmpConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpNumthreadsClause(OmpNumthreadsClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitThrows_(Throws_Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitNormalClassDeclaration(NormalClassDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPostDecrementExpression_lf_postfixExpression(
			PostDecrementExpression_lf_postfixExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitClassInstanceCreationExpression(
			ClassInstanceCreationExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMethodName(MethodNameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitEnumConstantName(EnumConstantNameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAssignmentExpression(AssignmentExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSimpleTypeName(SimpleTypeNameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInterfaceTypeList(InterfaceTypeListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpForConstruct(OmpForConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitClassModifier(ClassModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInterfaceMethodDeclaration(
			InterfaceMethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSuperclass(SuperclassContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMarkerAnnotation(MarkerAnnotationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitCatchClause(CatchClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitConstantExpression(ConstantExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSingleElementAnnotation(SingleElementAnnotationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitEnumBody(EnumBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpParallelSectionsConstruct(
			OmpParallelSectionsConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitExplicitConstructorInvocation(
			ExplicitConstructorInvocationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInterfaceType(InterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitDimExprs(DimExprsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitFieldModifier(FieldModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTypeBound(TypeBoundContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnannClassType(UnannClassTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitVariableInitializer(VariableInitializerContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPreDecrementExpression(PreDecrementExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPrimaryNoNewArray(PrimaryNoNewArrayContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAndExpression(AndExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitWildcardBounds(WildcardBoundsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitExpressionName(ExpressionNameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitStatementWithoutTrailingSubstatement(
			StatementWithoutTrailingSubstatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitStatementNoShortIf(StatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitFieldDeclaration(FieldDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitNormalInterfaceDeclaration(
			NormalInterfaceDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnannTypeVariable(UnannTypeVariableContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitFormalParameterList(FormalParameterListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitCatches(CatchesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPrimaryNoNewArray_lfno_primary(
			PrimaryNoNewArray_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitClassDeclaration(ClassDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPostIncrementExpression(PostIncrementExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpOrderedConstruct(OmpOrderedConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAssignment(AssignmentContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSwitchStatement(SwitchStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPackageModifier(PackageModifierContext ctx) {
		PackageModifier packageModifier = null;
		Annotation annotation = null;
		
		NodeLocationer nl = new NodeLocationer(ctx);
		
		if (null != ctx.annotation()) {
			annotation = (Annotation) ctx.annotation().accept(this);
		}
		
		packageModifier = new PackageModifier(nl.startLine, nl.startColumn, nl.endLine, nl.endColumn, annotation);
		return (Node)packageModifier;
	}

	@Override
	public Node visitFormalParameters(FormalParametersContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitCastExpression(CastExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTypeArgument(TypeArgumentContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTryWithResourcesStatement(
			TryWithResourcesStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitLambdaBody(LambdaBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitThrowStatement(ThrowStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitEnhancedForStatementNoShortIf(
			EnhancedForStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpFlushDirective(OmpFlushDirectiveContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTypeArgumentList(TypeArgumentListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitExpression(ExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitVariableDeclarator(VariableDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAnnotationTypeDeclaration(
			AnnotationTypeDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitEnumConstantModifier(EnumConstantModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnannInterfaceType_lf_unannClassOrInterfaceType(
			UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitFormalParameter(FormalParameterContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitEnhancedForStatement(EnhancedForStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitReturnStatement(ReturnStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPreIncrementExpression(PreIncrementExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitConstantModifier(ConstantModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAssertStatement(AssertStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMethodDeclarator(MethodDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitForStatementNoShortIf(ForStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitClassBody(ClassBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSuperinterfaces(SuperinterfacesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitExceptionType(ExceptionTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitCatchType(CatchTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPrimaryNoNewArray_lf_arrayAccess(
			PrimaryNoNewArray_lf_arrayAccessContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTypeArguments(TypeArgumentsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSingleStaticImportDeclaration(
			SingleStaticImportDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPostfixExpression(PostfixExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitEmptyStatement(EmptyStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSwitchLabels(SwitchLabelsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitClassType_lf_classOrInterfaceType(
			ClassType_lf_classOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpDataClauseArgumentList(
			OmpDataClauseArgumentListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitLastFormalParameter(LastFormalParameterContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitLocalVariableDeclaration(
			LocalVariableDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpDataClause(OmpDataClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitResult(ResultContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitCompilationUnit(CompilationUnitContext ctx) {
		CompilationUnit cu = null;
		PackageDeclaration pakage = null;
		List<ImportDeclaration> imports = null;
		List<TypeDeclaration> types = null;
		
		NodeLocationer nl = new NodeLocationer(ctx);
		
		if (null != ctx.packageDeclaration()) {
			pakage = (PackageDeclaration)ctx.packageDeclaration().accept(this);
		}

		if (null != ctx.importDeclaration()) {
			imports = new ArrayList<ImportDeclaration>();
			List<ImportDeclarationContext> imptCtxs= ctx.importDeclaration();
			for (ImportDeclarationContext imptCtx: imptCtxs) {
				imports.add((ImportDeclaration)imptCtx.accept(this));
			}
		}

		if (null != ctx.typeDeclaration()) {
			types = new ArrayList<TypeDeclaration>();
			List<TypeDeclarationContext> typeCtxs= ctx.typeDeclaration();
			for (TypeDeclarationContext typeCtx: typeCtxs) {
				imports.add((ImportDeclaration)typeCtx.accept(this));
			}
		}
		
		cu = new CompilationUnit(nl.startLine, nl.startColumn, nl.endLine, nl.endColumn, pakage, imports, types, null);
		return (Node)cu;
	}

	@Override
	public Node visitTypeParameterList(TypeParameterListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnaryExpressionNotPlusMinus(
			UnaryExpressionNotPlusMinusContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSingleTypeImportDeclaration(
			SingleTypeImportDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAnnotationTypeElementDeclaration(
			AnnotationTypeElementDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAnnotationTypeBody(AnnotationTypeBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOpenmpStatement(OpenmpStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitLabeledStatement(LabeledStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTryStatement(TryStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInterfaceType_lf_classOrInterfaceType(
			InterfaceType_lf_classOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitNormalAnnotation(NormalAnnotationContext ctx) {
		NormalAnnotation normalAnnotation = null;
	    TypeName typeName = null;
		List<ElementValuePair> pairs = null;
		
		NodeLocationer nl = new NodeLocationer(ctx);
		
		if (null != ctx.typeName()) {
			typeName = (TypeName)ctx.typeName().accept(this);
		}

		if (null != ctx.importDeclaration()) {
			imports = new ArrayList<ImportDeclaration>();
			List<ImportDeclarationContext> imptCtxs= ctx.importDeclaration();
			for (ImportDeclarationContext imptCtx: imptCtxs) {
				imports.add((ImportDeclaration)imptCtx.accept(this));
			}
		}
		
		normalAnnotation = new NormalAnnotation(nl.startLine, nl.startColumn, nl.endLine, nl.endColumn, typeName, pairs);
		
		return (Node)normalAnnotation;
	}

	@Override
	public Node visitRelationalExpression(RelationalExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitWhileStatementNoShortIf(WhileStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitReceiverParameter(ReceiverParameterContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(
			PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitElementValuePairList(ElementValuePairListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMethodDeclaration(MethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInterfaceType_lfno_classOrInterfaceType(
			InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitResourceSpecification(ResourceSpecificationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpMasterConstruct(OmpMasterConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitLeftHandSide(LeftHandSideContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPrimaryNoNewArray_lfno_arrayAccess(
			PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpReductionDataClause(OmpReductionDataClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitLabeledStatementNoShortIf(
			LabeledStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpGuiConstruct(OmpGuiConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitDims(DimsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitVariableDeclaratorList(VariableDeclaratorListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitClassType(ClassTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitArgumentList(ArgumentListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitContinueStatement(ContinueStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitEnumConstantList(EnumConstantListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMethodHeader(MethodHeaderContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitIfThenElseStatementNoShortIf(
			IfThenElseStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitArrayInitializer(ArrayInitializerContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitExtendsInterfaces(ExtendsInterfacesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitWhileStatement(WhileStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitConstructorModifier(ConstructorModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnannInterfaceType_lfno_unannClassOrInterfaceType(
			UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPrimitiveType(PrimitiveTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnannClassOrInterfaceType(
			UnannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpBarrierDirective(OmpBarrierDirectiveContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitFinally_(Finally_Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitDimExpr(DimExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpSharedDataClause(OmpSharedDataClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitArrayType(ArrayTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPackageName(PackageNameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitExpressionStatement(ExpressionStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpPrivateClause(OmpPrivateClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpSectionConstruct(OmpSectionConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitForUpdate(ForUpdateContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitIntegralType(IntegralTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(
			PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAnnotation(AnnotationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitEnumConstant(EnumConstantContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitClassInstanceCreationExpression_lfno_primary(
			ClassInstanceCreationExpression_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitConstantDeclaration(ConstantDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpAtomicConstruct(OmpAtomicConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAnnotationTypeMemberDeclaration(
			AnnotationTypeMemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnannReferenceType(UnannReferenceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitImportDeclaration(ImportDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInstanceInitializer(InstanceInitializerContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitBasicForStatementNoShortIf(
			BasicForStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAnnotationTypeElementModifier(
			AnnotationTypeElementModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSwitchBlock(SwitchBlockContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpDataClauseReductionArgumentList(
			OmpDataClauseReductionArgumentListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpSectionsConstruct(OmpSectionsConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitEnumDeclaration(EnumDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitBreakStatement(BreakStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpScheduleClause(OmpScheduleClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTypeParameter(TypeParameterContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitArrayAccess_lf_primary(ArrayAccess_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitEnumBodyDeclarations(EnumBodyDeclarationsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitForStatement(ForStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitStatementExpression(StatementExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMethodInvocation_lfno_primary(
			MethodInvocation_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpFreeguiConstruct(OmpFreeguiConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitConditionalExpression(ConditionalExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(
			PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitElementValueList(ElementValueListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(
			PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitLocalVariableDeclarationStatement(
			LocalVariableDeclarationStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitArrayCreationExpression(ArrayCreationExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSynchronizedStatement(SynchronizedStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSwitchLabel(SwitchLabelContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitBasicForStatement(BasicForStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnannType(UnannTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTypeParameterModifier(TypeParameterModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTypeParameters(TypeParametersContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpIfClause(OmpIfClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitArrayAccess_lfno_primary(
			ArrayAccess_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMethodInvocation(MethodInvocationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpParallelConstruct(OmpParallelConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInclusiveOrExpression(InclusiveOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnannClassType_lfno_unannClassOrInterfaceType(
			UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTypeName(TypeNameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitEqualityExpression(EqualityExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitConstructorBody(ConstructorBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpCopyprivateDataClause(
			OmpCopyprivateDataClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitClassInstanceCreationExpression_lf_primary(
			ClassInstanceCreationExpression_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInferredFormalParameterList(
			InferredFormalParameterListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitForInit(ForInitContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitLambdaExpression(LambdaExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitNumericType(NumericTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMethodReference(MethodReferenceContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnaryExpression(UnaryExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMethodReference_lf_primary(
			MethodReference_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPrimaryNoNewArray_lf_primary(
			PrimaryNoNewArray_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMethodReference_lfno_primary(
			MethodReference_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitType(TypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitFieldAccess_lf_primary(FieldAccess_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitElementValueArrayInitializer(
			ElementValueArrayInitializerContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpParallelForConstruct(OmpParallelForConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitFieldAccess_lfno_primary(
			FieldAccess_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAmbiguousName(AmbiguousNameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPrimary(PrimaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitShiftExpression(ShiftExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitDefaultValue(DefaultValueContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitVariableModifier(VariableModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInterfaceModifier(InterfaceModifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpCriticalConstruct(OmpCriticalConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPackageDeclaration(PackageDeclarationContext ctx) {
		PackageDeclaration packageDeclaration = null;
		List<PackageModifier> modifiers = null;
		List<Identifier> identifiers = null;
		
		NodeLocationer nl = new NodeLocationer(ctx);
		
		if (null != ctx.packageModifier()) {
			modifiers = new ArrayList<PackageModifier>();
			List<PackageModifierContext> pgmfCtxs= ctx.packageModifier();
			for (PackageModifierContext pgmfCtx: pgmfCtxs) {
				modifiers.add((PackageModifier)pgmfCtx.accept(this));
			}
		}
		
		if (null != ctx.Identifier()) {
			identifiers = new ArrayList<Identifier>();
			List<TerminalNode> idCtxs= ctx.Identifier();
			for (TerminalNode idCtx: idCtxs) {
				identifiers.add((Identifier)idCtx.accept(this));
			}
		}
		packageDeclaration = new PackageDeclaration(nl.startLine, nl.startColumn, nl.endLine, nl.endColumn, modifiers, identifiers);
		return (Node)packageDeclaration;
	}

	@Override
	public Node visitTypeImportOnDemandDeclaration(
			TypeImportOnDemandDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitConditionalAndExpression(
			ConditionalAndExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAdditiveExpression(AdditiveExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitCatchFormalParameter(CatchFormalParameterContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitArrayAccess(ArrayAccessContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpLastprivateDataClause(
			OmpLastprivateDataClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPostDecrementExpression(PostDecrementExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnannInterfaceType(UnannInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInterfaceBody(InterfaceBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnannArrayType(UnannArrayTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPackageOrTypeName(PackageOrTypeNameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMethodInvocation_lf_primary(
			MethodInvocation_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpDefaultDataClause(OmpDefaultDataClauseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMultiplicativeExpression(
			MultiplicativeExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAssignmentOperator(AssignmentOperatorContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitElementValue(ElementValueContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitBlockStatement(BlockStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitTypeVariable(TypeVariableContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitBlockStatements(BlockStatementsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitAdditionalBound(AdditionalBoundContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitReferenceType(ReferenceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitIfThenElseStatement(IfThenElseStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitResourceList(ResourceListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitConditionalOrExpression(ConditionalOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitStaticImportOnDemandDeclaration(
			StaticImportOnDemandDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitVariableInitializerList(VariableInitializerListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitDoStatement(DoStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitIfThenStatement(IfThenStatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitConstructorDeclaration(ConstructorDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitFloatingPointType(FloatingPointTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitWildcard(WildcardContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnannClassType_lf_unannClassOrInterfaceType(
			UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitResource(ResourceContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitElementValuePair(ElementValuePairContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitPostIncrementExpression_lf_postfixExpression(
			PostIncrementExpression_lf_postfixExpressionContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitUnannPrimitiveType(UnannPrimitiveTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitMethodBody(MethodBodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitClassType_lfno_classOrInterfaceType(
			ClassType_lfno_classOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitOmpSingleConstruct(OmpSingleConstructContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitStaticInitializer(StaticInitializerContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitExceptionTypeList(ExceptionTypeListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitStatementExpressionList(StatementExpressionListContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitLiteral(LiteralContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitInterfaceMemberDeclaration(
			InterfaceMemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node visitSwitchBlockStatementGroup(
			SwitchBlockStatementGroupContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
	
}