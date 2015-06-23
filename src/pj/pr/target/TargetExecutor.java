package pj.pr.target;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;


public class TargetExecutor {

	private final ConcurrentLinkedDeque<WorkerThread> workers = new ConcurrentLinkedDeque<WorkerThread>();
	private BlockingQueue<TargetTask> taskQueue;
	
	class WorkerThread extends Thread {
		
		TargetTask firstTask = null;
		
		public WorkerThread(TargetTask firstTask) {
			this.firstTask = firstTask;
		}
		
		@Override
		public void run() {
			TargetTask task = firstTask;
	        this.firstTask = null;
	        while (task != null || (task = getTask()) != null) {
	        	try {
	        		Throwable thrown = null;
	                try {
	                	task.call();
	                } catch (RuntimeException x) {
	                	thrown = x; throw x;
	                } catch (Error x) {
	                	thrown = x; throw x;
	                } catch (Throwable x) {
	                	thrown = x; 
	                	throw new Error(x);
	                }
	        	} finally {
	        		task = null;
	            }
	        }
		}
	}
		
	private TargetTask getTask() {
		return null;
	}
	
	public void submit(TargetTask task) {
		 if (task == null) {
			 throw new NullPointerException();
		 }
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
		WorkerThread worker = new WorkerThread(task);
		workers.add(worker);
		worker.start();
	}
	
}
