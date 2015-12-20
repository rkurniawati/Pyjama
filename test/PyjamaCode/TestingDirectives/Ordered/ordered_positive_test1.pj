package PyjamaCode.TestingDirectives.Ordered;

import pj.Pyjama;

public class ordered_positive_test1{
	
	public int[] parallel_ordered(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		
		int[] array = new int[threadNumber];
		int[] counter=new int[1];
		counter[0]=0;
		//#omp parallel for shared(array, counter, threadNumber) 
		for (int i=0; i<threadNumber; i++)
		{
			//#omp ordered
			{
				int index = Pyjama.omp_get_thread_num();
				//#omp critical
				{
				array[index]=counter[0]++;
				 System.out.println("array["+index+"}="+array[index]+"---order"+PjRuntime.get_OMP_orderCursor().get()+"/"+OMP_local_iterator);
				}
			}
		}
		return array;
	}
}
