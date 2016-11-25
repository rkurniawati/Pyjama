package PyjamaCode.TestingClauses.Private;

import pj.Pyjama;

public class private_positive_test2{

	public int parallel_for_private(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		
		int shijun=-1;
		//#omp parallel  shared(shijun)
		{
			//#omp for schedule(static) private(shijun)
			for (int j = 0; j < 10; j++) {
				shijun++;
			}			
		}
		return shijun;
	}
	
}
