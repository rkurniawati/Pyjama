package pj.pr.target;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class TargetTask implements Callable<ConcurrentHashMap<String,Object>>{
	
	
	public void submitTo(String targetName) {
		
	}
	public void submitTo(TargetExecutor target){
		
	}
	public void getResult(){
		
	}

	public ConcurrentHashMap<String, Object> call() throws Exception { return null;}
}
