package pj.pr.target;

public class TargetWorkerThread extends Thread {
	
	private TargetExecutor executor = null;
	private TargetTask firstTask = null;
	
	public TargetWorkerThread(TargetExecutor executor, TargetTask firstTask) {
		this.executor = executor;
		this.firstTask = firstTask;
	}
	
	@Override
	public void run() {
		TargetTask task = firstTask;
        this.firstTask = null;
        while (task != null || (task = executor.getTask()) != null) {
        	try {
        		Throwable thrown = null;
                try {
                	task.run();
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
        /*
         * remove this from executor's thread pool
         */
        this.executor.removeWorker(this);
	}
	
	public String targetName() {
		return this.executor.getTargetName();
	}
}
