package PyjamaCode.TestingClauses.Reduction;

/**
 * 0^0=0
 * 0^1=1
 * 1^0=1
 * 1^1=0
 * */
public class reduction_positive_test6{
	
	/**
	 * return 10-1
	 * */
	public int parallel_for_reduction(int threadNumber,int n){		
		Pyjama.omp_set_num_threads(threadNumber);
		int result = 1;

		//#omp parallel for reduction(^:result) shared(n)
		for(int i = 1; i <= n; i++){
			result ^= (int)Math.pow(2, i)-1;
		}	
		return result;
	}
	
	public int parallel_reduction(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		int result = 1;

		//#omp parallel reduction(^:result)
		{
			int index = Pyjama.omp_get_thread_num();
			result ^= (int)Math.pow(2, index)-1;
		}
		return result;
	}

	public int parallel_sections_reduction(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		int result = 1;

		//#omp parallel sections reduction(^:result) 
		{
			//#omp section
			{
				int index = Pyjama.omp_get_thread_num();
				result ^= (int)Math.pow(2, index)-1;
			}
			//#omp section
			{
				int index = Pyjama.omp_get_thread_num();
				result ^= (int)Math.pow(2, index)-1;
			}
		}
		return result;
	}
}
