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

import pj.pr.*;
import pj.PjRuntime;
import pj.Pyjama;
import pi.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.SwingUtilities;
import java.lang.reflect.InvocationTargetException;
import pj.pr.exceptions.OmpParallelRegionLocalCancellationException;

public class PjMandelbrotPar extends JFrame implements MouseListener, MouseWheelListener, KeyListener {

    private static final long serialVersionUID = -7311452299949615843L;

    private static final int iterationDept = 2550;

    private BufferedImage display = null;

    private WritableRaster raster = null;

    private int frameWidth = 1360;

    private int frameHight = 720;

    private int mouseX = (int) frameWidth / 2;

    private int mouseY = (int) frameHight / 2;

    private double xmin = MandelbrotDefault.xmin;

    private double xmax = MandelbrotDefault.xmax;

    private double ymin = MandelbrotDefault.ymin;

    private double ymax = MandelbrotDefault.ymax;

    private final int zoomScale = 10;

    enum ZoomType {

        zoomIn, zoomOut, noZoom
    }

    ;

    class MandelbrotDefault {

        static final double xmin = -2.5;

        static final double xmax = 1.0;

        static final double ymin = -1.25;

        static final double ymax = 1.25;
    }

    public PjMandelbrotPar() {
        super("Mandelbrot");
        setSize(this.frameWidth, this.frameHight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        final Component graphics = new Component() {

            private static final long serialVersionUID = 1L;

            public void paint(Graphics g) {{
                g.drawImage(display, 0, 0, null);
            }
            }

        };
        display = new BufferedImage(this.frameWidth, this.frameHight, BufferedImage.TYPE_INT_RGB);
        raster = display.getRaster();
        graphics.addMouseListener(this);
        graphics.addMouseWheelListener(this);
        this.addKeyListener(this);
        graphics.addComponentListener(new ComponentAdapter() {

            public void componentResized(ComponentEvent e) {{
                frameWidth = graphics.getWidth();
                frameHight = graphics.getHeight();
                updatePosition(ZoomType.noZoom);
            }
            }

        });
        getContentPane().add(graphics);
        updateRaster(this.xmax, this.ymax, this.xmin, this.ymin, this.frameWidth, this.frameHight);
        this.repaint();
        this.setVisible(true);
    }

    private void updatePosition(ZoomType zoomType) {{
        double xScale = (this.xmax - this.xmin) / this.frameWidth;
        double yScale = (this.ymax - this.ymin) / this.frameHight;
        double centreX = this.xmin + (this.xmax - this.xmin) * this.mouseX / this.frameWidth;
        double centreY = this.ymin + (this.ymax - this.ymin) * this.mouseY / this.frameHight;
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
        updateRaster(this.xmax, this.ymax, this.xmin, this.ymin, this.frameWidth, this.frameHight);
    }
    }


    private void updateRaster(double xmax, double ymax, double xmin, double ymin, int width, int hight) {{
        double xTick = (xmax - xmin) / width;
        double yTick = (ymax - ymin) / hight;
        double x = xmin;
        double y = ymin;
        /*OpenMP Parallel region (#0) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);
        int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_0.put("x",x);
        inputlist__OMP_ParallelRegion_0.put("xTick",xTick);
        inputlist__OMP_ParallelRegion_0.put("yTick",yTick);
        inputlist__OMP_ParallelRegion_0.put("y",y);
        inputlist__OMP_ParallelRegion_0.put("hight",hight);
        inputlist__OMP_ParallelRegion_0.put("width",width);
        _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);
        _OMP_ParallelRegion_0_in.runParallelCode();
        x = (Double)outputlist__OMP_ParallelRegion_0.get("x");
        xTick = (Double)outputlist__OMP_ParallelRegion_0.get("xTick");
        yTick = (Double)outputlist__OMP_ParallelRegion_0.get("yTick");
        y = (Double)outputlist__OMP_ParallelRegion_0.get("y");
        hight = (Integer)outputlist__OMP_ParallelRegion_0.get("hight");
        width = (Integer)outputlist__OMP_ParallelRegion_0.get("width");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);
        RuntimeException OMP_ee_0 = (RuntimeException) _OMP_ParallelRegion_0_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee_0 != null) {throw OMP_ee_0;}
        /*OpenMP Parallel region (#0) -- END */

    }
    }
        class _OMP_ParallelRegion_0{
                private int OMP_threadNumber = 1;
                private InternalControlVariables icv;
                private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
                private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
                private ReentrantLock OMP_lock;
                private ParIterator<?> OMP__ParIteratorCreator;
                public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

                //#BEGIN shared variables defined here
                double yTick = 0.0d;
                double xTick = 0.0d;
                double x = 0.0d;
                int hight = 0;
                int width = 0;
                double y = 0.0d;
                //#END shared variables defined here
                public _OMP_ParallelRegion_0(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
                    this.icv = icv;
                    if ((false == Pyjama.omp_get_nested()) && (Pyjama.omp_get_level() > 0)) {
                        this.OMP_threadNumber = 1;
                    }else {
                        this.OMP_threadNumber = thread_num;
                    }
                    this.OMP_inputList = inputlist;
                    this.OMP_outputList = outputlist;
                    icv.currentParallelRegionThreadNumber = this.OMP_threadNumber;
                    icv.OMP_CurrentParallelRegionBarrier = new PjCyclicBarrier(this.OMP_threadNumber);
                    //#BEGIN shared variables initialised here
                    yTick = (Double)OMP_inputList.get("yTick");
                    xTick = (Double)OMP_inputList.get("xTick");
                    x = (Double)OMP_inputList.get("x");
                    hight = (Integer)OMP_inputList.get("hight");
                    width = (Integer)OMP_inputList.get("width");
                    y = (Double)OMP_inputList.get("y");
                    //#END shared variables initialised here
                }

                private void updateOutputListForSharedVars() {
                    //BEGIN update outputlist
                    OMP_outputList.put("x",x);
                    OMP_outputList.put("xTick",xTick);
                    OMP_outputList.put("yTick",yTick);
                    OMP_outputList.put("y",y);
                    OMP_outputList.put("hight",hight);
                    OMP_outputList.put("width",width);
                    //END update outputlist
                }
                class MyCallable implements Callable<ConcurrentHashMap<String,Object>> {
                    private int alias_id;
                    private ConcurrentHashMap<String, Object> OMP_inputList;
                    private ConcurrentHashMap<String, Object> OMP_outputList;
                    //#BEGIN private/firstprivate reduction variables defined here
                    //#END private/firstprivate reduction variables  defined here
                    MyCallable(int id, ConcurrentHashMap<String,Object> inputlist, ConcurrentHashMap<String,Object> outputlist){
                        this.alias_id = id;
                        this.OMP_inputList = inputlist;
                        this.OMP_outputList = outputlist;
                        //#BEGIN firstprivate reduction variables initialised here
                        //#END firstprivate reduction variables initialised here
                    }

                    @Override
                    public ConcurrentHashMap<String,Object> call() {
                        try {
                            /****User Code BEGIN***/
                            /*OpenMP Work Share region (#0) -- START */
                            
                {//#BEGIN firstprivate lastprivate reduction variables defined and initialized here
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    try{
                        int i=0;
                        int OMP_iterator = 0;
                        int OMP_end = (int)((hight)-(0))/(1);
                        if (((hight)-(0))%(1) == 0) {
                            OMP_end = OMP_end - 1;
                        }
                        int OMP_local_iterator = 0;
                        int OMP_Chunk_Starting_point = 0;
                        int OMP_Default_chunkSize_autoGenerated = (OMP_end+1)/Pyjama.omp_get_num_threads();
                        if (Pyjama.omp_get_thread_num() < (OMP_end+1) % Pyjama.omp_get_num_threads()) {
                            ++OMP_Default_chunkSize_autoGenerated;
                            OMP_Chunk_Starting_point = Pyjama.omp_get_thread_num() * OMP_Default_chunkSize_autoGenerated;
                        } else {
                            OMP_Chunk_Starting_point = Pyjama.omp_get_thread_num() * OMP_Default_chunkSize_autoGenerated + (OMP_end+1) % Pyjama.omp_get_num_threads();
                        }
                        for (OMP_local_iterator=OMP_Chunk_Starting_point; OMP_local_iterator<OMP_Chunk_Starting_point+OMP_Default_chunkSize_autoGenerated && OMP_Default_chunkSize_autoGenerated>0; ++OMP_local_iterator) {
                            i = 0 + OMP_local_iterator * (1);
                            {
                                x = xmin;
                                for (int j = 0; j < width; j++) {
                                    drawPixel(j, i, x, y);
                                    x += xTick;
                                }
                                y += yTick;
                            }if (OMP_end == OMP_local_iterator) {
                                //BEGIN lastprivate variables value set
                                //END lastprivate variables value set
                            }
                        }
                    } catch (pj.pr.exceptions.OmpWorksharingLocalCancellationException wse){
                    } catch (Exception e){throw e;}
                    //BEGIN  reduction
                    PjRuntime.reductionLockForWorksharing.lock();
                    PjRuntime.reductionLockForWorksharing.unlock();//END reduction
                    PjRuntime.setBarrier();
                }

                            PjRuntime.setBarrier();
                            /*OpenMP Work Share region (#0) -- END */

                            /****User Code END***/
                            //BEGIN reduction procedure
                            //END reduction procedure
                            PjRuntime.setBarrier();
                        } catch (OmpParallelRegionLocalCancellationException e) {
                         	PjRuntime.decreaseBarrierCount();
                        } catch (Exception e) {
                            PjRuntime.decreaseBarrierCount();
                        	PjExecutor.cancelCurrentThreadGroup();
                        OMP_CurrentParallelRegionExceptionSlot.compareAndSet(null, e);
                    }
                    if (0 == this.alias_id) {
                        updateOutputListForSharedVars();
                    }
                    return null;
                }
            }
            public void runParallelCode() {
                for (int i = 1; i <= this.OMP_threadNumber-1; i++) {
                    Callable<ConcurrentHashMap<String,Object>> slaveThread = new MyCallable(i, OMP_inputList, OMP_outputList);
                    PjRuntime.submit(i, slaveThread, icv);
                }
                Callable<ConcurrentHashMap<String,Object>> masterThread = new MyCallable(0, OMP_inputList, OMP_outputList);
                PjRuntime.getCurrentThreadICV().currentThreadAliasID = 0;
                try {
                    masterThread.call();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }




    private void drawPixel(int i, int j, double x, double y) {{
        int colorIndex = MandelbrotCal(x, y);
        this.raster.setPixel(i, j, HSBtoRGB(colorIndex));
    }
    }


    private int[] HSBtoRGB(int colorIndex) {{
        int rgb = Color.HSBtoRGB(colorIndex / 100F, 1F, 1F);
        int[] RGBpixel = new int[3];
        RGBpixel[0] = (rgb >> 16) & 0xFF;
        RGBpixel[1] = (rgb >> 8) & 0xFF;
        RGBpixel[2] = rgb & 0xFF;
        return RGBpixel;
    }
    }


    private int MandelbrotCal(double x, double y) {{
        int count = 0;
        double zx = x;
        double zy = y;
        while (count < iterationDept && Math.abs(x) < 100 && Math.abs(zy) < 100) {
            double new_zx = zx * zx - zy * zy + x;
            zy = 2 * zx * zy + y;
            zx = new_zx;
            count++;
        }
        return count;
    }
    }


    public static void main(String[] s) {{
        new PjMandelbrotPar();
    }
    }


    @Override
    public void mouseClicked(MouseEvent e) {{
        long startTime = System.nanoTime();
        this.mouseX = e.getX();
        this.mouseY = e.getY();
        if (SwingUtilities.isLeftMouseButton(e)) {
            this.updatePosition(ZoomType.zoomIn);
        } else if (SwingUtilities.isRightMouseButton(e)) {
            this.updatePosition(ZoomType.zoomOut);
        }
        double timeElapse = (System.nanoTime() - startTime) / 10e6;
        System.out.println("done within:" + timeElapse + "ms");
    }
    }


    @Override
    public void mouseEntered(MouseEvent e) {{
        int a = 3;
    }
    }


    @Override
    public void mouseExited(MouseEvent e) {{
    }
    }


    @Override
    public void mousePressed(MouseEvent e) {{
    }
    }


    @Override
    public void mouseReleased(MouseEvent e) {{
    }
    }


    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {{
        long startTime = System.nanoTime();
        this.mouseX = e.getX();
        this.mouseY = e.getY();
        int notches = e.getWheelRotation();
        if (notches < 0) {
            System.out.println("Zoom in");
            this.updatePosition(ZoomType.zoomIn);
        } else if (notches > 0) {
            System.out.println("Zoom out");
            this.updatePosition(ZoomType.zoomOut);
        }
        double timeElapse = (System.nanoTime() - startTime) / 10e6;
        System.out.println("done within:" + timeElapse + "ms");
    }
    }


    @Override
    public void keyTyped(KeyEvent e) {{
    }
    }


    @Override
    public void keyReleased(KeyEvent e) {{
    }
    }


    @Override
    public void keyPressed(KeyEvent e) {{
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
            double timeElapse = (System.nanoTime() - startTime) / 10e6;
            System.out.println("reset within:" + timeElapse + "ms");
        }
    }
    }

}
