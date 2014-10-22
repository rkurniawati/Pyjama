package PyjamaCode.TestingDirectives.Flush;

import pj.Pyjama;

public class flush_positive_test1{
	/**
	 *  return data should be 2
	 *  the parallel section running in disordered, the initial flag is 0; unless section 1 change flag,
	 *  section 2 would never running if flag is flsuhed by written back into memory. 
	 * */
	public int parallel_section_flush(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		
		int flag=0;
		int[] data = new int[]{0};

		//#omp parallel sections shared(data, flag)
		{
			//#omp section
			{
				data[0] = 1;
				//#omp flush
				
				flag = 1;
				//#omp flush
			}
			//#omp section
			{
				while (flag==0) {
					//#omp flush
				}
				//#omp flush
       
				//#omp critical
					data[0]++;
			}
		}
		return data[0];
	}
}
