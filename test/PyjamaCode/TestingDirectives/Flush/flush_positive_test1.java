package PyjamaCode.TestingDirectives.Flush;

import pj.Pyjama;

import pj.pr.*;
import pj.PjRuntime;
import pj.Pyjama;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.SwingUtilities;
import java.lang.reflect.InvocationTargetException;

public class flush_positive_test1 {

    /**
	 *  return data should be 2
	 *  the parallel section running in disordered, the initial flag is 0; unless section 1 change flag,
	 *  section 2 would never running if flag is flsuhed by written back into memory. 
	 * */
    public int parallel_section_flush(int threadNumber) {{
        Pyjama.omp_set_num_threads(threadNumber);
        int flag = 0;
        int[] data = new int[] { 0 };
        /*OpenMP Parallel region (#0) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);
        int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_0.put("flag",flag);
        inputlist__OMP_ParallelRegion_0.put("data",data);
        _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);
        _OMP_ParallelRegion_0_in.runParallelCode();
        flag = (Integer)outputlist__OMP_ParallelRegion_0.get("flag");
        data = (int[])outputlist__OMP_ParallelRegion_0.get("data");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);
        /*OpenMP Parallel region (#0) -- END */

        return data[0];
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
        int flag = 0;
        int[] data = null;
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
            flag = (Integer)OMP_inputList.get("flag");
            data = (int[])OMP_inputList.get("data");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("flag",flag);
            OMP_outputList.put("data",data);
            //END update outputlist
        }
        class MyCallable implements Callable<ConcurrentHashMap<String,Object>> {
            private int alias_id;
            private ConcurrentHashMap<String, Object> OMP_inputList;
            private ConcurrentHashMap<String, Object> OMP_outputList;
            //#BEGIN private/firstprivate reduction variables defined here
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
                    int _OMP_VANCY_ITERATOR_=0;
                    int OMP_iterator = 0;
                    int OMP_end = (int)((2)-(0))/(1);
                    if (0 == Pyjama.omp_get_thread_num()) {
                        PjRuntime.get_OMP_loopCursor().getAndSet(0);}
                    PjRuntime.setBarrier();
                    while ((OMP_iterator = PjRuntime.get_OMP_loopCursor().getAndAdd(1)) <= OMP_end) {
                        for (int OMP_local_iterator = OMP_iterator; OMP_local_iterator<OMP_iterator+1 && OMP_local_iterator<=OMP_end; OMP_local_iterator++){
                            _OMP_VANCY_ITERATOR_ = 0 + OMP_local_iterator * (1);
                            switch(_OMP_VANCY_ITERATOR_) {
                                case 0:
                                    {
                                        data[0] = 1;
                                        PjRuntime.flushMemory();

                                        flag = 1;
                                        PjRuntime.flushMemory();

                                    }
                                    break;
                                case 1:
                                    {
                                        while (flag == 0) {
                                            PjRuntime.flushMemory();

                                        }
                                        PjRuntime.flushMemory();

                                        PjRuntime.OMP_lock.lock();
                                        try {
                                            data[0]++;} finally {
                                        PjRuntime.OMP_lock.unlock();
                                    }

                                }
                                break;
                            default:
                                break;
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
