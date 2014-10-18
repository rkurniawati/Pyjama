package PyjamaCode.TestingClauses.Reduction;
import pj.Pyjama;
/**
 * False || False = False
 * True || True = True
 * False || True = True
 * True || False = True
 * */
public class reduction_positive_test8{
	
	/**
	 * return True
	 * */
	public boolean parallel_for_reduction(int threadNumber,int n){		
		Pyjama.omp_set_num_threads(threadNumber);
		boolean result = false;

		//#omp parallel for shared(n) reduction(||:result)
		for(int i = 1; i <= n; i++){
			result = result || true;
		}	
		return result;
	}
	
	public boolean parallel_reduction(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		boolean result = false;

		//#omp parallel reduction(||:result)
		{
			result = result || true;
		}
		return result;
	}

	public boolean parallel_sections_reduction(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		boolean result = false;

		//#omp parallel sections reduction(||:result)
		{
			//#omp section
			{
				result = result || true;
			}
			//#omp section
			{
				result = result || true;
			}
		}
		return result;
	}
}
