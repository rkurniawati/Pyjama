package PyjamaCode.TestingDirectives.Ordered;

import pj.Pyjama;

public class ordered_positive_test1{
	
	public int[] parallel_ordered(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		
		int[] array = new int[threadNumber];
		int counter=0;
		//#omp parallel 
		{
			//#omp ordered
				int index = Pyjama.omp_get_thread_num();
				array[index]=counter++;
		}
		return array;
	}
}
