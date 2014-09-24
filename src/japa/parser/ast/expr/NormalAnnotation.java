package japa.parser.ast.expr;

import java.util.List;

import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

public class NormalAnnotation extends Annotation{

	private TypeName typeName;
	private List<ElementValuePair> pairs;
	
	public NormalAnnotation(TypeName typeName, List<ElementValuePair> pairs){
		this.typeName = typeName;
		this.pairs = pairs;
    }

    public NormalAnnotation(int beginLine, int beginColumn, int endLine, int endColumn, TypeName typeName, List<ElementValuePair> pairs) {
        super(beginLine, beginColumn, endLine, endColumn);
		this.typeName = typeName;
		this.pairs = pairs;
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
