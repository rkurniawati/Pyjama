package PyjamaCode.TestingDirectives.Parallel;

import pj.Pyjama;

public class parallel_positive_test3{

	/**
	 * Initialise array varible outside parallel region
	 * */
	public int parallel_region_increment_array(int threadNumber){
		
		Pyjama.omp_set_num_threads(threadNumber);
		
		int[] counter = new int[1];
		counter[0] = 0;
	
		//#omp parallel shared(counter)
		{
			counter[0]++;
		}
		return counter[0];
	}

}
