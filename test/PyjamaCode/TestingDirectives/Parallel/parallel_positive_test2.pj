package PyjamaCode.TestingDirectives.Parallel;

import pj.Pyjama;

public class parallel_positive_test2{

	/**
	 * Initialise varible outside parallel region
	 * */
	public int parallel_region_increment(int threadNumber){
		
		Pyjama.omp_set_num_threads(threadNumber);
		
		int counter = 0;
	
		//#omp parallel shared(counter)
		{
			counter++;
		}
		return counter;
	}

}
