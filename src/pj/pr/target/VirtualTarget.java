package pj.pr.target;

public abstract class VirtualTarget {
	protected String targetName;
	public abstract void submit(TargetTask<?> task);
	public String getName() {
		return this.targetName;
	}
}
