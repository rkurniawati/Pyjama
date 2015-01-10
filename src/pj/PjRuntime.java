package pj;

import pj.pr.*;

import java.util.concurrent.*;
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
	
	/*Xing added this to substitute to using as openMP flush directive 2014.4.30*/
	public static void flushMemory() {
		OMP_lock.lock();
        try {} finally {OMP_lock.unlock();}
	}
	
	/*Xing added this to substitute to using as openMP barrier directive 2014.4.30*/
	public static void setBarrier() {
		InternalControlVariables icv = getCurrentThreadICV();
		System.out.println("Barrier "+Pyjama.omp_get_thread_num()+" b(pointer):"+icv.OMP_CurrentParallelRegionBarrier.hashCode());
		if (null == icv.OMP_CurrentParallelRegionBarrier) {
			//need throw brokenBarrier exception
			return;
		}
		if (null == icv.OMP_CurrentParallelRegionCancellationFlag) {
			throw new RuntimeException("Pyjama: Cancellation flag null!");
		}
		else {
			System.out.println("Barrier"+ Pyjama.omp_get_thread_num()+ " flag " + icv.OMP_CurrentParallelRegionCancellationFlag.get()+" pointer(flag):"+icv.OMP_CurrentParallelRegionCancellationFlag.hashCode());
			if (icv.OMP_CurrentParallelRegionCancellationFlag.get() == true) {
				throw new pj.pr.PJthreadStopException();
			}
			try {icv.OMP_CurrentParallelRegionBarrier.await();}
			catch (InterruptedException e) {e.printStackTrace();}
			catch (BrokenBarrierException e) {e.printStackTrace();}
		}
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
	
 }
