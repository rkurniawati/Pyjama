package PyjamaCode.TestingClauses.FirstPrivate;

import pj.Pyjama;

public class firstPrivate_positive_test2{

	public int[] parallel_for_firstPrivate(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		int i = threadNumber;
		int[] array = new int[threadNumber];

		//#omp parallel shared(i, array)
		{
			//#omp for schedule(static) firstprivate(i)
			for (int j = 0; j < 10; j++) {
				int index = Pyjama.omp_get_thread_num();
				array[index]=i;
			}
			i++;
		}
		return array;
	}
	
}
