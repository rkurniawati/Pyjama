package japa.parser.ast;

import japa.parser.ast.expr.Annotation;
import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

public class PackageModifier extends Node {
	
	private Annotation annotation;
	
	public PackageModifier(Annotation annotationExpr) {
		this.annotation = annotationExpr;
	}
	
	public PackageModifier(int beginLine, int beginColumn, int endLine, int endColumn, Annotation annotationExpr) {
        super(beginLine, beginColumn, endLine, endColumn);
		this.annotation = annotationExpr;
	}
	
	public Annotation getAnnotation() {
		return annotation;
	}

	public void setAnnotation(Annotation annotation) {
		this.annotation = annotation;
	}

	@Override
	public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	@Override
	public <A> void accept(VoidVisitor<A> v, A arg) {
		return v.visit(this, arg);
	}

}
