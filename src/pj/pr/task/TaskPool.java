package pj.pr.task;

import java.util.concurrent.ConcurrentLinkedQueue;

public class TaskPool {
	private ConcurrentLinkedQueue<TargetTask<?>> taskQueue = new ConcurrentLinkedQueue<TargetTask<?>>();
	
	public void submit(TargetTask<?> task) {
		 if (task == null) {
			 throw new NullPointerException("Pyjama runtime error: Submitted task is null.");
		 }
		 this.taskQueue.offer(task);
	}
	
	private TargetTask<?> getTask() {
		return this.taskQueue.poll();
	}
	
	public void executeTasks() {
		TargetTask<?> task = null;
        while ((task = this.getTask()) != null) {
        	task.run();	
        }
	}
	
	public void runTillTaskPoolEmpty() {
		if (taskQueue.isEmpty()) {
			return;
		} else {
			executeTasks();
		}
	}
	
	public void cancelAllTasks() {
		if (taskQueue.isEmpty()) {
			return;
		} else {
			for (TargetTask<?> task: this.taskQueue) {
				task.setCancel();
			}
			this.taskQueue.clear();
		}
	}

}
