package eventdrivenTest;

import java.awt.*; 
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.ArrayList;

import utils.SimulateWork;

import javax.swing.*;
public class SWCptOffloadingTest extends JFrame implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel pane = new JPanel(); // create pane object
	public JButton task_button = new JButton("Task");
	private long responseCounting = 0;
	
	SWCptOffloadingTest()   // the constructor
	{
		super("Event Handler Test");
		setBounds(100,100,300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane(); // inherit main frame
		con.add(pane);
		task_button.addActionListener(this);   // register button listener
		setVisible(true); // make frame visible
		System.out.println("In myFrame, running constructor, main thread num" + Thread.currentThread().getId());
    
		//Pyjama.omp_register_as_virtual_target("edt");
		//Pyjama.omp_create_virtual_target("worker");

  }

	// here is the basic event handler
	public void actionPerformed(ActionEvent event)
	{
		Object source = event.getSource();
		if (source == task_button) {
			new TaskWorker().execute();
		}
  }
	
	private void plusEventFinishCount() {
		this.responseCounting++;
	}
	
	public long getResponsesAccumulated() {
		return this.responseCounting;
	}
	
	class TaskWorker extends SwingWorker<Integer, Integer>
	{
	    protected Integer doInBackground() 
	    {
	    	System.out.println("thread num:" + Thread.currentThread().getId());
	    	computeTask();
			plusEventFinishCount();
			return null;

	    }

	    protected void done()
	    {
	    	//do nothing
	    }
	}
  
   private int computeTask() {

	   SimulateWork.work(10);
	   System.out.println("task finished");
	   return 1;
  }
  
  public static void main(String args[]) {
	  
	  SWCptOffloadingTest a = new SWCptOffloadingTest();
	  EventPostingThread ept= new EventPostingThread(1000, a, 10);
      ept.start();
      try {
		ept.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
      long req = ept.getRequestsAccumulated();
      long res = a.getResponsesAccumulated();
      System.out.println("get req/res:"+ req + "/" + res);
  }
}

