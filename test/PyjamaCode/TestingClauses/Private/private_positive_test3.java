package PyjamaCode.TestingClauses.Private;

import pj.Pyjama;

public class private_positive_test3{

	public int parallel_section_private(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		
		int i=-1;
		//#omp parallel shared(i)
		{
			//#omp sections private(i)
			{
				//#omp section
				{
					i++;
				}
				//#omp section
				{
					i++;
				}
			}			
		}
		return i;
	}
	
}
