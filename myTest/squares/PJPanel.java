package squares;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PJPanel extends JFrame implements ActionListener {
	
	private Squares squareContent;
	
	private JButton btnSequential;
	private JButton btnConcurrent;
	private JButton btnParallel;
	private JButton btnClear;
	
	private long timer;
	
	private String type;
	
	public static void main(String[] args) {
		PJPanel sqfr = new PJPanel("Squares");
	}	
	
	public PJPanel(String title) {
		setupGUI(title);
	}
	
	public void actionPerformed(ActionEvent e) {
		//Clear and stuff
		//Start timing?
		timer = System.currentTimeMillis();
		
		if(e.getSource() == btnSequential) {
			type = btnSequential.getText();
			squareContent.makeSequential();
			calculateTime(type);
		}
		
		if(e.getSource() == btnConcurrent) {
			//TaskID id = squareContent.makeConcurrent() notify(calculateTime(TaskID));
			type = btnConcurrent.getText();
			squareContent.makeConcurrent();
			calculateTime(type);
		} 

		if(e.getSource() == btnParallel) {
			//TaskID id = squareContent.makeParallel() notify(calculateTime(TaskID));
			type = btnParallel.getText();
			squareContent.makeParallel();
			calculateTime(type);
		}
		
		if(e.getSource() == btnClear) {
			System.out.println("Clear:"+Thread.currentThread().getId());
			squareContent.reset();
		}
	}
	
	//Creates argument where TaskID would take in ID and convert it
	/*private void calculateTime(TaskID id) {
		if(id.getTaskName()=="makeConcurrent")
			type = "Concurrent";
		else
			type = "Parallel";
		calculateTime(type);
	}*/
	
	private void calculateTime(String s) {
		timer = System.currentTimeMillis() - timer;
		System.out.println(s + ":\tTime to finish rendering:\t" + timer);
	}
	
	private void setupGUI(String title) {
		int buttonWidth = 200;
		int buttonHeight = 100;
		JPanel panel = new JPanel();
		panel.setSize(buttonWidth, getContentPane().getHeight());
		panel.setLayout(new GridLayout(4, 1));
		
		setTitle(title);
		setBounds(800, 0, 925, 850);
		
		btnSequential = new JButton("Sequential");
		btnSequential.setSize(buttonWidth, buttonHeight);
		btnSequential.addActionListener(this);
		panel.add(btnSequential);
		
		btnConcurrent = new JButton("Concurrent");
		btnConcurrent.setSize(buttonWidth, buttonHeight);
		btnConcurrent.addActionListener(this);
		panel.add(btnConcurrent);
		
		btnParallel = new JButton("Parallel");
		btnParallel.setSize(buttonWidth, buttonHeight);
		btnParallel.addActionListener(this);
		panel.add(btnParallel);
		
		btnClear = new JButton("Clear");
		btnClear.setSize(buttonWidth, buttonHeight);
		btnClear.addActionListener(this);
		panel.add(btnClear);
				
		//panel.add(squareContent);
		getContentPane().add(panel, BorderLayout.WEST);
		squareContent = new Squares();
		getContentPane().add(squareContent, BorderLayout.CENTER);
		
		setResizable(false);
		//pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}