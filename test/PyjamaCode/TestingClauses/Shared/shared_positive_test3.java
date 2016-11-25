package PyjamaCode.TestingClauses.Shared;

import pj.Pyjama;

public class shared_positive_test3{

	/**
	 * return 2
	 * */
	public int[] parallel_sections_shared(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		
		int[] array= new int[2];
		//#omp parallel shared(array)
		{
			//#omp sections
			{
				//#omp section
				{
					//#omp critical
					{
						array[0]=1;
					}	
				}
				//#omp section
				{
					//#omp critical
					{
						array[1]=1;
					}	
				}
			}
		}
		return array;
	}
	
}
