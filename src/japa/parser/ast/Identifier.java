package japa.parser.ast;

import japa.parser.ast.visitor.GenericVisitor;
import japa.parser.ast.visitor.VoidVisitor;

public class Identifier extends Node{

	 private String name;

	 public Identifier() {
	 }

	 public Identifier(String name) {
	     this.setName(name);
	 }

	 public Identifier(int beginLine, int beginColumn, int endLine, int endColumn, String name) {
	     super(beginLine, beginColumn, endLine, endColumn);
	     this.setName(name);
	 }
	    
	@Override
	public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
		return v.visit(this, arg);
	}

	@Override
	public <A> void accept(VoidVisitor<A> v, A arg) {
		return v.visit(this, arg);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
