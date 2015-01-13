package pj.pr;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
public class InternalControlVariables {
	/**XING Environment Variables definition BEGIN*/
	/*describes the OpenMP environment variables that specify the settings of
	the ICVs that affect the execution of OpenMP programs (see Section 2.3 on page 34).
	The names of the environment variables must be upper case. The values assigned to the
	environment variables are case insensitive and may have leading and trailing white
	space. Modifications to the environment variables after the program has started, even if
	modified by the program itself, are ignored by the OpenMP implementation. However,
	the settings of some of the ICVs can be modified during the execution of the OpenMP
	program by the use of the appropriate directive clauses or OpenMP API routines.*/
	
	public static enum OMP_SCHEDULE{OMP_SCHEDULE_STATIC, OMP_SCHEDULE_DYNAMIC, OMP_SCHEDULE_GUIDED, OMP_SCHEDULE_AUTO};
	public static ArrayList<Integer> OMP_NUM_THREADS;
	public static boolean OMP_DYNAMIC = false;
	public static enum OMP_PROC_BIND{OMP_PROC_BIND_MASTER, OMP_PROC_BIND_CLOSE, OMP_PROC_BIND_SPREAD}; 
	public static String OMP_PLACES = "";
	public static boolean OMP_NESTED = false;
	public static String OMP_STACKSIZE = ""; 
	public static enum OMP_WAIT_POLICY{OMP_WAIT_POLICY_ACTIVE, OMP_WAIT_POLICY_PASSIVE};
	public static int OMP_MAX_ACTIVE_LEVELS = 3;
	public static int OMP_THREAD_LIMIT = 256;
	public static boolean OMP_CANCELLATION = false;
	public static enum OMP_DISPLAY_ENV{OMP_DISPLAY_ENV_TRUE, OMP_DISPLAY_ENV_FALSE, OMP_DISPLAY_ENV_VERBOSE};
	public static String OMP_DEFAULT_DEVICE = "LOCAL";
	
	/**XING Environment Variables definition END*/
	
	/**XING ICVs (Internal Control Variables) definition BEGIN*/
	/*An OpenMP implementation must act as if there are internal control variables (ICVs)
	that control the behavior of an OpenMP program. These ICVs store information such as
	the number of threads to use for future parallel regions, the schedule to use for
	worksharing loops and whether nested parallelism is enabled or not. The ICVs are given
	values at various times (described below) during the execution of the program. They are
	initialized by the implementation itself and may be given values through OpenMP
	environment variables and through calls to OpenMP API routines. The program can
	retrieve the values of these ICVs only through OpenMP API routines.*/
	
	public boolean dyn_var;
	public boolean nest_var;
	public ArrayList<Integer> nthreads_var;
	public int run_sched_var;
	public int def_sched_var;
	public int bind_var;
	public int stacksize_var;
	public int wait_policy_var;
	public int thread_limit_var;
	public int max_active_levels_var;
	public int active_levels_var;
	public int levels_var;
	public int place_partition_var;
	public int cancel_var;
	public String default_device_var;
	
	
	/* Xing added those for parallel region cancellation support 2015.1.8 */
	public volatile AtomicBoolean OMP_CurrentParallelRegionCancellationFlag = new AtomicBoolean(false);
	public volatile AtomicBoolean OMP_CurrentWorksharingRegionCancellationFlag = new AtomicBoolean(false);

	
	/* Xing added those for atomic directive support 2014.4.30 */
	// the initialisation of OMP_CurrentParallelRegionBarrier should be done in runtime
	public PjCyclicBarrier OMP_CurrentParallelRegionBarrier = null;
	public AtomicInteger OMP_loopCursor = new AtomicInteger(0);
	public AtomicInteger OMP_orderCursor = new AtomicInteger(0);

	public int currentParallelRegionThreadNumber = 1;
	/*Xing added this for store of current Thread alias id 2014.3.4*/
	public int currentThreadAliasID;
	
	public InternalControlVariables(){
		this.dyn_var = InternalControlVariables.OMP_DYNAMIC;
		this.nest_var = InternalControlVariables.OMP_NESTED;
		this.thread_limit_var = 128;
		this.max_active_levels_var = 5;
		this.active_levels_var = this.max_active_levels_var;
		this.levels_var = -1;
		this.default_device_var = InternalControlVariables.OMP_DEFAULT_DEVICE;
		
		//test data for nthreads_var
		this.nthreads_var = new ArrayList<Integer>();
		this.nthreads_var.add(Runtime.getRuntime().availableProcessors());
		this.nthreads_var.add(4);
		this.nthreads_var.add(3);
		this.nthreads_var.add(2);
		this.nthreads_var.add(1);
		
	}
	
	public InternalControlVariables(InternalControlVariables icv){
		
		//value copy
		this.dyn_var = icv.dyn_var;
		this.nest_var = icv.nest_var;
		this.nthreads_var = icv.nthreads_var;
		this.run_sched_var = icv.run_sched_var;
		this.def_sched_var = icv.def_sched_var;
	    this.bind_var = icv.bind_var;
		this.stacksize_var = icv.stacksize_var;
		this.wait_policy_var = icv.wait_policy_var;
		this.thread_limit_var = icv.thread_limit_var;
		this.max_active_levels_var = icv.max_active_levels_var;
		this.active_levels_var = icv.active_levels_var;
		this.levels_var = icv.levels_var;
		this.place_partition_var = icv.place_partition_var;
		this.cancel_var = icv.cancel_var;
		this.default_device_var = icv.default_device_var;
		
		//references redefine
		this.OMP_CurrentParallelRegionCancellationFlag =  icv.OMP_CurrentParallelRegionCancellationFlag;
		this.OMP_CurrentWorksharingRegionCancellationFlag = icv.OMP_CurrentParallelRegionCancellationFlag;
		this.OMP_CurrentParallelRegionBarrier = icv.OMP_CurrentParallelRegionBarrier;
		this.OMP_loopCursor = icv.OMP_loopCursor;
		this.OMP_orderCursor = icv.OMP_orderCursor;
		
	}
	
	/**XING ICVs (Internal Control Variables) definition END*/
}
