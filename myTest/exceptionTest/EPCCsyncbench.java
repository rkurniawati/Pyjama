package exceptionTest;

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

public class EPCCsyncbench {

    static final double DEFAULT_DELAY_TIME = 0.1;

    static long innerreps = 0;

    static enum testType {

        PR, WS, BAR, REF
    }

    ;

    static double targettesttime = 1e3;

    static int outerreps = 100;

    static int delaylength = -1;

    static double delaytime = 0.1;

    static double reftime = 0;

    static double refsd = 0;

    static double[] times = null;

    static int warmup = 1000;

    static PrintWriter filePrinter = null;

    public static void main(String[] args) {{
        int nthreads = 4;
        if (args.length > 0) {
            nthreads = Integer.parseInt(args[0]);
        }
        try {
            filePrinter = new PrintWriter("./syncbench_nthreads_" + nthreads + ".csv", "UTF-8");
            filePrinter.println("type,time");
        } catch (Exception e) {
            e.printStackTrace();
        }
        delaylength = getdelaylengthfromtime(delaytime);
        System.out.println("Running OpenMP benchmark Java version 3.0");
        System.out.println("\t" + nthreads + " thread(s)");
        System.out.println("\t" + outerreps + " outer repetitions)");
        System.out.println("\t" + targettesttime + " test time (microseconds)");
        System.out.println("\t" + delaylength + " delay length (iterations)");
        System.out.println("\t" + delaytime + " delay time (microseconds)");
        times = new double[outerreps];
        reference();
        benchmark(nthreads, "PARALLEL", testType.PR);
        benchmark(nthreads, "FOR", testType.WS);
        benchmark(nthreads, "BARRIER", testType.BAR);
        filePrinter.close();
    }
    }


    private static void refer() {{
        for (int j = 0; j < innerreps; j++) {
            delay(delaylength);
        }
    }
    }


    public static void pr(int nthreads) {{
        int j = 0;
        Pyjama.omp_set_num_threads(nthreads);
        for (j = 0; j < innerreps; j++) {
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

        }
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
                                    delay(delaylength);
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




    public static void ws(int nthreads) {{
        int j = 0;
        Pyjama.omp_set_num_threads(nthreads);
        /*OpenMP Parallel region (#1) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_1 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_1 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_1);
        int _threadNum__OMP_ParallelRegion_1 = icv__OMP_ParallelRegion_1.nthreads_var.get(icv__OMP_ParallelRegion_1.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_1.put("j",j);
        inputlist__OMP_ParallelRegion_1.put("nthreads",nthreads);
        _OMP_ParallelRegion_1 _OMP_ParallelRegion_1_in = new _OMP_ParallelRegion_1(_threadNum__OMP_ParallelRegion_1,icv__OMP_ParallelRegion_1,inputlist__OMP_ParallelRegion_1,outputlist__OMP_ParallelRegion_1);
        _OMP_ParallelRegion_1_in.runParallelCode();
        nthreads = (Integer)outputlist__OMP_ParallelRegion_1.get("nthreads");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_1);
        RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_1_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee != null) {throw OMP_ee;}
        /*OpenMP Parallel region (#1) -- END */

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
                int nthreads = 0;
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
                    nthreads = (Integer)OMP_inputList.get("nthreads");
                    //#END shared variables initialised here
                }

                private void updateOutputListForSharedVars() {
                    //BEGIN update outputlist
                    OMP_outputList.put("nthreads",nthreads);
                    //END update outputlist
                }
                class MyCallable implements Callable<ConcurrentHashMap<String,Object>> {
                    private int alias_id;
                    private ConcurrentHashMap<String, Object> OMP_inputList;
                    private ConcurrentHashMap<String, Object> OMP_outputList;
                    //#BEGIN private/firstprivate reduction variables defined here
                    int j = 0;
                    //#END private/firstprivate reduction variables  defined here
                    MyCallable(int id, ConcurrentHashMap<String,Object> inputlist, ConcurrentHashMap<String,Object> outputlist){
                        this.alias_id = id;
                        this.OMP_inputList = inputlist;
                        this.OMP_outputList = outputlist;
                        //#BEGIN firstprivate reduction variables initialised here
                        j = (Integer)OMP_inputList.get("j");
                        //#END firstprivate reduction variables initialised here
                    }

                    @Override
                    public ConcurrentHashMap<String,Object> call() {
                        try {
                            /****User Code BEGIN***/
                            {
                                for (j = 0; j < innerreps; j++) {
                                    /*OpenMP Work Share region (#0) -- START */
                                    
                {//#BEGIN firstprivate lastprivate reduction variables defined and initialized here
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    try{
                        int i=0;
                        int OMP_iterator = 0;
                        int OMP_end = (int)((nthreads)-(0))/(1);
                        if (((nthreads)-(0))%(1) == 0) {
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
                                delay(delaylength);
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




    public static void bar(int nthreads) {{
        int j = 0;
        Pyjama.omp_set_num_threads(nthreads);
        /*OpenMP Parallel region (#2) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_2 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_2 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_2);
        int _threadNum__OMP_ParallelRegion_2 = icv__OMP_ParallelRegion_2.nthreads_var.get(icv__OMP_ParallelRegion_2.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_2.put("j",j);
        _OMP_ParallelRegion_2 _OMP_ParallelRegion_2_in = new _OMP_ParallelRegion_2(_threadNum__OMP_ParallelRegion_2,icv__OMP_ParallelRegion_2,inputlist__OMP_ParallelRegion_2,outputlist__OMP_ParallelRegion_2);
        _OMP_ParallelRegion_2_in.runParallelCode();
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_2);
        RuntimeException OMP_ee = (RuntimeException) _OMP_ParallelRegion_2_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee != null) {throw OMP_ee;}
        /*OpenMP Parallel region (#2) -- END */

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
                    int j = 0;
                    //#END private/firstprivate reduction variables  defined here
                    MyCallable(int id, ConcurrentHashMap<String,Object> inputlist, ConcurrentHashMap<String,Object> outputlist){
                        this.alias_id = id;
                        this.OMP_inputList = inputlist;
                        this.OMP_outputList = outputlist;
                        //#BEGIN firstprivate reduction variables initialised here
                        j = (Integer)OMP_inputList.get("j");
                        //#END firstprivate reduction variables initialised here
                    }

                    @Override
                    public ConcurrentHashMap<String,Object> call() {
                        try {
                            /****User Code BEGIN***/
                            {
                                for (j = 0; j < innerreps; j++) {
                                    delay(delaylength);
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




    private static void reference() {{
        int k = 0;
        double start = 0.0d;
        innerreps = getinnerreps(1, testType.REF);
        printheader("REFERENCE");
        for (k = 0; k < outerreps; k++) {
            start = getclock();
            refer();
            times[k] = (getclock() - start) * 1.0e6 / (double) innerreps;
        }
        finalise("REFERENCE", false);
    }
    }


    static void benchmark(int nthreads, String name, EPCCsyncbench.testType type) {{
        int k = 0;
        double start = 0.0d;
        for (k = 0; k < warmup; k++) {
            innerreps = 1;
            switch(type) {
                case PR:
                    pr(nthreads);
                    break;
                case WS:
                    ws(nthreads);
                    break;
                case BAR:
                    bar(nthreads);
                    break;
                default:
            }
        }
        innerreps = getinnerreps(nthreads, type);
        printheader(name);
        for (k = 0; k < outerreps; k++) {
            start = getclock();
            switch(type) {
                case PR:
                    pr(nthreads);
                    break;
                case WS:
                    ws(nthreads);
                    break;
                case BAR:
                    bar(nthreads);
                    break;
                default:
            }
            times[k] = (getclock() - start) * 1e6 / (double) innerreps;
            filePrinter.println(type + "," + times[k]);
        }
        finalise(name, true);
    }
    }


    static long getinnerreps(int nthreads, EPCCsyncbench.testType type) {{
        innerreps = 10L;
        double time = 0.0;
        while (time < targettesttime) {
            double start = getclock();
            switch(type) {
                case PR:
                    pr(nthreads);
                    break;
                case WS:
                    ws(nthreads);
                    break;
                case BAR:
                    bar(nthreads);
                    break;
                case REF:
                    refer();
                default:
            }
            time = (getclock() - start) * 1000000;
            innerreps *= 2;
            if (innerreps > (targettesttime * 1.0e15)) {
                throw new RuntimeException("wrong");
            }
        }
        return innerreps;
    }
    }


    private static void delay(int delaylength) {{
        int i = 0;
        float a = 0;
        for (i = 0; i < delaylength; i++) {
            a += i;
            if (a < 0) {
                System.out.println(a);
            }
        }
    }
    }


    static void printheader(String name) {{
        System.out.println();
        System.out.println("--------------------------------------------------------\n");
        System.out.println("Computing " + name + " time using " + innerreps + " reps\n");
    }
    }


    static int getdelaylengthfromtime(double delaytime) {{
        int i = 0, reps = 0;
        double lapsedtime = 0.0d, starttime = 0.0d;
        reps = 1000;
        lapsedtime = 0.0;
        delaytime = delaytime / 1.0E6;
        int delaylength = 0;
        delay(delaylength);
        while (lapsedtime < delaytime) {
            delaylength = (int) (delaylength * 1.1 + 1);
            starttime = getclock();
            for (i = 0; i < reps; i++) {
                delay(delaylength);
            }
            lapsedtime = (getclock() - starttime) / (double) reps;
        }
        return delaylength;
    }
    }


    private static double getclock() {{
        return System.nanoTime() / (double) 1000000000;
    }
    }


    static void finalise(String name, boolean benchmark) {{
        printfooter(name, stats(benchmark), benchmark);
    }
    }


    static void printfooter(String name, double time, boolean benchmark) {{
        System.out.println(name + " time     = " + time + " microseconds");
        if (benchmark) {
            System.out.println(name + " overhead     = " + (time - reftime) + " microseconds");
        }
    }
    }


    private static double stats(boolean benchmark) {{
        double meantime = 0.0d, totaltime = 0.0d, sumsq = 0.0d, mintime = 0.0d, maxtime = 0.0d, sd = 0.0d, cutoff = 0.0d;
        int i = 0, nr = 0;
        mintime = 1.0e10;
        maxtime = 0;
        totaltime = 0;
        for (i = 0; i < outerreps; i++) {
            mintime = (mintime < times[i]) ? mintime : times[i];
            maxtime = (maxtime > times[i]) ? maxtime : times[i];
            totaltime += times[i];
        }
        meantime = totaltime / outerreps;
        sumsq = 0;
        for (i = 0; i < outerreps; i++) {
            sumsq += (times[i] - meantime) * (times[i] - meantime);
        }
        sd = Math.sqrt(sumsq / (double) outerreps);
        cutoff = 3.0 * sd;
        nr = 0;
        for (i = 0; i < outerreps; i++) {
            if (Math.abs(times[i] - meantime) > cutoff) {
                nr++;
            }
        }
        System.out.printf("\n");
        System.out.printf("Sample_size       Average             Min         Max          S.D.          Outliers\n");
        System.out.printf("%d                %f         %f          %f           %f            %d\n", outerreps, meantime, mintime, maxtime, sd, nr);
        System.out.printf("\n");
        if (!benchmark) {
            reftime = meantime;
            refsd = sd;
        }
        return meantime;
    }
    }

}
