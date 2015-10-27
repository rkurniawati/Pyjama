package eventdrivenTest;

import java.lang.reflect.Field;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class EventPostingThread extends Thread{
	
	private boolean debugMode = true;

	//How many event the thread posts every second;
	private int eventsPostPerSecond = 100;
	//The target GUI interface the thread posting.
	private Object targetGUI = null;
	
	//How long the event posting thread works. If 0, works forever;
	private int lastingSeconds = 0;
	
	//Simulated button name
	private String buttonName = "task_button";
	
	//Keep the time interval between every two events. (ns or 10^-9s)
	private int postingInterval; 
	
	private long requestCounting = 0;
	
	//The button on which the event posted.
	private JButton button = null;

	
	//flag to indicate if this thread is running.
	private volatile boolean isStop = false;
	
	public EventPostingThread(int epp, Object gui) {
		this.eventsPostPerSecond = epp;
		this.targetGUI = gui;
		calculatePostingInterval();
		extractButton();
	}
	public EventPostingThread(int epp, Object gui, int lastingSec) {
		this.eventsPostPerSecond = epp;
		this.targetGUI = gui;
		this.lastingSeconds = lastingSec;
		calculatePostingInterval();
		extractButton();
	}
	
	private void extractButton() {
		try {
			Field field = targetGUI.getClass().getDeclaredField(buttonName);
			field.setAccessible(true);
			button = (JButton)field.get(targetGUI);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
		
	@Override
	public void run() {
		
		if (this.lastingSeconds > 0) {
			Debug("lasting seconds is " + this.lastingSeconds);
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				  @Override
				  public void run() {
					  isStop = true;
				  }
				}, lastingSeconds * 1000);
		}

		while (!this.isStop) {
			postEventSimulation();
			interval();
		}
	}
	
	public void stopPosting() {
		this.isStop = true;
	}
	
	private void postEventSimulation() {
		 SwingUtilities.invokeLater(new Runnable() {
         	public void run() {
    			button.doClick();
         	}
		 });
		plusEventPostCount();
		Debug("one event posted(total posted:" + this.getRequestsAccumulated() + ")");
	}
	
	private void plusEventPostCount() {
		this.requestCounting++;
	}
		
	public long getRequestsAccumulated() {
		return this.requestCounting;
	}
	
	private void calculatePostingInterval() {
		this.postingInterval = (int) (1.0e9 / this.eventsPostPerSecond);
		Debug("posting interval:" + this.postingInterval + "ns");
	}
	private void interval() {
		Thread.currentThread();
		long ms = (long) (this.postingInterval / 1.0e6);
		int ns = (int) (this.postingInterval - ms * 1.0e6);
		Debug("sleep " + ms + "ms and "+ ns + "ns");
		try {
			Thread.sleep(ms,ns);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private void Debug(String s) {
		if (debugMode) {
			System.out.println(s);
		}
	}
}
