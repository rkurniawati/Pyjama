package asyncTest;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PjMandelbrotSeq extends JFrame implements MouseListener, MouseWheelListener, KeyListener{

	private static final long serialVersionUID = -7311452299949615843L;
	private static final int iterationDept = 2550;
	private BufferedImage display;
	private WritableRaster raster;
	private int frameWidth = 1360;
	private int frameHight = 720;
	private int mouseX = (int) frameWidth / 2;
	private int mouseY = (int) frameHight / 2;
	private double xmin = MandelbrotDefault.xmin;
	private double xmax = MandelbrotDefault.xmax;
	private double ymin = MandelbrotDefault.ymin;
	private double ymax = MandelbrotDefault.ymax;
	
	private final int zoomScale = 10;
	enum ZoomType {zoomIn, zoomOut, noZoom};
	
	class MandelbrotDefault {
		static final double xmin = -2.5;     
		static final double xmax = 1.0;    
		static final double ymin = -1.25;
		static final double ymax = 1.25;
	}
	
	public PjMandelbrotSeq() {
		super("Mandelbrot");
		setSize(this.frameWidth, this.frameHight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setResizable(true);
		
		final Component graphics = new Component() {			
			private static final long serialVersionUID = 1L;
			public void paint(Graphics g) {
				g.drawImage(display, 0,0, null);
			}						
		};
		display = new BufferedImage(this.frameWidth, this.frameHight, BufferedImage.TYPE_INT_RGB);
		raster = display.getRaster();
		
		graphics.addMouseListener(this);
		graphics.addMouseWheelListener(this);
		this.addKeyListener(this);
		graphics.addComponentListener(new ComponentAdapter() 
		{  
		        public void componentResized(ComponentEvent e) {
		            frameWidth = graphics.getWidth();
		            frameHight = graphics.getHeight();
		            updatePosition(ZoomType.noZoom);
		        }
		});
		getContentPane().add(graphics);
		updateRaster(this.xmax, this.ymax, this.xmin, this.ymin, this.frameWidth, this.frameHight);
		this.setVisible(true);	
	}

	
	private void updatePosition(ZoomType zoomType) {
		double xScale = (this.xmax - this.xmin) / this.frameWidth;
		double yScale = (this.ymax - this.ymin) / this.frameHight;
				
		double centreX = this.xmin + (this.xmax - this.xmin) * this.mouseX / this.frameWidth;
		double centreY = this.ymin + (this.ymax - this.ymin) * this.mouseY / this.frameHight;
		
		//System.out.println("mouseX"+this.mouseX+"mouseY"+this.mouseY+"centre"+centreX+ " "+ centreY);
		
		double scale = zoomScale;
		if (zoomType == ZoomType.zoomOut) {
			scale = 1 / scale;
		} else if (zoomType == ZoomType.noZoom) {
			scale = 1;
		}
		this.xmax = centreX + this.frameWidth / 2 * xScale / scale;
		this.xmin = centreX - this.frameWidth / 2 * xScale / scale;
		this.ymax = centreY + this.frameHight / 2 * yScale / scale;
		this.ymin = centreY - this.frameHight / 2 * yScale / scale;
		
		//System.out.println("xmax"+this.xmax+"xmin"+this.xmin+"ymax"+this.ymax+"ymin"+this.ymin);

		updateRaster(this.xmax, this.ymax, this.xmin, this.ymin, this.frameWidth, this.frameHight);
	}
	
	private void updateRaster(double xmax, double ymax, double xmin, double ymin, int width, int hight){
		double xTick = (xmax - xmin) / width;
		double yTick = (ymax - ymin) / hight;
		
		double x = xmin;
		double y = ymin;
		//#omp parallel for
		for (int i=0; i<hight; i++) {	
			for (int j=0; j<width; j++) {
				x = xmin + xTick * j;
				y = ymin + yTick * i;
				drawPixel(j, i, x, y);
			}
			this.repaint();
		}
	}
	
	private void drawPixel(int i, int j, double x, double y) {
		int colorIndex = MandelbrotCal(x, y);
		this.raster.setPixel(i, j, HSBtoRGB(colorIndex));
	}
	
	private int[] HSBtoRGB(int colorIndex) {
		int rgb = Color.HSBtoRGB(colorIndex/100F, 1F, 1F);
		int[] RGBpixel = new int[3];
		RGBpixel[0] = (rgb >> 16) & 0xFF;
		RGBpixel[1] = (rgb >> 8) & 0xFF;
		RGBpixel[2] = rgb & 0xFF;
		return RGBpixel;
	}

	private int MandelbrotCal(double x, double y) {
		int count = 0;
		double zx = x;
		double zy = y;
		while (count < iterationDept && Math.abs(x) < 100 && Math.abs(zy) < 100) {
			double new_zx = zx*zx - zy*zy + x;
			zy = 2*zx*zy + y;
			zx = new_zx;
			count++;
		}
		return count;
    }	
	
	public static void main(String[] s) {
		new PjMandelbrotSeq();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		long startTime = System.nanoTime();
		this.mouseX = e.getX();
		this.mouseY = e.getY();
		
		if (SwingUtilities.isLeftMouseButton(e)) {
			this.updatePosition(ZoomType.zoomIn);
		} else if (SwingUtilities.isRightMouseButton(e)){
			this.updatePosition(ZoomType.zoomOut);
		}
		//this.repaint();
		double timeElapse = (System.nanoTime() - startTime) / 10e6;
		System.out.println("done within:" + timeElapse + "ms");   
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		long startTime = System.nanoTime();
		this.mouseX = e.getX();
		this.mouseY = e.getY();
		int notches = e.getWheelRotation();
		if (notches < 0) {
			System.out.println("Zoom in");
			this.updatePosition(ZoomType.zoomIn);
		} else if (notches > 0){
			System.out.println("Zoom out");
			this.updatePosition(ZoomType.zoomOut);
		}
		//this.repaint();
		double timeElapse = (System.nanoTime() - startTime) / 10e6;
		System.out.println("done within:" + timeElapse + "ms");       
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		long startTime = System.nanoTime();
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_SPACE) {
			this.xmin = MandelbrotDefault.xmin;
			this.xmax = MandelbrotDefault.xmax;
			this.ymin = MandelbrotDefault.ymin;
			this.ymax = MandelbrotDefault.ymax;
			this.mouseX = (int) this.frameWidth / 2;
			this.mouseY = (int) this.frameHight / 2;
			this.updatePosition(ZoomType.noZoom);
			//this.repaint();
			double timeElapse = (System.nanoTime() - startTime) / 10e6;
			System.out.println("reset within:" + timeElapse + "ms"); 
		}
	}



}


