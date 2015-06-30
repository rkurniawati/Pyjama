package pj.pr.target;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;


public class TargetExecutor {

	private String targetName = null;
	private final ConcurrentLinkedDeque<TargetWorkerThread> workers = new ConcurrentLinkedDeque<TargetWorkerThread>();
	private BlockingQueue<TargetTask> taskQueue = new  LinkedBlockingDeque<TargetTask>();
	
	public TargetExecutor(String name) {
		this.targetName = name;
	}
	
	
	public String getTargetName() {
		return this.targetName;
	}
	protected TargetTask getTask() {
		try {
			return this.taskQueue.poll(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void submit(TargetTask task) {
		 if (task == null) {
			 throw new NullPointerException();
		 }
		 task.setCaller(this);
	        /*
	         * Proceed in 3 steps:
	         *
	         * 1. If this is the first task sending to the executor, there is no worker thread available.
	         * 	  Then create a working thread to execute this.
	         * 2. 
	         */
		 
		 int workerNum = this.workerCount();
		 if (workerNum == 0) {
		 	createWorker(task);
		 } else {
		 	this.taskQueue.offer(task);
		 } 
	}
	
	private int workerCount() {
		return this.workers.size();
	}

	private void createWorker(TargetTask task) {
		// TODO 
		TargetWorkerThread worker = new TargetWorkerThread(this, task);
		workers.add(worker);
		worker.start();
	}
		
}
