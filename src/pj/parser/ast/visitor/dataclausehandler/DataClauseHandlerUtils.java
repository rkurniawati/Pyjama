package pj.parser.ast.visitor.dataclausehandler;

/**
 * This class implements simple utility routines
 * for handling the data clauses
 * 
 * This class contains all static utilities and need
 * not be instantiated
 * 
 * @author vikassingh
 * 
 * @version 1.0.1
 */
public class DataClauseHandlerUtils {
	
	public static enum Operator { Plus, Mult, Minus, BitAND, BitOR, BitXOR, LogAND, LogOR };
	
	private DataClauseHandlerUtils(){
		/*
		 * this need not be instantiated.
		 * this is a preferred design method
		 * if all the util methods can be collected
		 * in a class
		 */
	}

	/*
	 * decides whether a given data type is
	 * <I>primitive</I> data type 
	 */
	public static boolean isPrimitiveType(String type) {
		return type.equals("boolean") 
				|| type.equals("int") 
				|| type.equals("double") 
				|| type.equals("long") 
				|| type.equals("char") 
				|| type.equals("byte") 
				|| type.equals("short") 
				|| type.equals("float");
	}
	
	
	/*
	 * decides whether a given data type is
	 * <I>wrapper</I> of primitive data type 
	 */
	public static boolean isWrapperType(String type) {
		return type.equals("Boolean") 
				|| type.equals("Integer") 
				|| type.equals("Double") 
				|| type.equals("Long")
				|| type.equals("Character") 
				|| type.equals("Byte") 
				|| type.equals("Short") 
				|| type.equals("Float");
	}

	/*
	 * Returns the default values, as strings
	 * Should be used by source printers for
	 * initializing the variables in generated methods
	 * 
	 * @param type
	 * @return Returns the default strings as a Java compiler would
	 */
	public static String getDefaultValuesForPrimitiveType(String type){
		String defValue = "null";
		
		if (type.equals("boolean"))
			defValue = "false";
		if (type.equals("int") )
			defValue = "0";
		if (type.equals("double") )
			defValue = "0.0d";
		if (type.equals("long") )
			defValue = "0L";
		if (type.equals("char") )
			defValue = "'\\u0000'";
		if (type.equals("byte") )
			defValue = "0";
		if (type.equals("short") )
			defValue = "0";
		if (type.equals("float") )
			defValue = "0.0f";
		
		return defValue;
	}
	
	/*
	 * Constructs the type string for reducible data type
	 * 
	 * @param required Data Type
	 * @param operator Reduction operator
	 * @return The string representing reduction operation 
	 */
	public static String getReducible(String required, Operator operator) {
		String partType = "";
		String partOperator = "";

		if (required.equals("int") || required.equals("Integer"))
			partType = "Integer";
		else if (required.equals("boolean") || required.equals("Boolean"))
			partType = "Boolean";
		else if (required.equals("double") || required.equals("Double"))
			partType = "Double";
		else if (required.equals("long") || required.equals("Long"))
			partType = "Long";
		else if (required.equals("byte") || required.equals("Byte"))
			partType = "Byte";
		else if (required.equals("short") || required.equals("Short"))
			partType = "Short";
		else if (required.equals("float") || required.equals("Float"))
			partType = "Float";

		switch (operator) {
		case Plus:
			partOperator = "SUM";
			break;
		case Mult:
			partOperator = "MULTI";
			break;
		case Minus:
			partOperator = "MINUS";
			break;
		case BitAND:
			partOperator = "BITAND";
			break;
		case BitOR:
			partOperator = "BITOR";
			break;
		case BitXOR:
			partOperator = "BITXOR";
			break;
		case LogAND:
			partOperator = "LOGAND";
			break;
		case LogOR:
			partOperator = "LOGOR";
			break;
			
		default:
			throw new RuntimeException("Undefined Operation");
		}
		return "Reduction." + partType + partOperator;
	}
	
	/*
	 * Constructs the initialization values for reduction variables 
	 * 
	 * @param varType Data Type
	 * @param operationType Reduction operator
	 * @return The string representing initialization value
	 */
	public static String getInitializationForReducible(String varType, Operator operationType) {
		String valStr = "";

		switch (operationType) {
		case Plus:
			valStr = "0";
			break;
		case Mult:
			valStr = "1";
			break;
		case Minus:
			valStr = "0";
			break;
		case BitAND:
			valStr = "~0";
			break;
		case BitOR:
			valStr = "0";
			break;
		case BitXOR:
			valStr = "0";
			break;
		case LogAND:
			if (varType.equals("boolean") || varType.equals("Boolean")){
				valStr = "true";
			}
			break;
		case LogOR:
			if (varType.equals("boolean") || varType.equals("Boolean")){
				valStr = "false";
			}
			break;

		default:
			throw new RuntimeException("Undefined Operation");
		}

		if (varType.equals("double") || varType.equals("Double"))
			valStr += ".0d";
		else if (varType.equals("long") || varType.equals("Long"))
			valStr += "L";
		else if (varType.equals("float") || varType.equals("Float"))
			valStr += ".0f";

		return valStr;
	}

	public static String autoBox(String type) {
		if (type.equals("boolean"))
			return "Boolean";
		if (type.equals("int") )
			return "Integer";
		if (type.equals("double") )
			return "Double";
		if (type.equals("long") )
			return "Long";
		if (type.equals("char") )
			return "Char";
		if (type.equals("byte") )
			return "Byte";
		if (type.equals("short") )
			return "Short";
		if (type.equals("float") )
			return "Float";
		return type;
	}
	
	public static boolean isPrimitiveReductionOperator(String operator) {
		boolean isprimitive = false;
		switch (operator) {
		case "+":
		case "-":
		case "*":
		case "&":
		case "|":
		case "^":
		case "&&":
		case "||":
			isprimitive = true;
			break;
		default:
			break;
		}
		return isprimitive;
	}
	
}
