package PyjamaCode.TestingDirectives.LoopFor;
import pj.Pyjama;
public class loopFor_positive_test5 {
	/**
	 * loopFor initialization
	 * */
	public int[] parallel_loopFor(int threadCount) {
		Pyjama.omp_set_num_threads(threadCount);
		int[] array = new int[1000];

		//#omp parallel for shared(array)
		for (int i = 100>50?100:0; i < (100<50?0:100); i++) {
			array[i]=i;
		}

		return array;
	}

}
