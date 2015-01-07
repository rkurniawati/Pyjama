package pj.parser.ast.visitor.helper;

public interface Func<E, T> {
	E map(T object);
}
