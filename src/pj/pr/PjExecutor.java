package pj.pr;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class PjExecutor {
	
	public PjExecutor() {
		
	}

	public static void submit(Callable<ConcurrentHashMap<String,Object>> task){
		Runnable runnableTask = getRunnable(task);
		Thread workerThread = new Thread(runnableTask);
		workerThread.start();
	}
	
	private static Runnable getRunnable(final Callable<ConcurrentHashMap<String,Object>> callable) {
	      return new Runnable() {
	         @Override
	         public void run() {
	            try {
	               callable.call();
	            } catch (Exception e) {
	               throw new RuntimeException(e);
	            }
	         }
	      };
	   }
}