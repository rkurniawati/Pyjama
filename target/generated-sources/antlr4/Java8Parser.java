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
		T__1=1, T__0=2, ABSTRACT=3, ASSERT=4, BOOLEAN=5, BREAK=6, BYTE=7, CASE=8, 
		CATCH=9, CHAR=10, CLASS=11, CONST=12, CONTINUE=13, DEFAULT=14, DO=15, 
		DOUBLE=16, ELSE=17, ENUM=18, EXTENDS=19, FINAL=20, FINALLY=21, FLOAT=22, 
		FOR=23, IF=24, GOTO=25, IMPLEMENTS=26, IMPORT=27, INSTANCEOF=28, INT=29, 
		INTERFACE=30, LONG=31, NATIVE=32, NEW=33, PACKAGE=34, PRIVATE=35, PROTECTED=36, 
		PUBLIC=37, RETURN=38, SHORT=39, STATIC=40, STRICTFP=41, SUPER=42, SWITCH=43, 
		SYNCHRONIZED=44, THIS=45, THROW=46, THROWS=47, TRANSIENT=48, TRY=49, VOID=50, 
		VOLATILE=51, WHILE=52, OPENMP_PRAGMA=53, PARALLEL=54, PARALLEL_FOR=55, 
		PARALLEL_SECTIONS=56, FIRSTPRIVATE=57, LASTPRIVATE=58, SHARED=59, NONE=60, 
		REDUCTION=61, FREEGUI=62, GUI=63, SCHEDULE=64, DYNAMIC=65, GUIDED=66, 
		ORDERED=67, SECTIONS=68, SECTION=69, SINGLE=70, MASTER=71, CRITICAL=72, 
		ATOMIC=73, FLUSH=74, BARRIER=75, NOWAIT=76, NUMTHREADS=77, COPYPRIVATE=78, 
		IntegerLiteral=79, FloatingPointLiteral=80, BooleanLiteral=81, CharacterLiteral=82, 
		StringLiteral=83, NullLiteral=84, LPAREN=85, RPAREN=86, LBRACE=87, RBRACE=88, 
		LBRACK=89, RBRACK=90, SEMI=91, COMMA=92, DOT=93, ASSIGN=94, GT=95, LT=96, 
		BANG=97, TILDE=98, QUESTION=99, COLON=100, EQUAL=101, LE=102, GE=103, 
		NOTEQUAL=104, AND=105, OR=106, INC=107, DEC=108, ADD=109, SUB=110, MUL=111, 
		DIV=112, BITAND=113, BITOR=114, CARET=115, MOD=116, ARROW=117, COLONCOLON=118, 
		ADD_ASSIGN=119, SUB_ASSIGN=120, MUL_ASSIGN=121, DIV_ASSIGN=122, AND_ASSIGN=123, 
		OR_ASSIGN=124, XOR_ASSIGN=125, MOD_ASSIGN=126, LSHIFT_ASSIGN=127, RSHIFT_ASSIGN=128, 
		URSHIFT_ASSIGN=129, Identifier=130, AT=131, ELLIPSIS=132, WS=133, COMMENT=134, 
		LINE_COMMENT=135;
	public static final String[] tokenNames = {
		"<INVALID>", "'auto'", "'runtime'", "'abstract'", "'assert'", "'boolean'", 
		"'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", 
		"'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", 
		"'final'", "'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", 
		"'import'", "'instanceof'", "'int'", "'interface'", "'long'", "'native'", 
		"'new'", "'package'", "'private'", "'protected'", "'public'", "'return'", 
		"'short'", "'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", 
		"'this'", "'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
		"'while'", "'//#omp'", "'parallel'", "'parallel for'", "'parallel sections'", 
		"'firstprivate'", "'lastprivate'", "'shared'", "'none'", "'reduction'", 
		"'freeguithread'", "'gui'", "'schedule'", "'dynamic'", "'guided'", "'ordered'", 
		"'sections'", "'section'", "'single'", "'master'", "'critical'", "'atomic'", 
		"'flush'", "'barrier'", "'nowait'", "'num_threads'", "'copyprivate'", 
		"IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
		"StringLiteral", "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
		"','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
		"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='", "'-='", 
		"'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", 
		"Identifier", "'@'", "'...'", "WS", "COMMENT", "LINE_COMMENT"
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
		RULE_openmpStatement = 176, RULE_openmpConstruct = 177, RULE_ompParallelConstruct = 178, 
		RULE_ompParallelForConstruct = 179, RULE_ompParallelSectionsConstruct = 180, 
		RULE_ompForConstruct = 181, RULE_ompSectionsConstruct = 182, RULE_ompFreeguiConstruct = 183, 
		RULE_ompSectionConstruct = 184, RULE_ompGuiConstruct = 185, RULE_ompSingleConstruct = 186, 
		RULE_ompMasterConstruct = 187, RULE_ompCriticalConstruct = 188, RULE_ompAtomicConstruct = 189, 
		RULE_ompBarrierDirective = 190, RULE_ompFlushDirective = 191, RULE_ompOrderedConstruct = 192, 
		RULE_ompScheduleClause = 193, RULE_ompDataClause = 194, RULE_ompPrivateClause = 195, 
		RULE_ompSharedDataClause = 196, RULE_ompLastprivateDataClause = 197, RULE_ompReductionDataClause = 198, 
		RULE_ompCopyprivateDataClause = 199, RULE_ompDefaultDataClause = 200, 
		RULE_ompDataClauseArgumentList = 201, RULE_ompDataClauseReductionArgumentList = 202, 
		RULE_primary = 203, RULE_primaryNoNewArray = 204, RULE_primaryNoNewArray_lf_arrayAccess = 205, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 206, RULE_primaryNoNewArray_lf_primary = 207, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 208, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 209, 
		RULE_primaryNoNewArray_lfno_primary = 210, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 211, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 212, 
		RULE_classInstanceCreationExpression = 213, RULE_classInstanceCreationExpression_lf_primary = 214, 
		RULE_classInstanceCreationExpression_lfno_primary = 215, RULE_typeArgumentsOrDiamond = 216, 
		RULE_fieldAccess = 217, RULE_fieldAccess_lf_primary = 218, RULE_fieldAccess_lfno_primary = 219, 
		RULE_arrayAccess = 220, RULE_arrayAccess_lf_primary = 221, RULE_arrayAccess_lfno_primary = 222, 
		RULE_methodInvocation = 223, RULE_methodInvocation_lf_primary = 224, RULE_methodInvocation_lfno_primary = 225, 
		RULE_argumentList = 226, RULE_methodReference = 227, RULE_methodReference_lf_primary = 228, 
		RULE_methodReference_lfno_primary = 229, RULE_arrayCreationExpression = 230, 
		RULE_dimExprs = 231, RULE_dimExpr = 232, RULE_constantExpression = 233, 
		RULE_expression = 234, RULE_lambdaExpression = 235, RULE_lambdaParameters = 236, 
		RULE_inferredFormalParameterList = 237, RULE_lambdaBody = 238, RULE_assignmentExpression = 239, 
		RULE_assignment = 240, RULE_leftHandSide = 241, RULE_assignmentOperator = 242, 
		RULE_conditionalExpression = 243, RULE_conditionalOrExpression = 244, 
		RULE_conditionalAndExpression = 245, RULE_inclusiveOrExpression = 246, 
		RULE_exclusiveOrExpression = 247, RULE_andExpression = 248, RULE_equalityExpression = 249, 
		RULE_relationalExpression = 250, RULE_shiftExpression = 251, RULE_additiveExpression = 252, 
		RULE_multiplicativeExpression = 253, RULE_unaryExpression = 254, RULE_preIncrementExpression = 255, 
		RULE_preDecrementExpression = 256, RULE_unaryExpressionNotPlusMinus = 257, 
		RULE_postfixExpression = 258, RULE_postIncrementExpression = 259, RULE_postIncrementExpression_lf_postfixExpression = 260, 
		RULE_postDecrementExpression = 261, RULE_postDecrementExpression_lf_postfixExpression = 262, 
		RULE_castExpression = 263;
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
		"resource", "openmpStatement", "openmpConstruct", "ompParallelConstruct", 
		"ompParallelForConstruct", "ompParallelSectionsConstruct", "ompForConstruct", 
		"ompSectionsConstruct", "ompFreeguiConstruct", "ompSectionConstruct", 
		"ompGuiConstruct", "ompSingleConstruct", "ompMasterConstruct", "ompCriticalConstruct", 
		"ompAtomicConstruct", "ompBarrierDirective", "ompFlushDirective", "ompOrderedConstruct", 
		"ompScheduleClause", "ompDataClause", "ompPrivateClause", "ompSharedDataClause", 
		"ompLastprivateDataClause", "ompReductionDataClause", "ompCopyprivateDataClause", 
		"ompDefaultDataClause", "ompDataClauseArgumentList", "ompDataClauseReductionArgumentList", 
		"primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", "primaryNoNewArray_lfno_arrayAccess", 
		"primaryNoNewArray_lf_primary", "primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", 
		"primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", "primaryNoNewArray_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", "primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", 
		"classInstanceCreationExpression", "classInstanceCreationExpression_lf_primary", 
		"classInstanceCreationExpression_lfno_primary", "typeArgumentsOrDiamond", 
		"fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", "arrayAccess", 
		"arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
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
			setState(528);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)))) != 0)) ) {
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
			setState(532);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530); primitiveType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531); referenceType();
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
			setState(548);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(534); annotation();
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(540); numericType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(541); annotation();
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(547); match(BOOLEAN);
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
			setState(552);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(550); integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(551); floatingPointType();
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
			setState(554);
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
			setState(556);
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
			setState(561);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558); classOrInterfaceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559); typeVariable();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(560); arrayType();
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
			setState(565);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(563); classType_lfno_classOrInterfaceType();
				}
				break;

			case 2:
				{
				setState(564); interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(569);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(567); classType_lf_classOrInterfaceType();
						}
						break;

					case 2:
						{
						setState(568); interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(573);
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
			setState(596);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(574); annotation();
					}
					}
					setState(579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(580); match(Identifier);
				setState(582);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(581); typeArguments();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584); classOrInterfaceType();
				setState(585); match(DOT);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(586); annotation();
					}
					}
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(592); match(Identifier);
				setState(594);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(593); typeArguments();
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
			setState(598); match(DOT);
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(599); annotation();
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(605); match(Identifier);
			setState(607);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(606); typeArguments();
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
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(609); annotation();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615); match(Identifier);
			setState(617);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(616); typeArguments();
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
			setState(619); classType();
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
			setState(621); classType_lf_classOrInterfaceType();
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
			setState(623); classType_lfno_classOrInterfaceType();
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
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(625); annotation();
				}
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(631); match(Identifier);
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
			setState(642);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633); primitiveType();
				setState(634); dims();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636); classOrInterfaceType();
				setState(637); dims();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(639); typeVariable();
				setState(640); dims();
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
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(644); annotation();
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650); match(LBRACK);
			setState(651); match(RBRACK);
			setState(662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(652); annotation();
						}
						}
						setState(657);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(658); match(LBRACK);
					setState(659); match(RBRACK);
					}
					} 
				}
				setState(664);
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
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(665); typeParameterModifier();
				}
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(671); match(Identifier);
			setState(673);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(672); typeBound();
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
			setState(675); annotation();
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
			setState(687);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677); match(EXTENDS);
				setState(678); typeVariable();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679); match(EXTENDS);
				setState(680); classOrInterfaceType();
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(681); additionalBound();
					}
					}
					setState(686);
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
			setState(689); match(BITAND);
			setState(690); interfaceType();
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
			setState(692); match(LT);
			setState(693); typeArgumentList();
			setState(694); match(GT);
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
			setState(696); typeArgument();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(697); match(COMMA);
				setState(698); typeArgument();
				}
				}
				setState(703);
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
			setState(706);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704); referenceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705); wildcard();
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
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(708); annotation();
				}
				}
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(714); match(QUESTION);
			setState(716);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(715); wildcardBounds();
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
			setState(722);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(718); match(EXTENDS);
				setState(719); referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(720); match(SUPER);
				setState(721); referenceType();
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
			setState(725); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(732);
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
					setState(727);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(728); match(DOT);
					setState(729); match(Identifier);
					}
					} 
				}
				setState(734);
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
			setState(740);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736); packageOrTypeName(0);
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
			setState(743); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(750);
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
					setState(745);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(746); match(DOT);
					setState(747); match(Identifier);
					}
					} 
				}
				setState(752);
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
			setState(758);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754); ambiguousName(0);
				setState(755); match(DOT);
				setState(756); match(Identifier);
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
			setState(760); match(Identifier);
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
			setState(763); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(770);
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
					setState(765);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(766); match(DOT);
					setState(767); match(Identifier);
					}
					} 
				}
				setState(772);
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
			setState(774);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(773); packageDeclaration();
				}
				break;
			}
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(776); importDeclaration();
				}
				}
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(782); typeDeclaration();
				}
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(788); match(EOF);
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
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(790); packageModifier();
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(796); match(PACKAGE);
			setState(797); match(Identifier);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(798); match(DOT);
				setState(799); match(Identifier);
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			setState(807); annotation();
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
			setState(813);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(809); singleTypeImportDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(810); typeImportOnDemandDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(811); singleStaticImportDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(812); staticImportOnDemandDeclaration();
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
			setState(815); match(IMPORT);
			setState(816); typeName();
			setState(817); match(SEMI);
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
			setState(819); match(IMPORT);
			setState(820); packageOrTypeName(0);
			setState(821); match(DOT);
			setState(822); match(MUL);
			setState(823); match(SEMI);
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
			setState(825); match(IMPORT);
			setState(826); match(STATIC);
			setState(827); typeName();
			setState(828); match(DOT);
			setState(829); match(Identifier);
			setState(830); match(SEMI);
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
			setState(832); match(IMPORT);
			setState(833); match(STATIC);
			setState(834); typeName();
			setState(835); match(DOT);
			setState(836); match(MUL);
			setState(837); match(SEMI);
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
			setState(842);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839); classDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840); interfaceDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(841); match(SEMI);
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
			setState(846);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(844); normalClassDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(845); enumDeclaration();
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
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(848); classModifier();
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(854); match(CLASS);
			setState(855); match(Identifier);
			setState(857);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(856); typeParameters();
				}
			}

			setState(860);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(859); superclass();
				}
			}

			setState(863);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(862); superinterfaces();
				}
			}

			setState(865); classBody();
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
			setState(875);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(867); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(868); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(869); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(870); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(871); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(872); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(873); match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(874); match(STRICTFP);
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
			setState(877); match(LT);
			setState(878); typeParameterList();
			setState(879); match(GT);
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
			setState(881); typeParameter();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(882); match(COMMA);
				setState(883); typeParameter();
				}
				}
				setState(888);
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
			setState(889); match(EXTENDS);
			setState(890); classType();
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
			setState(892); match(IMPLEMENTS);
			setState(893); interfaceTypeList();
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
			setState(895); interfaceType();
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(896); match(COMMA);
				setState(897); interfaceType();
				}
				}
				setState(902);
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
			setState(903); match(LBRACE);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (LBRACE - 87)) | (1L << (SEMI - 87)) | (1L << (LT - 87)) | (1L << (Identifier - 87)) | (1L << (AT - 87)))) != 0)) {
				{
				{
				setState(904); classBodyDeclaration();
				}
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(910); match(RBRACE);
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
			setState(916);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(912); classMemberDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(913); instanceInitializer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(914); staticInitializer();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(915); constructorDeclaration();
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
			setState(923);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918); fieldDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919); methodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(920); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(921); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(922); match(SEMI);
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
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(925); fieldModifier();
				}
				}
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(931); unannType();
			setState(932); variableDeclaratorList();
			setState(933); match(SEMI);
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
			setState(943);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(935); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(936); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(937); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(938); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(939); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(940); match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(941); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(942); match(VOLATILE);
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
			setState(945); variableDeclarator();
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(946); match(COMMA);
				setState(947); variableDeclarator();
				}
				}
				setState(952);
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
			setState(953); variableDeclaratorId();
			setState(956);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(954); match(ASSIGN);
				setState(955); variableInitializer();
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
			setState(958); match(Identifier);
			setState(960);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(959); dims();
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
			setState(964);
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
				setState(962); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(963); arrayInitializer();
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
			setState(968);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(966); unannPrimitiveType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967); unannReferenceType();
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
			setState(972);
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
				setState(970); numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(971); match(BOOLEAN);
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
			setState(977);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(974); unannClassOrInterfaceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(975); unannTypeVariable();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(976); unannArrayType();
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
			setState(981);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(979); unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;

			case 2:
				{
				setState(980); unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(987);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(985);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(983); unannClassType_lf_unannClassOrInterfaceType();
						}
						break;

					case 2:
						{
						setState(984); unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(989);
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
			setState(1006);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(990); match(Identifier);
				setState(992);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(991); typeArguments();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994); unannClassOrInterfaceType();
				setState(995); match(DOT);
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(996); annotation();
					}
					}
					setState(1001);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1002); match(Identifier);
				setState(1004);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1003); typeArguments();
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
			setState(1008); match(DOT);
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1009); annotation();
				}
				}
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1015); match(Identifier);
			setState(1017);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1016); typeArguments();
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
			setState(1019); match(Identifier);
			setState(1021);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1020); typeArguments();
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
			setState(1023); unannClassType();
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
			setState(1025); unannClassType_lf_unannClassOrInterfaceType();
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
			setState(1027); unannClassType_lfno_unannClassOrInterfaceType();
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
			setState(1029); match(Identifier);
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
			setState(1040);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1031); unannPrimitiveType();
				setState(1032); dims();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034); unannClassOrInterfaceType();
				setState(1035); dims();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1037); unannTypeVariable();
				setState(1038); dims();
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
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(1042); methodModifier();
				}
				}
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1048); methodHeader();
			setState(1049); methodBody();
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
			setState(1061);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1053); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1054); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1055); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1056); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1057); match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1058); match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1059); match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1060); match(STRICTFP);
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
			setState(1080);
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
				setState(1063); result();
				setState(1064); methodDeclarator();
				setState(1066);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1065); throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068); typeParameters();
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1069); annotation();
					}
					}
					setState(1074);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1075); result();
				setState(1076); methodDeclarator();
				setState(1078);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1077); throws_();
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
			setState(1084);
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
				setState(1082); unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1083); match(VOID);
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
			setState(1086); match(Identifier);
			setState(1087); match(LPAREN);
			setState(1089);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1088); formalParameterList();
				}
			}

			setState(1091); match(RPAREN);
			setState(1093);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1092); dims();
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
			setState(1100);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1095); formalParameters();
				setState(1096); match(COMMA);
				setState(1097); lastFormalParameter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099); lastFormalParameter();
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
			setState(1118);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1102); formalParameter();
				setState(1107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1103); match(COMMA);
						setState(1104); formalParameter();
						}
						} 
					}
					setState(1109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1110); receiverParameter();
				setState(1115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1111); match(COMMA);
						setState(1112); formalParameter();
						}
						} 
					}
					setState(1117);
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
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1120); variableModifier();
				}
				}
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1126); unannType();
			setState(1127); variableDeclaratorId();
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
			setState(1131);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129); annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130); match(FINAL);
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
			setState(1150);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1133); variableModifier();
					}
					}
					setState(1138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1139); unannType();
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1140); annotation();
					}
					}
					setState(1145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1146); match(ELLIPSIS);
				setState(1147); variableDeclaratorId();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149); formalParameter();
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
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1152); annotation();
				}
				}
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1158); unannType();
			setState(1161);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1159); match(Identifier);
				setState(1160); match(DOT);
				}
			}

			setState(1163); match(THIS);
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
			setState(1165); match(THROWS);
			setState(1166); exceptionTypeList();
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
			setState(1168); exceptionType();
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1169); match(COMMA);
				setState(1170); exceptionType();
				}
				}
				setState(1175);
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
			setState(1178);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1176); classType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1177); typeVariable();
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
			setState(1182);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181); match(SEMI);
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
			setState(1184); block();
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
			setState(1186); match(STATIC);
			setState(1187); block();
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
			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1189); constructorModifier();
				}
				}
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1195); constructorDeclarator();
			setState(1197);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1196); throws_();
				}
			}

			setState(1199); constructorBody();
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
			setState(1205);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1201); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1202); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1203); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1204); match(PRIVATE);
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
			setState(1208);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1207); typeParameters();
				}
			}

			setState(1210); simpleTypeName();
			setState(1211); match(LPAREN);
			setState(1213);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1212); formalParameterList();
				}
			}

			setState(1215); match(RPAREN);
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
			setState(1217); match(Identifier);
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
			setState(1219); match(LBRACE);
			setState(1221);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1220); explicitConstructorInvocation();
				}
				break;
			}
			setState(1224);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OPENMP_PRAGMA))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (LBRACE - 79)) | (1L << (SEMI - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1223); blockStatements();
				}
			}

			setState(1226); match(RBRACE);
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
			setState(1274);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1228); typeArguments();
					}
				}

				setState(1231); match(THIS);
				setState(1232); match(LPAREN);
				setState(1234);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(1233); argumentList();
					}
				}

				setState(1236); match(RPAREN);
				setState(1237); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1239);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1238); typeArguments();
					}
				}

				setState(1241); match(SUPER);
				setState(1242); match(LPAREN);
				setState(1244);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(1243); argumentList();
					}
				}

				setState(1246); match(RPAREN);
				setState(1247); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1248); expressionName();
				setState(1249); match(DOT);
				setState(1251);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1250); typeArguments();
					}
				}

				setState(1253); match(SUPER);
				setState(1254); match(LPAREN);
				setState(1256);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(1255); argumentList();
					}
				}

				setState(1258); match(RPAREN);
				setState(1259); match(SEMI);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1261); primary();
				setState(1262); match(DOT);
				setState(1264);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1263); typeArguments();
					}
				}

				setState(1266); match(SUPER);
				setState(1267); match(LPAREN);
				setState(1269);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(1268); argumentList();
					}
				}

				setState(1271); match(RPAREN);
				setState(1272); match(SEMI);
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
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1276); classModifier();
				}
				}
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1282); match(ENUM);
			setState(1283); match(Identifier);
			setState(1285);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1284); superinterfaces();
				}
			}

			setState(1287); enumBody();
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
			setState(1289); match(LBRACE);
			setState(1291);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1290); enumConstantList();
				}
			}

			setState(1294);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1293); match(COMMA);
				}
			}

			setState(1297);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1296); enumBodyDeclarations();
				}
			}

			setState(1299); match(RBRACE);
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
			setState(1301); enumConstant();
			setState(1306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1302); match(COMMA);
					setState(1303); enumConstant();
					}
					} 
				}
				setState(1308);
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
			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1309); enumConstantModifier();
				}
				}
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1315); match(Identifier);
			setState(1321);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1316); match(LPAREN);
				setState(1318);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(1317); argumentList();
					}
				}

				setState(1320); match(RPAREN);
				}
			}

			setState(1324);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1323); classBody();
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
			setState(1326); annotation();
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
			setState(1328); match(SEMI);
			setState(1332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (LBRACE - 87)) | (1L << (SEMI - 87)) | (1L << (LT - 87)) | (1L << (Identifier - 87)) | (1L << (AT - 87)))) != 0)) {
				{
				{
				setState(1329); classBodyDeclaration();
				}
				}
				setState(1334);
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
			setState(1337);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1335); normalInterfaceDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1336); annotationTypeDeclaration();
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
			setState(1342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1339); interfaceModifier();
				}
				}
				setState(1344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1345); match(INTERFACE);
			setState(1346); match(Identifier);
			setState(1348);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1347); typeParameters();
				}
			}

			setState(1351);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1350); extendsInterfaces();
				}
			}

			setState(1353); interfaceBody();
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
			setState(1362);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1355); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1356); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1357); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1358); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1359); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1360); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1361); match(STRICTFP);
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
			setState(1364); match(EXTENDS);
			setState(1365); interfaceTypeList();
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
			setState(1367); match(LBRACE);
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (SEMI - 91)) | (1L << (LT - 91)) | (1L << (Identifier - 91)) | (1L << (AT - 91)))) != 0)) {
				{
				{
				setState(1368); interfaceMemberDeclaration();
				}
				}
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1374); match(RBRACE);
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
			setState(1381);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376); constantDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377); interfaceMethodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1378); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1379); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1380); match(SEMI);
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
			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1383); constantModifier();
				}
				}
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1389); unannType();
			setState(1390); variableDeclaratorList();
			setState(1391); match(SEMI);
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
			setState(1397);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1394); match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1395); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1396); match(FINAL);
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
			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1399); interfaceMethodModifier();
				}
				}
				setState(1404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1405); methodHeader();
			setState(1406); methodBody();
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
			setState(1414);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1408); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1409); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1410); match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1411); match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1412); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1413); match(STRICTFP);
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
			setState(1419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1416); interfaceModifier();
					}
					} 
				}
				setState(1421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1422); match(AT);
			setState(1423); match(INTERFACE);
			setState(1424); match(Identifier);
			setState(1425); annotationTypeBody();
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
			setState(1427); match(LBRACE);
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (SEMI - 91)) | (1L << (Identifier - 91)) | (1L << (AT - 91)))) != 0)) {
				{
				{
				setState(1428); annotationTypeMemberDeclaration();
				}
				}
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1434); match(RBRACE);
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
			setState(1441);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1436); annotationTypeElementDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1437); constantDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1438); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1439); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1440); match(SEMI);
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
			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1443); annotationTypeElementModifier();
				}
				}
				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1449); unannType();
			setState(1450); match(Identifier);
			setState(1451); match(LPAREN);
			setState(1452); match(RPAREN);
			setState(1454);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1453); dims();
				}
			}

			setState(1457);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1456); defaultValue();
				}
			}

			setState(1459); match(SEMI);
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
			setState(1464);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1461); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1462); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1463); match(ABSTRACT);
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
			setState(1466); match(DEFAULT);
			setState(1467); elementValue();
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
			setState(1472);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469); normalAnnotation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470); markerAnnotation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1471); singleElementAnnotation();
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
			setState(1474); match(AT);
			setState(1475); typeName();
			setState(1476); match(LPAREN);
			setState(1478);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1477); elementValuePairList();
				}
			}

			setState(1480); match(RPAREN);
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
			setState(1482); elementValuePair();
			setState(1487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1483); match(COMMA);
				setState(1484); elementValuePair();
				}
				}
				setState(1489);
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
			setState(1490); match(Identifier);
			setState(1491); match(ASSIGN);
			setState(1492); elementValue();
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
			setState(1497);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1494); conditionalExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1495); elementValueArrayInitializer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1496); annotation();
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
			setState(1499); match(LBRACE);
			setState(1501);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (LBRACE - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1500); elementValueList();
				}
			}

			setState(1504);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1503); match(COMMA);
				}
			}

			setState(1506); match(RBRACE);
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
			setState(1508); elementValue();
			setState(1513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1509); match(COMMA);
					setState(1510); elementValue();
					}
					} 
				}
				setState(1515);
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
			setState(1516); match(AT);
			setState(1517); typeName();
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
			setState(1519); match(AT);
			setState(1520); typeName();
			setState(1521); match(LPAREN);
			setState(1522); elementValue();
			setState(1523); match(RPAREN);
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
			setState(1525); match(LBRACE);
			setState(1527);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (LBRACE - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1526); variableInitializerList();
				}
			}

			setState(1530);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1529); match(COMMA);
				}
			}

			setState(1532); match(RBRACE);
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
			setState(1534); variableInitializer();
			setState(1539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1535); match(COMMA);
					setState(1536); variableInitializer();
					}
					} 
				}
				setState(1541);
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
			setState(1542); match(LBRACE);
			setState(1544);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OPENMP_PRAGMA))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (LBRACE - 79)) | (1L << (SEMI - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1543); blockStatements();
				}
			}

			setState(1546); match(RBRACE);
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
			setState(1548); blockStatement();
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OPENMP_PRAGMA))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (LBRACE - 79)) | (1L << (SEMI - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				{
				setState(1549); blockStatement();
				}
				}
				setState(1554);
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
			setState(1558);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1555); localVariableDeclarationStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1556); classDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1557); statement();
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
			setState(1560); localVariableDeclaration();
			setState(1561); match(SEMI);
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
			setState(1566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1563); variableModifier();
				}
				}
				setState(1568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1569); unannType();
			setState(1570); variableDeclaratorList();
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
			setState(1578);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1572); statementWithoutTrailingSubstatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1573); labeledStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1574); ifThenStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1575); ifThenElseStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1576); whileStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1577); forStatement();
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
			setState(1585);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1580); statementWithoutTrailingSubstatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1581); labeledStatementNoShortIf();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1582); ifThenElseStatementNoShortIf();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1583); whileStatementNoShortIf();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1584); forStatementNoShortIf();
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
			setState(1600);
			switch (_input.LA(1)) {
			case OPENMP_PRAGMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1587); openmpStatement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1588); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1589); emptyStatement();
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
				enterOuterAlt(_localctx, 4);
				{
				setState(1590); expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1591); assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(1592); switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 7);
				{
				setState(1593); doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 8);
				{
				setState(1594); breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1595); continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 10);
				{
				setState(1596); returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 11);
				{
				setState(1597); synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 12);
				{
				setState(1598); throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 13);
				{
				setState(1599); tryStatement();
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
			setState(1602); match(SEMI);
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
			setState(1604); match(Identifier);
			setState(1605); match(COLON);
			setState(1606); statement();
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
			setState(1608); match(Identifier);
			setState(1609); match(COLON);
			setState(1610); statementNoShortIf();
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
			setState(1612); statementExpression();
			setState(1613); match(SEMI);
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
			setState(1622);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1615); assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1616); preIncrementExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1617); preDecrementExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1618); postIncrementExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1619); postDecrementExpression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1620); methodInvocation();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1621); classInstanceCreationExpression();
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
			setState(1624); match(IF);
			setState(1625); match(LPAREN);
			setState(1626); expression();
			setState(1627); match(RPAREN);
			setState(1628); statement();
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
			setState(1630); match(IF);
			setState(1631); match(LPAREN);
			setState(1632); expression();
			setState(1633); match(RPAREN);
			setState(1634); statementNoShortIf();
			setState(1635); match(ELSE);
			setState(1636); statement();
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
			setState(1638); match(IF);
			setState(1639); match(LPAREN);
			setState(1640); expression();
			setState(1641); match(RPAREN);
			setState(1642); statementNoShortIf();
			setState(1643); match(ELSE);
			setState(1644); statementNoShortIf();
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
			setState(1656);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1646); match(ASSERT);
				setState(1647); expression();
				setState(1648); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1650); match(ASSERT);
				setState(1651); expression();
				setState(1652); match(COLON);
				setState(1653); expression();
				setState(1654); match(SEMI);
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
			setState(1658); match(SWITCH);
			setState(1659); match(LPAREN);
			setState(1660); expression();
			setState(1661); match(RPAREN);
			setState(1662); switchBlock();
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
			setState(1664); match(LBRACE);
			setState(1668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1665); switchBlockStatementGroup();
					}
					} 
				}
				setState(1670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			setState(1674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1671); switchLabel();
				}
				}
				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1677); match(RBRACE);
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
			setState(1679); switchLabels();
			setState(1680); blockStatements();
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
			setState(1682); switchLabel();
			setState(1686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1683); switchLabel();
				}
				}
				setState(1688);
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
			setState(1699);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1689); match(CASE);
				setState(1690); constantExpression();
				setState(1691); match(COLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1693); match(CASE);
				setState(1694); enumConstantName();
				setState(1695); match(COLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1697); match(DEFAULT);
				setState(1698); match(COLON);
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
			setState(1701); match(Identifier);
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
			setState(1703); match(WHILE);
			setState(1704); match(LPAREN);
			setState(1705); expression();
			setState(1706); match(RPAREN);
			setState(1707); statement();
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
			setState(1709); match(WHILE);
			setState(1710); match(LPAREN);
			setState(1711); expression();
			setState(1712); match(RPAREN);
			setState(1713); statementNoShortIf();
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
			setState(1715); match(DO);
			setState(1716); statement();
			setState(1717); match(WHILE);
			setState(1718); match(LPAREN);
			setState(1719); expression();
			setState(1720); match(RPAREN);
			setState(1721); match(SEMI);
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
			setState(1725);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1723); basicForStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1724); enhancedForStatement();
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
			setState(1729);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1727); basicForStatementNoShortIf();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1728); enhancedForStatementNoShortIf();
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
			setState(1731); match(FOR);
			setState(1732); match(LPAREN);
			setState(1734);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1733); forInit();
				}
			}

			setState(1736); match(SEMI);
			setState(1738);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1737); expression();
				}
			}

			setState(1740); match(SEMI);
			setState(1742);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1741); forUpdate();
				}
			}

			setState(1744); match(RPAREN);
			setState(1745); statement();
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
			setState(1747); match(FOR);
			setState(1748); match(LPAREN);
			setState(1750);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1749); forInit();
				}
			}

			setState(1752); match(SEMI);
			setState(1754);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1753); expression();
				}
			}

			setState(1756); match(SEMI);
			setState(1758);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1757); forUpdate();
				}
			}

			setState(1760); match(RPAREN);
			setState(1761); statementNoShortIf();
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
			setState(1765);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1763); statementExpressionList();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1764); localVariableDeclaration();
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
			setState(1767); statementExpressionList();
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
			setState(1769); statementExpression();
			setState(1774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1770); match(COMMA);
				setState(1771); statementExpression();
				}
				}
				setState(1776);
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
			setState(1777); match(FOR);
			setState(1778); match(LPAREN);
			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1779); variableModifier();
				}
				}
				setState(1784);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1785); unannType();
			setState(1786); variableDeclaratorId();
			setState(1787); match(COLON);
			setState(1788); expression();
			setState(1789); match(RPAREN);
			setState(1790); statement();
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
			setState(1792); match(FOR);
			setState(1793); match(LPAREN);
			setState(1797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1794); variableModifier();
				}
				}
				setState(1799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1800); unannType();
			setState(1801); variableDeclaratorId();
			setState(1802); match(COLON);
			setState(1803); expression();
			setState(1804); match(RPAREN);
			setState(1805); statementNoShortIf();
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
			setState(1807); match(BREAK);
			setState(1809);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1808); match(Identifier);
				}
			}

			setState(1811); match(SEMI);
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
			setState(1813); match(CONTINUE);
			setState(1815);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1814); match(Identifier);
				}
			}

			setState(1817); match(SEMI);
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
			setState(1819); match(RETURN);
			setState(1821);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1820); expression();
				}
			}

			setState(1823); match(SEMI);
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
			setState(1825); match(THROW);
			setState(1826); expression();
			setState(1827); match(SEMI);
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
			setState(1829); match(SYNCHRONIZED);
			setState(1830); match(LPAREN);
			setState(1831); expression();
			setState(1832); match(RPAREN);
			setState(1833); block();
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
			setState(1847);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1835); match(TRY);
				setState(1836); block();
				setState(1837); catches();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1839); match(TRY);
				setState(1840); block();
				setState(1842);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1841); catches();
					}
				}

				setState(1844); finally_();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1846); tryWithResourcesStatement();
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
			setState(1849); catchClause();
			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1850); catchClause();
				}
				}
				setState(1855);
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
			setState(1856); match(CATCH);
			setState(1857); match(LPAREN);
			setState(1858); catchFormalParameter();
			setState(1859); match(RPAREN);
			setState(1860); block();
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
			setState(1865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1862); variableModifier();
				}
				}
				setState(1867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1868); catchType();
			setState(1869); variableDeclaratorId();
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
			setState(1871); unannClassType();
			setState(1876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1872); match(BITOR);
				setState(1873); classType();
				}
				}
				setState(1878);
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
			setState(1879); match(FINALLY);
			setState(1880); block();
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
			setState(1882); match(TRY);
			setState(1883); resourceSpecification();
			setState(1884); block();
			setState(1886);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1885); catches();
				}
			}

			setState(1889);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1888); finally_();
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
			setState(1891); match(LPAREN);
			setState(1892); resourceList();
			setState(1894);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1893); match(SEMI);
				}
			}

			setState(1896); match(RPAREN);
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
			setState(1898); resource();
			setState(1903);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1899); match(SEMI);
					setState(1900); resource();
					}
					} 
				}
				setState(1905);
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
			setState(1909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1906); variableModifier();
				}
				}
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1912); unannType();
			setState(1913); variableDeclaratorId();
			setState(1914); match(ASSIGN);
			setState(1915); expression();
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
		public OpenmpConstructContext openmpConstruct() {
			return getRuleContext(OpenmpConstructContext.class,0);
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
			setState(1917); match(OPENMP_PRAGMA);
			setState(1918); openmpConstruct();
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

	public static class OpenmpConstructContext extends ParserRuleContext {
		public OmpFlushDirectiveContext ompFlushDirective() {
			return getRuleContext(OmpFlushDirectiveContext.class,0);
		}
		public OmpParallelSectionsConstructContext ompParallelSectionsConstruct() {
			return getRuleContext(OmpParallelSectionsConstructContext.class,0);
		}
		public OmpFreeguiConstructContext ompFreeguiConstruct() {
			return getRuleContext(OmpFreeguiConstructContext.class,0);
		}
		public OmpGuiConstructContext ompGuiConstruct() {
			return getRuleContext(OmpGuiConstructContext.class,0);
		}
		public OmpSingleConstructContext ompSingleConstruct() {
			return getRuleContext(OmpSingleConstructContext.class,0);
		}
		public OmpSectionConstructContext ompSectionConstruct() {
			return getRuleContext(OmpSectionConstructContext.class,0);
		}
		public OmpCriticalConstructContext ompCriticalConstruct() {
			return getRuleContext(OmpCriticalConstructContext.class,0);
		}
		public OmpMasterConstructContext ompMasterConstruct() {
			return getRuleContext(OmpMasterConstructContext.class,0);
		}
		public OmpParallelForConstructContext ompParallelForConstruct() {
			return getRuleContext(OmpParallelForConstructContext.class,0);
		}
		public OmpForConstructContext ompForConstruct() {
			return getRuleContext(OmpForConstructContext.class,0);
		}
		public OmpOrderedConstructContext ompOrderedConstruct() {
			return getRuleContext(OmpOrderedConstructContext.class,0);
		}
		public OmpBarrierDirectiveContext ompBarrierDirective() {
			return getRuleContext(OmpBarrierDirectiveContext.class,0);
		}
		public OmpParallelConstructContext ompParallelConstruct() {
			return getRuleContext(OmpParallelConstructContext.class,0);
		}
		public OmpSectionsConstructContext ompSectionsConstruct() {
			return getRuleContext(OmpSectionsConstructContext.class,0);
		}
		public OmpAtomicConstructContext ompAtomicConstruct() {
			return getRuleContext(OmpAtomicConstructContext.class,0);
		}
		public OpenmpConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openmpConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOpenmpConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOpenmpConstruct(this);
		}
	}

	public final OpenmpConstructContext openmpConstruct() throws RecognitionException {
		OpenmpConstructContext _localctx = new OpenmpConstructContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_openmpConstruct);
		try {
			setState(1935);
			switch (_input.LA(1)) {
			case PARALLEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920); ompParallelConstruct();
				}
				break;
			case PARALLEL_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1921); ompParallelForConstruct();
				}
				break;
			case PARALLEL_SECTIONS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1922); ompParallelSectionsConstruct();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1923); ompForConstruct();
				}
				break;
			case SECTIONS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1924); ompSectionsConstruct();
				}
				break;
			case FREEGUI:
				enterOuterAlt(_localctx, 6);
				{
				setState(1925); ompFreeguiConstruct();
				}
				break;
			case SECTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(1926); ompSectionConstruct();
				}
				break;
			case GUI:
				enterOuterAlt(_localctx, 8);
				{
				setState(1927); ompGuiConstruct();
				}
				break;
			case SINGLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1928); ompSingleConstruct();
				}
				break;
			case MASTER:
				enterOuterAlt(_localctx, 10);
				{
				setState(1929); ompMasterConstruct();
				}
				break;
			case CRITICAL:
				enterOuterAlt(_localctx, 11);
				{
				setState(1930); ompCriticalConstruct();
				}
				break;
			case ATOMIC:
				enterOuterAlt(_localctx, 12);
				{
				setState(1931); ompAtomicConstruct();
				}
				break;
			case BARRIER:
				enterOuterAlt(_localctx, 13);
				{
				setState(1932); ompBarrierDirective();
				}
				break;
			case FLUSH:
				enterOuterAlt(_localctx, 14);
				{
				setState(1933); ompFlushDirective();
				}
				break;
			case ORDERED:
				enterOuterAlt(_localctx, 15);
				{
				setState(1934); ompOrderedConstruct();
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

	public static class OmpParallelConstructContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
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
		public TerminalNode PARALLEL() { return getToken(Java8Parser.PARALLEL, 0); }
		public OmpDataClauseContext ompDataClause(int i) {
			return getRuleContext(OmpDataClauseContext.class,i);
		}
		public OmpParallelConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpParallelConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpParallelConstruct(this);
		}
	}

	public final OmpParallelConstructContext ompParallelConstruct() throws RecognitionException {
		OmpParallelConstructContext _localctx = new OmpParallelConstructContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_ompParallelConstruct);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1937); match(PARALLEL);
			setState(1951);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1949);
					switch (_input.LA(1)) {
					case IF:
						{
						setState(1938); match(IF);
						setState(1939); match(LPAREN);
						setState(1940); expression();
						setState(1941); match(RPAREN);
						}
						break;
					case NUMTHREADS:
						{
						setState(1943); match(NUMTHREADS);
						setState(1944); match(LPAREN);
						setState(1945); expression();
						setState(1946); match(RPAREN);
						}
						break;
					case DEFAULT:
					case PRIVATE:
					case LASTPRIVATE:
					case SHARED:
					case REDUCTION:
					case COPYPRIVATE:
						{
						setState(1948); ompDataClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1953);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			}
			setState(1954); statement();
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

	public static class OmpParallelForConstructContext extends ParserRuleContext {
		public List<TerminalNode> NUMTHREADS() { return getTokens(Java8Parser.NUMTHREADS); }
		public TerminalNode IF(int i) {
			return getToken(Java8Parser.IF, i);
		}
		public List<OmpDataClauseContext> ompDataClause() {
			return getRuleContexts(OmpDataClauseContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<OmpScheduleClauseContext> ompScheduleClause() {
			return getRuleContexts(OmpScheduleClauseContext.class);
		}
		public List<TerminalNode> ORDERED() { return getTokens(Java8Parser.ORDERED); }
		public List<TerminalNode> IF() { return getTokens(Java8Parser.IF); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PARALLEL_FOR() { return getToken(Java8Parser.PARALLEL_FOR, 0); }
		public TerminalNode NUMTHREADS(int i) {
			return getToken(Java8Parser.NUMTHREADS, i);
		}
		public OmpScheduleClauseContext ompScheduleClause(int i) {
			return getRuleContext(OmpScheduleClauseContext.class,i);
		}
		public TerminalNode ORDERED(int i) {
			return getToken(Java8Parser.ORDERED, i);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public OmpDataClauseContext ompDataClause(int i) {
			return getRuleContext(OmpDataClauseContext.class,i);
		}
		public OmpParallelForConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelForConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpParallelForConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpParallelForConstruct(this);
		}
	}

	public final OmpParallelForConstructContext ompParallelForConstruct() throws RecognitionException {
		OmpParallelForConstructContext _localctx = new OmpParallelForConstructContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_ompParallelForConstruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956); match(PARALLEL_FOR);
			setState(1972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFAULT) | (1L << IF) | (1L << PRIVATE) | (1L << LASTPRIVATE) | (1L << SHARED) | (1L << REDUCTION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SCHEDULE - 64)) | (1L << (ORDERED - 64)) | (1L << (NUMTHREADS - 64)) | (1L << (COPYPRIVATE - 64)))) != 0)) {
				{
				setState(1970);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(1957); match(IF);
					setState(1958); match(LPAREN);
					setState(1959); expression();
					setState(1960); match(RPAREN);
					}
					break;
				case NUMTHREADS:
					{
					setState(1962); match(NUMTHREADS);
					setState(1963); match(LPAREN);
					setState(1964); expression();
					setState(1965); match(RPAREN);
					}
					break;
				case ORDERED:
					{
					setState(1967); match(ORDERED);
					}
					break;
				case DEFAULT:
				case PRIVATE:
				case LASTPRIVATE:
				case SHARED:
				case REDUCTION:
				case COPYPRIVATE:
					{
					setState(1968); ompDataClause();
					}
					break;
				case SCHEDULE:
					{
					setState(1969); ompScheduleClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1975); forStatement();
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

	public static class OmpParallelSectionsConstructContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
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
		public TerminalNode PARALLEL_SECTIONS() { return getToken(Java8Parser.PARALLEL_SECTIONS, 0); }
		public OmpDataClauseContext ompDataClause(int i) {
			return getRuleContext(OmpDataClauseContext.class,i);
		}
		public OmpParallelSectionsConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelSectionsConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpParallelSectionsConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpParallelSectionsConstruct(this);
		}
	}

	public final OmpParallelSectionsConstructContext ompParallelSectionsConstruct() throws RecognitionException {
		OmpParallelSectionsConstructContext _localctx = new OmpParallelSectionsConstructContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_ompParallelSectionsConstruct);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1977); match(PARALLEL_SECTIONS);
			setState(1991);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1989);
					switch (_input.LA(1)) {
					case IF:
						{
						setState(1978); match(IF);
						setState(1979); match(LPAREN);
						setState(1980); expression();
						setState(1981); match(RPAREN);
						}
						break;
					case NUMTHREADS:
						{
						setState(1983); match(NUMTHREADS);
						setState(1984); match(LPAREN);
						setState(1985); expression();
						setState(1986); match(RPAREN);
						}
						break;
					case DEFAULT:
					case PRIVATE:
					case LASTPRIVATE:
					case SHARED:
					case REDUCTION:
					case COPYPRIVATE:
						{
						setState(1988); ompDataClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			setState(1994); statement();
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

	public static class OmpForConstructContext extends ParserRuleContext {
		public List<TerminalNode> NUMTHREADS() { return getTokens(Java8Parser.NUMTHREADS); }
		public TerminalNode NOWAIT(int i) {
			return getToken(Java8Parser.NOWAIT, i);
		}
		public List<OmpDataClauseContext> ompDataClause() {
			return getRuleContexts(OmpDataClauseContext.class);
		}
		public TerminalNode IF(int i) {
			return getToken(Java8Parser.IF, i);
		}
		public List<TerminalNode> NOWAIT() { return getTokens(Java8Parser.NOWAIT); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<OmpScheduleClauseContext> ompScheduleClause() {
			return getRuleContexts(OmpScheduleClauseContext.class);
		}
		public List<TerminalNode> ORDERED() { return getTokens(Java8Parser.ORDERED); }
		public List<TerminalNode> IF() { return getTokens(Java8Parser.IF); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode NUMTHREADS(int i) {
			return getToken(Java8Parser.NUMTHREADS, i);
		}
		public OmpScheduleClauseContext ompScheduleClause(int i) {
			return getRuleContext(OmpScheduleClauseContext.class,i);
		}
		public TerminalNode ORDERED(int i) {
			return getToken(Java8Parser.ORDERED, i);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public OmpDataClauseContext ompDataClause(int i) {
			return getRuleContext(OmpDataClauseContext.class,i);
		}
		public OmpForConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompForConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpForConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpForConstruct(this);
		}
	}

	public final OmpForConstructContext ompForConstruct() throws RecognitionException {
		OmpForConstructContext _localctx = new OmpForConstructContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_ompForConstruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996); match(FOR);
			setState(2013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFAULT) | (1L << IF) | (1L << PRIVATE) | (1L << LASTPRIVATE) | (1L << SHARED) | (1L << REDUCTION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SCHEDULE - 64)) | (1L << (ORDERED - 64)) | (1L << (NOWAIT - 64)) | (1L << (NUMTHREADS - 64)) | (1L << (COPYPRIVATE - 64)))) != 0)) {
				{
				setState(2011);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(1997); match(IF);
					setState(1998); match(LPAREN);
					setState(1999); expression();
					setState(2000); match(RPAREN);
					}
					break;
				case NUMTHREADS:
					{
					setState(2002); match(NUMTHREADS);
					setState(2003); match(LPAREN);
					setState(2004); expression();
					setState(2005); match(RPAREN);
					}
					break;
				case NOWAIT:
					{
					setState(2007); match(NOWAIT);
					}
					break;
				case ORDERED:
					{
					setState(2008); match(ORDERED);
					}
					break;
				case DEFAULT:
				case PRIVATE:
				case LASTPRIVATE:
				case SHARED:
				case REDUCTION:
				case COPYPRIVATE:
					{
					setState(2009); ompDataClause();
					}
					break;
				case SCHEDULE:
					{
					setState(2010); ompScheduleClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2016); forStatement();
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

	public static class OmpSectionsConstructContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NOWAIT(int i) {
			return getToken(Java8Parser.NOWAIT, i);
		}
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
		public List<TerminalNode> NOWAIT() { return getTokens(Java8Parser.NOWAIT); }
		public TerminalNode SECTIONS() { return getToken(Java8Parser.SECTIONS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OmpDataClauseContext ompDataClause(int i) {
			return getRuleContext(OmpDataClauseContext.class,i);
		}
		public OmpSectionsConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSectionsConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpSectionsConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpSectionsConstruct(this);
		}
	}

	public final OmpSectionsConstructContext ompSectionsConstruct() throws RecognitionException {
		OmpSectionsConstructContext _localctx = new OmpSectionsConstructContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_ompSectionsConstruct);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2018); match(SECTIONS);
			setState(2033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2031);
					switch (_input.LA(1)) {
					case IF:
						{
						setState(2019); match(IF);
						setState(2020); match(LPAREN);
						setState(2021); expression();
						setState(2022); match(RPAREN);
						}
						break;
					case NUMTHREADS:
						{
						setState(2024); match(NUMTHREADS);
						setState(2025); match(LPAREN);
						setState(2026); expression();
						setState(2027); match(RPAREN);
						}
						break;
					case NOWAIT:
						{
						setState(2029); match(NOWAIT);
						}
						break;
					case DEFAULT:
					case PRIVATE:
					case LASTPRIVATE:
					case SHARED:
					case REDUCTION:
					case COPYPRIVATE:
						{
						setState(2030); ompDataClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			setState(2036); statement();
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

	public static class OmpFreeguiConstructContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NUMTHREADS() { return getToken(Java8Parser.NUMTHREADS, 0); }
		public TerminalNode IF() { return getToken(Java8Parser.IF, 0); }
		public OmpDataClauseContext ompDataClause() {
			return getRuleContext(OmpDataClauseContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> PARALLEL() { return getTokens(Java8Parser.PARALLEL); }
		public TerminalNode PARALLEL(int i) {
			return getToken(Java8Parser.PARALLEL, i);
		}
		public TerminalNode FREEGUI() { return getToken(Java8Parser.FREEGUI, 0); }
		public OmpFreeguiConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompFreeguiConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpFreeguiConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpFreeguiConstruct(this);
		}
	}

	public final OmpFreeguiConstructContext ompFreeguiConstruct() throws RecognitionException {
		OmpFreeguiConstructContext _localctx = new OmpFreeguiConstructContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_ompFreeguiConstruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038); match(FREEGUI);
			setState(2042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARALLEL) {
				{
				{
				setState(2039); match(PARALLEL);
				}
				}
				setState(2044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2056);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(2045); match(IF);
				setState(2046); match(LPAREN);
				setState(2047); expression();
				setState(2048); match(RPAREN);
				}
				break;
			case NUMTHREADS:
				{
				setState(2050); match(NUMTHREADS);
				setState(2051); match(LPAREN);
				setState(2052); expression();
				setState(2053); match(RPAREN);
				}
				break;
			case DEFAULT:
			case PRIVATE:
			case LASTPRIVATE:
			case SHARED:
			case REDUCTION:
			case COPYPRIVATE:
				{
				setState(2055); ompDataClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2058); statement();
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

	public static class OmpSectionConstructContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
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
		public TerminalNode SECTION() { return getToken(Java8Parser.SECTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OmpDataClauseContext ompDataClause(int i) {
			return getRuleContext(OmpDataClauseContext.class,i);
		}
		public OmpSectionConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSectionConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpSectionConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpSectionConstruct(this);
		}
	}

	public final OmpSectionConstructContext ompSectionConstruct() throws RecognitionException {
		OmpSectionConstructContext _localctx = new OmpSectionConstructContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_ompSectionConstruct);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2060); match(SECTION);
			setState(2074);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2072);
					switch (_input.LA(1)) {
					case IF:
						{
						setState(2061); match(IF);
						setState(2062); match(LPAREN);
						setState(2063); expression();
						setState(2064); match(RPAREN);
						}
						break;
					case NUMTHREADS:
						{
						setState(2066); match(NUMTHREADS);
						setState(2067); match(LPAREN);
						setState(2068); expression();
						setState(2069); match(RPAREN);
						}
						break;
					case DEFAULT:
					case PRIVATE:
					case LASTPRIVATE:
					case SHARED:
					case REDUCTION:
					case COPYPRIVATE:
						{
						setState(2071); ompDataClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2076);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			}
			setState(2077); statement();
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

	public static class OmpGuiConstructContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode GUI() { return getToken(Java8Parser.GUI, 0); }
		public OmpGuiConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompGuiConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpGuiConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpGuiConstruct(this);
		}
	}

	public final OmpGuiConstructContext ompGuiConstruct() throws RecognitionException {
		OmpGuiConstructContext _localctx = new OmpGuiConstructContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_ompGuiConstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2079); match(GUI);
			setState(2080); statement();
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

	public static class OmpSingleConstructContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public OmpDataClauseContext ompDataClause() {
			return getRuleContext(OmpDataClauseContext.class,0);
		}
		public TerminalNode NOWAIT() { return getToken(Java8Parser.NOWAIT, 0); }
		public TerminalNode SINGLE() { return getToken(Java8Parser.SINGLE, 0); }
		public OmpSingleConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSingleConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpSingleConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpSingleConstruct(this);
		}
	}

	public final OmpSingleConstructContext ompSingleConstruct() throws RecognitionException {
		OmpSingleConstructContext _localctx = new OmpSingleConstructContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_ompSingleConstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2082); match(SINGLE);
			setState(2085);
			switch (_input.LA(1)) {
			case NOWAIT:
				{
				setState(2083); match(NOWAIT);
				}
				break;
			case DEFAULT:
			case PRIVATE:
			case LASTPRIVATE:
			case SHARED:
			case REDUCTION:
			case COPYPRIVATE:
				{
				setState(2084); ompDataClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2087); statement();
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

	public static class OmpMasterConstructContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode MASTER() { return getToken(Java8Parser.MASTER, 0); }
		public OmpMasterConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompMasterConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpMasterConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpMasterConstruct(this);
		}
	}

	public final OmpMasterConstructContext ompMasterConstruct() throws RecognitionException {
		OmpMasterConstructContext _localctx = new OmpMasterConstructContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_ompMasterConstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089); match(MASTER);
			setState(2090); statement();
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

	public static class OmpCriticalConstructContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode CRITICAL() { return getToken(Java8Parser.CRITICAL, 0); }
		public OmpCriticalConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompCriticalConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpCriticalConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpCriticalConstruct(this);
		}
	}

	public final OmpCriticalConstructContext ompCriticalConstruct() throws RecognitionException {
		OmpCriticalConstructContext _localctx = new OmpCriticalConstructContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_ompCriticalConstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2092); match(CRITICAL);
			setState(2096);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(2093); match(LPAREN);
				setState(2094); match(Identifier);
				setState(2095); match(RPAREN);
				}
				break;
			}
			setState(2098); statement();
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

	public static class OmpAtomicConstructContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ATOMIC() { return getToken(Java8Parser.ATOMIC, 0); }
		public OmpAtomicConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompAtomicConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpAtomicConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpAtomicConstruct(this);
		}
	}

	public final OmpAtomicConstructContext ompAtomicConstruct() throws RecognitionException {
		OmpAtomicConstructContext _localctx = new OmpAtomicConstructContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_ompAtomicConstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2100); match(ATOMIC);
			setState(2101); statement();
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
			setState(2103); match(BARRIER);
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
			setState(2105); match(FLUSH);
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

	public static class OmpOrderedConstructContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ORDERED() { return getToken(Java8Parser.ORDERED, 0); }
		public OmpOrderedConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompOrderedConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpOrderedConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpOrderedConstruct(this);
		}
	}

	public final OmpOrderedConstructContext ompOrderedConstruct() throws RecognitionException {
		OmpOrderedConstructContext _localctx = new OmpOrderedConstructContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_ompOrderedConstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2107); match(ORDERED);
			setState(2108); statement();
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

	public static class OmpScheduleClauseContext extends ParserRuleContext {
		public TerminalNode GUIDED() { return getToken(Java8Parser.GUIDED, 0); }
		public TerminalNode DYNAMIC() { return getToken(Java8Parser.DYNAMIC, 0); }
		public TerminalNode SCHEDULE() { return getToken(Java8Parser.SCHEDULE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public OmpScheduleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompScheduleClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpScheduleClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpScheduleClause(this);
		}
	}

	public final OmpScheduleClauseContext ompScheduleClause() throws RecognitionException {
		OmpScheduleClauseContext _localctx = new OmpScheduleClauseContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_ompScheduleClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2110); match(SCHEDULE);
			setState(2111); match(LPAREN);
			setState(2112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << STATIC))) != 0) || _la==DYNAMIC || _la==GUIDED) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(2115);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2113); match(COMMA);
				setState(2114); expression();
				}
			}

			setState(2117); match(RPAREN);
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
		public OmpDefaultDataClauseContext ompDefaultDataClause() {
			return getRuleContext(OmpDefaultDataClauseContext.class,0);
		}
		public OmpReductionDataClauseContext ompReductionDataClause() {
			return getRuleContext(OmpReductionDataClauseContext.class,0);
		}
		public OmpPrivateClauseContext ompPrivateClause() {
			return getRuleContext(OmpPrivateClauseContext.class,0);
		}
		public OmpLastprivateDataClauseContext ompLastprivateDataClause() {
			return getRuleContext(OmpLastprivateDataClauseContext.class,0);
		}
		public OmpCopyprivateDataClauseContext ompCopyprivateDataClause() {
			return getRuleContext(OmpCopyprivateDataClauseContext.class,0);
		}
		public OmpSharedDataClauseContext ompSharedDataClause() {
			return getRuleContext(OmpSharedDataClauseContext.class,0);
		}
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
		enterRule(_localctx, 388, RULE_ompDataClause);
		try {
			setState(2125);
			switch (_input.LA(1)) {
			case PRIVATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2119); ompPrivateClause();
				}
				break;
			case SHARED:
				enterOuterAlt(_localctx, 2);
				{
				setState(2120); ompSharedDataClause();
				}
				break;
			case LASTPRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2121); ompLastprivateDataClause();
				}
				break;
			case REDUCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(2122); ompReductionDataClause();
				}
				break;
			case COPYPRIVATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2123); ompCopyprivateDataClause();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2124); ompDefaultDataClause();
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

	public static class OmpPrivateClauseContext extends ParserRuleContext {
		public OmpDataClauseArgumentListContext ompDataClauseArgumentList() {
			return getRuleContext(OmpDataClauseArgumentListContext.class,0);
		}
		public TerminalNode PRIVATE() { return getToken(Java8Parser.PRIVATE, 0); }
		public OmpPrivateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompPrivateClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpPrivateClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpPrivateClause(this);
		}
	}

	public final OmpPrivateClauseContext ompPrivateClause() throws RecognitionException {
		OmpPrivateClauseContext _localctx = new OmpPrivateClauseContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_ompPrivateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127); match(PRIVATE);
			setState(2128); match(LPAREN);
			setState(2129); ompDataClauseArgumentList();
			setState(2130); match(RPAREN);
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

	public static class OmpSharedDataClauseContext extends ParserRuleContext {
		public OmpDataClauseArgumentListContext ompDataClauseArgumentList() {
			return getRuleContext(OmpDataClauseArgumentListContext.class,0);
		}
		public TerminalNode SHARED() { return getToken(Java8Parser.SHARED, 0); }
		public OmpSharedDataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSharedDataClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpSharedDataClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpSharedDataClause(this);
		}
	}

	public final OmpSharedDataClauseContext ompSharedDataClause() throws RecognitionException {
		OmpSharedDataClauseContext _localctx = new OmpSharedDataClauseContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_ompSharedDataClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2132); match(SHARED);
			setState(2133); match(LPAREN);
			setState(2134); ompDataClauseArgumentList();
			setState(2135); match(RPAREN);
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

	public static class OmpLastprivateDataClauseContext extends ParserRuleContext {
		public OmpDataClauseArgumentListContext ompDataClauseArgumentList() {
			return getRuleContext(OmpDataClauseArgumentListContext.class,0);
		}
		public TerminalNode LASTPRIVATE() { return getToken(Java8Parser.LASTPRIVATE, 0); }
		public OmpLastprivateDataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompLastprivateDataClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpLastprivateDataClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpLastprivateDataClause(this);
		}
	}

	public final OmpLastprivateDataClauseContext ompLastprivateDataClause() throws RecognitionException {
		OmpLastprivateDataClauseContext _localctx = new OmpLastprivateDataClauseContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_ompLastprivateDataClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2137); match(LASTPRIVATE);
			setState(2138); match(LPAREN);
			setState(2139); ompDataClauseArgumentList();
			setState(2140); match(RPAREN);
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

	public static class OmpReductionDataClauseContext extends ParserRuleContext {
		public TerminalNode REDUCTION() { return getToken(Java8Parser.REDUCTION, 0); }
		public OmpDataClauseReductionArgumentListContext ompDataClauseReductionArgumentList() {
			return getRuleContext(OmpDataClauseReductionArgumentListContext.class,0);
		}
		public OmpReductionDataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompReductionDataClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpReductionDataClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpReductionDataClause(this);
		}
	}

	public final OmpReductionDataClauseContext ompReductionDataClause() throws RecognitionException {
		OmpReductionDataClauseContext _localctx = new OmpReductionDataClauseContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_ompReductionDataClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2142); match(REDUCTION);
			setState(2143); match(LPAREN);
			setState(2144); ompDataClauseReductionArgumentList();
			setState(2145); match(RPAREN);
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

	public static class OmpCopyprivateDataClauseContext extends ParserRuleContext {
		public OmpDataClauseArgumentListContext ompDataClauseArgumentList() {
			return getRuleContext(OmpDataClauseArgumentListContext.class,0);
		}
		public TerminalNode COPYPRIVATE() { return getToken(Java8Parser.COPYPRIVATE, 0); }
		public OmpCopyprivateDataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompCopyprivateDataClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpCopyprivateDataClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpCopyprivateDataClause(this);
		}
	}

	public final OmpCopyprivateDataClauseContext ompCopyprivateDataClause() throws RecognitionException {
		OmpCopyprivateDataClauseContext _localctx = new OmpCopyprivateDataClauseContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_ompCopyprivateDataClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2147); match(COPYPRIVATE);
			setState(2148); match(LPAREN);
			setState(2149); ompDataClauseArgumentList();
			setState(2150); match(RPAREN);
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

	public static class OmpDefaultDataClauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(Java8Parser.DEFAULT, 0); }
		public TerminalNode NONE() { return getToken(Java8Parser.NONE, 0); }
		public TerminalNode SHARED() { return getToken(Java8Parser.SHARED, 0); }
		public OmpDefaultDataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompDefaultDataClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpDefaultDataClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpDefaultDataClause(this);
		}
	}

	public final OmpDefaultDataClauseContext ompDefaultDataClause() throws RecognitionException {
		OmpDefaultDataClauseContext _localctx = new OmpDefaultDataClauseContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_ompDefaultDataClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2152); match(DEFAULT);
			setState(2153); match(LPAREN);
			setState(2154);
			_la = _input.LA(1);
			if ( !(_la==SHARED || _la==NONE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(2155); match(RPAREN);
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

	public static class OmpDataClauseArgumentListContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public OmpDataClauseArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompDataClauseArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpDataClauseArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpDataClauseArgumentList(this);
		}
	}

	public final OmpDataClauseArgumentListContext ompDataClauseArgumentList() throws RecognitionException {
		OmpDataClauseArgumentListContext _localctx = new OmpDataClauseArgumentListContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_ompDataClauseArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157); match(Identifier);
			setState(2162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2158); match(COMMA);
				setState(2159); match(Identifier);
				}
				}
				setState(2164);
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

	public static class OmpDataClauseReductionArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OmpDataClauseReductionArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompDataClauseReductionArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterOmpDataClauseReductionArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitOmpDataClauseReductionArgumentList(this);
		}
	}

	public final OmpDataClauseReductionArgumentListContext ompDataClauseReductionArgumentList() throws RecognitionException {
		OmpDataClauseReductionArgumentListContext _localctx = new OmpDataClauseReductionArgumentListContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_ompDataClauseReductionArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2165); expression();
			setState(2166); match(Identifier);
			setState(2173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2167); match(COMMA);
				setState(2168); expression();
				setState(2169); match(Identifier);
				}
				}
				setState(2175);
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
		enterRule(_localctx, 406, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2178);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(2176); primaryNoNewArray_lfno_primary();
				}
				break;

			case 2:
				{
				setState(2177); arrayCreationExpression();
				}
				break;
			}
			setState(2183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2180); primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(2185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
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
		enterRule(_localctx, 408, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(2215);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2186); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2187); typeName();
				setState(2192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2188); match(LBRACK);
					setState(2189); match(RBRACK);
					}
					}
					setState(2194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2195); match(DOT);
				setState(2196); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2198); match(VOID);
				setState(2199); match(DOT);
				setState(2200); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2201); match(THIS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2202); typeName();
				setState(2203); match(DOT);
				setState(2204); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2206); match(LPAREN);
				setState(2207); expression();
				setState(2208); match(RPAREN);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2210); classInstanceCreationExpression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2211); fieldAccess();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2212); arrayAccess();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2213); methodInvocation();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2214); methodReference();
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
		enterRule(_localctx, 410, RULE_primaryNoNewArray_lf_arrayAccess);
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
		enterRule(_localctx, 412, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(2247);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2219); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2220); typeName();
				setState(2225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2221); match(LBRACK);
					setState(2222); match(RBRACK);
					}
					}
					setState(2227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2228); match(DOT);
				setState(2229); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2231); match(VOID);
				setState(2232); match(DOT);
				setState(2233); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2234); match(THIS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2235); typeName();
				setState(2236); match(DOT);
				setState(2237); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2239); match(LPAREN);
				setState(2240); expression();
				setState(2241); match(RPAREN);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2243); classInstanceCreationExpression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2244); fieldAccess();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2245); methodInvocation();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2246); methodReference();
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
		enterRule(_localctx, 414, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(2254);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2249); classInstanceCreationExpression_lf_primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2250); fieldAccess_lf_primary();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2251); arrayAccess_lf_primary();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2252); methodInvocation_lf_primary();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2253); methodReference_lf_primary();
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
		enterRule(_localctx, 416, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
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
		enterRule(_localctx, 418, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(2262);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2258); classInstanceCreationExpression_lf_primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2259); fieldAccess_lf_primary();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2260); methodInvocation_lf_primary();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2261); methodReference_lf_primary();
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
		enterRule(_localctx, 420, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2304);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2264); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2265); typeName();
				setState(2270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2266); match(LBRACK);
					setState(2267); match(RBRACK);
					}
					}
					setState(2272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2273); match(DOT);
				setState(2274); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2276); unannPrimitiveType();
				setState(2281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2277); match(LBRACK);
					setState(2278); match(RBRACK);
					}
					}
					setState(2283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2284); match(DOT);
				setState(2285); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2287); match(VOID);
				setState(2288); match(DOT);
				setState(2289); match(CLASS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2290); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2291); typeName();
				setState(2292); match(DOT);
				setState(2293); match(THIS);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2295); match(LPAREN);
				setState(2296); expression();
				setState(2297); match(RPAREN);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2299); classInstanceCreationExpression_lfno_primary();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2300); fieldAccess_lfno_primary();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2301); arrayAccess_lfno_primary();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2302); methodInvocation_lfno_primary();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2303); methodReference_lfno_primary();
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
		enterRule(_localctx, 422, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
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
		enterRule(_localctx, 424, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2347);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2308); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2309); typeName();
				setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2310); match(LBRACK);
					setState(2311); match(RBRACK);
					}
					}
					setState(2316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2317); match(DOT);
				setState(2318); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2320); unannPrimitiveType();
				setState(2325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2321); match(LBRACK);
					setState(2322); match(RBRACK);
					}
					}
					setState(2327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2328); match(DOT);
				setState(2329); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2331); match(VOID);
				setState(2332); match(DOT);
				setState(2333); match(CLASS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2334); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2335); typeName();
				setState(2336); match(DOT);
				setState(2337); match(THIS);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2339); match(LPAREN);
				setState(2340); expression();
				setState(2341); match(RPAREN);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2343); classInstanceCreationExpression_lfno_primary();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2344); fieldAccess_lfno_primary();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2345); methodInvocation_lfno_primary();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2346); methodReference_lfno_primary();
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
		enterRule(_localctx, 426, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2432);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2349); match(NEW);
				setState(2351);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2350); typeArguments();
					}
				}

				setState(2356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2353); annotation();
					}
					}
					setState(2358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2359); match(Identifier);
				setState(2370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2360); match(DOT);
					setState(2364);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2361); annotation();
						}
						}
						setState(2366);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2367); match(Identifier);
					}
					}
					setState(2372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2374);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2373); typeArgumentsOrDiamond();
					}
				}

				setState(2376); match(LPAREN);
				setState(2378);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2377); argumentList();
					}
				}

				setState(2380); match(RPAREN);
				setState(2382);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2381); classBody();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2384); expressionName();
				setState(2385); match(DOT);
				setState(2386); match(NEW);
				setState(2388);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2387); typeArguments();
					}
				}

				setState(2393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2390); annotation();
					}
					}
					setState(2395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2396); match(Identifier);
				setState(2398);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2397); typeArgumentsOrDiamond();
					}
				}

				setState(2400); match(LPAREN);
				setState(2402);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2401); argumentList();
					}
				}

				setState(2404); match(RPAREN);
				setState(2406);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2405); classBody();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2408); primary();
				setState(2409); match(DOT);
				setState(2410); match(NEW);
				setState(2412);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2411); typeArguments();
					}
				}

				setState(2417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2414); annotation();
					}
					}
					setState(2419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2420); match(Identifier);
				setState(2422);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2421); typeArgumentsOrDiamond();
					}
				}

				setState(2424); match(LPAREN);
				setState(2426);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2425); argumentList();
					}
				}

				setState(2428); match(RPAREN);
				setState(2430);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2429); classBody();
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
		enterRule(_localctx, 428, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2434); match(DOT);
			setState(2435); match(NEW);
			setState(2437);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2436); typeArguments();
				}
			}

			setState(2442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2439); annotation();
				}
				}
				setState(2444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2445); match(Identifier);
			setState(2447);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2446); typeArgumentsOrDiamond();
				}
			}

			setState(2449); match(LPAREN);
			setState(2451);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2450); argumentList();
				}
			}

			setState(2453); match(RPAREN);
			setState(2455);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2454); classBody();
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
		enterRule(_localctx, 430, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2516);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2457); match(NEW);
				setState(2459);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2458); typeArguments();
					}
				}

				setState(2464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2461); annotation();
					}
					}
					setState(2466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2467); match(Identifier);
				setState(2478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2468); match(DOT);
					setState(2472);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2469); annotation();
						}
						}
						setState(2474);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2475); match(Identifier);
					}
					}
					setState(2480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2482);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2481); typeArgumentsOrDiamond();
					}
				}

				setState(2484); match(LPAREN);
				setState(2486);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2485); argumentList();
					}
				}

				setState(2488); match(RPAREN);
				setState(2490);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2489); classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2492); expressionName();
				setState(2493); match(DOT);
				setState(2494); match(NEW);
				setState(2496);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2495); typeArguments();
					}
				}

				setState(2501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2498); annotation();
					}
					}
					setState(2503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2504); match(Identifier);
				setState(2506);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2505); typeArgumentsOrDiamond();
					}
				}

				setState(2508); match(LPAREN);
				setState(2510);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2509); argumentList();
					}
				}

				setState(2512); match(RPAREN);
				setState(2514);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2513); classBody();
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
		enterRule(_localctx, 432, RULE_typeArgumentsOrDiamond);
		try {
			setState(2521);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2518); typeArguments();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2519); match(LT);
				setState(2520); match(GT);
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
		enterRule(_localctx, 434, RULE_fieldAccess);
		try {
			setState(2536);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2523); primary();
				setState(2524); match(DOT);
				setState(2525); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2527); match(SUPER);
				setState(2528); match(DOT);
				setState(2529); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2530); typeName();
				setState(2531); match(DOT);
				setState(2532); match(SUPER);
				setState(2533); match(DOT);
				setState(2534); match(Identifier);
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
		enterRule(_localctx, 436, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2538); match(DOT);
			setState(2539); match(Identifier);
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
		enterRule(_localctx, 438, RULE_fieldAccess_lfno_primary);
		try {
			setState(2550);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2541); match(SUPER);
				setState(2542); match(DOT);
				setState(2543); match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2544); typeName();
				setState(2545); match(DOT);
				setState(2546); match(SUPER);
				setState(2547); match(DOT);
				setState(2548); match(Identifier);
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
		enterRule(_localctx, 440, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2562);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(2552); expressionName();
				setState(2553); match(LBRACK);
				setState(2554); expression();
				setState(2555); match(RBRACK);
				}
				break;

			case 2:
				{
				setState(2557); primaryNoNewArray_lfno_arrayAccess();
				setState(2558); match(LBRACK);
				setState(2559); expression();
				setState(2560); match(RBRACK);
				}
				break;
			}
			setState(2571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2564); primaryNoNewArray_lf_arrayAccess();
				setState(2565); match(LBRACK);
				setState(2566); expression();
				setState(2567); match(RBRACK);
				}
				}
				setState(2573);
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
		enterRule(_localctx, 442, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2574); primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2575); match(LBRACK);
			setState(2576); expression();
			setState(2577); match(RBRACK);
			}
			setState(2586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2579); primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2580); match(LBRACK);
					setState(2581); expression();
					setState(2582); match(RBRACK);
					}
					} 
				}
				setState(2588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
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
		enterRule(_localctx, 444, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(2589); expressionName();
				setState(2590); match(LBRACK);
				setState(2591); expression();
				setState(2592); match(RBRACK);
				}
				break;

			case 2:
				{
				setState(2594); primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2595); match(LBRACK);
				setState(2596); expression();
				setState(2597); match(RBRACK);
				}
				break;
			}
			setState(2608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2601); primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2602); match(LBRACK);
					setState(2603); expression();
					setState(2604); match(RBRACK);
					}
					} 
				}
				setState(2610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
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
		enterRule(_localctx, 446, RULE_methodInvocation);
		int _la;
		try {
			setState(2679);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2611); methodName();
				setState(2612); match(LPAREN);
				setState(2614);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2613); argumentList();
					}
				}

				setState(2616); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2618); typeName();
				setState(2619); match(DOT);
				setState(2621);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2620); typeArguments();
					}
				}

				setState(2623); match(Identifier);
				setState(2624); match(LPAREN);
				setState(2626);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2625); argumentList();
					}
				}

				setState(2628); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2630); expressionName();
				setState(2631); match(DOT);
				setState(2633);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2632); typeArguments();
					}
				}

				setState(2635); match(Identifier);
				setState(2636); match(LPAREN);
				setState(2638);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2637); argumentList();
					}
				}

				setState(2640); match(RPAREN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2642); primary();
				setState(2643); match(DOT);
				setState(2645);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2644); typeArguments();
					}
				}

				setState(2647); match(Identifier);
				setState(2648); match(LPAREN);
				setState(2650);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2649); argumentList();
					}
				}

				setState(2652); match(RPAREN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2654); match(SUPER);
				setState(2655); match(DOT);
				setState(2657);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2656); typeArguments();
					}
				}

				setState(2659); match(Identifier);
				setState(2660); match(LPAREN);
				setState(2662);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2661); argumentList();
					}
				}

				setState(2664); match(RPAREN);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2665); typeName();
				setState(2666); match(DOT);
				setState(2667); match(SUPER);
				setState(2668); match(DOT);
				setState(2670);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2669); typeArguments();
					}
				}

				setState(2672); match(Identifier);
				setState(2673); match(LPAREN);
				setState(2675);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2674); argumentList();
					}
				}

				setState(2677); match(RPAREN);
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
		enterRule(_localctx, 448, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2681); match(DOT);
			setState(2683);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2682); typeArguments();
				}
			}

			setState(2685); match(Identifier);
			setState(2686); match(LPAREN);
			setState(2688);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2687); argumentList();
				}
			}

			setState(2690); match(RPAREN);
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
		enterRule(_localctx, 450, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2748);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2692); methodName();
				setState(2693); match(LPAREN);
				setState(2695);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2694); argumentList();
					}
				}

				setState(2697); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2699); typeName();
				setState(2700); match(DOT);
				setState(2702);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2701); typeArguments();
					}
				}

				setState(2704); match(Identifier);
				setState(2705); match(LPAREN);
				setState(2707);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2706); argumentList();
					}
				}

				setState(2709); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2711); expressionName();
				setState(2712); match(DOT);
				setState(2714);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2713); typeArguments();
					}
				}

				setState(2716); match(Identifier);
				setState(2717); match(LPAREN);
				setState(2719);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2718); argumentList();
					}
				}

				setState(2721); match(RPAREN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2723); match(SUPER);
				setState(2724); match(DOT);
				setState(2726);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2725); typeArguments();
					}
				}

				setState(2728); match(Identifier);
				setState(2729); match(LPAREN);
				setState(2731);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2730); argumentList();
					}
				}

				setState(2733); match(RPAREN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2734); typeName();
				setState(2735); match(DOT);
				setState(2736); match(SUPER);
				setState(2737); match(DOT);
				setState(2739);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2738); typeArguments();
					}
				}

				setState(2741); match(Identifier);
				setState(2742); match(LPAREN);
				setState(2744);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2743); argumentList();
					}
				}

				setState(2746); match(RPAREN);
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
		enterRule(_localctx, 452, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2750); expression();
			setState(2755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2751); match(COMMA);
				setState(2752); expression();
				}
				}
				setState(2757);
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
		enterRule(_localctx, 454, RULE_methodReference);
		int _la;
		try {
			setState(2805);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2758); expressionName();
				setState(2759); match(COLONCOLON);
				setState(2761);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2760); typeArguments();
					}
				}

				setState(2763); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2765); referenceType();
				setState(2766); match(COLONCOLON);
				setState(2768);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2767); typeArguments();
					}
				}

				setState(2770); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2772); primary();
				setState(2773); match(COLONCOLON);
				setState(2775);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2774); typeArguments();
					}
				}

				setState(2777); match(Identifier);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2779); match(SUPER);
				setState(2780); match(COLONCOLON);
				setState(2782);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2781); typeArguments();
					}
				}

				setState(2784); match(Identifier);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2785); typeName();
				setState(2786); match(DOT);
				setState(2787); match(SUPER);
				setState(2788); match(COLONCOLON);
				setState(2790);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2789); typeArguments();
					}
				}

				setState(2792); match(Identifier);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2794); classType();
				setState(2795); match(COLONCOLON);
				setState(2797);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2796); typeArguments();
					}
				}

				setState(2799); match(NEW);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2801); arrayType();
				setState(2802); match(COLONCOLON);
				setState(2803); match(NEW);
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
		enterRule(_localctx, 456, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2807); match(COLONCOLON);
			setState(2809);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2808); typeArguments();
				}
			}

			setState(2811); match(Identifier);
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
		enterRule(_localctx, 458, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2853);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2813); expressionName();
				setState(2814); match(COLONCOLON);
				setState(2816);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2815); typeArguments();
					}
				}

				setState(2818); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2820); referenceType();
				setState(2821); match(COLONCOLON);
				setState(2823);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2822); typeArguments();
					}
				}

				setState(2825); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2827); match(SUPER);
				setState(2828); match(COLONCOLON);
				setState(2830);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2829); typeArguments();
					}
				}

				setState(2832); match(Identifier);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2833); typeName();
				setState(2834); match(DOT);
				setState(2835); match(SUPER);
				setState(2836); match(COLONCOLON);
				setState(2838);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2837); typeArguments();
					}
				}

				setState(2840); match(Identifier);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2842); classType();
				setState(2843); match(COLONCOLON);
				setState(2845);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2844); typeArguments();
					}
				}

				setState(2847); match(NEW);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2849); arrayType();
				setState(2850); match(COLONCOLON);
				setState(2851); match(NEW);
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
		enterRule(_localctx, 460, RULE_arrayCreationExpression);
		try {
			setState(2877);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2855); match(NEW);
				setState(2856); primitiveType();
				setState(2857); dimExprs();
				setState(2859);
				switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
				case 1:
					{
					setState(2858); dims();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2861); match(NEW);
				setState(2862); classOrInterfaceType();
				setState(2863); dimExprs();
				setState(2865);
				switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
				case 1:
					{
					setState(2864); dims();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2867); match(NEW);
				setState(2868); primitiveType();
				setState(2869); dims();
				setState(2870); arrayInitializer();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2872); match(NEW);
				setState(2873); classOrInterfaceType();
				setState(2874); dims();
				setState(2875); arrayInitializer();
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
		enterRule(_localctx, 462, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2879); dimExpr();
			setState(2883);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2880); dimExpr();
					}
					} 
				}
				setState(2885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
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
		enterRule(_localctx, 464, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2886); annotation();
				}
				}
				setState(2891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2892); match(LBRACK);
			setState(2893); expression();
			setState(2894); match(RBRACK);
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
		enterRule(_localctx, 466, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2896); expression();
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
		enterRule(_localctx, 468, RULE_expression);
		try {
			setState(2900);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2898); lambdaExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2899); assignmentExpression();
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
		enterRule(_localctx, 470, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2902); lambdaParameters();
			setState(2903); match(ARROW);
			setState(2904); lambdaBody();
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
		enterRule(_localctx, 472, RULE_lambdaParameters);
		int _la;
		try {
			setState(2916);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2906); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2907); match(LPAREN);
				setState(2909);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2908); formalParameterList();
					}
				}

				setState(2911); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2912); match(LPAREN);
				setState(2913); inferredFormalParameterList();
				setState(2914); match(RPAREN);
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
		enterRule(_localctx, 474, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2918); match(Identifier);
			setState(2923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2919); match(COMMA);
				setState(2920); match(Identifier);
				}
				}
				setState(2925);
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
		enterRule(_localctx, 476, RULE_lambdaBody);
		try {
			setState(2928);
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
				setState(2926); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2927); block();
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
		enterRule(_localctx, 478, RULE_assignmentExpression);
		try {
			setState(2932);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2930); conditionalExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2931); assignment();
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
		enterRule(_localctx, 480, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2934); leftHandSide();
			setState(2935); assignmentOperator();
			setState(2936); expression();
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
		enterRule(_localctx, 482, RULE_leftHandSide);
		try {
			setState(2941);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2938); expressionName();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2939); fieldAccess();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2940); arrayAccess();
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
		enterRule(_localctx, 484, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2943);
			_la = _input.LA(1);
			if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ASSIGN - 94)) | (1L << (ADD_ASSIGN - 94)) | (1L << (SUB_ASSIGN - 94)) | (1L << (MUL_ASSIGN - 94)) | (1L << (DIV_ASSIGN - 94)) | (1L << (AND_ASSIGN - 94)) | (1L << (OR_ASSIGN - 94)) | (1L << (XOR_ASSIGN - 94)) | (1L << (MOD_ASSIGN - 94)) | (1L << (LSHIFT_ASSIGN - 94)) | (1L << (RSHIFT_ASSIGN - 94)) | (1L << (URSHIFT_ASSIGN - 94)))) != 0)) ) {
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
		enterRule(_localctx, 486, RULE_conditionalExpression);
		try {
			setState(2952);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2945); conditionalOrExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2946); conditionalOrExpression(0);
				setState(2947); match(QUESTION);
				setState(2948); expression();
				setState(2949); match(COLON);
				setState(2950); conditionalExpression();
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
		int _startState = 488;
		enterRecursionRule(_localctx, 488, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2955); conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2962);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2957);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2958); match(OR);
					setState(2959); conditionalAndExpression(0);
					}
					} 
				}
				setState(2964);
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
		int _startState = 490;
		enterRecursionRule(_localctx, 490, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2966); inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2968);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2969); match(AND);
					setState(2970); inclusiveOrExpression(0);
					}
					} 
				}
				setState(2975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
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
		int _startState = 492;
		enterRecursionRule(_localctx, 492, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2977); exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2979);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2980); match(BITOR);
					setState(2981); exclusiveOrExpression(0);
					}
					} 
				}
				setState(2986);
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
		int _startState = 494;
		enterRecursionRule(_localctx, 494, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2988); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2995);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2990);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2991); match(CARET);
					setState(2992); andExpression(0);
					}
					} 
				}
				setState(2997);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
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
		int _startState = 496;
		enterRecursionRule(_localctx, 496, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2999); equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(3006);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(3001);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3002); match(BITAND);
					setState(3003); equalityExpression(0);
					}
					} 
				}
				setState(3008);
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
		int _startState = 498;
		enterRecursionRule(_localctx, 498, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3010); relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(3020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3018);
					switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(3012);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3013); match(EQUAL);
						setState(3014); relationalExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(3015);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3016); match(NOTEQUAL);
						setState(3017); relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(3022);
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
		int _startState = 500;
		enterRecursionRule(_localctx, 500, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3024); shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(3043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3041);
					switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3026);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(3027); match(LT);
						setState(3028); shiftExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3029);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(3030); match(GT);
						setState(3031); shiftExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3032);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3033); match(LE);
						setState(3034); shiftExpression(0);
						}
						break;

					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3035);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3036); match(GE);
						setState(3037); shiftExpression(0);
						}
						break;

					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3038);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3039); match(INSTANCEOF);
						setState(3040); referenceType();
						}
						break;
					}
					} 
				}
				setState(3045);
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
		int _startState = 502;
		enterRecursionRule(_localctx, 502, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3047); additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(3064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3062);
					switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(3049);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3050); match(LT);
						setState(3051); match(LT);
						setState(3052); additiveExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(3053);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3054); match(GT);
						setState(3055); match(GT);
						setState(3056); additiveExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(3057);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3058); match(GT);
						setState(3059); match(GT);
						setState(3060); match(GT);
						setState(3061); additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(3066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
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
		int _startState = 504;
		enterRecursionRule(_localctx, 504, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3068); multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(3078);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3076);
					switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(3070);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3071); match(ADD);
						setState(3072); multiplicativeExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(3073);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3074); match(SUB);
						setState(3075); multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(3080);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
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
		int _startState = 506;
		enterRecursionRule(_localctx, 506, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3082); unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(3095);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3093);
					switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(3084);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3085); match(MUL);
						setState(3086); unaryExpression();
						}
						break;

					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(3087);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3088); match(DIV);
						setState(3089); unaryExpression();
						}
						break;

					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(3090);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3091); match(MOD);
						setState(3092); unaryExpression();
						}
						break;
					}
					} 
				}
				setState(3097);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
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
		enterRule(_localctx, 508, RULE_unaryExpression);
		try {
			setState(3105);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(3098); preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(3099); preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(3100); match(ADD);
				setState(3101); unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(3102); match(SUB);
				setState(3103); unaryExpression();
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
				setState(3104); unaryExpressionNotPlusMinus();
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
		enterRule(_localctx, 510, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3107); match(INC);
			setState(3108); unaryExpression();
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
		enterRule(_localctx, 512, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3110); match(DEC);
			setState(3111); unaryExpression();
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
		enterRule(_localctx, 514, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(3119);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3113); postfixExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3114); match(TILDE);
				setState(3115); unaryExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3116); match(BANG);
				setState(3117); unaryExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3118); castExpression();
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
		enterRule(_localctx, 516, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3123);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				setState(3121); primary();
				}
				break;

			case 2:
				{
				setState(3122); expressionName();
				}
				break;
			}
			setState(3129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(3127);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(3125); postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(3126); postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(3131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
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
		enterRule(_localctx, 518, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3132); postfixExpression();
			setState(3133); match(INC);
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
		enterRule(_localctx, 520, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3135); match(INC);
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
		enterRule(_localctx, 522, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3137); postfixExpression();
			setState(3138); match(DEC);
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
		enterRule(_localctx, 524, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3140); match(DEC);
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
		enterRule(_localctx, 526, RULE_castExpression);
		int _la;
		try {
			setState(3169);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3142); match(LPAREN);
				setState(3143); primitiveType();
				setState(3144); match(RPAREN);
				setState(3145); unaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3147); match(LPAREN);
				setState(3148); referenceType();
				setState(3152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3149); additionalBound();
					}
					}
					setState(3154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3155); match(RPAREN);
				setState(3156); unaryExpressionNotPlusMinus();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3158); match(LPAREN);
				setState(3159); referenceType();
				setState(3163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3160); additionalBound();
					}
					}
					setState(3165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3166); match(RPAREN);
				setState(3167); lambdaExpression();
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

		case 244: return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);

		case 245: return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);

		case 246: return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);

		case 247: return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);

		case 248: return andExpression_sempred((AndExpressionContext)_localctx, predIndex);

		case 249: return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);

		case 250: return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);

		case 251: return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);

		case 252: return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);

		case 253: return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0089\u0c66\4\2\t"+
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
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\4\u0108\t\u0108\4\u0109\t\u0109\3\2\3\2\3\3\3\3\5\3\u0217\n\3\3\4\7\4"+
		"\u021a\n\4\f\4\16\4\u021d\13\4\3\4\3\4\7\4\u0221\n\4\f\4\16\4\u0224\13"+
		"\4\3\4\5\4\u0227\n\4\3\5\3\5\5\5\u022b\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\5\b\u0234\n\b\3\t\3\t\5\t\u0238\n\t\3\t\3\t\7\t\u023c\n\t\f\t\16\t\u023f"+
		"\13\t\3\n\7\n\u0242\n\n\f\n\16\n\u0245\13\n\3\n\3\n\5\n\u0249\n\n\3\n"+
		"\3\n\3\n\7\n\u024e\n\n\f\n\16\n\u0251\13\n\3\n\3\n\5\n\u0255\n\n\5\n\u0257"+
		"\n\n\3\13\3\13\7\13\u025b\n\13\f\13\16\13\u025e\13\13\3\13\3\13\5\13\u0262"+
		"\n\13\3\f\7\f\u0265\n\f\f\f\16\f\u0268\13\f\3\f\3\f\5\f\u026c\n\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\7\20\u0275\n\20\f\20\16\20\u0278\13\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0285\n\21"+
		"\3\22\7\22\u0288\n\22\f\22\16\22\u028b\13\22\3\22\3\22\3\22\7\22\u0290"+
		"\n\22\f\22\16\22\u0293\13\22\3\22\3\22\7\22\u0297\n\22\f\22\16\22\u029a"+
		"\13\22\3\23\7\23\u029d\n\23\f\23\16\23\u02a0\13\23\3\23\3\23\5\23\u02a4"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u02ad\n\25\f\25\16\25\u02b0"+
		"\13\25\5\25\u02b2\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\7\30\u02be\n\30\f\30\16\30\u02c1\13\30\3\31\3\31\5\31\u02c5\n\31\3"+
		"\32\7\32\u02c8\n\32\f\32\16\32\u02cb\13\32\3\32\3\32\5\32\u02cf\n\32\3"+
		"\33\3\33\3\33\3\33\5\33\u02d5\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u02dd\n\34\f\34\16\34\u02e0\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u02e7"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02ef\n\36\f\36\16\36\u02f2\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\5\37\u02f9\n\37\3 \3 \3!\3!\3!\3!\3!\3!\7"+
		"!\u0303\n!\f!\16!\u0306\13!\3\"\5\"\u0309\n\"\3\"\7\"\u030c\n\"\f\"\16"+
		"\"\u030f\13\"\3\"\7\"\u0312\n\"\f\"\16\"\u0315\13\"\3\"\3\"\3#\7#\u031a"+
		"\n#\f#\16#\u031d\13#\3#\3#\3#\3#\7#\u0323\n#\f#\16#\u0326\13#\3#\3#\3"+
		"$\3$\3%\3%\3%\3%\5%\u0330\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\5*\u034d\n*\3+\3+\5+\u0351"+
		"\n+\3,\7,\u0354\n,\f,\16,\u0357\13,\3,\3,\3,\5,\u035c\n,\3,\5,\u035f\n"+
		",\3,\5,\u0362\n,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u036e\n-\3.\3.\3.\3"+
		".\3/\3/\3/\7/\u0377\n/\f/\16/\u037a\13/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\7\62\u0385\n\62\f\62\16\62\u0388\13\62\3\63\3\63\7\63"+
		"\u038c\n\63\f\63\16\63\u038f\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64"+
		"\u0397\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u039e\n\65\3\66\7\66\u03a1\n"+
		"\66\f\66\16\66\u03a4\13\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u03b2\n\67\38\38\38\78\u03b7\n8\f8\168\u03ba\138"+
		"\39\39\39\59\u03bf\n9\3:\3:\5:\u03c3\n:\3;\3;\5;\u03c7\n;\3<\3<\5<\u03cb"+
		"\n<\3=\3=\5=\u03cf\n=\3>\3>\3>\5>\u03d4\n>\3?\3?\5?\u03d8\n?\3?\3?\7?"+
		"\u03dc\n?\f?\16?\u03df\13?\3@\3@\5@\u03e3\n@\3@\3@\3@\7@\u03e8\n@\f@\16"+
		"@\u03eb\13@\3@\3@\5@\u03ef\n@\5@\u03f1\n@\3A\3A\7A\u03f5\nA\fA\16A\u03f8"+
		"\13A\3A\3A\5A\u03fc\nA\3B\3B\5B\u0400\nB\3C\3C\3D\3D\3E\3E\3F\3F\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\5G\u0413\nG\3H\7H\u0416\nH\fH\16H\u0419\13H\3H"+
		"\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0428\nI\3J\3J\3J\5J\u042d\nJ"+
		"\3J\3J\7J\u0431\nJ\fJ\16J\u0434\13J\3J\3J\3J\5J\u0439\nJ\5J\u043b\nJ\3"+
		"K\3K\5K\u043f\nK\3L\3L\3L\5L\u0444\nL\3L\3L\5L\u0448\nL\3M\3M\3M\3M\3"+
		"M\5M\u044f\nM\3N\3N\3N\7N\u0454\nN\fN\16N\u0457\13N\3N\3N\3N\7N\u045c"+
		"\nN\fN\16N\u045f\13N\5N\u0461\nN\3O\7O\u0464\nO\fO\16O\u0467\13O\3O\3"+
		"O\3O\3P\3P\5P\u046e\nP\3Q\7Q\u0471\nQ\fQ\16Q\u0474\13Q\3Q\3Q\7Q\u0478"+
		"\nQ\fQ\16Q\u047b\13Q\3Q\3Q\3Q\3Q\5Q\u0481\nQ\3R\7R\u0484\nR\fR\16R\u0487"+
		"\13R\3R\3R\3R\5R\u048c\nR\3R\3R\3S\3S\3S\3T\3T\3T\7T\u0496\nT\fT\16T\u0499"+
		"\13T\3U\3U\5U\u049d\nU\3V\3V\5V\u04a1\nV\3W\3W\3X\3X\3X\3Y\7Y\u04a9\n"+
		"Y\fY\16Y\u04ac\13Y\3Y\3Y\5Y\u04b0\nY\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u04b8\nZ\3["+
		"\5[\u04bb\n[\3[\3[\3[\5[\u04c0\n[\3[\3[\3\\\3\\\3]\3]\5]\u04c8\n]\3]\5"+
		"]\u04cb\n]\3]\3]\3^\5^\u04d0\n^\3^\3^\3^\5^\u04d5\n^\3^\3^\3^\5^\u04da"+
		"\n^\3^\3^\3^\5^\u04df\n^\3^\3^\3^\3^\3^\5^\u04e6\n^\3^\3^\3^\5^\u04eb"+
		"\n^\3^\3^\3^\3^\3^\3^\5^\u04f3\n^\3^\3^\3^\5^\u04f8\n^\3^\3^\3^\5^\u04fd"+
		"\n^\3_\7_\u0500\n_\f_\16_\u0503\13_\3_\3_\3_\5_\u0508\n_\3_\3_\3`\3`\5"+
		"`\u050e\n`\3`\5`\u0511\n`\3`\5`\u0514\n`\3`\3`\3a\3a\3a\7a\u051b\na\f"+
		"a\16a\u051e\13a\3b\7b\u0521\nb\fb\16b\u0524\13b\3b\3b\3b\5b\u0529\nb\3"+
		"b\5b\u052c\nb\3b\5b\u052f\nb\3c\3c\3d\3d\7d\u0535\nd\fd\16d\u0538\13d"+
		"\3e\3e\5e\u053c\ne\3f\7f\u053f\nf\ff\16f\u0542\13f\3f\3f\3f\5f\u0547\n"+
		"f\3f\5f\u054a\nf\3f\3f\3g\3g\3g\3g\3g\3g\3g\5g\u0555\ng\3h\3h\3h\3i\3"+
		"i\7i\u055c\ni\fi\16i\u055f\13i\3i\3i\3j\3j\3j\3j\3j\5j\u0568\nj\3k\7k"+
		"\u056b\nk\fk\16k\u056e\13k\3k\3k\3k\3k\3l\3l\3l\3l\5l\u0578\nl\3m\7m\u057b"+
		"\nm\fm\16m\u057e\13m\3m\3m\3m\3n\3n\3n\3n\3n\3n\5n\u0589\nn\3o\7o\u058c"+
		"\no\fo\16o\u058f\13o\3o\3o\3o\3o\3o\3p\3p\7p\u0598\np\fp\16p\u059b\13"+
		"p\3p\3p\3q\3q\3q\3q\3q\5q\u05a4\nq\3r\7r\u05a7\nr\fr\16r\u05aa\13r\3r"+
		"\3r\3r\3r\3r\5r\u05b1\nr\3r\5r\u05b4\nr\3r\3r\3s\3s\3s\5s\u05bb\ns\3t"+
		"\3t\3t\3u\3u\3u\5u\u05c3\nu\3v\3v\3v\3v\5v\u05c9\nv\3v\3v\3w\3w\3w\7w"+
		"\u05d0\nw\fw\16w\u05d3\13w\3x\3x\3x\3x\3y\3y\3y\5y\u05dc\ny\3z\3z\5z\u05e0"+
		"\nz\3z\5z\u05e3\nz\3z\3z\3{\3{\3{\7{\u05ea\n{\f{\16{\u05ed\13{\3|\3|\3"+
		"|\3}\3}\3}\3}\3}\3}\3~\3~\5~\u05fa\n~\3~\5~\u05fd\n~\3~\3~\3\177\3\177"+
		"\3\177\7\177\u0604\n\177\f\177\16\177\u0607\13\177\3\u0080\3\u0080\5\u0080"+
		"\u060b\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\7\u0081\u0611\n\u0081\f"+
		"\u0081\16\u0081\u0614\13\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u0619\n"+
		"\u0082\3\u0083\3\u0083\3\u0083\3\u0084\7\u0084\u061f\n\u0084\f\u0084\16"+
		"\u0084\u0622\13\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u062d\n\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u0634\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\5\u0087\u0643\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0659\n\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u067b\n\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\7\u0092\u0685\n\u0092"+
		"\f\u0092\16\u0092\u0688\13\u0092\3\u0092\7\u0092\u068b\n\u0092\f\u0092"+
		"\16\u0092\u068e\13\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\7\u0094\u0697\n\u0094\f\u0094\16\u0094\u069a\13\u0094\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u06a6\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a"+
		"\5\u009a\u06c0\n\u009a\3\u009b\3\u009b\5\u009b\u06c4\n\u009b\3\u009c\3"+
		"\u009c\3\u009c\5\u009c\u06c9\n\u009c\3\u009c\3\u009c\5\u009c\u06cd\n\u009c"+
		"\3\u009c\3\u009c\5\u009c\u06d1\n\u009c\3\u009c\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009d\5\u009d\u06d9\n\u009d\3\u009d\3\u009d\5\u009d\u06dd\n"+
		"\u009d\3\u009d\3\u009d\5\u009d\u06e1\n\u009d\3\u009d\3\u009d\3\u009d\3"+
		"\u009e\3\u009e\5\u009e\u06e8\n\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3"+
		"\u00a0\7\u00a0\u06ef\n\u00a0\f\u00a0\16\u00a0\u06f2\13\u00a0\3\u00a1\3"+
		"\u00a1\3\u00a1\7\u00a1\u06f7\n\u00a1\f\u00a1\16\u00a1\u06fa\13\u00a1\3"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a2\7\u00a2\u0706\n\u00a2\f\u00a2\16\u00a2\u0709\13\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3"+
		"\u0714\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u071a\n\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5\u0720\n\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8"+
		"\u0735\n\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u073a\n\u00a8\3\u00a9\3"+
		"\u00a9\7\u00a9\u073e\n\u00a9\f\u00a9\16\u00a9\u0741\13\u00a9\3\u00aa\3"+
		"\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\7\u00ab\u074a\n\u00ab\f"+
		"\u00ab\16\u00ab\u074d\13\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac"+
		"\3\u00ac\7\u00ac\u0755\n\u00ac\f\u00ac\16\u00ac\u0758\13\u00ac\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0761\n\u00ae"+
		"\3\u00ae\5\u00ae\u0764\n\u00ae\3\u00af\3\u00af\3\u00af\5\u00af\u0769\n"+
		"\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u0770\n\u00b0\f"+
		"\u00b0\16\u00b0\u0773\13\u00b0\3\u00b1\7\u00b1\u0776\n\u00b1\f\u00b1\16"+
		"\u00b1\u0779\13\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3"+
		"\u0792\n\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\7\u00b4\u07a0\n\u00b4\f\u00b4"+
		"\16\u00b4\u07a3\13\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\7\u00b5\u07b5\n\u00b5\f\u00b5\16\u00b5\u07b8\13\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u07c8\n\u00b6\f\u00b6\16\u00b6"+
		"\u07cb\13\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\7\u00b7\u07de\n\u00b7\f\u00b7\16\u00b7\u07e1\13\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u07f2\n\u00b8\f\u00b8"+
		"\16\u00b8\u07f5\13\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\7\u00b9\u07fb"+
		"\n\u00b9\f\u00b9\16\u00b9\u07fe\13\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u080b"+
		"\n\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u081b\n\u00ba"+
		"\f\u00ba\16\u00ba\u081e\13\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0828\n\u00bc\3\u00bc\3\u00bc\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0833\n\u00be"+
		"\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c1\3\u00c1"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3"+
		"\u0846\n\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\5\u00c4\u0850\n\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb"+
		"\3\u00cb\7\u00cb\u0873\n\u00cb\f\u00cb\16\u00cb\u0876\13\u00cb\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\7\u00cc\u087e\n\u00cc\f\u00cc"+
		"\16\u00cc\u0881\13\u00cc\3\u00cd\3\u00cd\5\u00cd\u0885\n\u00cd\3\u00cd"+
		"\7\u00cd\u0888\n\u00cd\f\u00cd\16\u00cd\u088b\13\u00cd\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\7\u00ce\u0891\n\u00ce\f\u00ce\16\u00ce\u0894\13\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u08aa\n\u00ce\3\u00cf\3\u00cf\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\7\u00d0\u08b2\n\u00d0\f\u00d0\16\u00d0\u08b5\13\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\5\u00d0\u08ca\n\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\5\u00d1\u08d1\n\u00d1\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\5\u00d3\u08d9\n\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u08df\n"+
		"\u00d4\f\u00d4\16\u00d4\u08e2\13\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\7\u00d4\u08ea\n\u00d4\f\u00d4\16\u00d4\u08ed\13\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\5\u00d4\u0903\n\u00d4\3\u00d5\3\u00d5\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\7\u00d6\u090b\n\u00d6\f\u00d6\16\u00d6\u090e\13\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\7\u00d6\u0916\n\u00d6"+
		"\f\u00d6\16\u00d6\u0919\13\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u092e\n\u00d6\3\u00d7"+
		"\3\u00d7\5\u00d7\u0932\n\u00d7\3\u00d7\7\u00d7\u0935\n\u00d7\f\u00d7\16"+
		"\u00d7\u0938\13\u00d7\3\u00d7\3\u00d7\3\u00d7\7\u00d7\u093d\n\u00d7\f"+
		"\u00d7\16\u00d7\u0940\13\u00d7\3\u00d7\7\u00d7\u0943\n\u00d7\f\u00d7\16"+
		"\u00d7\u0946\13\u00d7\3\u00d7\5\u00d7\u0949\n\u00d7\3\u00d7\3\u00d7\5"+
		"\u00d7\u094d\n\u00d7\3\u00d7\3\u00d7\5\u00d7\u0951\n\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\5\u00d7\u0957\n\u00d7\3\u00d7\7\u00d7\u095a\n\u00d7\f"+
		"\u00d7\16\u00d7\u095d\13\u00d7\3\u00d7\3\u00d7\5\u00d7\u0961\n\u00d7\3"+
		"\u00d7\3\u00d7\5\u00d7\u0965\n\u00d7\3\u00d7\3\u00d7\5\u00d7\u0969\n\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u096f\n\u00d7\3\u00d7\7\u00d7"+
		"\u0972\n\u00d7\f\u00d7\16\u00d7\u0975\13\u00d7\3\u00d7\3\u00d7\5\u00d7"+
		"\u0979\n\u00d7\3\u00d7\3\u00d7\5\u00d7\u097d\n\u00d7\3\u00d7\3\u00d7\5"+
		"\u00d7\u0981\n\u00d7\5\u00d7\u0983\n\u00d7\3\u00d8\3\u00d8\3\u00d8\5\u00d8"+
		"\u0988\n\u00d8\3\u00d8\7\u00d8\u098b\n\u00d8\f\u00d8\16\u00d8\u098e\13"+
		"\u00d8\3\u00d8\3\u00d8\5\u00d8\u0992\n\u00d8\3\u00d8\3\u00d8\5\u00d8\u0996"+
		"\n\u00d8\3\u00d8\3\u00d8\5\u00d8\u099a\n\u00d8\3\u00d9\3\u00d9\5\u00d9"+
		"\u099e\n\u00d9\3\u00d9\7\u00d9\u09a1\n\u00d9\f\u00d9\16\u00d9\u09a4\13"+
		"\u00d9\3\u00d9\3\u00d9\3\u00d9\7\u00d9\u09a9\n\u00d9\f\u00d9\16\u00d9"+
		"\u09ac\13\u00d9\3\u00d9\7\u00d9\u09af\n\u00d9\f\u00d9\16\u00d9\u09b2\13"+
		"\u00d9\3\u00d9\5\u00d9\u09b5\n\u00d9\3\u00d9\3\u00d9\5\u00d9\u09b9\n\u00d9"+
		"\3\u00d9\3\u00d9\5\u00d9\u09bd\n\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\5\u00d9\u09c3\n\u00d9\3\u00d9\7\u00d9\u09c6\n\u00d9\f\u00d9\16\u00d9"+
		"\u09c9\13\u00d9\3\u00d9\3\u00d9\5\u00d9\u09cd\n\u00d9\3\u00d9\3\u00d9"+
		"\5\u00d9\u09d1\n\u00d9\3\u00d9\3\u00d9\5\u00d9\u09d5\n\u00d9\5\u00d9\u09d7"+
		"\n\u00d9\3\u00da\3\u00da\3\u00da\5\u00da\u09dc\n\u00da\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\5\u00db\u09eb\n\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd"+
		"\u09f9\n\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\5\u00de\u0a05\n\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\7\u00de\u0a0c\n\u00de\f\u00de\16\u00de\u0a0f\13\u00de"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\7\u00df\u0a1b\n\u00df\f\u00df\16\u00df\u0a1e\13\u00df\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\5\u00e0\u0a2a\n\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0"+
		"\u0a31\n\u00e0\f\u00e0\16\u00e0\u0a34\13\u00e0\3\u00e1\3\u00e1\3\u00e1"+
		"\5\u00e1\u0a39\n\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1"+
		"\u0a40\n\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0a45\n\u00e1\3\u00e1\3"+
		"\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0a4c\n\u00e1\3\u00e1\3\u00e1\3"+
		"\u00e1\5\u00e1\u0a51\n\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5"+
		"\u00e1\u0a58\n\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0a5d\n\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0a64\n\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\5\u00e1\u0a69\n\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\5\u00e1\u0a71\n\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0a76\n"+
		"\u00e1\3\u00e1\3\u00e1\5\u00e1\u0a7a\n\u00e1\3\u00e2\3\u00e2\5\u00e2\u0a7e"+
		"\n\u00e2\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u0a83\n\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0a8a\n\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\5\u00e3\u0a91\n\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3"+
		"\u0a96\n\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0a9d\n"+
		"\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0aa2\n\u00e3\3\u00e3\3\u00e3\3"+
		"\u00e3\3\u00e3\3\u00e3\5\u00e3\u0aa9\n\u00e3\3\u00e3\3\u00e3\3\u00e3\5"+
		"\u00e3\u0aae\n\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5"+
		"\u00e3\u0ab6\n\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0abb\n\u00e3\3\u00e3"+
		"\3\u00e3\5\u00e3\u0abf\n\u00e3\3\u00e4\3\u00e4\3\u00e4\7\u00e4\u0ac4\n"+
		"\u00e4\f\u00e4\16\u00e4\u0ac7\13\u00e4\3\u00e5\3\u00e5\3\u00e5\5\u00e5"+
		"\u0acc\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0ad3\n"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0ada\n\u00e5\3"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0ae1\n\u00e5\3\u00e5\3"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0ae9\n\u00e5\3\u00e5\3"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0af0\n\u00e5\3\u00e5\3\u00e5\3"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0af8\n\u00e5\3\u00e6\3\u00e6\5"+
		"\u00e6\u0afc\n\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0b03"+
		"\n\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0b0a\n\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0b11\n\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0b19\n\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0b20\n\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0b28\n\u00e7\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\5\u00e8\u0b2e\n\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\5\u00e8\u0b34\n\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0b40\n\u00e8\3\u00e9\3\u00e9"+
		"\7\u00e9\u0b44\n\u00e9\f\u00e9\16\u00e9\u0b47\13\u00e9\3\u00ea\7\u00ea"+
		"\u0b4a\n\u00ea\f\u00ea\16\u00ea\u0b4d\13\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00eb\3\u00eb\3\u00ec\3\u00ec\5\u00ec\u0b57\n\u00ec\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b60\n\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b67\n\u00ee\3\u00ef"+
		"\3\u00ef\3\u00ef\7\u00ef\u0b6c\n\u00ef\f\u00ef\16\u00ef\u0b6f\13\u00ef"+
		"\3\u00f0\3\u00f0\5\u00f0\u0b73\n\u00f0\3\u00f1\3\u00f1\5\u00f1\u0b77\n"+
		"\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f3\5\u00f3"+
		"\u0b80\n\u00f3\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5"+
		"\3\u00f5\3\u00f5\5\u00f5\u0b8b\n\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f6"+
		"\3\u00f6\3\u00f6\7\u00f6\u0b93\n\u00f6\f\u00f6\16\u00f6\u0b96\13\u00f6"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\7\u00f7\u0b9e\n\u00f7"+
		"\f\u00f7\16\u00f7\u0ba1\13\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\7\u00f8\u0ba9\n\u00f8\f\u00f8\16\u00f8\u0bac\13\u00f8\3\u00f9"+
		"\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\7\u00f9\u0bb4\n\u00f9\f\u00f9"+
		"\16\u00f9\u0bb7\13\u00f9\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa"+
		"\7\u00fa\u0bbf\n\u00fa\f\u00fa\16\u00fa\u0bc2\13\u00fa\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\7\u00fb\u0bcd"+
		"\n\u00fb\f\u00fb\16\u00fb\u0bd0\13\u00fb\3\u00fc\3\u00fc\3\u00fc\3\u00fc"+
		"\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc"+
		"\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\7\u00fc\u0be4\n\u00fc\f\u00fc"+
		"\16\u00fc\u0be7\13\u00fc\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd"+
		"\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd"+
		"\3\u00fd\7\u00fd\u0bf9\n\u00fd\f\u00fd\16\u00fd\u0bfc\13\u00fd\3\u00fe"+
		"\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\7\u00fe"+
		"\u0c07\n\u00fe\f\u00fe\16\u00fe\u0c0a\13\u00fe\3\u00ff\3\u00ff\3\u00ff"+
		"\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff"+
		"\7\u00ff\u0c18\n\u00ff\f\u00ff\16\u00ff\u0c1b\13\u00ff\3\u0100\3\u0100"+
		"\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\5\u0100\u0c24\n\u0100\3\u0101"+
		"\3\u0101\3\u0101\3\u0102\3\u0102\3\u0102\3\u0103\3\u0103\3\u0103\3\u0103"+
		"\3\u0103\3\u0103\5\u0103\u0c32\n\u0103\3\u0104\3\u0104\5\u0104\u0c36\n"+
		"\u0104\3\u0104\3\u0104\7\u0104\u0c3a\n\u0104\f\u0104\16\u0104\u0c3d\13"+
		"\u0104\3\u0105\3\u0105\3\u0105\3\u0106\3\u0106\3\u0107\3\u0107\3\u0107"+
		"\3\u0108\3\u0108\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109"+
		"\3\u0109\7\u0109\u0c51\n\u0109\f\u0109\16\u0109\u0c54\13\u0109\3\u0109"+
		"\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\7\u0109\u0c5c\n\u0109\f\u0109"+
		"\16\u0109\u0c5f\13\u0109\3\u0109\3\u0109\3\u0109\5\u0109\u0c64\n\u0109"+
		"\3\u0109\2\17\66:@\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa"+
		"\u01fc\u010a\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"+
		"\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160"+
		"\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178"+
		"\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190"+
		"\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8"+
		"\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0"+
		"\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8"+
		"\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0"+
		"\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208"+
		"\u020a\u020c\u020e\u0210\2\b\3\2QV\7\2\t\t\f\f\37\37!!))\4\2\22\22\30"+
		"\30\5\2\3\4**CD\3\2=>\4\2``y\u0083\u0d70\2\u0212\3\2\2\2\4\u0216\3\2\2"+
		"\2\6\u0226\3\2\2\2\b\u022a\3\2\2\2\n\u022c\3\2\2\2\f\u022e\3\2\2\2\16"+
		"\u0233\3\2\2\2\20\u0237\3\2\2\2\22\u0256\3\2\2\2\24\u0258\3\2\2\2\26\u0266"+
		"\3\2\2\2\30\u026d\3\2\2\2\32\u026f\3\2\2\2\34\u0271\3\2\2\2\36\u0276\3"+
		"\2\2\2 \u0284\3\2\2\2\"\u0289\3\2\2\2$\u029e\3\2\2\2&\u02a5\3\2\2\2(\u02b1"+
		"\3\2\2\2*\u02b3\3\2\2\2,\u02b6\3\2\2\2.\u02ba\3\2\2\2\60\u02c4\3\2\2\2"+
		"\62\u02c9\3\2\2\2\64\u02d4\3\2\2\2\66\u02d6\3\2\2\28\u02e6\3\2\2\2:\u02e8"+
		"\3\2\2\2<\u02f8\3\2\2\2>\u02fa\3\2\2\2@\u02fc\3\2\2\2B\u0308\3\2\2\2D"+
		"\u031b\3\2\2\2F\u0329\3\2\2\2H\u032f\3\2\2\2J\u0331\3\2\2\2L\u0335\3\2"+
		"\2\2N\u033b\3\2\2\2P\u0342\3\2\2\2R\u034c\3\2\2\2T\u0350\3\2\2\2V\u0355"+
		"\3\2\2\2X\u036d\3\2\2\2Z\u036f\3\2\2\2\\\u0373\3\2\2\2^\u037b\3\2\2\2"+
		"`\u037e\3\2\2\2b\u0381\3\2\2\2d\u0389\3\2\2\2f\u0396\3\2\2\2h\u039d\3"+
		"\2\2\2j\u03a2\3\2\2\2l\u03b1\3\2\2\2n\u03b3\3\2\2\2p\u03bb\3\2\2\2r\u03c0"+
		"\3\2\2\2t\u03c6\3\2\2\2v\u03ca\3\2\2\2x\u03ce\3\2\2\2z\u03d3\3\2\2\2|"+
		"\u03d7\3\2\2\2~\u03f0\3\2\2\2\u0080\u03f2\3\2\2\2\u0082\u03fd\3\2\2\2"+
		"\u0084\u0401\3\2\2\2\u0086\u0403\3\2\2\2\u0088\u0405\3\2\2\2\u008a\u0407"+
		"\3\2\2\2\u008c\u0412\3\2\2\2\u008e\u0417\3\2\2\2\u0090\u0427\3\2\2\2\u0092"+
		"\u043a\3\2\2\2\u0094\u043e\3\2\2\2\u0096\u0440\3\2\2\2\u0098\u044e\3\2"+
		"\2\2\u009a\u0460\3\2\2\2\u009c\u0465\3\2\2\2\u009e\u046d\3\2\2\2\u00a0"+
		"\u0480\3\2\2\2\u00a2\u0485\3\2\2\2\u00a4\u048f\3\2\2\2\u00a6\u0492\3\2"+
		"\2\2\u00a8\u049c\3\2\2\2\u00aa\u04a0\3\2\2\2\u00ac\u04a2\3\2\2\2\u00ae"+
		"\u04a4\3\2\2\2\u00b0\u04aa\3\2\2\2\u00b2\u04b7\3\2\2\2\u00b4\u04ba\3\2"+
		"\2\2\u00b6\u04c3\3\2\2\2\u00b8\u04c5\3\2\2\2\u00ba\u04fc\3\2\2\2\u00bc"+
		"\u0501\3\2\2\2\u00be\u050b\3\2\2\2\u00c0\u0517\3\2\2\2\u00c2\u0522\3\2"+
		"\2\2\u00c4\u0530\3\2\2\2\u00c6\u0532\3\2\2\2\u00c8\u053b\3\2\2\2\u00ca"+
		"\u0540\3\2\2\2\u00cc\u0554\3\2\2\2\u00ce\u0556\3\2\2\2\u00d0\u0559\3\2"+
		"\2\2\u00d2\u0567\3\2\2\2\u00d4\u056c\3\2\2\2\u00d6\u0577\3\2\2\2\u00d8"+
		"\u057c\3\2\2\2\u00da\u0588\3\2\2\2\u00dc\u058d\3\2\2\2\u00de\u0595\3\2"+
		"\2\2\u00e0\u05a3\3\2\2\2\u00e2\u05a8\3\2\2\2\u00e4\u05ba\3\2\2\2\u00e6"+
		"\u05bc\3\2\2\2\u00e8\u05c2\3\2\2\2\u00ea\u05c4\3\2\2\2\u00ec\u05cc\3\2"+
		"\2\2\u00ee\u05d4\3\2\2\2\u00f0\u05db\3\2\2\2\u00f2\u05dd\3\2\2\2\u00f4"+
		"\u05e6\3\2\2\2\u00f6\u05ee\3\2\2\2\u00f8\u05f1\3\2\2\2\u00fa\u05f7\3\2"+
		"\2\2\u00fc\u0600\3\2\2\2\u00fe\u0608\3\2\2\2\u0100\u060e\3\2\2\2\u0102"+
		"\u0618\3\2\2\2\u0104\u061a\3\2\2\2\u0106\u0620\3\2\2\2\u0108\u062c\3\2"+
		"\2\2\u010a\u0633\3\2\2\2\u010c\u0642\3\2\2\2\u010e\u0644\3\2\2\2\u0110"+
		"\u0646\3\2\2\2\u0112\u064a\3\2\2\2\u0114\u064e\3\2\2\2\u0116\u0658\3\2"+
		"\2\2\u0118\u065a\3\2\2\2\u011a\u0660\3\2\2\2\u011c\u0668\3\2\2\2\u011e"+
		"\u067a\3\2\2\2\u0120\u067c\3\2\2\2\u0122\u0682\3\2\2\2\u0124\u0691\3\2"+
		"\2\2\u0126\u0694\3\2\2\2\u0128\u06a5\3\2\2\2\u012a\u06a7\3\2\2\2\u012c"+
		"\u06a9\3\2\2\2\u012e\u06af\3\2\2\2\u0130\u06b5\3\2\2\2\u0132\u06bf\3\2"+
		"\2\2\u0134\u06c3\3\2\2\2\u0136\u06c5\3\2\2\2\u0138\u06d5\3\2\2\2\u013a"+
		"\u06e7\3\2\2\2\u013c\u06e9\3\2\2\2\u013e\u06eb\3\2\2\2\u0140\u06f3\3\2"+
		"\2\2\u0142\u0702\3\2\2\2\u0144\u0711\3\2\2\2\u0146\u0717\3\2\2\2\u0148"+
		"\u071d\3\2\2\2\u014a\u0723\3\2\2\2\u014c\u0727\3\2\2\2\u014e\u0739\3\2"+
		"\2\2\u0150\u073b\3\2\2\2\u0152\u0742\3\2\2\2\u0154\u074b\3\2\2\2\u0156"+
		"\u0751\3\2\2\2\u0158\u0759\3\2\2\2\u015a\u075c\3\2\2\2\u015c\u0765\3\2"+
		"\2\2\u015e\u076c\3\2\2\2\u0160\u0777\3\2\2\2\u0162\u077f\3\2\2\2\u0164"+
		"\u0791\3\2\2\2\u0166\u0793\3\2\2\2\u0168\u07a6\3\2\2\2\u016a\u07bb\3\2"+
		"\2\2\u016c\u07ce\3\2\2\2\u016e\u07e4\3\2\2\2\u0170\u07f8\3\2\2\2\u0172"+
		"\u080e\3\2\2\2\u0174\u0821\3\2\2\2\u0176\u0824\3\2\2\2\u0178\u082b\3\2"+
		"\2\2\u017a\u082e\3\2\2\2\u017c\u0836\3\2\2\2\u017e\u0839\3\2\2\2\u0180"+
		"\u083b\3\2\2\2\u0182\u083d\3\2\2\2\u0184\u0840\3\2\2\2\u0186\u084f\3\2"+
		"\2\2\u0188\u0851\3\2\2\2\u018a\u0856\3\2\2\2\u018c\u085b\3\2\2\2\u018e"+
		"\u0860\3\2\2\2\u0190\u0865\3\2\2\2\u0192\u086a\3\2\2\2\u0194\u086f\3\2"+
		"\2\2\u0196\u0877\3\2\2\2\u0198\u0884\3\2\2\2\u019a\u08a9\3\2\2\2\u019c"+
		"\u08ab\3\2\2\2\u019e\u08c9\3\2\2\2\u01a0\u08d0\3\2\2\2\u01a2\u08d2\3\2"+
		"\2\2\u01a4\u08d8\3\2\2\2\u01a6\u0902\3\2\2\2\u01a8\u0904\3\2\2\2\u01aa"+
		"\u092d\3\2\2\2\u01ac\u0982\3\2\2\2\u01ae\u0984\3\2\2\2\u01b0\u09d6\3\2"+
		"\2\2\u01b2\u09db\3\2\2\2\u01b4\u09ea\3\2\2\2\u01b6\u09ec\3\2\2\2\u01b8"+
		"\u09f8\3\2\2\2\u01ba\u0a04\3\2\2\2\u01bc\u0a10\3\2\2\2\u01be\u0a29\3\2"+
		"\2\2\u01c0\u0a79\3\2\2\2\u01c2\u0a7b\3\2\2\2\u01c4\u0abe\3\2\2\2\u01c6"+
		"\u0ac0\3\2\2\2\u01c8\u0af7\3\2\2\2\u01ca\u0af9\3\2\2\2\u01cc\u0b27\3\2"+
		"\2\2\u01ce\u0b3f\3\2\2\2\u01d0\u0b41\3\2\2\2\u01d2\u0b4b\3\2\2\2\u01d4"+
		"\u0b52\3\2\2\2\u01d6\u0b56\3\2\2\2\u01d8\u0b58\3\2\2\2\u01da\u0b66\3\2"+
		"\2\2\u01dc\u0b68\3\2\2\2\u01de\u0b72\3\2\2\2\u01e0\u0b76\3\2\2\2\u01e2"+
		"\u0b78\3\2\2\2\u01e4\u0b7f\3\2\2\2\u01e6\u0b81\3\2\2\2\u01e8\u0b8a\3\2"+
		"\2\2\u01ea\u0b8c\3\2\2\2\u01ec\u0b97\3\2\2\2\u01ee\u0ba2\3\2\2\2\u01f0"+
		"\u0bad\3\2\2\2\u01f2\u0bb8\3\2\2\2\u01f4\u0bc3\3\2\2\2\u01f6\u0bd1\3\2"+
		"\2\2\u01f8\u0be8\3\2\2\2\u01fa\u0bfd\3\2\2\2\u01fc\u0c0b\3\2\2\2\u01fe"+
		"\u0c23\3\2\2\2\u0200\u0c25\3\2\2\2\u0202\u0c28\3\2\2\2\u0204\u0c31\3\2"+
		"\2\2\u0206\u0c35\3\2\2\2\u0208\u0c3e\3\2\2\2\u020a\u0c41\3\2\2\2\u020c"+
		"\u0c43\3\2\2\2\u020e\u0c46\3\2\2\2\u0210\u0c63\3\2\2\2\u0212\u0213\t\2"+
		"\2\2\u0213\3\3\2\2\2\u0214\u0217\5\6\4\2\u0215\u0217\5\16\b\2\u0216\u0214"+
		"\3\2\2\2\u0216\u0215\3\2\2\2\u0217\5\3\2\2\2\u0218\u021a\5\u00e8u\2\u0219"+
		"\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0227\5\b\5\2\u021f"+
		"\u0221\5\u00e8u\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220"+
		"\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225"+
		"\u0227\7\7\2\2\u0226\u021b\3\2\2\2\u0226\u0222\3\2\2\2\u0227\7\3\2\2\2"+
		"\u0228\u022b\5\n\6\2\u0229\u022b\5\f\7\2\u022a\u0228\3\2\2\2\u022a\u0229"+
		"\3\2\2\2\u022b\t\3\2\2\2\u022c\u022d\t\3\2\2\u022d\13\3\2\2\2\u022e\u022f"+
		"\t\4\2\2\u022f\r\3\2\2\2\u0230\u0234\5\20\t\2\u0231\u0234\5\36\20\2\u0232"+
		"\u0234\5 \21\2\u0233\u0230\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0232\3\2"+
		"\2\2\u0234\17\3\2\2\2\u0235\u0238\5\26\f\2\u0236\u0238\5\34\17\2\u0237"+
		"\u0235\3\2\2\2\u0237\u0236\3\2\2\2\u0238\u023d\3\2\2\2\u0239\u023c\5\24"+
		"\13\2\u023a\u023c\5\32\16\2\u023b\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023c"+
		"\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\21\3\2\2"+
		"\2\u023f\u023d\3\2\2\2\u0240\u0242\5\u00e8u\2\u0241\u0240\3\2\2\2\u0242"+
		"\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2"+
		"\2\2\u0245\u0243\3\2\2\2\u0246\u0248\7\u0084\2\2\u0247\u0249\5,\27\2\u0248"+
		"\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0257\3\2\2\2\u024a\u024b\5\20"+
		"\t\2\u024b\u024f\7_\2\2\u024c\u024e\5\u00e8u\2\u024d\u024c\3\2\2\2\u024e"+
		"\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2"+
		"\2\2\u0251\u024f\3\2\2\2\u0252\u0254\7\u0084\2\2\u0253\u0255\5,\27\2\u0254"+
		"\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0243\3\2"+
		"\2\2\u0256\u024a\3\2\2\2\u0257\23\3\2\2\2\u0258\u025c\7_\2\2\u0259\u025b"+
		"\5\u00e8u\2\u025a\u0259\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2"+
		"\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0261"+
		"\7\u0084\2\2\u0260\u0262\5,\27\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2"+
		"\2\u0262\25\3\2\2\2\u0263\u0265\5\u00e8u\2\u0264\u0263\3\2\2\2\u0265\u0268"+
		"\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268"+
		"\u0266\3\2\2\2\u0269\u026b\7\u0084\2\2\u026a\u026c\5,\27\2\u026b\u026a"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\27\3\2\2\2\u026d\u026e\5\22\n\2\u026e"+
		"\31\3\2\2\2\u026f\u0270\5\24\13\2\u0270\33\3\2\2\2\u0271\u0272\5\26\f"+
		"\2\u0272\35\3\2\2\2\u0273\u0275\5\u00e8u\2\u0274\u0273\3\2\2\2\u0275\u0278"+
		"\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278"+
		"\u0276\3\2\2\2\u0279\u027a\7\u0084\2\2\u027a\37\3\2\2\2\u027b\u027c\5"+
		"\6\4\2\u027c\u027d\5\"\22\2\u027d\u0285\3\2\2\2\u027e\u027f\5\20\t\2\u027f"+
		"\u0280\5\"\22\2\u0280\u0285\3\2\2\2\u0281\u0282\5\36\20\2\u0282\u0283"+
		"\5\"\22\2\u0283\u0285\3\2\2\2\u0284\u027b\3\2\2\2\u0284\u027e\3\2\2\2"+
		"\u0284\u0281\3\2\2\2\u0285!\3\2\2\2\u0286\u0288\5\u00e8u\2\u0287\u0286"+
		"\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028c\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d\7[\2\2\u028d\u0298\7\\"+
		"\2\2\u028e\u0290\5\u00e8u\2\u028f\u028e\3\2\2\2\u0290\u0293\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2\2\2\u0293\u0291\3\2"+
		"\2\2\u0294\u0295\7[\2\2\u0295\u0297\7\\\2\2\u0296\u0291\3\2\2\2\u0297"+
		"\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299#\3\2\2\2"+
		"\u029a\u0298\3\2\2\2\u029b\u029d\5&\24\2\u029c\u029b\3\2\2\2\u029d\u02a0"+
		"\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a1\u02a3\7\u0084\2\2\u02a2\u02a4\5(\25\2\u02a3\u02a2"+
		"\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4%\3\2\2\2\u02a5\u02a6\5\u00e8u\2\u02a6"+
		"\'\3\2\2\2\u02a7\u02a8\7\25\2\2\u02a8\u02b2\5\36\20\2\u02a9\u02aa\7\25"+
		"\2\2\u02aa\u02ae\5\20\t\2\u02ab\u02ad\5*\26\2\u02ac\u02ab\3\2\2\2\u02ad"+
		"\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b2\3\2"+
		"\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02a7\3\2\2\2\u02b1\u02a9\3\2\2\2\u02b2"+
		")\3\2\2\2\u02b3\u02b4\7s\2\2\u02b4\u02b5\5\30\r\2\u02b5+\3\2\2\2\u02b6"+
		"\u02b7\7b\2\2\u02b7\u02b8\5.\30\2\u02b8\u02b9\7a\2\2\u02b9-\3\2\2\2\u02ba"+
		"\u02bf\5\60\31\2\u02bb\u02bc\7^\2\2\u02bc\u02be\5\60\31\2\u02bd\u02bb"+
		"\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"/\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c5\5\16\b\2\u02c3\u02c5\5\62\32"+
		"\2\u02c4\u02c2\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c5\61\3\2\2\2\u02c6\u02c8"+
		"\5\u00e8u\2\u02c7\u02c6\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2"+
		"\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02ce"+
		"\7e\2\2\u02cd\u02cf\5\64\33\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2"+
		"\u02cf\63\3\2\2\2\u02d0\u02d1\7\25\2\2\u02d1\u02d5\5\16\b\2\u02d2\u02d3"+
		"\7,\2\2\u02d3\u02d5\5\16\b\2\u02d4\u02d0\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5"+
		"\65\3\2\2\2\u02d6\u02d7\b\34\1\2\u02d7\u02d8\7\u0084\2\2\u02d8\u02de\3"+
		"\2\2\2\u02d9\u02da\f\3\2\2\u02da\u02db\7_\2\2\u02db\u02dd\7\u0084\2\2"+
		"\u02dc\u02d9\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\67\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e7\7\u0084\2\2"+
		"\u02e2\u02e3\5:\36\2\u02e3\u02e4\7_\2\2\u02e4\u02e5\7\u0084\2\2\u02e5"+
		"\u02e7\3\2\2\2\u02e6\u02e1\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e79\3\2\2\2"+
		"\u02e8\u02e9\b\36\1\2\u02e9\u02ea\7\u0084\2\2\u02ea\u02f0\3\2\2\2\u02eb"+
		"\u02ec\f\3\2\2\u02ec\u02ed\7_\2\2\u02ed\u02ef\7\u0084\2\2\u02ee\u02eb"+
		"\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		";\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f9\7\u0084\2\2\u02f4\u02f5\5@!"+
		"\2\u02f5\u02f6\7_\2\2\u02f6\u02f7\7\u0084\2\2\u02f7\u02f9\3\2\2\2\u02f8"+
		"\u02f3\3\2\2\2\u02f8\u02f4\3\2\2\2\u02f9=\3\2\2\2\u02fa\u02fb\7\u0084"+
		"\2\2\u02fb?\3\2\2\2\u02fc\u02fd\b!\1\2\u02fd\u02fe\7\u0084\2\2\u02fe\u0304"+
		"\3\2\2\2\u02ff\u0300\f\3\2\2\u0300\u0301\7_\2\2\u0301\u0303\7\u0084\2"+
		"\2\u0302\u02ff\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305"+
		"\3\2\2\2\u0305A\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u0309\5D#\2\u0308\u0307"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030d\3\2\2\2\u030a\u030c\5H%\2\u030b"+
		"\u030a\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e\u0313\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0312\5R*\2\u0311\u0310"+
		"\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0316\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0317\7\2\2\3\u0317C\3\2\2\2"+
		"\u0318\u031a\5F$\2\u0319\u0318\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319"+
		"\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u031b\3\2\2\2\u031e"+
		"\u031f\7$\2\2\u031f\u0324\7\u0084\2\2\u0320\u0321\7_\2\2\u0321\u0323\7"+
		"\u0084\2\2\u0322\u0320\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2\2"+
		"\u0324\u0325\3\2\2\2\u0325\u0327\3\2\2\2\u0326\u0324\3\2\2\2\u0327\u0328"+
		"\7]\2\2\u0328E\3\2\2\2\u0329\u032a\5\u00e8u\2\u032aG\3\2\2\2\u032b\u0330"+
		"\5J&\2\u032c\u0330\5L\'\2\u032d\u0330\5N(\2\u032e\u0330\5P)\2\u032f\u032b"+
		"\3\2\2\2\u032f\u032c\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u032e\3\2\2\2\u0330"+
		"I\3\2\2\2\u0331\u0332\7\35\2\2\u0332\u0333\58\35\2\u0333\u0334\7]\2\2"+
		"\u0334K\3\2\2\2\u0335\u0336\7\35\2\2\u0336\u0337\5:\36\2\u0337\u0338\7"+
		"_\2\2\u0338\u0339\7q\2\2\u0339\u033a\7]\2\2\u033aM\3\2\2\2\u033b\u033c"+
		"\7\35\2\2\u033c\u033d\7*\2\2\u033d\u033e\58\35\2\u033e\u033f\7_\2\2\u033f"+
		"\u0340\7\u0084\2\2\u0340\u0341\7]\2\2\u0341O\3\2\2\2\u0342\u0343\7\35"+
		"\2\2\u0343\u0344\7*\2\2\u0344\u0345\58\35\2\u0345\u0346\7_\2\2\u0346\u0347"+
		"\7q\2\2\u0347\u0348\7]\2\2\u0348Q\3\2\2\2\u0349\u034d\5T+\2\u034a\u034d"+
		"\5\u00c8e\2\u034b\u034d\7]\2\2\u034c\u0349\3\2\2\2\u034c\u034a\3\2\2\2"+
		"\u034c\u034b\3\2\2\2\u034dS\3\2\2\2\u034e\u0351\5V,\2\u034f\u0351\5\u00bc"+
		"_\2\u0350\u034e\3\2\2\2\u0350\u034f\3\2\2\2\u0351U\3\2\2\2\u0352\u0354"+
		"\5X-\2\u0353\u0352\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u0359\7\r"+
		"\2\2\u0359\u035b\7\u0084\2\2\u035a\u035c\5Z.\2\u035b\u035a\3\2\2\2\u035b"+
		"\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d\u035f\5^\60\2\u035e\u035d\3\2"+
		"\2\2\u035e\u035f\3\2\2\2\u035f\u0361\3\2\2\2\u0360\u0362\5`\61\2\u0361"+
		"\u0360\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364\5d"+
		"\63\2\u0364W\3\2\2\2\u0365\u036e\5\u00e8u\2\u0366\u036e\7\'\2\2\u0367"+
		"\u036e\7&\2\2\u0368\u036e\7%\2\2\u0369\u036e\7\5\2\2\u036a\u036e\7*\2"+
		"\2\u036b\u036e\7\26\2\2\u036c\u036e\7+\2\2\u036d\u0365\3\2\2\2\u036d\u0366"+
		"\3\2\2\2\u036d\u0367\3\2\2\2\u036d\u0368\3\2\2\2\u036d\u0369\3\2\2\2\u036d"+
		"\u036a\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036c\3\2\2\2\u036eY\3\2\2\2"+
		"\u036f\u0370\7b\2\2\u0370\u0371\5\\/\2\u0371\u0372\7a\2\2\u0372[\3\2\2"+
		"\2\u0373\u0378\5$\23\2\u0374\u0375\7^\2\2\u0375\u0377\5$\23\2\u0376\u0374"+
		"\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379"+
		"]\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u037c\7\25\2\2\u037c\u037d\5\22\n"+
		"\2\u037d_\3\2\2\2\u037e\u037f\7\34\2\2\u037f\u0380\5b\62\2\u0380a\3\2"+
		"\2\2\u0381\u0386\5\30\r\2\u0382\u0383\7^\2\2\u0383\u0385\5\30\r\2\u0384"+
		"\u0382\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2"+
		"\2\2\u0387c\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038d\7Y\2\2\u038a\u038c"+
		"\5f\64\2\u038b\u038a\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0391\7Z"+
		"\2\2\u0391e\3\2\2\2\u0392\u0397\5h\65\2\u0393\u0397\5\u00acW\2\u0394\u0397"+
		"\5\u00aeX\2\u0395\u0397\5\u00b0Y\2\u0396\u0392\3\2\2\2\u0396\u0393\3\2"+
		"\2\2\u0396\u0394\3\2\2\2\u0396\u0395\3\2\2\2\u0397g\3\2\2\2\u0398\u039e"+
		"\5j\66\2\u0399\u039e\5\u008eH\2\u039a\u039e\5T+\2\u039b\u039e\5\u00c8"+
		"e\2\u039c\u039e\7]\2\2\u039d\u0398\3\2\2\2\u039d\u0399\3\2\2\2\u039d\u039a"+
		"\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039c\3\2\2\2\u039ei\3\2\2\2\u039f"+
		"\u03a1\5l\67\2\u03a0\u039f\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2"+
		"\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5"+
		"\u03a6\5v<\2\u03a6\u03a7\5n8\2\u03a7\u03a8\7]\2\2\u03a8k\3\2\2\2\u03a9"+
		"\u03b2\5\u00e8u\2\u03aa\u03b2\7\'\2\2\u03ab\u03b2\7&\2\2\u03ac\u03b2\7"+
		"%\2\2\u03ad\u03b2\7*\2\2\u03ae\u03b2\7\26\2\2\u03af\u03b2\7\62\2\2\u03b0"+
		"\u03b2\7\65\2\2\u03b1\u03a9\3\2\2\2\u03b1\u03aa\3\2\2\2\u03b1\u03ab\3"+
		"\2\2\2\u03b1\u03ac\3\2\2\2\u03b1\u03ad\3\2\2\2\u03b1\u03ae\3\2\2\2\u03b1"+
		"\u03af\3\2\2\2\u03b1\u03b0\3\2\2\2\u03b2m\3\2\2\2\u03b3\u03b8\5p9\2\u03b4"+
		"\u03b5\7^\2\2\u03b5\u03b7\5p9\2\u03b6\u03b4\3\2\2\2\u03b7\u03ba\3\2\2"+
		"\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9o\3\2\2\2\u03ba\u03b8"+
		"\3\2\2\2\u03bb\u03be\5r:\2\u03bc\u03bd\7`\2\2\u03bd\u03bf\5t;\2\u03be"+
		"\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bfq\3\2\2\2\u03c0\u03c2\7\u0084"+
		"\2\2\u03c1\u03c3\5\"\22\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"s\3\2\2\2\u03c4\u03c7\5\u01d6\u00ec\2\u03c5\u03c7\5\u00fa~\2\u03c6\u03c4"+
		"\3\2\2\2\u03c6\u03c5\3\2\2\2\u03c7u\3\2\2\2\u03c8\u03cb\5x=\2\u03c9\u03cb"+
		"\5z>\2\u03ca\u03c8\3\2\2\2\u03ca\u03c9\3\2\2\2\u03cbw\3\2\2\2\u03cc\u03cf"+
		"\5\b\5\2\u03cd\u03cf\7\7\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cd\3\2\2\2\u03cf"+
		"y\3\2\2\2\u03d0\u03d4\5|?\2\u03d1\u03d4\5\u008aF\2\u03d2\u03d4\5\u008c"+
		"G\2\u03d3\u03d0\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d2\3\2\2\2\u03d4"+
		"{\3\2\2\2\u03d5\u03d8\5\u0082B\2\u03d6\u03d8\5\u0088E\2\u03d7\u03d5\3"+
		"\2\2\2\u03d7\u03d6\3\2\2\2\u03d8\u03dd\3\2\2\2\u03d9\u03dc\5\u0080A\2"+
		"\u03da\u03dc\5\u0086D\2\u03db\u03d9\3\2\2\2\u03db\u03da\3\2\2\2\u03dc"+
		"\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de}\3\2\2\2"+
		"\u03df\u03dd\3\2\2\2\u03e0\u03e2\7\u0084\2\2\u03e1\u03e3\5,\27\2\u03e2"+
		"\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03f1\3\2\2\2\u03e4\u03e5\5|"+
		"?\2\u03e5\u03e9\7_\2\2\u03e6\u03e8\5\u00e8u\2\u03e7\u03e6\3\2\2\2\u03e8"+
		"\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2"+
		"\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03ee\7\u0084\2\2\u03ed\u03ef\5,\27\2\u03ee"+
		"\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03e0\3\2"+
		"\2\2\u03f0\u03e4\3\2\2\2\u03f1\177\3\2\2\2\u03f2\u03f6\7_\2\2\u03f3\u03f5"+
		"\5\u00e8u\2\u03f4\u03f3\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2"+
		"\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fb"+
		"\7\u0084\2\2\u03fa\u03fc\5,\27\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2"+
		"\2\u03fc\u0081\3\2\2\2\u03fd\u03ff\7\u0084\2\2\u03fe\u0400\5,\27\2\u03ff"+
		"\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0083\3\2\2\2\u0401\u0402\5~"+
		"@\2\u0402\u0085\3\2\2\2\u0403\u0404\5\u0080A\2\u0404\u0087\3\2\2\2\u0405"+
		"\u0406\5\u0082B\2\u0406\u0089\3\2\2\2\u0407\u0408\7\u0084\2\2\u0408\u008b"+
		"\3\2\2\2\u0409\u040a\5x=\2\u040a\u040b\5\"\22\2\u040b\u0413\3\2\2\2\u040c"+
		"\u040d\5|?\2\u040d\u040e\5\"\22\2\u040e\u0413\3\2\2\2\u040f\u0410\5\u008a"+
		"F\2\u0410\u0411\5\"\22\2\u0411\u0413\3\2\2\2\u0412\u0409\3\2\2\2\u0412"+
		"\u040c\3\2\2\2\u0412\u040f\3\2\2\2\u0413\u008d\3\2\2\2\u0414\u0416\5\u0090"+
		"I\2\u0415\u0414\3\2\2\2\u0416\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0417"+
		"\u0418\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u0417\3\2\2\2\u041a\u041b\5\u0092"+
		"J\2\u041b\u041c\5\u00aaV\2\u041c\u008f\3\2\2\2\u041d\u0428\5\u00e8u\2"+
		"\u041e\u0428\7\'\2\2\u041f\u0428\7&\2\2\u0420\u0428\7%\2\2\u0421\u0428"+
		"\7\5\2\2\u0422\u0428\7*\2\2\u0423\u0428\7\26\2\2\u0424\u0428\7.\2\2\u0425"+
		"\u0428\7\"\2\2\u0426\u0428\7+\2\2\u0427\u041d\3\2\2\2\u0427\u041e\3\2"+
		"\2\2\u0427\u041f\3\2\2\2\u0427\u0420\3\2\2\2\u0427\u0421\3\2\2\2\u0427"+
		"\u0422\3\2\2\2\u0427\u0423\3\2\2\2\u0427\u0424\3\2\2\2\u0427\u0425\3\2"+
		"\2\2\u0427\u0426\3\2\2\2\u0428\u0091\3\2\2\2\u0429\u042a\5\u0094K\2\u042a"+
		"\u042c\5\u0096L\2\u042b\u042d\5\u00a4S\2\u042c\u042b\3\2\2\2\u042c\u042d"+
		"\3\2\2\2\u042d\u043b\3\2\2\2\u042e\u0432\5Z.\2\u042f\u0431\5\u00e8u\2"+
		"\u0430\u042f\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433"+
		"\3\2\2\2\u0433\u0435\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436\5\u0094K"+
		"\2\u0436\u0438\5\u0096L\2\u0437\u0439\5\u00a4S\2\u0438\u0437\3\2\2\2\u0438"+
		"\u0439\3\2\2\2\u0439\u043b\3\2\2\2\u043a\u0429\3\2\2\2\u043a\u042e\3\2"+
		"\2\2\u043b\u0093\3\2\2\2\u043c\u043f\5v<\2\u043d\u043f\7\64\2\2\u043e"+
		"\u043c\3\2\2\2\u043e\u043d\3\2\2\2\u043f\u0095\3\2\2\2\u0440\u0441\7\u0084"+
		"\2\2\u0441\u0443\7W\2\2\u0442\u0444\5\u0098M\2\u0443\u0442\3\2\2\2\u0443"+
		"\u0444\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0447\7X\2\2\u0446\u0448\5\""+
		"\22\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0097\3\2\2\2\u0449"+
		"\u044a\5\u009aN\2\u044a\u044b\7^\2\2\u044b\u044c\5\u00a0Q\2\u044c\u044f"+
		"\3\2\2\2\u044d\u044f\5\u00a0Q\2\u044e\u0449\3\2\2\2\u044e\u044d\3\2\2"+
		"\2\u044f\u0099\3\2\2\2\u0450\u0455\5\u009cO\2\u0451\u0452\7^\2\2\u0452"+
		"\u0454\5\u009cO\2\u0453\u0451\3\2\2\2\u0454\u0457\3\2\2\2\u0455\u0453"+
		"\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0461\3\2\2\2\u0457\u0455\3\2\2\2\u0458"+
		"\u045d\5\u00a2R\2\u0459\u045a\7^\2\2\u045a\u045c\5\u009cO\2\u045b\u0459"+
		"\3\2\2\2\u045c\u045f\3\2\2\2\u045d\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045e"+
		"\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u0460\u0450\3\2\2\2\u0460\u0458\3\2"+
		"\2\2\u0461\u009b\3\2\2\2\u0462\u0464\5\u009eP\2\u0463\u0462\3\2\2\2\u0464"+
		"\u0467\3\2\2\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0468\3\2"+
		"\2\2\u0467\u0465\3\2\2\2\u0468\u0469\5v<\2\u0469\u046a\5r:\2\u046a\u009d"+
		"\3\2\2\2\u046b\u046e\5\u00e8u\2\u046c\u046e\7\26\2\2\u046d\u046b\3\2\2"+
		"\2\u046d\u046c\3\2\2\2\u046e\u009f\3\2\2\2\u046f\u0471\5\u009eP\2\u0470"+
		"\u046f\3\2\2\2\u0471\u0474\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2"+
		"\2\2\u0473\u0475\3\2\2\2\u0474\u0472\3\2\2\2\u0475\u0479\5v<\2\u0476\u0478"+
		"\5\u00e8u\2\u0477\u0476\3\2\2\2\u0478\u047b\3\2\2\2\u0479\u0477\3\2\2"+
		"\2\u0479\u047a\3\2\2\2\u047a\u047c\3\2\2\2\u047b\u0479\3\2\2\2\u047c\u047d"+
		"\7\u0086\2\2\u047d\u047e\5r:\2\u047e\u0481\3\2\2\2\u047f\u0481\5\u009c"+
		"O\2\u0480\u0472\3\2\2\2\u0480\u047f\3\2\2\2\u0481\u00a1\3\2\2\2\u0482"+
		"\u0484\5\u00e8u\2\u0483\u0482\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0483"+
		"\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\3\2\2\2\u0487\u0485\3\2\2\2\u0488"+
		"\u048b\5v<\2\u0489\u048a\7\u0084\2\2\u048a\u048c\7_\2\2\u048b\u0489\3"+
		"\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\7/\2\2\u048e"+
		"\u00a3\3\2\2\2\u048f\u0490\7\61\2\2\u0490\u0491\5\u00a6T\2\u0491\u00a5"+
		"\3\2\2\2\u0492\u0497\5\u00a8U\2\u0493\u0494\7^\2\2\u0494\u0496\5\u00a8"+
		"U\2\u0495\u0493\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0495\3\2\2\2\u0497"+
		"\u0498\3\2\2\2\u0498\u00a7\3\2\2\2\u0499\u0497\3\2\2\2\u049a\u049d\5\22"+
		"\n\2\u049b\u049d\5\36\20\2\u049c\u049a\3\2\2\2\u049c\u049b\3\2\2\2\u049d"+
		"\u00a9\3\2\2\2\u049e\u04a1\5\u00fe\u0080\2\u049f\u04a1\7]\2\2\u04a0\u049e"+
		"\3\2\2\2\u04a0\u049f\3\2\2\2\u04a1\u00ab\3\2\2\2\u04a2\u04a3\5\u00fe\u0080"+
		"\2\u04a3\u00ad\3\2\2\2\u04a4\u04a5\7*\2\2\u04a5\u04a6\5\u00fe\u0080\2"+
		"\u04a6\u00af\3\2\2\2\u04a7\u04a9\5\u00b2Z\2\u04a8\u04a7\3\2\2\2\u04a9"+
		"\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ad\3\2"+
		"\2\2\u04ac\u04aa\3\2\2\2\u04ad\u04af\5\u00b4[\2\u04ae\u04b0\5\u00a4S\2"+
		"\u04af\u04ae\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2"+
		"\5\u00b8]\2\u04b2\u00b1\3\2\2\2\u04b3\u04b8\5\u00e8u\2\u04b4\u04b8\7\'"+
		"\2\2\u04b5\u04b8\7&\2\2\u04b6\u04b8\7%\2\2\u04b7\u04b3\3\2\2\2\u04b7\u04b4"+
		"\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b6\3\2\2\2\u04b8\u00b3\3\2\2\2\u04b9"+
		"\u04bb\5Z.\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\3\2\2"+
		"\2\u04bc\u04bd\5\u00b6\\\2\u04bd\u04bf\7W\2\2\u04be\u04c0\5\u0098M\2\u04bf"+
		"\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\7X"+
		"\2\2\u04c2\u00b5\3\2\2\2\u04c3\u04c4\7\u0084\2\2\u04c4\u00b7\3\2\2\2\u04c5"+
		"\u04c7\7Y\2\2\u04c6\u04c8\5\u00ba^\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3"+
		"\2\2\2\u04c8\u04ca\3\2\2\2\u04c9\u04cb\5\u0100\u0081\2\u04ca\u04c9\3\2"+
		"\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\7Z\2\2\u04cd"+
		"\u00b9\3\2\2\2\u04ce\u04d0\5,\27\2\u04cf\u04ce\3\2\2\2\u04cf\u04d0\3\2"+
		"\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\7/\2\2\u04d2\u04d4\7W\2\2\u04d3\u04d5"+
		"\5\u01c6\u00e4\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\3"+
		"\2\2\2\u04d6\u04d7\7X\2\2\u04d7\u04fd\7]\2\2\u04d8\u04da\5,\27\2\u04d9"+
		"\u04d8\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\7,"+
		"\2\2\u04dc\u04de\7W\2\2\u04dd\u04df\5\u01c6\u00e4\2\u04de\u04dd\3\2\2"+
		"\2\u04de\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\7X\2\2\u04e1\u04fd"+
		"\7]\2\2\u04e2\u04e3\5<\37\2\u04e3\u04e5\7_\2\2\u04e4\u04e6\5,\27\2\u04e5"+
		"\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\7,"+
		"\2\2\u04e8\u04ea\7W\2\2\u04e9\u04eb\5\u01c6\u00e4\2\u04ea\u04e9\3\2\2"+
		"\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\7X\2\2\u04ed\u04ee"+
		"\7]\2\2\u04ee\u04fd\3\2\2\2\u04ef\u04f0\5\u0198\u00cd\2\u04f0\u04f2\7"+
		"_\2\2\u04f1\u04f3\5,\27\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3"+
		"\u04f4\3\2\2\2\u04f4\u04f5\7,\2\2\u04f5\u04f7\7W\2\2\u04f6\u04f8\5\u01c6"+
		"\u00e4\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u04fa\7X\2\2\u04fa\u04fb\7]\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04cf\3\2\2"+
		"\2\u04fc\u04d9\3\2\2\2\u04fc\u04e2\3\2\2\2\u04fc\u04ef\3\2\2\2\u04fd\u00bb"+
		"\3\2\2\2\u04fe\u0500\5X-\2\u04ff\u04fe\3\2\2\2\u0500\u0503\3\2\2\2\u0501"+
		"\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\3\2\2\2\u0503\u0501\3\2"+
		"\2\2\u0504\u0505\7\24\2\2\u0505\u0507\7\u0084\2\2\u0506\u0508\5`\61\2"+
		"\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050a"+
		"\5\u00be`\2\u050a\u00bd\3\2\2\2\u050b\u050d\7Y\2\2\u050c\u050e\5\u00c0"+
		"a\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0510\3\2\2\2\u050f"+
		"\u0511\7^\2\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513\3\2"+
		"\2\2\u0512\u0514\5\u00c6d\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514"+
		"\u0515\3\2\2\2\u0515\u0516\7Z\2\2\u0516\u00bf\3\2\2\2\u0517\u051c\5\u00c2"+
		"b\2\u0518\u0519\7^\2\2\u0519\u051b\5\u00c2b\2\u051a\u0518\3\2\2\2\u051b"+
		"\u051e\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u00c1\3\2"+
		"\2\2\u051e\u051c\3\2\2\2\u051f\u0521\5\u00c4c\2\u0520\u051f\3\2\2\2\u0521"+
		"\u0524\3\2\2\2\u0522\u0520\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0525\3\2"+
		"\2\2\u0524\u0522\3\2\2\2\u0525\u052b\7\u0084\2\2\u0526\u0528\7W\2\2\u0527"+
		"\u0529\5\u01c6\u00e4\2\u0528\u0527\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a"+
		"\3\2\2\2\u052a\u052c\7X\2\2\u052b\u0526\3\2\2\2\u052b\u052c\3\2\2\2\u052c"+
		"\u052e\3\2\2\2\u052d\u052f\5d\63\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2"+
		"\2\2\u052f\u00c3\3\2\2\2\u0530\u0531\5\u00e8u\2\u0531\u00c5\3\2\2\2\u0532"+
		"\u0536\7]\2\2\u0533\u0535\5f\64\2\u0534\u0533\3\2\2\2\u0535\u0538\3\2"+
		"\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u00c7\3\2\2\2\u0538"+
		"\u0536\3\2\2\2\u0539\u053c\5\u00caf\2\u053a\u053c\5\u00dco\2\u053b\u0539"+
		"\3\2\2\2\u053b\u053a\3\2\2\2\u053c\u00c9\3\2\2\2\u053d\u053f\5\u00ccg"+
		"\2\u053e\u053d\3\2\2\2\u053f\u0542\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u0541"+
		"\3\2\2\2\u0541\u0543\3\2\2\2\u0542\u0540\3\2\2\2\u0543\u0544\7 \2\2\u0544"+
		"\u0546\7\u0084\2\2\u0545\u0547\5Z.\2\u0546\u0545\3\2\2\2\u0546\u0547\3"+
		"\2\2\2\u0547\u0549\3\2\2\2\u0548\u054a\5\u00ceh\2\u0549\u0548\3\2\2\2"+
		"\u0549\u054a\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054c\5\u00d0i\2\u054c"+
		"\u00cb\3\2\2\2\u054d\u0555\5\u00e8u\2\u054e\u0555\7\'\2\2\u054f\u0555"+
		"\7&\2\2\u0550\u0555\7%\2\2\u0551\u0555\7\5\2\2\u0552\u0555\7*\2\2\u0553"+
		"\u0555\7+\2\2\u0554\u054d\3\2\2\2\u0554\u054e\3\2\2\2\u0554\u054f\3\2"+
		"\2\2\u0554\u0550\3\2\2\2\u0554\u0551\3\2\2\2\u0554\u0552\3\2\2\2\u0554"+
		"\u0553\3\2\2\2\u0555\u00cd\3\2\2\2\u0556\u0557\7\25\2\2\u0557\u0558\5"+
		"b\62\2\u0558\u00cf\3\2\2\2\u0559\u055d\7Y\2\2\u055a\u055c\5\u00d2j\2\u055b"+
		"\u055a\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2"+
		"\2\2\u055e\u0560\3\2\2\2\u055f\u055d\3\2\2\2\u0560\u0561\7Z\2\2\u0561"+
		"\u00d1\3\2\2\2\u0562\u0568\5\u00d4k\2\u0563\u0568\5\u00d8m\2\u0564\u0568"+
		"\5T+\2\u0565\u0568\5\u00c8e\2\u0566\u0568\7]\2\2\u0567\u0562\3\2\2\2\u0567"+
		"\u0563\3\2\2\2\u0567\u0564\3\2\2\2\u0567\u0565\3\2\2\2\u0567\u0566\3\2"+
		"\2\2\u0568\u00d3\3\2\2\2\u0569\u056b\5\u00d6l\2\u056a\u0569\3\2\2\2\u056b"+
		"\u056e\3\2\2\2\u056c\u056a\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056f\3\2"+
		"\2\2\u056e\u056c\3\2\2\2\u056f\u0570\5v<\2\u0570\u0571\5n8\2\u0571\u0572"+
		"\7]\2\2\u0572\u00d5\3\2\2\2\u0573\u0578\5\u00e8u\2\u0574\u0578\7\'\2\2"+
		"\u0575\u0578\7*\2\2\u0576\u0578\7\26\2\2\u0577\u0573\3\2\2\2\u0577\u0574"+
		"\3\2\2\2\u0577\u0575\3\2\2\2\u0577\u0576\3\2\2\2\u0578\u00d7\3\2\2\2\u0579"+
		"\u057b\5\u00dan\2\u057a\u0579\3\2\2\2\u057b\u057e\3\2\2\2\u057c\u057a"+
		"\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\3\2\2\2\u057e\u057c\3\2\2\2\u057f"+
		"\u0580\5\u0092J\2\u0580\u0581\5\u00aaV\2\u0581\u00d9\3\2\2\2\u0582\u0589"+
		"\5\u00e8u\2\u0583\u0589\7\'\2\2\u0584\u0589\7\5\2\2\u0585\u0589\7\20\2"+
		"\2\u0586\u0589\7*\2\2\u0587\u0589\7+\2\2\u0588\u0582\3\2\2\2\u0588\u0583"+
		"\3\2\2\2\u0588\u0584\3\2\2\2\u0588\u0585\3\2\2\2\u0588\u0586\3\2\2\2\u0588"+
		"\u0587\3\2\2\2\u0589\u00db\3\2\2\2\u058a\u058c\5\u00ccg\2\u058b\u058a"+
		"\3\2\2\2\u058c\u058f\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058e"+
		"\u0590\3\2\2\2\u058f\u058d\3\2\2\2\u0590\u0591\7\u0085\2\2\u0591\u0592"+
		"\7 \2\2\u0592\u0593\7\u0084\2\2\u0593\u0594\5\u00dep\2\u0594\u00dd\3\2"+
		"\2\2\u0595\u0599\7Y\2\2\u0596\u0598\5\u00e0q\2\u0597\u0596\3\2\2\2\u0598"+
		"\u059b\3\2\2\2\u0599\u0597\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059c\3\2"+
		"\2\2\u059b\u0599\3\2\2\2\u059c\u059d\7Z\2\2\u059d\u00df\3\2\2\2\u059e"+
		"\u05a4\5\u00e2r\2\u059f\u05a4\5\u00d4k\2\u05a0\u05a4\5T+\2\u05a1\u05a4"+
		"\5\u00c8e\2\u05a2\u05a4\7]\2\2\u05a3\u059e\3\2\2\2\u05a3\u059f\3\2\2\2"+
		"\u05a3\u05a0\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a2\3\2\2\2\u05a4\u00e1"+
		"\3\2\2\2\u05a5\u05a7\5\u00e4s\2\u05a6\u05a5\3\2\2\2\u05a7\u05aa\3\2\2"+
		"\2\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ab\3\2\2\2\u05aa\u05a8"+
		"\3\2\2\2\u05ab\u05ac\5v<\2\u05ac\u05ad\7\u0084\2\2\u05ad\u05ae\7W\2\2"+
		"\u05ae\u05b0\7X\2\2\u05af\u05b1\5\"\22\2\u05b0\u05af\3\2\2\2\u05b0\u05b1"+
		"\3\2\2\2\u05b1\u05b3\3\2\2\2\u05b2\u05b4\5\u00e6t\2\u05b3\u05b2\3\2\2"+
		"\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\7]\2\2\u05b6\u00e3"+
		"\3\2\2\2\u05b7\u05bb\5\u00e8u\2\u05b8\u05bb\7\'\2\2\u05b9\u05bb\7\5\2"+
		"\2\u05ba\u05b7\3\2\2\2\u05ba\u05b8\3\2\2\2\u05ba\u05b9\3\2\2\2\u05bb\u00e5"+
		"\3\2\2\2\u05bc\u05bd\7\20\2\2\u05bd\u05be\5\u00f0y\2\u05be\u00e7\3\2\2"+
		"\2\u05bf\u05c3\5\u00eav\2\u05c0\u05c3\5\u00f6|\2\u05c1\u05c3\5\u00f8}"+
		"\2\u05c2\u05bf\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c2\u05c1\3\2\2\2\u05c3\u00e9"+
		"\3\2\2\2\u05c4\u05c5\7\u0085\2\2\u05c5\u05c6\58\35\2\u05c6\u05c8\7W\2"+
		"\2\u05c7\u05c9\5\u00ecw\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9"+
		"\u05ca\3\2\2\2\u05ca\u05cb\7X\2\2\u05cb\u00eb\3\2\2\2\u05cc\u05d1\5\u00ee"+
		"x\2\u05cd\u05ce\7^\2\2\u05ce\u05d0\5\u00eex\2\u05cf\u05cd\3\2\2\2\u05d0"+
		"\u05d3\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u00ed\3\2"+
		"\2\2\u05d3\u05d1\3\2\2\2\u05d4\u05d5\7\u0084\2\2\u05d5\u05d6\7`\2\2\u05d6"+
		"\u05d7\5\u00f0y\2\u05d7\u00ef\3\2\2\2\u05d8\u05dc\5\u01e8\u00f5\2\u05d9"+
		"\u05dc\5\u00f2z\2\u05da\u05dc\5\u00e8u\2\u05db\u05d8\3\2\2\2\u05db\u05d9"+
		"\3\2\2\2\u05db\u05da\3\2\2\2\u05dc\u00f1\3\2\2\2\u05dd\u05df\7Y\2\2\u05de"+
		"\u05e0\5\u00f4{\2\u05df\u05de\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e2"+
		"\3\2\2\2\u05e1\u05e3\7^\2\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3"+
		"\u05e4\3\2\2\2\u05e4\u05e5\7Z\2\2\u05e5\u00f3\3\2\2\2\u05e6\u05eb\5\u00f0"+
		"y\2\u05e7\u05e8\7^\2\2\u05e8\u05ea\5\u00f0y\2\u05e9\u05e7\3\2\2\2\u05ea"+
		"\u05ed\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u00f5\3\2"+
		"\2\2\u05ed\u05eb\3\2\2\2\u05ee\u05ef\7\u0085\2\2\u05ef\u05f0\58\35\2\u05f0"+
		"\u00f7\3\2\2\2\u05f1\u05f2\7\u0085\2\2\u05f2\u05f3\58\35\2\u05f3\u05f4"+
		"\7W\2\2\u05f4\u05f5\5\u00f0y\2\u05f5\u05f6\7X\2\2\u05f6\u00f9\3\2\2\2"+
		"\u05f7\u05f9\7Y\2\2\u05f8\u05fa\5\u00fc\177\2\u05f9\u05f8\3\2\2\2\u05f9"+
		"\u05fa\3\2\2\2\u05fa\u05fc\3\2\2\2\u05fb\u05fd\7^\2\2\u05fc\u05fb\3\2"+
		"\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\7Z\2\2\u05ff"+
		"\u00fb\3\2\2\2\u0600\u0605\5t;\2\u0601\u0602\7^\2\2\u0602\u0604\5t;\2"+
		"\u0603\u0601\3\2\2\2\u0604\u0607\3\2\2\2\u0605\u0603\3\2\2\2\u0605\u0606"+
		"\3\2\2\2\u0606\u00fd\3\2\2\2\u0607\u0605\3\2\2\2\u0608\u060a\7Y\2\2\u0609"+
		"\u060b\5\u0100\u0081\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c"+
		"\3\2\2\2\u060c\u060d\7Z\2\2\u060d\u00ff\3\2\2\2\u060e\u0612\5\u0102\u0082"+
		"\2\u060f\u0611\5\u0102\u0082\2\u0610\u060f\3\2\2\2\u0611\u0614\3\2\2\2"+
		"\u0612\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0101\3\2\2\2\u0614\u0612"+
		"\3\2\2\2\u0615\u0619\5\u0104\u0083\2\u0616\u0619\5T+\2\u0617\u0619\5\u0108"+
		"\u0085\2\u0618\u0615\3\2\2\2\u0618\u0616\3\2\2\2\u0618\u0617\3\2\2\2\u0619"+
		"\u0103\3\2\2\2\u061a\u061b\5\u0106\u0084\2\u061b\u061c\7]\2\2\u061c\u0105"+
		"\3\2\2\2\u061d\u061f\5\u009eP\2\u061e\u061d\3\2\2\2\u061f\u0622\3\2\2"+
		"\2\u0620\u061e\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0623\3\2\2\2\u0622\u0620"+
		"\3\2\2\2\u0623\u0624\5v<\2\u0624\u0625\5n8\2\u0625\u0107\3\2\2\2\u0626"+
		"\u062d\5\u010c\u0087\2\u0627\u062d\5\u0110\u0089\2\u0628\u062d\5\u0118"+
		"\u008d\2\u0629\u062d\5\u011a\u008e\2\u062a\u062d\5\u012c\u0097\2\u062b"+
		"\u062d\5\u0132\u009a\2\u062c\u0626\3\2\2\2\u062c\u0627\3\2\2\2\u062c\u0628"+
		"\3\2\2\2\u062c\u0629\3\2\2\2\u062c\u062a\3\2\2\2\u062c\u062b\3\2\2\2\u062d"+
		"\u0109\3\2\2\2\u062e\u0634\5\u010c\u0087\2\u062f\u0634\5\u0112\u008a\2"+
		"\u0630\u0634\5\u011c\u008f\2\u0631\u0634\5\u012e\u0098\2\u0632\u0634\5"+
		"\u0134\u009b\2\u0633\u062e\3\2\2\2\u0633\u062f\3\2\2\2\u0633\u0630\3\2"+
		"\2\2\u0633\u0631\3\2\2\2\u0633\u0632\3\2\2\2\u0634\u010b\3\2\2\2\u0635"+
		"\u0643\5\u0162\u00b2\2\u0636\u0643\5\u00fe\u0080\2\u0637\u0643\5\u010e"+
		"\u0088\2\u0638\u0643\5\u0114\u008b\2\u0639\u0643\5\u011e\u0090\2\u063a"+
		"\u0643\5\u0120\u0091\2\u063b\u0643\5\u0130\u0099\2\u063c\u0643\5\u0144"+
		"\u00a3\2\u063d\u0643\5\u0146\u00a4\2\u063e\u0643\5\u0148\u00a5\2\u063f"+
		"\u0643\5\u014c\u00a7\2\u0640\u0643\5\u014a\u00a6\2\u0641\u0643\5\u014e"+
		"\u00a8\2\u0642\u0635\3\2\2\2\u0642\u0636\3\2\2\2\u0642\u0637\3\2\2\2\u0642"+
		"\u0638\3\2\2\2\u0642\u0639\3\2\2\2\u0642\u063a\3\2\2\2\u0642\u063b\3\2"+
		"\2\2\u0642\u063c\3\2\2\2\u0642\u063d\3\2\2\2\u0642\u063e\3\2\2\2\u0642"+
		"\u063f\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0641\3\2\2\2\u0643\u010d\3\2"+
		"\2\2\u0644\u0645\7]\2\2\u0645\u010f\3\2\2\2\u0646\u0647\7\u0084\2\2\u0647"+
		"\u0648\7f\2\2\u0648\u0649\5\u0108\u0085\2\u0649\u0111\3\2\2\2\u064a\u064b"+
		"\7\u0084\2\2\u064b\u064c\7f\2\2\u064c\u064d\5\u010a\u0086\2\u064d\u0113"+
		"\3\2\2\2\u064e\u064f\5\u0116\u008c\2\u064f\u0650\7]\2\2\u0650\u0115\3"+
		"\2\2\2\u0651\u0659\5\u01e2\u00f2\2\u0652\u0659\5\u0200\u0101\2\u0653\u0659"+
		"\5\u0202\u0102\2\u0654\u0659\5\u0208\u0105\2\u0655\u0659\5\u020c\u0107"+
		"\2\u0656\u0659\5\u01c0\u00e1\2\u0657\u0659\5\u01ac\u00d7\2\u0658\u0651"+
		"\3\2\2\2\u0658\u0652\3\2\2\2\u0658\u0653\3\2\2\2\u0658\u0654\3\2\2\2\u0658"+
		"\u0655\3\2\2\2\u0658\u0656\3\2\2\2\u0658\u0657\3\2\2\2\u0659\u0117\3\2"+
		"\2\2\u065a\u065b\7\32\2\2\u065b\u065c\7W\2\2\u065c\u065d\5\u01d6\u00ec"+
		"\2\u065d\u065e\7X\2\2\u065e\u065f\5\u0108\u0085\2\u065f\u0119\3\2\2\2"+
		"\u0660\u0661\7\32\2\2\u0661\u0662\7W\2\2\u0662\u0663\5\u01d6\u00ec\2\u0663"+
		"\u0664\7X\2\2\u0664\u0665\5\u010a\u0086\2\u0665\u0666\7\23\2\2\u0666\u0667"+
		"\5\u0108\u0085\2\u0667\u011b\3\2\2\2\u0668\u0669\7\32\2\2\u0669\u066a"+
		"\7W\2\2\u066a\u066b\5\u01d6\u00ec\2\u066b\u066c\7X\2\2\u066c\u066d\5\u010a"+
		"\u0086\2\u066d\u066e\7\23\2\2\u066e\u066f\5\u010a\u0086\2\u066f\u011d"+
		"\3\2\2\2\u0670\u0671\7\6\2\2\u0671\u0672\5\u01d6\u00ec\2\u0672\u0673\7"+
		"]\2\2\u0673\u067b\3\2\2\2\u0674\u0675\7\6\2\2\u0675\u0676\5\u01d6\u00ec"+
		"\2\u0676\u0677\7f\2\2\u0677\u0678\5\u01d6\u00ec\2\u0678\u0679\7]\2\2\u0679"+
		"\u067b\3\2\2\2\u067a\u0670\3\2\2\2\u067a\u0674\3\2\2\2\u067b\u011f\3\2"+
		"\2\2\u067c\u067d\7-\2\2\u067d\u067e\7W\2\2\u067e\u067f\5\u01d6\u00ec\2"+
		"\u067f\u0680\7X\2\2\u0680\u0681\5\u0122\u0092\2\u0681\u0121\3\2\2\2\u0682"+
		"\u0686\7Y\2\2\u0683\u0685\5\u0124\u0093\2\u0684\u0683\3\2\2\2\u0685\u0688"+
		"\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u068c\3\2\2\2\u0688"+
		"\u0686\3\2\2\2\u0689\u068b\5\u0128\u0095\2\u068a\u0689\3\2\2\2\u068b\u068e"+
		"\3\2\2\2\u068c\u068a\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068f\3\2\2\2\u068e"+
		"\u068c\3\2\2\2\u068f\u0690\7Z\2\2\u0690\u0123\3\2\2\2\u0691\u0692\5\u0126"+
		"\u0094\2\u0692\u0693\5\u0100\u0081\2\u0693\u0125\3\2\2\2\u0694\u0698\5"+
		"\u0128\u0095\2\u0695\u0697\5\u0128\u0095\2\u0696\u0695\3\2\2\2\u0697\u069a"+
		"\3\2\2\2\u0698\u0696\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u0127\3\2\2\2\u069a"+
		"\u0698\3\2\2\2\u069b\u069c\7\n\2\2\u069c\u069d\5\u01d4\u00eb\2\u069d\u069e"+
		"\7f\2\2\u069e\u06a6\3\2\2\2\u069f\u06a0\7\n\2\2\u06a0\u06a1\5\u012a\u0096"+
		"\2\u06a1\u06a2\7f\2\2\u06a2\u06a6\3\2\2\2\u06a3\u06a4\7\20\2\2\u06a4\u06a6"+
		"\7f\2\2\u06a5\u069b\3\2\2\2\u06a5\u069f\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6"+
		"\u0129\3\2\2\2\u06a7\u06a8\7\u0084\2\2\u06a8\u012b\3\2\2\2\u06a9\u06aa"+
		"\7\66\2\2\u06aa\u06ab\7W\2\2\u06ab\u06ac\5\u01d6\u00ec\2\u06ac\u06ad\7"+
		"X\2\2\u06ad\u06ae\5\u0108\u0085\2\u06ae\u012d\3\2\2\2\u06af\u06b0\7\66"+
		"\2\2\u06b0\u06b1\7W\2\2\u06b1\u06b2\5\u01d6\u00ec\2\u06b2\u06b3\7X\2\2"+
		"\u06b3\u06b4\5\u010a\u0086\2\u06b4\u012f\3\2\2\2\u06b5\u06b6\7\21\2\2"+
		"\u06b6\u06b7\5\u0108\u0085\2\u06b7\u06b8\7\66\2\2\u06b8\u06b9\7W\2\2\u06b9"+
		"\u06ba\5\u01d6\u00ec\2\u06ba\u06bb\7X\2\2\u06bb\u06bc\7]\2\2\u06bc\u0131"+
		"\3\2\2\2\u06bd\u06c0\5\u0136\u009c\2\u06be\u06c0\5\u0140\u00a1\2\u06bf"+
		"\u06bd\3\2\2\2\u06bf\u06be\3\2\2\2\u06c0\u0133\3\2\2\2\u06c1\u06c4\5\u0138"+
		"\u009d\2\u06c2\u06c4\5\u0142\u00a2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c2\3"+
		"\2\2\2\u06c4\u0135\3\2\2\2\u06c5\u06c6\7\31\2\2\u06c6\u06c8\7W\2\2\u06c7"+
		"\u06c9\5\u013a\u009e\2\u06c8\u06c7\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06ca"+
		"\3\2\2\2\u06ca\u06cc\7]\2\2\u06cb\u06cd\5\u01d6\u00ec\2\u06cc\u06cb\3"+
		"\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d0\7]\2\2\u06cf"+
		"\u06d1\5\u013c\u009f\2\u06d0\u06cf\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d2"+
		"\3\2\2\2\u06d2\u06d3\7X\2\2\u06d3\u06d4\5\u0108\u0085\2\u06d4\u0137\3"+
		"\2\2\2\u06d5\u06d6\7\31\2\2\u06d6\u06d8\7W\2\2\u06d7\u06d9\5\u013a\u009e"+
		"\2\u06d8\u06d7\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dc"+
		"\7]\2\2\u06db\u06dd\5\u01d6\u00ec\2\u06dc\u06db\3\2\2\2\u06dc\u06dd\3"+
		"\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e0\7]\2\2\u06df\u06e1\5\u013c\u009f"+
		"\2\u06e0\u06df\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3"+
		"\7X\2\2\u06e3\u06e4\5\u010a\u0086\2\u06e4\u0139\3\2\2\2\u06e5\u06e8\5"+
		"\u013e\u00a0\2\u06e6\u06e8\5\u0106\u0084\2\u06e7\u06e5\3\2\2\2\u06e7\u06e6"+
		"\3\2\2\2\u06e8\u013b\3\2\2\2\u06e9\u06ea\5\u013e\u00a0\2\u06ea\u013d\3"+
		"\2\2\2\u06eb\u06f0\5\u0116\u008c\2\u06ec\u06ed\7^\2\2\u06ed\u06ef\5\u0116"+
		"\u008c\2\u06ee\u06ec\3\2\2\2\u06ef\u06f2\3\2\2\2\u06f0\u06ee\3\2\2\2\u06f0"+
		"\u06f1\3\2\2\2\u06f1\u013f\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f3\u06f4\7\31"+
		"\2\2\u06f4\u06f8\7W\2\2\u06f5\u06f7\5\u009eP\2\u06f6\u06f5\3\2\2\2\u06f7"+
		"\u06fa\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fb\3\2"+
		"\2\2\u06fa\u06f8\3\2\2\2\u06fb\u06fc\5v<\2\u06fc\u06fd\5r:\2\u06fd\u06fe"+
		"\7f\2\2\u06fe\u06ff\5\u01d6\u00ec\2\u06ff\u0700\7X\2\2\u0700\u0701\5\u0108"+
		"\u0085\2\u0701\u0141\3\2\2\2\u0702\u0703\7\31\2\2\u0703\u0707\7W\2\2\u0704"+
		"\u0706\5\u009eP\2\u0705\u0704\3\2\2\2\u0706\u0709\3\2\2\2\u0707\u0705"+
		"\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u070a\3\2\2\2\u0709\u0707\3\2\2\2\u070a"+
		"\u070b\5v<\2\u070b\u070c\5r:\2\u070c\u070d\7f\2\2\u070d\u070e\5\u01d6"+
		"\u00ec\2\u070e\u070f\7X\2\2\u070f\u0710\5\u010a\u0086\2\u0710\u0143\3"+
		"\2\2\2\u0711\u0713\7\b\2\2\u0712\u0714\7\u0084\2\2\u0713\u0712\3\2\2\2"+
		"\u0713\u0714\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0716\7]\2\2\u0716\u0145"+
		"\3\2\2\2\u0717\u0719\7\17\2\2\u0718\u071a\7\u0084\2\2\u0719\u0718\3\2"+
		"\2\2\u0719\u071a\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u071c\7]\2\2\u071c"+
		"\u0147\3\2\2\2\u071d\u071f\7(\2\2\u071e\u0720\5\u01d6\u00ec\2\u071f\u071e"+
		"\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0722\7]\2\2\u0722"+
		"\u0149\3\2\2\2\u0723\u0724\7\60\2\2\u0724\u0725\5\u01d6\u00ec\2\u0725"+
		"\u0726\7]\2\2\u0726\u014b\3\2\2\2\u0727\u0728\7.\2\2\u0728\u0729\7W\2"+
		"\2\u0729\u072a\5\u01d6\u00ec\2\u072a\u072b\7X\2\2\u072b\u072c\5\u00fe"+
		"\u0080\2\u072c\u014d\3\2\2\2\u072d\u072e\7\63\2\2\u072e\u072f\5\u00fe"+
		"\u0080\2\u072f\u0730\5\u0150\u00a9\2\u0730\u073a\3\2\2\2\u0731\u0732\7"+
		"\63\2\2\u0732\u0734\5\u00fe\u0080\2\u0733\u0735\5\u0150\u00a9\2\u0734"+
		"\u0733\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0737\5\u0158"+
		"\u00ad\2\u0737\u073a\3\2\2\2\u0738\u073a\5\u015a\u00ae\2\u0739\u072d\3"+
		"\2\2\2\u0739\u0731\3\2\2\2\u0739\u0738\3\2\2\2\u073a\u014f\3\2\2\2\u073b"+
		"\u073f\5\u0152\u00aa\2\u073c\u073e\5\u0152\u00aa\2\u073d\u073c\3\2\2\2"+
		"\u073e\u0741\3\2\2\2\u073f\u073d\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0151"+
		"\3\2\2\2\u0741\u073f\3\2\2\2\u0742\u0743\7\13\2\2\u0743\u0744\7W\2\2\u0744"+
		"\u0745\5\u0154\u00ab\2\u0745\u0746\7X\2\2\u0746\u0747\5\u00fe\u0080\2"+
		"\u0747\u0153\3\2\2\2\u0748\u074a\5\u009eP\2\u0749\u0748\3\2\2\2\u074a"+
		"\u074d\3\2\2\2\u074b\u0749\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u074e\3\2"+
		"\2\2\u074d\u074b\3\2\2\2\u074e\u074f\5\u0156\u00ac\2\u074f\u0750\5r:\2"+
		"\u0750\u0155\3\2\2\2\u0751\u0756\5~@\2\u0752\u0753\7t\2\2\u0753\u0755"+
		"\5\22\n\2\u0754\u0752\3\2\2\2\u0755\u0758\3\2\2\2\u0756\u0754\3\2\2\2"+
		"\u0756\u0757\3\2\2\2\u0757\u0157\3\2\2\2\u0758\u0756\3\2\2\2\u0759\u075a"+
		"\7\27\2\2\u075a\u075b\5\u00fe\u0080\2\u075b\u0159\3\2\2\2\u075c\u075d"+
		"\7\63\2\2\u075d\u075e\5\u015c\u00af\2\u075e\u0760\5\u00fe\u0080\2\u075f"+
		"\u0761\5\u0150\u00a9\2\u0760\u075f\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0763"+
		"\3\2\2\2\u0762\u0764\5\u0158\u00ad\2\u0763\u0762\3\2\2\2\u0763\u0764\3"+
		"\2\2\2\u0764\u015b\3\2\2\2\u0765\u0766\7W\2\2\u0766\u0768\5\u015e\u00b0"+
		"\2\u0767\u0769\7]\2\2\u0768\u0767\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076a"+
		"\3\2\2\2\u076a\u076b\7X\2\2\u076b\u015d\3\2\2\2\u076c\u0771\5\u0160\u00b1"+
		"\2\u076d\u076e\7]\2\2\u076e\u0770\5\u0160\u00b1\2\u076f\u076d\3\2\2\2"+
		"\u0770\u0773\3\2\2\2\u0771\u076f\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u015f"+
		"\3\2\2\2\u0773\u0771\3\2\2\2\u0774\u0776\5\u009eP\2\u0775\u0774\3\2\2"+
		"\2\u0776\u0779\3\2\2\2\u0777\u0775\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u077a"+
		"\3\2\2\2\u0779\u0777\3\2\2\2\u077a\u077b\5v<\2\u077b\u077c\5r:\2\u077c"+
		"\u077d\7`\2\2\u077d\u077e\5\u01d6\u00ec\2\u077e\u0161\3\2\2\2\u077f\u0780"+
		"\7\67\2\2\u0780\u0781\5\u0164\u00b3\2\u0781\u0163\3\2\2\2\u0782\u0792"+
		"\5\u0166\u00b4\2\u0783\u0792\5\u0168\u00b5\2\u0784\u0792\5\u016a\u00b6"+
		"\2\u0785\u0792\5\u016c\u00b7\2\u0786\u0792\5\u016e\u00b8\2\u0787\u0792"+
		"\5\u0170\u00b9\2\u0788\u0792\5\u0172\u00ba\2\u0789\u0792\5\u0174\u00bb"+
		"\2\u078a\u0792\5\u0176\u00bc\2\u078b\u0792\5\u0178\u00bd\2\u078c\u0792"+
		"\5\u017a\u00be\2\u078d\u0792\5\u017c\u00bf\2\u078e\u0792\5\u017e\u00c0"+
		"\2\u078f\u0792\5\u0180\u00c1\2\u0790\u0792\5\u0182\u00c2\2\u0791\u0782"+
		"\3\2\2\2\u0791\u0783\3\2\2\2\u0791\u0784\3\2\2\2\u0791\u0785\3\2\2\2\u0791"+
		"\u0786\3\2\2\2\u0791\u0787\3\2\2\2\u0791\u0788\3\2\2\2\u0791\u0789\3\2"+
		"\2\2\u0791\u078a\3\2\2\2\u0791\u078b\3\2\2\2\u0791\u078c\3\2\2\2\u0791"+
		"\u078d\3\2\2\2\u0791\u078e\3\2\2\2\u0791\u078f\3\2\2\2\u0791\u0790\3\2"+
		"\2\2\u0792\u0165\3\2\2\2\u0793\u07a1\78\2\2\u0794\u0795\7\32\2\2\u0795"+
		"\u0796\7W\2\2\u0796\u0797\5\u01d6\u00ec\2\u0797\u0798\7X\2\2\u0798\u07a0"+
		"\3\2\2\2\u0799\u079a\7O\2\2\u079a\u079b\7W\2\2\u079b\u079c\5\u01d6\u00ec"+
		"\2\u079c\u079d\7X\2\2\u079d\u07a0\3\2\2\2\u079e\u07a0\5\u0186\u00c4\2"+
		"\u079f\u0794\3\2\2\2\u079f\u0799\3\2\2\2\u079f\u079e\3\2\2\2\u07a0\u07a3"+
		"\3\2\2\2\u07a1\u079f\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a4\3\2\2\2\u07a3"+
		"\u07a1\3\2\2\2\u07a4\u07a5\5\u0108\u0085\2\u07a5\u0167\3\2\2\2\u07a6\u07b6"+
		"\79\2\2\u07a7\u07a8\7\32\2\2\u07a8\u07a9\7W\2\2\u07a9\u07aa\5\u01d6\u00ec"+
		"\2\u07aa\u07ab\7X\2\2\u07ab\u07b5\3\2\2\2\u07ac\u07ad\7O\2\2\u07ad\u07ae"+
		"\7W\2\2\u07ae\u07af\5\u01d6\u00ec\2\u07af\u07b0\7X\2\2\u07b0\u07b5\3\2"+
		"\2\2\u07b1\u07b5\7E\2\2\u07b2\u07b5\5\u0186\u00c4\2\u07b3\u07b5\5\u0184"+
		"\u00c3\2\u07b4\u07a7\3\2\2\2\u07b4\u07ac\3\2\2\2\u07b4\u07b1\3\2\2\2\u07b4"+
		"\u07b2\3\2\2\2\u07b4\u07b3\3\2\2\2\u07b5\u07b8\3\2\2\2\u07b6\u07b4\3\2"+
		"\2\2\u07b6\u07b7\3\2\2\2\u07b7\u07b9\3\2\2\2\u07b8\u07b6\3\2\2\2\u07b9"+
		"\u07ba\5\u0132\u009a\2\u07ba\u0169\3\2\2\2\u07bb\u07c9\7:\2\2\u07bc\u07bd"+
		"\7\32\2\2\u07bd\u07be\7W\2\2\u07be\u07bf\5\u01d6\u00ec\2\u07bf\u07c0\7"+
		"X\2\2\u07c0\u07c8\3\2\2\2\u07c1\u07c2\7O\2\2\u07c2\u07c3\7W\2\2\u07c3"+
		"\u07c4\5\u01d6\u00ec\2\u07c4\u07c5\7X\2\2\u07c5\u07c8\3\2\2\2\u07c6\u07c8"+
		"\5\u0186\u00c4\2\u07c7\u07bc\3\2\2\2\u07c7\u07c1\3\2\2\2\u07c7\u07c6\3"+
		"\2\2\2\u07c8\u07cb\3\2\2\2\u07c9\u07c7\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca"+
		"\u07cc\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cc\u07cd\5\u0108\u0085\2\u07cd\u016b"+
		"\3\2\2\2\u07ce\u07df\7\31\2\2\u07cf\u07d0\7\32\2\2\u07d0\u07d1\7W\2\2"+
		"\u07d1\u07d2\5\u01d6\u00ec\2\u07d2\u07d3\7X\2\2\u07d3\u07de\3\2\2\2\u07d4"+
		"\u07d5\7O\2\2\u07d5\u07d6\7W\2\2\u07d6\u07d7\5\u01d6\u00ec\2\u07d7\u07d8"+
		"\7X\2\2\u07d8\u07de\3\2\2\2\u07d9\u07de\7N\2\2\u07da\u07de\7E\2\2\u07db"+
		"\u07de\5\u0186\u00c4\2\u07dc\u07de\5\u0184\u00c3\2\u07dd\u07cf\3\2\2\2"+
		"\u07dd\u07d4\3\2\2\2\u07dd\u07d9\3\2\2\2\u07dd\u07da\3\2\2\2\u07dd\u07db"+
		"\3\2\2\2\u07dd\u07dc\3\2\2\2\u07de\u07e1\3\2\2\2\u07df\u07dd\3\2\2\2\u07df"+
		"\u07e0\3\2\2\2\u07e0\u07e2\3\2\2\2\u07e1\u07df\3\2\2\2\u07e2\u07e3\5\u0132"+
		"\u009a\2\u07e3\u016d\3\2\2\2\u07e4\u07f3\7F\2\2\u07e5\u07e6\7\32\2\2\u07e6"+
		"\u07e7\7W\2\2\u07e7\u07e8\5\u01d6\u00ec\2\u07e8\u07e9\7X\2\2\u07e9\u07f2"+
		"\3\2\2\2\u07ea\u07eb\7O\2\2\u07eb\u07ec\7W\2\2\u07ec\u07ed\5\u01d6\u00ec"+
		"\2\u07ed\u07ee\7X\2\2\u07ee\u07f2\3\2\2\2\u07ef\u07f2\7N\2\2\u07f0\u07f2"+
		"\5\u0186\u00c4\2\u07f1\u07e5\3\2\2\2\u07f1\u07ea\3\2\2\2\u07f1\u07ef\3"+
		"\2\2\2\u07f1\u07f0\3\2\2\2\u07f2\u07f5\3\2\2\2\u07f3\u07f1\3\2\2\2\u07f3"+
		"\u07f4\3\2\2\2\u07f4\u07f6\3\2\2\2\u07f5\u07f3\3\2\2\2\u07f6\u07f7\5\u0108"+
		"\u0085\2\u07f7\u016f\3\2\2\2\u07f8\u07fc\7@\2\2\u07f9\u07fb\78\2\2\u07fa"+
		"\u07f9\3\2\2\2\u07fb\u07fe\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fc\u07fd\3\2"+
		"\2\2\u07fd\u080a\3\2\2\2\u07fe\u07fc\3\2\2\2\u07ff\u0800\7\32\2\2\u0800"+
		"\u0801\7W\2\2\u0801\u0802\5\u01d6\u00ec\2\u0802\u0803\7X\2\2\u0803\u080b"+
		"\3\2\2\2\u0804\u0805\7O\2\2\u0805\u0806\7W\2\2\u0806\u0807\5\u01d6\u00ec"+
		"\2\u0807\u0808\7X\2\2\u0808\u080b\3\2\2\2\u0809\u080b\5\u0186\u00c4\2"+
		"\u080a\u07ff\3\2\2\2\u080a\u0804\3\2\2\2\u080a\u0809\3\2\2\2\u080b\u080c"+
		"\3\2\2\2\u080c\u080d\5\u0108\u0085\2\u080d\u0171\3\2\2\2\u080e\u081c\7"+
		"G\2\2\u080f\u0810\7\32\2\2\u0810\u0811\7W\2\2\u0811\u0812\5\u01d6\u00ec"+
		"\2\u0812\u0813\7X\2\2\u0813\u081b\3\2\2\2\u0814\u0815\7O\2\2\u0815\u0816"+
		"\7W\2\2\u0816\u0817\5\u01d6\u00ec\2\u0817\u0818\7X\2\2\u0818\u081b\3\2"+
		"\2\2\u0819\u081b\5\u0186\u00c4\2\u081a\u080f\3\2\2\2\u081a\u0814\3\2\2"+
		"\2\u081a\u0819\3\2\2\2\u081b\u081e\3\2\2\2\u081c\u081a\3\2\2\2\u081c\u081d"+
		"\3\2\2\2\u081d\u081f\3\2\2\2\u081e\u081c\3\2\2\2\u081f\u0820\5\u0108\u0085"+
		"\2\u0820\u0173\3\2\2\2\u0821\u0822\7A\2\2\u0822\u0823\5\u0108\u0085\2"+
		"\u0823\u0175\3\2\2\2\u0824\u0827\7H\2\2\u0825\u0828\7N\2\2\u0826\u0828"+
		"\5\u0186\u00c4\2\u0827\u0825\3\2\2\2\u0827\u0826\3\2\2\2\u0828\u0829\3"+
		"\2\2\2\u0829\u082a\5\u0108\u0085\2\u082a\u0177\3\2\2\2\u082b\u082c\7I"+
		"\2\2\u082c\u082d\5\u0108\u0085\2\u082d\u0179\3\2\2\2\u082e\u0832\7J\2"+
		"\2\u082f\u0830\7W\2\2\u0830\u0831\7\u0084\2\2\u0831\u0833\7X\2\2\u0832"+
		"\u082f\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0835\5\u0108"+
		"\u0085\2\u0835\u017b\3\2\2\2\u0836\u0837\7K\2\2\u0837\u0838\5\u0108\u0085"+
		"\2\u0838\u017d\3\2\2\2\u0839\u083a\7M\2\2\u083a\u017f\3\2\2\2\u083b\u083c"+
		"\7L\2\2\u083c\u0181\3\2\2\2\u083d\u083e\7E\2\2\u083e\u083f\5\u0108\u0085"+
		"\2\u083f\u0183\3\2\2\2\u0840\u0841\7B\2\2\u0841\u0842\7W\2\2\u0842\u0845"+
		"\t\5\2\2\u0843\u0844\7^\2\2\u0844\u0846\5\u01d6\u00ec\2\u0845\u0843\3"+
		"\2\2\2\u0845\u0846\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848\7X\2\2\u0848"+
		"\u0185\3\2\2\2\u0849\u0850\5\u0188\u00c5\2\u084a\u0850\5\u018a\u00c6\2"+
		"\u084b\u0850\5\u018c\u00c7\2\u084c\u0850\5\u018e\u00c8\2\u084d\u0850\5"+
		"\u0190\u00c9\2\u084e\u0850\5\u0192\u00ca\2\u084f\u0849\3\2\2\2\u084f\u084a"+
		"\3\2\2\2\u084f\u084b\3\2\2\2\u084f\u084c\3\2\2\2\u084f\u084d\3\2\2\2\u084f"+
		"\u084e\3\2\2\2\u0850\u0187\3\2\2\2\u0851\u0852\7%\2\2\u0852\u0853\7W\2"+
		"\2\u0853\u0854\5\u0194\u00cb\2\u0854\u0855\7X\2\2\u0855\u0189\3\2\2\2"+
		"\u0856\u0857\7=\2\2\u0857\u0858\7W\2\2\u0858\u0859\5\u0194\u00cb\2\u0859"+
		"\u085a\7X\2\2\u085a\u018b\3\2\2\2\u085b\u085c\7<\2\2\u085c\u085d\7W\2"+
		"\2\u085d\u085e\5\u0194\u00cb\2\u085e\u085f\7X\2\2\u085f\u018d\3\2\2\2"+
		"\u0860\u0861\7?\2\2\u0861\u0862\7W\2\2\u0862\u0863\5\u0196\u00cc\2\u0863"+
		"\u0864\7X\2\2\u0864\u018f\3\2\2\2\u0865\u0866\7P\2\2\u0866\u0867\7W\2"+
		"\2\u0867\u0868\5\u0194\u00cb\2\u0868\u0869\7X\2\2\u0869\u0191\3\2\2\2"+
		"\u086a\u086b\7\20\2\2\u086b\u086c\7W\2\2\u086c\u086d\t\6\2\2\u086d\u086e"+
		"\7X\2\2\u086e\u0193\3\2\2\2\u086f\u0874\7\u0084\2\2\u0870\u0871\7^\2\2"+
		"\u0871\u0873\7\u0084\2\2\u0872\u0870\3\2\2\2\u0873\u0876\3\2\2\2\u0874"+
		"\u0872\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0195\3\2\2\2\u0876\u0874\3\2"+
		"\2\2\u0877\u0878\5\u01d6\u00ec\2\u0878\u087f\7\u0084\2\2\u0879\u087a\7"+
		"^\2\2\u087a\u087b\5\u01d6\u00ec\2\u087b\u087c\7\u0084\2\2\u087c\u087e"+
		"\3\2\2\2\u087d\u0879\3\2\2\2\u087e\u0881\3\2\2\2\u087f\u087d\3\2\2\2\u087f"+
		"\u0880\3\2\2\2\u0880\u0197\3\2\2\2\u0881\u087f\3\2\2\2\u0882\u0885\5\u01a6"+
		"\u00d4\2\u0883\u0885\5\u01ce\u00e8\2\u0884\u0882\3\2\2\2\u0884\u0883\3"+
		"\2\2\2\u0885\u0889\3\2\2\2\u0886\u0888\5\u01a0\u00d1\2\u0887\u0886\3\2"+
		"\2\2\u0888\u088b\3\2\2\2\u0889\u0887\3\2\2\2\u0889\u088a\3\2\2\2\u088a"+
		"\u0199\3\2\2\2\u088b\u0889\3\2\2\2\u088c\u08aa\5\2\2\2\u088d\u0892\58"+
		"\35\2\u088e\u088f\7[\2\2\u088f\u0891\7\\\2\2\u0890\u088e\3\2\2\2\u0891"+
		"\u0894\3\2\2\2\u0892\u0890\3\2\2\2\u0892\u0893\3\2\2\2\u0893\u0895\3\2"+
		"\2\2\u0894\u0892\3\2\2\2\u0895\u0896\7_\2\2\u0896\u0897\7\r\2\2\u0897"+
		"\u08aa\3\2\2\2\u0898\u0899\7\64\2\2\u0899\u089a\7_\2\2\u089a\u08aa\7\r"+
		"\2\2\u089b\u08aa\7/\2\2\u089c\u089d\58\35\2\u089d\u089e\7_\2\2\u089e\u089f"+
		"\7/\2\2\u089f\u08aa\3\2\2\2\u08a0\u08a1\7W\2\2\u08a1\u08a2\5\u01d6\u00ec"+
		"\2\u08a2\u08a3\7X\2\2\u08a3\u08aa\3\2\2\2\u08a4\u08aa\5\u01ac\u00d7\2"+
		"\u08a5\u08aa\5\u01b4\u00db\2\u08a6\u08aa\5\u01ba\u00de\2\u08a7\u08aa\5"+
		"\u01c0\u00e1\2\u08a8\u08aa\5\u01c8\u00e5\2\u08a9\u088c\3\2\2\2\u08a9\u088d"+
		"\3\2\2\2\u08a9\u0898\3\2\2\2\u08a9\u089b\3\2\2\2\u08a9\u089c\3\2\2\2\u08a9"+
		"\u08a0\3\2\2\2\u08a9\u08a4\3\2\2\2\u08a9\u08a5\3\2\2\2\u08a9\u08a6\3\2"+
		"\2\2\u08a9\u08a7\3\2\2\2\u08a9\u08a8\3\2\2\2\u08aa\u019b\3\2\2\2\u08ab"+
		"\u08ac\3\2\2\2\u08ac\u019d\3\2\2\2\u08ad\u08ca\5\2\2\2\u08ae\u08b3\58"+
		"\35\2\u08af\u08b0\7[\2\2\u08b0\u08b2\7\\\2\2\u08b1\u08af\3\2\2\2\u08b2"+
		"\u08b5\3\2\2\2\u08b3\u08b1\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08b6\3\2"+
		"\2\2\u08b5\u08b3\3\2\2\2\u08b6\u08b7\7_\2\2\u08b7\u08b8\7\r\2\2\u08b8"+
		"\u08ca\3\2\2\2\u08b9\u08ba\7\64\2\2\u08ba\u08bb\7_\2\2\u08bb\u08ca\7\r"+
		"\2\2\u08bc\u08ca\7/\2\2\u08bd\u08be\58\35\2\u08be\u08bf\7_\2\2\u08bf\u08c0"+
		"\7/\2\2\u08c0\u08ca\3\2\2\2\u08c1\u08c2\7W\2\2\u08c2\u08c3\5\u01d6\u00ec"+
		"\2\u08c3\u08c4\7X\2\2\u08c4\u08ca\3\2\2\2\u08c5\u08ca\5\u01ac\u00d7\2"+
		"\u08c6\u08ca\5\u01b4\u00db\2\u08c7\u08ca\5\u01c0\u00e1\2\u08c8\u08ca\5"+
		"\u01c8\u00e5\2\u08c9\u08ad\3\2\2\2\u08c9\u08ae\3\2\2\2\u08c9\u08b9\3\2"+
		"\2\2\u08c9\u08bc\3\2\2\2\u08c9\u08bd\3\2\2\2\u08c9\u08c1\3\2\2\2\u08c9"+
		"\u08c5\3\2\2\2\u08c9\u08c6\3\2\2\2\u08c9\u08c7\3\2\2\2\u08c9\u08c8\3\2"+
		"\2\2\u08ca\u019f\3\2\2\2\u08cb\u08d1\5\u01ae\u00d8\2\u08cc\u08d1\5\u01b6"+
		"\u00dc\2\u08cd\u08d1\5\u01bc\u00df\2\u08ce\u08d1\5\u01c2\u00e2\2\u08cf"+
		"\u08d1\5\u01ca\u00e6\2\u08d0\u08cb\3\2\2\2\u08d0\u08cc\3\2\2\2\u08d0\u08cd"+
		"\3\2\2\2\u08d0\u08ce\3\2\2\2\u08d0\u08cf\3\2\2\2\u08d1\u01a1\3\2\2\2\u08d2"+
		"\u08d3\3\2\2\2\u08d3\u01a3\3\2\2\2\u08d4\u08d9\5\u01ae\u00d8\2\u08d5\u08d9"+
		"\5\u01b6\u00dc\2\u08d6\u08d9\5\u01c2\u00e2\2\u08d7\u08d9\5\u01ca\u00e6"+
		"\2\u08d8\u08d4\3\2\2\2\u08d8\u08d5\3\2\2\2\u08d8\u08d6\3\2\2\2\u08d8\u08d7"+
		"\3\2\2\2\u08d9\u01a5\3\2\2\2\u08da\u0903\5\2\2\2\u08db\u08e0\58\35\2\u08dc"+
		"\u08dd\7[\2\2\u08dd\u08df\7\\\2\2\u08de\u08dc\3\2\2\2\u08df\u08e2\3\2"+
		"\2\2\u08e0\u08de\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e3\3\2\2\2\u08e2"+
		"\u08e0\3\2\2\2\u08e3\u08e4\7_\2\2\u08e4\u08e5\7\r\2\2\u08e5\u0903\3\2"+
		"\2\2\u08e6\u08eb\5x=\2\u08e7\u08e8\7[\2\2\u08e8\u08ea\7\\\2\2\u08e9\u08e7"+
		"\3\2\2\2\u08ea\u08ed\3\2\2\2\u08eb\u08e9\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec"+
		"\u08ee\3\2\2\2\u08ed\u08eb\3\2\2\2\u08ee\u08ef\7_\2\2\u08ef\u08f0\7\r"+
		"\2\2\u08f0\u0903\3\2\2\2\u08f1\u08f2\7\64\2\2\u08f2\u08f3\7_\2\2\u08f3"+
		"\u0903\7\r\2\2\u08f4\u0903\7/\2\2\u08f5\u08f6\58\35\2\u08f6\u08f7\7_\2"+
		"\2\u08f7\u08f8\7/\2\2\u08f8\u0903\3\2\2\2\u08f9\u08fa\7W\2\2\u08fa\u08fb"+
		"\5\u01d6\u00ec\2\u08fb\u08fc\7X\2\2\u08fc\u0903\3\2\2\2\u08fd\u0903\5"+
		"\u01b0\u00d9\2\u08fe\u0903\5\u01b8\u00dd\2\u08ff\u0903\5\u01be\u00e0\2"+
		"\u0900\u0903\5\u01c4\u00e3\2\u0901\u0903\5\u01cc\u00e7\2\u0902\u08da\3"+
		"\2\2\2\u0902\u08db\3\2\2\2\u0902\u08e6\3\2\2\2\u0902\u08f1\3\2\2\2\u0902"+
		"\u08f4\3\2\2\2\u0902\u08f5\3\2\2\2\u0902\u08f9\3\2\2\2\u0902\u08fd\3\2"+
		"\2\2\u0902\u08fe\3\2\2\2\u0902\u08ff\3\2\2\2\u0902\u0900\3\2\2\2\u0902"+
		"\u0901\3\2\2\2\u0903\u01a7\3\2\2\2\u0904\u0905\3\2\2\2\u0905\u01a9\3\2"+
		"\2\2\u0906\u092e\5\2\2\2\u0907\u090c\58\35\2\u0908\u0909\7[\2\2\u0909"+
		"\u090b\7\\\2\2\u090a\u0908\3\2\2\2\u090b\u090e\3\2\2\2\u090c\u090a\3\2"+
		"\2\2\u090c\u090d\3\2\2\2\u090d\u090f\3\2\2\2\u090e\u090c\3\2\2\2\u090f"+
		"\u0910\7_\2\2\u0910\u0911\7\r\2\2\u0911\u092e\3\2\2\2\u0912\u0917\5x="+
		"\2\u0913\u0914\7[\2\2\u0914\u0916\7\\\2\2\u0915\u0913\3\2\2\2\u0916\u0919"+
		"\3\2\2\2\u0917\u0915\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u091a\3\2\2\2\u0919"+
		"\u0917\3\2\2\2\u091a\u091b\7_\2\2\u091b\u091c\7\r\2\2\u091c\u092e\3\2"+
		"\2\2\u091d\u091e\7\64\2\2\u091e\u091f\7_\2\2\u091f\u092e\7\r\2\2\u0920"+
		"\u092e\7/\2\2\u0921\u0922\58\35\2\u0922\u0923\7_\2\2\u0923\u0924\7/\2"+
		"\2\u0924\u092e\3\2\2\2\u0925\u0926\7W\2\2\u0926\u0927\5\u01d6\u00ec\2"+
		"\u0927\u0928\7X\2\2\u0928\u092e\3\2\2\2\u0929\u092e\5\u01b0\u00d9\2\u092a"+
		"\u092e\5\u01b8\u00dd\2\u092b\u092e\5\u01c4\u00e3\2\u092c\u092e\5\u01cc"+
		"\u00e7\2\u092d\u0906\3\2\2\2\u092d\u0907\3";
	private static final String _serializedATNSegment1 =
		"\2\2\2\u092d\u0912\3\2\2\2\u092d\u091d\3\2\2\2\u092d\u0920\3\2\2\2\u092d"+
		"\u0921\3\2\2\2\u092d\u0925\3\2\2\2\u092d\u0929\3\2\2\2\u092d\u092a\3\2"+
		"\2\2\u092d\u092b\3\2\2\2\u092d\u092c\3\2\2\2\u092e\u01ab\3\2\2\2\u092f"+
		"\u0931\7#\2\2\u0930\u0932\5,\27\2\u0931\u0930\3\2\2\2\u0931\u0932\3\2"+
		"\2\2\u0932\u0936\3\2\2\2\u0933\u0935\5\u00e8u\2\u0934\u0933\3\2\2\2\u0935"+
		"\u0938\3\2\2\2\u0936\u0934\3\2\2\2\u0936\u0937\3\2\2\2\u0937\u0939\3\2"+
		"\2\2\u0938\u0936\3\2\2\2\u0939\u0944\7\u0084\2\2\u093a\u093e\7_\2\2\u093b"+
		"\u093d\5\u00e8u\2\u093c\u093b\3\2\2\2\u093d\u0940\3\2\2\2\u093e\u093c"+
		"\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0941\3\2\2\2\u0940\u093e\3\2\2\2\u0941"+
		"\u0943\7\u0084\2\2\u0942\u093a\3\2\2\2\u0943\u0946\3\2\2\2\u0944\u0942"+
		"\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0948\3\2\2\2\u0946\u0944\3\2\2\2\u0947"+
		"\u0949\5\u01b2\u00da\2\u0948\u0947\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094a"+
		"\3\2\2\2\u094a\u094c\7W\2\2\u094b\u094d\5\u01c6\u00e4\2\u094c\u094b\3"+
		"\2\2\2\u094c\u094d\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u0950\7X\2\2\u094f"+
		"\u0951\5d\63\2\u0950\u094f\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0983\3\2"+
		"\2\2\u0952\u0953\5<\37\2\u0953\u0954\7_\2\2\u0954\u0956\7#\2\2\u0955\u0957"+
		"\5,\27\2\u0956\u0955\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u095b\3\2\2\2\u0958"+
		"\u095a\5\u00e8u\2\u0959\u0958\3\2\2\2\u095a\u095d\3\2\2\2\u095b\u0959"+
		"\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u095e\3\2\2\2\u095d\u095b\3\2\2\2\u095e"+
		"\u0960\7\u0084\2\2\u095f\u0961\5\u01b2\u00da\2\u0960\u095f\3\2\2\2\u0960"+
		"\u0961\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0964\7W\2\2\u0963\u0965\5\u01c6"+
		"\u00e4\2\u0964\u0963\3\2\2\2\u0964\u0965\3\2\2\2\u0965\u0966\3\2\2\2\u0966"+
		"\u0968\7X\2\2\u0967\u0969\5d\63\2\u0968\u0967\3\2\2\2\u0968\u0969\3\2"+
		"\2\2\u0969\u0983\3\2\2\2\u096a\u096b\5\u0198\u00cd\2\u096b\u096c\7_\2"+
		"\2\u096c\u096e\7#\2\2\u096d\u096f\5,\27\2\u096e\u096d\3\2\2\2\u096e\u096f"+
		"\3\2\2\2\u096f\u0973\3\2\2\2\u0970\u0972\5\u00e8u\2\u0971\u0970\3\2\2"+
		"\2\u0972\u0975\3\2\2\2\u0973\u0971\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u0976"+
		"\3\2\2\2\u0975\u0973\3\2\2\2\u0976\u0978\7\u0084\2\2\u0977\u0979\5\u01b2"+
		"\u00da\2\u0978\u0977\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u097a\3\2\2\2\u097a"+
		"\u097c\7W\2\2\u097b\u097d\5\u01c6\u00e4\2\u097c\u097b\3\2\2\2\u097c\u097d"+
		"\3\2\2\2\u097d\u097e\3\2\2\2\u097e\u0980\7X\2\2\u097f\u0981\5d\63\2\u0980"+
		"\u097f\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u0983\3\2\2\2\u0982\u092f\3\2"+
		"\2\2\u0982\u0952\3\2\2\2\u0982\u096a\3\2\2\2\u0983\u01ad\3\2\2\2\u0984"+
		"\u0985\7_\2\2\u0985\u0987\7#\2\2\u0986\u0988\5,\27\2\u0987\u0986\3\2\2"+
		"\2\u0987\u0988\3\2\2\2\u0988\u098c\3\2\2\2\u0989\u098b\5\u00e8u\2\u098a"+
		"\u0989\3\2\2\2\u098b\u098e\3\2\2\2\u098c\u098a\3\2\2\2\u098c\u098d\3\2"+
		"\2\2\u098d\u098f\3\2\2\2\u098e\u098c\3\2\2\2\u098f\u0991\7\u0084\2\2\u0990"+
		"\u0992\5\u01b2\u00da\2\u0991\u0990\3\2\2\2\u0991\u0992\3\2\2\2\u0992\u0993"+
		"\3\2\2\2\u0993\u0995\7W\2\2\u0994\u0996\5\u01c6\u00e4\2\u0995\u0994\3"+
		"\2\2\2\u0995\u0996\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u0999\7X\2\2\u0998"+
		"\u099a\5d\63\2\u0999\u0998\3\2\2\2\u0999\u099a\3\2\2\2\u099a\u01af\3\2"+
		"\2\2\u099b\u099d\7#\2\2\u099c\u099e\5,\27\2\u099d\u099c\3\2\2\2\u099d"+
		"\u099e\3\2\2\2\u099e\u09a2\3\2\2\2\u099f\u09a1\5\u00e8u\2\u09a0\u099f"+
		"\3\2\2\2\u09a1\u09a4\3\2\2\2\u09a2\u09a0\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3"+
		"\u09a5\3\2\2\2\u09a4\u09a2\3\2\2\2\u09a5\u09b0\7\u0084\2\2\u09a6\u09aa"+
		"\7_\2\2\u09a7\u09a9\5\u00e8u\2\u09a8\u09a7\3\2\2\2\u09a9\u09ac\3\2\2\2"+
		"\u09aa\u09a8\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09ad\3\2\2\2\u09ac\u09aa"+
		"\3\2\2\2\u09ad\u09af\7\u0084\2\2\u09ae\u09a6\3\2\2\2\u09af\u09b2\3\2\2"+
		"\2\u09b0\u09ae\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b4\3\2\2\2\u09b2\u09b0"+
		"\3\2\2\2\u09b3\u09b5\5\u01b2\u00da\2\u09b4\u09b3\3\2\2\2\u09b4\u09b5\3"+
		"\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b8\7W\2\2\u09b7\u09b9\5\u01c6\u00e4"+
		"\2\u09b8\u09b7\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba\u09bc"+
		"\7X\2\2\u09bb\u09bd\5d\63\2\u09bc\u09bb\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd"+
		"\u09d7\3\2\2\2\u09be\u09bf\5<\37\2\u09bf\u09c0\7_\2\2\u09c0\u09c2\7#\2"+
		"\2\u09c1\u09c3\5,\27\2\u09c2\u09c1\3\2\2\2\u09c2\u09c3\3\2\2\2\u09c3\u09c7"+
		"\3\2\2\2\u09c4\u09c6\5\u00e8u\2\u09c5\u09c4\3\2\2\2\u09c6\u09c9\3\2\2"+
		"\2\u09c7\u09c5\3\2\2\2\u09c7\u09c8\3\2\2\2\u09c8\u09ca\3\2\2\2\u09c9\u09c7"+
		"\3\2\2\2\u09ca\u09cc\7\u0084\2\2\u09cb\u09cd\5\u01b2\u00da\2\u09cc\u09cb"+
		"\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd\u09ce\3\2\2\2\u09ce\u09d0\7W\2\2\u09cf"+
		"\u09d1\5\u01c6\u00e4\2\u09d0\u09cf\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d2"+
		"\3\2\2\2\u09d2\u09d4\7X\2\2\u09d3\u09d5\5d\63\2\u09d4\u09d3\3\2\2\2\u09d4"+
		"\u09d5\3\2\2\2\u09d5\u09d7\3\2\2\2\u09d6\u099b\3\2\2\2\u09d6\u09be\3\2"+
		"\2\2\u09d7\u01b1\3\2\2\2\u09d8\u09dc\5,\27\2\u09d9\u09da\7b\2\2\u09da"+
		"\u09dc\7a\2\2\u09db\u09d8\3\2\2\2\u09db\u09d9\3\2\2\2\u09dc\u01b3\3\2"+
		"\2\2\u09dd\u09de\5\u0198\u00cd\2\u09de\u09df\7_\2\2\u09df\u09e0\7\u0084"+
		"\2\2\u09e0\u09eb\3\2\2\2\u09e1\u09e2\7,\2\2\u09e2\u09e3\7_\2\2\u09e3\u09eb"+
		"\7\u0084\2\2\u09e4\u09e5\58\35\2\u09e5\u09e6\7_\2\2\u09e6\u09e7\7,\2\2"+
		"\u09e7\u09e8\7_\2\2\u09e8\u09e9\7\u0084\2\2\u09e9\u09eb\3\2\2\2\u09ea"+
		"\u09dd\3\2\2\2\u09ea\u09e1\3\2\2\2\u09ea\u09e4\3\2\2\2\u09eb\u01b5\3\2"+
		"\2\2\u09ec\u09ed\7_\2\2\u09ed\u09ee\7\u0084\2\2\u09ee\u01b7\3\2\2\2\u09ef"+
		"\u09f0\7,\2\2\u09f0\u09f1\7_\2\2\u09f1\u09f9\7\u0084\2\2\u09f2\u09f3\5"+
		"8\35\2\u09f3\u09f4\7_\2\2\u09f4\u09f5\7,\2\2\u09f5\u09f6\7_\2\2\u09f6"+
		"\u09f7\7\u0084\2\2\u09f7\u09f9\3\2\2\2\u09f8\u09ef\3\2\2\2\u09f8\u09f2"+
		"\3\2\2\2\u09f9\u01b9\3\2\2\2\u09fa\u09fb\5<\37\2\u09fb\u09fc\7[\2\2\u09fc"+
		"\u09fd\5\u01d6\u00ec\2\u09fd\u09fe\7\\\2\2\u09fe\u0a05\3\2\2\2\u09ff\u0a00"+
		"\5\u019e\u00d0\2\u0a00\u0a01\7[\2\2\u0a01\u0a02\5\u01d6\u00ec\2\u0a02"+
		"\u0a03\7\\\2\2\u0a03\u0a05\3\2\2\2\u0a04\u09fa\3\2\2\2\u0a04\u09ff\3\2"+
		"\2\2\u0a05\u0a0d\3\2\2\2\u0a06\u0a07\5\u019c\u00cf\2\u0a07\u0a08\7[\2"+
		"\2\u0a08\u0a09\5\u01d6\u00ec\2\u0a09\u0a0a\7\\\2\2\u0a0a\u0a0c\3\2\2\2"+
		"\u0a0b\u0a06\3\2\2\2\u0a0c\u0a0f\3\2\2\2\u0a0d\u0a0b\3\2\2\2\u0a0d\u0a0e"+
		"\3\2\2\2\u0a0e\u01bb\3\2\2\2\u0a0f\u0a0d\3\2\2\2\u0a10\u0a11\5\u01a4\u00d3"+
		"\2\u0a11\u0a12\7[\2\2\u0a12\u0a13\5\u01d6\u00ec\2\u0a13\u0a14\7\\\2\2"+
		"\u0a14\u0a1c\3\2\2\2\u0a15\u0a16\5\u01a2\u00d2\2\u0a16\u0a17\7[\2\2\u0a17"+
		"\u0a18\5\u01d6\u00ec\2\u0a18\u0a19\7\\\2\2\u0a19\u0a1b\3\2\2\2\u0a1a\u0a15"+
		"\3\2\2\2\u0a1b\u0a1e\3\2\2\2\u0a1c\u0a1a\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d"+
		"\u01bd\3\2\2\2\u0a1e\u0a1c\3\2\2\2\u0a1f\u0a20\5<\37\2\u0a20\u0a21\7["+
		"\2\2\u0a21\u0a22\5\u01d6\u00ec\2\u0a22\u0a23\7\\\2\2\u0a23\u0a2a\3\2\2"+
		"\2\u0a24\u0a25\5\u01aa\u00d6\2\u0a25\u0a26\7[\2\2\u0a26\u0a27\5\u01d6"+
		"\u00ec\2\u0a27\u0a28\7\\\2\2\u0a28\u0a2a\3\2\2\2\u0a29\u0a1f\3\2\2\2\u0a29"+
		"\u0a24\3\2\2\2\u0a2a\u0a32\3\2\2\2\u0a2b\u0a2c\5\u01a8\u00d5\2\u0a2c\u0a2d"+
		"\7[\2\2\u0a2d\u0a2e\5\u01d6\u00ec\2\u0a2e\u0a2f\7\\\2\2\u0a2f\u0a31\3"+
		"\2\2\2\u0a30\u0a2b\3\2\2\2\u0a31\u0a34\3\2\2\2\u0a32\u0a30\3\2\2\2\u0a32"+
		"\u0a33\3\2\2\2\u0a33\u01bf\3\2\2\2\u0a34\u0a32\3\2\2\2\u0a35\u0a36\5>"+
		" \2\u0a36\u0a38\7W\2\2\u0a37\u0a39\5\u01c6\u00e4\2\u0a38\u0a37\3\2\2\2"+
		"\u0a38\u0a39\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a3b\7X\2\2\u0a3b\u0a7a"+
		"\3\2\2\2\u0a3c\u0a3d\58\35\2\u0a3d\u0a3f\7_\2\2\u0a3e\u0a40\5,\27\2\u0a3f"+
		"\u0a3e\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u0a41\3\2\2\2\u0a41\u0a42\7\u0084"+
		"\2\2\u0a42\u0a44\7W\2\2\u0a43\u0a45\5\u01c6\u00e4\2\u0a44\u0a43\3\2\2"+
		"\2\u0a44\u0a45\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46\u0a47\7X\2\2\u0a47\u0a7a"+
		"\3\2\2\2\u0a48\u0a49\5<\37\2\u0a49\u0a4b\7_\2\2\u0a4a\u0a4c\5,\27\2\u0a4b"+
		"\u0a4a\3\2\2\2\u0a4b\u0a4c\3\2\2\2\u0a4c\u0a4d\3\2\2\2\u0a4d\u0a4e\7\u0084"+
		"\2\2\u0a4e\u0a50\7W\2\2\u0a4f\u0a51\5\u01c6\u00e4\2\u0a50\u0a4f\3\2\2"+
		"\2\u0a50\u0a51\3\2\2\2\u0a51\u0a52\3\2\2\2\u0a52\u0a53\7X\2\2\u0a53\u0a7a"+
		"\3\2\2\2\u0a54\u0a55\5\u0198\u00cd\2\u0a55\u0a57\7_\2\2\u0a56\u0a58\5"+
		",\27\2\u0a57\u0a56\3\2\2\2\u0a57\u0a58\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59"+
		"\u0a5a\7\u0084\2\2\u0a5a\u0a5c\7W\2\2\u0a5b\u0a5d\5\u01c6\u00e4\2\u0a5c"+
		"\u0a5b\3\2\2\2\u0a5c\u0a5d\3\2\2\2\u0a5d\u0a5e\3\2\2\2\u0a5e\u0a5f\7X"+
		"\2\2\u0a5f\u0a7a\3\2\2\2\u0a60\u0a61\7,\2\2\u0a61\u0a63\7_\2\2\u0a62\u0a64"+
		"\5,\27\2\u0a63\u0a62\3\2\2\2\u0a63\u0a64\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65"+
		"\u0a66\7\u0084\2\2\u0a66\u0a68\7W\2\2\u0a67\u0a69\5\u01c6\u00e4\2\u0a68"+
		"\u0a67\3\2\2\2\u0a68\u0a69\3\2\2\2\u0a69\u0a6a\3\2\2\2\u0a6a\u0a7a\7X"+
		"\2\2\u0a6b\u0a6c\58\35\2\u0a6c\u0a6d\7_\2\2\u0a6d\u0a6e\7,\2\2\u0a6e\u0a70"+
		"\7_\2\2\u0a6f\u0a71\5,\27\2\u0a70\u0a6f\3\2\2\2\u0a70\u0a71\3\2\2\2\u0a71"+
		"\u0a72\3\2\2\2\u0a72\u0a73\7\u0084\2\2\u0a73\u0a75\7W\2\2\u0a74\u0a76"+
		"\5\u01c6\u00e4\2\u0a75\u0a74\3\2\2\2\u0a75\u0a76\3\2\2\2\u0a76\u0a77\3"+
		"\2\2\2\u0a77\u0a78\7X\2\2\u0a78\u0a7a\3\2\2\2\u0a79\u0a35\3\2\2\2\u0a79"+
		"\u0a3c\3\2\2\2\u0a79\u0a48\3\2\2\2\u0a79\u0a54\3\2\2\2\u0a79\u0a60\3\2"+
		"\2\2\u0a79\u0a6b\3\2\2\2\u0a7a\u01c1\3\2\2\2\u0a7b\u0a7d\7_\2\2\u0a7c"+
		"\u0a7e\5,\27\2\u0a7d\u0a7c\3\2\2\2\u0a7d\u0a7e\3\2\2\2\u0a7e\u0a7f\3\2"+
		"\2\2\u0a7f\u0a80\7\u0084\2\2\u0a80\u0a82\7W\2\2\u0a81\u0a83\5\u01c6\u00e4"+
		"\2\u0a82\u0a81\3\2\2\2\u0a82\u0a83\3\2\2\2\u0a83\u0a84\3\2\2\2\u0a84\u0a85"+
		"\7X\2\2\u0a85\u01c3\3\2\2\2\u0a86\u0a87\5> \2\u0a87\u0a89\7W\2\2\u0a88"+
		"\u0a8a\5\u01c6\u00e4\2\u0a89\u0a88\3\2\2\2\u0a89\u0a8a\3\2\2\2\u0a8a\u0a8b"+
		"\3\2\2\2\u0a8b\u0a8c\7X\2\2\u0a8c\u0abf\3\2\2\2\u0a8d\u0a8e\58\35\2\u0a8e"+
		"\u0a90\7_\2\2\u0a8f\u0a91\5,\27\2\u0a90\u0a8f\3\2\2\2\u0a90\u0a91\3\2"+
		"\2\2\u0a91\u0a92\3\2\2\2\u0a92\u0a93\7\u0084\2\2\u0a93\u0a95\7W\2\2\u0a94"+
		"\u0a96\5\u01c6\u00e4\2\u0a95\u0a94\3\2\2\2\u0a95\u0a96\3\2\2\2\u0a96\u0a97"+
		"\3\2\2\2\u0a97\u0a98\7X\2\2\u0a98\u0abf\3\2\2\2\u0a99\u0a9a\5<\37\2\u0a9a"+
		"\u0a9c\7_\2\2\u0a9b\u0a9d\5,\27\2\u0a9c\u0a9b\3\2\2\2\u0a9c\u0a9d\3\2"+
		"\2\2\u0a9d\u0a9e\3\2\2\2\u0a9e\u0a9f\7\u0084\2\2\u0a9f\u0aa1\7W\2\2\u0aa0"+
		"\u0aa2\5\u01c6\u00e4\2\u0aa1\u0aa0\3\2\2\2\u0aa1\u0aa2\3\2\2\2\u0aa2\u0aa3"+
		"\3\2\2\2\u0aa3\u0aa4\7X\2\2\u0aa4\u0abf\3\2\2\2\u0aa5\u0aa6\7,\2\2\u0aa6"+
		"\u0aa8\7_\2\2\u0aa7\u0aa9\5,\27\2\u0aa8\u0aa7\3\2\2\2\u0aa8\u0aa9\3\2"+
		"\2\2\u0aa9\u0aaa\3\2\2\2\u0aaa\u0aab\7\u0084\2\2\u0aab\u0aad\7W\2\2\u0aac"+
		"\u0aae\5\u01c6\u00e4\2\u0aad\u0aac\3\2\2\2\u0aad\u0aae\3\2\2\2\u0aae\u0aaf"+
		"\3\2\2\2\u0aaf\u0abf\7X\2\2\u0ab0\u0ab1\58\35\2\u0ab1\u0ab2\7_\2\2\u0ab2"+
		"\u0ab3\7,\2\2\u0ab3\u0ab5\7_\2\2\u0ab4\u0ab6\5,\27\2\u0ab5\u0ab4\3\2\2"+
		"\2\u0ab5\u0ab6\3\2\2\2\u0ab6\u0ab7\3\2\2\2\u0ab7\u0ab8\7\u0084\2\2\u0ab8"+
		"\u0aba\7W\2\2\u0ab9\u0abb\5\u01c6\u00e4\2\u0aba\u0ab9\3\2\2\2\u0aba\u0abb"+
		"\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc\u0abd\7X\2\2\u0abd\u0abf\3\2\2\2\u0abe"+
		"\u0a86\3\2\2\2\u0abe\u0a8d\3\2\2\2\u0abe\u0a99\3\2\2\2\u0abe\u0aa5\3\2"+
		"\2\2\u0abe\u0ab0\3\2\2\2\u0abf\u01c5\3\2\2\2\u0ac0\u0ac5\5\u01d6\u00ec"+
		"\2\u0ac1\u0ac2\7^\2\2\u0ac2\u0ac4\5\u01d6\u00ec\2\u0ac3\u0ac1\3\2\2\2"+
		"\u0ac4\u0ac7\3\2\2\2\u0ac5\u0ac3\3\2\2\2\u0ac5\u0ac6\3\2\2\2\u0ac6\u01c7"+
		"\3\2\2\2\u0ac7\u0ac5\3\2\2\2\u0ac8\u0ac9\5<\37\2\u0ac9\u0acb\7x\2\2\u0aca"+
		"\u0acc\5,\27\2\u0acb\u0aca\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc\u0acd\3\2"+
		"\2\2\u0acd\u0ace\7\u0084\2\2\u0ace\u0af8\3\2\2\2\u0acf\u0ad0\5\16\b\2"+
		"\u0ad0\u0ad2\7x\2\2\u0ad1\u0ad3\5,\27\2\u0ad2\u0ad1\3\2\2\2\u0ad2\u0ad3"+
		"\3\2\2\2\u0ad3\u0ad4\3\2\2\2\u0ad4\u0ad5\7\u0084\2\2\u0ad5\u0af8\3\2\2"+
		"\2\u0ad6\u0ad7\5\u0198\u00cd\2\u0ad7\u0ad9\7x\2\2\u0ad8\u0ada\5,\27\2"+
		"\u0ad9\u0ad8\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u0adc"+
		"\7\u0084\2\2\u0adc\u0af8\3\2\2\2\u0add\u0ade\7,\2\2\u0ade\u0ae0\7x\2\2"+
		"\u0adf\u0ae1\5,\27\2\u0ae0\u0adf\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1\u0ae2"+
		"\3\2\2\2\u0ae2\u0af8\7\u0084\2\2\u0ae3\u0ae4\58\35\2\u0ae4\u0ae5\7_\2"+
		"\2\u0ae5\u0ae6\7,\2\2\u0ae6\u0ae8\7x\2\2\u0ae7\u0ae9\5,\27\2\u0ae8\u0ae7"+
		"\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea\u0aeb\7\u0084\2"+
		"\2\u0aeb\u0af8\3\2\2\2\u0aec\u0aed\5\22\n\2\u0aed\u0aef\7x\2\2\u0aee\u0af0"+
		"\5,\27\2\u0aef\u0aee\3\2\2\2\u0aef\u0af0\3\2\2\2\u0af0\u0af1\3\2\2\2\u0af1"+
		"\u0af2\7#\2\2\u0af2\u0af8\3\2\2\2\u0af3\u0af4\5 \21\2\u0af4\u0af5\7x\2"+
		"\2\u0af5\u0af6\7#\2\2\u0af6\u0af8\3\2\2\2\u0af7\u0ac8\3\2\2\2\u0af7\u0acf"+
		"\3\2\2\2\u0af7\u0ad6\3\2\2\2\u0af7\u0add\3\2\2\2\u0af7\u0ae3\3\2\2\2\u0af7"+
		"\u0aec\3\2\2\2\u0af7\u0af3\3\2\2\2\u0af8\u01c9\3\2\2\2\u0af9\u0afb\7x"+
		"\2\2\u0afa\u0afc\5,\27\2\u0afb\u0afa\3\2\2\2\u0afb\u0afc\3\2\2\2\u0afc"+
		"\u0afd\3\2\2\2\u0afd\u0afe\7\u0084\2\2\u0afe\u01cb\3\2\2\2\u0aff\u0b00"+
		"\5<\37\2\u0b00\u0b02\7x\2\2\u0b01\u0b03\5,\27\2\u0b02\u0b01\3\2\2\2\u0b02"+
		"\u0b03\3\2\2\2\u0b03\u0b04\3\2\2\2\u0b04\u0b05\7\u0084\2\2\u0b05\u0b28"+
		"\3\2\2\2\u0b06\u0b07\5\16\b\2\u0b07\u0b09\7x\2\2\u0b08\u0b0a\5,\27\2\u0b09"+
		"\u0b08\3\2\2\2\u0b09\u0b0a\3\2\2\2\u0b0a\u0b0b\3\2\2\2\u0b0b\u0b0c\7\u0084"+
		"\2\2\u0b0c\u0b28\3\2\2\2\u0b0d\u0b0e\7,\2\2\u0b0e\u0b10\7x\2\2\u0b0f\u0b11"+
		"\5,\27\2\u0b10\u0b0f\3\2\2\2\u0b10\u0b11\3\2\2\2\u0b11\u0b12\3\2\2\2\u0b12"+
		"\u0b28\7\u0084\2\2\u0b13\u0b14\58\35\2\u0b14\u0b15\7_\2\2\u0b15\u0b16"+
		"\7,\2\2\u0b16\u0b18\7x\2\2\u0b17\u0b19\5,\27\2\u0b18\u0b17\3\2\2\2\u0b18"+
		"\u0b19\3\2\2\2\u0b19\u0b1a\3\2\2\2\u0b1a\u0b1b\7\u0084\2\2\u0b1b\u0b28"+
		"\3\2\2\2\u0b1c\u0b1d\5\22\n\2\u0b1d\u0b1f\7x\2\2\u0b1e\u0b20\5,\27\2\u0b1f"+
		"\u0b1e\3\2\2\2\u0b1f\u0b20\3\2\2\2\u0b20\u0b21\3\2\2\2\u0b21\u0b22\7#"+
		"\2\2\u0b22\u0b28\3\2\2\2\u0b23\u0b24\5 \21\2\u0b24\u0b25\7x\2\2\u0b25"+
		"\u0b26\7#\2\2\u0b26\u0b28\3\2\2\2\u0b27\u0aff\3\2\2\2\u0b27\u0b06\3\2"+
		"\2\2\u0b27\u0b0d\3\2\2\2\u0b27\u0b13\3\2\2\2\u0b27\u0b1c\3\2\2\2\u0b27"+
		"\u0b23\3\2\2\2\u0b28\u01cd\3\2\2\2\u0b29\u0b2a\7#\2\2\u0b2a\u0b2b\5\6"+
		"\4\2\u0b2b\u0b2d\5\u01d0\u00e9\2\u0b2c\u0b2e\5\"\22\2\u0b2d\u0b2c\3\2"+
		"\2\2\u0b2d\u0b2e\3\2\2\2\u0b2e\u0b40\3\2\2\2\u0b2f\u0b30\7#\2\2\u0b30"+
		"\u0b31\5\20\t\2\u0b31\u0b33\5\u01d0\u00e9\2\u0b32\u0b34\5\"\22\2\u0b33"+
		"\u0b32\3\2\2\2\u0b33\u0b34\3\2\2\2\u0b34\u0b40\3\2\2\2\u0b35\u0b36\7#"+
		"\2\2\u0b36\u0b37\5\6\4\2\u0b37\u0b38\5\"\22\2\u0b38\u0b39\5\u00fa~\2\u0b39"+
		"\u0b40\3\2\2\2\u0b3a\u0b3b\7#\2\2\u0b3b\u0b3c\5\20\t\2\u0b3c\u0b3d\5\""+
		"\22\2\u0b3d\u0b3e\5\u00fa~\2\u0b3e\u0b40\3\2\2\2\u0b3f\u0b29\3\2\2\2\u0b3f"+
		"\u0b2f\3\2\2\2\u0b3f\u0b35\3\2\2\2\u0b3f\u0b3a\3\2\2\2\u0b40\u01cf\3\2"+
		"\2\2\u0b41\u0b45\5\u01d2\u00ea\2\u0b42\u0b44\5\u01d2\u00ea\2\u0b43\u0b42"+
		"\3\2\2\2\u0b44\u0b47\3\2\2\2\u0b45\u0b43\3\2\2\2\u0b45\u0b46\3\2\2\2\u0b46"+
		"\u01d1\3\2\2\2\u0b47\u0b45\3\2\2\2\u0b48\u0b4a\5\u00e8u\2\u0b49\u0b48"+
		"\3\2\2\2\u0b4a\u0b4d\3\2\2\2\u0b4b\u0b49\3\2\2\2\u0b4b\u0b4c\3\2\2\2\u0b4c"+
		"\u0b4e\3\2\2\2\u0b4d\u0b4b\3\2\2\2\u0b4e\u0b4f\7[\2\2\u0b4f\u0b50\5\u01d6"+
		"\u00ec\2\u0b50\u0b51\7\\\2\2\u0b51\u01d3\3\2\2\2\u0b52\u0b53\5\u01d6\u00ec"+
		"\2\u0b53\u01d5\3\2\2\2\u0b54\u0b57\5\u01d8\u00ed\2\u0b55\u0b57\5\u01e0"+
		"\u00f1\2\u0b56\u0b54\3\2\2\2\u0b56\u0b55\3\2\2\2\u0b57\u01d7\3\2\2\2\u0b58"+
		"\u0b59\5\u01da\u00ee\2\u0b59\u0b5a\7w\2\2\u0b5a\u0b5b\5\u01de\u00f0\2"+
		"\u0b5b\u01d9\3\2\2\2\u0b5c\u0b67\7\u0084\2\2\u0b5d\u0b5f\7W\2\2\u0b5e"+
		"\u0b60\5\u0098M\2\u0b5f\u0b5e\3\2\2\2\u0b5f\u0b60\3\2\2\2\u0b60\u0b61"+
		"\3\2\2\2\u0b61\u0b67\7X\2\2\u0b62\u0b63\7W\2\2\u0b63\u0b64\5\u01dc\u00ef"+
		"\2\u0b64\u0b65\7X\2\2\u0b65\u0b67\3\2\2\2\u0b66\u0b5c\3\2\2\2\u0b66\u0b5d"+
		"\3\2\2\2\u0b66\u0b62\3\2\2\2\u0b67\u01db\3\2\2\2\u0b68\u0b6d\7\u0084\2"+
		"\2\u0b69\u0b6a\7^\2\2\u0b6a\u0b6c\7\u0084\2\2\u0b6b\u0b69\3\2\2\2\u0b6c"+
		"\u0b6f\3\2\2\2\u0b6d\u0b6b\3\2\2\2\u0b6d\u0b6e\3\2\2\2\u0b6e\u01dd\3\2"+
		"\2\2\u0b6f\u0b6d\3\2\2\2\u0b70\u0b73\5\u01d6\u00ec\2\u0b71\u0b73\5\u00fe"+
		"\u0080\2\u0b72\u0b70\3\2\2\2\u0b72\u0b71\3\2\2\2\u0b73\u01df\3\2\2\2\u0b74"+
		"\u0b77\5\u01e8\u00f5\2\u0b75\u0b77\5\u01e2\u00f2\2\u0b76\u0b74\3\2\2\2"+
		"\u0b76\u0b75\3\2\2\2\u0b77\u01e1\3\2\2\2\u0b78\u0b79\5\u01e4\u00f3\2\u0b79"+
		"\u0b7a\5\u01e6\u00f4\2\u0b7a\u0b7b\5\u01d6\u00ec\2\u0b7b\u01e3\3\2\2\2"+
		"\u0b7c\u0b80\5<\37\2\u0b7d\u0b80\5\u01b4\u00db\2\u0b7e\u0b80\5\u01ba\u00de"+
		"\2\u0b7f\u0b7c\3\2\2\2\u0b7f\u0b7d\3\2\2\2\u0b7f\u0b7e\3\2\2\2\u0b80\u01e5"+
		"\3\2\2\2\u0b81\u0b82\t\7\2\2\u0b82\u01e7\3\2\2\2\u0b83\u0b8b\5\u01ea\u00f6"+
		"\2\u0b84\u0b85\5\u01ea\u00f6\2\u0b85\u0b86\7e\2\2\u0b86\u0b87\5\u01d6"+
		"\u00ec\2\u0b87\u0b88\7f\2\2\u0b88\u0b89\5\u01e8\u00f5\2\u0b89\u0b8b\3"+
		"\2\2\2\u0b8a\u0b83\3\2\2\2\u0b8a\u0b84\3\2\2\2\u0b8b\u01e9\3\2\2\2\u0b8c"+
		"\u0b8d\b\u00f6\1\2\u0b8d\u0b8e\5\u01ec\u00f7\2\u0b8e\u0b94\3\2\2\2\u0b8f"+
		"\u0b90\f\3\2\2\u0b90\u0b91\7l\2\2\u0b91\u0b93\5\u01ec\u00f7\2\u0b92\u0b8f"+
		"\3\2\2\2\u0b93\u0b96\3\2\2\2\u0b94\u0b92\3\2\2\2\u0b94\u0b95\3\2\2\2\u0b95"+
		"\u01eb\3\2\2\2\u0b96\u0b94\3\2\2\2\u0b97\u0b98\b\u00f7\1\2\u0b98\u0b99"+
		"\5\u01ee\u00f8\2\u0b99\u0b9f\3\2\2\2\u0b9a\u0b9b\f\3\2\2\u0b9b\u0b9c\7"+
		"k\2\2\u0b9c\u0b9e\5\u01ee\u00f8\2\u0b9d\u0b9a\3\2\2\2\u0b9e\u0ba1\3\2"+
		"\2\2\u0b9f\u0b9d\3\2\2\2\u0b9f\u0ba0\3\2\2\2\u0ba0\u01ed\3\2\2\2\u0ba1"+
		"\u0b9f\3\2\2\2\u0ba2\u0ba3\b\u00f8\1\2\u0ba3\u0ba4\5\u01f0\u00f9\2\u0ba4"+
		"\u0baa\3\2\2\2\u0ba5\u0ba6\f\3\2\2\u0ba6\u0ba7\7t\2\2\u0ba7\u0ba9\5\u01f0"+
		"\u00f9\2\u0ba8\u0ba5\3\2\2\2\u0ba9\u0bac\3\2\2\2\u0baa\u0ba8\3\2\2\2\u0baa"+
		"\u0bab\3\2\2\2\u0bab\u01ef\3\2\2\2\u0bac\u0baa\3\2\2\2\u0bad\u0bae\b\u00f9"+
		"\1\2\u0bae\u0baf\5\u01f2\u00fa\2\u0baf\u0bb5\3\2\2\2\u0bb0\u0bb1\f\3\2"+
		"\2\u0bb1\u0bb2\7u\2\2\u0bb2\u0bb4\5\u01f2\u00fa\2\u0bb3\u0bb0\3\2\2\2"+
		"\u0bb4\u0bb7\3\2\2\2\u0bb5\u0bb3\3\2\2\2\u0bb5\u0bb6\3\2\2\2\u0bb6\u01f1"+
		"\3\2\2\2\u0bb7\u0bb5\3\2\2\2\u0bb8\u0bb9\b\u00fa\1\2\u0bb9\u0bba\5\u01f4"+
		"\u00fb\2\u0bba\u0bc0\3\2\2\2\u0bbb\u0bbc\f\3\2\2\u0bbc\u0bbd\7s\2\2\u0bbd"+
		"\u0bbf\5\u01f4\u00fb\2\u0bbe\u0bbb\3\2\2\2\u0bbf\u0bc2\3\2\2\2\u0bc0\u0bbe"+
		"\3\2\2\2\u0bc0\u0bc1\3\2\2\2\u0bc1\u01f3\3\2\2\2\u0bc2\u0bc0\3\2\2\2\u0bc3"+
		"\u0bc4\b\u00fb\1\2\u0bc4\u0bc5\5\u01f6\u00fc\2\u0bc5\u0bce\3\2\2\2\u0bc6"+
		"\u0bc7\f\4\2\2\u0bc7\u0bc8\7g\2\2\u0bc8\u0bcd\5\u01f6\u00fc\2\u0bc9\u0bca"+
		"\f\3\2\2\u0bca\u0bcb\7j\2\2\u0bcb\u0bcd\5\u01f6\u00fc\2\u0bcc\u0bc6\3"+
		"\2\2\2\u0bcc\u0bc9\3\2\2\2\u0bcd\u0bd0\3\2\2\2\u0bce\u0bcc\3\2\2\2\u0bce"+
		"\u0bcf\3\2\2\2\u0bcf\u01f5\3\2\2\2\u0bd0\u0bce\3\2\2\2\u0bd1\u0bd2\b\u00fc"+
		"\1\2\u0bd2\u0bd3\5\u01f8\u00fd\2\u0bd3\u0be5\3\2\2\2\u0bd4\u0bd5\f\7\2"+
		"\2\u0bd5\u0bd6\7b\2\2\u0bd6\u0be4\5\u01f8\u00fd\2\u0bd7\u0bd8\f\6\2\2"+
		"\u0bd8\u0bd9\7a\2\2\u0bd9\u0be4\5\u01f8\u00fd\2\u0bda\u0bdb\f\5\2\2\u0bdb"+
		"\u0bdc\7h\2\2\u0bdc\u0be4\5\u01f8\u00fd\2\u0bdd\u0bde\f\4\2\2\u0bde\u0bdf"+
		"\7i\2\2\u0bdf\u0be4\5\u01f8\u00fd\2\u0be0\u0be1\f\3\2\2\u0be1\u0be2\7"+
		"\36\2\2\u0be2\u0be4\5\16\b\2\u0be3\u0bd4\3\2\2\2\u0be3\u0bd7\3\2\2\2\u0be3"+
		"\u0bda\3\2\2\2\u0be3\u0bdd\3\2\2\2\u0be3\u0be0\3\2\2\2\u0be4\u0be7\3\2"+
		"\2\2\u0be5\u0be3\3\2\2\2\u0be5\u0be6\3\2\2\2\u0be6\u01f7\3\2\2\2\u0be7"+
		"\u0be5\3\2\2\2\u0be8\u0be9\b\u00fd\1\2\u0be9\u0bea\5\u01fa\u00fe\2\u0bea"+
		"\u0bfa\3\2\2\2\u0beb\u0bec\f\5\2\2\u0bec\u0bed\7b\2\2\u0bed\u0bee\7b\2"+
		"\2\u0bee\u0bf9\5\u01fa\u00fe\2\u0bef\u0bf0\f\4\2\2\u0bf0\u0bf1\7a\2\2"+
		"\u0bf1\u0bf2\7a\2\2\u0bf2\u0bf9\5\u01fa\u00fe\2\u0bf3\u0bf4\f\3\2\2\u0bf4"+
		"\u0bf5\7a\2\2\u0bf5\u0bf6\7a\2\2\u0bf6\u0bf7\7a\2\2\u0bf7\u0bf9\5\u01fa"+
		"\u00fe\2\u0bf8\u0beb\3\2\2\2\u0bf8\u0bef\3\2\2\2\u0bf8\u0bf3\3\2\2\2\u0bf9"+
		"\u0bfc\3\2\2\2\u0bfa\u0bf8\3\2\2\2\u0bfa\u0bfb\3\2\2\2\u0bfb\u01f9\3\2"+
		"\2\2\u0bfc\u0bfa\3\2\2\2\u0bfd\u0bfe\b\u00fe\1\2\u0bfe\u0bff\5\u01fc\u00ff"+
		"\2\u0bff\u0c08\3\2\2\2\u0c00\u0c01\f\4\2\2\u0c01\u0c02\7o\2\2\u0c02\u0c07"+
		"\5\u01fc\u00ff\2\u0c03\u0c04\f\3\2\2\u0c04\u0c05\7p\2\2\u0c05\u0c07\5"+
		"\u01fc\u00ff\2\u0c06\u0c00\3\2\2\2\u0c06\u0c03\3\2\2\2\u0c07\u0c0a\3\2"+
		"\2\2\u0c08\u0c06\3\2\2\2\u0c08\u0c09\3\2\2\2\u0c09\u01fb\3\2\2\2\u0c0a"+
		"\u0c08\3\2\2\2\u0c0b\u0c0c\b\u00ff\1\2\u0c0c\u0c0d\5\u01fe\u0100\2\u0c0d"+
		"\u0c19\3\2\2\2\u0c0e\u0c0f\f\5\2\2\u0c0f\u0c10\7q\2\2\u0c10\u0c18\5\u01fe"+
		"\u0100\2\u0c11\u0c12\f\4\2\2\u0c12\u0c13\7r\2\2\u0c13\u0c18\5\u01fe\u0100"+
		"\2\u0c14\u0c15\f\3\2\2\u0c15\u0c16\7v\2\2\u0c16\u0c18\5\u01fe\u0100\2"+
		"\u0c17\u0c0e\3\2\2\2\u0c17\u0c11\3\2\2\2\u0c17\u0c14\3\2\2\2\u0c18\u0c1b"+
		"\3\2\2\2\u0c19\u0c17\3\2\2\2\u0c19\u0c1a\3\2\2\2\u0c1a\u01fd\3\2\2\2\u0c1b"+
		"\u0c19\3\2\2\2\u0c1c\u0c24\5\u0200\u0101\2\u0c1d\u0c24\5\u0202\u0102\2"+
		"\u0c1e\u0c1f\7o\2\2\u0c1f\u0c24\5\u01fe\u0100\2\u0c20\u0c21\7p\2\2\u0c21"+
		"\u0c24\5\u01fe\u0100\2\u0c22\u0c24\5\u0204\u0103\2\u0c23\u0c1c\3\2\2\2"+
		"\u0c23\u0c1d\3\2\2\2\u0c23\u0c1e\3\2\2\2\u0c23\u0c20\3\2\2\2\u0c23\u0c22"+
		"\3\2\2\2\u0c24\u01ff\3\2\2\2\u0c25\u0c26\7m\2\2\u0c26\u0c27\5\u01fe\u0100"+
		"\2\u0c27\u0201\3\2\2\2\u0c28\u0c29\7n\2\2\u0c29\u0c2a\5\u01fe\u0100\2"+
		"\u0c2a\u0203\3\2\2\2\u0c2b\u0c32\5\u0206\u0104\2\u0c2c\u0c2d\7d\2\2\u0c2d"+
		"\u0c32\5\u01fe\u0100\2\u0c2e\u0c2f\7c\2\2\u0c2f\u0c32\5\u01fe\u0100\2"+
		"\u0c30\u0c32\5\u0210\u0109\2\u0c31\u0c2b\3\2\2\2\u0c31\u0c2c\3\2\2\2\u0c31"+
		"\u0c2e\3\2\2\2\u0c31\u0c30\3\2\2\2\u0c32\u0205\3\2\2\2\u0c33\u0c36\5\u0198"+
		"\u00cd\2\u0c34\u0c36\5<\37\2\u0c35\u0c33\3\2\2\2\u0c35\u0c34\3\2\2\2\u0c36"+
		"\u0c3b\3\2\2\2\u0c37\u0c3a\5\u020a\u0106\2\u0c38\u0c3a\5\u020e\u0108\2"+
		"\u0c39\u0c37\3\2\2\2\u0c39\u0c38\3\2\2\2\u0c3a\u0c3d\3\2\2\2\u0c3b\u0c39"+
		"\3\2\2\2\u0c3b\u0c3c\3\2\2\2\u0c3c\u0207\3\2\2\2\u0c3d\u0c3b\3\2\2\2\u0c3e"+
		"\u0c3f\5\u0206\u0104\2\u0c3f\u0c40\7m\2\2\u0c40\u0209\3\2\2\2\u0c41\u0c42"+
		"\7m\2\2\u0c42\u020b\3\2\2\2\u0c43\u0c44\5\u0206\u0104\2\u0c44\u0c45\7"+
		"n\2\2\u0c45\u020d\3\2\2\2\u0c46\u0c47\7n\2\2\u0c47\u020f\3\2\2\2\u0c48"+
		"\u0c49\7W\2\2\u0c49\u0c4a\5\6\4\2\u0c4a\u0c4b\7X\2\2\u0c4b\u0c4c\5\u01fe"+
		"\u0100\2\u0c4c\u0c64\3\2\2\2\u0c4d\u0c4e\7W\2\2\u0c4e\u0c52\5\16\b\2\u0c4f"+
		"\u0c51\5*\26\2\u0c50\u0c4f\3\2\2\2\u0c51\u0c54\3\2\2\2\u0c52\u0c50\3\2"+
		"\2\2\u0c52\u0c53\3\2\2\2\u0c53\u0c55\3\2\2\2\u0c54\u0c52\3\2\2\2\u0c55"+
		"\u0c56\7X\2\2\u0c56\u0c57\5\u0204\u0103\2\u0c57\u0c64\3\2\2\2\u0c58\u0c59"+
		"\7W\2\2\u0c59\u0c5d\5\16\b\2\u0c5a\u0c5c\5*\26\2\u0c5b\u0c5a\3\2\2\2\u0c5c"+
		"\u0c5f\3\2\2\2\u0c5d\u0c5b\3\2\2\2\u0c5d\u0c5e\3\2\2\2\u0c5e\u0c60\3\2"+
		"\2\2\u0c5f\u0c5d\3\2\2\2\u0c60\u0c61\7X\2\2\u0c61\u0c62\5\u01d8\u00ed"+
		"\2\u0c62\u0c64\3\2\2\2\u0c63\u0c48\3\2\2\2\u0c63\u0c4d\3\2\2\2\u0c63\u0c58"+
		"\3\2\2\2\u0c64\u0211\3\2\2\2\u015b\u0216\u021b\u0222\u0226\u022a\u0233"+
		"\u0237\u023b\u023d\u0243\u0248\u024f\u0254\u0256\u025c\u0261\u0266\u026b"+
		"\u0276\u0284\u0289\u0291\u0298\u029e\u02a3\u02ae\u02b1\u02bf\u02c4\u02c9"+
		"\u02ce\u02d4\u02de\u02e6\u02f0\u02f8\u0304\u0308\u030d\u0313\u031b\u0324"+
		"\u032f\u034c\u0350\u0355\u035b\u035e\u0361\u036d\u0378\u0386\u038d\u0396"+
		"\u039d\u03a2\u03b1\u03b8\u03be\u03c2\u03c6\u03ca\u03ce\u03d3\u03d7\u03db"+
		"\u03dd\u03e2\u03e9\u03ee\u03f0\u03f6\u03fb\u03ff\u0412\u0417\u0427\u042c"+
		"\u0432\u0438\u043a\u043e\u0443\u0447\u044e\u0455\u045d\u0460\u0465\u046d"+
		"\u0472\u0479\u0480\u0485\u048b\u0497\u049c\u04a0\u04aa\u04af\u04b7\u04ba"+
		"\u04bf\u04c7\u04ca\u04cf\u04d4\u04d9\u04de\u04e5\u04ea\u04f2\u04f7\u04fc"+
		"\u0501\u0507\u050d\u0510\u0513\u051c\u0522\u0528\u052b\u052e\u0536\u053b"+
		"\u0540\u0546\u0549\u0554\u055d\u0567\u056c\u0577\u057c\u0588\u058d\u0599"+
		"\u05a3\u05a8\u05b0\u05b3\u05ba\u05c2\u05c8\u05d1\u05db\u05df\u05e2\u05eb"+
		"\u05f9\u05fc\u0605\u060a\u0612\u0618\u0620\u062c\u0633\u0642\u0658\u067a"+
		"\u0686\u068c\u0698\u06a5\u06bf\u06c3\u06c8\u06cc\u06d0\u06d8\u06dc\u06e0"+
		"\u06e7\u06f0\u06f8\u0707\u0713\u0719\u071f\u0734\u0739\u073f\u074b\u0756"+
		"\u0760\u0763\u0768\u0771\u0777\u0791\u079f\u07a1\u07b4\u07b6\u07c7\u07c9"+
		"\u07dd\u07df\u07f1\u07f3\u07fc\u080a\u081a\u081c\u0827\u0832\u0845\u084f"+
		"\u0874\u087f\u0884\u0889\u0892\u08a9\u08b3\u08c9\u08d0\u08d8\u08e0\u08eb"+
		"\u0902\u090c\u0917\u092d\u0931\u0936\u093e\u0944\u0948\u094c\u0950\u0956"+
		"\u095b\u0960\u0964\u0968\u096e\u0973\u0978\u097c\u0980\u0982\u0987\u098c"+
		"\u0991\u0995\u0999\u099d\u09a2\u09aa\u09b0\u09b4\u09b8\u09bc\u09c2\u09c7"+
		"\u09cc\u09d0\u09d4\u09d6\u09db\u09ea\u09f8\u0a04\u0a0d\u0a1c\u0a29\u0a32"+
		"\u0a38\u0a3f\u0a44\u0a4b\u0a50\u0a57\u0a5c\u0a63\u0a68\u0a70\u0a75\u0a79"+
		"\u0a7d\u0a82\u0a89\u0a90\u0a95\u0a9c\u0aa1\u0aa8\u0aad\u0ab5\u0aba\u0abe"+
		"\u0ac5\u0acb\u0ad2\u0ad9\u0ae0\u0ae8\u0aef\u0af7\u0afb\u0b02\u0b09\u0b10"+
		"\u0b18\u0b1f\u0b27\u0b2d\u0b33\u0b3f\u0b45\u0b4b\u0b56\u0b5f\u0b66\u0b6d"+
		"\u0b72\u0b76\u0b7f\u0b8a\u0b94\u0b9f\u0baa\u0bb5\u0bc0\u0bcc\u0bce\u0be3"+
		"\u0be5\u0bf8\u0bfa\u0c06\u0c08\u0c17\u0c19\u0c23\u0c31\u0c35\u0c39\u0c3b"+
		"\u0c52\u0c5d\u0c63";
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