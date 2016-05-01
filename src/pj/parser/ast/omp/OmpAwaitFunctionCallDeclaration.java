package pj.parser.ast.omp;

import java.util.List;

import pj.parser.ast.Node;
import pj.parser.ast.body.Parameter;
import pj.parser.ast.type.Type;
import pj.parser.ast.visitor.GenericVisitor;
import pj.parser.ast.visitor.VoidVisitor;

public class OmpAwaitFunctionCallDeclaration extends Node{
	
	private Type type;
	private String name;
	private List<Parameter> parameters;
	
	public OmpAwaitFunctionCallDeclaration(Type type, String name, List<Parameter> parameters) {
		this.type = type;
		this.name = name;
		this.parameters = parameters;
	}
	
	public OmpAwaitFunctionCallDeclaration(int beginLine, int beginColumn, int endLine, int endColumn, Type type, String name, List<Parameter> parameters) {
		super(beginLine, beginColumn, endLine, endColumn);
		this.type = type;
		this.name = name;
		this.parameters = parameters;
	}
	
	public Type getType() {
		return type;
	}
	
	public String getName() {
	    return name;
	}

	public List<Parameter> getParameters() {
	    return parameters;
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
