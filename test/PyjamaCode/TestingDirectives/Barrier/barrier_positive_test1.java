package PyjamaCode.TestingDirectives.Barrier;

import pj.Pyjama;

import pj.pr.*;
import pj.PjRuntime;
import pj.Pyjama;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.SwingUtilities;
import java.lang.reflect.InvocationTargetException;

public class barrier_positive_test1 {

    double[][] dummy = null;

    /**
	 * result[0+1+2+..+threadNumber,0+1+2+..+threadNumber,0+1+2+..+threadNumber,...]
	 * */
    public int[] parallel_barrier(int threadNumber) {{
        Pyjama.omp_set_num_threads(threadNumber);
        int[] array = new int[threadNumber];
        int sum = 0;
        int[] result = new int[threadNumber];
        /*OpenMP Parallel region (#0) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);
        int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_0.put("result",result);
        inputlist__OMP_ParallelRegion_0.put("array",array);
        inputlist__OMP_ParallelRegion_0.put("threadNumber",threadNumber);
        inputlist__OMP_ParallelRegion_0.put("sum",sum);
        _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);
        _OMP_ParallelRegion_0_in.runParallelCode();
        result = (int[])outputlist__OMP_ParallelRegion_0.get("result");
        array = (int[])outputlist__OMP_ParallelRegion_0.get("array");
        threadNumber = (Integer)outputlist__OMP_ParallelRegion_0.get("threadNumber");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);
        /*OpenMP Parallel region (#0) -- END */

        return result;
    }
    }
class _OMP_ParallelRegion_0{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private CyclicBarrier OMP_barrier;
        private ReentrantLock OMP_lock;

        //#BEGIN shared variables defined here
        int[] result = null;
        int threadNumber = 0;
        int[] array = null;
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
            result = (int[])OMP_inputList.get("result");
            threadNumber = (Integer)OMP_inputList.get("threadNumber");
            array = (int[])OMP_inputList.get("array");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("result",result);
            OMP_outputList.put("array",array);
            OMP_outputList.put("threadNumber",threadNumber);
            //END update outputlist
        }
        class MyCallable implements Callable<ConcurrentHashMap<String,Object>> {
            private int alias_id;
            private ConcurrentHashMap<String, Object> OMP_inputList;
            private ConcurrentHashMap<String, Object> OMP_outputList;
            //#BEGIN private/firstprivate reduction variables defined here
            int sum = 0;
            //#END private/firstprivate reduction variables  defined here
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
                sum = (Integer)OMP_inputList.get("sum");
                //#END firstprivate reduction variables initialised here
            }

            @Override
            public ConcurrentHashMap<String,Object> call() {
                InternalControlVariables currentThreadICV = new InternalControlVariables(icv);
                currentThreadICV.currentThreadAliasID = this.alias_id;
                PjRuntime.setCurrentThreadICV(currentThreadICV);

                
                /****User Code BEGIN***/
                {
                    int ThreadID = Pyjama.omp_get_thread_num();
                    array[ThreadID] = ThreadID;
                    PjRuntime.setBarrier();

                    for (int i = 0; i < threadNumber; i++) {
                        sum += array[i];
                    }
                    result[ThreadID] = sum;
                }
                /****User Code END***/
                //BEGIN reduction procedure
                //END reduction procedure
                setBarrier();
                if (0 == this.alias_id) {
                    updateOutputListForSharedVars();
                }
                return null;
            }
        }
        public void runParallelCode() {
            for (int i = 1; i <= this.OMP_threadNumber-1; i++) {
                Callable<ConcurrentHashMap<String,Object>> slaveThread = new MyCallable(i, OMP_inputList, OMP_outputList);
                PjRuntime.submit(slaveThread);
            }
            Callable<ConcurrentHashMap<String,Object>> masterThread = new MyCallable(0, OMP_inputList, OMP_outputList);
            try {
                masterThread.call();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



}
