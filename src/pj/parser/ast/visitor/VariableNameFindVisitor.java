package pj.parser.ast.visitor;

import java.util.HashSet;

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
import pj.parser.ast.omp.OmpAwaitFunctionCallDeclaration;
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
import pj.parser.ast.omp.OmpWaitDirective;
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

/**
 * @author Julio Vilmar Gesser
 */
/*
 * This Visitor is used for seek variable used in certain region,
 * This is used in to find variables in dummy GUI region
 */
public class VariableNameFindVisitor implements VoidVisitor<Object> {

	private HashSet<String> varsSet = new HashSet<String>();
	
	
    public void visit(AnnotationDeclaration n, Object arg) {
        if (n.getJavaDoc() != null) {
            n.getJavaDoc().accept(this, arg);
        }
        if (n.getAnnotations() != null) {
            for (AnnotationExpr a : n.getAnnotations()) {
                a.accept(this, arg);
            }
        }
        if (n.getMembers() != null) {
            for (BodyDeclaration member : n.getMembers()) {
                member.accept(this, arg);
            }
        }
    }

    public void visit(AnnotationMemberDeclaration n, Object arg) {
        if (n.getJavaDoc() != null) {
            n.getJavaDoc().accept(this, arg);
        }
        if (n.getAnnotations() != null) {
            for (AnnotationExpr a : n.getAnnotations()) {
                a.accept(this, arg);
            }
        }
        n.getType().accept(this, arg);
        if (n.getDefaultValue() != null) {
            n.getDefaultValue().accept(this, arg);
        }
    }

    public void visit(ArrayAccessExpr n, Object arg) {
        n.getName().accept(this, arg);
        n.getIndex().accept(this, arg);
    }

    public void visit(ArrayCreationExpr n, Object arg) {
        n.getType().accept(this, arg);
        if (n.getDimensions() != null) {
            for (Expression dim : n.getDimensions()) {
                dim.accept(this, arg);
            }
        } else {
            n.getInitializer().accept(this, arg);
        }
    }

    public void visit(ArrayInitializerExpr n, Object arg) {
        if (n.getValues() != null) {
            for (Expression expr : n.getValues()) {
                expr.accept(this, arg);
            }
        }
    }

    public void visit(AssertStmt n, Object arg) {
        n.getCheck().accept(this, arg);
        if (n.getMessage() != null) {
            n.getMessage().accept(this, arg);
        }
    }

    public void visit(AssignExpr n, Object arg) {
        n.getTarget().accept(this, arg);
        n.getValue().accept(this, arg);
    }

    public void visit(BinaryExpr n, Object arg) {
        n.getLeft().accept(this, arg);
        n.getRight().accept(this, arg);
    }

    public void visit(BlockComment n, Object arg) {
    }

    public void visit(BlockStmt n, Object arg) {
        if (n.getStmts() != null) {
            for (Statement s : n.getStmts()) {
                s.accept(this, arg);
            }
        }
    }

    public void visit(BooleanLiteralExpr n, Object arg) {
    }

    public void visit(BreakStmt n, Object arg) {
    }

    public void visit(CastExpr n, Object arg) {
        n.getType().accept(this, arg);
        n.getExpr().accept(this, arg);
    }

    public void visit(CatchClause n, Object arg) {
        n.getExcept().accept(this, arg);
        n.getCatchBlock().accept(this, arg);
    }

    public void visit(CharLiteralExpr n, Object arg) {
    }

    public void visit(ClassExpr n, Object arg) {
        n.getType().accept(this, arg);
    }

    public void visit(ClassOrInterfaceDeclaration n, Object arg) {
        if (n.getJavaDoc() != null) {
            n.getJavaDoc().accept(this, arg);
        }
        if (n.getAnnotations() != null) {
            for (AnnotationExpr a : n.getAnnotations()) {
                a.accept(this, arg);
            }
        }
        if (n.getTypeParameters() != null) {
            for (TypeParameter t : n.getTypeParameters()) {
                t.accept(this, arg);
            }
        }
        if (n.getExtends() != null) {
            for (ClassOrInterfaceType c : n.getExtends()) {
                c.accept(this, arg);
            }
        }

        if (n.getImplements() != null) {
            for (ClassOrInterfaceType c : n.getImplements()) {
                c.accept(this, arg);
            }
        }
        if (n.getMembers() != null) {
            for (BodyDeclaration member : n.getMembers()) {
                member.accept(this, arg);
            }
        }
    }

    public void visit(ClassOrInterfaceType n, Object arg) {
        if (n.getScope() != null) {
            n.getScope().accept(this, arg);
        }
        if (n.getTypeArgs() != null) {
            for (Type t : n.getTypeArgs()) {
                t.accept(this, arg);
            }
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
        }
        if (n.getTypes() != null) {
            for (TypeDeclaration typeDeclaration : n.getTypes()) {
                typeDeclaration.accept(this, arg);
            }
        }
    }

    public void visit(ConditionalExpr n, Object arg) {
        n.getCondition().accept(this, arg);
        n.getThenExpr().accept(this, arg);
        n.getElseExpr().accept(this, arg);
    }

    public void visit(ConstructorDeclaration n, Object arg) {
        if (n.getJavaDoc() != null) {
            n.getJavaDoc().accept(this, arg);
        }
        if (n.getAnnotations() != null) {
            for (AnnotationExpr a : n.getAnnotations()) {
                a.accept(this, arg);
            }
        }
        if (n.getTypeParameters() != null) {
            for (TypeParameter t : n.getTypeParameters()) {
                t.accept(this, arg);
            }
        }
        if (n.getParameters() != null) {
            for (Parameter p : n.getParameters()) {
                p.accept(this, arg);
            }
        }
        if (n.getThrows() != null) {
            for (NameExpr name : n.getThrows()) {
                name.accept(this, arg);
            }
        }
        n.getBlock().accept(this, arg);
    }

    public void visit(ContinueStmt n, Object arg) {
    }

    public void visit(DoStmt n, Object arg) {
        n.getBody().accept(this, arg);
        n.getCondition().accept(this, arg);
    }

    public void visit(DoubleLiteralExpr n, Object arg) {
    }

    public void visit(EmptyMemberDeclaration n, Object arg) {
        if (n.getJavaDoc() != null) {
            n.getJavaDoc().accept(this, arg);
        }
    }

    public void visit(EmptyStmt n, Object arg) {
    }

    public void visit(EmptyTypeDeclaration n, Object arg) {
        if (n.getJavaDoc() != null) {
            n.getJavaDoc().accept(this, arg);
        }
    }

    public void visit(EnclosedExpr n, Object arg) {
        n.getInner().accept(this, arg);
    }

    public void visit(EnumConstantDeclaration n, Object arg) {
        if (n.getJavaDoc() != null) {
            n.getJavaDoc().accept(this, arg);
        }
        if (n.getAnnotations() != null) {
            for (AnnotationExpr a : n.getAnnotations()) {
                a.accept(this, arg);
            }
        }
        if (n.getArgs() != null) {
            for (Expression e : n.getArgs()) {
                e.accept(this, arg);
            }
        }
        if (n.getClassBody() != null) {
            for (BodyDeclaration member : n.getClassBody()) {
                member.accept(this, arg);
            }
        }
    }

    public void visit(EnumDeclaration n, Object arg) {
        if (n.getJavaDoc() != null) {
            n.getJavaDoc().accept(this, arg);
        }
        if (n.getAnnotations() != null) {
            for (AnnotationExpr a : n.getAnnotations()) {
                a.accept(this, arg);
            }
        }
        if (n.getImplements() != null) {
            for (ClassOrInterfaceType c : n.getImplements()) {
                c.accept(this, arg);
            }
        }
        if (n.getEntries() != null) {
            for (EnumConstantDeclaration e : n.getEntries()) {
                e.accept(this, arg);
            }
        }
        if (n.getMembers() != null) {
            for (BodyDeclaration member : n.getMembers()) {
                member.accept(this, arg);
            }
        }
    }

    public void visit(ExplicitConstructorInvocationStmt n, Object arg) {
        if (!n.isThis()) {
            if (n.getExpr() != null) {
                n.getExpr().accept(this, arg);
            }
        }
        if (n.getTypeArgs() != null) {
            for (Type t : n.getTypeArgs()) {
                t.accept(this, arg);
            }
        }
        if (n.getArgs() != null) {
            for (Expression e : n.getArgs()) {
                e.accept(this, arg);
            }
        }
    }

    public void visit(ExpressionStmt n, Object arg) {
        n.getExpression().accept(this, arg);
    }

    public void visit(FieldAccessExpr n, Object arg) {
        n.getScope().accept(this, arg);
    }

    public void visit(FieldDeclaration n, Object arg) {
        if (n.getJavaDoc() != null) {
            n.getJavaDoc().accept(this, arg);
        }
        if (n.getAnnotations() != null) {
            for (AnnotationExpr a : n.getAnnotations()) {
                a.accept(this, arg);
            }
        }
        n.getType().accept(this, arg);
        for (VariableDeclarator var : n.getVariables()) {
            var.accept(this, arg);
        }
    }

    public void visit(ForeachStmt n, Object arg) {
        n.getVariable().accept(this, arg);
        n.getIterable().accept(this, arg);
        n.getBody().accept(this, arg);
    }

    public void visit(ForStmt n, Object arg) {
        if (n.getInit() != null) {
            for (Expression e : n.getInit()) {
                e.accept(this, arg);
            }
        }
        if (n.getCompare() != null) {
            n.getCompare().accept(this, arg);
        }
        if (n.getUpdate() != null) {
            for (Expression e : n.getUpdate()) {
                e.accept(this, arg);
            }
        }
        n.getBody().accept(this, arg);
    }

    public void visit(IfStmt n, Object arg) {
        n.getCondition().accept(this, arg);
        n.getThenStmt().accept(this, arg);
        if (n.getElseStmt() != null) {
            n.getElseStmt().accept(this, arg);
        }
    }

    public void visit(ImportDeclaration n, Object arg) {
        n.getName().accept(this, arg);
    }

    public void visit(InitializerDeclaration n, Object arg) {
        if (n.getJavaDoc() != null) {
            n.getJavaDoc().accept(this, arg);
        }
        n.getBlock().accept(this, arg);
    }

    public void visit(InstanceOfExpr n, Object arg) {
        n.getExpr().accept(this, arg);
        n.getType().accept(this, arg);
    }

    public void visit(IntegerLiteralExpr n, Object arg) {
    }

    public void visit(IntegerLiteralMinValueExpr n, Object arg) {
    }

    public void visit(JavadocComment n, Object arg) {
    }

    public void visit(LabeledStmt n, Object arg) {
        n.getStmt().accept(this, arg);
    }

    public void visit(LineComment n, Object arg) {
    }

    public void visit(LongLiteralExpr n, Object arg) {
    }

    public void visit(LongLiteralMinValueExpr n, Object arg) {
    }

    public void visit(MarkerAnnotationExpr n, Object arg) {
        n.getName().accept(this, arg);
    }

    public void visit(MemberValuePair n, Object arg) {
        n.getValue().accept(this, arg);
    }

    public void visit(MethodCallExpr n, Object arg) {
        if (n.getScope() != null) {
            n.getScope().accept(this, arg);
        }
        if (n.getTypeArgs() != null) {
            for (Type t : n.getTypeArgs()) {
                t.accept(this, arg);
            }
        }
        if (n.getArgs() != null) {
            for (Expression e : n.getArgs()) {
                e.accept(this, arg);
            }
        }
    }

    public void visit(MethodDeclaration n, Object arg) {
        if (n.getJavaDoc() != null) {
            n.getJavaDoc().accept(this, arg);
        }
        if (n.getAnnotations() != null) {
            for (AnnotationExpr a : n.getAnnotations()) {
                a.accept(this, arg);
            }
        }
        if (n.getTypeParameters() != null) {
            for (TypeParameter t : n.getTypeParameters()) {
                t.accept(this, arg);
            }
        }
        n.getType().accept(this, arg);
        if (n.getParameters() != null) {
            for (Parameter p : n.getParameters()) {
                p.accept(this, arg);
            }
        }
        if (n.getThrows() != null) {
            for (NameExpr name : n.getThrows()) {
                name.accept(this, arg);
            }
        }
        if (n.getBody() != null) {
            n.getBody().accept(this, arg);
        }
    }

    public void visit(NameExpr n, Object arg) {
    	/*
    	 * Xing: add variables' name into variable set.
    	 */
    	//System.out.println("Got one variable Name:"+n.toString());
    	this.varsSet.add(n.toString());
    }

    public void visit(NormalAnnotationExpr n, Object arg) {
        n.getName().accept(this, arg);
        if (n.getPairs() != null) {
            for (MemberValuePair m : n.getPairs()) {
                m.accept(this, arg);
            }
        }
    }

    public void visit(NullLiteralExpr n, Object arg) {
    }

    public void visit(ObjectCreationExpr n, Object arg) {
        if (n.getScope() != null) {
            n.getScope().accept(this, arg);
        }
        if (n.getTypeArgs() != null) {
            for (Type t : n.getTypeArgs()) {
                t.accept(this, arg);
            }
        }
        n.getType().accept(this, arg);
        if (n.getArgs() != null) {
            for (Expression e : n.getArgs()) {
                e.accept(this, arg);
            }
        }
        if (n.getAnonymousClassBody() != null) {
            for (BodyDeclaration member : n.getAnonymousClassBody()) {
                member.accept(this, arg);
            }
        }
    }

    public void visit(PackageDeclaration n, Object arg) {
        if (n.getAnnotations() != null) {
            for (AnnotationExpr a : n.getAnnotations()) {
                a.accept(this, arg);
            }
        }
        n.getName().accept(this, arg);
    }

    public void visit(Parameter n, Object arg) {
        if (n.getAnnotations() != null) {
            for (AnnotationExpr a : n.getAnnotations()) {
                a.accept(this, arg);
            }
        }
        n.getType().accept(this, arg);
        n.getId().accept(this, arg);
    }

    public void visit(PrimitiveType n, Object arg) {
    }

    public void visit(QualifiedNameExpr n, Object arg) {
        n.getQualifier().accept(this, arg);
    }

    public void visit(ReferenceType n, Object arg) {
        n.getType().accept(this, arg);
    }

    public void visit(ReturnStmt n, Object arg) {
        if (n.getExpr() != null) {
            n.getExpr().accept(this, arg);
        }
    }

    public void visit(SingleMemberAnnotationExpr n, Object arg) {
        n.getName().accept(this, arg);
        n.getMemberValue().accept(this, arg);
    }

    public void visit(StringLiteralExpr n, Object arg) {
    }

    public void visit(SuperExpr n, Object arg) {
        if (n.getClassExpr() != null) {
            n.getClassExpr().accept(this, arg);
        }
    }

    public void visit(SwitchEntryStmt n, Object arg) {
        if (n.getLabel() != null) {
            n.getLabel().accept(this, arg);
        }
        if (n.getStmts() != null) {
            for (Statement s : n.getStmts()) {
                s.accept(this, arg);
            }
        }
    }

    public void visit(SwitchStmt n, Object arg) {
        n.getSelector().accept(this, arg);
        if (n.getEntries() != null) {
            for (SwitchEntryStmt e : n.getEntries()) {
                e.accept(this, arg);
            }
        }
    }

    public void visit(SynchronizedStmt n, Object arg) {
        n.getExpr().accept(this, arg);
        n.getBlock().accept(this, arg);

    }

    public void visit(ThisExpr n, Object arg) {
        if (n.getClassExpr() != null) {
            n.getClassExpr().accept(this, arg);
        }
    }

    public void visit(ThrowStmt n, Object arg) {
        n.getExpr().accept(this, arg);
    }

    public void visit(TryStmt n, Object arg) {
        n.getTryBlock().accept(this, arg);
        if (n.getCatchs() != null) {
            for (CatchClause c : n.getCatchs()) {
                c.accept(this, arg);
            }
        }
        if (n.getFinallyBlock() != null) {
            n.getFinallyBlock().accept(this, arg);
        }
    }

    public void visit(TypeDeclarationStmt n, Object arg) {
        n.getTypeDeclaration().accept(this, arg);
    }

    public void visit(TypeParameter n, Object arg) {
        if (n.getTypeBound() != null) {
            for (ClassOrInterfaceType c : n.getTypeBound()) {
                c.accept(this, arg);
            }
        }
    }

    public void visit(UnaryExpr n, Object arg) {
        n.getExpr().accept(this, arg);
    }

    public void visit(VariableDeclarationExpr n, Object arg) {
        if (n.getAnnotations() != null) {
            for (AnnotationExpr a : n.getAnnotations()) {
                a.accept(this, arg);
            }
        }
        n.getType().accept(this, arg);
        for (VariableDeclarator v : n.getVars()) {
            v.accept(this, arg);
        }
    }

    public void visit(VariableDeclarator n, Object arg) {
        n.getId().accept(this, arg);
        if (n.getInit() != null) {
            n.getInit().accept(this, arg);
        }
    }

    public void visit(VariableDeclaratorId n, Object arg) {
    }

    public void visit(VoidType n, Object arg) {
    }

    public void visit(WhileStmt n, Object arg) {
        n.getCondition().accept(this, arg);
        n.getBody().accept(this, arg);
    }

    public void visit(WildcardType n, Object arg) {
        if (n.getExtends() != null) {
            n.getExtends().accept(this, arg);
        }
        if (n.getSuper() != null) {
            n.getSuper().accept(this, arg);
        }
    }

	@Override
	public void visit(OmpAtomicConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpBarrierDirective n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpCopyprivateDataClause n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpCriticalConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpDataClause n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpDefaultDataClause n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpFlushDirective n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpForConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpFreeguiConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpGuiConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpIfClause n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpLastprivateDataClause n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpMasterConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpNumthreadsClause n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpOrderedConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpParallelConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpParallelForConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpParallelSectionsConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpPrivateDataClause n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpReductionDataClause n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpReductionOperator n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpScheduleClause n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpSectionConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpSectionsConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpSharedDataClause n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpSingleConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OpenMPStatement n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpCancellationPointDirective n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpCancelDirective n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpTargetConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpWaitDirective n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpAwaitConstruct n, Object arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OmpAwaitFunctionCallDeclaration n, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
}