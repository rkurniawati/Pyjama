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

/**
 * This class specifies the extension type
 * for Pyjama compiler code units
 * 
 * @author vikassingh
 */
public class FileExtension {
	
	/*
	 * we have a singleton class, should not be
	 * instantiated
	 */
	private FileExtension(){
		// nothing to do, cannot be instantiated
	}
	
	/*
	 * The Pyjama file extension
	 */
	private final static String PYJAMA_FILE_EXTENSION = ".pj";
	
	public static String getPyjamaFileExtension(){
		return PYJAMA_FILE_EXTENSION;
	}
}
