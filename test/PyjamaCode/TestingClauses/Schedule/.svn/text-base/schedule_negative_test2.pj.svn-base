package PyjamaCode.TestingClauses.Schedule;
import pj.Pyjama;
public class schedule_negative_test2{

	public int[] parallel_for_schedule(int threadNumber,int arraySize){
		Pyjama.omp_set_num_threads(threadNumber);
		
		int[] array = new int[threadNumber];
		int threadId=0;

		//#omp parallel schedule(dynamic)
		{
			threadId=Pyjama.omp_get_thread_num();
			//#omp for schedule(dynamic)
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

		//#omp parallel schedule(dynamic,chunkSize)
		{
			threadId=Pyjama.omp_get_thread_num();
			//#omp for schedule(dynamic,chunkSize)
			for (int i = 0; i < arraySize; i++) {
				array[threadId]+=1;
			}
		}
		return array;
	}
	
}
