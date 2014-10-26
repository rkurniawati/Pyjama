package pj.parser.ast.omp;

import pj.parser.ast.expr.NameExpr;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

/**
 * This class defines the reduction operators.
 * Below is the list of operators and their init values as specified in OpenMP 2.5
 *  
 * + 0
 * * 1
 * - 0
 * & ~0
 * | 0
 * ^ 0
 * && 1
 * || 0
 * 
 * However, not all operations are valid in the object
 * oriented context, where the variable types are 
 * strongly defined. For more information, the Pyjama
 * paper should be referred.
 *
 * @author vikassingh
 * 
 */
public class OmpReductionOperator extends OpenMPStatement{
	/*
	 * we support all an object oriented approach
	 * reduction. there are operations that are not 
	 * defined in OpenMP 2.5, but they may be crucially
	 * important operations.
	 */
	public static enum Operator { Plus, Mult, Minus, BitAND, BitOR, BitXOR, LogAND, LogOR };
	
	private Operator primitiveOperator = null;
	private NameExpr userDefinedReduction = null;
	
	public OmpReductionOperator(Operator operator) {
		this.primitiveOperator = operator;
	}
	
	public OmpReductionOperator(NameExpr userDefinedReduction) {
		this.userDefinedReduction = userDefinedReduction;
	}
	
	public OmpReductionOperator(int beginLine, int beginColumn, int endLine, int endColumn, Operator operator) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.primitiveOperator = operator;
	}
	
	public OmpReductionOperator(int beginLine, int beginColumn, int endLine, int endColumn, NameExpr userDefinedReduction) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.userDefinedReduction = userDefinedReduction;
	}
	
	public NameExpr getUserDefinedReduction() {
		return userDefinedReduction;
	}
	
	public Operator getOperator() {
		return primitiveOperator;
	}
	
	public String getOperatorString() {
		if (userDefinedReduction != null)
			return userDefinedReduction.toString();
		switch (primitiveOperator) {
		case Plus:
			return "+";
		case Minus:
			return "-";
		case Mult:
			return "*";
		case BitAND:
			return "&";
		case BitOR:
			return "|";
		case BitXOR:
			return "^";
		case LogAND:
			return "&&";
		case LogOR:
			return "||";
		}
		throw new RuntimeException("Invalid reduction: " + primitiveOperator);
	}
	
	@Override
	public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	@Override
	public <A> void accept(VoidVisitor<A> v, A arg) {
		v.visit(this, arg);	
	}
}
