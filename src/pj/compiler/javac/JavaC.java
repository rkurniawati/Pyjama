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
package pj.compiler.javac;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import javax.tools.JavaFileObject.Kind;
import java.util.ArrayList;
import java.util.Arrays;

public class JavaC
{

	private static javax.tools.JavaCompiler javac;
	private static StandardJavaFileManager fileManager;
	private static DiagnosticCollector<JavaFileObject> diagnostics;
	private static ArrayList<String> options;

	static
	{
		javac = ToolProvider.getSystemJavaCompiler();
		if (javac == null)
		{
			throw new RuntimeException(
					"Pyjama: Could not get Java compiler. Please ensure that JDK is installed instead of JRE.");
		}
		diagnostics = new DiagnosticCollector<>();
		fileManager = javac.getStandardFileManager(diagnostics, null, null);
		options = new ArrayList<>();

	}

	public static void compile(String className, String sourceCodeInText, String classpath, String targetPath)
			throws Exception
	{
		
		// CompiledCode compiledCode = new CompiledCode(className);
		DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();

		

		JavaFileManager fileManagerToUse = javac.getStandardFileManager(diagnostics, null, null);

		if (classpath != null)
		{
			options.add("-classpath");
			options.add(classpath);
		}
		
		if (targetPath != null)
		{
			options.add("-d");
			options.add(targetPath);
			
		}
		else
		{
			fileManagerToUse = new VoidFileManager(fileManager);
			sourceCodeInText = "import pj.Pyjama;\n"+sourceCodeInText;
		}
		
		SourceCode sourceCode = new SourceCode(className, sourceCodeInText);
		Iterable<? extends JavaFileObject> compilationUnits = Arrays.asList(sourceCode);

		try
		{
			JavaCompiler.CompilationTask task = javac.getTask(null, fileManagerToUse, diagnostics, options, null,
					compilationUnits);
			boolean success = task.call();
			if (!success)
			{
				for (Diagnostic<? extends JavaFileObject> err : diagnostics.getDiagnostics())
				{
					System.err.println(err);
				}
				throw new Exception("");
			}
		}
		finally
		{
			fileManagerToUse.close();
		}

	}

	private static class VoidFileManager extends ForwardingJavaFileManager<StandardJavaFileManager>
	{

		protected VoidFileManager(StandardJavaFileManager fileManager)
		{
			super(fileManager);
		}

		@Override
		public JavaFileObject getJavaFileForOutput(Location location, String className, Kind kind, FileObject sibling)
		{
			JavaFileObject jfo = null;
			try
			{ 
				jfo =new CompiledCode(className);
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return jfo;
		}

	}


	
}
