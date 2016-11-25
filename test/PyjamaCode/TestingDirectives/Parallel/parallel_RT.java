package PyjamaCode.TestingDirectives.Parallel;
import pj.Pyjama;

public class parallel_RT{
	
	public long[] parallel_region(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		long[] RT = new long[2];
		int[] array = new int[threadNumber];
	
		RT[0] = System.currentTimeMillis();	
		//#omp parallel shared(array)
		{
			int index = Pyjama.omp_get_thread_num();
			array[index]=index;
		}
		RT[1] = System.currentTimeMillis();

		return RT;
	}

	/**
	 * Initialise varible outside parallel region
	 * */
	public long[] parallel_region_increment(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		long[] RT = new long[2];
		int counter = 0;
	
		RT[0] = System.currentTimeMillis();
		//#omp parallel shared(counter)
		{
			counter++;
		}
		RT[1] = System.currentTimeMillis();

		return RT;
	}

	/**
	 * Initialise array varible outside parallel region
	 * */
	public long[] parallel_region_increment_array(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		long[] RT = new long[2];
		int[] counter = new int[1];
		counter[0] = 0;

		RT[0] = System.currentTimeMillis();
		//#omp parallel shared(counter)
		{
			counter[0]++;
		}
		RT[1] = System.currentTimeMillis();

		return RT;
	}
}
