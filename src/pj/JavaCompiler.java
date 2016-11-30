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

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class JavaCompiler extends Compiler{
	
	public static void parse(File file, String targetDirectory) throws Exception {	
		showMsg("Javac Compiler Version: ");
		showMsg(getJavacVersion());
		showMsg("-----------------------------------------------------");
		showMsg(Version.getCompileDate() + "\t" + Version.getCompileTime());
		showMsg("-----------------------------------------------------");
		showMsg("Processing file: " + file.toString());
		showMsg("-----------------------------------------------------");
		runJavac(file, targetDirectory);
		showMsg("-----------------------------------------------------");
		showMsg("Processing Done, paralleled class file generated.");
	}
	
	private static String getJavacVersion() {
		String[] javacVersionCommand = {"javac", "-version"};
		ProcessBuilder pb = new ProcessBuilder(javacVersionCommand);
		try {
			Process process = pb.start();
			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;
			StringBuffer sb = new StringBuffer();
			while ((line = br.readLine()) != null) {
				sb.append(line);
		    }
			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.err.println("cannot run javac properly");
		System.exit(1);
		return null;
	}
	
	private static void runJavac(File sourceFile, String targetDirectory) {
		String sourceFileName = null;
		try {
			sourceFileName = sourceFile.getCanonicalPath();
		} catch (IOException e) {
			throw new RuntimeException("Error: cannot get source java file properly");
		}
		String[] javacCommand = {"javac", "-d", targetDirectory+"/", sourceFileName};
		ProcessBuilder pb = new ProcessBuilder(javacCommand);
		try {
			pb.wait();
		} catch (InterruptedException e) {
			System.err.println("Error: cannot run javac properly");
			System.exit(1);
		}
	}
}
