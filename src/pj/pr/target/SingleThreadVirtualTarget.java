package pj.pr.target;

public class SingleThreadVirtualTarget extends VirtualTarget{
	private Thread thread;
	
	public SingleThreadVirtualTarget(String targetName, Thread t) {
		this.targetName = targetName;
		this.thread = t;
	}
	@Override
	public void submit(TargetTask task) {
		// TODO Auto-generated method stub	
	}
	
	public Thread getThread() {
		return this.thread;
	}

}
