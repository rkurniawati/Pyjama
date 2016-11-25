package PyjamaCode.TestingClauses.LastPrivate;

import pj.Pyjama;

/**
 * The LASTPRIVATE clause combines the behavior of the PRIVATE clause with a
 * copy from the last loop iteration or section to the original variable object.
 * */
public class lastPrivate_positive_test2 {

	/**
	 * Because the thread threadNumber is the last thread which running in the
	 * parallel region, its value should copy into the master thread and return
	 * threadNumber
	 * */
	public int parallel_for_lastPrivate(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		int i = -1;

		//#omp parallel shared(i, threadNumber)
		{
			//#omp for schedule(static) lastprivate(i)
			for (int j = 0; j < 10; j++) {
				i++;
				int index = Pyjama.omp_get_thread_num();
				if (index == threadNumber) {
					try {
						Thread.sleep(500);
						i = threadNumber;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

		return i;
	}

}
