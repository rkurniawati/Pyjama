package pj;

import pj.pr.*;
import pj.pr.target.SingleThreadVirtualTarget;
import pj.pr.target.TargetExecutor;
import pj.pr.target.TargetTask;
import pj.pr.target.TargetWorkerThread;
import pj.pr.target.VirtualTarget;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class PjRuntime {
	
	private static InternalControlVariables initial_icv = new InternalControlVariables();
	
//	private static boolean isInitialized = false;
	
	private static ThreadPoolExecutor PjThreadPoolExecutor = 
			new ThreadPoolExecutor(initial_icv.thread_limit_var, initial_icv.thread_limit_var, 0, TimeUnit.MILLISECONDS,
                    new LinkedBlockingQueue<Runnable>());
	
	/*Xing added this for store of Thread real id and related icv copy 2014.3.4*/
	public static ConcurrentHashMap<Long, InternalControlVariables> threadICVMap = new ConcurrentHashMap<Long, InternalControlVariables>();

	/*Xing added this to substitute critical region, using as lock 2014.4.30*/
	public static ReentrantLock OMP_lock = new ReentrantLock();
	
	/*Xing added this to store the map from target executor's name and its executor 2015.6.22*/
	private static ConcurrentHashMap<String, VirtualTarget> targetExecutorMap = new ConcurrentHashMap<String, VirtualTarget>();
	/*Xing added this to store all target blocks with taskas property, the task name is the key, and the value is the list contains all target task block named with this name. 
	 * In the hash table, the keys are strings' hashcodes instead of string themselves. 
	 * 2015.12.1*/
	private static HashMap<Integer, HashSet<TargetTask>> targetTaskNameDictionary = new HashMap<Integer, HashSet<TargetTask>>();
//	private static int ThreadsBusy;
//	private static int ActiveParRegions;
	
	/*Xing added this to used as a monitor for reduction in worksharing block 2014.8.4*/
	public static ReentrantLock reductionLockForWorksharing = new ReentrantLock();
	
	@Deprecated
	public static synchronized void init(){
		//GuiThread.init();
//		while(!isInitialized){
//			initial_icv = new InternalControlVariables();
//			PjThreadPoolExecutor = new ThreadPoolExecutor(10, initial_icv.thread_limit_var, 0, TimeUnit.MILLISECONDS,
//                    new LinkedBlockingQueue<Runnable>());
//			
//			//Put initial icv and inital master thread to HashTable
//			threadICVMap = new HashMap<Long,InternalControlVariables>();
//			Pyjama.icv = initial_icv;
//			setCurrentThreadICV(initial_icv);
//			setEDTThreadICV(initial_icv);
//			ThreadsBusy = 0;
//			ActiveParRegions = 0;
			
//			System.out.println("Pyjama initialized");
//			isInitialized = true;
//		}
	}
	
	@Deprecated
	public static synchronized void shutdown() {
		PjThreadPoolExecutor.shutdown();
	}

	public static void submit(int id, Callable<ConcurrentHashMap<String,Object>> task, InternalControlVariables parent_icv){
//		PjThreadPoolExecutor.submit(task);
		PjExecutor.submit(id, task, parent_icv);
		return;
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
	 * Following methods are used for Pyjama's asycTask approach(//#omp target virtual)
	 */
	public static void registerSingleThreadVirtualTarget(Thread thread, String targetName) {
		VirtualTarget virtualTarget = targetExecutorMap.get(targetName);
		if (null == virtualTarget) {
			virtualTarget = new SingleThreadVirtualTarget(targetName, thread);
			targetExecutorMap.put(targetName, virtualTarget);
		} else {
			throw new RuntimeException("Virtual target " + targetName + " has been registered before");
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
	
	public static void submitTask(Thread source, String targetName, TargetTask task) {
		VirtualTarget virtualTarget = targetExecutorMap.get(targetName);
		if (null == virtualTarget) {
			//System.err.println("Virtual target " + targetName + " is not predefined, create this virtual target on-the-fly");
			virtualTarget = new TargetExecutor(targetName);
			targetExecutorMap.put(targetName, virtualTarget);
		}
		virtualTarget.submit(task);
	}
	
	public static boolean checkFinish(TargetTask task) {
		if(task.isFinished()) {
			return true;
		}
		return false;
	}
	
	public static void waitTaskTillFinish(TargetTask task) {
		while(!task.isFinished()) {
		}
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
			}
		}
		//Test if current thread is a registered Single Thread Virtual Target
		return currentThreadIsSingleThreadTarget(targetName);
	}
	
	public static void IrrelevantHandlingProcessing(TargetTask currentWaitingTask) {
		//Test if current thread is a Pyjama worker thread, the worker thread process next target task in working queue.
		if (Thread.currentThread() instanceof TargetWorkerThread) {
			TargetWorkerThread thread = (TargetWorkerThread)Thread.currentThread();
			thread.IrrelevantHandlingProcessing(currentWaitingTask);
		}
		//Else the current thread should be a non-Pyjama thread, which means we cannot directly control its event-loop.
		//TODO: By default, if current thread is gui target, we do PjDispatchNextEvent() by modifying rt.jar
		if (currentThreadIsSingleThreadTarget("gui")) {
			while (!currentWaitingTask.isFinished()) {
				//busy waiting
			}
		}
		//TODO: By default, if current thread is web target, we do PjRunNextJob() by modifying Jetty's QueuedThreadPool
		if (currentThreadIsSingleThreadTarget("web")) {
			while (!currentWaitingTask.isFinished()) {
				//busy waiting
			}
		}				
	}
	
	public static void waitTargetBlocksWithTaskNameUntilFinish(String taskName) {
		HashSet<TargetTask> targetSet = null;
		synchronized(targetTaskNameDictionary) {
			targetSet = targetTaskNameDictionary.get(taskName.hashCode());
		} 
		if(null == targetSet) {
			throw new RuntimeException("Fatal Error(//#omp await): Pyjama cannot find the target task name:" + taskName);
		}
		for(TargetTask task: targetSet) {
			waitTaskTillFinish(task);
		}
		synchronized(targetTaskNameDictionary) {
			targetTaskNameDictionary.remove(taskName.hashCode());
		}
	}
	
	public static void storeTargetHandlerByName(TargetTask task, String taskName) {
		synchronized(targetTaskNameDictionary) {
			HashSet<TargetTask> targetSet = targetTaskNameDictionary.get(taskName.hashCode());
			if (null == targetSet) {
				targetSet = new HashSet<TargetTask>();
				targetSet.add(task);
				targetTaskNameDictionary.put(taskName.hashCode(), targetSet);
			} else {
				targetSet.add(task);
			}
		}
	}
 }
