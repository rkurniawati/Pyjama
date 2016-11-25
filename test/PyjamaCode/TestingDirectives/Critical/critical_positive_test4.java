package PyjamaCode.TestingDirectives.Critical;

import pj.Pyjama;

public class critical_positive_test4 {

	public int parallel_for_critical(int threadNumber, int Number) {
		Pyjama.omp_set_num_threads(threadNumber);

		// initial value
		int[] array = new int[Number+1];
		for (int i = 0; i <= Number; i++)
			array[i] = i;
		int[] max = new int[]{array[0]};
		
		//#omp parallel for shared(max,array, Number)
		for (int i = 1; i <= Number; i++) {
			if (array[i] > max[0]) {
				//#omp critical
				{
					// compare array[i] and max again because max
					// could have been changed by another thread after
					// the comparison outside the critical section
					if (array[i] > max[0])
						max[0] = array[i];
				}
			}
		}
		return max[0];
	}
}
