package PyjamaCode.TestingClauses.Shared;

import pj.Pyjama;

public class shared_positive_test2{

	/**
	 * n is shared among all threads in a team, thus no mather how many thread it used, 
	 * the n should be increased. the array shoud be natual array. 
	 * */
	public int[] parallel_for_shared(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		int n=0;
		
		int[] array = new int[threadNumber];

		//#omp parallel for shared(array,n,threadNumber)
		for (int i=0; i<threadNumber; i++){
			//#omp ordered
			{
				array[i] = n;
				//#omp critical
				{					
					n++;
				}
			}
		} /*-- End of parallel for --*/
		
		return array;
	}
	
}
