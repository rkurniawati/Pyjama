package pj.parser.ast.visitor.constructwrappers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Encapsulates the runtime generic wrapper for OpenMP 2.5 - like 
 * constructs and GUI-aware constructs in Pyjama
 * 
 * @author vikassingh
 * @author Xing Fan
 * 
 * @version 1.1.1
 */
public abstract class ConstructWrapper {
		
	/*
	 * @return line number where construct begins
	 */
	abstract public int getBeginLine();
	
	/*
	 * @return line number where construct ends
	 */
	abstract public int getEndLine();
	
	
	/*
	 * Keeps the variables that have been re-named
	 */
	public List<String> varsAutoSaved = new ArrayList<String>();

	/*
	 * Keeps the <code>threadprivate</code> elements
	 */
	public List<String> varsThreadPrivate = new ArrayList<String>();

	/*
	 * container for keeping the declared variables in the smallest scope 
	 */
	private List<String>  nestedDeclaredVars = new ArrayList<String>();

	/*
	 * container for all the variables that are present outside the current scope 
	 */
	private Set<String> outerVars = new HashSet<String>();

	/*
	 * container for all the variables that are used in current scope
	 */
	private List<String>  neededVar = new ArrayList<String>();

	
	public List<String> getNestedDeclaredVars() {
		return nestedDeclaredVars;
	}

	public void setNestedDeclaredVars(List<String> nestedDeclaredVars) {
		this.nestedDeclaredVars = nestedDeclaredVars;
	}

	public Set<String> getOuterVars() {
		return this.outerVars;
	}

	public void setOuterVars(Set<String> outerVars) {
		this.outerVars = outerVars;
	}

	public List<String> getNeededVar() {
		return this.neededVar;
	}

	public void setNeededVar(List<String> neededVar) {
		this.neededVar = neededVar;
	}

}
