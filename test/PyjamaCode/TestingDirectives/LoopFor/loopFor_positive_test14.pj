package PyjamaCode.TestingDirectives.LoopFor;
import pj.Pyjama;
public class loopFor_positive_test14 {
	/**
	 * loopFor accumulator
	 * */
	public int[] parallel_loopFor(int threadCount) {
		Pyjama.omp_set_num_threads(threadCount);
		int[] array = new int[1000];

		//#omp parallel for shared(array)
		for (int ben = 100; ben > 0; ben-=1) {
			array[ben]=ben;
		}

		return array;
	}

}
