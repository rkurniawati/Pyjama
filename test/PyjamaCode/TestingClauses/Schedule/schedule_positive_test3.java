package PyjamaCode.TestingClauses.Schedule;
import pj.Pyjama;
public class schedule_positive_test3 {

	public int[] parallel_for_schedule(int threadNumber, int arraySize) {
		Pyjama.omp_set_num_threads(threadNumber);

		int[] array = new int[threadNumber];

		//#omp parallel for shared(array, arraySize) schedule(guided)
		for (int i = 0; i < arraySize; i++) {
			int threadId = Pyjama.omp_get_thread_num();
			//#omp critical
			{
				array[0] += 1;
			}
		}

		return array;
	}

	public int[] parallel_for_schedule(int threadNumber, int arraySize,
			int chunkSize) {
		Pyjama.omp_set_num_threads(threadNumber);

		int[] array = new int[threadNumber];

		//#omp parallel for shared(array, arraySize) private(chunkSize) schedule(guided,chunkSize)
		for (int i = 0; i < arraySize; i++) {
			int threadId = Pyjama.omp_get_thread_num();
			//#omp critical
			{
				array[0] += 1;
			}
		}

		return array;
	}

}
