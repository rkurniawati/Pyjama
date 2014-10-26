package PyjamaCode.TestingDirectives.LoopFor;

import pj.Pyjama;

import pj.pr.*;
import pj.PjRuntime;
import pj.Pyjama;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.SwingUtilities;
import java.lang.reflect.InvocationTargetException;

public class loopFor_positive_test3 {

    /**
	 * 
	 * */
    public int[] parallel_loopFor(int threadCount, int InitialValue, int EndValue, int Stride) {{
        Pyjama.omp_set_num_threads(threadCount);
        int[] array = new int[(Math.abs(InitialValue) + Math.abs(EndValue)) + 1];
        int startIndex = 0;
        if (InitialValue >= 0 && EndValue >= 0) startIndex = 0;
        if (InitialValue < 0 && EndValue >= 0) startIndex = Math.abs(InitialValue);
        if (InitialValue >= 0 && EndValue < 0) startIndex = Math.abs(EndValue);
        if (InitialValue < 0 && EndValue < 0) startIndex = Math.max(Math.abs(InitialValue), Math.abs(EndValue));
        /*OpenMP Parallel region (#0) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);
        int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_0.put("InitialValue",InitialValue);
        inputlist__OMP_ParallelRegion_0.put("Stride",Stride);
        inputlist__OMP_ParallelRegion_0.put("array",array);
        inputlist__OMP_ParallelRegion_0.put("startIndex",startIndex);
        inputlist__OMP_ParallelRegion_0.put("EndValue",EndValue);
        _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);
        _OMP_ParallelRegion_0_in.runParallelCode();
        InitialValue = (Integer)outputlist__OMP_ParallelRegion_0.get("InitialValue");
        Stride = (Integer)outputlist__OMP_ParallelRegion_0.get("Stride");
        array = (int[])outputlist__OMP_ParallelRegion_0.get("array");
        startIndex = (Integer)outputlist__OMP_ParallelRegion_0.get("startIndex");
        EndValue = (Integer)outputlist__OMP_ParallelRegion_0.get("EndValue");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);
        /*OpenMP Parallel region (#0) -- END */

        return array;
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
        int startIndex = 0;
        int EndValue = 0;
        int InitialValue = 0;
        int[] array = null;
        int Stride = 0;
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
            startIndex = (Integer)OMP_inputList.get("startIndex");
            EndValue = (Integer)OMP_inputList.get("EndValue");
            InitialValue = (Integer)OMP_inputList.get("InitialValue");
            array = (int[])OMP_inputList.get("array");
            Stride = (Integer)OMP_inputList.get("Stride");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("InitialValue",InitialValue);
            OMP_outputList.put("Stride",Stride);
            OMP_outputList.put("array",array);
            OMP_outputList.put("startIndex",startIndex);
            OMP_outputList.put("EndValue",EndValue);
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
                /*OpenMP Work Share region (#0) -- START */
                
                {//#BEGIN firstprivate lastprivate reduction variables defined and initialized here
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    int i=0;
                    int OMP_iterator = 0;
                    int OMP_end = (int)((EndValue)-(InitialValue))/(Stride);
                    int __omp_loop_thread_num = Pyjama.omp_get_thread_num();
                    int __omp_loop_num_threads = Pyjama.omp_get_num_threads();
                    for (OMP_iterator=__omp_loop_thread_num*1; OMP_iterator<=OMP_end && 1>0; OMP_iterator=OMP_iterator+__omp_loop_num_threads*1) {
                        for (int OMP_local_iterator = OMP_iterator; OMP_local_iterator<OMP_iterator+1 && OMP_local_iterator<=OMP_end; OMP_local_iterator++){
                            i = InitialValue + OMP_local_iterator * (Stride);
                            {
                                array[startIndex + i] = i;
                            }if (OMP_end == OMP_local_iterator) {
                                //BEGIN lastprivate variables value set
                                //END lastprivate variables value set
                            }
                        }
                    }
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
