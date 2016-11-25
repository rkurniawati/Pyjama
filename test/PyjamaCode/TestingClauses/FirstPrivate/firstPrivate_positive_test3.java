package PyjamaCode.TestingClauses.FirstPrivate;

import pj.Pyjama;

public class firstPrivate_positive_test3{

	public int[] parallel_single_firstPrivate(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		int i = threadNumber;
		int[] array = new int[threadNumber];

		//#omp parallel shared(i, array)
		{
			//#omp single firstprivate(i) 
			{
				int index = Pyjama.omp_get_thread_num();
				array[index]=i;
				i=0;
			}
		}
		
		return array;
	}
	
}
