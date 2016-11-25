package PyjamaCode.TestingDirectives.LoopFor;

public class loopFor_negative_test3 {
	/**
	 * loopFor exprepression
	 * */
	public int[] parallel_loopFor(int threadCount) {
		Pyjama.omp_set_num_threads(threadCount);
		int[] array = new int[1000];

		//#omp parallel for shared(array)
		for (int i = 0; i > 100 && false; i++) {
			array[i]=i;
		}

		return array;
	}

}
