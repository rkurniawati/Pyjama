package PyjamaCode.TestingClauses.Schedule;
import pj.Pyjama;
public class schedule_negative_test3{

	public int[] parallel_for_schedule(int threadNumber,int arraySize){
		Pyjama.omp_set_num_threads(threadNumber);
		
		int[] array = new int[threadNumber];
		int threadId=0;

		//#omp parallel schedule(guided)
		{
			threadId=Pyjama.omp_get_thread_num();
			//#omp for schedule(guided)
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

		//#omp parallel schedule(guided)
		{
			threadId=Pyjama.omp_get_thread_num();
			//#omp for schedule(guided,chunkSize)
			for (int i = 0; i < arraySize; i++) {
				array[threadId]+=1;
			}
		}
		return array;
	}
	
}
