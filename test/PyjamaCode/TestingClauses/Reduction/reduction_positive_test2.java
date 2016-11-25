package PyjamaCode.TestingClauses.Reduction;
import pj.Pyjama;
public class reduction_positive_test2 {

	public int parallel_for_reduction(int threadNumber, int n) {
		Pyjama.omp_set_num_threads(threadNumber);
		int val = 0;

		//#omp parallel for shared(n) reduction(-:val)
		for (int i = 0; i < n; i++) {
			val++;
		}
		return val;
	}

	public int parallel_reduction(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		int val = 0;

		//#omp parallel reduction(-:val)
		{
			val++;
		}
		return val;
	}

	public int parallel_sections_reduction(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		int val = 0;

		//#omp parallel sections reduction(-:val)
		{
			//#omp section
			{
				val++;
			}
			//#omp section
			{
				val++;
			}
		}
		return val;
	}

}
