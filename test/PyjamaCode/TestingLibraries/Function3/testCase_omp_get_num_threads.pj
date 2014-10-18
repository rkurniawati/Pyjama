package PyjamaCode.TestingLibraries.Function3;

import pj.Pyjama;

public class testCase_omp_get_num_threads{
	
	public int omp_get_num_threads(int threadNumber){	
		Pyjama.omp_set_num_threads(threadNumber);
		int n=0;
		//#omp parallel shared(n)
		{
			n=Pyjama.omp_get_num_threads();
		}
		return n;
	}	
	
}
