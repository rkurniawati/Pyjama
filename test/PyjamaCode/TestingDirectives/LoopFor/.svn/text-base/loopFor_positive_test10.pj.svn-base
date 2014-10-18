package PyjamaCode.TestingDirectives.LoopFor;
import pj.Pyjama;
public class loopFor_positive_test10 {
	/**
	 * loopFor accumulator
	 * */
	public int[] parallel_loopFor(int threadCount) {
		Pyjama.omp_set_num_threads(threadCount);
		int[] array = new int[1000];

		//#omp parallel for shared(array)
		for (int i = 0; i < 100; ++i) {
			array[i]=i;
		}

		return array;
	}

}
