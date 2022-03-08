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

package pj.compiler;

import java.io.*;

import pj.Version;
import pj.parser.ASTParser;
import pj.parser.ParseException;
import pj.parser.ast.CompilationUnit;
import pj.parser.ast.symbolscope.SymbolTable;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.visitor.SymbolScopingVisitor;
import pj.compiler.CompileChecker.CompileOption;

/**
 * We define the main compiler for Pyjama here. An use class should invoke the
 * static method parse() on an input .pj file.
 * 
 * The parser logic revolves around forming as AST from the input .pj file,
 * using the Pyjama parser and lexical analyser. Once the AST is former, it is
 * normalised and then translated using the visitor pattern.
 * 
 * @author vikassingh
 * @author Xing Fan
 *
 */

public class PyjamaToJavaCompiler extends Compiler
{

	/**
	 * This is main public utility to parse Pyjama code. It accepts the .pj file
	 * as input and produces the multi-threaded Java version
	 * 
	 * @param file
	 *            The input .pj file to be processed
	 * @throws Exception
	 *             parse exceptions
	 */
	public static void compile(String sourceFileName, String targetDirectory, CompileOption option)
	{

		File file = new File(sourceFileName);
		showMsg("Pyjama Compiler Version: " + Version.compilerVersion);
		showMsg("-----------------------------------------------------");
		showMsg(Version.getCompileDate() + "\t" + Version.getCompileTime());
		showMsg("-----------------------------------------------------");
		showMsg("Processing file: " + file.toString());
		showMsg("-----------------------------------------------------");

		// check if the input file is a valid file extension
		switch (option)
		{
		case P2C:
		case P2J:
			if (false == validatePjFile(file.getName()))
			{
				showErr("Invalid file type, expect .pj file");
				showErr("Processing discontinued");
				showErr("-----------------------------------------------------");
				return;
			}
			break;
		case J2C:
		case J2J:
			if (false == validateJavaFile(file.getName()))
			{
				showErr("Invalid file type, expect .java file");
				showErr("Processing discontinued");
				showErr("-----------------------------------------------------");
				return;
			}
			break;
		}

		InputStream is = null;
		try
		{
			is = new FileInputStream(file);
		}
		catch (FileNotFoundException e1)
		{
			System.err.println("File \"" + sourceFileName + "\" not found.");
			return;
		}

		String className = file.getName().substring(0, file.getName().lastIndexOf("."));
		if (option == CompileOption.P2C || option == CompileOption.J2C)
			try
			{
				JavaToClassCompiler.compile(className, JavaToClassCompiler.readFile(sourceFileName), null);
			}
			catch (Exception e1)
			{
				return;
			}

		showMsg("Processing 1st Phase: Parse and Normalisation");
		// we form the initial AST here, with normalisation when necessary
		CompilationUnit ast;
		try
		{
			ast = ASTParser.parse(is);
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			showMsg(e.getMessage());
			return;
		}

		showMsg("Processing 2nd Phase: Symbol scoping visiting");
		SymbolScopingVisitor symbolVisitor = new SymbolScopingVisitor();
		ast.accept(symbolVisitor, null);
		//symbolVisitor.printSymbolTable(); //log info print
		SymbolTable symbolTable = symbolVisitor.getSymbolTable();

		showMsg("Processing 3rd Phase: Pyjama code translation visiting");
		PyjamaToJavaVisitor pyjamaVisitor = new PyjamaToJavaVisitor(symbolTable);
		try
		{
			ast.accept(pyjamaVisitor, null);
		}
		catch(Exception e)
		{
			showMsg(e.getMessage());
			return;
		}

		showMsg("Processing 4th Phase: Generating java code");
		String targetCode = pyjamaVisitor.getSource();
		if (option == CompileOption.P2J || option == CompileOption.J2J)
		{
			String targetFileName = targetDirectory + "/" + file.getName().substring(0, file.getName().lastIndexOf("."))
					+ ".java";
			File targetFile = new File(file.getParent(), targetFileName);
			// Clean up the file, in case it exists and is not empty.
			clearTheFile(targetFile);
			writeToFile(targetFile, targetCode);
			showMsg("-----------------------------------------------------");
			showMsg("Paralleled .java code is generated.");
			showMsg("Processing Done.");
		}
		else
		{
			try
			{
				JavaToClassCompiler.compile(className, targetCode, targetDirectory);
				showMsg("Paralleled .class file is generated.");
				showMsg("Processing Done.");
			}
			catch (Exception e)
			{
				showMsg(e.getMessage());
				return;
			}

		}

		return;
	}

}
