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

package pj.pr;

import pj.PjRuntime;
import pj.pr.exceptions.OmpParallelRegionLocalCancellationException;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class PjWorkerThread extends Thread {
	private int alias_id;
	private Callable<Void> task;

	public PjWorkerThread(int id, Callable<Void> callable, InternalControlVariables parent_icv) {
		this.alias_id = id;
		InternalControlVariables currentThreadICV = new InternalControlVariables(parent_icv);
        currentThreadICV.currentThreadAliasID = this.alias_id;
		PjRuntime.threadICVMap.put(this.getId(), currentThreadICV);
		this.task = callable;
	}
	@Override
    public void run() {
       	 	try {
				task.call();
			} catch (Exception e) {
				//e.printStackTrace();
				//WorkerThread should always be silent
			}
       
    }
}
