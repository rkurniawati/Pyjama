package PyjamaCode.TestingClauses.Reduction;
import pj.Pyjama;
public class reduction_positive_test3{
	
	public int parallel_for_reduction(int threadNumber,int n){		
		Pyjama.omp_set_num_threads(threadNumber);
		int val = 1;

		//#omp parallel for shared(n) reduction(*:val)
		for(int i = 0; i < n; i++){
			val=val*2;
		}	
		return val;
	}

	public int parallel_reduction(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		int val = 1;

		//#omp parallel reduction(*:val)
		{
			val *= 2;
		}
		return val;
	}

	public int parallel_sections_reduction(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		int val = 1;

		//#omp parallel sections reduction(*:val)
		{
			//#omp section
			{
				val = val * 2;
			}
			//#omp section
			{
				val = val * 2;
			}
		}
		return val;
	}
	
}
