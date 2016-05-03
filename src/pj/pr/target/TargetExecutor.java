package pj.pr.target;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class TargetExecutor extends VirtualTarget{

	private final int maxWorkerCount;
	private final ConcurrentLinkedDeque<TargetWorkerThread> workers = new ConcurrentLinkedDeque<TargetWorkerThread>();
	private BlockingQueue<TargetTask<?>> taskQueue = new LinkedBlockingDeque<TargetTask<?>>();
	
	public TargetExecutor(String name) {
		//set default worker number as corenum-1;
		this.maxWorkerCount = Runtime.getRuntime().availableProcessors() - 1;
		this.targetName = name;
	}
	
	public TargetExecutor(String name, int workerNumLimit) {
		this.maxWorkerCount = workerNumLimit;
		this.targetName = name;
	}
	
	
	public String getTargetName() {
		return this.targetName;
	}
	
	protected TargetTask<?> getTask() {
		try {
			return this.taskQueue.poll(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void submit(TargetTask<?> task) {
		 if (task == null) {
			 throw new NullPointerException("Submitted task is null.");
		 }
		 task.setCaller(this);
	        /*
	         * Proceed in 3 steps:
	         *
	         * 1. If this is the first task sending to the executor, there is no worker thread available.
	         * 	  Then create a working thread to execute this.
	         * 2. If currently the number of worker is smaller that worker number limit, create another new worker.
	         * 3. If currently the number of worker reaches the max number, the offer the task to the task queue.
	         */
		 
		 int workerNum = this.workerCount();
		 if (workerNum < maxWorkerCount) {
		 	createWorker(task);
		 } else {
		 	this.taskQueue.offer(task);
		 }
	}
	
	public void removeWorker(TargetWorkerThread worker) {
		this.workers.remove(worker);
	}
	
	private int workerCount() {
		return this.workers.size();
	}

	private void createWorker(TargetTask<?> task) {
		TargetWorkerThread worker = new TargetWorkerThread(this, task);
		workers.add(worker);
		worker.start();
	}
	
		
}
