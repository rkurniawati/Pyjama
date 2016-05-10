/*
 * Copyright (C) 2013-2016 Parallel and Reconfigurable Computing Group, University of Auckland.
 *
 * Authors: <http://homepages.engineering.auckland.ac.nz/~parallel/ParallelIT/People.html>
 * 
 * This file is part of Pyjama, a Java implementation of OpenMP-like directive-based 
 * parallelisation compiler and its runtime routines.
 *
 * Pyjama is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Pyjama is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Pyjama. If not, see <http://www.gnu.org/licenses/>.
 */

package pj.pr.target;

import java.util.concurrent.Callable;

public abstract class TargetTask<T> implements Callable<T>{
	private VirtualTarget caller = null;
	private CallbackInfo callWhenFinish;
	private volatile boolean isFinished = false;
	private T result;
	
	class CallbackInfo {
		TargetTask<?> callback;
		VirtualTarget caller;
		CallbackInfo(TargetTask<?> t, VirtualTarget e) {
			this.callback = t;
			this.caller = e;
		}
		void trigger() {
			this.caller.submit(callback);
		}
	}
	
	public abstract T call() throws Exception;
	
	public void setCaller(VirtualTarget target) {
		this.caller = target;
	}
	
	public VirtualTarget getCaller() {
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
	
	public void setFinish() {
		this.isFinished = true;
	}

	public void setOnCompleteCall(TargetTask<?> finishtask, VirtualTarget whocall) {
		this.callWhenFinish = new CallbackInfo(finishtask, whocall);
		if (this.isFinished) {
			CallbackInfo callNow = this.callWhenFinish;
			this.callWhenFinish = null;
			callNow.trigger();
		}
	}
	
	public void run(){
		try {
			this.call();
			this.isFinished = true;
			if (null != this.callWhenFinish) {
				CallbackInfo callNow = this.callWhenFinish;
				this.callWhenFinish = null;
				callNow.trigger();
			}
		} catch (Exception e) {
			//TODO: Pyjama support for the Exception handling in the midway of target block 
			e.printStackTrace();
		}

	}
	
}
