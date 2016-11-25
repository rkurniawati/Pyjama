package PyjamaCode.TestingDirectives.FreeguiThread;

import javax.swing.SwingUtilities;
import pj.*;

/**
* Test the explicit and implicit barrier
*/

public class FreeGuiThread_positive_test3 {
	private StringBuffer sb=new StringBuffer();
    
	public String positive_test3(int threadNumber) {
		Pyjama.omp_set_num_threads(threadNumber);
	    try {
			SwingUtilities.invokeAndWait(simulateEDT);
		} catch(Exception e) {
			e.printStackTrace();
		}
		try{
			Thread.sleep(1000);
    	    } catch(Exception e){
				e.printStackTrace();
    		}
		return sb.toString();
	}

	final Runnable simulateEDT = new Runnable( ) {
		public void run() {
		//#omp freeguithread parallel
		{
			sb.append("A");
//			try{
//			Thread.sleep(1000);
//    	    } catch(Exception e){
//				e.printStackTrace();
//    		}
			//#omp barrier
			sb.append("B");
		}
		sb.append("C");
		 }
	  };
	}
