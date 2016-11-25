package PyjamaCode.TestingLibraries.Function4;

import pj.Pyjama;

public class testCase_omp_get_thread_num{
	public int[] parallel_omp_get_thread_num(int threadNumber){	
		Pyjama.omp_set_num_threads(threadNumber);
		
		int[] thread = new int[threadNumber];
		//#omp parallel shared(thread)
		{
			int index = Pyjama.omp_get_thread_num();
			thread[index]=index;
		}
		return thread;
	}	
	
}
