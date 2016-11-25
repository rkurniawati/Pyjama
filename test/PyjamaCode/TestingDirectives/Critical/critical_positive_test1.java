package PyjamaCode.TestingDirectives.Critical;

import pj.Pyjama;

public class critical_positive_test1 {

	public int parallel_critical(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);

		//initial value
		int counter = 0;

		//#omp parallel shared(counter)
		{
			//#omp critical
			{
				counter = counter + 1;
			}
		}
		return counter;
	}
}
