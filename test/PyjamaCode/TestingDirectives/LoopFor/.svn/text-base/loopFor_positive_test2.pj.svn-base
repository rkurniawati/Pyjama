package PyjamaCode.TestingDirectives.LoopFor;
import pj.Pyjama;
public class loopFor_positive_test2 {
	/**
	 * 
	 * */
	public int[] parallel_loopFor(int threadCount, int InitialValue,
			int EndValue, int Stride) {
		Pyjama.omp_set_num_threads(threadCount);
		int[] array = new int[(Math.abs(InitialValue) + Math.abs(EndValue)) + 1];

		int startIndex = 0;
		if (InitialValue >= 0 && EndValue >= 0)
			startIndex = 0;
		if (InitialValue < 0 && EndValue >= 0)
			startIndex = Math.abs(InitialValue);
		if (InitialValue >= 0 && EndValue < 0)
			startIndex = Math.abs(EndValue);
		if (InitialValue < 0 && EndValue < 0)
			startIndex = Math.max(Math.abs(InitialValue), Math.abs(EndValue));

		//#omp parallel for shared(array, InitialValue, EndValue, Stride, startIndex)
		for (int i = InitialValue; i >= EndValue; i = i + Stride) {
			array[startIndex + i] = i;
		}

		return array;
	}

}
