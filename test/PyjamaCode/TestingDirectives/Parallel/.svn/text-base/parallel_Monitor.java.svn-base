package PyjamaCode.TestingDirectives.Parallel;//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
import pj.parser.ast.visitor.DummyClassToDetermineVariableType;//#GEN#[-1]#PJ#
import java.util.ArrayList;//#GEN#[-1]#PJ#
import java.util.List;//#GEN#[-1]#PJ#
import Domain.Bean.*;//#GEN#[-1]#PJ#
import pj.Pyjama;//#GEN#[-1]#PJ#
import Utility.MemoryAndCPUHelper.*;//#GEN#[-1]#PJ#
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
public class parallel_Monitor {//#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
    public List<MonitorInfoBean> parallel_region(int threadNumber, int n) throws Exception {{//#GEN#[-1]#PJ#
        Pyjama.omp_set_num_threads(threadNumber);//#GEN#[-1]#PJ#
        int completeNumber = 0;//#GEN#[-1]#PJ#
        int[] array = new int[n];//#GEN#[-1]#PJ#
        MonitorInfo service = new MonitorInfo();//#GEN#[-1]#PJ#
        List<MonitorInfoBean> result = new ArrayList<MonitorInfoBean>();//#GEN#[-1]#PJ#
        /*OpenMP Parallel region (#0) -- START *///#GEN#[-1]#PJ#
        InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();//#GEN#[-1]#PJ#
        InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);//#GEN#[-1]#PJ#
        int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);//#GEN#[-1]#PJ#
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();//#GEN#[-1]#PJ#
        inputlist__OMP_ParallelRegion_0.put("array",array);
        inputlist__OMP_ParallelRegion_0.put("result",result);
        inputlist__OMP_ParallelRegion_0.put("n",n);
        inputlist__OMP_ParallelRegion_0.put("completeNumber",completeNumber);
        inputlist__OMP_ParallelRegion_0.put("service",service);
        _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);//#GEN#[-1]#PJ#
        _OMP_ParallelRegion_0_in.runParallelCode();//#GEN#[-1]#PJ#
        array = (int[])outputlist__OMP_ParallelRegion_0.get("array");
        result = (List<MonitorInfoBean>)outputlist__OMP_ParallelRegion_0.get("result");
        n = (Integer)outputlist__OMP_ParallelRegion_0.get("n");
        completeNumber = (Integer)outputlist__OMP_ParallelRegion_0.get("completeNumber");
        service = (MonitorInfo)outputlist__OMP_ParallelRegion_0.get("service");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);//#GEN#[-1]#PJ#
        /*OpenMP Parallel region (#0) -- END *///#GEN#[-1]#PJ#
//#GEN#[-1]#PJ#
        service = new MonitorInfo();//#GEN#[-1]#PJ#
        result.add(service.getMonitorInfoBean());//#GEN#[-1]#PJ#
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
        int[] array = null;
        List<MonitorInfoBean> result = null;
        int n = 0;
        int completeNumber = 0;
        MonitorInfo service = null;
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
            array = (int[])OMP_inputList.get("array");
            result = (List<MonitorInfoBean>)OMP_inputList.get("result");
            n = (Integer)OMP_inputList.get("n");
            completeNumber = (Integer)OMP_inputList.get("completeNumber");
            service = (MonitorInfo)OMP_inputList.get("service");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("array",array);
            OMP_outputList.put("result",result);
            OMP_outputList.put("n",n);
            OMP_outputList.put("completeNumber",completeNumber);
            OMP_outputList.put("service",service);
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
                    while (completeNumber < n) {//#GEN#[-1]#PJ#
                        array[completeNumber] = completeNumber;//#GEN#[-1]#PJ#
                        completeNumber++;//#GEN#[-1]#PJ#
                        try {//#GEN#[-1]#PJ#
                            service = new MonitorInfo();//#GEN#[-1]#PJ#
                            double complete = (double) completeNumber / n;//#GEN#[-1]#PJ#
                            if (complete == 0.1) result.add(service.getMonitorInfoBean());//#GEN#[-1]#PJ#
                            if (complete == 0.2) result.add(service.getMonitorInfoBean());//#GEN#[-1]#PJ#
                            if (complete == 0.3) result.add(service.getMonitorInfoBean());//#GEN#[-1]#PJ#
                            if (complete == 0.4) result.add(service.getMonitorInfoBean());//#GEN#[-1]#PJ#
                            if (complete == 0.5) result.add(service.getMonitorInfoBean());//#GEN#[-1]#PJ#
                            if (complete == 0.6) result.add(service.getMonitorInfoBean());//#GEN#[-1]#PJ#
                            if (complete == 0.7) result.add(service.getMonitorInfoBean());//#GEN#[-1]#PJ#
                            if (complete == 0.8) result.add(service.getMonitorInfoBean());//#GEN#[-1]#PJ#
                            if (complete == 0.9) result.add(service.getMonitorInfoBean());//#GEN#[-1]#PJ#
                        } catch (Exception e) {//#GEN#[-1]#PJ#
                            e.printStackTrace();//#GEN#[-1]#PJ#
                        }//#GEN#[-1]#PJ#
                    }//#GEN#[-1]#PJ#
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
