// Generated from Java8.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, OPENMP_PRAGMA=51, PARALLEL=52, PARALLEL_FOR=53, PARALLEL_SECTIONS=54, 
		FIRST_PRIVATE=55, LAST_PRIVATE=56, SHARED=57, NONE=58, REDUCTION=59, FREEGUI=60, 
		GUI=61, SCHEDULE=62, DYNAMIC=63, GUIDED=64, ORDERED=65, SECTIONS=66, SECTION=67, 
		SINGLE=68, MASTER=69, CRITICAL=70, ATOMIC=71, FLUSH=72, BARRIER=73, NOWAIT=74, 
		NUMTHREADS=75, CPOYPRIVATE=76, IntegerLiteral=77, FloatingPointLiteral=78, 
		BooleanLiteral=79, CharacterLiteral=80, StringLiteral=81, NullLiteral=82, 
		LPAREN=83, RPAREN=84, LBRACE=85, RBRACE=86, LBRACK=87, RBRACK=88, SEMI=89, 
		COMMA=90, DOT=91, ASSIGN=92, GT=93, LT=94, BANG=95, TILDE=96, QUESTION=97, 
		COLON=98, EQUAL=99, LE=100, GE=101, NOTEQUAL=102, AND=103, OR=104, INC=105, 
		DEC=106, ADD=107, SUB=108, MUL=109, DIV=110, BITAND=111, BITOR=112, CARET=113, 
		MOD=114, ARROW=115, COLONCOLON=116, ADD_ASSIGN=117, SUB_ASSIGN=118, MUL_ASSIGN=119, 
		DIV_ASSIGN=120, AND_ASSIGN=121, OR_ASSIGN=122, XOR_ASSIGN=123, MOD_ASSIGN=124, 
		LSHIFT_ASSIGN=125, RSHIFT_ASSIGN=126, URSHIFT_ASSIGN=127, Identifier=128, 
		AT=129, ELLIPSIS=130, WS=131, COMMENT=132, LINE_COMMENT=133, DD=134;
	public static final String[] tokenNames = {
		"<INVALID>", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'//#omp'", 
		"'parallel'", "'parallel for'", "'parallel sections'", "'firstprivate'", 
		"'lastprivate'", "'shared'", "'none'", "'reduction'", "'freeguithread'", 
		"'gui'", "'schedule'", "'dynamic'", "'guided'", "'ordered'", "'sections'", 
		"'section'", "'single'", "'master'", "'critical'", "'atomic'", "'flush'", 
		"'barrier'", "'nowait'", "'num_threads'", "'copyprivate'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", 
		"'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", 
		"'...'", "WS", "COMMENT", "LINE_COMMENT", "DD"
	};
	public static final int
		RULE_literal = 0, RULE_type = 1, RULE_primitiveType = 2, RULE_numericType = 3, 
		RULE_integralType = 4, RULE_floatingPointType = 5, RULE_referenceType = 6, 
		RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lf_classOrInterfaceType = 9, 
		RULE_classType_lfno_classOrInterfaceType = 10, RULE_interfaceType = 11, 
		RULE_interfaceType_lf_classOrInterfaceType = 12, RULE_interfaceType_lfno_classOrInterfaceType = 13, 
		RULE_typeVariable = 14, RULE_arrayType = 15, RULE_dims = 16, RULE_typeParameter = 17, 
		RULE_typeParameterModifier = 18, RULE_typeBound = 19, RULE_additionalBound = 20, 
		RULE_typeArguments = 21, RULE_typeArgumentList = 22, RULE_typeArgument = 23, 
		RULE_wildcard = 24, RULE_wildcardBounds = 25, RULE_packageName = 26, RULE_typeName = 27, 
		RULE_packageOrTypeName = 28, RULE_expressionName = 29, RULE_methodName = 30, 
		RULE_ambiguousName = 31, RULE_compilationUnit = 32, RULE_packageDeclaration = 33, 
		RULE_packageModifier = 34, RULE_importDeclaration = 35, RULE_singleTypeImportDeclaration = 36, 
		RULE_typeImportOnDemandDeclaration = 37, RULE_singleStaticImportDeclaration = 38, 
		RULE_staticImportOnDemandDeclaration = 39, RULE_typeDeclaration = 40, 
		RULE_classDeclaration = 41, RULE_normalClassDeclaration = 42, RULE_classModifier = 43, 
		RULE_typeParameters = 44, RULE_typeParameterList = 45, RULE_superclass = 46, 
		RULE_superinterfaces = 47, RULE_interfaceTypeList = 48, RULE_classBody = 49, 
		RULE_classBodyDeclaration = 50, RULE_classMemberDeclaration = 51, RULE_fieldDeclaration = 52, 
		RULE_fieldModifier = 53, RULE_variableDeclaratorList = 54, RULE_variableDeclarator = 55, 
		RULE_variableDeclaratorId = 56, RULE_variableInitializer = 57, RULE_unannType = 58, 
		RULE_unannPrimitiveType = 59, RULE_unannReferenceType = 60, RULE_unannClassOrInterfaceType = 61, 
		RULE_unannClassType = 62, RULE_unannClassType_lf_unannClassOrInterfaceType = 63, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 64, RULE_unannInterfaceType = 65, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 66, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 67, 
		RULE_unannTypeVariable = 68, RULE_unannArrayType = 69, RULE_methodDeclaration = 70, 
		RULE_methodModifier = 71, RULE_methodHeader = 72, RULE_result = 73, RULE_methodDeclarator = 74, 
		RULE_formalParameterList = 75, RULE_formalParameters = 76, RULE_formalParameter = 77, 
		RULE_variableModifier = 78, RULE_lastFormalParameter = 79, RULE_receiverParameter = 80, 
		RULE_throws_ = 81, RULE_exceptionTypeList = 82, RULE_exceptionType = 83, 
		RULE_methodBody = 84, RULE_instanceInitializer = 85, RULE_staticInitializer = 86, 
		RULE_constructorDeclaration = 87, RULE_constructorModifier = 88, RULE_constructorDeclarator = 89, 
		RULE_simpleTypeName = 90, RULE_constructorBody = 91, RULE_explicitConstructorInvocation = 92, 
		RULE_enumDeclaration = 93, RULE_enumBody = 94, RULE_enumConstantList = 95, 
		RULE_enumConstant = 96, RULE_enumConstantModifier = 97, RULE_enumBodyDeclarations = 98, 
		RULE_interfaceDeclaration = 99, RULE_normalInterfaceDeclaration = 100, 
		RULE_interfaceModifier = 101, RULE_extendsInterfaces = 102, RULE_interfaceBody = 103, 
		RULE_interfaceMemberDeclaration = 104, RULE_constantDeclaration = 105, 
		RULE_constantModifier = 106, RULE_interfaceMethodDeclaration = 107, RULE_interfaceMethodModifier = 108, 
		RULE_annotationTypeDeclaration = 109, RULE_annotationTypeBody = 110, RULE_annotationTypeMemberDeclaration = 111, 
		RULE_annotationTypeElementDeclaration = 112, RULE_annotationTypeElementModifier = 113, 
		RULE_defaultValue = 114, RULE_annotation = 115, RULE_normalAnnotation = 116, 
		RULE_elementValuePairList = 117, RULE_elementValuePair = 118, RULE_elementValue = 119, 
		RULE_elementValueArrayInitializer = 120, RULE_elementValueList = 121, 
		RULE_markerAnnotation = 122, RULE_singleElementAnnotation = 123, RULE_arrayInitializer = 124, 
		RULE_variableInitializerList = 125, RULE_block = 126, RULE_blockStatements = 127, 
		RULE_blockStatement = 128, RULE_localVariableDeclarationStatement = 129, 
		RULE_localVariableDeclaration = 130, RULE_statement = 131, RULE_statementNoShortIf = 132, 
		RULE_statementWithoutTrailingSubstatement = 133, RULE_emptyStatement = 134, 
		RULE_labeledStatement = 135, RULE_labeledStatementNoShortIf = 136, RULE_expressionStatement = 137, 
		RULE_statementExpression = 138, RULE_ifThenStatement = 139, RULE_ifThenElseStatement = 140, 
		RULE_ifThenElseStatementNoShortIf = 141, RULE_assertStatement = 142, RULE_switchStatement = 143, 
		RULE_switchBlock = 144, RULE_switchBlockStatementGroup = 145, RULE_switchLabels = 146, 
		RULE_switchLabel = 147, RULE_enumConstantName = 148, RULE_whileStatement = 149, 
		RULE_whileStatementNoShortIf = 150, RULE_doStatement = 151, RULE_forStatement = 152, 
		RULE_forStatementNoShortIf = 153, RULE_basicForStatement = 154, RULE_basicForStatementNoShortIf = 155, 
		RULE_forInit = 156, RULE_forUpdate = 157, RULE_statementExpressionList = 158, 
		RULE_enhancedForStatement = 159, RULE_enhancedForStatementNoShortIf = 160, 
		RULE_breakStatement = 161, RULE_continueStatement = 162, RULE_returnStatement = 163, 
		RULE_throwStatement = 164, RULE_synchronizedStatement = 165, RULE_tryStatement = 166, 
		RULE_catches = 167, RULE_catchClause = 168, RULE_catchFormalParameter = 169, 
		RULE_catchType = 170, RULE_finally_ = 171, RULE_tryWithResourcesStatement = 172, 
		RULE_resourceSpecification = 173, RULE_resourceList = 174, RULE_resource = 175, 
		RULE_openmpStatement = 176, RULE_openmpDirective = 177, RULE_ompParallelDirective = 178, 
		RULE_ompParallelForDirective = 179, RULE_ompParallelSectionsDirective = 180, 
		RULE_ompForDirective = 181, RULE_ompSectionsDirective = 182, RULE_ompFreeguiDirective = 183, 
		RULE_ompSectionDirective = 184, RULE_ompGuiDirective = 185, RULE_ompSingleDirective = 186, 
		RULE_ompMasterDirective = 187, RULE_ompCriticalDirective = 188, RULE_ompAtomicDirective = 189, 
		RULE_ompBarrierDirective = 190, RULE_ompFlushDirective = 191, RULE_ompOrderedDirective = 192, 
		RULE_ompDataClause = 193, RULE_primary = 194, RULE_primaryNoNewArray = 195, 
		RULE_primaryNoNewArray_lf_arrayAccess = 196, RULE_primaryNoNewArray_lfno_arrayAccess = 197, 
		RULE_primaryNoNewArray_lf_primary = 198, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 199, 
		RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 200, RULE_primaryNoNewArray_lfno_primary = 201, 
		RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 202, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 203, 
		RULE_classInstanceCreationExpression = 204, RULE_classInstanceCreationExpression_lf_primary = 205, 
		RULE_classInstanceCreationExpression_lfno_primary = 206, RULE_typeArgumentsOrDiamond = 207, 
		RULE_fieldAccess = 208, RULE_fieldAccess_lf_primary = 209, RULE_fieldAccess_lfno_primary = 210, 
		RULE_arrayAccess = 211, RULE_arrayAccess_lf_primary = 212, RULE_arrayAccess_lfno_primary = 213, 
		RULE_methodInvocation = 214, RULE_methodInvocation_lf_primary = 215, RULE_methodInvocation_lfno_primary = 216, 
		RULE_argumentList = 217, RULE_methodReference = 218, RULE_methodReference_lf_primary = 219, 
		RULE_methodReference_lfno_primary = 220, RULE_arrayCreationExpression = 221, 
		RULE_dimExprs = 222, RULE_dimExpr = 223, RULE_constantExpression = 224, 
		RULE_expression = 225, RULE_lambdaExpression = 226, RULE_lambdaParameters = 227, 
		RULE_inferredFormalParameterList = 228, RULE_lambdaBody = 229, RULE_assignmentExpression = 230, 
		RULE_assignment = 231, RULE_leftHandSide = 232, RULE_assignmentOperator = 233, 
		RULE_conditionalExpression = 234, RULE_conditionalOrExpression = 235, 
		RULE_conditionalAndExpression = 236, RULE_inclusiveOrExpression = 237, 
		RULE_exclusiveOrExpression = 238, RULE_andExpression = 239, RULE_equalityExpression = 240, 
		RULE_relationalExpression = 241, RULE_shiftExpression = 242, RULE_additiveExpression = 243, 
		RULE_multiplicativeExpression = 244, RULE_unaryExpression = 245, RULE_preIncrementExpression = 246, 
		RULE_preDecrementExpression = 247, RULE_unaryExpressionNotPlusMinus = 248, 
		RULE_postfixExpression = 249, RULE_postIncrementExpression = 250, RULE_postIncrementExpression_lf_postfixExpression = 251, 
		RULE_postDecrementExpression = 252, RULE_postDecrementExpression_lf_postfixExpression = 253, 
		RULE_castExpression = 254;
	public static final String[] ruleNames = {
		"literal", "type", "primitiveType", "numericType", "integralType", "floatingPointType", 
		"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
		"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
		"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
		"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
		"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
		"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", 
		"ambiguousName", "compilationUnit", "packageDeclaration", "packageModifier", 
		"importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration", 
		"singleStaticImportDeclaration", "staticImportOnDemandDeclaration", "typeDeclaration", 
		"classDeclaration", "normalClassDeclaration", "classModifier", "typeParameters", 
		"typeParameterList", "superclass", "superinterfaces", "interfaceTypeList", 
		"classBody", "classBodyDeclaration", "classMemberDeclaration", "fieldDeclaration", 
		"fieldModifier", "variableDeclaratorList", "variableDeclarator", "variableDeclaratorId", 
		"variableInitializer", "unannType", "unannPrimitiveType", "unannReferenceType", 
		"unannClassOrInterfaceType", "unannClassType", "unannClassType_lf_unannClassOrInterfaceType", 
		"unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType", 
		"unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", 
		"unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier", 
		"methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters", 
		"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
		"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
		"staticInitializer", "constructorDeclaration", "constructorModifier", 
		"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
		"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
		"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
		"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
		"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
		"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
		"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
		"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
		"variableInitializerList", "block", "blockStatements", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
		"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "enumConstantName", "whileStatement", "whileStatementNoShortIf", 
		"doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement", 
		"basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", 
		"enhancedForStatement", "enhancedForStatementNoShortIf", "breakStatement", 
		"continueStatement", "returnStatement", "throwStatement", "synchronizedStatement", 
		"tryStatement", "catches", "catchClause", "catchFormalParameter", "catchType", 
		"finally_", "tryWithResourcesStatement", "resourceSpecification", "resourceList", 
		"resource", "openmpStatement", "openmpDirective", "ompParallelDirective", 
		"ompParallelForDirective", "ompParallelSectionsDirective", "ompForDirective", 
		"ompSectionsDirective", "ompFreeguiDirective", "ompSectionDirective", 
		"ompGuiDirective", "ompSingleDirective", "ompMasterDirective", "ompCriticalDirective", 
		"ompAtomicDirective", "ompBarrierDirective", "ompFlushDirective", "ompOrderedDirective", 
		"ompDataClause", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
		"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
		"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
		"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
		"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
		"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
		"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
		"methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList", 
		"methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
		"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
		"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
		"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
		"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
		"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
		"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
		"postDecrementExpression_lf_postfixExpression", "castExpression"
	};

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(514);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512); primitiveType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513); referenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			setState(530);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(516); annotation();
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(522); numericType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(523); annotation();
					}
					}
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(529); match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(534);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(532); integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(533); floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIntegralType(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFloatingPointType(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(543);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540); classOrInterfaceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541); typeVariable();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542); arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(545); classType_lfno_classOrInterfaceType();
				}
				break;

			case 2:
				{
				setState(546); interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(551);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(549); classType_lf_classOrInterfaceType();
						}
						break;

					case 2:
						{
						setState(550); interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(578);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(556); annotation();
					}
					}
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(562); match(Identifier);
				setState(564);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(563); typeArguments();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566); classOrInterfaceType();
				setState(567); match(DOT);
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(568); annotation();
					}
					}
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(574); match(Identifier);
				setState(576);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(575); typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580); match(DOT);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(581); annotation();
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587); match(Identifier);
			setState(589);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(588); typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(591); annotation();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597); match(Identifier);
			setState(599);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(598); typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603); classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeVariable(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(607); annotation();
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			setState(624);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615); primitiveType();
				setState(616); dims();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618); classOrInterfaceType();
				setState(619); dims();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(621); typeVariable();
				setState(622); dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(626); annotation();
				}
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(632); match(LBRACK);
			setState(633); match(RBRACK);
			setState(644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(634); annotation();
						}
						}
						setState(639);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(640); match(LBRACK);
					setState(641); match(RBRACK);
					}
					} 
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(647); typeParameterModifier();
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(653); match(Identifier);
			setState(655);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(654); typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657); annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			setState(669);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659); match(EXTENDS);
				setState(660); typeVariable();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661); match(EXTENDS);
				setState(662); classOrInterfaceType();
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(663); additionalBound();
					}
					}
					setState(668);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditionalBound(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671); match(BITAND);
			setState(672); interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674); match(LT);
			setState(675); typeArgumentList();
			setState(676); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); typeArgument();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(679); match(COMMA);
				setState(680); typeArgument();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgument);
		try {
			setState(688);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686); referenceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687); wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(690); annotation();
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696); match(QUESTION);
			setState(698);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(697); wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcardBounds(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wildcardBounds);
		try {
			setState(704);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(700); match(EXTENDS);
				setState(701); referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(702); match(SUPER);
				setState(703); referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(707); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(709);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(710); match(DOT);
					setState(711); match(Identifier);
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(722);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718); packageOrTypeName(0);
				setState(719); match(DOT);
				setState(720); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(725); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(727);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(728); match(DOT);
					setState(729); match(Identifier);
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionName(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(740);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736); ambiguousName(0);
				setState(737); match(DOT);
				setState(738); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAmbiguousName(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(745); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(752);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(747);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(748); match(DOT);
					setState(749); match(Identifier);
					}
					} 
				}
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(Java8Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(755); packageDeclaration();
				}
				break;
			}
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(758); importDeclaration();
				}
				}
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(764); typeDeclaration();
				}
				}
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(770); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(772); packageModifier();
				}
				}
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(778); match(PACKAGE);
			setState(779); match(Identifier);
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(780); match(DOT);
				setState(781); match(Identifier);
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(787); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageModifier(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789); annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_importDeclaration);
		try {
			setState(795);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791); singleTypeImportDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(792); typeImportOnDemandDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(793); singleStaticImportDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(794); staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleTypeImportDeclaration(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797); match(IMPORT);
			setState(798); typeName();
			setState(799); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeImportOnDemandDeclaration(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801); match(IMPORT);
			setState(802); packageOrTypeName(0);
			setState(803); match(DOT);
			setState(804); match(MUL);
			setState(805); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleStaticImportDeclaration(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807); match(IMPORT);
			setState(808); match(STATIC);
			setState(809); typeName();
			setState(810); match(DOT);
			setState(811); match(Identifier);
			setState(812); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticImportOnDemandDeclaration(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814); match(IMPORT);
			setState(815); match(STATIC);
			setState(816); typeName();
			setState(817); match(DOT);
			setState(818); match(MUL);
			setState(819); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeDeclaration);
		try {
			setState(824);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821); classDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822); interfaceDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(823); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classDeclaration);
		try {
			setState(828);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826); normalClassDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(830); classModifier();
				}
				}
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(836); match(CLASS);
			setState(837); match(Identifier);
			setState(839);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(838); typeParameters();
				}
			}

			setState(842);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(841); superclass();
				}
			}

			setState(845);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(844); superinterfaces();
				}
			}

			setState(847); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classModifier);
		try {
			setState(857);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(849); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(850); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(851); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(852); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(853); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(854); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(855); match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(856); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859); match(LT);
			setState(860); typeParameterList();
			setState(861); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863); typeParameter();
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(864); match(COMMA);
				setState(865); typeParameter();
				}
				}
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperclass(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871); match(EXTENDS);
			setState(872); classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperinterfaces(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874); match(IMPLEMENTS);
			setState(875); interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceTypeList(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877); interfaceType();
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(878); match(COMMA);
				setState(879); interfaceType();
				}
				}
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885); match(LBRACE);
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LBRACE - 85)) | (1L << (SEMI - 85)) | (1L << (LT - 85)) | (1L << (Identifier - 85)) | (1L << (AT - 85)))) != 0)) {
				{
				{
				setState(886); classBodyDeclaration();
				}
				}
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(892); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classBodyDeclaration);
		try {
			setState(898);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(894); classMemberDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(895); instanceInitializer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(896); staticInitializer();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(897); constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classMemberDeclaration);
		try {
			setState(905);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(900); fieldDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901); methodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(902); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(903); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(904); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(907); fieldModifier();
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(913); unannType();
			setState(914); variableDeclaratorList();
			setState(915); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldModifier);
		try {
			setState(925);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(917); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(918); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(919); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(920); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(921); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(922); match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(923); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(924); match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927); variableDeclarator();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(928); match(COMMA);
				setState(929); variableDeclarator();
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935); variableDeclaratorId();
			setState(938);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(936); match(ASSIGN);
				setState(937); variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940); match(Identifier);
			setState(942);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(941); dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableInitializer);
		try {
			setState(946);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(944); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(945); arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannType(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannType);
		try {
			setState(950);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948); unannPrimitiveType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(949); unannReferenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannPrimitiveType(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannPrimitiveType);
		try {
			setState(954);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(952); numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(953); match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannReferenceType(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannReferenceType);
		try {
			setState(959);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(956); unannClassOrInterfaceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(957); unannTypeVariable();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(958); unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassOrInterfaceType(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(961); unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;

			case 2:
				{
				setState(962); unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(967);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(965); unannClassType_lf_unannClassOrInterfaceType();
						}
						break;

					case 2:
						{
						setState(966); unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannClassType);
		int _la;
		try {
			setState(988);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(972); match(Identifier);
				setState(974);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(973); typeArguments();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(976); unannClassOrInterfaceType();
				setState(977); match(DOT);
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(978); annotation();
					}
					}
					setState(983);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(984); match(Identifier);
				setState(986);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(985); typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990); match(DOT);
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(991); annotation();
				}
				}
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(997); match(Identifier);
			setState(999);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(998); typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001); match(Identifier);
			setState(1003);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1002); typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005); unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007); unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009); unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannTypeVariable(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannArrayType(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannArrayType);
		try {
			setState(1022);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013); unannPrimitiveType();
				setState(1014); dims();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016); unannClassOrInterfaceType();
				setState(1017); dims();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1019); unannTypeVariable();
				setState(1020); dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(1024); methodModifier();
				}
				}
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1030); methodHeader();
			setState(1031); methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodModifier);
		try {
			setState(1043);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1035); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1036); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1037); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1038); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1039); match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1040); match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1041); match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1042); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodHeader);
		int _la;
		try {
			setState(1062);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045); result();
				setState(1046); methodDeclarator();
				setState(1048);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1047); throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050); typeParameters();
				setState(1054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1051); annotation();
					}
					}
					setState(1056);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1057); result();
				setState(1058); methodDeclarator();
				setState(1060);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1059); throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_result);
		try {
			setState(1066);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064); unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068); match(Identifier);
			setState(1069); match(LPAREN);
			setState(1071);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1070); formalParameterList();
				}
			}

			setState(1073); match(RPAREN);
			setState(1075);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1074); dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameterList);
		try {
			setState(1082);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1077); formalParameters();
				setState(1078); match(COMMA);
				setState(1079); lastFormalParameter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081); lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameters);
		try {
			int _alt;
			setState(1100);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084); formalParameter();
				setState(1089);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1085); match(COMMA);
						setState(1086); formalParameter();
						}
						} 
					}
					setState(1091);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092); receiverParameter();
				setState(1097);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1093); match(COMMA);
						setState(1094); formalParameter();
						}
						} 
					}
					setState(1099);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1102); variableModifier();
				}
				}
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1108); unannType();
			setState(1109); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableModifier);
		try {
			setState(1113);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111); annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112); match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1132);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1115); variableModifier();
					}
					}
					setState(1120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1121); unannType();
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1122); annotation();
					}
					}
					setState(1127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1128); match(ELLIPSIS);
				setState(1129); variableDeclaratorId();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131); formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1134); annotation();
				}
				}
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1140); unannType();
			setState(1143);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1141); match(Identifier);
				setState(1142); match(DOT);
				}
			}

			setState(1145); match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrows_(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147); match(THROWS);
			setState(1148); exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionTypeList(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150); exceptionType();
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1151); match(COMMA);
				setState(1152); exceptionType();
				}
				}
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionType(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exceptionType);
		try {
			setState(1160);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1158); classType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1159); typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodBody);
		try {
			setState(1164);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1162); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1163); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInstanceInitializer(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168); match(STATIC);
			setState(1169); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1171); constructorModifier();
				}
				}
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1177); constructorDeclarator();
			setState(1179);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1178); throws_();
				}
			}

			setState(1181); constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorModifier);
		try {
			setState(1187);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1185); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1186); match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclarator(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1189); typeParameters();
				}
			}

			setState(1192); simpleTypeName();
			setState(1193); match(LPAREN);
			setState(1195);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1194); formalParameterList();
				}
			}

			setState(1197); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201); match(LBRACE);
			setState(1203);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1202); explicitConstructorInvocation();
				}
				break;
			}
			setState(1206);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OPENMP_PRAGMA))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (LBRACE - 77)) | (1L << (SEMI - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(1205); blockStatements();
				}
			}

			setState(1208); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1256);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1211);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1210); typeArguments();
					}
				}

				setState(1213); match(THIS);
				setState(1214); match(LPAREN);
				setState(1216);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(1215); argumentList();
					}
				}

				setState(1218); match(RPAREN);
				setState(1219); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1220); typeArguments();
					}
				}

				setState(1223); match(SUPER);
				setState(1224); match(LPAREN);
				setState(1226);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(1225); argumentList();
					}
				}

				setState(1228); match(RPAREN);
				setState(1229); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1230); expressionName();
				setState(1231); match(DOT);
				setState(1233);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1232); typeArguments();
					}
				}

				setState(1235); match(SUPER);
				setState(1236); match(LPAREN);
				setState(1238);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(1237); argumentList();
					}
				}

				setState(1240); match(RPAREN);
				setState(1241); match(SEMI);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1243); primary();
				setState(1244); match(DOT);
				setState(1246);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1245); typeArguments();
					}
				}

				setState(1248); match(SUPER);
				setState(1249); match(LPAREN);
				setState(1251);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(1250); argumentList();
					}
				}

				setState(1253); match(RPAREN);
				setState(1254); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1258); classModifier();
				}
				}
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1264); match(ENUM);
			setState(1265); match(Identifier);
			setState(1267);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1266); superinterfaces();
				}
			}

			setState(1269); enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271); match(LBRACE);
			setState(1273);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1272); enumConstantList();
				}
			}

			setState(1276);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1275); match(COMMA);
				}
			}

			setState(1279);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1278); enumBodyDeclarations();
				}
			}

			setState(1281); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantList(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1283); enumConstant();
			setState(1288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1284); match(COMMA);
					setState(1285); enumConstant();
					}
					} 
				}
				setState(1290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1291); enumConstantModifier();
				}
				}
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1297); match(Identifier);
			setState(1303);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1298); match(LPAREN);
				setState(1300);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(1299); argumentList();
					}
				}

				setState(1302); match(RPAREN);
				}
			}

			setState(1306);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1305); classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantModifier(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308); annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310); match(SEMI);
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LBRACE - 85)) | (1L << (SEMI - 85)) | (1L << (LT - 85)) | (1L << (Identifier - 85)) | (1L << (AT - 85)))) != 0)) {
				{
				{
				setState(1311); classBodyDeclaration();
				}
				}
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interfaceDeclaration);
		try {
			setState(1319);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1317); normalInterfaceDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1318); annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1321); interfaceModifier();
				}
				}
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1327); match(INTERFACE);
			setState(1328); match(Identifier);
			setState(1330);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1329); typeParameters();
				}
			}

			setState(1333);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1332); extendsInterfaces();
				}
			}

			setState(1335); interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceModifier(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_interfaceModifier);
		try {
			setState(1344);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1339); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1340); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1341); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1342); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1343); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExtendsInterfaces(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346); match(EXTENDS);
			setState(1347); interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349); match(LBRACE);
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (SEMI - 89)) | (1L << (LT - 89)) | (1L << (Identifier - 89)) | (1L << (AT - 89)))) != 0)) {
				{
				{
				setState(1350); interfaceMemberDeclaration();
				}
				}
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1356); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceMemberDeclaration);
		try {
			setState(1363);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1358); constantDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359); interfaceMethodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1360); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1361); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1362); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1365); constantModifier();
				}
				}
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1371); unannType();
			setState(1372); variableDeclaratorList();
			setState(1373); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantModifier(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantModifier);
		try {
			setState(1379);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1375); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1376); match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1377); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1378); match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1381); interfaceMethodModifier();
				}
				}
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1387); methodHeader();
			setState(1388); methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodModifier);
		try {
			setState(1396);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1390); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1392); match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1393); match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1394); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1395); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1398); interfaceModifier();
					}
					} 
				}
				setState(1403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1404); match(AT);
			setState(1405); match(INTERFACE);
			setState(1406); match(Identifier);
			setState(1407); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409); match(LBRACE);
			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (SEMI - 89)) | (1L << (Identifier - 89)) | (1L << (AT - 89)))) != 0)) {
				{
				{
				setState(1410); annotationTypeMemberDeclaration();
				}
				}
				setState(1415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1416); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1423);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1418); annotationTypeElementDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1419); constantDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1420); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1421); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1422); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1425); annotationTypeElementModifier();
				}
				}
				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1431); unannType();
			setState(1432); match(Identifier);
			setState(1433); match(LPAREN);
			setState(1434); match(RPAREN);
			setState(1436);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1435); dims();
				}
			}

			setState(1439);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1438); defaultValue();
				}
			}

			setState(1441); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementModifier(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementModifier);
		try {
			setState(1446);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1443); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1444); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1445); match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448); match(DEFAULT);
			setState(1449); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotation);
		try {
			setState(1454);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1451); normalAnnotation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1452); markerAnnotation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1453); singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalAnnotation(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456); match(AT);
			setState(1457); typeName();
			setState(1458); match(LPAREN);
			setState(1460);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1459); elementValuePairList();
				}
			}

			setState(1462); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePairList(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464); elementValuePair();
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1465); match(COMMA);
				setState(1466); elementValuePair();
				}
				}
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472); match(Identifier);
			setState(1473); match(ASSIGN);
			setState(1474); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValue);
		try {
			setState(1479);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1476); conditionalExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1477); elementValueArrayInitializer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1478); annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481); match(LBRACE);
			setState(1483);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (LBRACE - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(1482); elementValueList();
				}
			}

			setState(1486);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1485); match(COMMA);
				}
			}

			setState(1488); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueList(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1490); elementValue();
			setState(1495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1491); match(COMMA);
					setState(1492); elementValue();
					}
					} 
				}
				setState(1497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMarkerAnnotation(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498); match(AT);
			setState(1499); typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleElementAnnotation(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501); match(AT);
			setState(1502); typeName();
			setState(1503); match(LPAREN);
			setState(1504); elementValue();
			setState(1505); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507); match(LBRACE);
			setState(1509);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (LBRACE - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(1508); variableInitializerList();
				}
			}

			setState(1512);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1511); match(COMMA);
				}
			}

			setState(1514); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializerList(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1516); variableInitializer();
			setState(1521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1517); match(COMMA);
					setState(1518); variableInitializer();
					}
					} 
				}
				setState(1523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524); match(LBRACE);
			setState(1526);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OPENMP_PRAGMA))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (LBRACE - 77)) | (1L << (SEMI - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(1525); blockStatements();
				}
			}

			setState(1528); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530); blockStatement();
			setState(1534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OPENMP_PRAGMA))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (LBRACE - 77)) | (1L << (SEMI - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				{
				setState(1531); blockStatement();
				}
				}
				setState(1536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_blockStatement);
		try {
			setState(1540);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1537); localVariableDeclarationStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1538); classDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1539); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542); localVariableDeclaration();
			setState(1543); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1545); variableModifier();
				}
				}
				setState(1550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1551); unannType();
			setState(1552); variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_statement);
		try {
			setState(1560);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1554); statementWithoutTrailingSubstatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1555); labeledStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1556); ifThenStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1557); ifThenElseStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1558); whileStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1559); forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementNoShortIf(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_statementNoShortIf);
		try {
			setState(1567);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1562); statementWithoutTrailingSubstatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563); labeledStatementNoShortIf();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1564); ifThenElseStatementNoShortIf();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1565); whileStatementNoShortIf();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1566); forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public OpenmpStatementContext openmpStatement() {
			return getRuleContext(OpenmpStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1582);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1569); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1570); emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1571); expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1572); assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1573); switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1574); doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1575); breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1576); continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1577); returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1578); synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1579); throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1580); tryStatement();
				}
				break;
			case OPENMP_PRAGMA:
				enterOuterAlt(_localctx, 13);
				{
				setState(1581); openmpStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586); match(Identifier);
			setState(1587); match(COLON);
			setState(1588); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatementNoShortIf(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590); match(Identifier);
			setState(1591); match(COLON);
			setState(1592); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594); statementExpression();
			setState(1595); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_statementExpression);
		try {
			setState(1604);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1597); assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1598); preIncrementExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1599); preDecrementExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1600); postIncrementExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1601); postDecrementExpression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1602); methodInvocation();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1603); classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenStatement(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606); match(IF);
			setState(1607); match(LPAREN);
			setState(1608); expression();
			setState(1609); match(RPAREN);
			setState(1610); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatement(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612); match(IF);
			setState(1613); match(LPAREN);
			setState(1614); expression();
			setState(1615); match(RPAREN);
			setState(1616); statementNoShortIf();
			setState(1617); match(ELSE);
			setState(1618); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatementNoShortIf(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620); match(IF);
			setState(1621); match(LPAREN);
			setState(1622); expression();
			setState(1623); match(RPAREN);
			setState(1624); statementNoShortIf();
			setState(1625); match(ELSE);
			setState(1626); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_assertStatement);
		try {
			setState(1638);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1628); match(ASSERT);
				setState(1629); expression();
				setState(1630); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1632); match(ASSERT);
				setState(1633); expression();
				setState(1634); match(COLON);
				setState(1635); expression();
				setState(1636); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640); match(SWITCH);
			setState(1641); match(LPAREN);
			setState(1642); expression();
			setState(1643); match(RPAREN);
			setState(1644); switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1646); match(LBRACE);
			setState(1650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1647); switchBlockStatementGroup();
					}
					} 
				}
				setState(1652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			setState(1656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1653); switchLabel();
				}
				}
				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1659); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661); switchLabels();
			setState(1662); blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664); switchLabel();
			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1665); switchLabel();
				}
				}
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabel);
		try {
			setState(1681);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1671); match(CASE);
				setState(1672); constantExpression();
				setState(1673); match(COLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1675); match(CASE);
				setState(1676); enumConstantName();
				setState(1677); match(COLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1679); match(DEFAULT);
				setState(1680); match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685); match(WHILE);
			setState(1686); match(LPAREN);
			setState(1687); expression();
			setState(1688); match(RPAREN);
			setState(1689); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatementNoShortIf(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691); match(WHILE);
			setState(1692); match(LPAREN);
			setState(1693); expression();
			setState(1694); match(RPAREN);
			setState(1695); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697); match(DO);
			setState(1698); statement();
			setState(1699); match(WHILE);
			setState(1700); match(LPAREN);
			setState(1701); expression();
			setState(1702); match(RPAREN);
			setState(1703); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_forStatement);
		try {
			setState(1707);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1705); basicForStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1706); enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatementNoShortIf(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_forStatementNoShortIf);
		try {
			setState(1711);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1709); basicForStatementNoShortIf();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1710); enhancedForStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatement(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713); match(FOR);
			setState(1714); match(LPAREN);
			setState(1716);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(1715); forInit();
				}
			}

			setState(1718); match(SEMI);
			setState(1720);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(1719); expression();
				}
			}

			setState(1722); match(SEMI);
			setState(1724);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(1723); forUpdate();
				}
			}

			setState(1726); match(RPAREN);
			setState(1727); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatementNoShortIf(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729); match(FOR);
			setState(1730); match(LPAREN);
			setState(1732);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(1731); forInit();
				}
			}

			setState(1734); match(SEMI);
			setState(1736);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(1735); expression();
				}
			}

			setState(1738); match(SEMI);
			setState(1740);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(1739); forUpdate();
				}
			}

			setState(1742); match(RPAREN);
			setState(1743); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_forInit);
		try {
			setState(1747);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1745); statementExpressionList();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1746); localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749); statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpressionList(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751); statementExpression();
			setState(1756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1752); match(COMMA);
				setState(1753); statementExpression();
				}
				}
				setState(1758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatement(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759); match(FOR);
			setState(1760); match(LPAREN);
			setState(1764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1761); variableModifier();
				}
				}
				setState(1766);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1767); unannType();
			setState(1768); variableDeclaratorId();
			setState(1769); match(COLON);
			setState(1770); expression();
			setState(1771); match(RPAREN);
			setState(1772); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatementNoShortIf(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774); match(FOR);
			setState(1775); match(LPAREN);
			setState(1779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1776); variableModifier();
				}
				}
				setState(1781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1782); unannType();
			setState(1783); variableDeclaratorId();
			setState(1784); match(COLON);
			setState(1785); expression();
			setState(1786); match(RPAREN);
			setState(1787); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789); match(BREAK);
			setState(1791);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1790); match(Identifier);
				}
			}

			setState(1793); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795); match(CONTINUE);
			setState(1797);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1796); match(Identifier);
				}
			}

			setState(1799); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801); match(RETURN);
			setState(1803);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(1802); expression();
				}
			}

			setState(1805); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807); match(THROW);
			setState(1808); expression();
			setState(1809); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811); match(SYNCHRONIZED);
			setState(1812); match(LPAREN);
			setState(1813); expression();
			setState(1814); match(RPAREN);
			setState(1815); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_tryStatement);
		int _la;
		try {
			setState(1829);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1817); match(TRY);
				setState(1818); block();
				setState(1819); catches();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1821); match(TRY);
				setState(1822); block();
				setState(1824);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1823); catches();
					}
				}

				setState(1826); finally_();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1828); tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831); catchClause();
			setState(1835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1832); catchClause();
				}
				}
				setState(1837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838); match(CATCH);
			setState(1839); match(LPAREN);
			setState(1840); catchFormalParameter();
			setState(1841); match(RPAREN);
			setState(1842); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1844); variableModifier();
				}
				}
				setState(1849);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1850); catchType();
			setState(1851); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853); unannClassType();
			setState(1858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1854); match(BITOR);
				setState(1855); classType();
				}
				}
				setState(1860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFinally_(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 342, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861); match(FINALLY);
			setState(1862); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryWithResourcesStatement(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864); match(TRY);
			setState(1865); resourceSpecification();
			setState(1866); block();
			setState(1868);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1867); catches();
				}
			}

			setState(1871);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1870); finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873); match(LPAREN);
			setState(1874); resourceList();
			setState(1876);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1875); match(SEMI);
				}
			}

			setState(1878); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceList(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1880); resource();
			setState(1885);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1881); match(SEMI);
					setState(1882); resource();
					}
					} 
				}
				setState(1887);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1888); variableModifier();
				}
				}
				setState(1893);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1894); unannType();
			setState(1895); variableDeclaratorId();
			setState(1896); match(ASSIGN);
			setState(1897); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenmpStatementContext extends ParserRuleContext {
		public OpenmpDirectiveContext openmpDirective() {
			return getRuleContext(OpenmpDirectiveContext.class,0);
		}
		public TerminalNode OPENMP_PRAGMA() { return getToken(Java8Parser.OPENMP_PRAGMA, 0); }
		public OpenmpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openmpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOpenmpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOpenmpStatement(this);
		}
	}

	public final OpenmpStatementContext openmpStatement() throws RecognitionException {
		OpenmpStatementContext _localctx = new OpenmpStatementContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_openmpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899); match(OPENMP_PRAGMA);
			setState(1900); openmpDirective();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenmpDirectiveContext extends ParserRuleContext {
		public OmpMasterDirectiveContext ompMasterDirective() {
			return getRuleContext(OmpMasterDirectiveContext.class,0);
		}
		public OmpFlushDirectiveContext ompFlushDirective() {
			return getRuleContext(OmpFlushDirectiveContext.class,0);
		}
		public OmpParallelSectionsDirectiveContext ompParallelSectionsDirective() {
			return getRuleContext(OmpParallelSectionsDirectiveContext.class,0);
		}
		public OmpGuiDirectiveContext ompGuiDirective() {
			return getRuleContext(OmpGuiDirectiveContext.class,0);
		}
		public OmpFreeguiDirectiveContext ompFreeguiDirective() {
			return getRuleContext(OmpFreeguiDirectiveContext.class,0);
		}
		public OmpCriticalDirectiveContext ompCriticalDirective() {
			return getRuleContext(OmpCriticalDirectiveContext.class,0);
		}
		public OmpForDirectiveContext ompForDirective() {
			return getRuleContext(OmpForDirectiveContext.class,0);
		}
		public OmpAtomicDirectiveContext ompAtomicDirective() {
			return getRuleContext(OmpAtomicDirectiveContext.class,0);
		}
		public OmpOrderedDirectiveContext ompOrderedDirective() {
			return getRuleContext(OmpOrderedDirectiveContext.class,0);
		}
		public OmpSectionDirectiveContext ompSectionDirective() {
			return getRuleContext(OmpSectionDirectiveContext.class,0);
		}
		public OmpSectionsDirectiveContext ompSectionsDirective() {
			return getRuleContext(OmpSectionsDirectiveContext.class,0);
		}
		public OmpBarrierDirectiveContext ompBarrierDirective() {
			return getRuleContext(OmpBarrierDirectiveContext.class,0);
		}
		public OmpParallelDirectiveContext ompParallelDirective() {
			return getRuleContext(OmpParallelDirectiveContext.class,0);
		}
		public OmpParallelForDirectiveContext ompParallelForDirective() {
			return getRuleContext(OmpParallelForDirectiveContext.class,0);
		}
		public OmpSingleDirectiveContext ompSingleDirective() {
			return getRuleContext(OmpSingleDirectiveContext.class,0);
		}
		public OpenmpDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openmpDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOpenmpDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOpenmpDirective(this);
		}
	}

	public final OpenmpDirectiveContext openmpDirective() throws RecognitionException {
		OpenmpDirectiveContext _localctx = new OpenmpDirectiveContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_openmpDirective);
		try {
			setState(1917);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1902); ompParallelDirective();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1903); ompParallelForDirective();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1904); ompParallelSectionsDirective();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1905); ompForDirective();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1906); ompSectionsDirective();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1907); ompFreeguiDirective();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1908); ompSectionDirective();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1909); ompGuiDirective();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1910); ompSingleDirective();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1911); ompMasterDirective();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1912); ompCriticalDirective();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1913); ompAtomicDirective();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1914); ompBarrierDirective();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1915); ompFlushDirective();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1916); ompOrderedDirective();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpParallelDirectiveContext extends ParserRuleContext {
		public List<TerminalNode> NUMTHREADS() { return getTokens(Java8Parser.NUMTHREADS); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(Java8Parser.IF); }
		public List<OmpDataClauseContext> ompDataClause() {
			return getRuleContexts(OmpDataClauseContext.class);
		}
		public TerminalNode NUMTHREADS(int i) {
			return getToken(Java8Parser.NUMTHREADS, i);
		}
		public TerminalNode IF(int i) {
			return getToken(Java8Parser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PARALLEL() { return getToken(Java8Parser.PARALLEL, 0); }
		public OmpDataClauseContext ompDataClause(int i) {
			return getRuleContext(OmpDataClauseContext.class,i);
		}
		public OmpParallelDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpParallelDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpParallelDirective(this);
		}
	}

	public final OmpParallelDirectiveContext ompParallelDirective() throws RecognitionException {
		OmpParallelDirectiveContext _localctx = new OmpParallelDirectiveContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_ompParallelDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919); match(PARALLEL);
			setState(1933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==NUMTHREADS || _la==DD) {
				{
				setState(1931);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(1920); match(IF);
					setState(1921); match(LPAREN);
					setState(1922); expression();
					setState(1923); match(RPAREN);
					}
					break;
				case NUMTHREADS:
					{
					setState(1925); match(NUMTHREADS);
					setState(1926); match(LPAREN);
					setState(1927); expression();
					setState(1928); match(RPAREN);
					}
					break;
				case DD:
					{
					setState(1930); ompDataClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1936); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpParallelForDirectiveContext extends ParserRuleContext {
		public List<TerminalNode> NUMTHREADS() { return getTokens(Java8Parser.NUMTHREADS); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(Java8Parser.IF); }
		public TerminalNode PARALLEL_FOR() { return getToken(Java8Parser.PARALLEL_FOR, 0); }
		public List<OmpDataClauseContext> ompDataClause() {
			return getRuleContexts(OmpDataClauseContext.class);
		}
		public TerminalNode NUMTHREADS(int i) {
			return getToken(Java8Parser.NUMTHREADS, i);
		}
		public TerminalNode IF(int i) {
			return getToken(Java8Parser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OmpDataClauseContext ompDataClause(int i) {
			return getRuleContext(OmpDataClauseContext.class,i);
		}
		public OmpParallelForDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelForDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpParallelForDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpParallelForDirective(this);
		}
	}

	public final OmpParallelForDirectiveContext ompParallelForDirective() throws RecognitionException {
		OmpParallelForDirectiveContext _localctx = new OmpParallelForDirectiveContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_ompParallelForDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938); match(PARALLEL_FOR);
			setState(1952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==NUMTHREADS || _la==DD) {
				{
				setState(1950);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(1939); match(IF);
					setState(1940); match(LPAREN);
					setState(1941); expression();
					setState(1942); match(RPAREN);
					}
					break;
				case NUMTHREADS:
					{
					setState(1944); match(NUMTHREADS);
					setState(1945); match(LPAREN);
					setState(1946); expression();
					setState(1947); match(RPAREN);
					}
					break;
				case DD:
					{
					setState(1949); ompDataClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1955); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpParallelSectionsDirectiveContext extends ParserRuleContext {
		public List<TerminalNode> NUMTHREADS() { return getTokens(Java8Parser.NUMTHREADS); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(Java8Parser.IF); }
		public List<OmpDataClauseContext> ompDataClause() {
			return getRuleContexts(OmpDataClauseContext.class);
		}
		public TerminalNode NUMTHREADS(int i) {
			return getToken(Java8Parser.NUMTHREADS, i);
		}
		public TerminalNode IF(int i) {
			return getToken(Java8Parser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PARALLEL_SECTIONS() { return getToken(Java8Parser.PARALLEL_SECTIONS, 0); }
		public OmpDataClauseContext ompDataClause(int i) {
			return getRuleContext(OmpDataClauseContext.class,i);
		}
		public OmpParallelSectionsDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelSectionsDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpParallelSectionsDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpParallelSectionsDirective(this);
		}
	}

	public final OmpParallelSectionsDirectiveContext ompParallelSectionsDirective() throws RecognitionException {
		OmpParallelSectionsDirectiveContext _localctx = new OmpParallelSectionsDirectiveContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_ompParallelSectionsDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957); match(PARALLEL_SECTIONS);
			setState(1971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==NUMTHREADS || _la==DD) {
				{
				setState(1969);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(1958); match(IF);
					setState(1959); match(LPAREN);
					setState(1960); expression();
					setState(1961); match(RPAREN);
					}
					break;
				case NUMTHREADS:
					{
					setState(1963); match(NUMTHREADS);
					setState(1964); match(LPAREN);
					setState(1965); expression();
					setState(1966); match(RPAREN);
					}
					break;
				case DD:
					{
					setState(1968); ompDataClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1973);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1974); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpForDirectiveContext extends ParserRuleContext {
		public List<TerminalNode> NUMTHREADS() { return getTokens(Java8Parser.NUMTHREADS); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(Java8Parser.IF); }
		public TerminalNode PARALLEL_FOR() { return getToken(Java8Parser.PARALLEL_FOR, 0); }
		public List<OmpDataClauseContext> ompDataClause() {
			return getRuleContexts(OmpDataClauseContext.class);
		}
		public TerminalNode NUMTHREADS(int i) {
			return getToken(Java8Parser.NUMTHREADS, i);
		}
		public TerminalNode IF(int i) {
			return getToken(Java8Parser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OmpDataClauseContext ompDataClause(int i) {
			return getRuleContext(OmpDataClauseContext.class,i);
		}
		public OmpForDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompForDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpForDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpForDirective(this);
		}
	}

	public final OmpForDirectiveContext ompForDirective() throws RecognitionException {
		OmpForDirectiveContext _localctx = new OmpForDirectiveContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_ompForDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976); match(PARALLEL_FOR);
			setState(1990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==NUMTHREADS || _la==DD) {
				{
				setState(1988);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(1977); match(IF);
					setState(1978); match(LPAREN);
					setState(1979); expression();
					setState(1980); match(RPAREN);
					}
					break;
				case NUMTHREADS:
					{
					setState(1982); match(NUMTHREADS);
					setState(1983); match(LPAREN);
					setState(1984); expression();
					setState(1985); match(RPAREN);
					}
					break;
				case DD:
					{
					setState(1987); ompDataClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1992);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1993); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpSectionsDirectiveContext extends ParserRuleContext {
		public List<TerminalNode> NUMTHREADS() { return getTokens(Java8Parser.NUMTHREADS); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(Java8Parser.IF); }
		public List<OmpDataClauseContext> ompDataClause() {
			return getRuleContexts(OmpDataClauseContext.class);
		}
		public TerminalNode NUMTHREADS(int i) {
			return getToken(Java8Parser.NUMTHREADS, i);
		}
		public TerminalNode IF(int i) {
			return getToken(Java8Parser.IF, i);
		}
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OmpDataClauseContext ompDataClause(int i) {
			return getRuleContext(OmpDataClauseContext.class,i);
		}
		public OmpSectionsDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSectionsDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpSectionsDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpSectionsDirective(this);
		}
	}

	public final OmpSectionsDirectiveContext ompSectionsDirective() throws RecognitionException {
		OmpSectionsDirectiveContext _localctx = new OmpSectionsDirectiveContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_ompSectionsDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995); match(FOR);
			setState(2009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==NUMTHREADS || _la==DD) {
				{
				setState(2007);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(1996); match(IF);
					setState(1997); match(LPAREN);
					setState(1998); expression();
					setState(1999); match(RPAREN);
					}
					break;
				case NUMTHREADS:
					{
					setState(2001); match(NUMTHREADS);
					setState(2002); match(LPAREN);
					setState(2003); expression();
					setState(2004); match(RPAREN);
					}
					break;
				case DD:
					{
					setState(2006); ompDataClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2012); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpFreeguiDirectiveContext extends ParserRuleContext {
		public TerminalNode NUMTHREADS() { return getToken(Java8Parser.NUMTHREADS, 0); }
		public TerminalNode IF() { return getToken(Java8Parser.IF, 0); }
		public OmpDataClauseContext ompDataClause() {
			return getRuleContext(OmpDataClauseContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> PARALLEL() { return getTokens(Java8Parser.PARALLEL); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PARALLEL(int i) {
			return getToken(Java8Parser.PARALLEL, i);
		}
		public TerminalNode FREEGUI() { return getToken(Java8Parser.FREEGUI, 0); }
		public OmpFreeguiDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompFreeguiDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpFreeguiDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpFreeguiDirective(this);
		}
	}

	public final OmpFreeguiDirectiveContext ompFreeguiDirective() throws RecognitionException {
		OmpFreeguiDirectiveContext _localctx = new OmpFreeguiDirectiveContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_ompFreeguiDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014); match(FREEGUI);
			setState(2018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARALLEL) {
				{
				{
				setState(2015); match(PARALLEL);
				}
				}
				setState(2020);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2032);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(2021); match(IF);
				setState(2022); match(LPAREN);
				setState(2023); expression();
				setState(2024); match(RPAREN);
				}
				break;
			case NUMTHREADS:
				{
				setState(2026); match(NUMTHREADS);
				setState(2027); match(LPAREN);
				setState(2028); expression();
				setState(2029); match(RPAREN);
				}
				break;
			case DD:
				{
				setState(2031); ompDataClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2034); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpSectionDirectiveContext extends ParserRuleContext {
		public List<TerminalNode> NUMTHREADS() { return getTokens(Java8Parser.NUMTHREADS); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(Java8Parser.IF); }
		public List<OmpDataClauseContext> ompDataClause() {
			return getRuleContexts(OmpDataClauseContext.class);
		}
		public TerminalNode NUMTHREADS(int i) {
			return getToken(Java8Parser.NUMTHREADS, i);
		}
		public TerminalNode IF(int i) {
			return getToken(Java8Parser.IF, i);
		}
		public TerminalNode SECTIONS() { return getToken(Java8Parser.SECTIONS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OmpDataClauseContext ompDataClause(int i) {
			return getRuleContext(OmpDataClauseContext.class,i);
		}
		public OmpSectionDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSectionDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpSectionDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpSectionDirective(this);
		}
	}

	public final OmpSectionDirectiveContext ompSectionDirective() throws RecognitionException {
		OmpSectionDirectiveContext _localctx = new OmpSectionDirectiveContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_ompSectionDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2036); match(SECTIONS);
			setState(2050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==NUMTHREADS || _la==DD) {
				{
				setState(2048);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(2037); match(IF);
					setState(2038); match(LPAREN);
					setState(2039); expression();
					setState(2040); match(RPAREN);
					}
					break;
				case NUMTHREADS:
					{
					setState(2042); match(NUMTHREADS);
					setState(2043); match(LPAREN);
					setState(2044); expression();
					setState(2045); match(RPAREN);
					}
					break;
				case DD:
					{
					setState(2047); ompDataClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2052);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2053); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpGuiDirectiveContext extends ParserRuleContext {
		public TerminalNode GUI() { return getToken(Java8Parser.GUI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OmpGuiDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompGuiDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpGuiDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpGuiDirective(this);
		}
	}

	public final OmpGuiDirectiveContext ompGuiDirective() throws RecognitionException {
		OmpGuiDirectiveContext _localctx = new OmpGuiDirectiveContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_ompGuiDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055); match(GUI);
			setState(2056); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpSingleDirectiveContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SINGLE() { return getToken(Java8Parser.SINGLE, 0); }
		public OmpSingleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSingleDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpSingleDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpSingleDirective(this);
		}
	}

	public final OmpSingleDirectiveContext ompSingleDirective() throws RecognitionException {
		OmpSingleDirectiveContext _localctx = new OmpSingleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_ompSingleDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2058); match(SINGLE);
			setState(2059); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpMasterDirectiveContext extends ParserRuleContext {
		public TerminalNode MASTER() { return getToken(Java8Parser.MASTER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OmpMasterDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompMasterDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpMasterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpMasterDirective(this);
		}
	}

	public final OmpMasterDirectiveContext ompMasterDirective() throws RecognitionException {
		OmpMasterDirectiveContext _localctx = new OmpMasterDirectiveContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_ompMasterDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061); match(MASTER);
			setState(2062); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpCriticalDirectiveContext extends ParserRuleContext {
		public TerminalNode CRITICAL() { return getToken(Java8Parser.CRITICAL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OmpCriticalDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompCriticalDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpCriticalDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpCriticalDirective(this);
		}
	}

	public final OmpCriticalDirectiveContext ompCriticalDirective() throws RecognitionException {
		OmpCriticalDirectiveContext _localctx = new OmpCriticalDirectiveContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_ompCriticalDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064); match(CRITICAL);
			setState(2065); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpAtomicDirectiveContext extends ParserRuleContext {
		public TerminalNode ATOMIC() { return getToken(Java8Parser.ATOMIC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OmpAtomicDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompAtomicDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpAtomicDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpAtomicDirective(this);
		}
	}

	public final OmpAtomicDirectiveContext ompAtomicDirective() throws RecognitionException {
		OmpAtomicDirectiveContext _localctx = new OmpAtomicDirectiveContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_ompAtomicDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067); match(ATOMIC);
			setState(2068); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpBarrierDirectiveContext extends ParserRuleContext {
		public TerminalNode BARRIER() { return getToken(Java8Parser.BARRIER, 0); }
		public OmpBarrierDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompBarrierDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpBarrierDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpBarrierDirective(this);
		}
	}

	public final OmpBarrierDirectiveContext ompBarrierDirective() throws RecognitionException {
		OmpBarrierDirectiveContext _localctx = new OmpBarrierDirectiveContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_ompBarrierDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2070); match(BARRIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpFlushDirectiveContext extends ParserRuleContext {
		public TerminalNode FLUSH() { return getToken(Java8Parser.FLUSH, 0); }
		public OmpFlushDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompFlushDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpFlushDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpFlushDirective(this);
		}
	}

	public final OmpFlushDirectiveContext ompFlushDirective() throws RecognitionException {
		OmpFlushDirectiveContext _localctx = new OmpFlushDirectiveContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_ompFlushDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2072); match(FLUSH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpOrderedDirectiveContext extends ParserRuleContext {
		public TerminalNode ORDERED() { return getToken(Java8Parser.ORDERED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OmpOrderedDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompOrderedDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpOrderedDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpOrderedDirective(this);
		}
	}

	public final OmpOrderedDirectiveContext ompOrderedDirective() throws RecognitionException {
		OmpOrderedDirectiveContext _localctx = new OmpOrderedDirectiveContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_ompOrderedDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2074); match(ORDERED);
			setState(2075); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmpDataClauseContext extends ParserRuleContext {
		public TerminalNode DD() { return getToken(Java8Parser.DD, 0); }
		public OmpDataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompDataClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpDataClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpDataClause(this);
		}
	}

	public final OmpDataClauseContext ompDataClause() throws RecognitionException {
		OmpDataClauseContext _localctx = new OmpDataClauseContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_ompDataClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2077); match(DD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(2079); primaryNoNewArray_lfno_primary();
				}
				break;

			case 2:
				{
				setState(2080); arrayCreationExpression();
				}
				break;
			}
			setState(2086);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2083); primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(2088);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(2118);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2089); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2090); typeName();
				setState(2095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2091); match(LBRACK);
					setState(2092); match(RBRACK);
					}
					}
					setState(2097);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2098); match(DOT);
				setState(2099); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2101); match(VOID);
				setState(2102); match(DOT);
				setState(2103); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2104); match(THIS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2105); typeName();
				setState(2106); match(DOT);
				setState(2107); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2109); match(LPAREN);
				setState(2110); expression();
				setState(2111); match(RPAREN);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2113); classInstanceCreationExpression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2114); fieldAccess();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2115); arrayAccess();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2116); methodInvocation();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2117); methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(2150);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2122); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2123); typeName();
				setState(2128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2124); match(LBRACK);
					setState(2125); match(RBRACK);
					}
					}
					setState(2130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2131); match(DOT);
				setState(2132); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2134); match(VOID);
				setState(2135); match(DOT);
				setState(2136); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2137); match(THIS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2138); typeName();
				setState(2139); match(DOT);
				setState(2140); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2142); match(LPAREN);
				setState(2143); expression();
				setState(2144); match(RPAREN);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2146); classInstanceCreationExpression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2147); fieldAccess();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2148); methodInvocation();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2149); methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(2157);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2152); classInstanceCreationExpression_lf_primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2153); fieldAccess_lf_primary();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2154); arrayAccess_lf_primary();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2155); methodInvocation_lf_primary();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2156); methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(2165);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2161); classInstanceCreationExpression_lf_primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2162); fieldAccess_lf_primary();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2163); methodInvocation_lf_primary();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2164); methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2207);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2167); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2168); typeName();
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2169); match(LBRACK);
					setState(2170); match(RBRACK);
					}
					}
					setState(2175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2176); match(DOT);
				setState(2177); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2179); unannPrimitiveType();
				setState(2184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2180); match(LBRACK);
					setState(2181); match(RBRACK);
					}
					}
					setState(2186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2187); match(DOT);
				setState(2188); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2190); match(VOID);
				setState(2191); match(DOT);
				setState(2192); match(CLASS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2193); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2194); typeName();
				setState(2195); match(DOT);
				setState(2196); match(THIS);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2198); match(LPAREN);
				setState(2199); expression();
				setState(2200); match(RPAREN);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2202); classInstanceCreationExpression_lfno_primary();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2203); fieldAccess_lfno_primary();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2204); arrayAccess_lfno_primary();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2205); methodInvocation_lfno_primary();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2206); methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2250);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2211); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2212); typeName();
				setState(2217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2213); match(LBRACK);
					setState(2214); match(RBRACK);
					}
					}
					setState(2219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2220); match(DOT);
				setState(2221); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2223); unannPrimitiveType();
				setState(2228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2224); match(LBRACK);
					setState(2225); match(RBRACK);
					}
					}
					setState(2230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2231); match(DOT);
				setState(2232); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2234); match(VOID);
				setState(2235); match(DOT);
				setState(2236); match(CLASS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2237); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2238); typeName();
				setState(2239); match(DOT);
				setState(2240); match(THIS);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2242); match(LPAREN);
				setState(2243); expression();
				setState(2244); match(RPAREN);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2246); classInstanceCreationExpression_lfno_primary();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2247); fieldAccess_lfno_primary();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2248); methodInvocation_lfno_primary();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2249); methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2335);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2252); match(NEW);
				setState(2254);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2253); typeArguments();
					}
				}

				setState(2259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2256); annotation();
					}
					}
					setState(2261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2262); match(Identifier);
				setState(2273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2263); match(DOT);
					setState(2267);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2264); annotation();
						}
						}
						setState(2269);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2270); match(Identifier);
					}
					}
					setState(2275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2277);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2276); typeArgumentsOrDiamond();
					}
				}

				setState(2279); match(LPAREN);
				setState(2281);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2280); argumentList();
					}
				}

				setState(2283); match(RPAREN);
				setState(2285);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2284); classBody();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2287); expressionName();
				setState(2288); match(DOT);
				setState(2289); match(NEW);
				setState(2291);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2290); typeArguments();
					}
				}

				setState(2296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2293); annotation();
					}
					}
					setState(2298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2299); match(Identifier);
				setState(2301);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2300); typeArgumentsOrDiamond();
					}
				}

				setState(2303); match(LPAREN);
				setState(2305);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2304); argumentList();
					}
				}

				setState(2307); match(RPAREN);
				setState(2309);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2308); classBody();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2311); primary();
				setState(2312); match(DOT);
				setState(2313); match(NEW);
				setState(2315);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2314); typeArguments();
					}
				}

				setState(2320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2317); annotation();
					}
					}
					setState(2322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2323); match(Identifier);
				setState(2325);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2324); typeArgumentsOrDiamond();
					}
				}

				setState(2327); match(LPAREN);
				setState(2329);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2328); argumentList();
					}
				}

				setState(2331); match(RPAREN);
				setState(2333);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2332); classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2337); match(DOT);
			setState(2338); match(NEW);
			setState(2340);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2339); typeArguments();
				}
			}

			setState(2345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2342); annotation();
				}
				}
				setState(2347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2348); match(Identifier);
			setState(2350);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2349); typeArgumentsOrDiamond();
				}
			}

			setState(2352); match(LPAREN);
			setState(2354);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(2353); argumentList();
				}
			}

			setState(2356); match(RPAREN);
			setState(2358);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2357); classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2419);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2360); match(NEW);
				setState(2362);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2361); typeArguments();
					}
				}

				setState(2367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2364); annotation();
					}
					}
					setState(2369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2370); match(Identifier);
				setState(2381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2371); match(DOT);
					setState(2375);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2372); annotation();
						}
						}
						setState(2377);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2378); match(Identifier);
					}
					}
					setState(2383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2385);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2384); typeArgumentsOrDiamond();
					}
				}

				setState(2387); match(LPAREN);
				setState(2389);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2388); argumentList();
					}
				}

				setState(2391); match(RPAREN);
				setState(2393);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2392); classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2395); expressionName();
				setState(2396); match(DOT);
				setState(2397); match(NEW);
				setState(2399);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2398); typeArguments();
					}
				}

				setState(2404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2401); annotation();
					}
					}
					setState(2406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2407); match(Identifier);
				setState(2409);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2408); typeArgumentsOrDiamond();
					}
				}

				setState(2411); match(LPAREN);
				setState(2413);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2412); argumentList();
					}
				}

				setState(2415); match(RPAREN);
				setState(2417);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(2416); classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_typeArgumentsOrDiamond);
		try {
			setState(2424);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2421); typeArguments();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2422); match(LT);
				setState(2423); match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_fieldAccess);
		try {
			setState(2439);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2426); primary();
				setState(2427); match(DOT);
				setState(2428); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2430); match(SUPER);
				setState(2431); match(DOT);
				setState(2432); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2433); typeName();
				setState(2434); match(DOT);
				setState(2435); match(SUPER);
				setState(2436); match(DOT);
				setState(2437); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lf_primary(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2441); match(DOT);
			setState(2442); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lfno_primary(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_fieldAccess_lfno_primary);
		try {
			setState(2453);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2444); match(SUPER);
				setState(2445); match(DOT);
				setState(2446); match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2447); typeName();
				setState(2448); match(DOT);
				setState(2449); match(SUPER);
				setState(2450); match(DOT);
				setState(2451); match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2465);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(2455); expressionName();
				setState(2456); match(LBRACK);
				setState(2457); expression();
				setState(2458); match(RBRACK);
				}
				break;

			case 2:
				{
				setState(2460); primaryNoNewArray_lfno_arrayAccess();
				setState(2461); match(LBRACK);
				setState(2462); expression();
				setState(2463); match(RBRACK);
				}
				break;
			}
			setState(2474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2467); primaryNoNewArray_lf_arrayAccess();
				setState(2468); match(LBRACK);
				setState(2469); expression();
				setState(2470); match(RBRACK);
				}
				}
				setState(2476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lf_primary(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2477); primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2478); match(LBRACK);
			setState(2479); expression();
			setState(2480); match(RBRACK);
			}
			setState(2489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2482); primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2483); match(LBRACK);
					setState(2484); expression();
					setState(2485); match(RBRACK);
					}
					} 
				}
				setState(2491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lfno_primary(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2502);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2492); expressionName();
				setState(2493); match(LBRACK);
				setState(2494); expression();
				setState(2495); match(RBRACK);
				}
				break;

			case 2:
				{
				setState(2497); primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2498); match(LBRACK);
				setState(2499); expression();
				setState(2500); match(RBRACK);
				}
				break;
			}
			setState(2511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2504); primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2505); match(LBRACK);
					setState(2506); expression();
					setState(2507); match(RBRACK);
					}
					} 
				}
				setState(2513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_methodInvocation);
		int _la;
		try {
			setState(2582);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2514); methodName();
				setState(2515); match(LPAREN);
				setState(2517);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2516); argumentList();
					}
				}

				setState(2519); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2521); typeName();
				setState(2522); match(DOT);
				setState(2524);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2523); typeArguments();
					}
				}

				setState(2526); match(Identifier);
				setState(2527); match(LPAREN);
				setState(2529);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2528); argumentList();
					}
				}

				setState(2531); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2533); expressionName();
				setState(2534); match(DOT);
				setState(2536);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2535); typeArguments();
					}
				}

				setState(2538); match(Identifier);
				setState(2539); match(LPAREN);
				setState(2541);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2540); argumentList();
					}
				}

				setState(2543); match(RPAREN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2545); primary();
				setState(2546); match(DOT);
				setState(2548);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2547); typeArguments();
					}
				}

				setState(2550); match(Identifier);
				setState(2551); match(LPAREN);
				setState(2553);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2552); argumentList();
					}
				}

				setState(2555); match(RPAREN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2557); match(SUPER);
				setState(2558); match(DOT);
				setState(2560);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2559); typeArguments();
					}
				}

				setState(2562); match(Identifier);
				setState(2563); match(LPAREN);
				setState(2565);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2564); argumentList();
					}
				}

				setState(2567); match(RPAREN);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2568); typeName();
				setState(2569); match(DOT);
				setState(2570); match(SUPER);
				setState(2571); match(DOT);
				setState(2573);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2572); typeArguments();
					}
				}

				setState(2575); match(Identifier);
				setState(2576); match(LPAREN);
				setState(2578);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2577); argumentList();
					}
				}

				setState(2580); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lf_primary(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584); match(DOT);
			setState(2586);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2585); typeArguments();
				}
			}

			setState(2588); match(Identifier);
			setState(2589); match(LPAREN);
			setState(2591);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
				{
				setState(2590); argumentList();
				}
			}

			setState(2593); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lfno_primary(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2651);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2595); methodName();
				setState(2596); match(LPAREN);
				setState(2598);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2597); argumentList();
					}
				}

				setState(2600); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2602); typeName();
				setState(2603); match(DOT);
				setState(2605);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2604); typeArguments();
					}
				}

				setState(2607); match(Identifier);
				setState(2608); match(LPAREN);
				setState(2610);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2609); argumentList();
					}
				}

				setState(2612); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2614); expressionName();
				setState(2615); match(DOT);
				setState(2617);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2616); typeArguments();
					}
				}

				setState(2619); match(Identifier);
				setState(2620); match(LPAREN);
				setState(2622);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2621); argumentList();
					}
				}

				setState(2624); match(RPAREN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2626); match(SUPER);
				setState(2627); match(DOT);
				setState(2629);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2628); typeArguments();
					}
				}

				setState(2631); match(Identifier);
				setState(2632); match(LPAREN);
				setState(2634);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2633); argumentList();
					}
				}

				setState(2636); match(RPAREN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2637); typeName();
				setState(2638); match(DOT);
				setState(2639); match(SUPER);
				setState(2640); match(DOT);
				setState(2642);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2641); typeArguments();
					}
				}

				setState(2644); match(Identifier);
				setState(2645); match(LPAREN);
				setState(2647);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (IntegerLiteral - 77)) | (1L << (FloatingPointLiteral - 77)) | (1L << (BooleanLiteral - 77)) | (1L << (CharacterLiteral - 77)) | (1L << (StringLiteral - 77)) | (1L << (NullLiteral - 77)) | (1L << (LPAREN - 77)) | (1L << (BANG - 77)) | (1L << (TILDE - 77)) | (1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)) | (1L << (Identifier - 77)) | (1L << (AT - 77)))) != 0)) {
					{
					setState(2646); argumentList();
					}
				}

				setState(2649); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2653); expression();
			setState(2658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2654); match(COMMA);
				setState(2655); expression();
				}
				}
				setState(2660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_methodReference);
		int _la;
		try {
			setState(2708);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2661); expressionName();
				setState(2662); match(COLONCOLON);
				setState(2664);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2663); typeArguments();
					}
				}

				setState(2666); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2668); referenceType();
				setState(2669); match(COLONCOLON);
				setState(2671);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2670); typeArguments();
					}
				}

				setState(2673); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2675); primary();
				setState(2676); match(COLONCOLON);
				setState(2678);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2677); typeArguments();
					}
				}

				setState(2680); match(Identifier);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2682); match(SUPER);
				setState(2683); match(COLONCOLON);
				setState(2685);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2684); typeArguments();
					}
				}

				setState(2687); match(Identifier);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2688); typeName();
				setState(2689); match(DOT);
				setState(2690); match(SUPER);
				setState(2691); match(COLONCOLON);
				setState(2693);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2692); typeArguments();
					}
				}

				setState(2695); match(Identifier);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2697); classType();
				setState(2698); match(COLONCOLON);
				setState(2700);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2699); typeArguments();
					}
				}

				setState(2702); match(NEW);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2704); arrayType();
				setState(2705); match(COLONCOLON);
				setState(2706); match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lf_primary(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2710); match(COLONCOLON);
			setState(2712);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2711); typeArguments();
				}
			}

			setState(2714); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lfno_primary(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2756);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2716); expressionName();
				setState(2717); match(COLONCOLON);
				setState(2719);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2718); typeArguments();
					}
				}

				setState(2721); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2723); referenceType();
				setState(2724); match(COLONCOLON);
				setState(2726);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2725); typeArguments();
					}
				}

				setState(2728); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2730); match(SUPER);
				setState(2731); match(COLONCOLON);
				setState(2733);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2732); typeArguments();
					}
				}

				setState(2735); match(Identifier);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2736); typeName();
				setState(2737); match(DOT);
				setState(2738); match(SUPER);
				setState(2739); match(COLONCOLON);
				setState(2741);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2740); typeArguments();
					}
				}

				setState(2743); match(Identifier);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2745); classType();
				setState(2746); match(COLONCOLON);
				setState(2748);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2747); typeArguments();
					}
				}

				setState(2750); match(NEW);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2752); arrayType();
				setState(2753); match(COLONCOLON);
				setState(2754); match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayCreationExpression(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_arrayCreationExpression);
		try {
			setState(2780);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2758); match(NEW);
				setState(2759); primitiveType();
				setState(2760); dimExprs();
				setState(2762);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(2761); dims();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2764); match(NEW);
				setState(2765); classOrInterfaceType();
				setState(2766); dimExprs();
				setState(2768);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(2767); dims();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2770); match(NEW);
				setState(2771); primitiveType();
				setState(2772); dims();
				setState(2773); arrayInitializer();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2775); match(NEW);
				setState(2776); classOrInterfaceType();
				setState(2777); dims();
				setState(2778); arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExprs(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2782); dimExpr();
			setState(2786);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2783); dimExpr();
					}
					} 
				}
				setState(2788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2789); annotation();
				}
				}
				setState(2794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2795); match(LBRACK);
			setState(2796); expression();
			setState(2797); match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2799); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_expression);
		try {
			setState(2803);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2801); lambdaExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2802); assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2805); lambdaParameters();
			setState(2806); match(ARROW);
			setState(2807); lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_lambdaParameters);
		int _la;
		try {
			setState(2819);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2809); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2810); match(LPAREN);
				setState(2812);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2811); formalParameterList();
					}
				}

				setState(2814); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2815); match(LPAREN);
				setState(2816); inferredFormalParameterList();
				setState(2817); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInferredFormalParameterList(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2821); match(Identifier);
			setState(2826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2822); match(COMMA);
				setState(2823); match(Identifier);
				}
				}
				setState(2828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_lambdaBody);
		try {
			setState(2831);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2829); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2830); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_assignmentExpression);
		try {
			setState(2835);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2833); conditionalExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2834); assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2837); leftHandSide();
			setState(2838); assignmentOperator();
			setState(2839); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_leftHandSide);
		try {
			setState(2844);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2841); expressionName();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2842); fieldAccess();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2843); arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2846);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (ASSIGN - 92)) | (1L << (ADD_ASSIGN - 92)) | (1L << (SUB_ASSIGN - 92)) | (1L << (MUL_ASSIGN - 92)) | (1L << (DIV_ASSIGN - 92)) | (1L << (AND_ASSIGN - 92)) | (1L << (OR_ASSIGN - 92)) | (1L << (XOR_ASSIGN - 92)) | (1L << (MOD_ASSIGN - 92)) | (1L << (LSHIFT_ASSIGN - 92)) | (1L << (RSHIFT_ASSIGN - 92)) | (1L << (URSHIFT_ASSIGN - 92)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_conditionalExpression);
		try {
			setState(2855);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2848); conditionalOrExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2849); conditionalOrExpression(0);
				setState(2850); match(QUESTION);
				setState(2851); expression();
				setState(2852); match(COLON);
				setState(2853); conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 470;
		enterRecursionRule(_localctx, 470, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2858); conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2865);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2860);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2861); match(OR);
					setState(2862); conditionalAndExpression(0);
					}
					} 
				}
				setState(2867);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 472;
		enterRecursionRule(_localctx, 472, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2869); inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2871);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2872); match(AND);
					setState(2873); inclusiveOrExpression(0);
					}
					} 
				}
				setState(2878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 474;
		enterRecursionRule(_localctx, 474, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2880); exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2887);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2882);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2883); match(BITOR);
					setState(2884); exclusiveOrExpression(0);
					}
					} 
				}
				setState(2889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 476;
		enterRecursionRule(_localctx, 476, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2891); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2893);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2894); match(CARET);
					setState(2895); andExpression(0);
					}
					} 
				}
				setState(2900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 478;
		enterRecursionRule(_localctx, 478, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2902); equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2904);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2905); match(BITAND);
					setState(2906); equalityExpression(0);
					}
					} 
				}
				setState(2911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 480;
		enterRecursionRule(_localctx, 480, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2913); relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2923);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2921);
					switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2915);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2916); match(EQUAL);
						setState(2917); relationalExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2918);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2919); match(NOTEQUAL);
						setState(2920); relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2925);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 482;
		enterRecursionRule(_localctx, 482, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2927); shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2946);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2944);
					switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2929);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2930); match(LT);
						setState(2931); shiftExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2932);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2933); match(GT);
						setState(2934); shiftExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2935);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2936); match(LE);
						setState(2937); shiftExpression(0);
						}
						break;

					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2938);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2939); match(GE);
						setState(2940); shiftExpression(0);
						}
						break;

					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2941);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2942); match(INSTANCEOF);
						setState(2943); referenceType();
						}
						break;
					}
					} 
				}
				setState(2948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 484;
		enterRecursionRule(_localctx, 484, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2950); additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2967);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2965);
					switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2952);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2953); match(LT);
						setState(2954); match(LT);
						setState(2955); additiveExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2956);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2957); match(GT);
						setState(2958); match(GT);
						setState(2959); additiveExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2960);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2961); match(GT);
						setState(2962); match(GT);
						setState(2963); match(GT);
						setState(2964); additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 486;
		enterRecursionRule(_localctx, 486, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2971); multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2981);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2979);
					switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2973);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2974); match(ADD);
						setState(2975); multiplicativeExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2976);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2977); match(SUB);
						setState(2978); multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2983);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 488;
		enterRecursionRule(_localctx, 488, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2985); unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2998);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2996);
					switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2987);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2988); match(MUL);
						setState(2989); unaryExpression();
						}
						break;

					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2990);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2991); match(DIV);
						setState(2992); unaryExpression();
						}
						break;

					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2993);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2994); match(MOD);
						setState(2995); unaryExpression();
						}
						break;
					}
					} 
				}
				setState(3000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_unaryExpression);
		try {
			setState(3008);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(3001); preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(3002); preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(3003); match(ADD);
				setState(3004); unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(3005); match(SUB);
				setState(3006); unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(3007); unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3010); match(INC);
			setState(3011); unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3013); match(DEC);
			setState(3014); unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(3022);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3016); postfixExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3017); match(TILDE);
				setState(3018); unaryExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3019); match(BANG);
				setState(3020); unaryExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3021); castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3026);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				setState(3024); primary();
				}
				break;

			case 2:
				{
				setState(3025); expressionName();
				}
				break;
			}
			setState(3032);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(3030);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(3028); postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(3029); postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(3034);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3035); postfixExpression();
			setState(3036); match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3038); match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3040); postfixExpression();
			setState(3041); match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3043); match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_castExpression);
		int _la;
		try {
			setState(3072);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3045); match(LPAREN);
				setState(3046); primitiveType();
				setState(3047); match(RPAREN);
				setState(3048); unaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3050); match(LPAREN);
				setState(3051); referenceType();
				setState(3055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3052); additionalBound();
					}
					}
					setState(3057);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3058); match(RPAREN);
				setState(3059); unaryExpressionNotPlusMinus();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3061); match(LPAREN);
				setState(3062); referenceType();
				setState(3066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3063); additionalBound();
					}
					}
					setState(3068);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3069); match(RPAREN);
				setState(3070); lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26: return packageName_sempred((PackageNameContext)_localctx, predIndex);

		case 28: return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);

		case 31: return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);

		case 235: return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);

		case 236: return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);

		case 237: return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);

		case 238: return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);

		case 239: return andExpression_sempred((AndExpressionContext)_localctx, predIndex);

		case 240: return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);

		case 241: return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);

		case 242: return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);

		case 243: return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);

		case 244: return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 2);

		case 9: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return precpred(_ctx, 5);

		case 11: return precpred(_ctx, 4);

		case 12: return precpred(_ctx, 3);

		case 13: return precpred(_ctx, 2);

		case 14: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17: return precpred(_ctx, 1);

		case 16: return precpred(_ctx, 2);

		case 15: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19: return precpred(_ctx, 1);

		case 18: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21: return precpred(_ctx, 2);

		case 20: return precpred(_ctx, 3);

		case 22: return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0088\u0c05\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\3\2\3\2\3\3\3\3\5\3\u0205\n\3\3\4\7\4"+
		"\u0208\n\4\f\4\16\4\u020b\13\4\3\4\3\4\7\4\u020f\n\4\f\4\16\4\u0212\13"+
		"\4\3\4\5\4\u0215\n\4\3\5\3\5\5\5\u0219\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\5\b\u0222\n\b\3\t\3\t\5\t\u0226\n\t\3\t\3\t\7\t\u022a\n\t\f\t\16\t\u022d"+
		"\13\t\3\n\7\n\u0230\n\n\f\n\16\n\u0233\13\n\3\n\3\n\5\n\u0237\n\n\3\n"+
		"\3\n\3\n\7\n\u023c\n\n\f\n\16\n\u023f\13\n\3\n\3\n\5\n\u0243\n\n\5\n\u0245"+
		"\n\n\3\13\3\13\7\13\u0249\n\13\f\13\16\13\u024c\13\13\3\13\3\13\5\13\u0250"+
		"\n\13\3\f\7\f\u0253\n\f\f\f\16\f\u0256\13\f\3\f\3\f\5\f\u025a\n\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\7\20\u0263\n\20\f\20\16\20\u0266\13\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0273\n\21"+
		"\3\22\7\22\u0276\n\22\f\22\16\22\u0279\13\22\3\22\3\22\3\22\7\22\u027e"+
		"\n\22\f\22\16\22\u0281\13\22\3\22\3\22\7\22\u0285\n\22\f\22\16\22\u0288"+
		"\13\22\3\23\7\23\u028b\n\23\f\23\16\23\u028e\13\23\3\23\3\23\5\23\u0292"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u029b\n\25\f\25\16\25\u029e"+
		"\13\25\5\25\u02a0\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\7\30\u02ac\n\30\f\30\16\30\u02af\13\30\3\31\3\31\5\31\u02b3\n\31\3"+
		"\32\7\32\u02b6\n\32\f\32\16\32\u02b9\13\32\3\32\3\32\5\32\u02bd\n\32\3"+
		"\33\3\33\3\33\3\33\5\33\u02c3\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u02cb\n\34\f\34\16\34\u02ce\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u02d5"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02dd\n\36\f\36\16\36\u02e0\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\5\37\u02e7\n\37\3 \3 \3!\3!\3!\3!\3!\3!\7"+
		"!\u02f1\n!\f!\16!\u02f4\13!\3\"\5\"\u02f7\n\"\3\"\7\"\u02fa\n\"\f\"\16"+
		"\"\u02fd\13\"\3\"\7\"\u0300\n\"\f\"\16\"\u0303\13\"\3\"\3\"\3#\7#\u0308"+
		"\n#\f#\16#\u030b\13#\3#\3#\3#\3#\7#\u0311\n#\f#\16#\u0314\13#\3#\3#\3"+
		"$\3$\3%\3%\3%\3%\5%\u031e\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\5*\u033b\n*\3+\3+\5+\u033f"+
		"\n+\3,\7,\u0342\n,\f,\16,\u0345\13,\3,\3,\3,\5,\u034a\n,\3,\5,\u034d\n"+
		",\3,\5,\u0350\n,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u035c\n-\3.\3.\3.\3"+
		".\3/\3/\3/\7/\u0365\n/\f/\16/\u0368\13/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\7\62\u0373\n\62\f\62\16\62\u0376\13\62\3\63\3\63\7\63"+
		"\u037a\n\63\f\63\16\63\u037d\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64"+
		"\u0385\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u038c\n\65\3\66\7\66\u038f\n"+
		"\66\f\66\16\66\u0392\13\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u03a0\n\67\38\38\38\78\u03a5\n8\f8\168\u03a8\138"+
		"\39\39\39\59\u03ad\n9\3:\3:\5:\u03b1\n:\3;\3;\5;\u03b5\n;\3<\3<\5<\u03b9"+
		"\n<\3=\3=\5=\u03bd\n=\3>\3>\3>\5>\u03c2\n>\3?\3?\5?\u03c6\n?\3?\3?\7?"+
		"\u03ca\n?\f?\16?\u03cd\13?\3@\3@\5@\u03d1\n@\3@\3@\3@\7@\u03d6\n@\f@\16"+
		"@\u03d9\13@\3@\3@\5@\u03dd\n@\5@\u03df\n@\3A\3A\7A\u03e3\nA\fA\16A\u03e6"+
		"\13A\3A\3A\5A\u03ea\nA\3B\3B\5B\u03ee\nB\3C\3C\3D\3D\3E\3E\3F\3F\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\5G\u0401\nG\3H\7H\u0404\nH\fH\16H\u0407\13H\3H"+
		"\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0416\nI\3J\3J\3J\5J\u041b\nJ"+
		"\3J\3J\7J\u041f\nJ\fJ\16J\u0422\13J\3J\3J\3J\5J\u0427\nJ\5J\u0429\nJ\3"+
		"K\3K\5K\u042d\nK\3L\3L\3L\5L\u0432\nL\3L\3L\5L\u0436\nL\3M\3M\3M\3M\3"+
		"M\5M\u043d\nM\3N\3N\3N\7N\u0442\nN\fN\16N\u0445\13N\3N\3N\3N\7N\u044a"+
		"\nN\fN\16N\u044d\13N\5N\u044f\nN\3O\7O\u0452\nO\fO\16O\u0455\13O\3O\3"+
		"O\3O\3P\3P\5P\u045c\nP\3Q\7Q\u045f\nQ\fQ\16Q\u0462\13Q\3Q\3Q\7Q\u0466"+
		"\nQ\fQ\16Q\u0469\13Q\3Q\3Q\3Q\3Q\5Q\u046f\nQ\3R\7R\u0472\nR\fR\16R\u0475"+
		"\13R\3R\3R\3R\5R\u047a\nR\3R\3R\3S\3S\3S\3T\3T\3T\7T\u0484\nT\fT\16T\u0487"+
		"\13T\3U\3U\5U\u048b\nU\3V\3V\5V\u048f\nV\3W\3W\3X\3X\3X\3Y\7Y\u0497\n"+
		"Y\fY\16Y\u049a\13Y\3Y\3Y\5Y\u049e\nY\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u04a6\nZ\3["+
		"\5[\u04a9\n[\3[\3[\3[\5[\u04ae\n[\3[\3[\3\\\3\\\3]\3]\5]\u04b6\n]\3]\5"+
		"]\u04b9\n]\3]\3]\3^\5^\u04be\n^\3^\3^\3^\5^\u04c3\n^\3^\3^\3^\5^\u04c8"+
		"\n^\3^\3^\3^\5^\u04cd\n^\3^\3^\3^\3^\3^\5^\u04d4\n^\3^\3^\3^\5^\u04d9"+
		"\n^\3^\3^\3^\3^\3^\3^\5^\u04e1\n^\3^\3^\3^\5^\u04e6\n^\3^\3^\3^\5^\u04eb"+
		"\n^\3_\7_\u04ee\n_\f_\16_\u04f1\13_\3_\3_\3_\5_\u04f6\n_\3_\3_\3`\3`\5"+
		"`\u04fc\n`\3`\5`\u04ff\n`\3`\5`\u0502\n`\3`\3`\3a\3a\3a\7a\u0509\na\f"+
		"a\16a\u050c\13a\3b\7b\u050f\nb\fb\16b\u0512\13b\3b\3b\3b\5b\u0517\nb\3"+
		"b\5b\u051a\nb\3b\5b\u051d\nb\3c\3c\3d\3d\7d\u0523\nd\fd\16d\u0526\13d"+
		"\3e\3e\5e\u052a\ne\3f\7f\u052d\nf\ff\16f\u0530\13f\3f\3f\3f\5f\u0535\n"+
		"f\3f\5f\u0538\nf\3f\3f\3g\3g\3g\3g\3g\3g\3g\5g\u0543\ng\3h\3h\3h\3i\3"+
		"i\7i\u054a\ni\fi\16i\u054d\13i\3i\3i\3j\3j\3j\3j\3j\5j\u0556\nj\3k\7k"+
		"\u0559\nk\fk\16k\u055c\13k\3k\3k\3k\3k\3l\3l\3l\3l\5l\u0566\nl\3m\7m\u0569"+
		"\nm\fm\16m\u056c\13m\3m\3m\3m\3n\3n\3n\3n\3n\3n\5n\u0577\nn\3o\7o\u057a"+
		"\no\fo\16o\u057d\13o\3o\3o\3o\3o\3o\3p\3p\7p\u0586\np\fp\16p\u0589\13"+
		"p\3p\3p\3q\3q\3q\3q\3q\5q\u0592\nq\3r\7r\u0595\nr\fr\16r\u0598\13r\3r"+
		"\3r\3r\3r\3r\5r\u059f\nr\3r\5r\u05a2\nr\3r\3r\3s\3s\3s\5s\u05a9\ns\3t"+
		"\3t\3t\3u\3u\3u\5u\u05b1\nu\3v\3v\3v\3v\5v\u05b7\nv\3v\3v\3w\3w\3w\7w"+
		"\u05be\nw\fw\16w\u05c1\13w\3x\3x\3x\3x\3y\3y\3y\5y\u05ca\ny\3z\3z\5z\u05ce"+
		"\nz\3z\5z\u05d1\nz\3z\3z\3{\3{\3{\7{\u05d8\n{\f{\16{\u05db\13{\3|\3|\3"+
		"|\3}\3}\3}\3}\3}\3}\3~\3~\5~\u05e8\n~\3~\5~\u05eb\n~\3~\3~\3\177\3\177"+
		"\3\177\7\177\u05f2\n\177\f\177\16\177\u05f5\13\177\3\u0080\3\u0080\5\u0080"+
		"\u05f9\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\7\u0081\u05ff\n\u0081\f"+
		"\u0081\16\u0081\u0602\13\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u0607\n"+
		"\u0082\3\u0083\3\u0083\3\u0083\3\u0084\7\u0084\u060d\n\u0084\f\u0084\16"+
		"\u0084\u0610\13\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u061b\n\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u0622\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\5\u0087\u0631\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0647\n\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0669\n\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\7\u0092\u0673\n\u0092"+
		"\f\u0092\16\u0092\u0676\13\u0092\3\u0092\7\u0092\u0679\n\u0092\f\u0092"+
		"\16\u0092\u067c\13\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\7\u0094\u0685\n\u0094\f\u0094\16\u0094\u0688\13\u0094\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u0694\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a"+
		"\5\u009a\u06ae\n\u009a\3\u009b\3\u009b\5\u009b\u06b2\n\u009b\3\u009c\3"+
		"\u009c\3\u009c\5\u009c\u06b7\n\u009c\3\u009c\3\u009c\5\u009c\u06bb\n\u009c"+
		"\3\u009c\3\u009c\5\u009c\u06bf\n\u009c\3\u009c\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009d\5\u009d\u06c7\n\u009d\3\u009d\3\u009d\5\u009d\u06cb\n"+
		"\u009d\3\u009d\3\u009d\5\u009d\u06cf\n\u009d\3\u009d\3\u009d\3\u009d\3"+
		"\u009e\3\u009e\5\u009e\u06d6\n\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3"+
		"\u00a0\7\u00a0\u06dd\n\u00a0\f\u00a0\16\u00a0\u06e0\13\u00a0\3\u00a1\3"+
		"\u00a1\3\u00a1\7\u00a1\u06e5\n\u00a1\f\u00a1\16\u00a1\u06e8\13\u00a1\3"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a2\7\u00a2\u06f4\n\u00a2\f\u00a2\16\u00a2\u06f7\13\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3"+
		"\u0702\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u0708\n\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5\u070e\n\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8"+
		"\u0723\n\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0728\n\u00a8\3\u00a9\3"+
		"\u00a9\7\u00a9\u072c\n\u00a9\f\u00a9\16\u00a9\u072f\13\u00a9\3\u00aa\3"+
		"\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\7\u00ab\u0738\n\u00ab\f"+
		"\u00ab\16\u00ab\u073b\13\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac"+
		"\3\u00ac\7\u00ac\u0743\n\u00ac\f\u00ac\16\u00ac\u0746\13\u00ac\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u074f\n\u00ae"+
		"\3\u00ae\5\u00ae\u0752\n\u00ae\3\u00af\3\u00af\3\u00af\5\u00af\u0757\n"+
		"\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u075e\n\u00b0\f"+
		"\u00b0\16\u00b0\u0761\13\u00b0\3\u00b1\7\u00b1\u0764\n\u00b1\f\u00b1\16"+
		"\u00b1\u0767\13\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3"+
		"\u0780\n\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\7\u00b4\u078e\n\u00b4\f\u00b4"+
		"\16\u00b4\u0791\13\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5"+
		"\u07a1\n\u00b5\f\u00b5\16\u00b5\u07a4\13\u00b5\3\u00b5\3\u00b5\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\7\u00b6\u07b4\n\u00b6\f\u00b6\16\u00b6\u07b7\13\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u07c7\n\u00b7\f\u00b7"+
		"\16\u00b7\u07ca\13\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8"+
		"\u07da\n\u00b8\f\u00b8\16\u00b8\u07dd\13\u00b8\3\u00b8\3\u00b8\3\u00b9"+
		"\3\u00b9\7\u00b9\u07e3\n\u00b9\f\u00b9\16\u00b9\u07e6\13\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\5\u00b9\u07f3\n\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\7\u00ba\u0803\n\u00ba\f\u00ba\16\u00ba\u0806\13\u00ba\3\u00ba\3\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c1"+
		"\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c4\3\u00c4\5\u00c4"+
		"\u0824\n\u00c4\3\u00c4\7\u00c4\u0827\n\u00c4\f\u00c4\16\u00c4\u082a\13"+
		"\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u0830\n\u00c5\f\u00c5\16"+
		"\u00c5\u0833\13\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0849\n\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\7\u00c7\u0851\n\u00c7\f\u00c7"+
		"\16\u00c7\u0854\13\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0869\n\u00c7\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0870\n\u00c8\3\u00c9\3\u00c9\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0878\n\u00ca\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\7\u00cb\u087e\n\u00cb\f\u00cb\16\u00cb\u0881\13\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\7\u00cb\u0889\n\u00cb\f\u00cb"+
		"\16\u00cb\u088c\13\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u08a2\n\u00cb\3\u00cc"+
		"\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\7\u00cd\u08aa\n\u00cd\f\u00cd"+
		"\16\u00cd\u08ad\13\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\7\u00cd\u08b5\n\u00cd\f\u00cd\16\u00cd\u08b8\13\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd"+
		"\u08cd\n\u00cd\3\u00ce\3\u00ce\5\u00ce\u08d1\n\u00ce\3\u00ce\7\u00ce\u08d4"+
		"\n\u00ce\f\u00ce\16\u00ce\u08d7\13\u00ce\3\u00ce\3\u00ce\3\u00ce\7\u00ce"+
		"\u08dc\n\u00ce\f\u00ce\16\u00ce\u08df\13\u00ce\3\u00ce\7\u00ce\u08e2\n"+
		"\u00ce\f\u00ce\16\u00ce\u08e5\13\u00ce\3\u00ce\5\u00ce\u08e8\n\u00ce\3"+
		"\u00ce\3\u00ce\5\u00ce\u08ec\n\u00ce\3\u00ce\3\u00ce\5\u00ce\u08f0\n\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u08f6\n\u00ce\3\u00ce\7\u00ce"+
		"\u08f9\n\u00ce\f\u00ce\16\u00ce\u08fc\13\u00ce\3\u00ce\3\u00ce\5\u00ce"+
		"\u0900\n\u00ce\3\u00ce\3\u00ce\5\u00ce\u0904\n\u00ce\3\u00ce\3\u00ce\5"+
		"\u00ce\u0908\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u090e\n\u00ce"+
		"\3\u00ce\7\u00ce\u0911\n\u00ce\f\u00ce\16\u00ce\u0914\13\u00ce\3\u00ce"+
		"\3\u00ce\5\u00ce\u0918\n\u00ce\3\u00ce\3\u00ce\5\u00ce\u091c\n\u00ce\3"+
		"\u00ce\3\u00ce\5\u00ce\u0920\n\u00ce\5\u00ce\u0922\n\u00ce\3\u00cf\3\u00cf"+
		"\3\u00cf\5\u00cf\u0927\n\u00cf\3\u00cf\7\u00cf\u092a\n\u00cf\f\u00cf\16"+
		"\u00cf\u092d\13\u00cf\3\u00cf\3\u00cf\5\u00cf\u0931\n\u00cf\3\u00cf\3"+
		"\u00cf\5\u00cf\u0935\n\u00cf\3\u00cf\3\u00cf\5\u00cf\u0939\n\u00cf\3\u00d0"+
		"\3\u00d0\5\u00d0\u093d\n\u00d0\3\u00d0\7\u00d0\u0940\n\u00d0\f\u00d0\16"+
		"\u00d0\u0943\13\u00d0\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0948\n\u00d0\f"+
		"\u00d0\16\u00d0\u094b\13\u00d0\3\u00d0\7\u00d0\u094e\n\u00d0\f\u00d0\16"+
		"\u00d0\u0951\13\u00d0\3\u00d0\5\u00d0\u0954\n\u00d0\3\u00d0\3\u00d0\5"+
		"\u00d0\u0958\n\u00d0\3\u00d0\3\u00d0\5\u00d0\u095c\n\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\5\u00d0\u0962\n\u00d0\3\u00d0\7\u00d0\u0965\n\u00d0\f"+
		"\u00d0\16\u00d0\u0968\13\u00d0\3\u00d0\3\u00d0\5\u00d0\u096c\n\u00d0\3"+
		"\u00d0\3\u00d0\5\u00d0\u0970\n\u00d0\3\u00d0\3\u00d0\5\u00d0\u0974\n\u00d0"+
		"\5\u00d0\u0976\n\u00d0\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u097b\n\u00d1\3"+
		"\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u098a\n\u00d2\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\5\u00d4\u0998\n\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u09a4\n\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\7\u00d5\u09ab\n\u00d5\f\u00d5\16\u00d5"+
		"\u09ae\13\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\7\u00d6\u09ba\n\u00d6\f\u00d6\16\u00d6\u09bd"+
		"\13\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\5\u00d7\u09c9\n\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\7\u00d7\u09d0\n\u00d7\f\u00d7\16\u00d7\u09d3\13\u00d7\3\u00d8"+
		"\3\u00d8\3\u00d8\5\u00d8\u09d8\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\5\u00d8\u09df\n\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u09e4\n"+
		"\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u09eb\n\u00d8\3"+
		"\u00d8\3\u00d8\3\u00d8\5\u00d8\u09f0\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3"+
		"\u00d8\3\u00d8\5\u00d8\u09f7\n\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u09fc"+
		"\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a03\n\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a08\n\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a10\n\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\5\u00d8\u0a15\n\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a19\n\u00d8\3\u00d9\3"+
		"\u00d9\5\u00d9\u0a1d\n\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0a22\n\u00d9"+
		"\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\5\u00da\u0a29\n\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0a30\n\u00da\3\u00da\3\u00da"+
		"\3\u00da\5\u00da\u0a35\n\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\5\u00da\u0a3c\n\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0a41\n\u00da\3"+
		"\u00da\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0a48\n\u00da\3\u00da\3"+
		"\u00da\3\u00da\5\u00da\u0a4d\n\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3"+
		"\u00da\3\u00da\5\u00da\u0a55\n\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0a5a"+
		"\n\u00da\3\u00da\3\u00da\5\u00da\u0a5e\n\u00da\3\u00db\3\u00db\3\u00db"+
		"\7\u00db\u0a63\n\u00db\f\u00db\16\u00db\u0a66\13\u00db\3\u00dc\3\u00dc"+
		"\3\u00dc\5\u00dc\u0a6b\n\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\5\u00dc\u0a72\n\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc"+
		"\u0a79\n\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0a80\n"+
		"\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0a88\n"+
		"\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0a8f\n\u00dc\3"+
		"\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0a97\n\u00dc\3"+
		"\u00dd\3\u00dd\5\u00dd\u0a9b\n\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\3"+
		"\u00de\5\u00de\u0aa2\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\5"+
		"\u00de\u0aa9\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\5\u00de\u0ab0"+
		"\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\5\u00de\u0ab8"+
		"\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\5\u00de\u0abf\n\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\5\u00de\u0ac7\n\u00de"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\5\u00df\u0acd\n\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\5\u00df\u0ad3\n\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\5\u00df\u0adf\n\u00df"+
		"\3\u00e0\3\u00e0\7\u00e0\u0ae3\n\u00e0\f\u00e0\16\u00e0\u0ae6\13\u00e0"+
		"\3\u00e1\7\u00e1\u0ae9\n\u00e1\f\u00e1\16\u00e1\u0aec\13\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e3\3\u00e3\5\u00e3\u0af6"+
		"\n\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e5\5\u00e5"+
		"\u0aff\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0b06\n"+
		"\u00e5\3\u00e6\3\u00e6\3\u00e6\7\u00e6\u0b0b\n\u00e6\f\u00e6\16\u00e6"+
		"\u0b0e\13\u00e6\3\u00e7\3\u00e7\5\u00e7\u0b12\n\u00e7\3\u00e8\3\u00e8"+
		"\5\u00e8\u0b16\n\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea"+
		"\3\u00ea\5\u00ea\u0b1f\n\u00ea\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0b2a\n\u00ec\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u0b32\n\u00ed\f\u00ed\16\u00ed"+
		"\u0b35\13\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee"+
		"\u0b3d\n\u00ee\f\u00ee\16\u00ee\u0b40\13\u00ee\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\7\u00ef\u0b48\n\u00ef\f\u00ef\16\u00ef\u0b4b"+
		"\13\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\7\u00f0\u0b53"+
		"\n\u00f0\f\u00f0\16\u00f0\u0b56\13\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1"+
		"\3\u00f1\3\u00f1\7\u00f1\u0b5e\n\u00f1\f\u00f1\16\u00f1\u0b61\13\u00f1"+
		"\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2"+
		"\7\u00f2\u0b6c\n\u00f2\f\u00f2\16\u00f2\u0b6f\13\u00f2\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\7\u00f3\u0b83"+
		"\n\u00f3\f\u00f3\16\u00f3\u0b86\13\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f4"+
		"\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4"+
		"\3\u00f4\3\u00f4\3\u00f4\7\u00f4\u0b98\n\u00f4\f\u00f4\16\u00f4\u0b9b"+
		"\13\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5"+
		"\3\u00f5\7\u00f5\u0ba6\n\u00f5\f\u00f5\16\u00f5\u0ba9\13\u00f5\3\u00f6"+
		"\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6"+
		"\3\u00f6\3\u00f6\7\u00f6\u0bb7\n\u00f6\f\u00f6\16\u00f6\u0bba\13\u00f6"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\5\u00f7\u0bc3"+
		"\n\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00fa\3\u00fa"+
		"\3\u00fa\3\u00fa\3\u00fa\3\u00fa\5\u00fa\u0bd1\n\u00fa\3\u00fb\3\u00fb"+
		"\5\u00fb\u0bd5\n\u00fb\3\u00fb\3\u00fb\7\u00fb\u0bd9\n\u00fb\f\u00fb\16"+
		"\u00fb\u0bdc\13\u00fb\3\u00fc\3\u00fc\3\u00fc\3\u00fd\3\u00fd\3\u00fe"+
		"\3\u00fe\3\u00fe\3\u00ff\3\u00ff\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100"+
		"\3\u0100\3\u0100\3\u0100\7\u0100\u0bf0\n\u0100\f\u0100\16\u0100\u0bf3"+
		"\13\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\7\u0100\u0bfb"+
		"\n\u0100\f\u0100\16\u0100\u0bfe\13\u0100\3\u0100\3\u0100\3\u0100\5\u0100"+
		"\u0c03\n\u0100\3\u0100\2\17\66:@\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4"+
		"\u01e6\u01e8\u01ea\u0101\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4"+
		"\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec"+
		"\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\2\6\3\2OT\7\2\7"+
		"\7\n\n\35\35\37\37\'\'\4\2\20\20\26\26\4\2^^w\u0081\u0d08\2\u0200\3\2"+
		"\2\2\4\u0204\3\2\2\2\6\u0214\3\2\2\2\b\u0218\3\2\2\2\n\u021a\3\2\2\2\f"+
		"\u021c\3\2\2\2\16\u0221\3\2\2\2\20\u0225\3\2\2\2\22\u0244\3\2\2\2\24\u0246"+
		"\3\2\2\2\26\u0254\3\2\2\2\30\u025b\3\2\2\2\32\u025d\3\2\2\2\34\u025f\3"+
		"\2\2\2\36\u0264\3\2\2\2 \u0272\3\2\2\2\"\u0277\3\2\2\2$\u028c\3\2\2\2"+
		"&\u0293\3\2\2\2(\u029f\3\2\2\2*\u02a1\3\2\2\2,\u02a4\3\2\2\2.\u02a8\3"+
		"\2\2\2\60\u02b2\3\2\2\2\62\u02b7\3\2\2\2\64\u02c2\3\2\2\2\66\u02c4\3\2"+
		"\2\28\u02d4\3\2\2\2:\u02d6\3\2\2\2<\u02e6\3\2\2\2>\u02e8\3\2\2\2@\u02ea"+
		"\3\2\2\2B\u02f6\3\2\2\2D\u0309\3\2\2\2F\u0317\3\2\2\2H\u031d\3\2\2\2J"+
		"\u031f\3\2\2\2L\u0323\3\2\2\2N\u0329\3\2\2\2P\u0330\3\2\2\2R\u033a\3\2"+
		"\2\2T\u033e\3\2\2\2V\u0343\3\2\2\2X\u035b\3\2\2\2Z\u035d\3\2\2\2\\\u0361"+
		"\3\2\2\2^\u0369\3\2\2\2`\u036c\3\2\2\2b\u036f\3\2\2\2d\u0377\3\2\2\2f"+
		"\u0384\3\2\2\2h\u038b\3\2\2\2j\u0390\3\2\2\2l\u039f\3\2\2\2n\u03a1\3\2"+
		"\2\2p\u03a9\3\2\2\2r\u03ae\3\2\2\2t\u03b4\3\2\2\2v\u03b8\3\2\2\2x\u03bc"+
		"\3\2\2\2z\u03c1\3\2\2\2|\u03c5\3\2\2\2~\u03de\3\2\2\2\u0080\u03e0\3\2"+
		"\2\2\u0082\u03eb\3\2\2\2\u0084\u03ef\3\2\2\2\u0086\u03f1\3\2\2\2\u0088"+
		"\u03f3\3\2\2\2\u008a\u03f5\3\2\2\2\u008c\u0400\3\2\2\2\u008e\u0405\3\2"+
		"\2\2\u0090\u0415\3\2\2\2\u0092\u0428\3\2\2\2\u0094\u042c\3\2\2\2\u0096"+
		"\u042e\3\2\2\2\u0098\u043c\3\2\2\2\u009a\u044e\3\2\2\2\u009c\u0453\3\2"+
		"\2\2\u009e\u045b\3\2\2\2\u00a0\u046e\3\2\2\2\u00a2\u0473\3\2\2\2\u00a4"+
		"\u047d\3\2\2\2\u00a6\u0480\3\2\2\2\u00a8\u048a\3\2\2\2\u00aa\u048e\3\2"+
		"\2\2\u00ac\u0490\3\2\2\2\u00ae\u0492\3\2\2\2\u00b0\u0498\3\2\2\2\u00b2"+
		"\u04a5\3\2\2\2\u00b4\u04a8\3\2\2\2\u00b6\u04b1\3\2\2\2\u00b8\u04b3\3\2"+
		"\2\2\u00ba\u04ea\3\2\2\2\u00bc\u04ef\3\2\2\2\u00be\u04f9\3\2\2\2\u00c0"+
		"\u0505\3\2\2\2\u00c2\u0510\3\2\2\2\u00c4\u051e\3\2\2\2\u00c6\u0520\3\2"+
		"\2\2\u00c8\u0529\3\2\2\2\u00ca\u052e\3\2\2\2\u00cc\u0542\3\2\2\2\u00ce"+
		"\u0544\3\2\2\2\u00d0\u0547\3\2\2\2\u00d2\u0555\3\2\2\2\u00d4\u055a\3\2"+
		"\2\2\u00d6\u0565\3\2\2\2\u00d8\u056a\3\2\2\2\u00da\u0576\3\2\2\2\u00dc"+
		"\u057b\3\2\2\2\u00de\u0583\3\2\2\2\u00e0\u0591\3\2\2\2\u00e2\u0596\3\2"+
		"\2\2\u00e4\u05a8\3\2\2\2\u00e6\u05aa\3\2\2\2\u00e8\u05b0\3\2\2\2\u00ea"+
		"\u05b2\3\2\2\2\u00ec\u05ba\3\2\2\2\u00ee\u05c2\3\2\2\2\u00f0\u05c9\3\2"+
		"\2\2\u00f2\u05cb\3\2\2\2\u00f4\u05d4\3\2\2\2\u00f6\u05dc\3\2\2\2\u00f8"+
		"\u05df\3\2\2\2\u00fa\u05e5\3\2\2\2\u00fc\u05ee\3\2\2\2\u00fe\u05f6\3\2"+
		"\2\2\u0100\u05fc\3\2\2\2\u0102\u0606\3\2\2\2\u0104\u0608\3\2\2\2\u0106"+
		"\u060e\3\2\2\2\u0108\u061a\3\2\2\2\u010a\u0621\3\2\2\2\u010c\u0630\3\2"+
		"\2\2\u010e\u0632\3\2\2\2\u0110\u0634\3\2\2\2\u0112\u0638\3\2\2\2\u0114"+
		"\u063c\3\2\2\2\u0116\u0646\3\2\2\2\u0118\u0648\3\2\2\2\u011a\u064e\3\2"+
		"\2\2\u011c\u0656\3\2\2\2\u011e\u0668\3\2\2\2\u0120\u066a\3\2\2\2\u0122"+
		"\u0670\3\2\2\2\u0124\u067f\3\2\2\2\u0126\u0682\3\2\2\2\u0128\u0693\3\2"+
		"\2\2\u012a\u0695\3\2\2\2\u012c\u0697\3\2\2\2\u012e\u069d\3\2\2\2\u0130"+
		"\u06a3\3\2\2\2\u0132\u06ad\3\2\2\2\u0134\u06b1\3\2\2\2\u0136\u06b3\3\2"+
		"\2\2\u0138\u06c3\3\2\2\2\u013a\u06d5\3\2\2\2\u013c\u06d7\3\2\2\2\u013e"+
		"\u06d9\3\2\2\2\u0140\u06e1\3\2\2\2\u0142\u06f0\3\2\2\2\u0144\u06ff\3\2"+
		"\2\2\u0146\u0705\3\2\2\2\u0148\u070b\3\2\2\2\u014a\u0711\3\2\2\2\u014c"+
		"\u0715\3\2\2\2\u014e\u0727\3\2\2\2\u0150\u0729\3\2\2\2\u0152\u0730\3\2"+
		"\2\2\u0154\u0739\3\2\2\2\u0156\u073f\3\2\2\2\u0158\u0747\3\2\2\2\u015a"+
		"\u074a\3\2\2\2\u015c\u0753\3\2\2\2\u015e\u075a\3\2\2\2\u0160\u0765\3\2"+
		"\2\2\u0162\u076d\3\2\2\2\u0164\u077f\3\2\2\2\u0166\u0781\3\2\2\2\u0168"+
		"\u0794\3\2\2\2\u016a\u07a7\3\2\2\2\u016c\u07ba\3\2\2\2\u016e\u07cd\3\2"+
		"\2\2\u0170\u07e0\3\2\2\2\u0172\u07f6\3\2\2\2\u0174\u0809\3\2\2\2\u0176"+
		"\u080c\3\2\2\2\u0178\u080f\3\2\2\2\u017a\u0812\3\2\2\2\u017c\u0815\3\2"+
		"\2\2\u017e\u0818\3\2\2\2\u0180\u081a\3\2\2\2\u0182\u081c\3\2\2\2\u0184"+
		"\u081f\3\2\2\2\u0186\u0823\3\2\2\2\u0188\u0848\3\2\2\2\u018a\u084a\3\2"+
		"\2\2\u018c\u0868\3\2\2\2\u018e\u086f\3\2\2\2\u0190\u0871\3\2\2\2\u0192"+
		"\u0877\3\2\2\2\u0194\u08a1\3\2\2\2\u0196\u08a3\3\2\2\2\u0198\u08cc\3\2"+
		"\2\2\u019a\u0921\3\2\2\2\u019c\u0923\3\2\2\2\u019e\u0975\3\2\2\2\u01a0"+
		"\u097a\3\2\2\2\u01a2\u0989\3\2\2\2\u01a4\u098b\3\2\2\2\u01a6\u0997\3\2"+
		"\2\2\u01a8\u09a3\3\2\2\2\u01aa\u09af\3\2\2\2\u01ac\u09c8\3\2\2\2\u01ae"+
		"\u0a18\3\2\2\2\u01b0\u0a1a\3\2\2\2\u01b2\u0a5d\3\2\2\2\u01b4\u0a5f\3\2"+
		"\2\2\u01b6\u0a96\3\2\2\2\u01b8\u0a98\3\2\2\2\u01ba\u0ac6\3\2\2\2\u01bc"+
		"\u0ade\3\2\2\2\u01be\u0ae0\3\2\2\2\u01c0\u0aea\3\2\2\2\u01c2\u0af1\3\2"+
		"\2\2\u01c4\u0af5\3\2\2\2\u01c6\u0af7\3\2\2\2\u01c8\u0b05\3\2\2\2\u01ca"+
		"\u0b07\3\2\2\2\u01cc\u0b11\3\2\2\2\u01ce\u0b15\3\2\2\2\u01d0\u0b17\3\2"+
		"\2\2\u01d2\u0b1e\3\2\2\2\u01d4\u0b20\3\2\2\2\u01d6\u0b29\3\2\2\2\u01d8"+
		"\u0b2b\3\2\2\2\u01da\u0b36\3\2\2\2\u01dc\u0b41\3\2\2\2\u01de\u0b4c\3\2"+
		"\2\2\u01e0\u0b57\3\2\2\2\u01e2\u0b62\3\2\2\2\u01e4\u0b70\3\2\2\2\u01e6"+
		"\u0b87\3\2\2\2\u01e8\u0b9c\3\2\2\2\u01ea\u0baa\3\2\2\2\u01ec\u0bc2\3\2"+
		"\2\2\u01ee\u0bc4\3\2\2\2\u01f0\u0bc7\3\2\2\2\u01f2\u0bd0\3\2\2\2\u01f4"+
		"\u0bd4\3\2\2\2\u01f6\u0bdd\3\2\2\2\u01f8\u0be0\3\2\2\2\u01fa\u0be2\3\2"+
		"\2\2\u01fc\u0be5\3\2\2\2\u01fe\u0c02\3\2\2\2\u0200\u0201\t\2\2\2\u0201"+
		"\3\3\2\2\2\u0202\u0205\5\6\4\2\u0203\u0205\5\16\b\2\u0204\u0202\3\2\2"+
		"\2\u0204\u0203\3\2\2\2\u0205\5\3\2\2\2\u0206\u0208\5\u00e8u\2\u0207\u0206"+
		"\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u0215\5\b\5\2\u020d\u020f\5\u00e8"+
		"u\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0215\7\5"+
		"\2\2\u0214\u0209\3\2\2\2\u0214\u0210\3\2\2\2\u0215\7\3\2\2\2\u0216\u0219"+
		"\5\n\6\2\u0217\u0219\5\f\7\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219"+
		"\t\3\2\2\2\u021a\u021b\t\3\2\2\u021b\13\3\2\2\2\u021c\u021d\t\4\2\2\u021d"+
		"\r\3\2\2\2\u021e\u0222\5\20\t\2\u021f\u0222\5\36\20\2\u0220\u0222\5 \21"+
		"\2\u0221\u021e\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222\17"+
		"\3\2\2\2\u0223\u0226\5\26\f\2\u0224\u0226\5\34\17\2\u0225\u0223\3\2\2"+
		"\2\u0225\u0224\3\2\2\2\u0226\u022b\3\2\2\2\u0227\u022a\5\24\13\2\u0228"+
		"\u022a\5\32\16\2\u0229\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022a\u022d\3"+
		"\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\21\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022e\u0230\5\u00e8u\2\u022f\u022e\3\2\2\2\u0230\u0233"+
		"\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0234\u0236\7\u0082\2\2\u0235\u0237\5,\27\2\u0236\u0235"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0245\3\2\2\2\u0238\u0239\5\20\t\2"+
		"\u0239\u023d\7]\2\2\u023a\u023c\5\u00e8u\2\u023b\u023a\3\2\2\2\u023c\u023f"+
		"\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0242\7\u0082\2\2\u0241\u0243\5,\27\2\u0242\u0241"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0231\3\2\2\2\u0244"+
		"\u0238\3\2\2\2\u0245\23\3\2\2\2\u0246\u024a\7]\2\2\u0247\u0249\5\u00e8"+
		"u\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024f\7\u0082"+
		"\2\2\u024e\u0250\5,\27\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\25\3\2\2\2\u0251\u0253\5\u00e8u\2\u0252\u0251\3\2\2\2\u0253\u0256\3\2"+
		"\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256"+
		"\u0254\3\2\2\2\u0257\u0259\7\u0082\2\2\u0258\u025a\5,\27\2\u0259\u0258"+
		"\3\2\2\2\u0259\u025a\3\2\2\2\u025a\27\3\2\2\2\u025b\u025c\5\22\n\2\u025c"+
		"\31\3\2\2\2\u025d\u025e\5\24\13\2\u025e\33\3\2\2\2\u025f\u0260\5\26\f"+
		"\2\u0260\35\3\2\2\2\u0261\u0263\5\u00e8u\2\u0262\u0261\3\2\2\2\u0263\u0266"+
		"\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266"+
		"\u0264\3\2\2\2\u0267\u0268\7\u0082\2\2\u0268\37\3\2\2\2\u0269\u026a\5"+
		"\6\4\2\u026a\u026b\5\"\22\2\u026b\u0273\3\2\2\2\u026c\u026d\5\20\t\2\u026d"+
		"\u026e\5\"\22\2\u026e\u0273\3\2\2\2\u026f\u0270\5\36\20\2\u0270\u0271"+
		"\5\"\22\2\u0271\u0273\3\2\2\2\u0272\u0269\3\2\2\2\u0272\u026c\3\2\2\2"+
		"\u0272\u026f\3\2\2\2\u0273!\3\2\2\2\u0274\u0276\5\u00e8u\2\u0275\u0274"+
		"\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u027a\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027b\7Y\2\2\u027b\u0286\7Z\2"+
		"\2\u027c\u027e\5\u00e8u\2\u027d\u027c\3\2\2\2\u027e\u0281\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u027f\3\2"+
		"\2\2\u0282\u0283\7Y\2\2\u0283\u0285\7Z\2\2\u0284\u027f\3\2\2\2\u0285\u0288"+
		"\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287#\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0289\u028b\5&\24\2\u028a\u0289\3\2\2\2\u028b\u028e\3\2"+
		"\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e"+
		"\u028c\3\2\2\2\u028f\u0291\7\u0082\2\2\u0290\u0292\5(\25\2\u0291\u0290"+
		"\3\2\2\2\u0291\u0292\3\2\2\2\u0292%\3\2\2\2\u0293\u0294\5\u00e8u\2\u0294"+
		"\'\3\2\2\2\u0295\u0296\7\23\2\2\u0296\u02a0\5\36\20\2\u0297\u0298\7\23"+
		"\2\2\u0298\u029c\5\20\t\2\u0299\u029b\5*\26\2\u029a\u0299\3\2\2\2\u029b"+
		"\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a0\3\2"+
		"\2\2\u029e\u029c\3\2\2\2\u029f\u0295\3\2\2\2\u029f\u0297\3\2\2\2\u02a0"+
		")\3\2\2\2\u02a1\u02a2\7q\2\2\u02a2\u02a3\5\30\r\2\u02a3+\3\2\2\2\u02a4"+
		"\u02a5\7`\2\2\u02a5\u02a6\5.\30\2\u02a6\u02a7\7_\2\2\u02a7-\3\2\2\2\u02a8"+
		"\u02ad\5\60\31\2\u02a9\u02aa\7\\\2\2\u02aa\u02ac\5\60\31\2\u02ab\u02a9"+
		"\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"/\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b3\5\16\b\2\u02b1\u02b3\5\62\32"+
		"\2\u02b2\u02b0\3\2\2\2\u02b2\u02b1\3\2\2\2\u02b3\61\3\2\2\2\u02b4\u02b6"+
		"\5\u00e8u\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2"+
		"\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bc"+
		"\7c\2\2\u02bb\u02bd\5\64\33\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2"+
		"\u02bd\63\3\2\2\2\u02be\u02bf\7\23\2\2\u02bf\u02c3\5\16\b\2\u02c0\u02c1"+
		"\7*\2\2\u02c1\u02c3\5\16\b\2\u02c2\u02be\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3"+
		"\65\3\2\2\2\u02c4\u02c5\b\34\1\2\u02c5\u02c6\7\u0082\2\2\u02c6\u02cc\3"+
		"\2\2\2\u02c7\u02c8\f\3\2\2\u02c8\u02c9\7]\2\2\u02c9\u02cb\7\u0082\2\2"+
		"\u02ca\u02c7\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd"+
		"\3\2\2\2\u02cd\67\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d5\7\u0082\2\2"+
		"\u02d0\u02d1\5:\36\2\u02d1\u02d2\7]\2\2\u02d2\u02d3\7\u0082\2\2\u02d3"+
		"\u02d5\3\2\2\2\u02d4\u02cf\3\2\2\2\u02d4\u02d0\3\2\2\2\u02d59\3\2\2\2"+
		"\u02d6\u02d7\b\36\1\2\u02d7\u02d8\7\u0082\2\2\u02d8\u02de\3\2\2\2\u02d9"+
		"\u02da\f\3\2\2\u02da\u02db\7]\2\2\u02db\u02dd\7\u0082\2\2\u02dc\u02d9"+
		"\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		";\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e7\7\u0082\2\2\u02e2\u02e3\5@!"+
		"\2\u02e3\u02e4\7]\2\2\u02e4\u02e5\7\u0082\2\2\u02e5\u02e7\3\2\2\2\u02e6"+
		"\u02e1\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e7=\3\2\2\2\u02e8\u02e9\7\u0082"+
		"\2\2\u02e9?\3\2\2\2\u02ea\u02eb\b!\1\2\u02eb\u02ec\7\u0082\2\2\u02ec\u02f2"+
		"\3\2\2\2\u02ed\u02ee\f\3\2\2\u02ee\u02ef\7]\2\2\u02ef\u02f1\7\u0082\2"+
		"\2\u02f0\u02ed\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3A\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f7\5D#\2\u02f6\u02f5"+
		"\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fb\3\2\2\2\u02f8\u02fa\5H%\2\u02f9"+
		"\u02f8\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2"+
		"\2\2\u02fc\u0301\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u0300\5R*\2\u02ff\u02fe"+
		"\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0304\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0305\7\2\2\3\u0305C\3\2\2\2"+
		"\u0306\u0308\5F$\2\u0307\u0306\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307"+
		"\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u0309\3\2\2\2\u030c"+
		"\u030d\7\"\2\2\u030d\u0312\7\u0082\2\2\u030e\u030f\7]\2\2\u030f\u0311"+
		"\7\u0082\2\2\u0310\u030e\3\2\2\2\u0311\u0314\3\2\2\2\u0312\u0310\3\2\2"+
		"\2\u0312\u0313\3\2\2\2\u0313\u0315\3\2\2\2\u0314\u0312\3\2\2\2\u0315\u0316"+
		"\7[\2\2\u0316E\3\2\2\2\u0317\u0318\5\u00e8u\2\u0318G\3\2\2\2\u0319\u031e"+
		"\5J&\2\u031a\u031e\5L\'\2\u031b\u031e\5N(\2\u031c\u031e\5P)\2\u031d\u0319"+
		"\3\2\2\2\u031d\u031a\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031c\3\2\2\2\u031e"+
		"I\3\2\2\2\u031f\u0320\7\33\2\2\u0320\u0321\58\35\2\u0321\u0322\7[\2\2"+
		"\u0322K\3\2\2\2\u0323\u0324\7\33\2\2\u0324\u0325\5:\36\2\u0325\u0326\7"+
		"]\2\2\u0326\u0327\7o\2\2\u0327\u0328\7[\2\2\u0328M\3\2\2\2\u0329\u032a"+
		"\7\33\2\2\u032a\u032b\7(\2\2\u032b\u032c\58\35\2\u032c\u032d\7]\2\2\u032d"+
		"\u032e\7\u0082\2\2\u032e\u032f\7[\2\2\u032fO\3\2\2\2\u0330\u0331\7\33"+
		"\2\2\u0331\u0332\7(\2\2\u0332\u0333\58\35\2\u0333\u0334\7]\2\2\u0334\u0335"+
		"\7o\2\2\u0335\u0336\7[\2\2\u0336Q\3\2\2\2\u0337\u033b\5T+\2\u0338\u033b"+
		"\5\u00c8e\2\u0339\u033b\7[\2\2\u033a\u0337\3\2\2\2\u033a\u0338\3\2\2\2"+
		"\u033a\u0339\3\2\2\2\u033bS\3\2\2\2\u033c\u033f\5V,\2\u033d\u033f\5\u00bc"+
		"_\2\u033e\u033c\3\2\2\2\u033e\u033d\3\2\2\2\u033fU\3\2\2\2\u0340\u0342"+
		"\5X-\2\u0341\u0340\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0346\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0347\7\13"+
		"\2\2\u0347\u0349\7\u0082\2\2\u0348\u034a\5Z.\2\u0349\u0348\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034c\3\2\2\2\u034b\u034d\5^\60\2\u034c\u034b\3\2"+
		"\2\2\u034c\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u0350\5`\61\2\u034f"+
		"\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352\5d"+
		"\63\2\u0352W\3\2\2\2\u0353\u035c\5\u00e8u\2\u0354\u035c\7%\2\2\u0355\u035c"+
		"\7$\2\2\u0356\u035c\7#\2\2\u0357\u035c\7\3\2\2\u0358\u035c\7(\2\2\u0359"+
		"\u035c\7\24\2\2\u035a\u035c\7)\2\2\u035b\u0353\3\2\2\2\u035b\u0354\3\2"+
		"\2\2\u035b\u0355\3\2\2\2\u035b\u0356\3\2\2\2\u035b\u0357\3\2\2\2\u035b"+
		"\u0358\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035a\3\2\2\2\u035cY\3\2\2\2"+
		"\u035d\u035e\7`\2\2\u035e\u035f\5\\/\2\u035f\u0360\7_\2\2\u0360[\3\2\2"+
		"\2\u0361\u0366\5$\23\2\u0362\u0363\7\\\2\2\u0363\u0365\5$\23\2\u0364\u0362"+
		"\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"]\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036a\7\23\2\2\u036a\u036b\5\22\n"+
		"\2\u036b_\3\2\2\2\u036c\u036d\7\32\2\2\u036d\u036e\5b\62\2\u036ea\3\2"+
		"\2\2\u036f\u0374\5\30\r\2\u0370\u0371\7\\\2\2\u0371\u0373\5\30\r\2\u0372"+
		"\u0370\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2"+
		"\2\2\u0375c\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u037b\7W\2\2\u0378\u037a"+
		"\5f\64\2\u0379\u0378\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b"+
		"\u037c\3\2\2\2\u037c\u037e\3\2\2\2\u037d\u037b\3\2\2\2\u037e\u037f\7X"+
		"\2\2\u037fe\3\2\2\2\u0380\u0385\5h\65\2\u0381\u0385\5\u00acW\2\u0382\u0385"+
		"\5\u00aeX\2\u0383\u0385\5\u00b0Y\2\u0384\u0380\3\2\2\2\u0384\u0381\3\2"+
		"\2\2\u0384\u0382\3\2\2\2\u0384\u0383\3\2\2\2\u0385g\3\2\2\2\u0386\u038c"+
		"\5j\66\2\u0387\u038c\5\u008eH\2\u0388\u038c\5T+\2\u0389\u038c\5\u00c8"+
		"e\2\u038a\u038c\7[\2\2\u038b\u0386\3\2\2\2\u038b\u0387\3\2\2\2\u038b\u0388"+
		"\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038a\3\2\2\2\u038ci\3\2\2\2\u038d"+
		"\u038f\5l\67\2\u038e\u038d\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2"+
		"\2\2\u0390\u0391\3\2\2\2\u0391\u0393\3\2\2\2\u0392\u0390\3\2\2\2\u0393"+
		"\u0394\5v<\2\u0394\u0395\5n8\2\u0395\u0396\7[\2\2\u0396k\3\2\2\2\u0397"+
		"\u03a0\5\u00e8u\2\u0398\u03a0\7%\2\2\u0399\u03a0\7$\2\2\u039a\u03a0\7"+
		"#\2\2\u039b\u03a0\7(\2\2\u039c\u03a0\7\24\2\2\u039d\u03a0\7\60\2\2\u039e"+
		"\u03a0\7\63\2\2\u039f\u0397\3\2\2\2\u039f\u0398\3\2\2\2\u039f\u0399\3"+
		"\2\2\2\u039f\u039a\3\2\2\2\u039f\u039b\3\2\2\2\u039f\u039c\3\2\2\2\u039f"+
		"\u039d\3\2\2\2\u039f\u039e\3\2\2\2\u03a0m\3\2\2\2\u03a1\u03a6\5p9\2\u03a2"+
		"\u03a3\7\\\2\2\u03a3\u03a5\5p9\2\u03a4\u03a2\3\2\2\2\u03a5\u03a8\3\2\2"+
		"\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7o\3\2\2\2\u03a8\u03a6"+
		"\3\2\2\2\u03a9\u03ac\5r:\2\u03aa\u03ab\7^\2\2\u03ab\u03ad\5t;\2\u03ac"+
		"\u03aa\3\2\2\2\u03ac\u03ad\3\2\2\2\u03adq\3\2\2\2\u03ae\u03b0\7\u0082"+
		"\2\2\u03af\u03b1\5\"\22\2\u03b0\u03af\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1"+
		"s\3\2\2\2\u03b2\u03b5\5\u01c4\u00e3\2\u03b3\u03b5\5\u00fa~\2\u03b4\u03b2"+
		"\3\2\2\2\u03b4\u03b3\3\2\2\2\u03b5u\3\2\2\2\u03b6\u03b9\5x=\2\u03b7\u03b9"+
		"\5z>\2\u03b8\u03b6\3\2\2\2\u03b8\u03b7\3\2\2\2\u03b9w\3\2\2\2\u03ba\u03bd"+
		"\5\b\5\2\u03bb\u03bd\7\5\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bb\3\2\2\2\u03bd"+
		"y\3\2\2\2\u03be\u03c2\5|?\2\u03bf\u03c2\5\u008aF\2\u03c0\u03c2\5\u008c"+
		"G\2\u03c1\u03be\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c0\3\2\2\2\u03c2"+
		"{\3\2\2\2\u03c3\u03c6\5\u0082B\2\u03c4\u03c6\5\u0088E\2\u03c5\u03c3\3"+
		"\2\2\2\u03c5\u03c4\3\2\2\2\u03c6\u03cb\3\2\2\2\u03c7\u03ca\5\u0080A\2"+
		"\u03c8\u03ca\5\u0086D\2\u03c9\u03c7\3\2\2\2\u03c9\u03c8\3\2\2\2\u03ca"+
		"\u03cd\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc}\3\2\2\2"+
		"\u03cd\u03cb\3\2\2\2\u03ce\u03d0\7\u0082\2\2\u03cf\u03d1\5,\27\2\u03d0"+
		"\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03df\3\2\2\2\u03d2\u03d3\5|"+
		"?\2\u03d3\u03d7\7]\2\2\u03d4\u03d6\5\u00e8u\2\u03d5\u03d4\3\2\2\2\u03d6"+
		"\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2"+
		"\2\2\u03d9\u03d7\3\2\2\2\u03da\u03dc\7\u0082\2\2\u03db\u03dd\5,\27\2\u03dc"+
		"\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de\u03ce\3\2"+
		"\2\2\u03de\u03d2\3\2\2\2\u03df\177\3\2\2\2\u03e0\u03e4\7]\2\2\u03e1\u03e3"+
		"\5\u00e8u\2\u03e2\u03e1\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2"+
		"\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03e9"+
		"\7\u0082\2\2\u03e8\u03ea\5,\27\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2"+
		"\2\u03ea\u0081\3\2\2\2\u03eb\u03ed\7\u0082\2\2\u03ec\u03ee\5,\27\2\u03ed"+
		"\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u0083\3\2\2\2\u03ef\u03f0\5~"+
		"@\2\u03f0\u0085\3\2\2\2\u03f1\u03f2\5\u0080A\2\u03f2\u0087\3\2\2\2\u03f3"+
		"\u03f4\5\u0082B\2\u03f4\u0089\3\2\2\2\u03f5\u03f6\7\u0082\2\2\u03f6\u008b"+
		"\3\2\2\2\u03f7\u03f8\5x=\2\u03f8\u03f9\5\"\22\2\u03f9\u0401\3\2\2\2\u03fa"+
		"\u03fb\5|?\2\u03fb\u03fc\5\"\22\2\u03fc\u0401\3\2\2\2\u03fd\u03fe\5\u008a"+
		"F\2\u03fe\u03ff\5\"\22\2\u03ff\u0401\3\2\2\2\u0400\u03f7\3\2\2\2\u0400"+
		"\u03fa\3\2\2\2\u0400\u03fd\3\2\2\2\u0401\u008d\3\2\2\2\u0402\u0404\5\u0090"+
		"I\2\u0403\u0402\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405"+
		"\u0406\3\2\2\2\u0406\u0408\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u0409\5\u0092"+
		"J\2\u0409\u040a\5\u00aaV\2\u040a\u008f\3\2\2\2\u040b\u0416\5\u00e8u\2"+
		"\u040c\u0416\7%\2\2\u040d\u0416\7$\2\2\u040e\u0416\7#\2\2\u040f\u0416"+
		"\7\3\2\2\u0410\u0416\7(\2\2\u0411\u0416\7\24\2\2\u0412\u0416\7,\2\2\u0413"+
		"\u0416\7 \2\2\u0414\u0416\7)\2\2\u0415\u040b\3\2\2\2\u0415\u040c\3\2\2"+
		"\2\u0415\u040d\3\2\2\2\u0415\u040e\3\2\2\2\u0415\u040f\3\2\2\2\u0415\u0410"+
		"\3\2\2\2\u0415\u0411\3\2\2\2\u0415\u0412\3\2\2\2\u0415\u0413\3\2\2\2\u0415"+
		"\u0414\3\2\2\2\u0416\u0091\3\2\2\2\u0417\u0418\5\u0094K\2\u0418\u041a"+
		"\5\u0096L\2\u0419\u041b\5\u00a4S\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2"+
		"\2\2\u041b\u0429\3\2\2\2\u041c\u0420\5Z.\2\u041d\u041f\5\u00e8u\2\u041e"+
		"\u041d\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2"+
		"\2\2\u0421\u0423\3\2\2\2\u0422\u0420\3\2\2\2\u0423\u0424\5\u0094K\2\u0424"+
		"\u0426\5\u0096L\2\u0425\u0427\5\u00a4S\2\u0426\u0425\3\2\2\2\u0426\u0427"+
		"\3\2\2\2\u0427\u0429\3\2\2\2\u0428\u0417\3\2\2\2\u0428\u041c\3\2\2\2\u0429"+
		"\u0093\3\2\2\2\u042a\u042d\5v<\2\u042b\u042d\7\62\2\2\u042c\u042a\3\2"+
		"\2\2\u042c\u042b\3\2\2\2\u042d\u0095\3\2\2\2\u042e\u042f\7\u0082\2\2\u042f"+
		"\u0431\7U\2\2\u0430\u0432\5\u0098M\2\u0431\u0430\3\2\2\2\u0431\u0432\3"+
		"\2\2\2\u0432\u0433\3\2\2\2\u0433\u0435\7V\2\2\u0434\u0436\5\"\22\2\u0435"+
		"\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0097\3\2\2\2\u0437\u0438\5\u009a"+
		"N\2\u0438\u0439\7\\\2\2\u0439\u043a\5\u00a0Q\2\u043a\u043d\3\2\2\2\u043b"+
		"\u043d\5\u00a0Q\2\u043c\u0437\3\2\2\2\u043c\u043b\3\2\2\2\u043d\u0099"+
		"\3\2\2\2\u043e\u0443\5\u009cO\2\u043f\u0440\7\\\2\2\u0440\u0442\5\u009c"+
		"O\2\u0441\u043f\3\2\2\2\u0442\u0445\3\2\2\2\u0443\u0441\3\2\2\2\u0443"+
		"\u0444\3\2\2\2\u0444\u044f\3\2\2\2\u0445\u0443\3\2\2\2\u0446\u044b\5\u00a2"+
		"R\2\u0447\u0448\7\\\2\2\u0448\u044a\5\u009cO\2\u0449\u0447\3\2\2\2\u044a"+
		"\u044d\3\2\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044f\3\2"+
		"\2\2\u044d\u044b\3\2\2\2\u044e\u043e\3\2\2\2\u044e\u0446\3\2\2\2\u044f"+
		"\u009b\3\2\2\2\u0450\u0452\5\u009eP\2\u0451\u0450\3\2\2\2\u0452\u0455"+
		"\3\2\2\2\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0456\3\2\2\2\u0455"+
		"\u0453\3\2\2\2\u0456\u0457\5v<\2\u0457\u0458\5r:\2\u0458\u009d\3\2\2\2"+
		"\u0459\u045c\5\u00e8u\2\u045a\u045c\7\24\2\2\u045b\u0459\3\2\2\2\u045b"+
		"\u045a\3\2\2\2\u045c\u009f\3\2\2\2\u045d\u045f\5\u009eP\2\u045e\u045d"+
		"\3\2\2\2\u045f\u0462\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"\u0463\3\2\2\2\u0462\u0460\3\2\2\2\u0463\u0467\5v<\2\u0464\u0466\5\u00e8"+
		"u\2\u0465\u0464\3\2\2\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0467"+
		"\u0468\3\2\2\2\u0468\u046a\3\2\2\2\u0469\u0467\3\2\2\2\u046a\u046b\7\u0084"+
		"\2\2\u046b\u046c\5r:\2\u046c\u046f\3\2\2\2\u046d\u046f\5\u009cO\2\u046e"+
		"\u0460\3\2\2\2\u046e\u046d\3\2\2\2\u046f\u00a1\3\2\2\2\u0470\u0472\5\u00e8"+
		"u\2\u0471\u0470\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473"+
		"\u0474\3\2\2\2\u0474\u0476\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0479\5v"+
		"<\2\u0477\u0478\7\u0082\2\2\u0478\u047a\7]\2\2\u0479\u0477\3\2\2\2\u0479"+
		"\u047a\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\7-\2\2\u047c\u00a3\3\2"+
		"\2\2\u047d\u047e\7/\2\2\u047e\u047f\5\u00a6T\2\u047f\u00a5\3\2\2\2\u0480"+
		"\u0485\5\u00a8U\2\u0481\u0482\7\\\2\2\u0482\u0484\5\u00a8U\2\u0483\u0481"+
		"\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486"+
		"\u00a7\3\2\2\2\u0487\u0485\3\2\2\2\u0488\u048b\5\22\n\2\u0489\u048b\5"+
		"\36\20\2\u048a\u0488\3\2\2\2\u048a\u0489\3\2\2\2\u048b\u00a9\3\2\2\2\u048c"+
		"\u048f\5\u00fe\u0080\2\u048d\u048f\7[\2\2\u048e\u048c\3\2\2\2\u048e\u048d"+
		"\3\2\2\2\u048f\u00ab\3\2\2\2\u0490\u0491\5\u00fe\u0080\2\u0491\u00ad\3"+
		"\2\2\2\u0492\u0493\7(\2\2\u0493\u0494\5\u00fe\u0080\2\u0494\u00af\3\2"+
		"\2\2\u0495\u0497\5\u00b2Z\2\u0496\u0495\3\2\2\2\u0497\u049a\3\2\2\2\u0498"+
		"\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049b\3\2\2\2\u049a\u0498\3\2"+
		"\2\2\u049b\u049d\5\u00b4[\2\u049c\u049e\5\u00a4S\2\u049d\u049c\3\2\2\2"+
		"\u049d\u049e\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\5\u00b8]\2\u04a0"+
		"\u00b1\3\2\2\2\u04a1\u04a6\5\u00e8u\2\u04a2\u04a6\7%\2\2\u04a3\u04a6\7"+
		"$\2\2\u04a4\u04a6\7#\2\2\u04a5\u04a1\3\2\2\2\u04a5\u04a2\3\2\2\2\u04a5"+
		"\u04a3\3\2\2\2\u04a5\u04a4\3\2\2\2\u04a6\u00b3\3\2\2\2\u04a7\u04a9\5Z"+
		".\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa"+
		"\u04ab\5\u00b6\\\2\u04ab\u04ad\7U\2\2\u04ac\u04ae\5\u0098M\2\u04ad\u04ac"+
		"\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\7V\2\2\u04b0"+
		"\u00b5\3\2\2\2\u04b1\u04b2\7\u0082\2\2\u04b2\u00b7\3\2\2\2\u04b3\u04b5"+
		"\7W\2\2\u04b4\u04b6\5\u00ba^\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2"+
		"\u04b6\u04b8\3\2\2\2\u04b7\u04b9\5\u0100\u0081\2\u04b8\u04b7\3\2\2\2\u04b8"+
		"\u04b9\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\7X\2\2\u04bb\u00b9\3\2"+
		"\2\2\u04bc\u04be\5,\27\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04bf\3\2\2\2\u04bf\u04c0\7-\2\2\u04c0\u04c2\7U\2\2\u04c1\u04c3\5\u01b4"+
		"\u00db\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4"+
		"\u04c5\7V\2\2\u04c5\u04eb\7[\2\2\u04c6\u04c8\5,\27\2\u04c7\u04c6\3\2\2"+
		"\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\7*\2\2\u04ca\u04cc"+
		"\7U\2\2\u04cb\u04cd\5\u01b4\u00db\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd\3"+
		"\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\7V\2\2\u04cf\u04eb\7[\2\2\u04d0"+
		"\u04d1\5<\37\2\u04d1\u04d3\7]\2\2\u04d2\u04d4\5,\27\2\u04d3\u04d2\3\2"+
		"\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\7*\2\2\u04d6"+
		"\u04d8\7U\2\2\u04d7\u04d9\5\u01b4\u00db\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9"+
		"\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\7V\2\2\u04db\u04dc\7[\2\2\u04dc"+
		"\u04eb\3\2\2\2\u04dd\u04de\5\u0186\u00c4\2\u04de\u04e0\7]\2\2\u04df\u04e1"+
		"\5,\27\2\u04e0\u04df\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
		"\u04e3\7*\2\2\u04e3\u04e5\7U\2\2\u04e4\u04e6\5\u01b4\u00db\2\u04e5\u04e4"+
		"\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\7V\2\2\u04e8"+
		"\u04e9\7[\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04bd\3\2\2\2\u04ea\u04c7\3\2"+
		"\2\2\u04ea\u04d0\3\2\2\2\u04ea\u04dd\3\2\2\2\u04eb\u00bb\3\2\2\2\u04ec"+
		"\u04ee\5X-\2\u04ed\u04ec\3\2\2\2\u04ee\u04f1\3\2\2\2\u04ef\u04ed\3\2\2"+
		"\2\u04ef\u04f0\3\2\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f2\u04f3"+
		"\7\22\2\2\u04f3\u04f5\7\u0082\2\2\u04f4\u04f6\5`\61\2\u04f5\u04f4\3\2"+
		"\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\5\u00be`\2\u04f8"+
		"\u00bd\3\2\2\2\u04f9\u04fb\7W\2\2\u04fa\u04fc\5\u00c0a\2\u04fb\u04fa\3"+
		"\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04ff\7\\\2\2\u04fe"+
		"\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0501\3\2\2\2\u0500\u0502\5\u00c6"+
		"d\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503\3\2\2\2\u0503"+
		"\u0504\7X\2\2\u0504\u00bf\3\2\2\2\u0505\u050a\5\u00c2b\2\u0506\u0507\7"+
		"\\\2\2\u0507\u0509\5\u00c2b\2\u0508\u0506\3\2\2\2\u0509\u050c\3\2\2\2"+
		"\u050a\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u00c1\3\2\2\2\u050c\u050a"+
		"\3\2\2\2\u050d\u050f\5\u00c4c\2\u050e\u050d\3\2\2\2\u050f\u0512\3\2\2"+
		"\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513\3\2\2\2\u0512\u0510"+
		"\3\2\2\2\u0513\u0519\7\u0082\2\2\u0514\u0516\7U\2\2\u0515\u0517\5\u01b4"+
		"\u00db\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518\3\2\2\2\u0518"+
		"\u051a\7V\2\2\u0519\u0514\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051c\3\2"+
		"\2\2\u051b\u051d\5d\63\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d"+
		"\u00c3\3\2\2\2\u051e\u051f\5\u00e8u\2\u051f\u00c5\3\2\2\2\u0520\u0524"+
		"\7[\2\2\u0521\u0523\5f\64\2\u0522\u0521\3\2\2\2\u0523\u0526\3\2\2\2\u0524"+
		"\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u00c7\3\2\2\2\u0526\u0524\3\2"+
		"\2\2\u0527\u052a\5\u00caf\2\u0528\u052a\5\u00dco\2\u0529\u0527\3\2\2\2"+
		"\u0529\u0528\3\2\2\2\u052a\u00c9\3\2\2\2\u052b\u052d\5\u00ccg\2\u052c"+
		"\u052b\3\2\2\2\u052d\u0530\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052f\3\2"+
		"\2\2\u052f\u0531\3\2\2\2\u0530\u052e\3\2\2\2\u0531\u0532\7\36\2\2\u0532"+
		"\u0534\7\u0082\2\2\u0533\u0535\5Z.\2\u0534\u0533\3\2\2\2\u0534\u0535\3"+
		"\2\2\2\u0535\u0537\3\2\2\2\u0536\u0538\5\u00ceh\2\u0537\u0536\3\2\2\2"+
		"\u0537\u0538\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a\5\u00d0i\2\u053a"+
		"\u00cb\3\2\2\2\u053b\u0543\5\u00e8u\2\u053c\u0543\7%\2\2\u053d\u0543\7"+
		"$\2\2\u053e\u0543\7#\2\2\u053f\u0543\7\3\2\2\u0540\u0543\7(\2\2\u0541"+
		"\u0543\7)\2\2\u0542\u053b\3\2\2\2\u0542\u053c\3\2\2\2\u0542\u053d\3\2"+
		"\2\2\u0542\u053e\3\2\2\2\u0542\u053f\3\2\2\2\u0542\u0540\3\2\2\2\u0542"+
		"\u0541\3\2\2\2\u0543\u00cd\3\2\2\2\u0544\u0545\7\23\2\2\u0545\u0546\5"+
		"b\62\2\u0546\u00cf\3\2\2\2\u0547\u054b\7W\2\2\u0548\u054a\5\u00d2j\2\u0549"+
		"\u0548\3\2\2\2\u054a\u054d\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054c\3\2"+
		"\2\2\u054c\u054e\3\2\2\2\u054d\u054b\3\2\2\2\u054e\u054f\7X\2\2\u054f"+
		"\u00d1\3\2\2\2\u0550\u0556\5\u00d4k\2\u0551\u0556\5\u00d8m\2\u0552\u0556"+
		"\5T+\2\u0553\u0556\5\u00c8e\2\u0554\u0556\7[\2\2\u0555\u0550\3\2\2\2\u0555"+
		"\u0551\3\2\2\2\u0555\u0552\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0554\3\2"+
		"\2\2\u0556\u00d3\3\2\2\2\u0557\u0559\5\u00d6l\2\u0558\u0557\3\2\2\2\u0559"+
		"\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055d\3\2"+
		"\2\2\u055c\u055a\3\2\2\2\u055d\u055e\5v<\2\u055e\u055f\5n8\2\u055f\u0560"+
		"\7[\2\2\u0560\u00d5\3\2\2\2\u0561\u0566\5\u00e8u\2\u0562\u0566\7%\2\2"+
		"\u0563\u0566\7(\2\2\u0564\u0566\7\24\2\2\u0565\u0561\3\2\2\2\u0565\u0562"+
		"\3\2\2\2\u0565\u0563\3\2\2\2\u0565\u0564\3\2\2\2\u0566\u00d7\3\2\2\2\u0567"+
		"\u0569\5\u00dan\2\u0568\u0567\3\2\2\2\u0569\u056c\3\2\2\2\u056a\u0568"+
		"\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c\u056a\3\2\2\2\u056d"+
		"\u056e\5\u0092J\2\u056e\u056f\5\u00aaV\2\u056f\u00d9\3\2\2\2\u0570\u0577"+
		"\5\u00e8u\2\u0571\u0577\7%\2\2\u0572\u0577\7\3\2\2\u0573\u0577\7\16\2"+
		"\2\u0574\u0577\7(\2\2\u0575\u0577\7)\2\2\u0576\u0570\3\2\2\2\u0576\u0571"+
		"\3\2\2\2\u0576\u0572\3\2\2\2\u0576\u0573\3\2\2\2\u0576\u0574\3\2\2\2\u0576"+
		"\u0575\3\2\2\2\u0577\u00db\3\2\2\2\u0578\u057a\5\u00ccg\2\u0579\u0578"+
		"\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057c\3\2\2\2\u057c"+
		"\u057e\3\2\2\2\u057d\u057b\3\2\2\2\u057e\u057f\7\u0083\2\2\u057f\u0580"+
		"\7\36\2\2\u0580\u0581\7\u0082\2\2\u0581\u0582\5\u00dep\2\u0582\u00dd\3"+
		"\2\2\2\u0583\u0587\7W\2\2\u0584\u0586\5\u00e0q\2\u0585\u0584\3\2\2\2\u0586"+
		"\u0589\3\2\2\2\u0587\u0585\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058a\3\2"+
		"\2\2\u0589\u0587\3\2\2\2\u058a\u058b\7X\2\2\u058b\u00df\3\2\2\2\u058c"+
		"\u0592\5\u00e2r\2\u058d\u0592\5\u00d4k\2\u058e\u0592\5T+\2\u058f\u0592"+
		"\5\u00c8e\2\u0590\u0592\7[\2\2\u0591\u058c\3\2\2\2\u0591\u058d\3\2\2\2"+
		"\u0591\u058e\3\2\2\2\u0591\u058f\3\2\2\2\u0591\u0590\3\2\2\2\u0592\u00e1"+
		"\3\2\2\2\u0593\u0595\5\u00e4s\2\u0594\u0593\3\2\2\2\u0595\u0598\3\2\2"+
		"\2\u0596\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0599\3\2\2\2\u0598\u0596"+
		"\3\2\2\2\u0599\u059a\5v<\2\u059a\u059b\7\u0082\2\2\u059b\u059c\7U\2\2"+
		"\u059c\u059e\7V\2\2\u059d\u059f\5\"\22\2\u059e\u059d\3\2\2\2\u059e\u059f"+
		"\3\2\2\2\u059f\u05a1\3\2\2\2\u05a0\u05a2\5\u00e6t\2\u05a1\u05a0\3\2\2"+
		"\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\7[\2\2\u05a4\u00e3"+
		"\3\2\2\2\u05a5\u05a9\5\u00e8u\2\u05a6\u05a9\7%\2\2\u05a7\u05a9\7\3\2\2"+
		"\u05a8\u05a5\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a8\u05a7\3\2\2\2\u05a9\u00e5"+
		"\3\2\2\2\u05aa\u05ab\7\16\2\2\u05ab\u05ac\5\u00f0y\2\u05ac\u00e7\3\2\2"+
		"\2\u05ad\u05b1\5\u00eav\2\u05ae\u05b1\5\u00f6|\2\u05af\u05b1\5\u00f8}"+
		"\2\u05b0\u05ad\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b0\u05af\3\2\2\2\u05b1\u00e9"+
		"\3\2\2\2\u05b2\u05b3\7\u0083\2\2\u05b3\u05b4\58\35\2\u05b4\u05b6\7U\2"+
		"\2\u05b5\u05b7\5\u00ecw\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7"+
		"\u05b8\3\2\2\2\u05b8\u05b9\7V\2\2\u05b9\u00eb\3\2\2\2\u05ba\u05bf\5\u00ee"+
		"x\2\u05bb\u05bc\7\\\2\2\u05bc\u05be\5\u00eex\2\u05bd\u05bb\3\2\2\2\u05be"+
		"\u05c1\3\2\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u00ed\3\2"+
		"\2\2\u05c1\u05bf\3\2\2\2\u05c2\u05c3\7\u0082\2\2\u05c3\u05c4\7^\2\2\u05c4"+
		"\u05c5\5\u00f0y\2\u05c5\u00ef\3\2\2\2\u05c6\u05ca\5\u01d6\u00ec\2\u05c7"+
		"\u05ca\5\u00f2z\2\u05c8\u05ca\5\u00e8u\2\u05c9\u05c6\3\2\2\2\u05c9\u05c7"+
		"\3\2\2\2\u05c9\u05c8\3\2\2\2\u05ca\u00f1\3\2\2\2\u05cb\u05cd\7W\2\2\u05cc"+
		"\u05ce\5\u00f4{\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0"+
		"\3\2\2\2\u05cf\u05d1\7\\\2\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1"+
		"\u05d2\3\2\2\2\u05d2\u05d3\7X\2\2\u05d3\u00f3\3\2\2\2\u05d4\u05d9\5\u00f0"+
		"y\2\u05d5\u05d6\7\\\2\2\u05d6\u05d8\5\u00f0y\2\u05d7\u05d5\3\2\2\2\u05d8"+
		"\u05db\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u00f5\3\2"+
		"\2\2\u05db\u05d9\3\2\2\2\u05dc\u05dd\7\u0083\2\2\u05dd\u05de\58\35\2\u05de"+
		"\u00f7\3\2\2\2\u05df\u05e0\7\u0083\2\2\u05e0\u05e1\58\35\2\u05e1\u05e2"+
		"\7U\2\2\u05e2\u05e3\5\u00f0y\2\u05e3\u05e4\7V\2\2\u05e4\u00f9\3\2\2\2"+
		"\u05e5\u05e7\7W\2\2\u05e6\u05e8\5\u00fc\177\2\u05e7\u05e6\3\2\2\2\u05e7"+
		"\u05e8\3\2\2\2\u05e8\u05ea\3\2\2\2\u05e9\u05eb\7\\\2\2\u05ea\u05e9\3\2"+
		"\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\7X\2\2\u05ed"+
		"\u00fb\3\2\2\2\u05ee\u05f3\5t;\2\u05ef\u05f0\7\\\2\2\u05f0\u05f2\5t;\2"+
		"\u05f1\u05ef\3\2\2\2\u05f2\u05f5\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3\u05f4"+
		"\3\2\2\2\u05f4\u00fd\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f6\u05f8\7W\2\2\u05f7"+
		"\u05f9\5\u0100\u0081\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa"+
		"\3\2\2\2\u05fa\u05fb\7X\2\2\u05fb\u00ff\3\2\2\2\u05fc\u0600\5\u0102\u0082"+
		"\2\u05fd\u05ff\5\u0102\u0082\2\u05fe\u05fd\3\2\2\2\u05ff\u0602\3\2\2\2"+
		"\u0600\u05fe\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0101\3\2\2\2\u0602\u0600"+
		"\3\2\2\2\u0603\u0607\5\u0104\u0083\2\u0604\u0607\5T+\2\u0605\u0607\5\u0108"+
		"\u0085\2\u0606\u0603\3\2\2\2\u0606\u0604\3\2\2\2\u0606\u0605\3\2\2\2\u0607"+
		"\u0103\3\2\2\2\u0608\u0609\5\u0106\u0084\2\u0609\u060a\7[\2\2\u060a\u0105"+
		"\3\2\2\2\u060b\u060d\5\u009eP\2\u060c\u060b\3\2\2\2\u060d\u0610\3\2\2"+
		"\2\u060e\u060c\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0611\3\2\2\2\u0610\u060e"+
		"\3\2\2\2\u0611\u0612\5v<\2\u0612\u0613\5n8\2\u0613\u0107\3\2\2\2\u0614"+
		"\u061b\5\u010c\u0087\2\u0615\u061b\5\u0110\u0089\2\u0616\u061b\5\u0118"+
		"\u008d\2\u0617\u061b\5\u011a\u008e\2\u0618\u061b\5\u012c\u0097\2\u0619"+
		"\u061b\5\u0132\u009a\2\u061a\u0614\3\2\2\2\u061a\u0615\3\2\2\2\u061a\u0616"+
		"\3\2\2\2\u061a\u0617\3\2\2\2\u061a\u0618\3\2\2\2\u061a\u0619\3\2\2\2\u061b"+
		"\u0109\3\2\2\2\u061c\u0622\5\u010c\u0087\2\u061d\u0622\5\u0112\u008a\2"+
		"\u061e\u0622\5\u011c\u008f\2\u061f\u0622\5\u012e\u0098\2\u0620\u0622\5"+
		"\u0134\u009b\2\u0621\u061c\3\2\2\2\u0621\u061d\3\2\2\2\u0621\u061e\3\2"+
		"\2\2\u0621\u061f\3\2\2\2\u0621\u0620\3\2\2\2\u0622\u010b\3\2\2\2\u0623"+
		"\u0631\5\u00fe\u0080\2\u0624\u0631\5\u010e\u0088\2\u0625\u0631\5\u0114"+
		"\u008b\2\u0626\u0631\5\u011e\u0090\2\u0627\u0631\5\u0120\u0091\2\u0628"+
		"\u0631\5\u0130\u0099\2\u0629\u0631\5\u0144\u00a3\2\u062a\u0631\5\u0146"+
		"\u00a4\2\u062b\u0631\5\u0148\u00a5\2\u062c\u0631\5\u014c\u00a7\2\u062d"+
		"\u0631\5\u014a\u00a6\2\u062e\u0631\5\u014e\u00a8\2\u062f\u0631\5\u0162"+
		"\u00b2\2\u0630\u0623\3\2\2\2\u0630\u0624\3\2\2\2\u0630\u0625\3\2\2\2\u0630"+
		"\u0626\3\2\2\2\u0630\u0627\3\2\2\2\u0630\u0628\3\2\2\2\u0630\u0629\3\2"+
		"\2\2\u0630\u062a\3\2\2\2\u0630\u062b\3\2\2\2\u0630\u062c\3\2\2\2\u0630"+
		"\u062d\3\2\2\2\u0630\u062e\3\2\2\2\u0630\u062f\3\2\2\2\u0631\u010d\3\2"+
		"\2\2\u0632\u0633\7[\2\2\u0633\u010f\3\2\2\2\u0634\u0635\7\u0082\2\2\u0635"+
		"\u0636\7d\2\2\u0636\u0637\5\u0108\u0085\2\u0637\u0111\3\2\2\2\u0638\u0639"+
		"\7\u0082\2\2\u0639\u063a\7d\2\2\u063a\u063b\5\u010a\u0086\2\u063b\u0113"+
		"\3\2\2\2\u063c\u063d\5\u0116\u008c\2\u063d\u063e\7[\2\2\u063e\u0115\3"+
		"\2\2\2\u063f\u0647\5\u01d0\u00e9\2\u0640\u0647\5\u01ee\u00f8\2\u0641\u0647"+
		"\5\u01f0\u00f9\2\u0642\u0647\5\u01f6\u00fc\2\u0643\u0647\5\u01fa\u00fe"+
		"\2\u0644\u0647\5\u01ae\u00d8\2\u0645\u0647\5\u019a\u00ce\2\u0646\u063f"+
		"\3\2\2\2\u0646\u0640\3\2\2\2\u0646\u0641\3\2\2\2\u0646\u0642\3\2\2\2\u0646"+
		"\u0643\3\2\2\2\u0646\u0644\3\2\2\2\u0646\u0645\3\2\2\2\u0647\u0117\3\2"+
		"\2\2\u0648\u0649\7\30\2\2\u0649\u064a\7U\2\2\u064a\u064b\5\u01c4\u00e3"+
		"\2\u064b\u064c\7V\2\2\u064c\u064d\5\u0108\u0085\2\u064d\u0119\3\2\2\2"+
		"\u064e\u064f\7\30\2\2\u064f\u0650\7U\2\2\u0650\u0651\5\u01c4\u00e3\2\u0651"+
		"\u0652\7V\2\2\u0652\u0653\5\u010a\u0086\2\u0653\u0654\7\21\2\2\u0654\u0655"+
		"\5\u0108\u0085\2\u0655\u011b\3\2\2\2\u0656\u0657\7\30\2\2\u0657\u0658"+
		"\7U\2\2\u0658\u0659\5\u01c4\u00e3\2\u0659\u065a\7V\2\2\u065a\u065b\5\u010a"+
		"\u0086\2\u065b\u065c\7\21\2\2\u065c\u065d\5\u010a\u0086\2\u065d\u011d"+
		"\3\2\2\2\u065e\u065f\7\4\2\2\u065f\u0660\5\u01c4\u00e3\2\u0660\u0661\7"+
		"[\2\2\u0661\u0669\3\2\2\2\u0662\u0663\7\4\2\2\u0663\u0664\5\u01c4\u00e3"+
		"\2\u0664\u0665\7d\2\2\u0665\u0666\5\u01c4\u00e3\2\u0666\u0667\7[\2\2\u0667"+
		"\u0669\3\2\2\2\u0668\u065e\3\2\2\2\u0668\u0662\3\2\2\2\u0669\u011f\3\2"+
		"\2\2\u066a\u066b\7+\2\2\u066b\u066c\7U\2\2\u066c\u066d\5\u01c4\u00e3\2"+
		"\u066d\u066e\7V\2\2\u066e\u066f\5\u0122\u0092\2\u066f\u0121\3\2\2\2\u0670"+
		"\u0674\7W\2\2\u0671\u0673\5\u0124\u0093\2\u0672\u0671\3\2\2\2\u0673\u0676"+
		"\3\2\2\2\u0674\u0672\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u067a\3\2\2\2\u0676"+
		"\u0674\3\2\2\2\u0677\u0679\5\u0128\u0095\2\u0678\u0677\3\2\2\2\u0679\u067c"+
		"\3\2\2\2\u067a\u0678\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067d\3\2\2\2\u067c"+
		"\u067a\3\2\2\2\u067d\u067e\7X\2\2\u067e\u0123\3\2\2\2\u067f\u0680\5\u0126"+
		"\u0094\2\u0680\u0681\5\u0100\u0081\2\u0681\u0125\3\2\2\2\u0682\u0686\5"+
		"\u0128\u0095\2\u0683\u0685\5\u0128\u0095\2\u0684\u0683\3\2\2\2\u0685\u0688"+
		"\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u0127\3\2\2\2\u0688"+
		"\u0686\3\2\2\2\u0689\u068a\7\b\2\2\u068a\u068b\5\u01c2\u00e2\2\u068b\u068c"+
		"\7d\2\2\u068c\u0694\3\2\2\2\u068d\u068e\7\b\2\2\u068e\u068f\5\u012a\u0096"+
		"\2\u068f\u0690\7d\2\2\u0690\u0694\3\2\2\2\u0691\u0692\7\16\2\2\u0692\u0694"+
		"\7d\2\2\u0693\u0689\3\2\2\2\u0693\u068d\3\2\2\2\u0693\u0691\3\2\2\2\u0694"+
		"\u0129\3\2\2\2\u0695\u0696\7\u0082\2\2\u0696\u012b\3\2\2\2\u0697\u0698"+
		"\7\64\2\2\u0698\u0699\7U\2\2\u0699\u069a\5\u01c4\u00e3\2\u069a\u069b\7"+
		"V\2\2\u069b\u069c\5\u0108\u0085\2\u069c\u012d\3\2\2\2\u069d\u069e\7\64"+
		"\2\2\u069e\u069f\7U\2\2\u069f\u06a0\5\u01c4\u00e3\2\u06a0\u06a1\7V\2\2"+
		"\u06a1\u06a2\5\u010a\u0086\2\u06a2\u012f\3\2\2\2\u06a3\u06a4\7\17\2\2"+
		"\u06a4\u06a5\5\u0108\u0085\2\u06a5\u06a6\7\64\2\2\u06a6\u06a7\7U\2\2\u06a7"+
		"\u06a8\5\u01c4\u00e3\2\u06a8\u06a9\7V\2\2\u06a9\u06aa\7[\2\2\u06aa\u0131"+
		"\3\2\2\2\u06ab\u06ae\5\u0136\u009c\2\u06ac\u06ae\5\u0140\u00a1\2\u06ad"+
		"\u06ab\3\2\2\2\u06ad\u06ac\3\2\2\2\u06ae\u0133\3\2\2\2\u06af\u06b2\5\u0138"+
		"\u009d\2\u06b0\u06b2\5\u0142\u00a2\2\u06b1\u06af\3\2\2\2\u06b1\u06b0\3"+
		"\2\2\2\u06b2\u0135\3\2\2\2\u06b3\u06b4\7\27\2\2\u06b4\u06b6\7U\2\2\u06b5"+
		"\u06b7\5\u013a\u009e\2\u06b6\u06b5\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b8"+
		"\3\2\2\2\u06b8\u06ba\7[\2\2\u06b9\u06bb\5\u01c4\u00e3\2\u06ba\u06b9\3"+
		"\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06be\7[\2\2\u06bd"+
		"\u06bf\5\u013c\u009f\2\u06be\u06bd\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c0"+
		"\3\2\2\2\u06c0\u06c1\7V\2\2\u06c1\u06c2\5\u0108\u0085\2\u06c2\u0137\3"+
		"\2\2\2\u06c3\u06c4\7\27\2\2\u06c4\u06c6\7U\2\2\u06c5\u06c7\5\u013a\u009e"+
		"\2\u06c6\u06c5\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06ca"+
		"\7[\2\2\u06c9\u06cb\5\u01c4\u00e3\2\u06ca\u06c9\3\2\2\2\u06ca\u06cb\3"+
		"\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06ce\7[\2\2\u06cd\u06cf\5\u013c\u009f"+
		"\2\u06ce\u06cd\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d1"+
		"\7V\2\2\u06d1\u06d2\5\u010a\u0086\2\u06d2\u0139\3\2\2\2\u06d3\u06d6\5"+
		"\u013e\u00a0\2\u06d4\u06d6\5\u0106\u0084\2\u06d5\u06d3\3\2\2\2\u06d5\u06d4"+
		"\3\2\2\2\u06d6\u013b\3\2\2\2\u06d7\u06d8\5\u013e\u00a0\2\u06d8\u013d\3"+
		"\2\2\2\u06d9\u06de\5\u0116\u008c\2\u06da\u06db\7\\\2\2\u06db\u06dd\5\u0116"+
		"\u008c\2\u06dc\u06da\3\2\2\2\u06dd\u06e0\3\2\2\2\u06de\u06dc\3\2\2\2\u06de"+
		"\u06df\3\2\2\2\u06df\u013f\3\2\2\2\u06e0\u06de\3\2\2\2\u06e1\u06e2\7\27"+
		"\2\2\u06e2\u06e6\7U\2\2\u06e3\u06e5\5\u009eP\2\u06e4\u06e3\3\2\2\2\u06e5"+
		"\u06e8\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e9\3\2"+
		"\2\2\u06e8\u06e6\3\2\2\2\u06e9\u06ea\5v<\2\u06ea\u06eb\5r:\2\u06eb\u06ec"+
		"\7d\2\2\u06ec\u06ed\5\u01c4\u00e3\2\u06ed\u06ee\7V\2\2\u06ee\u06ef\5\u0108"+
		"\u0085\2\u06ef\u0141\3\2\2\2\u06f0\u06f1\7\27\2\2\u06f1\u06f5\7U\2\2\u06f2"+
		"\u06f4\5\u009eP\2\u06f3\u06f2\3\2\2\2\u06f4\u06f7\3\2\2\2\u06f5\u06f3"+
		"\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f8\3\2\2\2\u06f7\u06f5\3\2\2\2\u06f8"+
		"\u06f9\5v<\2\u06f9\u06fa\5r:\2\u06fa\u06fb\7d\2\2\u06fb\u06fc\5\u01c4"+
		"\u00e3\2\u06fc\u06fd\7V\2\2\u06fd\u06fe\5\u010a\u0086\2\u06fe\u0143\3"+
		"\2\2\2\u06ff\u0701\7\6\2\2\u0700\u0702\7\u0082\2\2\u0701\u0700\3\2\2\2"+
		"\u0701\u0702\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0704\7[\2\2\u0704\u0145"+
		"\3\2\2\2\u0705\u0707\7\r\2\2\u0706\u0708\7\u0082\2\2\u0707\u0706\3\2\2"+
		"\2\u0707\u0708\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070a\7[\2\2\u070a\u0147"+
		"\3\2\2\2\u070b\u070d\7&\2\2\u070c\u070e\5\u01c4\u00e3\2\u070d\u070c\3"+
		"\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0710\7[\2\2\u0710"+
		"\u0149\3\2\2\2\u0711\u0712\7.\2\2\u0712\u0713\5\u01c4\u00e3\2\u0713\u0714"+
		"\7[\2\2\u0714\u014b\3\2\2\2\u0715\u0716\7,\2\2\u0716\u0717\7U\2\2\u0717"+
		"\u0718\5\u01c4\u00e3\2\u0718\u0719\7V\2\2\u0719\u071a\5\u00fe\u0080\2"+
		"\u071a\u014d\3\2\2\2\u071b\u071c\7\61\2\2\u071c\u071d\5\u00fe\u0080\2"+
		"\u071d\u071e\5\u0150\u00a9\2\u071e\u0728\3\2\2\2\u071f\u0720\7\61\2\2"+
		"\u0720\u0722\5\u00fe\u0080\2\u0721\u0723\5\u0150\u00a9\2\u0722\u0721\3"+
		"\2\2\2\u0722\u0723\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0725\5\u0158\u00ad"+
		"\2\u0725\u0728\3\2\2\2\u0726\u0728\5\u015a\u00ae\2\u0727\u071b\3\2\2\2"+
		"\u0727\u071f\3\2\2\2\u0727\u0726\3\2\2\2\u0728\u014f\3\2\2\2\u0729\u072d"+
		"\5\u0152\u00aa\2\u072a\u072c\5\u0152\u00aa\2\u072b\u072a\3\2\2\2\u072c"+
		"\u072f\3\2\2\2\u072d\u072b\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u0151\3\2"+
		"\2\2\u072f\u072d\3\2\2\2\u0730\u0731\7\t\2\2\u0731\u0732\7U\2\2\u0732"+
		"\u0733\5\u0154\u00ab\2\u0733\u0734\7V\2\2\u0734\u0735\5\u00fe\u0080\2"+
		"\u0735\u0153\3\2\2\2\u0736\u0738\5\u009eP\2\u0737\u0736\3\2\2\2\u0738"+
		"\u073b\3\2\2\2\u0739\u0737\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073c\3\2"+
		"\2\2\u073b\u0739\3\2\2\2\u073c\u073d\5\u0156\u00ac\2\u073d\u073e\5r:\2"+
		"\u073e\u0155\3\2\2\2\u073f\u0744\5~@\2\u0740\u0741\7r\2\2\u0741\u0743"+
		"\5\22\n\2\u0742\u0740\3\2\2\2\u0743\u0746\3\2\2\2\u0744\u0742\3\2\2\2"+
		"\u0744\u0745\3\2\2\2\u0745\u0157\3\2\2\2\u0746\u0744\3\2\2\2\u0747\u0748"+
		"\7\25\2\2\u0748\u0749\5\u00fe\u0080\2\u0749\u0159\3\2\2\2\u074a\u074b"+
		"\7\61\2\2\u074b\u074c\5\u015c\u00af\2\u074c\u074e\5\u00fe\u0080\2\u074d"+
		"\u074f\5\u0150\u00a9\2\u074e\u074d\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u0751"+
		"\3\2\2\2\u0750\u0752\5\u0158\u00ad\2\u0751\u0750\3\2\2\2\u0751\u0752\3"+
		"\2\2\2\u0752\u015b\3\2\2\2\u0753\u0754\7U\2\2\u0754\u0756\5\u015e\u00b0"+
		"\2\u0755\u0757\7[\2\2\u0756\u0755\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0758"+
		"\3\2\2\2\u0758\u0759\7V\2\2\u0759\u015d\3\2\2\2\u075a\u075f\5\u0160\u00b1"+
		"\2\u075b\u075c\7[\2\2\u075c\u075e\5\u0160\u00b1\2\u075d\u075b\3\2\2\2"+
		"\u075e\u0761\3\2\2\2\u075f\u075d\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u015f"+
		"\3\2\2\2\u0761\u075f\3\2\2\2\u0762\u0764\5\u009eP\2\u0763\u0762\3\2\2"+
		"\2\u0764\u0767\3\2\2\2\u0765\u0763\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0768"+
		"\3\2\2\2\u0767\u0765\3\2\2\2\u0768\u0769\5v<\2\u0769\u076a\5r:\2\u076a"+
		"\u076b\7^\2\2\u076b\u076c\5\u01c4\u00e3\2\u076c\u0161\3\2\2\2\u076d\u076e"+
		"\7\65\2\2\u076e\u076f\5\u0164\u00b3\2\u076f\u0163\3\2\2\2\u0770\u0780"+
		"\5\u0166\u00b4\2\u0771\u0780\5\u0168\u00b5\2\u0772\u0780\5\u016a\u00b6"+
		"\2\u0773\u0780\5\u016c\u00b7\2\u0774\u0780\5\u016e\u00b8\2\u0775\u0780"+
		"\5\u0170\u00b9\2\u0776\u0780\5\u0172\u00ba\2\u0777\u0780\5\u0174\u00bb"+
		"\2\u0778\u0780\5\u0176\u00bc\2\u0779\u0780\5\u0178\u00bd\2\u077a\u0780"+
		"\5\u017a\u00be\2\u077b\u0780\5\u017c\u00bf\2\u077c\u0780\5\u017e\u00c0"+
		"\2\u077d\u0780\5\u0180\u00c1\2\u077e\u0780\5\u0182\u00c2\2\u077f\u0770"+
		"\3\2\2\2\u077f\u0771\3\2\2\2\u077f\u0772\3\2\2\2\u077f\u0773\3\2\2\2\u077f"+
		"\u0774\3\2\2\2\u077f\u0775\3\2\2\2\u077f\u0776\3\2\2\2\u077f\u0777\3\2"+
		"\2\2\u077f\u0778\3\2\2\2\u077f\u0779\3\2\2\2\u077f\u077a\3\2\2\2\u077f"+
		"\u077b\3\2\2\2\u077f\u077c\3\2\2\2\u077f\u077d\3\2\2\2\u077f\u077e\3\2"+
		"\2\2\u0780\u0165\3\2\2\2\u0781\u078f\7\66\2\2\u0782\u0783\7\30\2\2\u0783"+
		"\u0784\7U\2\2\u0784\u0785\5\u01c4\u00e3\2\u0785\u0786\7V\2\2\u0786\u078e"+
		"\3\2\2\2\u0787\u0788\7M\2\2\u0788\u0789\7U\2\2\u0789\u078a\5\u01c4\u00e3"+
		"\2\u078a\u078b\7V\2\2\u078b\u078e\3\2\2\2\u078c\u078e\5\u0184\u00c3\2"+
		"\u078d\u0782\3\2\2\2\u078d\u0787\3\2\2\2\u078d\u078c\3\2\2\2\u078e\u0791"+
		"\3\2\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\3\2\2\2\u0791"+
		"\u078f\3\2\2\2\u0792\u0793\5\u00fe\u0080\2\u0793\u0167\3\2\2\2\u0794\u07a2"+
		"\7\67\2\2\u0795\u0796\7\30\2\2\u0796\u0797\7U\2\2\u0797\u0798\5\u01c4"+
		"\u00e3\2\u0798\u0799\7V\2\2\u0799\u07a1\3\2\2\2\u079a\u079b\7M\2\2\u079b"+
		"\u079c\7U\2\2\u079c\u079d\5\u01c4\u00e3\2\u079d\u079e\7V\2\2\u079e\u07a1"+
		"\3\2\2\2\u079f\u07a1\5\u0184\u00c3\2\u07a0\u0795\3\2\2\2\u07a0\u079a\3"+
		"\2\2\2\u07a0\u079f\3\2\2\2\u07a1\u07a4\3\2\2\2\u07a2\u07a0\3\2\2\2\u07a2"+
		"\u07a3\3\2\2\2\u07a3\u07a5\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a5\u07a6\5\u00fe"+
		"\u0080\2\u07a6\u0169\3\2\2\2\u07a7\u07b5\78\2\2\u07a8\u07a9\7\30\2\2\u07a9"+
		"\u07aa\7U\2\2\u07aa\u07ab\5\u01c4\u00e3\2\u07ab\u07ac\7V\2\2\u07ac\u07b4"+
		"\3\2\2\2\u07ad\u07ae\7M\2\2\u07ae\u07af\7U\2\2\u07af\u07b0\5\u01c4\u00e3"+
		"\2\u07b0\u07b1\7V\2\2\u07b1\u07b4\3\2\2\2\u07b2\u07b4\5\u0184\u00c3\2"+
		"\u07b3\u07a8\3\2\2\2\u07b3\u07ad\3\2\2\2\u07b3\u07b2\3\2\2\2\u07b4\u07b7"+
		"\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b8\3\2\2\2\u07b7"+
		"\u07b5\3\2\2\2\u07b8\u07b9\5\u00fe\u0080\2\u07b9\u016b\3\2\2\2\u07ba\u07c8"+
		"\7\67\2\2\u07bb\u07bc\7\30\2\2\u07bc\u07bd\7U\2\2\u07bd\u07be\5\u01c4"+
		"\u00e3\2\u07be\u07bf\7V\2\2\u07bf\u07c7\3\2\2\2\u07c0\u07c1\7M\2\2\u07c1"+
		"\u07c2\7U\2\2\u07c2\u07c3\5\u01c4\u00e3\2\u07c3\u07c4\7V\2\2\u07c4\u07c7"+
		"\3\2\2\2\u07c5\u07c7\5\u0184\u00c3\2\u07c6\u07bb\3\2\2\2\u07c6\u07c0\3"+
		"\2\2\2\u07c6\u07c5\3\2\2\2\u07c7\u07ca\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c8"+
		"\u07c9\3\2\2\2\u07c9\u07cb\3\2\2\2\u07ca\u07c8\3\2\2\2\u07cb\u07cc\5\u00fe"+
		"\u0080\2\u07cc\u016d\3\2\2\2\u07cd\u07db\7\27\2\2\u07ce\u07cf\7\30\2\2"+
		"\u07cf\u07d0\7U\2\2\u07d0\u07d1\5\u01c4\u00e3\2\u07d1\u07d2\7V\2\2\u07d2"+
		"\u07da\3\2\2\2\u07d3\u07d4\7M\2\2\u07d4\u07d5\7U\2\2\u07d5\u07d6\5\u01c4"+
		"\u00e3\2\u07d6\u07d7\7V\2\2\u07d7\u07da\3\2\2\2\u07d8\u07da\5\u0184\u00c3"+
		"\2\u07d9\u07ce\3\2\2\2\u07d9\u07d3\3\2\2\2\u07d9\u07d8\3\2\2\2\u07da\u07dd"+
		"\3\2\2\2\u07db\u07d9\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07de\3\2\2\2\u07dd"+
		"\u07db\3\2\2\2\u07de\u07df\5\u00fe\u0080\2\u07df\u016f\3\2\2\2\u07e0\u07e4"+
		"\7>\2\2\u07e1\u07e3\7\66\2\2\u07e2\u07e1\3\2\2\2\u07e3\u07e6\3\2\2\2\u07e4"+
		"\u07e2\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07f2\3\2\2\2\u07e6\u07e4\3\2"+
		"\2\2\u07e7\u07e8\7\30\2\2\u07e8\u07e9\7U\2\2\u07e9\u07ea\5\u01c4\u00e3"+
		"\2\u07ea\u07eb\7V\2\2\u07eb\u07f3\3\2\2\2\u07ec\u07ed\7M\2\2\u07ed\u07ee"+
		"\7U\2\2\u07ee\u07ef\5\u01c4\u00e3\2\u07ef\u07f0\7V\2\2\u07f0\u07f3\3\2"+
		"\2\2\u07f1\u07f3\5\u0184\u00c3\2\u07f2\u07e7\3\2\2\2\u07f2\u07ec\3\2\2"+
		"\2\u07f2\u07f1\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f5\5\u00fe\u0080\2"+
		"\u07f5\u0171\3\2\2\2\u07f6\u0804\7D\2\2\u07f7\u07f8\7\30\2\2\u07f8\u07f9"+
		"\7U\2\2\u07f9\u07fa\5\u01c4\u00e3\2\u07fa\u07fb\7V\2\2\u07fb\u0803\3\2"+
		"\2\2\u07fc\u07fd\7M\2\2\u07fd\u07fe\7U\2\2\u07fe\u07ff\5\u01c4\u00e3\2"+
		"\u07ff\u0800\7V\2\2\u0800\u0803\3\2\2\2\u0801\u0803\5\u0184\u00c3\2\u0802"+
		"\u07f7\3\2\2\2\u0802\u07fc\3\2\2\2\u0802\u0801\3\2\2\2\u0803\u0806\3\2"+
		"\2\2\u0804\u0802\3\2\2\2\u0804\u0805\3\2\2\2\u0805\u0807\3\2\2\2\u0806"+
		"\u0804\3\2\2\2\u0807\u0808\5\u00fe\u0080\2\u0808\u0173\3\2\2\2\u0809\u080a"+
		"\7?\2\2\u080a\u080b\5\u00fe\u0080\2\u080b\u0175\3\2\2\2\u080c\u080d\7"+
		"F\2\2\u080d\u080e\5\u00fe\u0080\2\u080e\u0177\3\2\2\2\u080f\u0810\7G\2"+
		"\2\u0810\u0811\5\u00fe\u0080\2\u0811\u0179\3\2\2\2\u0812\u0813\7H\2\2"+
		"\u0813\u0814\5\u00fe\u0080\2\u0814\u017b\3\2\2\2\u0815\u0816\7I\2\2\u0816"+
		"\u0817\5\u00fe\u0080\2\u0817\u017d\3\2\2\2\u0818\u0819\7K\2\2\u0819\u017f"+
		"\3\2\2\2\u081a\u081b\7J\2\2\u081b\u0181\3\2\2\2\u081c\u081d\7C\2\2\u081d"+
		"\u081e\5\u00fe\u0080\2\u081e\u0183\3\2\2\2\u081f\u0820\7\u0088\2\2\u0820"+
		"\u0185\3\2\2\2\u0821\u0824\5\u0194\u00cb\2\u0822\u0824\5\u01bc\u00df\2"+
		"\u0823\u0821\3\2\2\2\u0823\u0822\3\2\2\2\u0824\u0828\3\2\2\2\u0825\u0827"+
		"\5\u018e\u00c8\2\u0826\u0825\3\2\2\2\u0827\u082a\3\2\2\2\u0828\u0826\3"+
		"\2\2\2\u0828\u0829\3\2\2\2\u0829\u0187\3\2\2\2\u082a\u0828\3\2\2\2\u082b"+
		"\u0849\5\2\2\2\u082c\u0831\58\35\2\u082d\u082e\7Y\2\2\u082e\u0830\7Z\2"+
		"\2\u082f\u082d\3\2\2\2\u0830\u0833\3\2\2\2\u0831\u082f\3\2\2\2\u0831\u0832"+
		"\3\2\2\2\u0832\u0834\3\2\2\2\u0833\u0831\3\2\2\2\u0834\u0835\7]\2\2\u0835"+
		"\u0836\7\13\2\2\u0836\u0849\3\2\2\2\u0837\u0838\7\62\2\2\u0838\u0839\7"+
		"]\2\2\u0839\u0849\7\13\2\2\u083a\u0849\7-\2\2\u083b\u083c\58\35\2\u083c"+
		"\u083d\7]\2\2\u083d\u083e\7-\2\2\u083e\u0849\3\2\2\2\u083f\u0840\7U\2"+
		"\2\u0840\u0841\5\u01c4\u00e3\2\u0841\u0842\7V\2\2\u0842\u0849\3\2\2\2"+
		"\u0843\u0849\5\u019a\u00ce\2\u0844\u0849\5\u01a2\u00d2\2\u0845\u0849\5"+
		"\u01a8\u00d5\2\u0846\u0849\5\u01ae\u00d8\2\u0847\u0849\5\u01b6\u00dc\2"+
		"\u0848\u082b\3\2\2\2\u0848\u082c\3\2\2\2\u0848\u0837\3\2\2\2\u0848\u083a"+
		"\3\2\2\2\u0848\u083b\3\2\2\2\u0848\u083f\3\2\2\2\u0848\u0843\3\2\2\2\u0848"+
		"\u0844\3\2\2\2\u0848\u0845\3\2\2\2\u0848\u0846\3\2\2\2\u0848\u0847\3\2"+
		"\2\2\u0849\u0189\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u018b\3\2\2\2\u084c"+
		"\u0869\5\2\2\2\u084d\u0852\58\35\2\u084e\u084f\7Y\2\2\u084f\u0851\7Z\2"+
		"\2\u0850\u084e\3\2\2\2\u0851\u0854\3\2\2\2\u0852\u0850\3\2\2\2\u0852\u0853"+
		"\3\2\2\2\u0853\u0855\3\2\2\2\u0854\u0852\3\2\2\2\u0855\u0856\7]\2\2\u0856"+
		"\u0857\7\13\2\2\u0857\u0869\3\2\2\2\u0858\u0859\7\62\2\2\u0859\u085a\7"+
		"]\2\2\u085a\u0869\7\13\2\2\u085b\u0869\7-\2\2\u085c\u085d\58\35\2\u085d"+
		"\u085e\7]\2\2\u085e\u085f\7-\2\2\u085f\u0869\3\2\2\2\u0860\u0861\7U\2"+
		"\2\u0861\u0862\5\u01c4\u00e3\2\u0862\u0863\7V\2\2\u0863\u0869\3\2\2\2"+
		"\u0864\u0869\5\u019a\u00ce\2\u0865\u0869\5\u01a2\u00d2\2\u0866\u0869\5"+
		"\u01ae\u00d8\2\u0867\u0869\5\u01b6\u00dc\2\u0868\u084c\3\2\2\2\u0868\u084d"+
		"\3\2\2\2\u0868\u0858\3\2\2\2\u0868\u085b\3\2\2\2\u0868\u085c\3\2\2\2\u0868"+
		"\u0860\3\2\2\2\u0868\u0864\3\2\2\2\u0868\u0865\3\2\2\2\u0868\u0866\3\2"+
		"\2\2\u0868\u0867\3\2\2\2\u0869\u018d\3\2\2\2\u086a\u0870\5\u019c\u00cf"+
		"\2\u086b\u0870\5\u01a4\u00d3\2\u086c\u0870\5\u01aa\u00d6\2\u086d\u0870"+
		"\5\u01b0\u00d9\2\u086e\u0870\5\u01b8\u00dd\2\u086f\u086a\3\2\2\2\u086f"+
		"\u086b\3\2\2\2\u086f\u086c\3\2\2\2\u086f\u086d\3\2\2\2\u086f\u086e\3\2"+
		"\2\2\u0870\u018f\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0191\3\2\2\2\u0873"+
		"\u0878\5\u019c\u00cf\2\u0874\u0878\5\u01a4\u00d3\2\u0875\u0878\5\u01b0"+
		"\u00d9\2\u0876\u0878\5\u01b8\u00dd\2\u0877\u0873\3\2\2\2\u0877\u0874\3"+
		"\2\2\2\u0877\u0875\3\2\2\2\u0877\u0876\3\2\2\2\u0878\u0193\3\2\2\2\u0879"+
		"\u08a2\5\2\2\2\u087a\u087f\58\35\2\u087b\u087c\7Y\2\2\u087c\u087e\7Z\2"+
		"\2\u087d\u087b\3\2\2\2\u087e\u0881\3\2\2\2\u087f\u087d\3\2\2\2\u087f\u0880"+
		"\3\2\2\2\u0880\u0882\3\2\2\2\u0881\u087f\3\2\2\2\u0882\u0883\7]\2\2\u0883"+
		"\u0884\7\13\2\2\u0884\u08a2\3\2\2\2\u0885\u088a\5x=\2\u0886\u0887\7Y\2"+
		"\2\u0887\u0889\7Z\2\2\u0888\u0886\3\2\2\2\u0889\u088c\3\2\2\2\u088a\u0888"+
		"\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088d\3\2\2\2\u088c\u088a\3\2\2\2\u088d"+
		"\u088e\7]\2\2\u088e\u088f\7\13\2\2\u088f\u08a2\3\2\2\2\u0890\u0891\7\62"+
		"\2\2\u0891\u0892\7]\2\2\u0892\u08a2\7\13\2\2\u0893\u08a2\7-\2\2\u0894"+
		"\u0895\58\35\2\u0895\u0896\7]\2\2\u0896\u0897\7-\2\2\u0897\u08a2\3\2\2"+
		"\2\u0898\u0899\7U\2\2\u0899\u089a\5\u01c4\u00e3\2\u089a\u089b\7V\2\2\u089b"+
		"\u08a2\3\2\2\2\u089c\u08a2\5\u019e\u00d0\2\u089d\u08a2\5\u01a6\u00d4\2"+
		"\u089e\u08a2\5\u01ac\u00d7\2\u089f\u08a2\5\u01b2\u00da\2\u08a0\u08a2\5"+
		"\u01ba\u00de\2\u08a1\u0879\3\2\2\2\u08a1\u087a\3\2\2\2\u08a1\u0885\3\2"+
		"\2\2\u08a1\u0890\3\2\2\2\u08a1\u0893\3\2\2\2\u08a1\u0894\3\2\2\2\u08a1"+
		"\u0898\3\2\2\2\u08a1\u089c\3\2\2\2\u08a1\u089d\3\2\2\2\u08a1\u089e\3\2"+
		"\2\2\u08a1\u089f\3\2\2\2\u08a1\u08a0\3\2\2\2\u08a2\u0195\3\2\2\2\u08a3"+
		"\u08a4\3\2\2\2\u08a4\u0197\3\2\2\2\u08a5\u08cd\5\2\2\2\u08a6\u08ab\58"+
		"\35\2\u08a7\u08a8\7Y\2\2\u08a8\u08aa\7Z\2\2\u08a9\u08a7\3\2\2\2\u08aa"+
		"\u08ad\3\2\2\2\u08ab\u08a9\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08ae\3\2"+
		"\2\2\u08ad\u08ab\3\2\2\2\u08ae\u08af\7]\2\2\u08af\u08b0\7\13\2\2\u08b0"+
		"\u08cd\3\2\2\2\u08b1\u08b6\5x=\2\u08b2\u08b3\7Y\2\2\u08b3\u08b5\7Z\2\2"+
		"\u08b4\u08b2\3\2\2\2\u08b5\u08b8\3\2\2\2\u08b6\u08b4\3\2\2\2\u08b6\u08b7"+
		"\3\2\2\2\u08b7\u08b9\3\2\2\2\u08b8\u08b6\3\2\2\2\u08b9\u08ba\7]\2\2\u08ba"+
		"\u08bb\7\13\2\2\u08bb\u08cd\3\2\2\2\u08bc\u08bd\7\62\2\2\u08bd\u08be\7"+
		"]\2\2\u08be\u08cd\7\13\2\2\u08bf\u08cd\7-\2\2\u08c0\u08c1\58\35\2\u08c1"+
		"\u08c2\7]\2\2\u08c2\u08c3\7-\2\2\u08c3\u08cd\3\2\2\2\u08c4\u08c5\7U\2"+
		"\2\u08c5\u08c6\5\u01c4\u00e3\2\u08c6\u08c7\7V\2\2\u08c7\u08cd\3\2\2\2"+
		"\u08c8\u08cd\5\u019e\u00d0\2\u08c9\u08cd\5\u01a6\u00d4\2\u08ca\u08cd\5"+
		"\u01b2\u00da\2\u08cb\u08cd\5\u01ba\u00de\2\u08cc\u08a5\3\2\2\2\u08cc\u08a6"+
		"\3\2\2\2\u08cc\u08b1\3\2\2\2\u08cc\u08bc\3\2\2\2\u08cc\u08bf\3\2\2\2\u08cc"+
		"\u08c0\3\2\2\2\u08cc\u08c4\3\2\2\2\u08cc\u08c8\3\2\2\2\u08cc\u08c9\3\2"+
		"\2\2\u08cc\u08ca\3\2\2\2\u08cc\u08cb\3\2\2\2\u08cd\u0199\3\2\2\2\u08ce"+
		"\u08d0\7!\2\2\u08cf\u08d1\5,\27\2\u08d0\u08cf\3\2\2\2\u08d0\u08d1\3\2"+
		"\2\2\u08d1\u08d5\3\2\2\2\u08d2\u08d4\5\u00e8u\2\u08d3\u08d2\3\2\2\2\u08d4"+
		"\u08d7\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u08d8\3\2"+
		"\2\2\u08d7\u08d5\3\2\2\2\u08d8\u08e3\7\u0082\2\2\u08d9\u08dd\7]\2\2\u08da"+
		"\u08dc\5\u00e8u\2\u08db\u08da\3\2\2\2\u08dc\u08df\3\2\2\2\u08dd\u08db"+
		"\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08e0\3\2\2\2\u08df\u08dd\3\2\2\2\u08e0"+
		"\u08e2\7\u0082\2\2\u08e1\u08d9\3\2\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e1"+
		"\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e7\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6"+
		"\u08e8\5\u01a0\u00d1\2\u08e7\u08e6\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08e9"+
		"\3\2\2\2\u08e9\u08eb\7U\2\2\u08ea\u08ec\5\u01b4\u00db\2\u08eb\u08ea\3"+
		"\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ef\7V\2\2\u08ee"+
		"\u08f0\5d\63\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u0922\3\2"+
		"\2\2\u08f1\u08f2\5<\37\2\u08f2\u08f3\7]\2\2\u08f3\u08f5\7!\2\2\u08f4\u08f6"+
		"\5,\27\2\u08f5\u08f4\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08fa\3\2\2\2\u08f7"+
		"\u08f9\5\u00e8u\2\u08f8\u08f7\3\2\2\2\u08f9\u08fc\3\2\2\2\u08fa\u08f8"+
		"\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fd\3\2\2\2\u08fc\u08fa\3\2\2\2\u08fd"+
		"\u08ff\7\u0082\2\2\u08fe\u0900\5\u01a0\u00d1\2\u08ff\u08fe\3\2\2\2\u08ff"+
		"\u0900\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0903\7U\2\2\u0902\u0904\5\u01b4"+
		"\u00db\2\u0903\u0902\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u0905\3\2\2\2\u0905"+
		"\u0907\7V\2\2\u0906\u0908\5d\63\2\u0907\u0906\3\2\2\2\u0907\u0908\3\2"+
		"\2\2\u0908\u0922\3\2\2\2\u0909\u090a\5\u0186\u00c4\2\u090a\u090b\7]\2"+
		"\2\u090b\u090d\7!\2\2\u090c\u090e\5,\27\2\u090d\u090c\3\2\2\2\u090d\u090e"+
		"\3\2\2\2\u090e\u0912\3\2\2\2\u090f\u0911\5\u00e8u\2\u0910\u090f\3\2\2"+
		"\2\u0911\u0914\3\2\2\2\u0912\u0910\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0915"+
		"\3\2\2\2\u0914\u0912\3\2\2\2\u0915\u0917\7\u0082\2\2\u0916\u0918\5\u01a0"+
		"\u00d1\2\u0917\u0916\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u0919\3\2\2\2\u0919"+
		"\u091b\7U\2\2\u091a\u091c\5\u01b4\u00db\2\u091b\u091a\3\2\2\2\u091b\u091c"+
		"\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u091f\7V\2\2\u091e\u0920\5d\63\2\u091f"+
		"\u091e\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u0922\3\2\2\2\u0921\u08ce\3\2"+
		"\2\2\u0921\u08f1\3\2\2\2\u0921\u0909\3\2\2\2\u0922\u019b\3\2\2\2\u0923"+
		"\u0924\7]\2\2\u0924\u0926\7!\2\2\u0925\u0927\5,\27\2\u0926\u0925\3\2\2"+
		"\2\u0926\u0927\3\2\2\2\u0927\u092b\3\2\2\2\u0928\u092a\5\u00e8u\2\u0929"+
		"\u0928\3\2\2\2\u092a\u092d\3\2\2\2\u092b\u0929\3\2\2\2\u092b\u092c\3\2"+
		"\2\2\u092c\u092e\3\2\2\2\u092d\u092b\3\2\2\2\u092e\u0930\7\u0082\2\2\u092f"+
		"\u0931\5\u01a0\u00d1\2\u0930\u092f\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u0932"+
		"\3\2\2\2\u0932\u0934\7U\2\2\u0933\u0935\5\u01b4\u00db\2\u0934\u0933\3"+
		"\2\2\2\u0934\u0935\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0938\7V\2\2\u0937"+
		"\u0939\5d\63\2\u0938\u0937\3\2\2\2\u0938\u0939\3\2";
	private static final String _serializedATNSegment1 =
		"\2\2\u0939\u019d\3\2\2\2\u093a\u093c\7!\2\2\u093b\u093d\5,\27\2\u093c"+
		"\u093b\3\2\2\2\u093c\u093d\3\2\2\2\u093d\u0941\3\2\2\2\u093e\u0940\5\u00e8"+
		"u\2\u093f\u093e\3\2\2\2\u0940\u0943\3\2\2\2\u0941\u093f\3\2\2\2\u0941"+
		"\u0942\3\2\2\2\u0942\u0944\3\2\2\2\u0943\u0941\3\2\2\2\u0944\u094f\7\u0082"+
		"\2\2\u0945\u0949\7]\2\2\u0946\u0948\5\u00e8u\2\u0947\u0946\3\2\2\2\u0948"+
		"\u094b\3\2\2\2\u0949\u0947\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094c\3\2"+
		"\2\2\u094b\u0949\3\2\2\2\u094c\u094e\7\u0082\2\2\u094d\u0945\3\2\2\2\u094e"+
		"\u0951\3\2\2\2\u094f\u094d\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0953\3\2"+
		"\2\2\u0951\u094f\3\2\2\2\u0952\u0954\5\u01a0\u00d1\2\u0953\u0952\3\2\2"+
		"\2\u0953\u0954\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0957\7U\2\2\u0956\u0958"+
		"\5\u01b4\u00db\2\u0957\u0956\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u0959\3"+
		"\2\2\2\u0959\u095b\7V\2\2\u095a\u095c\5d\63\2\u095b\u095a\3\2\2\2\u095b"+
		"\u095c\3\2\2\2\u095c\u0976\3\2\2\2\u095d\u095e\5<\37\2\u095e\u095f\7]"+
		"\2\2\u095f\u0961\7!\2\2\u0960\u0962\5,\27\2\u0961\u0960\3\2\2\2\u0961"+
		"\u0962\3\2\2\2\u0962\u0966\3\2\2\2\u0963\u0965\5\u00e8u\2\u0964\u0963"+
		"\3\2\2\2\u0965\u0968\3\2\2\2\u0966\u0964\3\2\2\2\u0966\u0967\3\2\2\2\u0967"+
		"\u0969\3\2\2\2\u0968\u0966\3\2\2\2\u0969\u096b\7\u0082\2\2\u096a\u096c"+
		"\5\u01a0\u00d1\2\u096b\u096a\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096d\3"+
		"\2\2\2\u096d\u096f\7U\2\2\u096e\u0970\5\u01b4\u00db\2\u096f\u096e\3\2"+
		"\2\2\u096f\u0970\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u0973\7V\2\2\u0972"+
		"\u0974\5d\63\2\u0973\u0972\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u0976\3\2"+
		"\2\2\u0975\u093a\3\2\2\2\u0975\u095d\3\2\2\2\u0976\u019f\3\2\2\2\u0977"+
		"\u097b\5,\27\2\u0978\u0979\7`\2\2\u0979\u097b\7_\2\2\u097a\u0977\3\2\2"+
		"\2\u097a\u0978\3\2\2\2\u097b\u01a1\3\2\2\2\u097c\u097d\5\u0186\u00c4\2"+
		"\u097d\u097e\7]\2\2\u097e\u097f\7\u0082\2\2\u097f\u098a\3\2\2\2\u0980"+
		"\u0981\7*\2\2\u0981\u0982\7]\2\2\u0982\u098a\7\u0082\2\2\u0983\u0984\5"+
		"8\35\2\u0984\u0985\7]\2\2\u0985\u0986\7*\2\2\u0986\u0987\7]\2\2\u0987"+
		"\u0988\7\u0082\2\2\u0988\u098a\3\2\2\2\u0989\u097c\3\2\2\2\u0989\u0980"+
		"\3\2\2\2\u0989\u0983\3\2\2\2\u098a\u01a3\3\2\2\2\u098b\u098c\7]\2\2\u098c"+
		"\u098d\7\u0082\2\2\u098d\u01a5\3\2\2\2\u098e\u098f\7*\2\2\u098f\u0990"+
		"\7]\2\2\u0990\u0998\7\u0082\2\2\u0991\u0992\58\35\2\u0992\u0993\7]\2\2"+
		"\u0993\u0994\7*\2\2\u0994\u0995\7]\2\2\u0995\u0996\7\u0082\2\2\u0996\u0998"+
		"\3\2\2\2\u0997\u098e\3\2\2\2\u0997\u0991\3\2\2\2\u0998\u01a7\3\2\2\2\u0999"+
		"\u099a\5<\37\2\u099a\u099b\7Y\2\2\u099b\u099c\5\u01c4\u00e3\2\u099c\u099d"+
		"\7Z\2\2\u099d\u09a4\3\2\2\2\u099e\u099f\5\u018c\u00c7\2\u099f\u09a0\7"+
		"Y\2\2\u09a0\u09a1\5\u01c4\u00e3\2\u09a1\u09a2\7Z\2\2\u09a2\u09a4\3\2\2"+
		"\2\u09a3\u0999\3\2\2\2\u09a3\u099e\3\2\2\2\u09a4\u09ac\3\2\2\2\u09a5\u09a6"+
		"\5\u018a\u00c6\2\u09a6\u09a7\7Y\2\2\u09a7\u09a8\5\u01c4\u00e3\2\u09a8"+
		"\u09a9\7Z\2\2\u09a9\u09ab\3\2\2\2\u09aa\u09a5\3\2\2\2\u09ab\u09ae\3\2"+
		"\2\2\u09ac\u09aa\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad\u01a9\3\2\2\2\u09ae"+
		"\u09ac\3\2\2\2\u09af\u09b0\5\u0192\u00ca\2\u09b0\u09b1\7Y\2\2\u09b1\u09b2"+
		"\5\u01c4\u00e3\2\u09b2\u09b3\7Z\2\2\u09b3\u09bb\3\2\2\2\u09b4\u09b5\5"+
		"\u0190\u00c9\2\u09b5\u09b6\7Y\2\2\u09b6\u09b7\5\u01c4\u00e3\2\u09b7\u09b8"+
		"\7Z\2\2\u09b8\u09ba\3\2\2\2\u09b9\u09b4\3\2\2\2\u09ba\u09bd\3\2\2\2\u09bb"+
		"\u09b9\3\2\2\2\u09bb\u09bc\3\2\2\2\u09bc\u01ab\3\2\2\2\u09bd\u09bb\3\2"+
		"\2\2\u09be\u09bf\5<\37\2\u09bf\u09c0\7Y\2\2\u09c0\u09c1\5\u01c4\u00e3"+
		"\2\u09c1\u09c2\7Z\2\2\u09c2\u09c9\3\2\2\2\u09c3\u09c4\5\u0198\u00cd\2"+
		"\u09c4\u09c5\7Y\2\2\u09c5\u09c6\5\u01c4\u00e3\2\u09c6\u09c7\7Z\2\2\u09c7"+
		"\u09c9\3\2\2\2\u09c8\u09be\3\2\2\2\u09c8\u09c3\3\2\2\2\u09c9\u09d1\3\2"+
		"\2\2\u09ca\u09cb\5\u0196\u00cc\2\u09cb\u09cc\7Y\2\2\u09cc\u09cd\5\u01c4"+
		"\u00e3\2\u09cd\u09ce\7Z\2\2\u09ce\u09d0\3\2\2\2\u09cf\u09ca\3\2\2\2\u09d0"+
		"\u09d3\3\2\2\2\u09d1\u09cf\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2\u01ad\3\2"+
		"\2\2\u09d3\u09d1\3\2\2\2\u09d4\u09d5\5> \2\u09d5\u09d7\7U\2\2\u09d6\u09d8"+
		"\5\u01b4\u00db\2\u09d7\u09d6\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8\u09d9\3"+
		"\2\2\2\u09d9\u09da\7V\2\2\u09da\u0a19\3\2\2\2\u09db\u09dc\58\35\2\u09dc"+
		"\u09de\7]\2\2\u09dd\u09df\5,\27\2\u09de\u09dd\3\2\2\2\u09de\u09df\3\2"+
		"\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e1\7\u0082\2\2\u09e1\u09e3\7U\2\2\u09e2"+
		"\u09e4\5\u01b4\u00db\2\u09e3\u09e2\3\2\2\2\u09e3\u09e4\3\2\2\2\u09e4\u09e5"+
		"\3\2\2\2\u09e5\u09e6\7V\2\2\u09e6\u0a19\3\2\2\2\u09e7\u09e8\5<\37\2\u09e8"+
		"\u09ea\7]\2\2\u09e9\u09eb\5,\27\2\u09ea\u09e9\3\2\2\2\u09ea\u09eb\3\2"+
		"\2\2\u09eb\u09ec\3\2\2\2\u09ec\u09ed\7\u0082\2\2\u09ed\u09ef\7U\2\2\u09ee"+
		"\u09f0\5\u01b4\u00db\2\u09ef\u09ee\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u09f1"+
		"\3\2\2\2\u09f1\u09f2\7V\2\2\u09f2\u0a19\3\2\2\2\u09f3\u09f4\5\u0186\u00c4"+
		"\2\u09f4\u09f6\7]\2\2\u09f5\u09f7\5,\27\2\u09f6\u09f5\3\2\2\2\u09f6\u09f7"+
		"\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u09f9\7\u0082\2\2\u09f9\u09fb\7U\2"+
		"\2\u09fa\u09fc\5\u01b4\u00db\2\u09fb\u09fa\3\2\2\2\u09fb\u09fc\3\2\2\2"+
		"\u09fc\u09fd\3\2\2\2\u09fd\u09fe\7V\2\2\u09fe\u0a19\3\2\2\2\u09ff\u0a00"+
		"\7*\2\2\u0a00\u0a02\7]\2\2\u0a01\u0a03\5,\27\2\u0a02\u0a01\3\2\2\2\u0a02"+
		"\u0a03\3\2\2\2\u0a03\u0a04\3\2\2\2\u0a04\u0a05\7\u0082\2\2\u0a05\u0a07"+
		"\7U\2\2\u0a06\u0a08\5\u01b4\u00db\2\u0a07\u0a06\3\2\2\2\u0a07\u0a08\3"+
		"\2\2\2\u0a08\u0a09\3\2\2\2\u0a09\u0a19\7V\2\2\u0a0a\u0a0b\58\35\2\u0a0b"+
		"\u0a0c\7]\2\2\u0a0c\u0a0d\7*\2\2\u0a0d\u0a0f\7]\2\2\u0a0e\u0a10\5,\27"+
		"\2\u0a0f\u0a0e\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10\u0a11\3\2\2\2\u0a11\u0a12"+
		"\7\u0082\2\2\u0a12\u0a14\7U\2\2\u0a13\u0a15\5\u01b4\u00db\2\u0a14\u0a13"+
		"\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0a16\3\2\2\2\u0a16\u0a17\7V\2\2\u0a17"+
		"\u0a19\3\2\2\2\u0a18\u09d4\3\2\2\2\u0a18\u09db\3\2\2\2\u0a18\u09e7\3\2"+
		"\2\2\u0a18\u09f3\3\2\2\2\u0a18\u09ff\3\2\2\2\u0a18\u0a0a\3\2\2\2\u0a19"+
		"\u01af\3\2\2\2\u0a1a\u0a1c\7]\2\2\u0a1b\u0a1d\5,\27\2\u0a1c\u0a1b\3\2"+
		"\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e\u0a1f\7\u0082\2\2\u0a1f"+
		"\u0a21\7U\2\2\u0a20\u0a22\5\u01b4\u00db\2\u0a21\u0a20\3\2\2\2\u0a21\u0a22"+
		"\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a24\7V\2\2\u0a24\u01b1\3\2\2\2\u0a25"+
		"\u0a26\5> \2\u0a26\u0a28\7U\2\2\u0a27\u0a29\5\u01b4\u00db\2\u0a28\u0a27"+
		"\3\2\2\2\u0a28\u0a29\3\2\2\2\u0a29\u0a2a\3\2\2\2\u0a2a\u0a2b\7V\2\2\u0a2b"+
		"\u0a5e\3\2\2\2\u0a2c\u0a2d\58\35\2\u0a2d\u0a2f\7]\2\2\u0a2e\u0a30\5,\27"+
		"\2\u0a2f\u0a2e\3\2\2\2\u0a2f\u0a30\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0a32"+
		"\7\u0082\2\2\u0a32\u0a34\7U\2\2\u0a33\u0a35\5\u01b4\u00db\2\u0a34\u0a33"+
		"\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u0a37\7V\2\2\u0a37"+
		"\u0a5e\3\2\2\2\u0a38\u0a39\5<\37\2\u0a39\u0a3b\7]\2\2\u0a3a\u0a3c\5,\27"+
		"\2\u0a3b\u0a3a\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u0a3e"+
		"\7\u0082\2\2\u0a3e\u0a40\7U\2\2\u0a3f\u0a41\5\u01b4\u00db\2\u0a40\u0a3f"+
		"\3\2\2\2\u0a40\u0a41\3\2\2\2\u0a41\u0a42\3\2\2\2\u0a42\u0a43\7V\2\2\u0a43"+
		"\u0a5e\3\2\2\2\u0a44\u0a45\7*\2\2\u0a45\u0a47\7]\2\2\u0a46\u0a48\5,\27"+
		"\2\u0a47\u0a46\3\2\2\2\u0a47\u0a48\3\2\2\2\u0a48\u0a49\3\2\2\2\u0a49\u0a4a"+
		"\7\u0082\2\2\u0a4a\u0a4c\7U\2\2\u0a4b\u0a4d\5\u01b4\u00db\2\u0a4c\u0a4b"+
		"\3\2\2\2\u0a4c\u0a4d\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0a5e\7V\2\2\u0a4f"+
		"\u0a50\58\35\2\u0a50\u0a51\7]\2\2\u0a51\u0a52\7*\2\2\u0a52\u0a54\7]\2"+
		"\2\u0a53\u0a55\5,\27\2\u0a54\u0a53\3\2\2\2\u0a54\u0a55\3\2\2\2\u0a55\u0a56"+
		"\3\2\2\2\u0a56\u0a57\7\u0082\2\2\u0a57\u0a59\7U\2\2\u0a58\u0a5a\5\u01b4"+
		"\u00db\2\u0a59\u0a58\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a\u0a5b\3\2\2\2\u0a5b"+
		"\u0a5c\7V\2\2\u0a5c\u0a5e\3\2\2\2\u0a5d\u0a25\3\2\2\2\u0a5d\u0a2c\3\2"+
		"\2\2\u0a5d\u0a38\3\2\2\2\u0a5d\u0a44\3\2\2\2\u0a5d\u0a4f\3\2\2\2\u0a5e"+
		"\u01b3\3\2\2\2\u0a5f\u0a64\5\u01c4\u00e3\2\u0a60\u0a61\7\\\2\2\u0a61\u0a63"+
		"\5\u01c4\u00e3\2\u0a62\u0a60\3\2\2\2\u0a63\u0a66\3\2\2\2\u0a64\u0a62\3"+
		"\2\2\2\u0a64\u0a65\3\2\2\2\u0a65\u01b5\3\2\2\2\u0a66\u0a64\3\2\2\2\u0a67"+
		"\u0a68\5<\37\2\u0a68\u0a6a\7v\2\2\u0a69\u0a6b\5,\27\2\u0a6a\u0a69\3\2"+
		"\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b\u0a6c\3\2\2\2\u0a6c\u0a6d\7\u0082\2\2\u0a6d"+
		"\u0a97\3\2\2\2\u0a6e\u0a6f\5\16\b\2\u0a6f\u0a71\7v\2\2\u0a70\u0a72\5,"+
		"\27\2\u0a71\u0a70\3\2\2\2\u0a71\u0a72\3\2\2\2\u0a72\u0a73\3\2\2\2\u0a73"+
		"\u0a74\7\u0082\2\2\u0a74\u0a97\3\2\2\2\u0a75\u0a76\5\u0186\u00c4\2\u0a76"+
		"\u0a78\7v\2\2\u0a77\u0a79\5,\27\2\u0a78\u0a77\3\2\2\2\u0a78\u0a79\3\2"+
		"\2\2\u0a79\u0a7a\3\2\2\2\u0a7a\u0a7b\7\u0082\2\2\u0a7b\u0a97\3\2\2\2\u0a7c"+
		"\u0a7d\7*\2\2\u0a7d\u0a7f\7v\2\2\u0a7e\u0a80\5,\27\2\u0a7f\u0a7e\3\2\2"+
		"\2\u0a7f\u0a80\3\2\2\2\u0a80\u0a81\3\2\2\2\u0a81\u0a97\7\u0082\2\2\u0a82"+
		"\u0a83\58\35\2\u0a83\u0a84\7]\2\2\u0a84\u0a85\7*\2\2\u0a85\u0a87\7v\2"+
		"\2\u0a86\u0a88\5,\27\2\u0a87\u0a86\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88\u0a89"+
		"\3\2\2\2\u0a89\u0a8a\7\u0082\2\2\u0a8a\u0a97\3\2\2\2\u0a8b\u0a8c\5\22"+
		"\n\2\u0a8c\u0a8e\7v\2\2\u0a8d\u0a8f\5,\27\2\u0a8e\u0a8d\3\2\2\2\u0a8e"+
		"\u0a8f\3\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a91\7!\2\2\u0a91\u0a97\3\2"+
		"\2\2\u0a92\u0a93\5 \21\2\u0a93\u0a94\7v\2\2\u0a94\u0a95\7!\2\2\u0a95\u0a97"+
		"\3\2\2\2\u0a96\u0a67\3\2\2\2\u0a96\u0a6e\3\2\2\2\u0a96\u0a75\3\2\2\2\u0a96"+
		"\u0a7c\3\2\2\2\u0a96\u0a82\3\2\2\2\u0a96\u0a8b\3\2\2\2\u0a96\u0a92\3\2"+
		"\2\2\u0a97\u01b7\3\2\2\2\u0a98\u0a9a\7v\2\2\u0a99\u0a9b\5,\27\2\u0a9a"+
		"\u0a99\3\2\2\2\u0a9a\u0a9b\3\2\2\2\u0a9b\u0a9c\3\2\2\2\u0a9c\u0a9d\7\u0082"+
		"\2\2\u0a9d\u01b9\3\2\2\2\u0a9e\u0a9f\5<\37\2\u0a9f\u0aa1\7v\2\2\u0aa0"+
		"\u0aa2\5,\27\2\u0aa1\u0aa0\3\2\2\2\u0aa1\u0aa2\3\2\2\2\u0aa2\u0aa3\3\2"+
		"\2\2\u0aa3\u0aa4\7\u0082\2\2\u0aa4\u0ac7\3\2\2\2\u0aa5\u0aa6\5\16\b\2"+
		"\u0aa6\u0aa8\7v\2\2\u0aa7\u0aa9\5,\27\2\u0aa8\u0aa7\3\2\2\2\u0aa8\u0aa9"+
		"\3\2\2\2\u0aa9\u0aaa\3\2\2\2\u0aaa\u0aab\7\u0082\2\2\u0aab\u0ac7\3\2\2"+
		"\2\u0aac\u0aad\7*\2\2\u0aad\u0aaf\7v\2\2\u0aae\u0ab0\5,\27\2\u0aaf\u0aae"+
		"\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0\u0ab1\3\2\2\2\u0ab1\u0ac7\7\u0082\2"+
		"\2\u0ab2\u0ab3\58\35\2\u0ab3\u0ab4\7]\2\2\u0ab4\u0ab5\7*\2\2\u0ab5\u0ab7"+
		"\7v\2\2\u0ab6\u0ab8\5,\27\2\u0ab7\u0ab6\3\2\2\2\u0ab7\u0ab8\3\2\2\2\u0ab8"+
		"\u0ab9\3\2\2\2\u0ab9\u0aba\7\u0082\2\2\u0aba\u0ac7\3\2\2\2\u0abb\u0abc"+
		"\5\22\n\2\u0abc\u0abe\7v\2\2\u0abd\u0abf\5,\27\2\u0abe\u0abd\3\2\2\2\u0abe"+
		"\u0abf\3\2\2\2\u0abf\u0ac0\3\2\2\2\u0ac0\u0ac1\7!\2\2\u0ac1\u0ac7\3\2"+
		"\2\2\u0ac2\u0ac3\5 \21\2\u0ac3\u0ac4\7v\2\2\u0ac4\u0ac5\7!\2\2\u0ac5\u0ac7"+
		"\3\2\2\2\u0ac6\u0a9e\3\2\2\2\u0ac6\u0aa5\3\2\2\2\u0ac6\u0aac\3\2\2\2\u0ac6"+
		"\u0ab2\3\2\2\2\u0ac6\u0abb\3\2\2\2\u0ac6\u0ac2\3\2\2\2\u0ac7\u01bb\3\2"+
		"\2\2\u0ac8\u0ac9\7!\2\2\u0ac9\u0aca\5\6\4\2\u0aca\u0acc\5\u01be\u00e0"+
		"\2\u0acb\u0acd\5\"\22\2\u0acc\u0acb\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd"+
		"\u0adf\3\2\2\2\u0ace\u0acf\7!\2\2\u0acf\u0ad0\5\20\t\2\u0ad0\u0ad2\5\u01be"+
		"\u00e0\2\u0ad1\u0ad3\5\"\22\2\u0ad2\u0ad1\3\2\2\2\u0ad2\u0ad3\3\2\2\2"+
		"\u0ad3\u0adf\3\2\2\2\u0ad4\u0ad5\7!\2\2\u0ad5\u0ad6\5\6\4\2\u0ad6\u0ad7"+
		"\5\"\22\2\u0ad7\u0ad8\5\u00fa~\2\u0ad8\u0adf\3\2\2\2\u0ad9\u0ada\7!\2"+
		"\2\u0ada\u0adb\5\20\t\2\u0adb\u0adc\5\"\22\2\u0adc\u0add\5\u00fa~\2\u0add"+
		"\u0adf\3\2\2\2\u0ade\u0ac8\3\2\2\2\u0ade\u0ace\3\2\2\2\u0ade\u0ad4\3\2"+
		"\2\2\u0ade\u0ad9\3\2\2\2\u0adf\u01bd\3\2\2\2\u0ae0\u0ae4\5\u01c0\u00e1"+
		"\2\u0ae1\u0ae3\5\u01c0\u00e1\2\u0ae2\u0ae1\3\2\2\2\u0ae3\u0ae6\3\2\2\2"+
		"\u0ae4\u0ae2\3\2\2\2\u0ae4\u0ae5\3\2\2\2\u0ae5\u01bf\3\2\2\2\u0ae6\u0ae4"+
		"\3\2\2\2\u0ae7\u0ae9\5\u00e8u\2\u0ae8\u0ae7\3\2\2\2\u0ae9\u0aec\3\2\2"+
		"\2\u0aea\u0ae8\3\2\2\2\u0aea\u0aeb\3\2\2\2\u0aeb\u0aed\3\2\2\2\u0aec\u0aea"+
		"\3\2\2\2\u0aed\u0aee\7Y\2\2\u0aee\u0aef\5\u01c4\u00e3\2\u0aef\u0af0\7"+
		"Z\2\2\u0af0\u01c1\3\2\2\2\u0af1\u0af2\5\u01c4\u00e3\2\u0af2\u01c3\3\2"+
		"\2\2\u0af3\u0af6\5\u01c6\u00e4\2\u0af4\u0af6\5\u01ce\u00e8\2\u0af5\u0af3"+
		"\3\2\2\2\u0af5\u0af4\3\2\2\2\u0af6\u01c5\3\2\2\2\u0af7\u0af8\5\u01c8\u00e5"+
		"\2\u0af8\u0af9\7u\2\2\u0af9\u0afa\5\u01cc\u00e7\2\u0afa\u01c7\3\2\2\2"+
		"\u0afb\u0b06\7\u0082\2\2\u0afc\u0afe\7U\2\2\u0afd\u0aff\5\u0098M\2\u0afe"+
		"\u0afd\3\2\2\2\u0afe\u0aff\3\2\2\2\u0aff\u0b00\3\2\2\2\u0b00\u0b06\7V"+
		"\2\2\u0b01\u0b02\7U\2\2\u0b02\u0b03\5\u01ca\u00e6\2\u0b03\u0b04\7V\2\2"+
		"\u0b04\u0b06\3\2\2\2\u0b05\u0afb\3\2\2\2\u0b05\u0afc\3\2\2\2\u0b05\u0b01"+
		"\3\2\2\2\u0b06\u01c9\3\2\2\2\u0b07\u0b0c\7\u0082\2\2\u0b08\u0b09\7\\\2"+
		"\2\u0b09\u0b0b\7\u0082\2\2\u0b0a\u0b08\3\2\2\2\u0b0b\u0b0e\3\2\2\2\u0b0c"+
		"\u0b0a\3\2\2\2\u0b0c\u0b0d\3\2\2\2\u0b0d\u01cb\3\2\2\2\u0b0e\u0b0c\3\2"+
		"\2\2\u0b0f\u0b12\5\u01c4\u00e3\2\u0b10\u0b12\5\u00fe\u0080\2\u0b11\u0b0f"+
		"\3\2\2\2\u0b11\u0b10\3\2\2\2\u0b12\u01cd\3\2\2\2\u0b13\u0b16\5\u01d6\u00ec"+
		"\2\u0b14\u0b16\5\u01d0\u00e9\2\u0b15\u0b13\3\2\2\2\u0b15\u0b14\3\2\2\2"+
		"\u0b16\u01cf\3\2\2\2\u0b17\u0b18\5\u01d2\u00ea\2\u0b18\u0b19\5\u01d4\u00eb"+
		"\2\u0b19\u0b1a\5\u01c4\u00e3\2\u0b1a\u01d1\3\2\2\2\u0b1b\u0b1f\5<\37\2"+
		"\u0b1c\u0b1f\5\u01a2\u00d2\2\u0b1d\u0b1f\5\u01a8\u00d5\2\u0b1e\u0b1b\3"+
		"\2\2\2\u0b1e\u0b1c\3\2\2\2\u0b1e\u0b1d\3\2\2\2\u0b1f\u01d3\3\2\2\2\u0b20"+
		"\u0b21\t\5\2\2\u0b21\u01d5\3\2\2\2\u0b22\u0b2a\5\u01d8\u00ed\2\u0b23\u0b24"+
		"\5\u01d8\u00ed\2\u0b24\u0b25\7c\2\2\u0b25\u0b26\5\u01c4\u00e3\2\u0b26"+
		"\u0b27\7d\2\2\u0b27\u0b28\5\u01d6\u00ec\2\u0b28\u0b2a\3\2\2\2\u0b29\u0b22"+
		"\3\2\2\2\u0b29\u0b23\3\2\2\2\u0b2a\u01d7\3\2\2\2\u0b2b\u0b2c\b\u00ed\1"+
		"\2\u0b2c\u0b2d\5\u01da\u00ee\2\u0b2d\u0b33\3\2\2\2\u0b2e\u0b2f\f\3\2\2"+
		"\u0b2f\u0b30\7j\2\2\u0b30\u0b32\5\u01da\u00ee\2\u0b31\u0b2e\3\2\2\2\u0b32"+
		"\u0b35\3\2\2\2\u0b33\u0b31\3\2\2\2\u0b33\u0b34\3\2\2\2\u0b34\u01d9\3\2"+
		"\2\2\u0b35\u0b33\3\2\2\2\u0b36\u0b37\b\u00ee\1\2\u0b37\u0b38\5\u01dc\u00ef"+
		"\2\u0b38\u0b3e\3\2\2\2\u0b39\u0b3a\f\3\2\2\u0b3a\u0b3b\7i\2\2\u0b3b\u0b3d"+
		"\5\u01dc\u00ef\2\u0b3c\u0b39\3\2\2\2\u0b3d\u0b40\3\2\2\2\u0b3e\u0b3c\3"+
		"\2\2\2\u0b3e\u0b3f\3\2\2\2\u0b3f\u01db\3\2\2\2\u0b40\u0b3e\3\2\2\2\u0b41"+
		"\u0b42\b\u00ef\1\2\u0b42\u0b43\5\u01de\u00f0\2\u0b43\u0b49\3\2\2\2\u0b44"+
		"\u0b45\f\3\2\2\u0b45\u0b46\7r\2\2\u0b46\u0b48\5\u01de\u00f0\2\u0b47\u0b44"+
		"\3\2\2\2\u0b48\u0b4b\3\2\2\2\u0b49\u0b47\3\2\2\2\u0b49\u0b4a\3\2\2\2\u0b4a"+
		"\u01dd\3\2\2\2\u0b4b\u0b49\3\2\2\2\u0b4c\u0b4d\b\u00f0\1\2\u0b4d\u0b4e"+
		"\5\u01e0\u00f1\2\u0b4e\u0b54\3\2\2\2\u0b4f\u0b50\f\3\2\2\u0b50\u0b51\7"+
		"s\2\2\u0b51\u0b53\5\u01e0\u00f1\2\u0b52\u0b4f\3\2\2\2\u0b53\u0b56\3\2"+
		"\2\2\u0b54\u0b52\3\2\2\2\u0b54\u0b55\3\2\2\2\u0b55\u01df\3\2\2\2\u0b56"+
		"\u0b54\3\2\2\2\u0b57\u0b58\b\u00f1\1\2\u0b58\u0b59\5\u01e2\u00f2\2\u0b59"+
		"\u0b5f\3\2\2\2\u0b5a\u0b5b\f\3\2\2\u0b5b\u0b5c\7q\2\2\u0b5c\u0b5e\5\u01e2"+
		"\u00f2\2\u0b5d\u0b5a\3\2\2\2\u0b5e\u0b61\3\2\2\2\u0b5f\u0b5d\3\2\2\2\u0b5f"+
		"\u0b60\3\2\2\2\u0b60\u01e1\3\2\2\2\u0b61\u0b5f\3\2\2\2\u0b62\u0b63\b\u00f2"+
		"\1\2\u0b63\u0b64\5\u01e4\u00f3\2\u0b64\u0b6d\3\2\2\2\u0b65\u0b66\f\4\2"+
		"\2\u0b66\u0b67\7e\2\2\u0b67\u0b6c\5\u01e4\u00f3\2\u0b68\u0b69\f\3\2\2"+
		"\u0b69\u0b6a\7h\2\2\u0b6a\u0b6c\5\u01e4\u00f3\2\u0b6b\u0b65\3\2\2\2\u0b6b"+
		"\u0b68\3\2\2\2\u0b6c\u0b6f\3\2\2\2\u0b6d\u0b6b\3\2\2\2\u0b6d\u0b6e\3\2"+
		"\2\2\u0b6e\u01e3\3\2\2\2\u0b6f\u0b6d\3\2\2\2\u0b70\u0b71\b\u00f3\1\2\u0b71"+
		"\u0b72\5\u01e6\u00f4\2\u0b72\u0b84\3\2\2\2\u0b73\u0b74\f\7\2\2\u0b74\u0b75"+
		"\7`\2\2\u0b75\u0b83\5\u01e6\u00f4\2\u0b76\u0b77\f\6\2\2\u0b77\u0b78\7"+
		"_\2\2\u0b78\u0b83\5\u01e6\u00f4\2\u0b79\u0b7a\f\5\2\2\u0b7a\u0b7b\7f\2"+
		"\2\u0b7b\u0b83\5\u01e6\u00f4\2\u0b7c\u0b7d\f\4\2\2\u0b7d\u0b7e\7g\2\2"+
		"\u0b7e\u0b83\5\u01e6\u00f4\2\u0b7f\u0b80\f\3\2\2\u0b80\u0b81\7\34\2\2"+
		"\u0b81\u0b83\5\16\b\2\u0b82\u0b73\3\2\2\2\u0b82\u0b76\3\2\2\2\u0b82\u0b79"+
		"\3\2\2\2\u0b82\u0b7c\3\2\2\2\u0b82\u0b7f\3\2\2\2\u0b83\u0b86\3\2\2\2\u0b84"+
		"\u0b82\3\2\2\2\u0b84\u0b85\3\2\2\2\u0b85\u01e5\3\2\2\2\u0b86\u0b84\3\2"+
		"\2\2\u0b87\u0b88\b\u00f4\1\2\u0b88\u0b89\5\u01e8\u00f5\2\u0b89\u0b99\3"+
		"\2\2\2\u0b8a\u0b8b\f\5\2\2\u0b8b\u0b8c\7`\2\2\u0b8c\u0b8d\7`\2\2\u0b8d"+
		"\u0b98\5\u01e8\u00f5\2\u0b8e\u0b8f\f\4\2\2\u0b8f\u0b90\7_\2\2\u0b90\u0b91"+
		"\7_\2\2\u0b91\u0b98\5\u01e8\u00f5\2\u0b92\u0b93\f\3\2\2\u0b93\u0b94\7"+
		"_\2\2\u0b94\u0b95\7_\2\2\u0b95\u0b96\7_\2\2\u0b96\u0b98\5\u01e8\u00f5"+
		"\2\u0b97\u0b8a\3\2\2\2\u0b97\u0b8e\3\2\2\2\u0b97\u0b92\3\2\2\2\u0b98\u0b9b"+
		"\3\2\2\2\u0b99\u0b97\3\2\2\2\u0b99\u0b9a\3\2\2\2\u0b9a\u01e7\3\2\2\2\u0b9b"+
		"\u0b99\3\2\2\2\u0b9c\u0b9d\b\u00f5\1\2\u0b9d\u0b9e\5\u01ea\u00f6\2\u0b9e"+
		"\u0ba7\3\2\2\2\u0b9f\u0ba0\f\4\2\2\u0ba0\u0ba1\7m\2\2\u0ba1\u0ba6\5\u01ea"+
		"\u00f6\2\u0ba2\u0ba3\f\3\2\2\u0ba3\u0ba4\7n\2\2\u0ba4\u0ba6\5\u01ea\u00f6"+
		"\2\u0ba5\u0b9f\3\2\2\2\u0ba5\u0ba2\3\2\2\2\u0ba6\u0ba9\3\2\2\2\u0ba7\u0ba5"+
		"\3\2\2\2\u0ba7\u0ba8\3\2\2\2\u0ba8\u01e9\3\2\2\2\u0ba9\u0ba7\3\2\2\2\u0baa"+
		"\u0bab\b\u00f6\1\2\u0bab\u0bac\5\u01ec\u00f7\2\u0bac\u0bb8\3\2\2\2\u0bad"+
		"\u0bae\f\5\2\2\u0bae\u0baf\7o\2\2\u0baf\u0bb7\5\u01ec\u00f7\2\u0bb0\u0bb1"+
		"\f\4\2\2\u0bb1\u0bb2\7p\2\2\u0bb2\u0bb7\5\u01ec\u00f7\2\u0bb3\u0bb4\f"+
		"\3\2\2\u0bb4\u0bb5\7t\2\2\u0bb5\u0bb7\5\u01ec\u00f7\2\u0bb6\u0bad\3\2"+
		"\2\2\u0bb6\u0bb0\3\2\2\2\u0bb6\u0bb3\3\2\2\2\u0bb7\u0bba\3\2\2\2\u0bb8"+
		"\u0bb6\3\2\2\2\u0bb8\u0bb9\3\2\2\2\u0bb9\u01eb\3\2\2\2\u0bba\u0bb8\3\2"+
		"\2\2\u0bbb\u0bc3\5\u01ee\u00f8\2\u0bbc\u0bc3\5\u01f0\u00f9\2\u0bbd\u0bbe"+
		"\7m\2\2\u0bbe\u0bc3\5\u01ec\u00f7\2\u0bbf\u0bc0\7n\2\2\u0bc0\u0bc3\5\u01ec"+
		"\u00f7\2\u0bc1\u0bc3\5\u01f2\u00fa\2\u0bc2\u0bbb\3\2\2\2\u0bc2\u0bbc\3"+
		"\2\2\2\u0bc2\u0bbd\3\2\2\2\u0bc2\u0bbf\3\2\2\2\u0bc2\u0bc1\3\2\2\2\u0bc3"+
		"\u01ed\3\2\2\2\u0bc4\u0bc5\7k\2\2\u0bc5\u0bc6\5\u01ec\u00f7\2\u0bc6\u01ef"+
		"\3\2\2\2\u0bc7\u0bc8\7l\2\2\u0bc8\u0bc9\5\u01ec\u00f7\2\u0bc9\u01f1\3"+
		"\2\2\2\u0bca\u0bd1\5\u01f4\u00fb\2\u0bcb\u0bcc\7b\2\2\u0bcc\u0bd1\5\u01ec"+
		"\u00f7\2\u0bcd\u0bce\7a\2\2\u0bce\u0bd1\5\u01ec\u00f7\2\u0bcf\u0bd1\5"+
		"\u01fe\u0100\2\u0bd0\u0bca\3\2\2\2\u0bd0\u0bcb\3\2\2\2\u0bd0\u0bcd\3\2"+
		"\2\2\u0bd0\u0bcf\3\2\2\2\u0bd1\u01f3\3\2\2\2\u0bd2\u0bd5\5\u0186\u00c4"+
		"\2\u0bd3\u0bd5\5<\37\2\u0bd4\u0bd2\3\2\2\2\u0bd4\u0bd3\3\2\2\2\u0bd5\u0bda"+
		"\3\2\2\2\u0bd6\u0bd9\5\u01f8\u00fd\2\u0bd7\u0bd9\5\u01fc\u00ff\2\u0bd8"+
		"\u0bd6\3\2\2\2\u0bd8\u0bd7\3\2\2\2\u0bd9\u0bdc\3\2\2\2\u0bda\u0bd8\3\2"+
		"\2\2\u0bda\u0bdb\3\2\2\2\u0bdb\u01f5\3\2\2\2\u0bdc\u0bda\3\2\2\2\u0bdd"+
		"\u0bde\5\u01f4\u00fb\2\u0bde\u0bdf\7k\2\2\u0bdf\u01f7\3\2\2\2\u0be0\u0be1"+
		"\7k\2\2\u0be1\u01f9\3\2\2\2\u0be2\u0be3\5\u01f4\u00fb\2\u0be3\u0be4\7"+
		"l\2\2\u0be4\u01fb\3\2\2\2\u0be5\u0be6\7l\2\2\u0be6\u01fd\3\2\2\2\u0be7"+
		"\u0be8\7U\2\2\u0be8\u0be9\5\6\4\2\u0be9\u0bea\7V\2\2\u0bea\u0beb\5\u01ec"+
		"\u00f7\2\u0beb\u0c03\3\2\2\2\u0bec\u0bed\7U\2\2\u0bed\u0bf1\5\16\b\2\u0bee"+
		"\u0bf0\5*\26\2\u0bef\u0bee\3\2\2\2\u0bf0\u0bf3\3\2\2\2\u0bf1\u0bef\3\2"+
		"\2\2\u0bf1\u0bf2\3\2\2\2\u0bf2\u0bf4\3\2\2\2\u0bf3\u0bf1\3\2\2\2\u0bf4"+
		"\u0bf5\7V\2\2\u0bf5\u0bf6\5\u01f2\u00fa\2\u0bf6\u0c03\3\2\2\2\u0bf7\u0bf8"+
		"\7U\2\2\u0bf8\u0bfc\5\16\b\2\u0bf9\u0bfb\5*\26\2\u0bfa\u0bf9\3\2\2\2\u0bfb"+
		"\u0bfe\3\2\2\2\u0bfc\u0bfa\3\2\2\2\u0bfc\u0bfd\3\2\2\2\u0bfd\u0bff\3\2"+
		"\2\2\u0bfe\u0bfc\3\2\2\2\u0bff\u0c00\7V\2\2\u0c00\u0c01\5\u01c6\u00e4"+
		"\2\u0c01\u0c03\3\2\2\2\u0c02\u0be7\3\2\2\2\u0c02\u0bec\3\2\2\2\u0c02\u0bf7"+
		"\3\2\2\2\u0c03\u01ff\3\2\2\2\u0155\u0204\u0209\u0210\u0214\u0218\u0221"+
		"\u0225\u0229\u022b\u0231\u0236\u023d\u0242\u0244\u024a\u024f\u0254\u0259"+
		"\u0264\u0272\u0277\u027f\u0286\u028c\u0291\u029c\u029f\u02ad\u02b2\u02b7"+
		"\u02bc\u02c2\u02cc\u02d4\u02de\u02e6\u02f2\u02f6\u02fb\u0301\u0309\u0312"+
		"\u031d\u033a\u033e\u0343\u0349\u034c\u034f\u035b\u0366\u0374\u037b\u0384"+
		"\u038b\u0390\u039f\u03a6\u03ac\u03b0\u03b4\u03b8\u03bc\u03c1\u03c5\u03c9"+
		"\u03cb\u03d0\u03d7\u03dc\u03de\u03e4\u03e9\u03ed\u0400\u0405\u0415\u041a"+
		"\u0420\u0426\u0428\u042c\u0431\u0435\u043c\u0443\u044b\u044e\u0453\u045b"+
		"\u0460\u0467\u046e\u0473\u0479\u0485\u048a\u048e\u0498\u049d\u04a5\u04a8"+
		"\u04ad\u04b5\u04b8\u04bd\u04c2\u04c7\u04cc\u04d3\u04d8\u04e0\u04e5\u04ea"+
		"\u04ef\u04f5\u04fb\u04fe\u0501\u050a\u0510\u0516\u0519\u051c\u0524\u0529"+
		"\u052e\u0534\u0537\u0542\u054b\u0555\u055a\u0565\u056a\u0576\u057b\u0587"+
		"\u0591\u0596\u059e\u05a1\u05a8\u05b0\u05b6\u05bf\u05c9\u05cd\u05d0\u05d9"+
		"\u05e7\u05ea\u05f3\u05f8\u0600\u0606\u060e\u061a\u0621\u0630\u0646\u0668"+
		"\u0674\u067a\u0686\u0693\u06ad\u06b1\u06b6\u06ba\u06be\u06c6\u06ca\u06ce"+
		"\u06d5\u06de\u06e6\u06f5\u0701\u0707\u070d\u0722\u0727\u072d\u0739\u0744"+
		"\u074e\u0751\u0756\u075f\u0765\u077f\u078d\u078f\u07a0\u07a2\u07b3\u07b5"+
		"\u07c6\u07c8\u07d9\u07db\u07e4\u07f2\u0802\u0804\u0823\u0828\u0831\u0848"+
		"\u0852\u0868\u086f\u0877\u087f\u088a\u08a1\u08ab\u08b6\u08cc\u08d0\u08d5"+
		"\u08dd\u08e3\u08e7\u08eb\u08ef\u08f5\u08fa\u08ff\u0903\u0907\u090d\u0912"+
		"\u0917\u091b\u091f\u0921\u0926\u092b\u0930\u0934\u0938\u093c\u0941\u0949"+
		"\u094f\u0953\u0957\u095b\u0961\u0966\u096b\u096f\u0973\u0975\u097a\u0989"+
		"\u0997\u09a3\u09ac\u09bb\u09c8\u09d1\u09d7\u09de\u09e3\u09ea\u09ef\u09f6"+
		"\u09fb\u0a02\u0a07\u0a0f\u0a14\u0a18\u0a1c\u0a21\u0a28\u0a2f\u0a34\u0a3b"+
		"\u0a40\u0a47\u0a4c\u0a54\u0a59\u0a5d\u0a64\u0a6a\u0a71\u0a78\u0a7f\u0a87"+
		"\u0a8e\u0a96\u0a9a\u0aa1\u0aa8\u0aaf\u0ab7\u0abe\u0ac6\u0acc\u0ad2\u0ade"+
		"\u0ae4\u0aea\u0af5\u0afe\u0b05\u0b0c\u0b11\u0b15\u0b1e\u0b29\u0b33\u0b3e"+
		"\u0b49\u0b54\u0b5f\u0b6b\u0b6d\u0b82\u0b84\u0b97\u0b99\u0ba5\u0ba7\u0bb6"+
		"\u0bb8\u0bc2\u0bd0\u0bd4\u0bd8\u0bda\u0bf1\u0bfc\u0c02";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}