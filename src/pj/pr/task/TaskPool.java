package pj.pr.task;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class TaskPool {
	private BlockingQueue<TargetTask<?>> taskQueue = new LinkedBlockingDeque<TargetTask<?>>();
	
	public void submit(TargetTask<?> task) {
		 if (task == null) {
			 throw new NullPointerException("Pyjama runtime error: Submitted task is null.");
		 }
		 this.taskQueue.offer(task);
	}
	
	private TargetTask<?> getTask() {
		try {
			return this.taskQueue.poll(50, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void executeTasks() {
		TargetTask<?> task = null;
        while ((task = this.getTask()) != null) {
        	try {
                task.run();
        	} finally {
        		task = null;
            }
        }
	}
	
	public boolean waitTillTaskPoolEmpty() {
		executeTasks();
		return taskQueue.isEmpty();
	}
	
	

}
