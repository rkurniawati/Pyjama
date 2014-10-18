package PyjamaCode.TestingClauses.Schedule;
import pj.Pyjama;
public class schedule_RT{
	
	public long[] parallel_for_static (int threadNumber,int n){
		Pyjama.omp_set_num_threads(threadNumber);
		long[] RT = new long[2];
		int[] array = new int[n];
	
		RT[0] = System.currentTimeMillis();	
		//#omp parallel for schedule(static) shared(array, n)
		for(int i = 0; i <n; i++){
			array[i]=i;
		}
		RT[1] = System.currentTimeMillis();

		return RT;
	}

	public long[] parallel_for_dynamic (int threadNumber,int n){
		Pyjama.omp_set_num_threads(threadNumber);
		long[] RT = new long[2];
		int[] array = new int[n];
	
		RT[0] = System.currentTimeMillis();	
		//#omp parallel for schedule(dynamic) shared(array, n)
		for(int i = 0; i <n; i++){
			array[i]=i;
		}
		RT[1] = System.currentTimeMillis();

		return RT;
	}

	public long[] parallel_for_guided (int threadNumber,int n){
		Pyjama.omp_set_num_threads(threadNumber);
		long[] RT = new long[2];
		int[] array = new int[n];
	
		RT[0] = System.currentTimeMillis();	
		//#omp parallel for schedule(guided) shared(array, n)
		for(int i = 0; i <n; i++){
			array[i]=i;
		}
		RT[1] = System.currentTimeMillis();

		return RT;
	}
	
}
