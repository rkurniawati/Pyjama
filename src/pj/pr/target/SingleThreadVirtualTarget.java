package pj.pr.target;

import javax.swing.SwingUtilities;

public class SingleThreadVirtualTarget extends VirtualTarget{
	private Thread thread;
	
	public SingleThreadVirtualTarget(String targetName, Thread t) {
		this.targetName = targetName;
		this.thread = t;
	}
	@Override
	public void submit(final TargetTask<?> task) {
		// TODO need further implementation
		/*
		 * We suppose this singleThreadVirtualTarget is swing edt,
		 * so using SwingUtilities.invokeLater to put this task at
		 * the end of EDT callback function queue.
		 */
		task.setCaller(this);
		Runnable taskCode = new Runnable() {
			@Override
			public void run() {
				task.run();
			}
		};
		SwingUtilities.invokeLater(taskCode);
	}
	
	public Thread getThread() {
		return this.thread;
	}
	
	public String targetName() {
		return this.targetName;
	}

}
