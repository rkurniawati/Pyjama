package exceptionTest;

import pj.*;
import java.io.PrintWriter;

import pj.pr.*;
import pj.PjRuntime;
import pj.Pyjama;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.SwingUtilities;
import java.lang.reflect.InvocationTargetException;
import pj.pr.exceptions.OmpParallelRegionLocalCancellationException;

public class CompareBench {

    public static void main(String[] args) {{
        String fname = "hexa";
        int iteration = 1100;
        int warmup = 100;
        int maxthread = 16;
        if (args.length > 0) {
            if (null != args[0]) {
                fname = args[0];
            }
            if (args.length > 1 && null != args[1]) {
                iteration = Integer.parseInt(args[1]);
            }
            if (args.length > 2 && null != args[2]) {
                maxthread = Integer.parseInt(args[2]);
            }
        }
        recordTime(fname, iteration, warmup, maxthread);
    }
    }


    public static void recordTime(String fileName, int iter, int warmup, int maxthreads) {{
        PrintWriter writer_pr = null;
        PrintWriter writer_ws = null;
        try {
            writer_pr = new PrintWriter("./" + fileName + "COMP_PR.txt", "UTF-8");
            writer_ws = new PrintWriter("./" + fileName + "COMP_WS.txt", "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        writer_pr.println("\"nthreads\",\"type\",\"time\"");
        for (int nthreads = 1; nthreads <= maxthreads; nthreads++) {
            for (int j = 0; j < iter; j++) {
                double value = test_old_pr(nthreads);
                if (j >= warmup) {
                    writer_pr.println(nthreads + ",old," + value);
                    System.out.println(nthreads + ",old," + value);
                }
            }
            for (int j = 0; j < iter; j++) {
                double value = test_new_pr(nthreads);
                if (j >= warmup) {
                    writer_pr.println(nthreads + ",new," + value);
                    System.out.println(nthreads + ",new," + value);
                }
            }
        }
        writer_pr.close();
        writer_ws.println("\"nthreads\",\"type\",\"time\"");
        for (int nthreads = 1; nthreads <= maxthreads; nthreads++) {
            for (int j = 0; j < iter; j++) {
                double value = test_old_ws(nthreads);
                if (j >= warmup) {
                    writer_ws.println(nthreads + ",old," + value);
                    System.out.println(nthreads + ",old," + value);
                }
            }
            for (int j = 0; j < iter; j++) {
                double value = test_new_ws(nthreads);
                if (j >= warmup) {
                    writer_ws.println(nthreads + ",new," + value);
                    System.out.println(nthreads + ",new," + value);
                }
            }
        }
        writer_ws.close();
    }
    }


    public static double test_new_pr(int num) {{
        long end = 0;
        long start = System.nanoTime();
        try {
            Pyjama.omp_set_num_threads(num);
            /*OpenMP Parallel region (#0) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);
            int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
            inputlist__OMP_ParallelRegion_0.put("start",start);
            _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);
            _OMP_ParallelRegion_0_in.runParallelCode();
            start = (Long)outputlist__OMP_ParallelRegion_0.get("start");
            PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);
            RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_0_in.OMP_CurrentParallelRegionExceptionSlot.get();
            if (OMP_ee != null) {throw OMP_ee;}
            /*OpenMP Parallel region (#0) -- END */

        } catch (RuntimeException e) {
            System.out.println("new Handling thread outside parallel region " + e);
        }
        end = System.nanoTime() - start;
        return (double) (end) / 1000000;
    }
    }
static class _OMP_ParallelRegion_0{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
        long start = 0L;
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
            start = (Long)OMP_inputList.get("start");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("start",start);
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
                        if (Pyjama.omp_get_thread_num() == 1) {
                            start = System.nanoTime();
                            throw new RuntimeException("A thread throws an exception");
                        }
                        PjRuntime.setBarrier();

                        System.out.println("second stage");
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




    public static double test_old_pr(int num) {{
        RuntimeException re = new RuntimeException("null");
        RuntimeException reNull = re;
        long end = 0;
        long start = System.nanoTime();
        Pyjama.omp_set_num_threads(num);
        /*OpenMP Parallel region (#1) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_1 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_1 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_1);
        int _threadNum__OMP_ParallelRegion_1 = icv__OMP_ParallelRegion_1.nthreads_var.get(icv__OMP_ParallelRegion_1.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_1.put("start",start);
        inputlist__OMP_ParallelRegion_1.put("re",re);
        _OMP_ParallelRegion_1 _OMP_ParallelRegion_1_in = new _OMP_ParallelRegion_1(_threadNum__OMP_ParallelRegion_1,icv__OMP_ParallelRegion_1,inputlist__OMP_ParallelRegion_1,outputlist__OMP_ParallelRegion_1);
        _OMP_ParallelRegion_1_in.runParallelCode();
        start = (Long)outputlist__OMP_ParallelRegion_1.get("start");
        re = (RuntimeException)outputlist__OMP_ParallelRegion_1.get("re");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_1);
        RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_1_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee != null) {throw OMP_ee;}
        /*OpenMP Parallel region (#1) -- END */

        if (re != reNull) {
            System.out.println("Old Handling thread outside parallel region " + re);
        }
        end = System.nanoTime() - start;
        return (double) (end) / 1000000;
    }
    }
static class _OMP_ParallelRegion_1{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
        long start = 0L;
        RuntimeException re = null;
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
            start = (Long)OMP_inputList.get("start");
            re = (RuntimeException)OMP_inputList.get("re");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("start",start);
            OMP_outputList.put("re",re);
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
                        try {
                            if (Pyjama.omp_get_thread_num() == 1) {
                                start = System.nanoTime();
                                re = new RuntimeException("A thread throws an exception");
                            }
                        } catch (RuntimeException e) {
                            PjRuntime.OMP_lock.lock();
                            try {
                                {
                                    re = e;
                                    throw new pj.pr.exceptions.OmpParallelRegionGlobalCancellationException();

                                }} finally {
                            PjRuntime.OMP_lock.unlock();
                        }

                    }
                    PjRuntime.setBarrier();

                    System.out.println("second stage");
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




    public static double test_new_ws(int num) {{
        long end = 0;
        long start = System.nanoTime();
        try {
            Pyjama.omp_set_num_threads(num);
            /*OpenMP Parallel region (#2) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_2 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_2 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_2);
            int _threadNum__OMP_ParallelRegion_2 = icv__OMP_ParallelRegion_2.nthreads_var.get(icv__OMP_ParallelRegion_2.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
            inputlist__OMP_ParallelRegion_2.put("num",num);
            inputlist__OMP_ParallelRegion_2.put("start",start);
            _OMP_ParallelRegion_2 _OMP_ParallelRegion_2_in = new _OMP_ParallelRegion_2(_threadNum__OMP_ParallelRegion_2,icv__OMP_ParallelRegion_2,inputlist__OMP_ParallelRegion_2,outputlist__OMP_ParallelRegion_2);
            _OMP_ParallelRegion_2_in.runParallelCode();
            num = (Integer)outputlist__OMP_ParallelRegion_2.get("num");
            start = (Long)outputlist__OMP_ParallelRegion_2.get("start");
            PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_2);
            RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_2_in.OMP_CurrentParallelRegionExceptionSlot.get();
            if (OMP_ee != null) {throw OMP_ee;}
            /*OpenMP Parallel region (#2) -- END */

        } catch (RuntimeException e) {
            System.out.println("new Handling thread outside parallel region " + e);
        }
        end = System.nanoTime() - start;
        return (double) (end) / 1000000;
    }
    }
static class _OMP_ParallelRegion_2{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
        int num = 0;
        long start = 0L;
        //#END shared variables defined here
        public _OMP_ParallelRegion_2(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
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
            num = (Integer)OMP_inputList.get("num");
            start = (Long)OMP_inputList.get("start");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("num",num);
            OMP_outputList.put("start",start);
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
                        int OMP_end = (int)((num)-(0))/(1);
                        if (((num)-(0))%(1) == 0) {
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
                                if (Pyjama.omp_get_thread_num() == 1) {
                                    start = System.nanoTime();
                                    throw new RuntimeException("A thread throws an exception");
                                }
                                PjRuntime.setBarrier();

                                System.out.println("second stage");
                            }if (OMP_end == OMP_local_iterator) {
                                //BEGIN lastprivate variables value set
                                //END lastprivate variables value set
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




    public static double test_old_ws(int num) {{
        RuntimeException re = new RuntimeException("null");
        RuntimeException reNull = re;
        long end = 0;
        long start = System.nanoTime();
        Pyjama.omp_set_num_threads(num);
        /*OpenMP Parallel region (#3) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_3 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_3 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_3);
        int _threadNum__OMP_ParallelRegion_3 = icv__OMP_ParallelRegion_3.nthreads_var.get(icv__OMP_ParallelRegion_3.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_3 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_3 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_3.put("start",start);
        inputlist__OMP_ParallelRegion_3.put("num",num);
        inputlist__OMP_ParallelRegion_3.put("re",re);
        _OMP_ParallelRegion_3 _OMP_ParallelRegion_3_in = new _OMP_ParallelRegion_3(_threadNum__OMP_ParallelRegion_3,icv__OMP_ParallelRegion_3,inputlist__OMP_ParallelRegion_3,outputlist__OMP_ParallelRegion_3);
        _OMP_ParallelRegion_3_in.runParallelCode();
        start = (Long)outputlist__OMP_ParallelRegion_3.get("start");
        num = (Integer)outputlist__OMP_ParallelRegion_3.get("num");
        re = (RuntimeException)outputlist__OMP_ParallelRegion_3.get("re");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_3);
        RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_3_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee != null) {throw OMP_ee;}
        /*OpenMP Parallel region (#3) -- END */

        if (re != reNull) {
            System.out.println("Old Handling thread outside parallel region " + re);
        }
        end = System.nanoTime() - start;
        return (double) (end) / 1000000;
    }
    }
static class _OMP_ParallelRegion_3{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
        int num = 0;
        long start = 0L;
        RuntimeException re = null;
        //#END shared variables defined here
        public _OMP_ParallelRegion_3(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
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
            num = (Integer)OMP_inputList.get("num");
            start = (Long)OMP_inputList.get("start");
            re = (RuntimeException)OMP_inputList.get("re");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("start",start);
            OMP_outputList.put("num",num);
            OMP_outputList.put("re",re);
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
                    for (int i = 0; i < num; i++) {
                        try {
                            if (Pyjama.omp_get_thread_num() == 1) {
                                start = System.nanoTime();
                                re = new RuntimeException("A thread throws an exception");
                            }
                        } catch (RuntimeException e) {
                            PjRuntime.OMP_lock.lock();
                            try {
                                {
                                    re = e;
                                    throw new pj.pr.exceptions.OmpParallelRegionGlobalCancellationException();

                                }} finally {
                            PjRuntime.OMP_lock.unlock();
                        }

                    }
                    PjRuntime.setBarrier();

                    System.out.println("second stage");
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
