package PyjamaCode.TestingDirectives.LoopFor;
import pj.Pyjama;
public class loopFor_RT{
	public long[] parallel_for(int threadNumber,int n){
		Pyjama.omp_set_num_threads(threadNumber);
		long[] RT = new long[2];
		int[] array = new int[n];
	
		RT[0] = System.currentTimeMillis();	
		//#omp parallel for shared(array, n)
		for(int i = 0; i <n; i++){
			array[i]=i;
		}
		RT[1] = System.currentTimeMillis();

		return RT;
	}
}
