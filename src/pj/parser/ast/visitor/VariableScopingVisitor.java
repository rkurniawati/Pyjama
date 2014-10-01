package pj.parser.ast.visitor;

import java.util.Iterator;

import pj.parser.ast.body.ClassOrInterfaceDeclaration;
import pj.parser.ast.body.ConstructorDeclaration;
import pj.parser.ast.body.FieldDeclaration;
import pj.parser.ast.body.MethodDeclaration;
import pj.parser.ast.body.Parameter;
import pj.parser.ast.body.VariableDeclarator;
import pj.parser.ast.body.VariableDeclaratorId;
import pj.parser.ast.expr.FieldAccessExpr;
import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.expr.VariableDeclarationExpr;
import pj.parser.ast.stmt.BlockStmt;
import pj.parser.ast.stmt.CatchClause;
import pj.parser.ast.stmt.ForStmt;
import pj.parser.ast.stmt.ForeachStmt;
import pj.parser.ast.stmt.Statement;
import pj.parser.ast.stmt.SwitchStmt;
import pj.parser.ast.symbolscope.Symbol;
import pj.parser.ast.symbolscope.SymbolTable;
import pj.parser.ast.type.ClassOrInterfaceType;
import pj.parser.ast.type.PrimitiveType;
import pj.parser.ast.type.Type;


public class VariableScopingVisitor extends VoidVisitorAdapter<Object>{
	
	SymbolTable symbolTable = new SymbolTable();

	public void visit(BlockStmt n, Object arg) {

	}
	
	public void visit(ClassOrInterfaceDeclaration n, Object arg) {

	}
	
	public void visit(MethodDeclaration n, Object arg) {
	}
	
	public void visit(ConstructorDeclaration n, Object arg) {
		
	}
	public void visit(SwitchStmt n, Object arg) {
		
	}
	public void visit(ForeachStmt n, Object arg) {
		
	}
	
	public void visit(ForStmt n, Object arg) {
		
	}
	public void visit(CatchClause n, Object arg) {
		
	}
	/////////////////////////////////////////////////////////////////////////////
	public void visit(NameExpr n, Object arg) {
		String varName = n.getName();
		Symbol symbol = new Symbol(varName);
		this.symbolTable.addSymbolUse(varName,symbol);
	}

	public void visit(FieldAccessExpr n, Object arg) {
		String fieldName = n.getField();
		Symbol symbol = new Symbol(fieldName);
		this.symbolTable.addSymbolUse(fieldName,symbol);
		n.getScope().accept(this, arg);
	}

	public void visit(Parameter n, Object arg) {
		String varName = n.getId().getName();
		Type varType = n.getType();
		Symbol symbol = new Symbol(varName,);
		this.symbolTable.addSymbolDeclaration(varName, symbol);

		varType.accept(this, arg);
		if (n.isVarArgs()) {
			mPrinter.print("...");
		}
		mPrinter.print(" ");
		VariableDeclaratorId id = n.getId();
		id.accept(this, arg);

		mSymbolTable.addVariable(id.toString(), varType);
	}
	
    public void visit(ClassOrInterfaceType n, Object arg) {
        if (n.getScope() != null) {
            n.getScope().accept(this, arg);
            printer.print(".");
        }
        printer.print(n.getName());
        printTypeArgs(n.getTypeArgs(), arg);
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
}
