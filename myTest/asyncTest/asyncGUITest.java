package asyncTest;

import java.awt.*; 
import java.awt.event.*;


import javax.swing.*;
public class asyncGUITest extends JFrame implements ActionListener
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  JLabel task1_answer = new JLabel("");
  JLabel task2_answer = new JLabel("");
  JPanel pane = new JPanel(); // create pane object
  JButton task1_button = new JButton("Task1");
  JButton task2_button = new JButton("Task2");
  asyncGUITest()   // the constructor
  {
    super("Event Handler Demo"); setBounds(100,100,300,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container con = this.getContentPane(); // inherit main frame
    con.add(pane);
    task1_button.addActionListener(this);   // register button listener
    task2_button.addActionListener(this);   // register button listener
    pane.add(task1_answer); 
    pane.add(task1_button);
    pane.add(task2_answer); 
    pane.add(task2_button);
    System.out.println("In myFrame");
    setVisible(true); // make frame visible

  }
  // here is the basic event handler
  public void actionPerformed(ActionEvent event)
  {
    Object source = event.getSource();
    if (source == task1_button)
    {
    	task1_answer.setText("Start Processing Task1!");
    	System.err.println("Processing task 1");
    	long startTime = System.currentTimeMillis();
    	//#omp target virtual(worker)
    	{
    		computeTask1();
    	}
    	long timeSpan = System.currentTimeMillis() - startTime;
    	System.err.println("Task 1 finishes with time span:" + timeSpan);
    	task1_answer.setText("Task 1 finished");
    }
    if (source == task2_button)
    {
    	task2_answer.setText("Start Processing Task2!");
    	System.out.println("Processing task 2");		  
    	
    	System.out.println("Task 2 finished");
    	task2_answer.setText("Task 2 finished");
    }
  }
  
  private int computeTask1() {
	  int i;
	  for(i=1; i<=5; i++) {
		  try {
				Thread.currentThread().sleep(1000);
		  } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		  }
		  //#omp target virtual(edt) shared(i)
		  {
			  task1_answer.setText("Finish " + i + "/5 of task 1");
			  System.out.println("Finish " + i + "/5 of task 1");
		  }
	  }

	  return 1; 
  }
  
  public static void main(String args[]) {new asyncGUITest();}
}
