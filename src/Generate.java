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

import java.io.File;
import java.util.List;

import org.apache.commons.cli.*;
import pj.compiler.CompileChecker.CompileOption;
import pj.compiler.JavaToClassCompiler;
import pj.compiler.PyjamaToJavaCompiler;

public class Generate {
	
	private static Options options;
	
	private static CompileOption compileFlag = CompileOption.J2C;
	
	private static List<String> sourceFileNames;
	
	private static String targetFileDirectory = "./";
	
	public static void main(String[] args) {
		
		optionSetup();	
		parseCommandline(args);
		compile();
	
	}
	
	private static void optionSetup() {
		options = new Options();
		
	    Option help = new Option("h", "help", false, "print usage of Pyjama compiler");
	    help.setRequired(false);
	    options.addOption(help);
	    
	    Option classpath = new Option("cp", "classpath", true, "Specify where to find user class files and annotation processors");
	    classpath.setRequired(false);
	    classpath.setArgs(1);
	    classpath.setArgName("PATH");
	    options.addOption(classpath);
	    		
	    Option outputPath = new Option("d", "directory", true, "output file directory");
	    outputPath.setRequired(false);
	    outputPath.setArgs(1);
	    outputPath.setArgName("DIR");
	    options.addOption(outputPath);
	     
        Option j2c = new Option("j2c", "javatoclass", false, "(default)compile .java file to paralleled .class file");
        j2c.setRequired(false);
        options.addOption(j2c);
        
        Option j2j = new Option("j2j", "javatojava", false, "compile .java file to paralleled .java file. "
        		+ "Remember new parallel java file will overwrite old sequential java file, "
        		+ "if there is no target directory is specified.");
        j2j.setRequired(false);
        options.addOption(j2j);
        
        Option p2c = new Option("p2c", "pjtoclass", false, "compile .pj file to paralleled .class file");
        p2c.setRequired(false);
        options.addOption(p2c);
        
        Option p2j = new Option("p2j", "pjtojava", false, "compile .pj file to paralleled .java file");
        p2j.setRequired(false);
        options.addOption(p2j);
	}
	
	private static void parseCommandline(String[] args) {
		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd = null;
		int compileOptSetTimes = 0;
		
	    try {
	    	 cmd = parser.parse(options, args);
	     } catch (ParseException e) {
	    	 System.out.println(e.getMessage());
	    	 formatter.printHelp("Pyjama:", options);
	    	 System.exit(1);
	     }
	    
	    //Parse the compilation option
		if(cmd.hasOption("j2c")){
			compileFlag = CompileOption.J2C;
			compileOptSetTimes++;
		} else if(cmd.hasOption("j2j")){
			compileFlag = CompileOption.J2J;
			compileOptSetTimes++;
		} else if(cmd.hasOption("p2j")){
			compileFlag = CompileOption.P2J;
			compileOptSetTimes++;
		} else if(cmd.hasOption("p2c")){
			compileFlag = CompileOption.P2C;
			compileOptSetTimes++;
		}
		
		//Parse the source files		
		sourceFileNames = cmd.getArgList();
		
		if(cmd.hasOption("h")) {
			formatter.printHelp("Pyjama", options);
		}
		
		//Parse the target file directory
		if(cmd.hasOption("d")) {
			targetFileDirectory = cmd.getOptionValue("d");
		}
		
		if(compileOptSetTimes > 1) {
			System.err.println("Error: More than one compile options are set.");
			System.exit(1);
		}
		
		if(sourceFileNames.isEmpty()) {
			System.err.println("Error: no input files.");
			formatter.printHelp("Pyjama", options);
		}
	}
	
	private static void compile() {
		switch (compileFlag) {
		case J2C:
			for(String sourceFile: sourceFileNames) {
				try {
					File javaFile = PyjamaToJavaCompiler.compile(sourceFile, targetFileDirectory, compileFlag);
					if (null != javaFile) {
						JavaToClassCompiler.compile(javaFile, targetFileDirectory);
					}
				} catch (Exception e) {
					System.err.println("*** Failed to process: " + sourceFile + " ****"); 
					e.printStackTrace();
				}
			}
			break;
		case J2J:
			for(String sourceFile: sourceFileNames) {
				try {
					PyjamaToJavaCompiler.compile(sourceFile, targetFileDirectory, compileFlag);
				} catch (Exception e) {
					System.err.println("*** Failed to process: " + sourceFile +" ****"); 
					e.printStackTrace();
				}
			}
			break;
		case P2J:
			for(String sourceFile: sourceFileNames) {
				try {
					PyjamaToJavaCompiler.compile(sourceFile, targetFileDirectory, compileFlag);
				} catch (Exception e) {
					System.err.println("*** Failed to process: " + sourceFile + " ****"); 
					e.printStackTrace();
				}
			}
			break;
		case P2C:
			for(String sourceFile: sourceFileNames) {
				try {
					File javaFile = PyjamaToJavaCompiler.compile(sourceFile, targetFileDirectory, compileFlag);
					if (null != javaFile) {
						JavaToClassCompiler.compile(javaFile, targetFileDirectory);
					}
				} catch (Exception e) {
					System.err.println("*** Failed to process: " + sourceFile + " ****"); 
					e.printStackTrace();
				}
			}
			break;
		default:
				throw new RuntimeException("This cannot happen!");
			
		}
	}

}
