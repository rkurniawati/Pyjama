package PyjamaCode.TestingDirectives.Atomic;

import pj.Pyjama;

public class atomic_positive_test3{

	/**
	 * 
	 * */
	public int parallel_atomic(int threadNumber){	
		Pyjama.omp_set_num_threads(threadNumber);
		
		int counter = threadNumber;
		//#omp parallel shared(counter)
		{
			//#omp atomic
			counter--;
		}
		return counter;
	}	
}
