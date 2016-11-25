package PyjamaCode.TestingClauses.Reduction;
import pj.Pyjama;
public class reduction_positive_test1{
	public int parallel_for_reduction(int threadNumber,int n){		
		Pyjama.omp_set_num_threads(threadNumber);
		int sum = 0;

		//#omp parallel for shared(n) reduction(+:sum)
		for(int i = 1; i <= n; i++){
			sum=sum+i;
		}	
		return sum;
	}

	public int parallel_reduction(int threadNumber){		
		Pyjama.omp_set_num_threads(threadNumber);
		int sum = 0;

		//#omp parallel reduction(+:sum)
		{			
			sum+=1;
		}	
		return sum;
	}

	public int parallel_sections_reduction(int threadNumber){		
		Pyjama.omp_set_num_threads(threadNumber);
		int sum = 0;

		//#omp parallel sections reduction(+:sum)
		{			
			//#omp section
			{
				sum = sum + 1;
			}
			//#omp section
			{
				sum = sum + 1;
			}
			
		}	
		return sum;
	}
	
}
