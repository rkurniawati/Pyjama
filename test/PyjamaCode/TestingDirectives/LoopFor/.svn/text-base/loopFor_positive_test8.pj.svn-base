package PyjamaCode.TestingDirectives.LoopFor;
import pj.Pyjama;
public class loopFor_positive_test8 {
	/**
	 * loopFor initialization
	 * */
	public int[] parallel_loopFor(int threadCount) {
		Pyjama.omp_set_num_threads(threadCount);
		int[] array = new int[1000];

		//#omp parallel for shared(array)
		for (int i = 50/49+50; i < (50*4); i++) {
			array[i]=i;
		}

		return array;
	}

}
