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

package pj;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public abstract class Compiler {
	
	/*
	 * set to true, to print debug messages
	 * @see showErr(), showMsg()
	 */
	protected static boolean mDebug = true;
		
    /*
     * Utility method to push the contents of string to a file stream
     * @param file Input file name
     * @param contents Buffer contents to be pushed
     */
    protected static void writeToFile(File file, String contents) {
        try {
        	Writer output = null;
            output = new BufferedWriter(new FileWriter(file));
			output.write(contents);
	        output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    /*
     * Utility method to clear the contents of string to a file stream
     * @param file Input file name
     */
    protected static void clearTheFile(File file) {
    	try {
        	Writer output = null;
            output = new BufferedWriter(new FileWriter(file));
			output.write(""); //empty string
	        output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	/*
	 * Utility method which ensures the correct file type
	 * @param fileName input file name
	 * @return
	 */
	protected static boolean validatePjFile(String fileName){
		return 
				fileName.endsWith(CompileChecker.getPyjamaFileExtension());
	}
	
	/*
	 * Utility method which ensures the correct file type
	 * @param fileName input file name
	 * @return
	 */
	protected static boolean validateJavaFile(String fileName){
		return 
				fileName.endsWith(CompileChecker.getJavaFileExtension());
	}
	
	/*
	 * Utility method to print debug message
	 * @param msg Debug Message String
	 * @note Should use this method instead of System.out/err calls, so that
	 * @note we can switch off/on the debug messages.
	 */
	protected static void showMsg(String msg){
		if(true == mDebug){
			System.out.println(msg);
		}
	}

	/*
	 * Utility method to print debug error
	 * @param msg Debug Error String
	 * @note Should use this method instead of System.out/err calls, so that
	 * @note we can switch off/on the debug messages.
	 */
	protected static void showErr(String err){
		if(true == mDebug){
			System.err.println(err);
		}
	}
}
