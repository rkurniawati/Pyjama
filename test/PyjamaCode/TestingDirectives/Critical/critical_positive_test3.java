package PyjamaCode.TestingDirectives.Critical;

import pj.Pyjama;

public class critical_positive_test3 {

	public int parallel_critical(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);

		// initial value
		int counter = 1;

		//#omp parallel shared(counter)
		{
			//#omp critical
			{
				counter = counter * 2;
			}
		}
		return counter;
	}
}
