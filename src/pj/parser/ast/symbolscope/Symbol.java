package pj.parser.ast.symbolscope;


public class Symbol {
	
	public static enum SymbolType {ClassMemberField, ClassMemberMethod, MethodParameter, ScopeLocalParameter};

	private static int nextID = 0;
	
	//the unique id of this symbol
	private int id;
	
	//the scope this symbol appears
	private ScopeInfo scope = null;
	
	//the scope which declared this symbol
	private ScopeInfo declarationScope = null;
	
	//the literal name of this symbol
	private String name = null;
	
	//the data type of this symbol, e.g. int, double, Object, List...
	private String dataType = null;
	
	//what the symbol is indicating for, a variable or a method name, etc.
	private SymbolType symbolType  = null;
	
	//indicate whether this is only be 
	private boolean readonly; 
	
	
	public Symbol(String name, ScopeInfo scope, String dataType, SymbolType symbolType) {
		this.id = nextID++;
		this.name = name;
		this.scope = scope;
		this.dataType = dataType;
		this.symbolType = symbolType;
	}
	
	public Symbol(String name) {
		this.id = nextID++;
		this.name = name;
	}
}
