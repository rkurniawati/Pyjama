package PyjamaCode.TestingDirectives.Master;

import pj.Pyjama;

public class master_positive_test1{
	public int[] parallel_master(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
	
		int[] array = new int[threadNumber];
		
		//#omp parallel shared(array)
		{
			int threadID = Pyjama.omp_get_thread_num();
			
			//#omp master
			{
				array[threadID]=1;	
			}				
		}
		return array;
	}

}
