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

import pj.pr.*;
import pj.pr.exceptions.OmpCancelCurrentTaskException;
import pj.pr.task.SingleThreadVirtualTarget;
import pj.pr.task.TargetExecutor;
import pj.pr.task.TargetTask;
import pj.pr.task.TargetWorkerThread;
import pj.pr.task.VirtualTarget;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class PjRuntime {
	
	private static Pyjama.Platform platform;
	
	private static InternalControlVariables initial_icv = new InternalControlVariables();
		
	/*Xing added this for store of Thread real id and related icv copy 2014.3.4*/
	public static ConcurrentHashMap<Long, InternalControlVariables> threadICVMap = new ConcurrentHashMap<Long, InternalControlVariables>();

	/*Xing added this to substitute critical region, using as lock 2014.4.30*/
	public static ReentrantLock OMP_lock = new ReentrantLock();
	
	/*Xing added this to store the map from target executor's name and its executor 2015.6.22*/
	private static ConcurrentHashMap<String, VirtualTarget> targetExecutorMap = new ConcurrentHashMap<String, VirtualTarget>();
	/*Xing added this to store all target blocks with taskas property, the task name is the key, and the value is the list contains all target task block named with this name. 
	 * In the hash table, the keys are strings' hashcodes instead of string themselves. 
	 * 2015.12.1*/
	private static HashMap<Integer, HashSet<TargetTask<?>>> targetTaskNameDictionary = new HashMap<Integer, HashSet<TargetTask<?>>>();
//	private static int ThreadsBusy;
//	private static int ActiveParRegions;
	
	/*Xing added this to used as a monitor for reduction in worksharing block 2014.8.4*/
	public static ReentrantLock reductionLockForWorksharing = new ReentrantLock();
	
	@Deprecated
	public static synchronized void init(){
	}
	

	public static void submit(int id, Callable<Void> task, InternalControlVariables parent_icv){
		PjExecutor.submit(id, task, parent_icv);
	}
	
	public static InternalControlVariables inheritICV(InternalControlVariables current_icv){
		InternalControlVariables child_icv = new InternalControlVariables(current_icv);
		//if parent icv isn't initial icv, remove a top nthreads value for next nested parallel region to use 
		child_icv.levels_var++;
		
		//Xing(2015.1.24) always make cancellation flags as false when inheriting a new parallel region
		child_icv.OMP_CurrentParallelRegionCancellationFlag = new AtomicBoolean(false);
		child_icv.OMP_CurrentWorksharingRegionCancellationFlag = new AtomicBoolean(false);
		
		if (0 != child_icv.active_levels_var) {
			child_icv.active_levels_var--;
		}
		PjRuntime.setCurrentThreadICV(child_icv);
		return child_icv;
	}
	
	
	public static void recoverParentICV(InternalControlVariables parent_icv) {
		threadICVMap.put(Thread.currentThread().getId(), parent_icv);
	}
	
	public static void setCurrentThreadICV(InternalControlVariables icv) {
		threadICVMap.put(Thread.currentThread().getId(), icv);
	}
	
	public static void setEDTThreadICV(InternalControlVariables icv) {
		threadICVMap.put(Thread.currentThread().getId(), icv);
	}
	
	public static InternalControlVariables getCurrentThreadICV() {
		InternalControlVariables icv = threadICVMap.get(Thread.currentThread().getId());
		if (null == icv) {
			icv = initial_icv;
		}
		return icv;
	}
	
	public static boolean currentThreadInParallelRegion() {
		InternalControlVariables icv = getCurrentThreadICV();
		if (-1 == icv.levels_var) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void checkWorksharingCancellationPoint() {
		InternalControlVariables icv = getCurrentThreadICV();
		if (null == icv.OMP_CurrentWorksharingRegionCancellationFlag) {
			throw new RuntimeException("Pyjama: Cancellation flag null!");
		} else {
			if (icv.OMP_CurrentWorksharingRegionCancellationFlag.get() == true) {
				throw new pj.pr.exceptions.OmpWorksharingLocalCancellationException();
			}
		}
	}
	
	public static void checkParallelCancellationPoint() {
		InternalControlVariables icv = getCurrentThreadICV();
		if (null == icv.OMP_CurrentParallelRegionCancellationFlag) {
			throw new RuntimeException("Pyjama: Cancellation flag null!");
		} else {
			if (icv.OMP_CurrentParallelRegionCancellationFlag.get() == true) {
				throw new pj.pr.exceptions.OmpParallelRegionLocalCancellationException();
			}
		}
	}
	
	public static void decreaseBarrierCount() {
		InternalControlVariables icv = getCurrentThreadICV();
		if (null == icv.OMP_CurrentParallelRegionBarrier) {
			throw new pj.pr.exceptions.OmpBrokenBarrierException();
		}
		icv.OMP_CurrentParallelRegionBarrier.decreaseParties();
	}
	
	/*Xing added this to substitute to using as openMP flush directive 2014.4.30*/
	public static void flushMemory() {
		OMP_lock.lock();
        try {} finally {OMP_lock.unlock();}
	}
	
	/*Xing added this to substitute to using as openMP barrier directive 2014.4.30*/
	public static void setBarrier() {
		InternalControlVariables icv = getCurrentThreadICV();
		if (null == icv.OMP_CurrentParallelRegionBarrier) {
			throw new pj.pr.exceptions.OmpBrokenBarrierException();
		}
		checkParallelCancellationPoint();
		try {icv.OMP_CurrentParallelRegionBarrier.await();}
		catch (InterruptedException e) {e.printStackTrace();}
		catch (BrokenBarrierException e) {e.printStackTrace();}
	}
	
	public static void setCurrentParallelRegionThreadNumber(int num) {
		InternalControlVariables icv = getCurrentThreadICV();
		icv.currentParallelRegionThreadNumber = num;
	}
	
	public static AtomicInteger get_OMP_loopCursor() {
		InternalControlVariables icv = getCurrentThreadICV();
		return icv.OMP_loopCursor;
	}
	
	public static void reset_OMP_loopCursor() {
		InternalControlVariables icv = getCurrentThreadICV();
		icv.OMP_loopCursor.set(0);
	}
	
	public static AtomicInteger get_OMP_orderCursor() {
		InternalControlVariables icv = getCurrentThreadICV();
		return icv.OMP_orderCursor;
	}
	
	public static void reset_OMP_orderCursor() {
		InternalControlVariables icv = getCurrentThreadICV();
		icv.OMP_orderCursor.set(0);
	}
	
	/*
	 * Following methods are used for Pyjama's asyncTask approach(//#omp target virtual)
	 */
	public static void registerSingleThreadVirtualTarget(Thread thread, String targetName) {
		VirtualTarget virtualTarget = targetExecutorMap.get(targetName);
		if (null == virtualTarget) {
			virtualTarget = new SingleThreadVirtualTarget(targetName, thread);
			targetExecutorMap.put(targetName, virtualTarget);
		} else {
			//If already registered, do nothing.
		}
	}
	
	public static void createVirtualTarget(String targetName, int workerLimit) {
		VirtualTarget virtualTarget = targetExecutorMap.get(targetName);
		if (null == virtualTarget) {
			if (workerLimit <=0) {
				virtualTarget = new TargetExecutor(targetName);
			} else {
				virtualTarget = new TargetExecutor(targetName, workerLimit);
			}
			targetExecutorMap.put(targetName, virtualTarget);
		} else {
			throw new RuntimeException("Virtual target " + targetName + " has been created before");
		}
	}
	
	public static void submitTargetTask(Thread source, String targetName, TargetTask<?> task) {
		VirtualTarget virtualTarget = targetExecutorMap.get(targetName);
		if (null == virtualTarget) {
			virtualTarget = new TargetExecutor(targetName);
			targetExecutorMap.put(targetName, virtualTarget);
		}
		virtualTarget.submit(task);
	}
	
	public static void submitOmpTask(TargetTask<?> task) {
		if (PjRuntime.currentThreadInParallelRegion()) {
			InternalControlVariables icv = getCurrentThreadICV();
			int threadID = icv.currentThreadAliasID;
			if (0 == threadID) {
				icv.OMP_TaskPool.submit(task);
			} else {
				//If current thread is a slave thread, this is just a scheduling point. Slave thread simply runa tasks if any.
				icv.OMP_TaskPool.executeTasks();
			}
		} else {
			PjRuntime.runTaskDirectly(task);
    	}
	}
	
	public static void taskWait() {
		InternalControlVariables icv = getCurrentThreadICV();
		icv.OMP_TaskPool.runTillTaskPoolEmpty();
		setBarrier();
	}
	
	public static void taskCancel() {
		InternalControlVariables icv = getCurrentThreadICV();
		icv.OMP_TaskPool.cancelAllTasks();	
	}
	
	public static void checkTaskCancellation() {
		TargetTask<?> currentTask = getCurrentTask();
		if ((null != currentTask) && (currentTask.isCancelled())) {
			throw new OmpCancelCurrentTaskException();
		}
	}
	
	public static TargetTask<?> getCurrentTask() {
		Thread currentThread = Thread.currentThread();
		if (currentThread instanceof TargetWorkerThread) {
			return ((TargetWorkerThread)currentThread).getCurrentTask();
		}
		return null;
	}
	
	public static void runTaskDirectly(TargetTask<?> task) {
		task.run();
	}
	
	public static boolean checkFinish(TargetTask<?> task) {
		if(task.isFinished()) {
			return true;
		}
		return false;
	}
	
	public static void waitTaskTillFinish(TargetTask<?> task) {		
		while(!task.isFinished()) {
			try {
				//wait until the task is set to finished, and will notify current thread.
				synchronized(task.synchronizationGuard) {
					task.synchronizationGuard.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static VirtualTarget getVirtualTargetOfCurrentThread() {
		for (VirtualTarget target: targetExecutorMap.values()) {
			if (currentThreadIsTheTarget(target.targetName())) {
				return target;
			}
		}
		return null;
	}
	
	public static boolean currentThreadIsSingleThreadTarget(String targetName) {
		for (VirtualTarget target: targetExecutorMap.values()) {
			if (target instanceof SingleThreadVirtualTarget) {
				if (((SingleThreadVirtualTarget)target).targetName().equals(targetName)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean currentThreadIsTheTarget(String targetName) {
		//Test if current thread is a Pyjama worker thread
		if (Thread.currentThread() instanceof TargetWorkerThread) {
			if (((TargetWorkerThread)(Thread.currentThread())).targetName().equals(targetName)) {
				return true;
			} else {
				return false;
			}
		}
		//Test if current thread is a registered Single Thread Virtual Target
		return currentThreadIsSingleThreadTarget(targetName);
	}
	
	public static String getCurrentVirtualTargetName() {
		if (Thread.currentThread() instanceof TargetWorkerThread) {
			return ((TargetWorkerThread)Thread.currentThread()).targetName();
		}
		for (VirtualTarget target: targetExecutorMap.values()) {
			if (target instanceof SingleThreadVirtualTarget) {
				if (((SingleThreadVirtualTarget)target).getThread() == Thread.currentThread()) {
					return ((SingleThreadVirtualTarget)target).targetName();
				}
			} else {
				continue;
			}
		}
		throw new RuntimeException("Pyjama cannot distinguish current virtual target name!");
	}
		
	public static void setCancellationFlagToTaskName(String taskName) {
		HashSet<TargetTask<?>> targetSet = null;
		synchronized(targetTaskNameDictionary) {
			targetSet = targetTaskNameDictionary.get(taskName.hashCode());
		} 
		if(null == targetSet) {
			throw new RuntimeException("Fatal Error(//#omp taskcancel): Pyjama cannot find the target task name:" + taskName);
		}
		for(TargetTask<?> task: targetSet) {
			task.setCancel();
		}
	}
	
	public static void waitTargetBlocksWithTaskNameUntilFinish(String taskName) {
		HashSet<TargetTask<?>> targetSet = null;
		synchronized(targetTaskNameDictionary) {
			targetSet = targetTaskNameDictionary.get(taskName.hashCode());
		} 
		if(null == targetSet) {
			throw new RuntimeException("Fatal Error(//#omp wait): Pyjama cannot find the target task name:" + taskName);
		}
		for(TargetTask<?> task: targetSet) {
			waitTaskTillFinish(task);
		}
		synchronized(targetTaskNameDictionary) {
			targetTaskNameDictionary.remove(taskName.hashCode());
		}
	}
	
	public static void storeTargetHandlerByName(TargetTask<?> task, String taskName) {
		synchronized(targetTaskNameDictionary) {
			HashSet<TargetTask<?>> targetSet = targetTaskNameDictionary.get(taskName.hashCode());
			if (null == targetSet) {
				targetSet = new HashSet<TargetTask<?>>();
				targetTaskNameDictionary.put(taskName.hashCode(), targetSet);
			} 
			targetSet.add(task);
		}
	}
	
	public static void setPlatform(Pyjama.Platform p) {
		platform = p;
	}
	
	public static Pyjama.Platform getPlatform() {
		return platform;
	}
 }
