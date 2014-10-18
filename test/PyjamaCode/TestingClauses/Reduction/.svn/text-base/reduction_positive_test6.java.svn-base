package PyjamaCode.TestingClauses.Reduction;//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
import pj.parser.ast.visitor.DummyClassToDetermineVariableType;//#GEN#[-1]#PJ#
import pj.Pyjama;//#GEN#[-1]#PJ#
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
 * 0^0=0
 * 0^1=1
 * 1^0=1
 * 1^1=0
 * *///#GEN#[-1]#PJ#
public class reduction_positive_test6 {//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
    /**
	 * return 10-1
	 * *///#GEN#[-1]#PJ#
    public int parallel_for_reduction(int threadNumber, int n) {{//#GEN#[-1]#PJ#
        Pyjama.omp_set_num_threads(threadNumber);//#GEN#[-1]#PJ#
        int result = 1;//#GEN#[-1]#PJ#
        /*OpenMP Parallel region (#0) -- START *///#GEN#[-1]#PJ#
        InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();//#GEN#[-1]#PJ#
        InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);//#GEN#[-1]#PJ#
        int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);//#GEN#[-1]#PJ#
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
        inputlist__OMP_ParallelRegion_0.put("n",n);
        inputlist__OMP_ParallelRegion_0.put("result",result);
        _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);//#GEN#[-1]#PJ#
        _OMP_ParallelRegion_0_in.runParallelCode();//#GEN#[-1]#PJ#
        n = (Integer)outputlist__OMP_ParallelRegion_0.get("n");
        result = (Integer)outputlist__OMP_ParallelRegion_0.get("result");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);//#GEN#[-1]#PJ#
        /*OpenMP Parallel region (#0) -- END *///#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
        return result;//#GEN#[-1]#PJ#
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
        int n = 0;
        int result = 0;
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
            n = (Integer)OMP_inputList.get("n");
            result = (Integer)OMP_inputList.get("result");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("n",n);
            OMP_outputList.put("result",result);
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
                    /*OpenMP Work Share region (#0) -- START *///#GEN#[-1]#PJ#
                    
                {//#BEGIN firstprivate lastprivate reduction variables defined and initialized here
                    int OMP_WoRkShArInG_PRIVATE_result = result;
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    int i=0;
                    int OMP_iterator = 0;
                    int OMP_end = (int)((n)-(1))/(1);
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
                        i = 1 + OMP_local_iterator * (1);
                        {//#GEN#[-1]#PJ#
                            OMP_WoRkShArInG_PRIVATE_result ^= (int) Math.pow(2, i) - 1;//#GEN#[-1]#PJ#
                        }if (OMP_end == OMP_local_iterator) {
                            //BEGIN lastprivate variables value set
                            //END lastprivate variables value set
                        }
                    }
                    //BEGIN  reduction
                    PjRuntime.reductionLockForWorksharing.lock();
                    result=result^OMP_WoRkShArInG_PRIVATE_result;
                    PjRuntime.reductionLockForWorksharing.unlock();//END reduction
                    PjRuntime.setBarrier();
                }
//#GEN#[-1]#PJ#
                    PjRuntime.setBarrier();//#GEN#[-1]#PJ#
                    /*OpenMP Work Share region (#0) -- END *///#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
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
//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
    public int parallel_reduction(int threadNumber) {{//#GEN#[-1]#PJ#
        Pyjama.omp_set_num_threads(threadNumber);//#GEN#[-1]#PJ#
        int result = 1;//#GEN#[-1]#PJ#
        /*OpenMP Parallel region (#1) -- START *///#GEN#[-1]#PJ#
        InternalControlVariables icv_previous__OMP_ParallelRegion_1 = PjRuntime.getCurrentThreadICV();//#GEN#[-1]#PJ#
        InternalControlVariables icv__OMP_ParallelRegion_1 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_1);//#GEN#[-1]#PJ#
        int _threadNum__OMP_ParallelRegion_1 = icv__OMP_ParallelRegion_1.nthreads_var.get(icv__OMP_ParallelRegion_1.levels_var);//#GEN#[-1]#PJ#
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
        inputlist__OMP_ParallelRegion_1.put("result",result);
        outputlist__OMP_ParallelRegion_1.put("result",result);
        _OMP_ParallelRegion_1 _OMP_ParallelRegion_1_in = new _OMP_ParallelRegion_1(_threadNum__OMP_ParallelRegion_1,icv__OMP_ParallelRegion_1,inputlist__OMP_ParallelRegion_1,outputlist__OMP_ParallelRegion_1);//#GEN#[-1]#PJ#
        _OMP_ParallelRegion_1_in.runParallelCode();//#GEN#[-1]#PJ#
        result = (Integer)outputlist__OMP_ParallelRegion_1.get("result");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_1);//#GEN#[-1]#PJ#
        /*OpenMP Parallel region (#1) -- END *///#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
        return result;//#GEN#[-1]#PJ#
    }//#GEN#[-1]#PJ#
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
            //#BEGIN firstprivate reduction variables defined here
            int result = 0;
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
                result = (Integer)OMP_inputList.get("result");
                //#END firstprivate reduction variables initialised here
            }

            @Override
            public ConcurrentHashMap<String,Object> call() {
                InternalControlVariables currentThreadICV = new InternalControlVariables(icv);
                currentThreadICV.currentThreadAliasID = this.alias_id;
                PjRuntime.setCurrentThreadICV(currentThreadICV);

                
                /****User Code BEGIN***/
                {//#GEN#[-1]#PJ#
                    int index = Pyjama.omp_get_thread_num();//#GEN#[-1]#PJ#
                    result ^= (int) Math.pow(2, index) - 1;//#GEN#[-1]#PJ#
                }
                /****User Code END***/
                //BEGIN reduction procedure
                synchronized(OMP_outputList){ OMP_outputList.put("result", ((Integer)OMP_outputList.get("result")^result)); }
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
//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
    public int parallel_sections_reduction(int threadNumber) {{//#GEN#[-1]#PJ#
        Pyjama.omp_set_num_threads(threadNumber);//#GEN#[-1]#PJ#
        int result = 1;//#GEN#[-1]#PJ#
        /*OpenMP Parallel region (#2) -- START *///#GEN#[-1]#PJ#
        InternalControlVariables icv_previous__OMP_ParallelRegion_2 = PjRuntime.getCurrentThreadICV();//#GEN#[-1]#PJ#
        InternalControlVariables icv__OMP_ParallelRegion_2 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_2);//#GEN#[-1]#PJ#
        int _threadNum__OMP_ParallelRegion_2 = icv__OMP_ParallelRegion_2.nthreads_var.get(icv__OMP_ParallelRegion_2.levels_var);//#GEN#[-1]#PJ#
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
        inputlist__OMP_ParallelRegion_2.put("result",result);
        _OMP_ParallelRegion_2 _OMP_ParallelRegion_2_in = new _OMP_ParallelRegion_2(_threadNum__OMP_ParallelRegion_2,icv__OMP_ParallelRegion_2,inputlist__OMP_ParallelRegion_2,outputlist__OMP_ParallelRegion_2);//#GEN#[-1]#PJ#
        _OMP_ParallelRegion_2_in.runParallelCode();//#GEN#[-1]#PJ#
        result = (Integer)outputlist__OMP_ParallelRegion_2.get("result");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_2);//#GEN#[-1]#PJ#
        /*OpenMP Parallel region (#2) -- END *///#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
        return result;//#GEN#[-1]#PJ#
    }//#GEN#[-1]#PJ#
    }
class _OMP_ParallelRegion_2{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private CyclicBarrier OMP_barrier;
        private ReentrantLock OMP_lock;

        //#BEGIN shared variables defined here
        int result = 0;
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
            result = (Integer)OMP_inputList.get("result");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("result",result);
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
                    /*OpenMP Work Share region (#1) -- START *///#GEN#[-1]#PJ#
                    
                {//#BEGIN firstprivate lastprivate reduction variables defined and initialized here
                    int OMP_WoRkShArInG_PRIVATE_result = result;
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    int _omp_i_2=0;
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
                            _omp_i_2 = 0 + OMP_local_iterator * (1);
                            {//#GEN#[-1]#PJ#
                                switch(_omp_i_2) {//#GEN#[-1]#PJ#
                                    case 0://#GEN#[-1]#PJ#
                                        {//#GEN#[-1]#PJ#
                                            int index = Pyjama.omp_get_thread_num();//#GEN#[-1]#PJ#
                                            OMP_WoRkShArInG_PRIVATE_result ^= (int) Math.pow(2, index) - 1;//#GEN#[-1]#PJ#
                                        }//#GEN#[-1]#PJ#
                                        break;//#GEN#[-1]#PJ#
                                    case 1://#GEN#[-1]#PJ#
                                        {//#GEN#[-1]#PJ#
                                            int index = Pyjama.omp_get_thread_num();//#GEN#[-1]#PJ#
                                            OMP_WoRkShArInG_PRIVATE_result ^= (int) Math.pow(2, index) - 1;//#GEN#[-1]#PJ#
                                        }//#GEN#[-1]#PJ#
                                        break;//#GEN#[-1]#PJ#
                                }//#GEN#[-1]#PJ#
                            }if (OMP_end == OMP_local_iterator) {
                                //BEGIN lastprivate variables value set
                                //END lastprivate variables value set
                            }

                        }
                    }
                    //BEGIN  reduction
                    PjRuntime.reductionLockForWorksharing.lock();
                    result=result^OMP_WoRkShArInG_PRIVATE_result;
                    PjRuntime.reductionLockForWorksharing.unlock();//END reduction
                    PjRuntime.setBarrier();
                }
//#GEN#[-1]#PJ#
                    PjRuntime.setBarrier();//#GEN#[-1]#PJ#
                    /*OpenMP Work Share region (#1) -- END *///#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
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
//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
}//#GEN#[-1]#PJ#
