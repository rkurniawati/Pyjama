package pj.pr;

import pj.PjRuntime;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class PjExecutor {
	
	public static void submit(int id, Callable<ConcurrentHashMap<String,Object>> task, InternalControlVariables parent_icv){
		PjWorkerThread workerThread = new PjWorkerThread(id, task, parent_icv);
		workerThread.start();
	}

	public static void cancelCurrentThreadGroup() {
		InternalControlVariables icv = PjRuntime.threadICVMap.get(Thread.currentThread().getId());
		if (null == icv.OMP_CurrentParallelRegionCancellationFlag) {
			throw new RuntimeException("Pyjama: Cannot find cancellation flag in current parallel region");
		}
		else {
			icv.OMP_CurrentParallelRegionCancellationFlag.set(true);
		}
	}
}