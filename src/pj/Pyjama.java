package pj;

import pj.pr.*;

/**
 * This is the main class which implements the OpenMP 2.5
 * specific runtime routines.
 * 
 * The routine syntax mimics the specification, however,
 * in the light of object orientation, some methods are
 * not supported.
 * 
 * @author Xing Fan
 */
public class Pyjama {

	/**XING EERs (Execution Environment Routines) definition BEGIN*/
//	omp_set_num_threads
//	omp_get_num_threads
//	omp_get_max_threads
//	omp_get_thread_num
//	omp_get_num_procs
//	omp_in_parallel
//	omp_set_dynamic
//	omp_get_dynamic
//	omp_get_cancellation
//	omp_set_nested
//	omp_get_nested
//	omp_set_schedule
//	omp_get_schedule
//	omp_get_thread_limit
//	omp_set_max_active_levels
//	omp_get_max_active_levels
//	omp_get_level
//	omp_get_ancestor_thread_num
//	omp_get_team_size
//	omp_get_active_level
//	omp_in_final
//	omp_get_proc_bind
//	omp_set_default_device
//	omp_get_default_device
//	omp_get_num_devices
//	omp_get_num_teams
//	omp_get_team_num
//	omp_is_initial_device
	/**XING EERs (Execution Environment Routines) definition END*/
	
	/**XING LRs (Lock Routines) definition BEGIN*/
//	omp_init_lock
//	omp_init_nest_lock
//	omp_destroy_lock
//	omp_destroy_nest_lock
//	omp_set_lock
//	omp_set_nest_lock
//	omp_unset_lock
//	omp_unset_nest_lock
//	omp_test_lock
//	omp_test_nest_lock
	/**XING LRs (Lock Routines) definition END*/
	
	/**XING TRs (Time Routines) definition BEGIN*/
//	omp_get_wtime
//	omp_get_wtick
	/**XING TRs (Time Routines) definition END*/
	
	/*****************************************************************************
	 * ***************************************************************************
	 */
	protected static InternalControlVariables icv;
	
	/**
	 * Utility method to set the thread private object
	 * for the current thread
	 * @param tp Specifies the object
	 */
//	public static void setThreadPrivate(Object tp){
//		Thread currentThread = Thread.currentThread();
//		if (currentThread instanceof WorkerThread) {
//			((WorkerThread)currentThread).setTP(tp);
//		}else{
//			mThreadPrivate = tp;
//		}
//	}
//
//	/**
//	 * Utility method to retrieve the thread private object
//	 * @return The thread private variable of the current thread
//	 */
//	public static Object getThreadPrivate(){
//		Thread currentThread = Thread.currentThread();
//		if (currentThread instanceof WorkerThread) {
//			return ((WorkerThread)currentThread).getTP();
//		}else{
//			return mThreadPrivate;
//		}
//	}
	
	/**
	 * Utility method to set the thread private object
	 * for the current thread with a key value. 
	 * @param tp Specifies the threadprivate variable
	 * @param key Specifies the key that can be used to retrieve the threadprivate object
	 */
//	public static void setThreadPrivate(Object tp, String key){
//		Thread currentThread = Thread.currentThread();
//		if (currentThread instanceof WorkerThread) {
//			((WorkerThread)currentThread).setTP(tp, key);
//		}else{
//			mThreadPrivate = tp;
//		}
//	}

	/**
	 * Utility method to retirieve the thread private object
	 * for the current thread with a key value. 
	 * @param key Specifies the key
	 */
//	public static Object getThreadPrivate(String key){
//		Thread currentThread = Thread.currentThread();
//		if (currentThread instanceof WorkerThread) {
//			return ((WorkerThread)currentThread).getTP(key);
//		}else{
////			System.out.println("from main");
//			return mThreadPrivate;
//		}
//	}

	/*
	 * OpenMP 2.5 Execution environment runtime routines follow
	 * from here 
	 */
	
	/**XING EERs (Execution Environment Routines) definition BEGIN*/
	/**
	 * OpenMP 2.5 - like Runtime routine to set 
	 * the number of threads for a parallel region. Neverthless,
	 * the current version of Pyjama runtime uses PT's task pool
	 * in the backend, and so setting the number of threads
	 * before Pyjama.init(), is more effective
	 * 
	 * @param num_threads Specific the number of threads to be set
	 */
	public static void omp_set_num_threads(int num_threads)
	{
		if(num_threads < 1)
		{
			System.err.println("Pyjama Error:omp_set_num_threads: cannot set thread number below 1");
			return;
		}
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		
		int level_index = icv.levels_var + 1;
		icv.nthreads_var.set(level_index, num_threads);

	}
	
	/**
	 * OpenMP 2.5 - like Runtime routine to retrieve 
	 * the number of threads for a parallel region
	 * 
	 * @return The number of threads being used in the current parallel region
	 */
	public static int omp_get_num_threads()
	{
		//System.out.println("from pyjama.get_num-threads():"+icv.nthreads_var.get(0));
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		return icv.currentParallelRegionThreadNumber;
	}
	
	/**
	 * OpenMP 2.5 - like Runtime routine to retrieve 
	 * the maximum number of threads supported
	 * 
	 * @return The maximum number of threads
	 */
	public static int omp_get_max_threads()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		int max_threads = icv.thread_limit_var;
		//max_threads = icv.thread_limit_var - used_thread_num;
		return max_threads;
	}
	
	/**
	 * OpenMP 2.5 - like Runtime routine to retrieve 
	 * the thread id of the current thread. If called from
	 * the master thread (the encountering thread), this method will 
	 * return a value of 0
	 * 
	 * @return The thread id of the current thread
	 */
	public static int omp_get_thread_num()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		int threadNumber = icv.currentThreadAliasID;
		return threadNumber;	
	}
	
	/**
	 * OpenMP 2.5 - like Runtime routine to retrieve the
	 * available number of processes.
	 * Pyjama strives towards supporting optimal number of 
	 * processor cores. However, the current version takes advantage
	 * of the Java routines to find this information. This is an area
	 * of research and this logic will be updated to add awareness
	 * for processor loads/number of active applications and more.
	 * 
	 * @return The number of available processes
	 */
	public static int omp_get_num_procs(){
		return Runtime.getRuntime().availableProcessors();
	}
	
	/**
	 * OpenMP 2.5 - like runtime routine to set a dynamic region
	 */
	public static boolean omp_in_parallel()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		if (icv.levels_var > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void omp_set_dynamic()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		icv.dyn_var = true;
	}
	
	/**
	 * OpenMP 2.5 - like runtime routine to get the
	 * number of threads from dynamic region
	 */
	public static boolean omp_get_dynamic()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		return icv.dyn_var;
	}
	
	public static int get_cancellation()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		return icv.cancel_var;
	}
	
	/**
	 * OpenMP 2.5 - like runtime routine to set a nested region
	 */
	public static void omp_set_nested()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		icv.nest_var = true;
	}
	
	/**
	 * OpenMP 2.5 - like runtime routine to get a count of nested region
	 */
	public static boolean omp_get_nested()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		return icv.nest_var; 
	}

	/**
	 * OpenMP 2.5 - like routine to retrieve the time duration
	 * since the last call of this routine
	 * @return Time duration in (ns) since the last call
	 */
	
	public static void omp_set_schedule(int scheduleType)
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		icv.def_sched_var = scheduleType;
	}
	
	public static int omp_get_schedule()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		return icv.def_sched_var;
	}
	
	public static int omp_get_thread_limit()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		return icv.thread_limit_var;
	}
	
	public static void omp_set_max_active_levels(int maxLevel)
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		icv.max_active_levels_var = maxLevel;
	}
	
	public static int omp_get_max_active_levels()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		return icv.max_active_levels_var;
	}
	
	public static int omp_get_level()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		return icv.levels_var;
	}
	
	public static int omp_get_ancestor_thread_num()
	{
		//get current thread's parent's thread number
		return 0;
	}
	
	public static int omp_get_team_size()
	{
		return 0;
	}
	
	public static int omp_get_active_level()
	{
		return 0;
	}
	
	public static boolean omp_in_final()
	{
		InternalControlVariables icv = PjRuntime.getCurrentThreadICV();
		if (icv.levels_var == icv.active_levels_var)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void omp_get_proc_bind()
	{
		
	}
	
	public static void omp_set_default_device()
	{
		
	}
	
	public static int omp_get_default_device()
	{
		return 0;
	}
	
	public static int omp_get_num_devices()
	{
		return 0;
	}
	
	public static int omp_get_num_teams()
	{
		return 0;
	}
	
	public static boolean omp_is_initial_device()
	{
		return true;
	}
	
	/**XING EERs (Execution Environment Routines) definition END*/
	
	/**XING LRs (Lock Routines) definition BEGIN*/
	
	/**XING LRs (Lock Routines) definition END*/
	
	
	/**XING TRs (Time Routines) definition BEGIN*/
	public static double omp_get_wtime()
	{
		return System.nanoTime(); 
	}

	/**
	 * OpenMP 2.5 - like runtime routine to get the system clock tick value
	 */
	public static double omp_get_wtick()
	{
		return System.nanoTime();
	}
	/**XING TRs (Time Routines) definition END*/
	
	/**
	 * Pyjama executor model supports
	 * Xing Fan 2015.8.31 
	 */
	
	public static void omp_register_as_virtual_target(String targetName) {
		PjRuntime.registerSingleThreadVirtualTarget(Thread.currentThread(), targetName);
	}
	
	public static void omp_create_virtual_target(String targetName) {
		PjRuntime.createVirtualTarget(targetName, 0);
	}
	
	public static void omp_create_virtual_target(String targetName, int workerLimit) {
		PjRuntime.createVirtualTarget(targetName, workerLimit);
	}
	
}
