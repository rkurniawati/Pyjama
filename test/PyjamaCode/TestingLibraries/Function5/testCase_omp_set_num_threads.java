package PyjamaCode.TestingLibraries.Function5;

import pj.Pyjama;

public class testCase_omp_set_num_threads{
	public int parallel_omp_set_num_threads(int threadNumber){	
		Pyjama.omp_set_num_threads(threadNumber);
		
		int thread=0;
		//#omp parallel shared(thread)
		{
			thread++;
		}
		return thread;
	}	
	
}
