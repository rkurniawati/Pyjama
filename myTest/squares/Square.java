package squares;

public class Square {
	
	private int x;
	private int y;
	private int width;
	private int height;
	private boolean isVisible;
	
	public Square(int x, int y, int width, int height, boolean isVisible) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.isVisible = isVisible;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public boolean getIsVisible() {
		return this.isVisible;
	}
	
	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
}
