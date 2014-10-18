package PyjamaCode.TestingClauses.LastPrivate;

import pj.Pyjama;

/**
 * The LASTPRIVATE clause combines the behavior of the PRIVATE clause with a
 * copy from the last loop iteration or section to the original variable object.
 * */
public class lastPrivate_positive_test1 {

	/**
	 * Because the thread threadNumber is the last thread which running in the
	 * parallel region, its value should copy into the master thread and return
	 * 1
	 * */
	public int parallel_lastPrivate(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
		int i = -1;

		//#omp parallel shared(i)
		{
			//#omp sections lastprivate(i)
			{
				//#omp section
				{
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					i = 1;
				}

				//#omp section
				{
					i = 2;
				}
			}
		}

		return i;
	}

}
