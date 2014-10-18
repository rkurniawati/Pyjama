package PyjamaCode.TestingComplex;//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
import pj.parser.ast.visitor.DummyClassToDetermineVariableType;//#GEN#[-1]#PJ#
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
public class complex_positive_test1 {//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
    public double[][] complex_test1(int threadNumber) {{//#GEN#[-1]#PJ#
        Pyjama.omp_set_num_threads(threadNumber);//#GEN#[-1]#PJ#
        int NI = 32;//#GEN#[-1]#PJ#
        int NJ = 32;//#GEN#[-1]#PJ#
        int NK = 32;//#GEN#[-1]#PJ#
        int NL = 32;//#GEN#[-1]#PJ#
        int alpha = 32412;//#GEN#[-1]#PJ#
        int beta = 2123;//#GEN#[-1]#PJ#
        double[][] a = new double[NI][NJ];//#GEN#[-1]#PJ#
        double[][] b = new double[NI][NJ];//#GEN#[-1]#PJ#
        double[][] c = new double[NI][NJ];//#GEN#[-1]#PJ#
        double[][] d = new double[NI][NJ];//#GEN#[-1]#PJ#
        double[][] tmp = new double[NI][NJ];//#GEN#[-1]#PJ#
        for (int i = 0; i < NI; i++) for (int j = 0; j < NK; j++) a[i][j] = ((double) i * j) / NI;//#GEN#[-1]#PJ#
        for (int i = 0; i < NK; i++) for (int j = 0; j < NJ; j++) b[i][j] = ((double) i * (j + 1)) / NJ;//#GEN#[-1]#PJ#
        for (int i = 0; i < NL; i++) for (int j = 0; j < NJ; j++) c[i][j] = ((double) i * (j + 3)) / NL;//#GEN#[-1]#PJ#
        for (int i = 0; i < NI; i++) for (int j = 0; j < NL; j++) d[i][j] = ((double) i * (j + 2)) / NK;//#GEN#[-1]#PJ#
        long pre = System.currentTimeMillis();//#GEN#[-1]#PJ#
        /*OpenMP Parallel region (#0) -- START *///#GEN#[-1]#PJ#
        InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();//#GEN#[-1]#PJ#
        InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);//#GEN#[-1]#PJ#
        int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);//#GEN#[-1]#PJ#
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
        inputlist__OMP_ParallelRegion_0.put("NI",NI);
        inputlist__OMP_ParallelRegion_0.put("NJ",NJ);
        inputlist__OMP_ParallelRegion_0.put("NK",NK);
        inputlist__OMP_ParallelRegion_0.put("a",a);
        inputlist__OMP_ParallelRegion_0.put("b",b);
        inputlist__OMP_ParallelRegion_0.put("tmp",tmp);
        inputlist__OMP_ParallelRegion_0.put("alpha",alpha);
        _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);//#GEN#[-1]#PJ#
        _OMP_ParallelRegion_0_in.runParallelCode();//#GEN#[-1]#PJ#
        NI = (Integer)outputlist__OMP_ParallelRegion_0.get("NI");
        NJ = (Integer)outputlist__OMP_ParallelRegion_0.get("NJ");
        NK = (Integer)outputlist__OMP_ParallelRegion_0.get("NK");
        a = (double[][])outputlist__OMP_ParallelRegion_0.get("a");
        b = (double[][])outputlist__OMP_ParallelRegion_0.get("b");
        tmp = (double[][])outputlist__OMP_ParallelRegion_0.get("tmp");
        alpha = (Integer)outputlist__OMP_ParallelRegion_0.get("alpha");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);//#GEN#[-1]#PJ#
        /*OpenMP Parallel region (#0) -- END *///#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
        /*OpenMP Parallel region (#1) -- START *///#GEN#[-1]#PJ#
        InternalControlVariables icv_previous__OMP_ParallelRegion_1 = PjRuntime.getCurrentThreadICV();//#GEN#[-1]#PJ#
        InternalControlVariables icv__OMP_ParallelRegion_1 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_1);//#GEN#[-1]#PJ#
        int _threadNum__OMP_ParallelRegion_1 = icv__OMP_ParallelRegion_1.nthreads_var.get(icv__OMP_ParallelRegion_1.levels_var);//#GEN#[-1]#PJ#
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
        inputlist__OMP_ParallelRegion_1.put("NI",NI);
        inputlist__OMP_ParallelRegion_1.put("NL",NL);
        inputlist__OMP_ParallelRegion_1.put("NJ",NJ);
        inputlist__OMP_ParallelRegion_1.put("d",d);
        inputlist__OMP_ParallelRegion_1.put("tmp",tmp);
        inputlist__OMP_ParallelRegion_1.put("c",c);
        inputlist__OMP_ParallelRegion_1.put("beta",beta);
        _OMP_ParallelRegion_1 _OMP_ParallelRegion_1_in = new _OMP_ParallelRegion_1(_threadNum__OMP_ParallelRegion_1,icv__OMP_ParallelRegion_1,inputlist__OMP_ParallelRegion_1,outputlist__OMP_ParallelRegion_1);//#GEN#[-1]#PJ#
        _OMP_ParallelRegion_1_in.runParallelCode();//#GEN#[-1]#PJ#
        NI = (Integer)outputlist__OMP_ParallelRegion_1.get("NI");
        NL = (Integer)outputlist__OMP_ParallelRegion_1.get("NL");
        NJ = (Integer)outputlist__OMP_ParallelRegion_1.get("NJ");
        d = (double[][])outputlist__OMP_ParallelRegion_1.get("d");
        tmp = (double[][])outputlist__OMP_ParallelRegion_1.get("tmp");
        c = (double[][])outputlist__OMP_ParallelRegion_1.get("c");
        beta = (Integer)outputlist__OMP_ParallelRegion_1.get("beta");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_1);//#GEN#[-1]#PJ#
        /*OpenMP Parallel region (#1) -- END *///#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
        long pos = System.currentTimeMillis();//#GEN#[-1]#PJ#
        long time = pos - pre;//#GEN#[-1]#PJ#
        return d;//#GEN#[-1]#PJ#
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
        int NI = 0;
        int NJ = 0;
        int NK = 0;
        double[][] a = null;
        double[][] b = null;
        double[][] tmp = null;
        int alpha = 0;
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
            NI = (Integer)OMP_inputList.get("NI");
            NJ = (Integer)OMP_inputList.get("NJ");
            NK = (Integer)OMP_inputList.get("NK");
            a = (double[][])OMP_inputList.get("a");
            b = (double[][])OMP_inputList.get("b");
            tmp = (double[][])OMP_inputList.get("tmp");
            alpha = (Integer)OMP_inputList.get("alpha");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("NI",NI);
            OMP_outputList.put("NJ",NJ);
            OMP_outputList.put("NK",NK);
            OMP_outputList.put("a",a);
            OMP_outputList.put("b",b);
            OMP_outputList.put("tmp",tmp);
            OMP_outputList.put("alpha",alpha);
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
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    int i=0;
                    int OMP_iterator = 0;
                    int OMP_end = (int)((NI)-(0))/(1);
                    if (((NI)-(0))%(1) == 0) {
                        OMP_end = OMP_end - 1;
                    }
                    int OMP_Chunk_Starting_point = 0;
                    int OMP_Default_chunkSize_autoGenerated = (OMP_end+1)/Pyjama.omp_get_num_threads();
                    if (Pyjama.omp_get_thread_num() < (OMP_end+1) % Pyjama.omp_get_num_threads()) {
                        ++OMP_Default_chunkSize_autoGenerated;
                        OMP_Chunk_Starting_point = Pyjama.omp_get_thread_num() * OMP_Default_chunkSize_autoGenerated;
                    } else {
                        OMP_Chunk_Starting_point = Pyjama.omp_get_thread_num() * OMP_Default_chunkSize_autoGenerated + (OMP_end+1) % Pyjama.omp_get_num_threads();
                    }
                    for (OMP_iterator=OMP_Chunk_Starting_point; OMP_iterator<OMP_Chunk_Starting_point+OMP_Default_chunkSize_autoGenerated && OMP_Default_chunkSize_autoGenerated>0; ++OMP_iterator) {
                        i = 0 + OMP_iterator * (1);
                        {//#GEN#[-1]#PJ#
                            for (int j = 0; j < NJ; j++) {//#GEN#[-1]#PJ#
                                tmp[i][j] = 0;//#GEN#[-1]#PJ#
                                for (int k = 0; k < NK; ++k) {//#GEN#[-1]#PJ#
                                    tmp[i][j] += alpha * a[i][k] * b[k][j];//#GEN#[-1]#PJ#
                                }//#GEN#[-1]#PJ#
                            }//#GEN#[-1]#PJ#
                        }if (OMP_end == OMP_iterator) {
                            //BEGIN lastprivate variables value set
                            //END lastprivate variables value set
                        }
                    }
                    //BEGIN  reduction
                    PjRuntime.reductionLockForWorksharing.lock();
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

class _OMP_ParallelRegion_1{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private CyclicBarrier OMP_barrier;
        private ReentrantLock OMP_lock;

        //#BEGIN shared variables defined here
        int NI = 0;
        int NL = 0;
        int NJ = 0;
        double[][] d = null;
        double[][] tmp = null;
        double[][] c = null;
        int beta = 0;
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
            NI = (Integer)OMP_inputList.get("NI");
            NL = (Integer)OMP_inputList.get("NL");
            NJ = (Integer)OMP_inputList.get("NJ");
            d = (double[][])OMP_inputList.get("d");
            tmp = (double[][])OMP_inputList.get("tmp");
            c = (double[][])OMP_inputList.get("c");
            beta = (Integer)OMP_inputList.get("beta");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("NI",NI);
            OMP_outputList.put("NL",NL);
            OMP_outputList.put("NJ",NJ);
            OMP_outputList.put("d",d);
            OMP_outputList.put("tmp",tmp);
            OMP_outputList.put("c",c);
            OMP_outputList.put("beta",beta);
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
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    int i=0;
                    int OMP_iterator = 0;
                    int OMP_end = (int)((NI)-(0))/(1);
                    if (((NI)-(0))%(1) == 0) {
                        OMP_end = OMP_end - 1;
                    }
                    int OMP_Chunk_Starting_point = 0;
                    int OMP_Default_chunkSize_autoGenerated = (OMP_end+1)/Pyjama.omp_get_num_threads();
                    if (Pyjama.omp_get_thread_num() < (OMP_end+1) % Pyjama.omp_get_num_threads()) {
                        ++OMP_Default_chunkSize_autoGenerated;
                        OMP_Chunk_Starting_point = Pyjama.omp_get_thread_num() * OMP_Default_chunkSize_autoGenerated;
                    } else {
                        OMP_Chunk_Starting_point = Pyjama.omp_get_thread_num() * OMP_Default_chunkSize_autoGenerated + (OMP_end+1) % Pyjama.omp_get_num_threads();
                    }
                    for (OMP_iterator=OMP_Chunk_Starting_point; OMP_iterator<OMP_Chunk_Starting_point+OMP_Default_chunkSize_autoGenerated && OMP_Default_chunkSize_autoGenerated>0; ++OMP_iterator) {
                        i = 0 + OMP_iterator * (1);
                        {//#GEN#[-1]#PJ#
                            for (int j = 0; j < NL; j++) {//#GEN#[-1]#PJ#
                                d[i][j] *= beta;//#GEN#[-1]#PJ#
                                for (int k = 0; k < NJ; ++k) {//#GEN#[-1]#PJ#
                                    d[i][j] += tmp[i][k] * c[k][j];//#GEN#[-1]#PJ#
                                }//#GEN#[-1]#PJ#
                            }//#GEN#[-1]#PJ#
                        }if (OMP_end == OMP_iterator) {
                            //BEGIN lastprivate variables value set
                            //END lastprivate variables value set
                        }
                    }
                    //BEGIN  reduction
                    PjRuntime.reductionLockForWorksharing.lock();
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
