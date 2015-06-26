package asyncTest;

import java.util.concurrent.ConcurrentHashMap;

import pj.PjRuntime;
import squares.SqureIn;

public class AsyncConversion {
	public void asyncMethod(int a) {
		System.out.println("Stage 1");
		//#omp target virtual(worker) await //this is async
		{
			firstAwaitMethod();
		}
		System.out.println("Stage 2");
		//#omp target virtual(worker) await //this is async
		{
			secondAwaitMethod();
		}
		System.out.println("Stage 3");
	}
	


	class asyncMethod extends pj.pr.target.TargetTask{
		
		asyncMethod(int a) {
			
		}
		
		class _OMP_TargetTaskRegion_0 extends pj.pr.target.TargetTask{
			public ConcurrentHashMap<String,Object> call() {
				System.out.println("Stage 1");
				return null;
			}
			
		}
		class _OMP_TargetTaskRegion_1 extends pj.pr.target.TargetTask{
			public ConcurrentHashMap<String,Object> call() {
				System.out.println("Stage 1");
				return null;
			}
			
		}
		int state;
		
		@Override
		public ConcurrentHashMap<String,Object> call() {
			switch(state) {
			case 1:
				System.out.println("Stage 1");
				 _OMP_TargetTaskRegion_0 _OMP_TargetTaskRegion_0_in = new _OMP_TargetTaskRegion_0();
				 _OMP_TargetTaskRegion_0_in.setCallbackWhenFinish(this, this.getCaller());
				 PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_0_in);
				 //check if target task has been finished immediately 
				 if (false == PjRuntime.checkFinish(_OMP_TargetTaskRegion_0_in))  {
					 this.state++;
					 return null;
				 }
				 this.state++;
			case 2:
				System.out.println("Stage 2");
				 _OMP_TargetTaskRegion_1 _OMP_TargetTaskRegion_1_in = new _OMP_TargetTaskRegion_1();
				 PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_1_in);
				 //check if target task has been finished immediately 
				 if (false == PjRuntime.checkFinish(_OMP_TargetTaskRegion_1_in))  {
					 this.state++;
					 PjRuntime.submitTask(Thread.currentThread(), "worker",this);
					 return null;
				 }
			case 3:
				System.out.println("Stage 3");
			default:
					
			}
			return null;
		}
	}
	
	public void asyncCaller() {
		//do sth
		System.out.println("Computing");
		//if in a target virtual block, a method is called, check if this method has async property.
		//#omp target virtual(worker) waitas(asyncWaiter)
		{
			pj.pr.target.TargetTask a;
			Class<?> statemachineClass = null;
			try {
				statemachineClass = Class.forName("");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (null != statemachineClass) {
				
			}
			asyncMethod(1);
		}
		//do sth
		System.out.println("Computing");
		//#omp wait (asyncWaiter)
		System.out.println("Final Computing");
	}
	
	public void normalCaller() {
		//do sth
		System.out.println("Computing");
		
		{
			asyncMethod(1);
		}
		
		System.out.println("Computing");
		//#omp wait (asyncWaiter)
		System.out.println("Final Computing");
	}
	
	
	
	
	private void secondAwaitMethod() {
		// TODO Auto-generated method stub
		
	}

	private void firstAwaitMethod() {
		// TODO Auto-generated method stub
		
	}
	
	public static void useSqure() {
		SqureIn s = new SqureIn();
		s.add(0, 0);
	}
	
	public static void main(String[] args) {
		Class<?> cls = null;
		try {
			cls = Class.forName("squares.SqureIn$add");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (null != cls) {
			System.out.println("find");
		} else {
			System.out.println("not find");
		}
	}
}
