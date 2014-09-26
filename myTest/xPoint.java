import java.util.ArrayList;


public class xPoint{
	private int x;
	private int y;
	public int[] a = new int[10];
	public int sum=0;
	
	xPoint(int a, int b)
	{
		this.setX(a);
		this.setY(b);
		for (int i=0; i<10; i++) {
			this.a[i] = i;
		}
	}
	
	xPoint(xPoint p) {
		this.x = p.getX();
		this.y = p.getY();
		for (int i=0; i<10; i++) {
			this.a[i] = i;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int xx) {
		this.x = xx;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int yy) {
		this.y = yy;
	}
	
	public static xPoint pointReduction(xPoint p1, xPoint p2) {
		p1.x += p2.x;
		p1.y += p2.y;
		return p1;
	}
	
	///////////////
	public static void main(String argc[]) {
		xPoint xing = new xPoint(1,1);
		ArrayList<xPoint> list = new ArrayList<xPoint>();
		list.add(xing);
		System.out.println("xing->x:"+xing.getX()+"xing->y:"+xing.getY());
		System.out.println("list(0)->x:"+list.get(0).getX()+"list(0)->y:"+list.get(0).getY());
		xing.setX(4);
		xing.setY(5);
		System.out.println("-----");
		System.out.println("list(0)->x:"+list.get(0).getX()+"list(0)->y:"+list.get(0).getY());
	}
	
}
