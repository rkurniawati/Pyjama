package PyjamaCode.TestingClauses.Reduction;
import pj.Pyjama;
public class reduction_negative_test1{
	
	public int parallel_for_reduction(int threadNumber){		
		Pyjama.omp_set_num_threads(threadNumber);
		byte result = 0;

		//#omp parallel for reduction(&:sum)
		for(int i = 0; i < 10; i++){
			result=result & 1;
		}	
		return sum;
	}
	
}
