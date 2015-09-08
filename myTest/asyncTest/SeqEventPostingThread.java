package asyncTest;

import java.util.ArrayList;

import javax.swing.SwingUtilities;

public class SeqEventPostingThread extends EPT {
	private SeqAsyncGuiTest a;
	private ArrayList<Long> startTimeStamp;
	private int sleepMillis;
	private int iteration = 10;
	public SeqEventPostingThread(SeqAsyncGuiTest aa, int iter, ArrayList<Long> start) {
		this.a = aa;
		this.iteration = iter;
		this.startTimeStamp = start;
		this.sleepMillis = 1;
	}
	public SeqEventPostingThread(SeqAsyncGuiTest aa, int iter, ArrayList<Long> start, int sleepTime) {
		this.a = aa;
		this.iteration = iter;
		this.startTimeStamp = start;
		this.sleepMillis = sleepTime;
	}
	@Override
	public
	void run() {
		System.out.println("ept thread num" + Thread.currentThread().getId());
		for (int ii = 0; ii < iteration; ii++) {
            startTimeStamp.add(ii, System.nanoTime());
            //System.out.println("out swingworker click before" + Thread.currentThread().getId());
            SwingUtilities.invokeLater(new Runnable() {
            	public void run() {
            		  a.task1_button.doClick();
            		  //System.out.println("in swingworker click" + Thread.currentThread().getId());
            	}
            });
            //System.out.println("out swingworker after" + Thread.currentThread().getId());
            try {
				Thread.currentThread().sleep(this.sleepMillis);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
}