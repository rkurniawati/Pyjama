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

package pj.pr.task;

public class TargetWorkerThread extends Thread {
	
	private TargetExecutor executor = null;
	private TargetTask<?> firstTask = null;
	private volatile TargetTask<?> currentTask = null;
	
	public TargetWorkerThread(TargetExecutor executor, TargetTask<?> firstTask) {
		this.executor = executor;
		this.firstTask = firstTask;
	}
	
	@Override
	public void run() {
		currentTask = firstTask;
        this.firstTask = null;
        while (currentTask != null || (currentTask = executor.getTask()) != null) {
        	try {
        		currentTask.run();
        	} finally {
        		currentTask = null;
            }
        }
        /*
         * remove this from executor's thread pool
         */
        this.executor.removeWorker(this);
	}
	
	public String targetName() {
		return this.executor.getTargetName();
	}
	
	public TargetTask<?> getCurrentTask() {
		return this.currentTask;
	}
	
	@Deprecated
	public void IrrelevantHandlingProcessing(TargetTask<?> waitingTask) {
		/*
		 * This function is used when current execution of the task is depending on
		 * another finish of target task. During this period, the current thread is 
		 * doing IHP to avoid busy waiting.
		 */
		while (!waitingTask.isFinished()) {
			TargetTask<?> anotherTask = executor.getTask();
			if (anotherTask != null) {
				try {
	                anotherTask.run();
	        	} finally {
	        		anotherTask = null;
	            }
			}
		}
	}
}
