package pj.misc;

import pj.parser.ast.expr.OpenMP_ReductionOperator;

public class IncompatibleType {

	private String found;
	private String required;
	private String variableUniqueID; // use a unique ID (unique for the file) rather than variable name
	private String variableName; 
	private OpenMP_ReductionOperator redOperator = null;
	 
	public IncompatibleType(String variableUniqueID, String variableName, String found, String required) {
		this.variableUniqueID = variableUniqueID;
		this.variableName = variableName;
		this.found = found;
		this.required = required;
	}

	public String getVariableUniqueID() {
		return variableUniqueID; 
	}
	
	public String getVariableName() {
		return variableName; 
	}
	
	public String getFound() {
		return found;
	}
	
	public String getRequired() {
		return required;
	}

	public void setReductionOperator(OpenMP_ReductionOperator redOperator) {
		this.redOperator = redOperator;
	}
	
	public OpenMP_ReductionOperator getReductionOperator() {
		return redOperator;
	}
}
