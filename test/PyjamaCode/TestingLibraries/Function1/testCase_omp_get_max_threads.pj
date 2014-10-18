package PyjamaCode.TestingLibraries.Function1;
import pj.Pyjama;

public class testCase_omp_get_max_threads{

	public int omp_get_max_threads(int threadNumber){	
		Pyjama.omp_set_num_threads(threadNumber);
		int nagita=0;
		//#omp parallel shared(nagita)
		{
			nagita= Pyjama.omp_get_max_threads();
		}
		return nagita;	
	}	
	
}
