package exceptionTest;

import java.io.PrintWriter;
import utils.SimulateWork;

public class SyncBenchSeq {
	
	public static void main(String[] args) {
        String fname = "hexa";
        int iteration = 15;
        int warmup = 5;
        int maxthread = 16;
        recordTimeSeq(fname, iteration, warmup, maxthread);
    
    }

	public static void recordTimeSeq(String fileName, int iter, int warmup, int maxthread) {
		PrintWriter writer_pr = null;
		PrintWriter writer_ws = null;
		PrintWriter writer_bar = null;
		
		int nthreads = 1;

		try {
			writer_pr = new PrintWriter("./" + fileName + "_SEQ_PR" + ".csv", "UTF-8");
			writer_ws = new PrintWriter("./" + fileName + "_SEQ_WS" + ".csv", "UTF-8");
			writer_bar = new PrintWriter("./" + fileName + "_SEQ_BAR" + ".csv", "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*************************************/
		writer_pr.println("\"nthreads\",\"time\"");
			for (int j=0; j<iter; j++) {
				double value = testpr(nthreads);
				if (j >= warmup) {
					writer_pr.println(nthreads + ", " + value);
					System.out.println(nthreads + ", " + value);
				}
			}
		writer_pr.close();
		/*************************************/
		writer_ws.println("\"time\"");
		for (int j = 0; j < iter; j++) {
			double value = testfor(16);
			if (j >= warmup) {
				writer_ws.println(value);
				System.out.println(value);
			}
		}
		writer_ws.close();
		/*************************************/
		writer_bar.println("\"nthreads\",\"time\"");
			for (int j=0; j<iter; j++) {
				double value = testbar(nthreads, 1);
				if (j >= warmup) {
					writer_bar.println(nthreads + ", " + value);
					System.out.println(nthreads + ", " + value);
				}
			}
		writer_bar.close();
	}
	
	static double testpr(int nthreads) {
		//workload: num threads
	    long end = 0;
	    long start = System.nanoTime();
	    for (int i = 1; i <= nthreads; i++) {
	    //#omp parallel
		{
			    delay(10);	
		}
	    }
	    end = System.nanoTime() - start;
        return (double) (end) / 1000000;
	}
	
	static double testfor(int workload) {
		//workload: iteration num
	    long end = 0;
	    long start = System.nanoTime();
	    //#omp parallel for num_threads(nthreads)
		for (int i = 0; i < workload; i++) {
			 delay(10);
		}
	    end = System.nanoTime() - start;
        return (double) (end) / 1000000;
	}
	
	static double testbar(int nthreads, int barrierNum) {
		//workload: num threads
	    long end = 0;
	    long start = System.nanoTime();
	    for (int i = 0; i < nthreads; i++) 
	    {
	    //#omp parallel shared(barrierNum)
	    {
		    for (int j = 0; j < barrierNum; j++) {
		        delay(10);
	            //#omp barrier
		    }
	    }
	    }
	    end = System.nanoTime() - start;
        return (double) (end) / 1000000;
	}
	
	static void delay(int n) {
		for (int i=0; i<n; i++) {
			SimulateWork.work(100);
		}
	}


}
