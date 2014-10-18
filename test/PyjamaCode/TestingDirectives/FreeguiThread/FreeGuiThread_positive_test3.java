package PyjamaCode.TestingDirectives.FreeguiThread;//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
import pj.parser.ast.visitor.DummyClassToDetermineVariableType;//#GEN#[-1]#PJ#
import javax.swing.SwingUtilities;//#GEN#[-1]#PJ#
import pj.*;//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
import pj.pr.*;//#GEN#[-1]#PJ#
import pj.PjRuntime;//#GEN#[-1]#PJ#
import pj.Pyjama;//#GEN#[-1]#PJ#
import java.util.concurrent.*;//#GEN#[-1]#PJ#
import java.util.concurrent.atomic.AtomicInteger;//#GEN#[-1]#PJ#
import java.util.concurrent.locks.ReentrantLock;//#GEN#[-1]#PJ#
import javax.swing.SwingUtilities;//#GEN#[-1]#PJ#
import java.lang.reflect.InvocationTargetException;//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
/**
* Test the explicit and implicit barrier
*///#GEN#[-1]#PJ#
public class FreeGuiThread_positive_test3 {//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
    private StringBuffer sb = new StringBuffer();//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
    public String positive_test3(int threadNumber) {{//#GEN#[-1]#PJ#
        Pyjama.omp_set_num_threads(threadNumber);//#GEN#[-1]#PJ#
        try {//#GEN#[-1]#PJ#
            SwingUtilities.invokeAndWait(simulateEDT);//#GEN#[-1]#PJ#
        } catch (Exception e) {//#GEN#[-1]#PJ#
            e.printStackTrace();//#GEN#[-1]#PJ#
        }//#GEN#[-1]#PJ#
        try {//#GEN#[-1]#PJ#
            Thread.sleep(1000);//#GEN#[-1]#PJ#
        } catch (Exception e) {//#GEN#[-1]#PJ#
            e.printStackTrace();//#GEN#[-1]#PJ#
        }//#GEN#[-1]#PJ#
        return sb.toString();//#GEN#[-1]#PJ#
    }//#GEN#[-1]#PJ#
    }//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
    final Runnable simulateEDT = new Runnable() {//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
        public void run() {{//#GEN#[-1]#PJ#
            /*OpenMP Parallel region (#0) -- START *///#GEN#[-1]#PJ#
            InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();//#GEN#[-1]#PJ#
            InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);//#GEN#[-1]#PJ#
            int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);//#GEN#[-1]#PJ#
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
            _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);//#GEN#[-1]#PJ#
            _OMP_ParallelRegion_0_in.runParallelCode();//#GEN#[-1]#PJ#
            PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);//#GEN#[-1]#PJ#
            if (PjRuntime.getCurrentThreadICV() != null) {//#GEN#[-1]#PJ#
                return;//#GEN#[-1]#PJ#
            }//#GEN#[-1]#PJ#
            /*OpenMP Parallel region (#0) -- END *///#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
            sb.append("C");//#GEN#[-1]#PJ#
        }//#GEN#[-1]#PJ#
        }
class _OMP_ParallelRegion_0{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private CyclicBarrier OMP_barrier;
        private ReentrantLock OMP_lock;

        //#BEGIN shared variables defined here
        //#END shared variables defined here
        public _OMP_ParallelRegion_0(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
            this.icv = icv;
            if ((false == Pyjama.omp_get_nested()) && (Pyjama.omp_get_level() > 0)) {
                this.OMP_threadNumber = 1;
            }else {
                this.OMP_threadNumber = thread_num;
            }
            icv.currentParallelRegionThreadNumber = this.OMP_threadNumber;
            this.OMP_inputList = inputlist;
            this.OMP_outputList = outputlist;
            this.OMP_barrier = new CyclicBarrier(this.OMP_threadNumber);
            icv.OMP_CurrentParallelRegionBarrier = new CyclicBarrier(this.OMP_threadNumber);
            icv.OMP_orderCursor = new AtomicInteger(0);
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
            //#BEGIN firstprivate reduction variables defined here
            //#END firstprivate reduction variables  defined here
            void setBarrier() {
                try {OMP_barrier.await();}
                catch (InterruptedException e) {e.printStackTrace();}
                catch (BrokenBarrierException e) {e.printStackTrace();}
            }
            MyCallable(int id, ConcurrentHashMap<String,Object> inputlist, ConcurrentHashMap<String,Object> outputlist){
                this.alias_id = id;
                this.OMP_inputList = inputlist;
                this.OMP_outputList = outputlist;
                //#BEGIN firstprivate reduction variables initialised here
                //#END firstprivate reduction variables initialised here
            }

            @Override
            public ConcurrentHashMap<String,Object> call() {
                InternalControlVariables currentThreadICV = new InternalControlVariables(icv);
                currentThreadICV.currentThreadAliasID = this.alias_id;
                PjRuntime.setCurrentThreadICV(currentThreadICV);

                
                /****User Code BEGIN***/
                {//#GEN#[-1]#PJ#
                    sb.append("A");//#GEN#[-1]#PJ#
                    PjRuntime.setBarrier();//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
                    sb.append("B");//#GEN#[-1]#PJ#
                }
                /****User Code END***/
                //BEGIN reduction procedure
                //END reduction procedure
                setBarrier();
                if (0 == this.alias_id) {
                    updateOutputListForSharedVars();
                    try {
    class OMP_AfterInvocationOf__OMP_ParallelRegion_0 implements Runnable{
        OMP_AfterInvocationOf__OMP_ParallelRegion_0(){
        }
        @Override
        public void run() {
            /****User Code BEGIN***/
            {//#GEN#[-1]#PJ#
                sb.append("C");//#GEN#[-1]#PJ#
            }
            /****User Code END***/
        }
    }
    SwingUtilities.invokeAndWait(new OMP_AfterInvocationOf__OMP_ParallelRegion_0());
} catch (InvocationTargetException e) {e.printStackTrace();}
catch (InterruptedException e) {e.printStackTrace();}

                }
                return null;
            }
        }
        public void runParallelCode() {
            for (int i = 0; i <= this.OMP_threadNumber-1; i++) {
                Callable<ConcurrentHashMap<String,Object>> slaveThread = new MyCallable(i, OMP_inputList, OMP_outputList);
                PjRuntime.submit(slaveThread);
            }
        }
    }
//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
    };//#GEN#[-1]#PJ#
}//#GEN#[-1]#PJ#
