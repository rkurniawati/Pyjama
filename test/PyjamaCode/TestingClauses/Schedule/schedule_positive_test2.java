//Pyjama compiler version:v1.5.3
package PyjamaCode.TestingClauses.Schedule;

import pj.Pyjama;

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

public class schedule_positive_test2 {

    public int[] parallel_for_schedule(int threadNumber, int arraySize) {{
        Pyjama.omp_set_num_threads(threadNumber);
        int[] array = new int[threadNumber];
        /*OpenMP Parallel region (#0) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);
        int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_0.put("arraySize",arraySize);
        inputlist__OMP_ParallelRegion_0.put("array",array);
        inputlist__OMP_ParallelRegion_0.put("threadNumber",threadNumber);
        _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);
        _OMP_ParallelRegion_0_in.runParallelCode();
        arraySize = (Integer)outputlist__OMP_ParallelRegion_0.get("arraySize");
        array = (int[])outputlist__OMP_ParallelRegion_0.get("array");
        threadNumber = (Integer)outputlist__OMP_ParallelRegion_0.get("threadNumber");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);
        RuntimeException OMP_ee_0 = (RuntimeException) _OMP_ParallelRegion_0_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee_0 != null) {throw OMP_ee_0;}
        /*OpenMP Parallel region (#0) -- END */

        return array;
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
                int[] array = null;
                int threadNumber = 0;
                int arraySize = 0;
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
                    array = (int[])OMP_inputList.get("array");
                    threadNumber = (Integer)OMP_inputList.get("threadNumber");
                    arraySize = (Integer)OMP_inputList.get("arraySize");
                    //#END shared variables initialised here
                }

                private void updateOutputListForSharedVars() {
                    //BEGIN update outputlist
                    OMP_outputList.put("arraySize",arraySize);
                    OMP_outputList.put("array",array);
                    OMP_outputList.put("threadNumber",threadNumber);
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
                        int OMP_end = (int)((arraySize)-(0))/(1);
                        if (((arraySize)-(0))%(1) == 0) {
                            OMP_end = OMP_end - 1;
                        }
                        if (0 == Pyjama.omp_get_thread_num()) {
                            PjRuntime.get_OMP_loopCursor().getAndSet(0);}
                        PjRuntime.setBarrier();
                        while ((OMP_iterator = PjRuntime.get_OMP_loopCursor().getAndAdd(1)) <= OMP_end) {
                            for (int OMP_local_iterator = OMP_iterator; OMP_local_iterator<OMP_iterator+1 && OMP_local_iterator<=OMP_end; OMP_local_iterator++){
                                i = 0 + OMP_local_iterator * (1);
                                {
                                    int threadId = Pyjama.omp_get_thread_num();
                                    PjRuntime.OMP_lock.lock();
                                    try {
                                        {
                                            array[0] += 1;
                                        }} finally {
                                    PjRuntime.OMP_lock.unlock();
                                }

                            }if (OMP_end == OMP_local_iterator) {
                                //BEGIN lastprivate variables value set
                                //END lastprivate variables value set
                            }

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
                            PjRuntime.reset_OMP_orderCursor();
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




    public int[] parallel_for_schedule(int threadNumber, int arraySize, int chunkSize) {{
        Pyjama.omp_set_num_threads(threadNumber);
        int[] array = new int[threadNumber];
        /*OpenMP Parallel region (#1) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_1 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_1 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_1);
        int _threadNum__OMP_ParallelRegion_1 = icv__OMP_ParallelRegion_1.nthreads_var.get(icv__OMP_ParallelRegion_1.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_1.put("chunkSize",chunkSize);
        inputlist__OMP_ParallelRegion_1.put("threadNumber",threadNumber);
        inputlist__OMP_ParallelRegion_1.put("arraySize",arraySize);
        inputlist__OMP_ParallelRegion_1.put("array",array);
        _OMP_ParallelRegion_1 _OMP_ParallelRegion_1_in = new _OMP_ParallelRegion_1(_threadNum__OMP_ParallelRegion_1,icv__OMP_ParallelRegion_1,inputlist__OMP_ParallelRegion_1,outputlist__OMP_ParallelRegion_1);
        _OMP_ParallelRegion_1_in.runParallelCode();
        chunkSize = (Integer)outputlist__OMP_ParallelRegion_1.get("chunkSize");
        threadNumber = (Integer)outputlist__OMP_ParallelRegion_1.get("threadNumber");
        arraySize = (Integer)outputlist__OMP_ParallelRegion_1.get("arraySize");
        array = (int[])outputlist__OMP_ParallelRegion_1.get("array");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_1);
        RuntimeException OMP_ee_1 = (RuntimeException) _OMP_ParallelRegion_1_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee_1 != null) {throw OMP_ee_1;}
        /*OpenMP Parallel region (#1) -- END */

        return array;
    }
    }
        class _OMP_ParallelRegion_1{
                private int OMP_threadNumber = 1;
                private InternalControlVariables icv;
                private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
                private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
                private ReentrantLock OMP_lock;
                private ParIterator<?> OMP__ParIteratorCreator;
                public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

                //#BEGIN shared variables defined here
                int chunkSize = 0;
                int[] array = null;
                int threadNumber = 0;
                int arraySize = 0;
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
                    chunkSize = (Integer)OMP_inputList.get("chunkSize");
                    array = (int[])OMP_inputList.get("array");
                    threadNumber = (Integer)OMP_inputList.get("threadNumber");
                    arraySize = (Integer)OMP_inputList.get("arraySize");
                    //#END shared variables initialised here
                }

                private void updateOutputListForSharedVars() {
                    //BEGIN update outputlist
                    OMP_outputList.put("chunkSize",chunkSize);
                    OMP_outputList.put("threadNumber",threadNumber);
                    OMP_outputList.put("arraySize",arraySize);
                    OMP_outputList.put("array",array);
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
                            /*OpenMP Work Share region (#1) -- START */
                            
                {//#BEGIN firstprivate lastprivate reduction variables defined and initialized here
                    int OMP_WoRkShArInG_PRIVATE_1chunkSize = chunkSize;
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    try{
                        int i=0;
                        int OMP_iterator = 0;
                        int OMP_end = (int)((arraySize)-(0))/(1);
                        if (((arraySize)-(0))%(1) == 0) {
                            OMP_end = OMP_end - 1;
                        }
                        if (0 == Pyjama.omp_get_thread_num()) {
                            PjRuntime.get_OMP_loopCursor().getAndSet(0);}
                        PjRuntime.setBarrier();
                        while ((OMP_iterator = PjRuntime.get_OMP_loopCursor().getAndAdd(chunkSize)) <= OMP_end) {
                            for (int OMP_local_iterator = OMP_iterator; OMP_local_iterator<OMP_iterator+chunkSize && OMP_local_iterator<=OMP_end; OMP_local_iterator++){
                                i = 0 + OMP_local_iterator * (1);
                                {
                                    int threadId = Pyjama.omp_get_thread_num();
                                    PjRuntime.OMP_lock.lock();
                                    try {
                                        {
                                            array[0] += 1;
                                        }} finally {
                                    PjRuntime.OMP_lock.unlock();
                                }

                            }if (OMP_end == OMP_local_iterator) {
                                //BEGIN lastprivate variables value set
                                //END lastprivate variables value set
                            }

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
                            PjRuntime.reset_OMP_orderCursor();
                            /*OpenMP Work Share region (#1) -- END */

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



}
