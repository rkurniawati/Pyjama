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

public class HexaBench {

    public static void main(String[] args) {{
        String fname = "default";
        int iteration = 1000;
        if (args.length > 0) {
            if (null != args[0]) {
                fname = args[0];
            }
            if (args.length > 1 && null != args[1]) {
                iteration = Integer.parseInt(args[1]);
            }
        }
        if (args.length > 2 && args[2].equals("B")) {
            for (int i = 1; i <= 16; i++) {
                recordTimeBare(fname, iteration, i);
            }
        } else {
            for (int i = 1; i <= 16; i++) {
                recordTime(fname, iteration, i);
            }
        }
    }
    }


    public static void recordTimeBare(String fileName, int n, int num) {{
        PrintWriter writer_bare = null;
        try {
            writer_bare = new PrintWriter("./" + fileName + "_bare_t" + Integer.toString(num) + ".txt", "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < (n / 10); i++) {
            double value = test_bare(num);
        }
        for (int i = 0; i < n; i++) {
            double value = test_bare(num);
            writer_bare.println(value);
        }
        writer_bare.close();
    }
    }


    public static void recordTime(String fileName, int n, int num) {{
        PrintWriter writer_guarding = null;
        PrintWriter writer_checking = null;
        try {
            writer_guarding = new PrintWriter("./" + fileName + "_guarding_t" + Integer.toString(num) + ".txt", "UTF-8");
            writer_checking = new PrintWriter("./" + fileName + "_checking_t" + Integer.toString(num) + ".txt", "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < (n / 10); i++) {
            double value = test_guarding(num);
        }
        for (int i = 0; i < n; i++) {
            double value = test_guarding(num);
            writer_guarding.println(value);
        }
        writer_guarding.close();
        for (int i = 0; i < (n / 10); i++) {
            double value = test_barrierChecking(num);
        }
        for (int i = 0; i < n; i++) {
            double value = test_barrierChecking(num);
            writer_checking.println(value);
        }
        writer_checking.close();
    }
    }


    public static double test_bare(int num) {{
        long end = 0;
        long start = System.nanoTime();
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
                        for (int i = 0; i < 10000; i++) {
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




    public static double test_guarding(int num) {{
        long end = 0;
        long start = System.nanoTime();
        try {
            /*OpenMP Parallel region (#1) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_1 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_1 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_1);
            int _threadNum__OMP_ParallelRegion_1 = icv__OMP_ParallelRegion_1.nthreads_var.get(icv__OMP_ParallelRegion_1.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
            inputlist__OMP_ParallelRegion_1.put("start",start);
            _OMP_ParallelRegion_1 _OMP_ParallelRegion_1_in = new _OMP_ParallelRegion_1(_threadNum__OMP_ParallelRegion_1,icv__OMP_ParallelRegion_1,inputlist__OMP_ParallelRegion_1,outputlist__OMP_ParallelRegion_1);
            _OMP_ParallelRegion_1_in.runParallelCode();
            start = (Long)outputlist__OMP_ParallelRegion_1.get("start");
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
        long start = 0L;
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
                        for (int i = 0; i < 10000; i++) {
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




    public static double test_barrierChecking(int num) {{
        long end = 0;
        long start = System.nanoTime();
        try {
            /*OpenMP Parallel region (#2) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_2 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_2 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_2);
            int _threadNum__OMP_ParallelRegion_2 = icv__OMP_ParallelRegion_2.nthreads_var.get(icv__OMP_ParallelRegion_2.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
            inputlist__OMP_ParallelRegion_2.put("start",start);
            _OMP_ParallelRegion_2 _OMP_ParallelRegion_2_in = new _OMP_ParallelRegion_2(_threadNum__OMP_ParallelRegion_2,icv__OMP_ParallelRegion_2,inputlist__OMP_ParallelRegion_2,outputlist__OMP_ParallelRegion_2);
            _OMP_ParallelRegion_2_in.runParallelCode();
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
                        for (int i = 0; i < 10000; i++) {
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




    public static double test_new() {{
        long end = 0;
        long start = System.nanoTime();
        try {
            /*OpenMP Parallel region (#3) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_3 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_3 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_3);
            int _threadNum__OMP_ParallelRegion_3 = icv__OMP_ParallelRegion_3.nthreads_var.get(icv__OMP_ParallelRegion_3.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_3 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_3 = new ConcurrentHashMap<String,Object>();
            inputlist__OMP_ParallelRegion_3.put("start",start);
            _OMP_ParallelRegion_3 _OMP_ParallelRegion_3_in = new _OMP_ParallelRegion_3(_threadNum__OMP_ParallelRegion_3,icv__OMP_ParallelRegion_3,inputlist__OMP_ParallelRegion_3,outputlist__OMP_ParallelRegion_3);
            _OMP_ParallelRegion_3_in.runParallelCode();
            start = (Long)outputlist__OMP_ParallelRegion_3.get("start");
            PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_3);
            RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_3_in.OMP_CurrentParallelRegionExceptionSlot.get();
            if (OMP_ee != null) {throw OMP_ee;}
            /*OpenMP Parallel region (#3) -- END */

        } catch (RuntimeException e) {
            System.out.println("new Handling thread outside parallel region " + e);
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
        long start = 0L;
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




    public static double test_old() {{
        RuntimeException re = new RuntimeException("null");
        RuntimeException reNull = re;
        long end = 0;
        long start = System.nanoTime();
        /*OpenMP Parallel region (#4) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_4 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_4 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_4);
        int _threadNum__OMP_ParallelRegion_4 = icv__OMP_ParallelRegion_4.nthreads_var.get(icv__OMP_ParallelRegion_4.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_4 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_4 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_4.put("start",start);
        inputlist__OMP_ParallelRegion_4.put("re",re);
        _OMP_ParallelRegion_4 _OMP_ParallelRegion_4_in = new _OMP_ParallelRegion_4(_threadNum__OMP_ParallelRegion_4,icv__OMP_ParallelRegion_4,inputlist__OMP_ParallelRegion_4,outputlist__OMP_ParallelRegion_4);
        _OMP_ParallelRegion_4_in.runParallelCode();
        start = (Long)outputlist__OMP_ParallelRegion_4.get("start");
        re = (RuntimeException)outputlist__OMP_ParallelRegion_4.get("re");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_4);
        RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_4_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee != null) {throw OMP_ee;}
        /*OpenMP Parallel region (#4) -- END */

        if (re != reNull) {
            System.out.println("Old Handling thread outside parallel region " + re);
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
        long start = 0L;
        RuntimeException re = null;
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
                                re = new RuntimeException("A thread throws an exception");
                                start = System.nanoTime();
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
