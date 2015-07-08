package utils;

public class SyncBench {
	
	static long innerreps = 0;
	static enum testType {PR, WS, BAR};
	static double targettesttime = 1000;  //mcro secs
	static int outerreps  = 20;
	static double delaylength = 0.1;
	
	public static void main(String[] s) {
		
	}
	public static void pr() {
		int j;
	    for (j = 0; j < innerreps; j++) {
	    	//#omp parallel
	    	{
	    		delay(delaylength);
	    	}
	    }
	}
	
	public static void ws() {
		 int j;
		 //#omp parallel private(j) 
		     {
		 	for (j = 0; j < innerreps; j++) {
		 //#omp for
		 	    for (int i = 0; i < nthreads; i++) {
		 		delay(delaylength);
		 	    }
		 	}
		     }
	}
	
	public static void bar() {
	    int j;
	    //#omp parallel private(j)
	    {
	    	for (j = 0; j < innerreps; j++) {
	    	    delay(delaylength);
	    	    //#omp barrier
	    	}
	    }
	}
	
	
	void benchmark(char name, SyncBench.testType type) {
	    int k;
	    double start;

	    // Calculate the required number of innerreps
	    innerreps = getinnerreps(type);

	    intitest(name);

	    for (k=0; k<=outerreps; k++) {
		start = System.nanoTime()/ 1000000000;
		switch(type) {
    	case PR:
    		pr();
    		break;
    	case WS:
    		ws();
    		break;
    	case BAR:
    		bar();
    		break;
    	default:		
    	}
		times[k] = (System.nanoTime()/ 1000000000 - start) * 1000000 / (double) innerreps;
	    }

	    finalisetest(name);

	}
	
	static long getinnerreps(SyncBench.testType type) {
	    long innerreps = 10L;  // some initial value
	    double time = 0.0;

	    while (time < targettesttime) {
	    	double start  = System.nanoTime()/ 1000000000;
	    	switch(type) {
	    	case PR:
	    		pr();
	    		break;
	    	case WS:
	    		ws();
	    		break;
	    	case BAR:
	    		bar();
	    		break;
	    	default:		
	    	}
	    	time = (System.nanoTime()/ 1000000000 - start) * 1000000;
	    	innerreps *=2;
	    	if (innerreps > (targettesttime*1.0e15)) {
	    	    throw new RuntimeException("wrong");
	    	}
	    }
		// Test to stop code if compiler is optimising reference time expressions away
		return innerreps;
	}
  


	static void delay(int delaylength) {
		int i;
		float a = 0;

		for (i = 0; i < delaylength; i++) {
			a += i;
			if (a < 0) {
				System.out.println( a);
			}
		}
	}
	
	static void printheader(String name) {
	    System.out.println();
	    System.out.println("--------------------------------------------------------\n");
	    System.out.println("Computing " + name  + " time using " + innerreps + " reps\n");
	}
	
	static void printfooter(String name, double testtime, double testsd,
			 double referencetime, double refsd) {
		System.out.printf("%s time     = %f microseconds +/- %f\n",
		   name, testtime, testsd);
//		System.out.printf("%s overhead = %f microseconds +/- %f\n",
//		   name, testtime-referencetime, (testsd+referencesd));

	}
}
