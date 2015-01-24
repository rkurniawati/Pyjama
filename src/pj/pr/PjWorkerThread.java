package pj.pr;

import pj.PjRuntime;
import pj.pr.exceptions.OmpParallelRegionLocalCancellationException;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class PjWorkerThread extends Thread {
	private int alias_id;
	private Callable<ConcurrentHashMap<String,Object>> task;

	public PjWorkerThread(int id, Callable<ConcurrentHashMap<String,Object>> callable, InternalControlVariables parent_icv) {
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
