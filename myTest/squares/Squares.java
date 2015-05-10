package squares;

import pj.*;
import javax.swing.JApplet;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import pi.ParIterator;
import pi.ParIteratorFactory;
import utils.SimulateWork;

import pj.pr.*;
import pj.PjRuntime;
import pj.Pyjama;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.SwingUtilities;
import java.lang.reflect.InvocationTargetException;
import pj.pr.exceptions.OmpParallelRegionLocalCancellationException;

public class Squares extends JApplet {

    private static final int WORK_AMOUNT = 50;

    private int width = 0;

    private int height = 0;

    private int sqCols = 0;

    private int sqRows = 0;

    private int sqWidth = 0;

    private int sqHeight = 0;

    private int sqRowsEa = 0;

    private int squareTypes = 0;

    private ArrayList<Square> blueSquaresList = null;

    private ArrayList<Square> redSquaresList = null;

    private ArrayList<Square> greenSquaresList = null;

    private ArrayList<Square> yellowSquaresList = null;

    private Iterator<Square> blueSquaresIterator = null;

    private Iterator<Square> redSquaresIterator = null;

    private Iterator<Square> greenSquaresIterator = null;

    private Iterator<Square> yellowSquaresIterator = null;

    private ParIterator<Square> blueSquaresParIterator = null;

    private ParIterator<Square> redSquaresParIterator = null;

    private ParIterator<Square> greenSquaresParIterator = null;

    private ParIterator<Square> yellowSquaresParIterator = null;

    private int threads = 8;

    private boolean isClear = false;

    public Squares() {
        width = 800;
        height = 800;
        sqCols = 20;
        sqRows = 20;
        squareTypes = 4;
        sqRowsEa = sqRows / squareTypes;
        setPreferredSize(new Dimension(width, height));
        init();
    }

    public void init() {{
        blueSquaresList = new ArrayList<Square>();
        redSquaresList = new ArrayList<Square>();
        greenSquaresList = new ArrayList<Square>();
        yellowSquaresList = new ArrayList<Square>();
        calcSquareDim();
        initBlueSquares();
        initRedSquares();
        initGreenSquares();
        initYellowSquares();
    }
    }


    private void calcSquareDim() {{
        sqWidth = this.width / sqCols;
        sqHeight = this.height / sqRows;
    }
    }


    private int getColouredSquaresY(int rank) {{
        return rank * sqRowsEa * sqHeight;
    }
    }


    private void initBlueSquares() {{
        int height = getColouredSquaresY(0);
        for (int i = 0; i < sqCols; i++) {
            for (int j = 0; j < sqRowsEa; j++) {
                blueSquaresList.add(new Square(i * sqWidth, height + j * sqHeight, sqWidth, sqHeight, false));
            }
        }
        Collections.shuffle(blueSquaresList);
    }
    }


    private void initRedSquares() {{
        int height = getColouredSquaresY(1);
        for (int i = 0; i < sqCols; i++) {
            for (int j = 0; j < sqRowsEa; j++) {
                redSquaresList.add(new Square(i * sqWidth, height + j * sqHeight, sqWidth, sqHeight, false));
            }
        }
        Collections.shuffle(redSquaresList);
    }
    }


    private void initGreenSquares() {{
        int height = getColouredSquaresY(2);
        for (int i = 0; i < sqCols; i++) {
            for (int j = 0; j < sqRowsEa; j++) {
                greenSquaresList.add(new Square(i * sqWidth, height + j * sqHeight, sqWidth, sqHeight, false));
            }
        }
        Collections.shuffle(greenSquaresList);
    }
    }


    private void initYellowSquares() {{
        int height = getColouredSquaresY(3);
        for (int i = 0; i < sqCols; i++) {
            for (int j = 0; j < sqRowsEa; j++) {
                yellowSquaresList.add(new Square(i * sqWidth, height + j * sqHeight, sqWidth, sqHeight, false));
            }
        }
        Collections.shuffle(yellowSquaresList);
    }
    }


    public void update(Graphics g) {{
        paint(g);
    }
    }


    public void paint(Graphics g) {{
        if (isClear) {
            Dimension d = getSize();
            g.setColor(Color.white);
            g.fillRect(0, 0, d.width, d.height);
            isClear = false;
        }
        for (Square s : blueSquaresList) {
            if (s.getIsVisible()) {
                g.setColor(Color.blue);
                g.fillRect(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                g.setColor(new Color(200, 200, 255));
                g.fillOval(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                g.setColor(Color.white);
                g.drawOval(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                g.setColor(Color.black);
                g.drawRect(s.getX(), s.getY(), s.getWidth(), s.getHeight());
            }
        }
        for (Square s : redSquaresList) {
            if (s.getIsVisible()) {
                g.setColor(Color.red);
                g.fillRect(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                g.setColor(new Color(255, 200, 200));
                g.fillOval(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                g.setColor(Color.white);
                g.drawOval(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                g.setColor(Color.black);
                g.drawRect(s.getX(), s.getY(), s.getWidth(), s.getHeight());
            }
        }
        for (Square s : greenSquaresList) {
            if (s.getIsVisible()) {
                g.setColor(Color.green);
                g.fillRect(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                g.setColor(new Color(200, 255, 200));
                g.fillOval(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                g.setColor(Color.white);
                g.drawOval(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                g.setColor(Color.black);
                g.drawRect(s.getX(), s.getY(), s.getWidth(), s.getHeight());
            }
        }
        for (Square s : yellowSquaresList) {
            if (s.getIsVisible()) {
                g.setColor(Color.yellow);
                g.fillRect(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                g.setColor(new Color(255, 255, 200));
                g.fillOval(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                g.setColor(Color.white);
                g.drawOval(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                g.setColor(Color.black);
                g.drawRect(s.getX(), s.getY(), s.getWidth(), s.getHeight());
            }
        }
    }
    }


    public void reset() {{
        isClear = true;
        blueSquaresIterator = blueSquaresList.iterator();
        redSquaresIterator = redSquaresList.iterator();
        greenSquaresIterator = greenSquaresList.iterator();
        yellowSquaresIterator = yellowSquaresList.iterator();
        resetPaint(blueSquaresIterator);
        resetPaint(redSquaresIterator);
        resetPaint(greenSquaresIterator);
        resetPaint(yellowSquaresIterator);
        repaint();
    }
    }


    private void resetPaint(Iterator<Square> squareIterator) {{
        while (squareIterator.hasNext()) {
            Square s = squareIterator.next();
            s.setIsVisible(false);
        }
    }
    }


    private void makeSquaresVisible(Iterator<Square> squareIterator) {{
        while (squareIterator.hasNext()) {
            Square s = squareIterator.next();
            if (!s.getIsVisible()) {
                s.setIsVisible(true);
                SimulateWork.work(WORK_AMOUNT);
                //#BEGIN GUI execution block
                if (SwingUtilities.isEventDispatchThread()) {
                    {
                        repaint();
                    }}
                else {
                    try {
    class _OMP_GuiCode_0 implements Runnable{
        _OMP_GuiCode_0(){
        }
        @Override
        public void run() {
            /****User Code BEGIN***/
            {
                repaint();
            }
            /****User Code END***/
        }
    }
    SwingUtilities.invokeLater(new _OMP_GuiCode_0());
} catch (Exception e) {e.printStackTrace();}

                    }
                    //#END GUI execution block

                }
            }
        }
        }


        private void makeParaSquaresVisible(ParIterator<Square> squareIterator) {{
            makeSquaresVisible(squareIterator);
        }
        }


        public void makeSequential() {{
            init();
            blueSquaresIterator = blueSquaresList.iterator();
            redSquaresIterator = redSquaresList.iterator();
            greenSquaresIterator = greenSquaresList.iterator();
            yellowSquaresIterator = yellowSquaresList.iterator();
            makeSquaresVisible(blueSquaresIterator);
            makeSquaresVisible(redSquaresIterator);
            makeSquaresVisible(greenSquaresIterator);
            makeSquaresVisible(yellowSquaresIterator);
        }
        }


        public void makeConcurrent() {{
            init();
            blueSquaresIterator = blueSquaresList.iterator();
            redSquaresIterator = redSquaresList.iterator();
            greenSquaresIterator = greenSquaresList.iterator();
            yellowSquaresIterator = yellowSquaresList.iterator();
            Pyjama.omp_set_num_threads(8);
            /*OpenMP Parallel region (#0) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);
            int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
            _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);
            _OMP_ParallelRegion_0_in.runParallelCode();
            PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);
            RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_0_in.OMP_CurrentParallelRegionExceptionSlot.get();
            if (OMP_ee != null) {throw OMP_ee;}
            /*OpenMP Parallel region (#0) -- END */

        }
        }
class _OMP_ParallelRegion_0{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
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
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
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
                    {
                        makeSquaresVisible(blueSquaresIterator);
                        makeSquaresVisible(redSquaresIterator);
                        makeSquaresVisible(greenSquaresIterator);
                        makeSquaresVisible(yellowSquaresIterator);
                    }
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




        public void makeParallel() {{
            blueSquaresParIterator = ParIteratorFactory.createParIterator(blueSquaresList, threads);
            redSquaresParIterator = ParIteratorFactory.createParIterator(redSquaresList, threads);
            greenSquaresParIterator = ParIteratorFactory.createParIterator(greenSquaresList, threads);
            yellowSquaresParIterator = ParIteratorFactory.createParIterator(yellowSquaresList, threads);
            int durant = 35;
            Pyjama.omp_set_num_threads(8);
            System.out.println("REAL EDT" + Thread.currentThread().getId());
            /*OpenMP Parallel region (#1) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_1 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_1 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_1);
            int _threadNum__OMP_ParallelRegion_1 = icv__OMP_ParallelRegion_1.nthreads_var.get(icv__OMP_ParallelRegion_1.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
            inputlist__OMP_ParallelRegion_1.put("durant",durant);
            _OMP_ParallelRegion_1 _OMP_ParallelRegion_1_in = new _OMP_ParallelRegion_1(_threadNum__OMP_ParallelRegion_1,icv__OMP_ParallelRegion_1,inputlist__OMP_ParallelRegion_1,outputlist__OMP_ParallelRegion_1);
            _OMP_ParallelRegion_1_in.runParallelCode();
            if (PjRuntime.getCurrentThreadICV() != null) {//#GEN#[-1]#PJ#
                durant = (Integer)outputlist__OMP_ParallelRegion_1.get("durant");
                PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_1);
                return;//#GEN#[-1]#PJ#
            }//#GEN#[-1]#PJ#
            /*OpenMP Parallel region (#1) -- END */

            System.out.println("Durant:" + durant);
            System.out.println("Finished\tThread ID: " + Pyjama.omp_get_thread_num() + "REAL ID:" + Thread.currentThread().getId());
            System.out.println("HAHAHAHAHA REAL ID:" + Thread.currentThread().getId());
            return;
        }
        }
class _OMP_ParallelRegion_1{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
        int durant = 0;
        //#END shared variables defined here
        public _OMP_ParallelRegion_1(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
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
            durant = (Integer)OMP_inputList.get("durant");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("durant",durant);
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
                    {
                        makeParaSquaresVisible(blueSquaresParIterator);
                        makeParaSquaresVisible(redSquaresParIterator);
                        makeParaSquaresVisible(greenSquaresParIterator);
                        makeParaSquaresVisible(yellowSquaresParIterator);
                    }
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
                try {
    class OMP_AfterInvocationOf__OMP_ParallelRegion_1 implements Runnable{
        int durant;
        OMP_AfterInvocationOf__OMP_ParallelRegion_1(int durant){
            this.durant=durant;
        }
        @Override
        public void run() {
            /****User Code BEGIN***/
            {
                System.out.println("Durant:" + durant);
                System.out.println("Finished\tThread ID: " + Pyjama.omp_get_thread_num() + "REAL ID:" + Thread.currentThread().getId());
                System.out.println("HAHAHAHAHA REAL ID:" + Thread.currentThread().getId());
                return;
            }
            /****User Code END***/
        }
    }
    SwingUtilities.invokeAndWait(new OMP_AfterInvocationOf__OMP_ParallelRegion_1(durant));
} catch (Exception e) {e.printStackTrace();}

            }
            return null;
        }
    }
    public void runParallelCode() {
        for (int i = 0; i <= this.OMP_threadNumber-1; i++) {
            Callable<ConcurrentHashMap<String,Object>> slaveThread = new MyCallable(i, OMP_inputList, OMP_outputList);
            PjRuntime.submit(i, slaveThread, icv);
        }
    }
}



    }
