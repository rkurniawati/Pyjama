package exceptionTest;

import java.io.PrintWriter;
import utils.SimulateWork;

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

public class SyncBenchPar {

    public static void main(String[] args) {{
        String fname = "hexa";
        int iteration = 15;
        int warmup = 5;
        int maxthread = 16;
        recordTimePar(fname, iteration, warmup, maxthread);
    }
    }


    public static void recordTimePar(String fileName, int iter, int warmup, int maxthreads) {{
        PrintWriter writer_pr = null;
        PrintWriter writer_ws = null;
        PrintWriter writer_bar = null;
        try {
            writer_pr = new PrintWriter("./" + fileName + "_PAR_PR" + ".csv", "UTF-8");
            writer_ws = new PrintWriter("./" + fileName + "_PAR_WS" + ".csv", "UTF-8");
            writer_bar = new PrintWriter("./" + fileName + "_PAR_BAR" + ".csv", "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        writer_pr.println("\"nthreads\", \"type\", \"time\"");
        for (int nthreads = 1; nthreads <= maxthreads; nthreads++) {
            for (int j = 0; j < iter; j++) {
                double value = testpr_bare(nthreads);
                if (j >= warmup) {
                    writer_pr.println(nthreads + ",bare," + value);
                    System.out.println(nthreads + ",bare," + value);
                }
            }
            for (int j = 0; j < iter; j++) {
                double value = testpr_guarding(nthreads);
                if (j >= warmup) {
                    writer_pr.println(nthreads + ",guarding," + value);
                    System.out.println(nthreads + ",guarding," + value);
                }
            }
            for (int j = 0; j < iter; j++) {
                double value = testpr_checking(nthreads);
                if (j >= warmup) {
                    writer_pr.println(nthreads + ",checking," + value);
                    System.out.println(nthreads + ",checking," + value);
                }
            }
        }
        writer_pr.close();
        writer_ws.println("\"nthreads\", \"type\", \"time\"");
        for (int nthreads = 1; nthreads <= maxthreads; nthreads++) {
            for (int j = 0; j < iter; j++) {
                double value = testfor_bare(16, nthreads);
                if (j >= warmup) {
                    writer_ws.println(nthreads + ",bare," + value);
                    System.out.println(nthreads + ",bare," + value);
                }
            }
            for (int j = 0; j < iter; j++) {
                double value = testfor_guarding(16, nthreads);
                if (j >= warmup) {
                    writer_ws.println(nthreads + ",guarding," + value);
                    System.out.println(nthreads + ",guarding," + value);
                }
            }
            for (int j = 0; j < iter; j++) {
                double value = testfor_checking(16, nthreads);
                if (j >= warmup) {
                    writer_ws.println(nthreads + ",checking," + value);
                    System.out.println(nthreads + ",checking," + value);
                }
            }
        }
        writer_ws.close();
        writer_bar.println("\"nthreads\", \"type\", \"time\"");
        for (int nthreads = 1; nthreads <= maxthreads; nthreads++) {
            for (int j = 0; j < iter; j++) {
                double value = testbar_bare(1, nthreads);
                if (j >= warmup) {
                    writer_bar.println(nthreads + ",bare," + value);
                    System.out.println(nthreads + ",bare," + value);
                }
            }
            for (int j = 0; j < iter; j++) {
                double value = testbar_guarding(1, nthreads);
                if (j >= warmup) {
                    writer_bar.println(nthreads + ",guarding," + value);
                    System.out.println(nthreads + ",guarding," + value);
                }
            }
            for (int j = 0; j < iter; j++) {
                double value = testbar_checking(1, nthreads);
                if (j >= warmup) {
                    writer_bar.println(nthreads + ",checking," + value);
                    System.out.println(nthreads + ",checking," + value);
                }
            }
        }
        writer_bar.close();
    }
    }


    static double testpr_bare(int nthreads) {{
        long end = 0;
        long start = System.nanoTime();
        Pyjama.omp_set_num_threads(nthreads);
        /*OpenMP Parallel region (#0) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);
        int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);
        _OMP_ParallelRegion_0_in.runParallelCode();
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);
        RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_0_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee != null) {throw OMP_ee;}
        /*OpenMP Parallel region (#0) -- END */

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
                        delay(10);
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




    static double testpr_guarding(int nthreads) {{
        long end = 0;
        long start = System.nanoTime();
        Pyjama.omp_set_num_threads(nthreads);
        try {
            /*OpenMP Parallel region (#1) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_1 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_1 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_1);
            int _threadNum__OMP_ParallelRegion_1 = icv__OMP_ParallelRegion_1.nthreads_var.get(icv__OMP_ParallelRegion_1.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
            _OMP_ParallelRegion_1 _OMP_ParallelRegion_1_in = new _OMP_ParallelRegion_1(_threadNum__OMP_ParallelRegion_1,icv__OMP_ParallelRegion_1,inputlist__OMP_ParallelRegion_1,outputlist__OMP_ParallelRegion_1);
            _OMP_ParallelRegion_1_in.runParallelCode();
            PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_1);
            RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_1_in.OMP_CurrentParallelRegionExceptionSlot.get();
            if (OMP_ee != null) {throw OMP_ee;}
            /*OpenMP Parallel region (#1) -- END */

        } catch (RuntimeException e) {
            System.out.println("new Handling thread outside parallel region " + e);
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
                        delay(10);
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




    static double testpr_checking(int nthreads) {{
        long end = 0;
        long start = System.nanoTime();
        Pyjama.omp_set_num_threads(nthreads);
        try {
            /*OpenMP Parallel region (#2) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_2 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_2 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_2);
            int _threadNum__OMP_ParallelRegion_2 = icv__OMP_ParallelRegion_2.nthreads_var.get(icv__OMP_ParallelRegion_2.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
            _OMP_ParallelRegion_2 _OMP_ParallelRegion_2_in = new _OMP_ParallelRegion_2(_threadNum__OMP_ParallelRegion_2,icv__OMP_ParallelRegion_2,inputlist__OMP_ParallelRegion_2,outputlist__OMP_ParallelRegion_2);
            _OMP_ParallelRegion_2_in.runParallelCode();
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
                        delay(10);
                        PjRuntime.checkParallelCancellationPoint();

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




    static double testfor_bare(int workload, int nthreads) {{
        long end = 0;
        Pyjama.omp_set_num_threads(nthreads);
        long start = System.nanoTime();
        /*OpenMP Parallel region (#3) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_3 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_3 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_3);
        int _threadNum__OMP_ParallelRegion_3 = icv__OMP_ParallelRegion_3.nthreads_var.get(icv__OMP_ParallelRegion_3.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_3 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_3 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_3.put("workload",workload);
        _OMP_ParallelRegion_3 _OMP_ParallelRegion_3_in = new _OMP_ParallelRegion_3(_threadNum__OMP_ParallelRegion_3,icv__OMP_ParallelRegion_3,inputlist__OMP_ParallelRegion_3,outputlist__OMP_ParallelRegion_3);
        _OMP_ParallelRegion_3_in.runParallelCode();
        workload = (Integer)outputlist__OMP_ParallelRegion_3.get("workload");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_3);
        RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_3_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee != null) {throw OMP_ee;}
        /*OpenMP Parallel region (#3) -- END */

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
        int workload = 0;
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
            workload = (Integer)OMP_inputList.get("workload");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("workload",workload);
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
                        int OMP_end = (int)((workload)-(0))/(1);
                        if (((workload)-(0))%(1) == 0) {
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
                                delay(10);
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




    static double testfor_guarding(int workload, int nthreads) {{
        long end = 0;
        Pyjama.omp_set_num_threads(nthreads);
        long start = System.nanoTime();
        try {
            /*OpenMP Parallel region (#4) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_4 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_4 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_4);
            int _threadNum__OMP_ParallelRegion_4 = icv__OMP_ParallelRegion_4.nthreads_var.get(icv__OMP_ParallelRegion_4.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_4 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_4 = new ConcurrentHashMap<String,Object>();
            inputlist__OMP_ParallelRegion_4.put("workload",workload);
            _OMP_ParallelRegion_4 _OMP_ParallelRegion_4_in = new _OMP_ParallelRegion_4(_threadNum__OMP_ParallelRegion_4,icv__OMP_ParallelRegion_4,inputlist__OMP_ParallelRegion_4,outputlist__OMP_ParallelRegion_4);
            _OMP_ParallelRegion_4_in.runParallelCode();
            workload = (Integer)outputlist__OMP_ParallelRegion_4.get("workload");
            PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_4);
            RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_4_in.OMP_CurrentParallelRegionExceptionSlot.get();
            if (OMP_ee != null) {throw OMP_ee;}
            /*OpenMP Parallel region (#4) -- END */

        } catch (RuntimeException e) {
            System.out.println("new Handling thread outside parallel region " + e);
        }
        end = System.nanoTime() - start;
        return (double) (end) / 1000000;
    }
    }
static class _OMP_ParallelRegion_4{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
        int workload = 0;
        //#END shared variables defined here
        public _OMP_ParallelRegion_4(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
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
            workload = (Integer)OMP_inputList.get("workload");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("workload",workload);
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
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    try{
                        int i=0;
                        int OMP_iterator = 0;
                        int OMP_end = (int)((workload)-(0))/(1);
                        if (((workload)-(0))%(1) == 0) {
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
                                delay(10);
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




    static double testfor_checking(int workload, int nthreads) {{
        long end = 0;
        Pyjama.omp_set_num_threads(nthreads);
        long start = System.nanoTime();
        try {
            /*OpenMP Parallel region (#5) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_5 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_5 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_5);
            int _threadNum__OMP_ParallelRegion_5 = icv__OMP_ParallelRegion_5.nthreads_var.get(icv__OMP_ParallelRegion_5.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_5 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_5 = new ConcurrentHashMap<String,Object>();
            inputlist__OMP_ParallelRegion_5.put("workload",workload);
            _OMP_ParallelRegion_5 _OMP_ParallelRegion_5_in = new _OMP_ParallelRegion_5(_threadNum__OMP_ParallelRegion_5,icv__OMP_ParallelRegion_5,inputlist__OMP_ParallelRegion_5,outputlist__OMP_ParallelRegion_5);
            _OMP_ParallelRegion_5_in.runParallelCode();
            workload = (Integer)outputlist__OMP_ParallelRegion_5.get("workload");
            PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_5);
            RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_5_in.OMP_CurrentParallelRegionExceptionSlot.get();
            if (OMP_ee != null) {throw OMP_ee;}
            /*OpenMP Parallel region (#5) -- END */

        } catch (RuntimeException e) {
            System.out.println("new Handling thread outside parallel region " + e);
        }
        end = System.nanoTime() - start;
        return (double) (end) / 1000000;
    }
    }
static class _OMP_ParallelRegion_5{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
        int workload = 0;
        //#END shared variables defined here
        public _OMP_ParallelRegion_5(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
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
            workload = (Integer)OMP_inputList.get("workload");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("workload",workload);
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
                    /*OpenMP Work Share region (#2) -- START */
                    
                {//#BEGIN firstprivate lastprivate reduction variables defined and initialized here
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    try{
                        int i=0;
                        int OMP_iterator = 0;
                        int OMP_end = (int)((workload)-(0))/(1);
                        if (((workload)-(0))%(1) == 0) {
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
                                delay(10);
                                PjRuntime.checkParallelCancellationPoint();

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
                    /*OpenMP Work Share region (#2) -- END */

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




    static double testbar_bare(int barrierNum, int nthreads) {{
        long end = 0;
        Pyjama.omp_set_num_threads(nthreads);
        long start = System.nanoTime();
        /*OpenMP Parallel region (#6) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_6 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_6 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_6);
        int _threadNum__OMP_ParallelRegion_6 = icv__OMP_ParallelRegion_6.nthreads_var.get(icv__OMP_ParallelRegion_6.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_6 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_6 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_6.put("barrierNum",barrierNum);
        _OMP_ParallelRegion_6 _OMP_ParallelRegion_6_in = new _OMP_ParallelRegion_6(_threadNum__OMP_ParallelRegion_6,icv__OMP_ParallelRegion_6,inputlist__OMP_ParallelRegion_6,outputlist__OMP_ParallelRegion_6);
        _OMP_ParallelRegion_6_in.runParallelCode();
        barrierNum = (Integer)outputlist__OMP_ParallelRegion_6.get("barrierNum");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_6);
        RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_6_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee != null) {throw OMP_ee;}
        /*OpenMP Parallel region (#6) -- END */

        end = System.nanoTime() - start;
        return (double) (end) / 1000000;
    }
    }
static class _OMP_ParallelRegion_6{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
        int barrierNum = 0;
        //#END shared variables defined here
        public _OMP_ParallelRegion_6(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
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
            barrierNum = (Integer)OMP_inputList.get("barrierNum");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("barrierNum",barrierNum);
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
                        for (int j = 0; j < barrierNum; j++) {
                            delay(10);
                            PjRuntime.setBarrier();

                        }
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




    static double testbar_guarding(int barrierNum, int nthreads) {{
        long end = 0;
        Pyjama.omp_set_num_threads(nthreads);
        long start = System.nanoTime();
        try {
            /*OpenMP Parallel region (#7) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_7 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_7 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_7);
            int _threadNum__OMP_ParallelRegion_7 = icv__OMP_ParallelRegion_7.nthreads_var.get(icv__OMP_ParallelRegion_7.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_7 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_7 = new ConcurrentHashMap<String,Object>();
            inputlist__OMP_ParallelRegion_7.put("barrierNum",barrierNum);
            _OMP_ParallelRegion_7 _OMP_ParallelRegion_7_in = new _OMP_ParallelRegion_7(_threadNum__OMP_ParallelRegion_7,icv__OMP_ParallelRegion_7,inputlist__OMP_ParallelRegion_7,outputlist__OMP_ParallelRegion_7);
            _OMP_ParallelRegion_7_in.runParallelCode();
            barrierNum = (Integer)outputlist__OMP_ParallelRegion_7.get("barrierNum");
            PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_7);
            RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_7_in.OMP_CurrentParallelRegionExceptionSlot.get();
            if (OMP_ee != null) {throw OMP_ee;}
            /*OpenMP Parallel region (#7) -- END */

        } catch (RuntimeException e) {
            System.out.println("new Handling thread outside parallel region " + e);
        }
        end = System.nanoTime() - start;
        return (double) (end) / 1000000;
    }
    }
static class _OMP_ParallelRegion_7{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
        int barrierNum = 0;
        //#END shared variables defined here
        public _OMP_ParallelRegion_7(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
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
            barrierNum = (Integer)OMP_inputList.get("barrierNum");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("barrierNum",barrierNum);
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
                        for (int j = 0; j < barrierNum; j++) {
                            delay(10);
                            PjRuntime.setBarrier();

                        }
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




    static double testbar_checking(int barrierNum, int nthreads) {{
        long end = 0;
        Pyjama.omp_set_num_threads(nthreads);
        long start = System.nanoTime();
        try {
            /*OpenMP Parallel region (#8) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_8 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_8 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_8);
            int _threadNum__OMP_ParallelRegion_8 = icv__OMP_ParallelRegion_8.nthreads_var.get(icv__OMP_ParallelRegion_8.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_8 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_8 = new ConcurrentHashMap<String,Object>();
            inputlist__OMP_ParallelRegion_8.put("barrierNum",barrierNum);
            _OMP_ParallelRegion_8 _OMP_ParallelRegion_8_in = new _OMP_ParallelRegion_8(_threadNum__OMP_ParallelRegion_8,icv__OMP_ParallelRegion_8,inputlist__OMP_ParallelRegion_8,outputlist__OMP_ParallelRegion_8);
            _OMP_ParallelRegion_8_in.runParallelCode();
            barrierNum = (Integer)outputlist__OMP_ParallelRegion_8.get("barrierNum");
            PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_8);
            RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_8_in.OMP_CurrentParallelRegionExceptionSlot.get();
            if (OMP_ee != null) {throw OMP_ee;}
            /*OpenMP Parallel region (#8) -- END */

        } catch (RuntimeException e) {
            System.out.println("new Handling thread outside parallel region " + e);
        }
        end = System.nanoTime() - start;
        return (double) (end) / 1000000;
    }
    }
static class _OMP_ParallelRegion_8{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
        int barrierNum = 0;
        //#END shared variables defined here
        public _OMP_ParallelRegion_8(int thread_num, InternalControlVariables icv, ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
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
            barrierNum = (Integer)OMP_inputList.get("barrierNum");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("barrierNum",barrierNum);
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
                        for (int j = 0; j < barrierNum; j++) {
                            delay(10);
                            PjRuntime.setBarrier();

                            PjRuntime.checkParallelCancellationPoint();

                        }
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




    static void delay(int n) {{
        for (int i = 0; i < n; i++) {
            SimulateWork.work(100);
        }
    }
    }

}
