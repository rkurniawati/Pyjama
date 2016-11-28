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
import java.util.concurrent.Callable;

public class PjExecutor {
	
	public static void submit(int id, Callable<Void> task, InternalControlVariables parent_icv){
		PjWorkerThread workerThread = new PjWorkerThread(id, task, parent_icv);
		workerThread.start();
	}

	public static void cancelCurrentThreadGroup() {
		InternalControlVariables icv = PjRuntime.threadICVMap.get(Thread.currentThread().getId());
		if (null == icv.OMP_CurrentParallelRegionCancellationFlag) {
			throw new RuntimeException("Pyjama: Cannot find cancellation flag in current parallel region");
		} else {
			icv.OMP_CurrentParallelRegionCancellationFlag.set(true);
		}
	}
	
	public static void cancelCurrentWorksharing() {
		InternalControlVariables icv = PjRuntime.threadICVMap.get(Thread.currentThread().getId());
		if (null == icv.OMP_CurrentWorksharingRegionCancellationFlag) {
			throw new RuntimeException("Pyjama: Cannot find cancellation flag in current parallel region");
		} else {
			icv.OMP_CurrentWorksharingRegionCancellationFlag.set(true);
		}
	}
}