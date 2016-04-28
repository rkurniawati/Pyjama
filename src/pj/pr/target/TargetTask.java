package pj.pr.target;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public abstract class TargetTask<T> implements Callable<ConcurrentHashMap<String,Object>>{
	private TargetExecutor caller = null;
	private CallbackInfo callWhenFinish;
	private volatile boolean isFinished = false;
	private T result;
	
	class CallbackInfo {
		TargetTask<?> callback;
		TargetExecutor caller;
		CallbackInfo(TargetTask<?> t, TargetExecutor e) {
			this.callback = t;
			this.caller = e;
		}
		void trigger() {
			this.caller.submit(callback);
		}
	}
	
	public abstract ConcurrentHashMap<String, Object> call() throws Exception;
	
	public void setCaller(TargetExecutor targetExecutor) {
		this.caller = targetExecutor;
	}
	
	public TargetExecutor getCaller() {
		return this.caller;
	}
	
	public Object getResult(String varName){
		return null;
	}
	
	public T getResult(){
		return this.result;
	}
		
	public boolean isFinished() {
		return this.isFinished;
	}

	public void setOnCompleteCall(TargetTask<?> finishtask, TargetExecutor whocall) {
		this.callWhenFinish = new CallbackInfo(finishtask, whocall);
		if (this.isFinished) {
			this.callWhenFinish.trigger();
		}
	}
	
	public void run(){
		try {
			this.call();
			this.isFinished = true;
			if (null != this.callWhenFinish) {
				this.callWhenFinish.trigger();
			}
		} catch (Exception e) {
			//TODO: Pyjama support for the Exception handling in the midway of target block 
			e.printStackTrace();
		}

	}
	
}
