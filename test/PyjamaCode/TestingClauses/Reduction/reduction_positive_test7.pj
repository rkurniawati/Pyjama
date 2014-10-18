package PyjamaCode.TestingClauses.Reduction;
import pj.Pyjama;
/**
 * False && False = False
 * True && True = True
 * False && True = False
 * True && False = False
 * */
public class reduction_positive_test7{
	
	/**
	 * return False
	 * */
	public boolean parallel_for_reduction(int threadNumber,int n){		
		Pyjama.omp_set_num_threads(threadNumber);
		boolean result = true;

		//#omp parallel for shared(n) reduction(&&:result)
		for(int i = 1; i <= n; i++){
			result = result && false;
		}	
		return result;
	}

	public boolean parallel_reduction(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		boolean result = true;

		//#omp parallel reduction(&&:result)
		{
			result = result && false;
		}
		return result;
	}

	public boolean parallel_sections_reduction(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		boolean result = true;

		//#omp parallel sections reduction(&&:result)
		{
			//#omp section
			{
				result = result && false;
			}
			//#omp section
			{
				result = result && false;
			}
		}
		return result;
	}
	
}
