package PyjamaCode.PyjamaCode.TestingDirectives.Atomic;

import pj.Pyjama;

public class atomic_negative_test1{

	/**
	 * 
	 * */
	public int parallel_atomic(int threadNumber){	
		Pyjama.omp_set_num_threads(threadNumber);
		
		int counter = 0;
		//#omp parallel
		{
			//#omp atomic
			counter=counter+1;
		}
		return counter;
	}	
}
