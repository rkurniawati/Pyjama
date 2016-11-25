package PyjamaCode.TestingDirectives.Sections;
import pj.Pyjama;
public class section_positive_test2 {

	/**
	 * return 3 because nomater how many threads are allowed there are only three section
	 * */
	public int[] parallel_sections(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		int[] array = new int[threadNumber];

		int index = 0;
		//#omp parallel sections shared(array, index)
		{
			//#omp section
			{
				index = Pyjama.omp_get_thread_num();
				array[index] += 1;
			}

			//#omp section
			{
				index = Pyjama.omp_get_thread_num();
				array[index] += 1;
			}

			//#omp section
			{
				index = Pyjama.omp_get_thread_num();
				array[index] += 1;
			}
		}

		return array;
	}

}
