package PyjamaCode.TestingClauses.Reduction;

import pj.Pyjama;

import pj.pr.*;
import pj.PjRuntime;
import pj.Pyjama;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.SwingUtilities;
import java.lang.reflect.InvocationTargetException;

public class reduction_positive_test3 {

    public int parallel_for_reduction(int threadNumber, int n) {{
        Pyjama.omp_set_num_threads(threadNumber);
        int val = 1;
        /*OpenMP Parallel region (#0) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);
        int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_0.put("val",val);
        inputlist__OMP_ParallelRegion_0.put("n",n);
        _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);
        _OMP_ParallelRegion_0_in.runParallelCode();
        val = (Integer)outputlist__OMP_ParallelRegion_0.get("val");
        n = (Integer)outputlist__OMP_ParallelRegion_0.get("n");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);
        /*OpenMP Parallel region (#0) -- END */

        return val;
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
        int val = 0;
        int n = 0;
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
            val = (Integer)OMP_inputList.get("val");
            n = (Integer)OMP_inputList.get("n");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("val",val);
            OMP_outputList.put("n",n);
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
                    int OMP_WoRkShArInG_PRIVATE_0val = val;
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    int i=0;
                    int OMP_iterator = 0;
                    int OMP_end = (int)((n)-(0))/(1);
                    if (((n)-(0))%(1) == 0) {
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
                            OMP_WoRkShArInG_PRIVATE_0val = OMP_WoRkShArInG_PRIVATE_0val * 2;
                        }if (OMP_end == OMP_local_iterator) {
                            //BEGIN lastprivate variables value set
                            //END lastprivate variables value set
                        }
                    }
                    //BEGIN  reduction
                    PjRuntime.reductionLockForWorksharing.lock();
                    val=val*OMP_WoRkShArInG_PRIVATE_0val;
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




    public int parallel_reduction(int threadNumber) {{
        Pyjama.omp_set_num_threads(threadNumber);
        int val = 1;
        /*OpenMP Parallel region (#1) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_1 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_1 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_1);
        int _threadNum__OMP_ParallelRegion_1 = icv__OMP_ParallelRegion_1.nthreads_var.get(icv__OMP_ParallelRegion_1.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_1.put("val",val);
        outputlist__OMP_ParallelRegion_1.put("val",val);
        _OMP_ParallelRegion_1 _OMP_ParallelRegion_1_in = new _OMP_ParallelRegion_1(_threadNum__OMP_ParallelRegion_1,icv__OMP_ParallelRegion_1,inputlist__OMP_ParallelRegion_1,outputlist__OMP_ParallelRegion_1);
        _OMP_ParallelRegion_1_in.runParallelCode();
        val = (Integer)outputlist__OMP_ParallelRegion_1.get("val");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_1);
        /*OpenMP Parallel region (#1) -- END */

        return val;
    }
    }
class _OMP_ParallelRegion_1{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private CyclicBarrier OMP_barrier;
        private ReentrantLock OMP_lock;

        //#BEGIN shared variables defined here
        //#END shared variables defined here
        public _OMP_ParallelRegion_1(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
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
            //#BEGIN private/firstprivate reduction variables defined here
            int val = 0;
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
                val = (Integer)OMP_inputList.get("val");
                //#END firstprivate reduction variables initialised here
            }

            @Override
            public ConcurrentHashMap<String,Object> call() {
                InternalControlVariables currentThreadICV = new InternalControlVariables(icv);
                currentThreadICV.currentThreadAliasID = this.alias_id;
                PjRuntime.setCurrentThreadICV(currentThreadICV);

                
                /****User Code BEGIN***/
                {
                    val *= 2;
                }
                /****User Code END***/
                //BEGIN reduction procedure
                synchronized(OMP_outputList){ OMP_outputList.put("val", ((Integer)OMP_outputList.get("val")*val)); }
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




    public int parallel_sections_reduction(int threadNumber) {{
        Pyjama.omp_set_num_threads(threadNumber);
        int val = 1;
        /*OpenMP Parallel region (#2) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_2 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_2 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_2);
        int _threadNum__OMP_ParallelRegion_2 = icv__OMP_ParallelRegion_2.nthreads_var.get(icv__OMP_ParallelRegion_2.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_2.put("val",val);
        _OMP_ParallelRegion_2 _OMP_ParallelRegion_2_in = new _OMP_ParallelRegion_2(_threadNum__OMP_ParallelRegion_2,icv__OMP_ParallelRegion_2,inputlist__OMP_ParallelRegion_2,outputlist__OMP_ParallelRegion_2);
        _OMP_ParallelRegion_2_in.runParallelCode();
        val = (Integer)outputlist__OMP_ParallelRegion_2.get("val");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_2);
        /*OpenMP Parallel region (#2) -- END */

        return val;
    }
    }
class _OMP_ParallelRegion_2{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private CyclicBarrier OMP_barrier;
        private ReentrantLock OMP_lock;

        //#BEGIN shared variables defined here
        int val = 0;
        //#END shared variables defined here
        public _OMP_ParallelRegion_2(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
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
            val = (Integer)OMP_inputList.get("val");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("val",val);
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
                /*OpenMP Work Share region (#1) -- START */
                
                {//#BEGIN firstprivate lastprivate reduction variables defined and initialized here
                    int OMP_WoRkShArInG_PRIVATE_1val = val;
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    int _OMP_VANCY_ITERATOR_=0;
                    int OMP_iterator = 0;
                    int OMP_end = (int)((2)-(0))/(1);
                    if (((2)-(0))%(1) == 0) {
                        OMP_end = OMP_end - 1;
                    }
                    if (0 == Pyjama.omp_get_thread_num()) {
                        PjRuntime.get_OMP_loopCursor().getAndSet(0);}
                    PjRuntime.setBarrier();
                    while ((OMP_iterator = PjRuntime.get_OMP_loopCursor().getAndAdd(1)) <= OMP_end) {
                        for (int OMP_local_iterator = OMP_iterator; OMP_local_iterator<OMP_iterator+1 && OMP_local_iterator<=OMP_end; OMP_local_iterator++){
                            _OMP_VANCY_ITERATOR_ = 0 + OMP_local_iterator * (1);
                            switch(_OMP_VANCY_ITERATOR_) {
                                case 0:
                                    {
                                        OMP_WoRkShArInG_PRIVATE_1val = OMP_WoRkShArInG_PRIVATE_1val * 2;
                                    }
                                    break;
                                case 1:
                                    {
                                        OMP_WoRkShArInG_PRIVATE_1val = OMP_WoRkShArInG_PRIVATE_1val * 2;
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
                    val=val*OMP_WoRkShArInG_PRIVATE_1val;
                    PjRuntime.reductionLockForWorksharing.unlock();//END reduction
                    PjRuntime.setBarrier();
                }

                PjRuntime.setBarrier();
                /*OpenMP Work Share region (#1) -- END */

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
