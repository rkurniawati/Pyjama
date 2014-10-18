package PyjamaCode.TestingDirectives.Parallel;

import pj.Pyjama;

public class parallel_positive_test1{

	public int[] parallel_region(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		
		int[] array = new int[threadNumber];
	
		//#omp parallel shared(array)
		{
			int index = Pyjama.omp_get_thread_num();
			array[index]=index;
		}
		return array;
	}
	
}
