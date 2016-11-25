package PyjamaCode.TestingDirectives.LoopFor;
import pj.Pyjama;
public class loopFor_positive_test6 {
	/**
	 * loopFor initialization
	 * */
	public int[] parallel_loopFor(int threadCount) {
		Pyjama.omp_set_num_threads(threadCount);
		int[] array = new int[1000];

		//#omp parallel for shared(array)
		for (int Oliver = 50-49; Oliver < (50+49); Oliver++) {
			array[Oliver]=Oliver;
		}

		return array;
	}

}
