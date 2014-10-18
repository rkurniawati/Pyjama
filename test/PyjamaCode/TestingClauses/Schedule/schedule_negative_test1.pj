package PyjamaCode.TestingClauses.Schedule;
import pj.Pyjama;
public class schedule_negative_test1{

	public int[] parallel_for_schedule(int threadNumber,int arraySize){
		Pyjama.omp_set_num_threads(threadNumber);
		
		int[] array = new int[threadNumber];
		int threadId=-1;

		//#omp parallel schedule(static)
		{
			threadId=Pyjama.omp_get_thread_num();
			//#omp for schedule(static)
			for (int i = 0; i < arraySize; i++) {
				array[threadId]+=1;
			}
		}
		return array;
	}

	public int[] parallel_for_schedule(int threadNumber, int arraySize, int chunkSize){
		Pyjama.omp_set_num_threads(threadNumber);
		
		int[] array = new int[threadNumber];
		int threadId=0;

		//#omp parallel schedule(static)
		{
			threadId=Pyjama.omp_get_thread_num();
			//#omp for schedule(static,chunkSize)
			for (int i = 0; i < arraySize; i++) {
				array[threadId]+=1;
			}
		}
		return array;
	}
	
}
