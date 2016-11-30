//Pyjama compiler version:v1.5.3
package PyjamaCode.TestingDirectives.FreeguiThread;

import javax.swing.SwingUtilities;
import pj.*;

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

/**
* Test if the certain place is EDT or not, the main thread is put to sleep for 1 second, so simulateEDT will end first
*/
public class FreeGuiThread_positive_test2 {

    private StringBuffer sb = new StringBuffer();

    public String positive_test2() {{
        sb.append(SwingUtilities.isEventDispatchThread());
        try {
            SwingUtilities.invokeAndWait(simulateEDT);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sb.append(SwingUtilities.isEventDispatchThread());
        return sb.toString();
    }
    }


    final Runnable simulateEDT = new Runnable() {

        public void run() {{
            sb.append(SwingUtilities.isEventDispatchThread());
            /*OpenMP Parallel region (#0) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);
            int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
            _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);
            _OMP_ParallelRegion_0_in.runParallelCode();
            if (PjRuntime.getCurrentThreadICV() != null) {//#GEN#[-1]#PJ#
                PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);
                return;//#GEN#[-1]#PJ#
            }//#GEN#[-1]#PJ#
            /*OpenMP Parallel region (#0) -- END */

            sb.append(SwingUtilities.isEventDispatchThread());
            //#BEGIN GUI execution block
            if (SwingUtilities.isEventDispatchThread()) {
                {
                    sb.append(SwingUtilities.isEventDispatchThread());
                }}
            else {
                try {
    class _OMP_GuiCode_1 implements Runnable{
        _OMP_GuiCode_1(){
        }
        @Override
        public void run() {
            /****User Code BEGIN***/
            {
                sb.append(SwingUtilities.isEventDispatchThread());
            }
            /****User Code END***/
        }
    }
    SwingUtilities.invokeLater(new _OMP_GuiCode_1());
} catch (Exception e) {e.printStackTrace();}

                }
                //#END GUI execution block

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
                                    sb.append(SwingUtilities.isEventDispatchThread());
                                    PjRuntime.setBarrier();

                                    sb.append(SwingUtilities.isEventDispatchThread());
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
    class OMP_AfterInvocationOf__OMP_ParallelRegion_0 implements Runnable{
        StringBuffer sb;
        OMP_AfterInvocationOf__OMP_ParallelRegion_0(StringBuffer sb){
            this.sb=sb;
        }
        @Override
        public void run() {
            /****User Code BEGIN***/
            {
                sb.append(SwingUtilities.isEventDispatchThread());
                //#BEGIN GUI execution block
                if (SwingUtilities.isEventDispatchThread()) {
                    {
                        sb.append(SwingUtilities.isEventDispatchThread());
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
                sb.append(SwingUtilities.isEventDispatchThread());
            }
            /****User Code END***/
        }
    }
    SwingUtilities.invokeLater(new _OMP_GuiCode_0());
} catch (Exception e) {e.printStackTrace();}

                    }
                    //#END GUI execution block

                }
                /****User Code END***/
            }
        }
        SwingUtilities.invokeAndWait(new OMP_AfterInvocationOf__OMP_ParallelRegion_0(sb));
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



        };
    }
