package PyjamaCode.TestingDirectives.LoopFor;

public class loopFor_negative_test8 {
	/**
	 * loopFor More
	 * */
	public int[] parallel_loopFor(int threadCount) {
		Pyjama.omp_set_num_threads(threadCount);
		int[] array = new int[1000];

		//#omp parallel for shared(array)
		for (int i = 0; i < Test.max(); i++) {
			array[i]=i;
		}

		return array;
	}
	
}

class Test() {
  public static int max() {
  	return Integer.MAX_VALUE;
  	}
  }
