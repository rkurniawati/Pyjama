package PyjamaCode.TestingDirectives.Atomic;

import pj.Pyjama;

public class atomic_natative_test4{

	/**
	 * In OpenMP The expression statement must have one of the following forms: x binop= expr
	 * In Pyjama x operator= expression belong to x=x operator expression, which should use 
	 * critical to implement parallel program
	 * */
	public int parallel_atomic(int threadNumber){	
		Pyjama.omp_set_num_threads(threadNumber);
		
		int counter = 0;
		//#omp parallel
		{
			//#omp atomic
			counter+=1;
		}
		return counter;
	}	
}
