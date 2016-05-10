/*
 * Copyright (C) 2013-2016 Parallel and Reconfigurable Computing Group, University of Auckland.
 *
 * Authors: <http://homepages.engineering.auckland.ac.nz/~parallel/ParallelIT/People.html>
 * 
 * This file is part of Pyjama, a Java implementation of OpenMP-like directive-based 
 * parallelisation compiler and its runtime routines.
 *
 * Pyjama is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Pyjama is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Pyjama. If not, see <http://www.gnu.org/licenses/>.
 */

/* 
 *  Copyright (C) 2010 Nasser Giacaman, Oliver Sinnen
 *
 *  This file is part of Parallel Task. 
 * 
 *  Parallel Task has been developed based on the Java 1.5 parser and
 *  Abstract Syntax Tree as a foundation. This file is part of the original
 *  Java 1.5 parser and Abstract Syntax Tree code, but has been extended
 *  to support features necessary for Parallel Task. Below is the original
 *  Java 1.5 parser and Abstract Syntax Tree license. 
 *
 *  Parallel Task is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or (at 
 *  your option) any later version.
 *
 *  Parallel Task is distributed in the hope that it will be useful, 
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General 
 *  Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License along 
 *  with Parallel Task. If not, see <http://www.gnu.org/licenses/>.
 */


/*
 * Copyright (C) 2007 Julio Vilmar Gesser.
 * 
 * This file is part of Java 1.5 parser and Abstract Syntax Tree.
 *
 * Java 1.5 parser and Abstract Syntax Tree is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Java 1.5 parser and Abstract Syntax Tree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java 1.5 parser and Abstract Syntax Tree.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 08/10/2006
 */
package pj.parser.ast.visitor;

/**
 * @author vikassingh Added implementation pertaining to the needs of PJPlugin
 * @author Julio Vilmar Gesser
 */

public final class SourcePrinter {

    private int level = 0;
    private int lastUserLine = -1;
    
    private boolean indented = false;

    private StringBuilder buf = new StringBuilder();
    
    /*
     * these are the special pre and post scripts
     * that enable Pyjama plugin to identify the
     * line numbers of the original code from the 
     * generated ones
     */
    private final String LINE_NUM_CODE_PRE = "#GEN#[";
    private final String LINE_NUM_CODE_POST = "]#PJ#";

    public void setIndentLevel(int level) {
    	this.level = level;
    }
    
    public int getIndentLevel() {
    	return level;
    }
    
    public void indent() {
        level++;
    }

    public void unindent() {
        level--;
    }

    private void makeIndent() {
        for (int i = 0; i < level; i++) {
        	/*
        	 * we add an indent of 4 spaces
        	 */
            buf.append("    ");
        }
    }
    
    public boolean isEmpty() {
    	return buf.length() == 0;
    }
    
    public void clear() {
    	buf = new StringBuilder();
    }

    public void print(String arg) {
        if (!indented) {
            makeIndent();
            indented = true;
        }
        buf.append(arg);
    }
      
    /*
     * might eventually make this private
     * to force a line number to be specified
     */
    //@Deprecated
    public void printLn() {
        buf.append("\n");
        indented = false;
    }
    
    /*
     * might eventually make this private
     * to force a line number to be specified
     */
    //@Deprecated
    public void printLn(String arg) {

        print(arg);
        printLn();
    }
    
    public void setLastUserLine(int lastUserLine) {
    	this.lastUserLine = lastUserLine;
    }
    
    public void printLn(int l) {
    	int line = lastUserLine;
    	
    	if (l > 0)
    		line = l;
    	
    	if (lastUserLine > l)
    		line = lastUserLine;
    	
		lastUserLine = line;
		
		/*
		 * prints like this
		 * .... //#GEN#[line_num]#PJ#
		 * 
		 * every line is appened with this 
		 * string
		 */
		buf.append("//" + LINE_NUM_CODE_PRE + lastUserLine + LINE_NUM_CODE_POST);
		printLn();
    }

    public void printLn(String arg, int line) {

    	print(arg);
    	printLn(line);
    }

    public String getSource() {
        return buf.toString();
    }

    @Override
    public String toString() {
        return getSource();
    }
    
    //Xing added this two methods, in service of OmpTargetConstruct visiting
    public int getPrinterBufferEndCursor() {
    	return this.buf.length();
    }
    
    public StringBuffer getCodeFromIndex(int index) {
    	return new StringBuffer(this.buf.substring(index));
    }
}