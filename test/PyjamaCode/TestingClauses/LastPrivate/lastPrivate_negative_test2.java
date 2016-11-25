package PyjamaCode.TestingClauses.LastPrivate;

public class lastPrivate_negative_test2{

	public int parallel_lastPrivate(int threadNumber){
		Pyjama.omp_set_num_threads(threadNumber);
		int i = -1;

		//#omp parallel 
		{
			//#omp single lastprivate(i)
			i++;
		}
		
		return i;
	}
	
}
