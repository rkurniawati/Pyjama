package PyjamaCode.TestingDirectives.Single;
import pj.*;
public class single_positive_test1 {
	/**
	 * Nomater how many thread works, only one thread works in single section.
	 * */
	public int[] parallel_single(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		int[] array = new int[threadNumber];

		//#omp parallel shared(array)
		{
			//#omp single
			{
				int index = Pyjama.omp_get_thread_num();
				array[index] = 1;
			}
		}
		return array;
	}

}
