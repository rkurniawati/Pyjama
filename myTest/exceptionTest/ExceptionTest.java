package exceptionTest;

import pj.*;

import pj.pr.*;
import pj.PjRuntime;
import pj.Pyjama;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.SwingUtilities;
import java.lang.reflect.InvocationTargetException;

public class ExceptionTest {

    public static void main(String[] args) {{
        System.out.println("the time span" + measure());
    }
    }


    public static long measure() {{
        long start = System.currentTimeMillis();
        test1();
        return System.currentTimeMillis() - start;
    }
    }


    public static void test0() {{
        /*OpenMP Parallel region (#0) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);
        int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);
        _OMP_ParallelRegion_0_in.runParallelCode();
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);
        /*OpenMP Parallel region (#0) -- END */

    }
    }
static class _OMP_ParallelRegion_0{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;

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
                /****User Code BEGIN***/
                {
                    System.out.println("first Stage");
                    PjRuntime.setBarrier();

                    System.out.println("second stage");
                }
                /****User Code END***/
                //BEGIN reduction procedure
                //END reduction procedure
                PjRuntime.setBarrier();
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
            } catch (pj.pr.exceptions.OmpParallelRegionLocalCancellationException e) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




    public static void test1() {{
        /*OpenMP Parallel region (#1) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_1 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_1 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_1);
        int _threadNum__OMP_ParallelRegion_1 = icv__OMP_ParallelRegion_1.nthreads_var.get(icv__OMP_ParallelRegion_1.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
        _OMP_ParallelRegion_1 _OMP_ParallelRegion_1_in = new _OMP_ParallelRegion_1(_threadNum__OMP_ParallelRegion_1,icv__OMP_ParallelRegion_1,inputlist__OMP_ParallelRegion_1,outputlist__OMP_ParallelRegion_1);
        _OMP_ParallelRegion_1_in.runParallelCode();
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_1);
        /*OpenMP Parallel region (#1) -- END */

    }
    }
static class _OMP_ParallelRegion_1{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
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
                /****User Code BEGIN***/
                {
                    System.out.println("first Stage");
                    try {
                        if (Pyjama.omp_get_thread_num() == 1) {
                            throw new RuntimeException("Local thread Exception");
                        } else {
                            for (int i = 0; i < 9999999; i++) ;
                        }
                    } catch (RuntimeException e) {
                        System.out.println("recovery" + e);
                    } finally {
                        System.out.println("finally");
                    }
                    PjRuntime.setBarrier();

                    System.out.println("second stage");
                    PjRuntime.setBarrier();

                    System.out.println("third stage");
                }
                /****User Code END***/
                //BEGIN reduction procedure
                //END reduction procedure
                PjRuntime.setBarrier();
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
            } catch (pj.pr.exceptions.OmpParallelRegionLocalCancellationException e) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




    public static void test2() {{
        /*OpenMP Parallel region (#2) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_2 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_2 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_2);
        int _threadNum__OMP_ParallelRegion_2 = icv__OMP_ParallelRegion_2.nthreads_var.get(icv__OMP_ParallelRegion_2.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
        _OMP_ParallelRegion_2 _OMP_ParallelRegion_2_in = new _OMP_ParallelRegion_2(_threadNum__OMP_ParallelRegion_2,icv__OMP_ParallelRegion_2,inputlist__OMP_ParallelRegion_2,outputlist__OMP_ParallelRegion_2);
        _OMP_ParallelRegion_2_in.runParallelCode();
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_2);
        /*OpenMP Parallel region (#2) -- END */

    }
    }
static class _OMP_ParallelRegion_2{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;

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
                /****User Code BEGIN***/
                {
                    System.out.println("first Stage");
                    if (Pyjama.omp_get_thread_num() == 1) {
                        for (int i = 0; i < 100000; i++) {
                        }
                        throw new RuntimeException("A thread throws an exception");
                    }
                    PjRuntime.setBarrier();

                    System.out.println("second stage");
                    PjRuntime.setBarrier();

                    System.out.println("third stage");
                }
                /****User Code END***/
                //BEGIN reduction procedure
                //END reduction procedure
                PjRuntime.setBarrier();
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
            } catch (pj.pr.exceptions.OmpParallelRegionLocalCancellationException e) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




    public static void test3() {{
        /*OpenMP Parallel region (#3) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_3 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_3 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_3);
        int _threadNum__OMP_ParallelRegion_3 = icv__OMP_ParallelRegion_3.nthreads_var.get(icv__OMP_ParallelRegion_3.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_3 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_3 = new ConcurrentHashMap<String,Object>();
        _OMP_ParallelRegion_3 _OMP_ParallelRegion_3_in = new _OMP_ParallelRegion_3(_threadNum__OMP_ParallelRegion_3,icv__OMP_ParallelRegion_3,inputlist__OMP_ParallelRegion_3,outputlist__OMP_ParallelRegion_3);
        _OMP_ParallelRegion_3_in.runParallelCode();
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_3);
        /*OpenMP Parallel region (#3) -- END */

    }
    }
static class _OMP_ParallelRegion_3{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;

        //#BEGIN shared variables defined here
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
                /****User Code BEGIN***/
                {
                    System.out.println("first Stage");
                    if (Pyjama.omp_get_thread_num() == 1) {
                        for (int i = 0; i < 100000; i++) {
                        }
                        throw new pj.pr.exceptions.OmpParallelRegionGlobalCancellationException();

                    }
                    PjRuntime.setBarrier();

                    System.out.println("second stage");
                    PjRuntime.setBarrier();

                    System.out.println("third stage");
                }
                /****User Code END***/
                //BEGIN reduction procedure
                //END reduction procedure
                PjRuntime.setBarrier();
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
            } catch (pj.pr.exceptions.OmpParallelRegionLocalCancellationException e) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




    public static void test4() {{
        /*OpenMP Parallel region (#4) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_4 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_4 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_4);
        int _threadNum__OMP_ParallelRegion_4 = icv__OMP_ParallelRegion_4.nthreads_var.get(icv__OMP_ParallelRegion_4.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_4 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_4 = new ConcurrentHashMap<String,Object>();
        _OMP_ParallelRegion_4 _OMP_ParallelRegion_4_in = new _OMP_ParallelRegion_4(_threadNum__OMP_ParallelRegion_4,icv__OMP_ParallelRegion_4,inputlist__OMP_ParallelRegion_4,outputlist__OMP_ParallelRegion_4);
        _OMP_ParallelRegion_4_in.runParallelCode();
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_4);
        /*OpenMP Parallel region (#4) -- END */

    }
    }
static class _OMP_ParallelRegion_4{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;

        //#BEGIN shared variables defined here
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
                /****User Code BEGIN***/
                {
                    System.out.println("first Stage" + Pyjama.omp_get_thread_num());
                    if (Pyjama.omp_get_thread_num() == 1) {
                        for (int i = 0; i < 100000; i++) {
                        }
                        throw new pj.pr.exceptions.OmpParallelRegionLocalCancellationException();

                    }
                    PjRuntime.setBarrier();

                    System.out.println("second stage" + Pyjama.omp_get_thread_num());
                    PjRuntime.setBarrier();

                    System.out.println("third stage" + Pyjama.omp_get_thread_num());
                }
                /****User Code END***/
                //BEGIN reduction procedure
                //END reduction procedure
                PjRuntime.setBarrier();
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
            } catch (pj.pr.exceptions.OmpParallelRegionLocalCancellationException e) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




    public static void test5() {{
        try {
            /*OpenMP Parallel region (#5) -- START */
            InternalControlVariables icv_previous__OMP_ParallelRegion_5 = PjRuntime.getCurrentThreadICV();
            InternalControlVariables icv__OMP_ParallelRegion_5 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_5);
            int _threadNum__OMP_ParallelRegion_5 = icv__OMP_ParallelRegion_5.nthreads_var.get(icv__OMP_ParallelRegion_5.levels_var);
            ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_5 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_5 = new ConcurrentHashMap<String,Object>();
            _OMP_ParallelRegion_5 _OMP_ParallelRegion_5_in = new _OMP_ParallelRegion_5(_threadNum__OMP_ParallelRegion_5,icv__OMP_ParallelRegion_5,inputlist__OMP_ParallelRegion_5,outputlist__OMP_ParallelRegion_5);
            _OMP_ParallelRegion_5_in.runParallelCode();
            PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_5);
            /*OpenMP Parallel region (#5) -- END */

        } catch (RuntimeException e) {
            System.out.println("catch exception" + e);
        } finally {
            System.out.println("finally");
        }
    }
    }
static class _OMP_ParallelRegion_5{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;

        //#BEGIN shared variables defined here
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
                /****User Code BEGIN***/
                {
                    System.out.println("first Stage");
                    if (Pyjama.omp_get_thread_num() == 0) {
                        throw new RuntimeException("A thread throws an exception");
                    } else {
                        for (int i = 0; i < 9999999; i++) ;
                    }
                }
                /****User Code END***/
                //BEGIN reduction procedure
                //END reduction procedure
                PjRuntime.setBarrier();
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
            } catch (pj.pr.exceptions.OmpParallelRegionLocalCancellationException e) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




    public static void test6() {{
        /*OpenMP Parallel region (#6) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_6 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_6 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_6);
        int _threadNum__OMP_ParallelRegion_6 = icv__OMP_ParallelRegion_6.nthreads_var.get(icv__OMP_ParallelRegion_6.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_6 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_6 = new ConcurrentHashMap<String,Object>();
        _OMP_ParallelRegion_6 _OMP_ParallelRegion_6_in = new _OMP_ParallelRegion_6(_threadNum__OMP_ParallelRegion_6,icv__OMP_ParallelRegion_6,inputlist__OMP_ParallelRegion_6,outputlist__OMP_ParallelRegion_6);
        _OMP_ParallelRegion_6_in.runParallelCode();
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_6);
        /*OpenMP Parallel region (#6) -- END */

    }
    }
static class _OMP_ParallelRegion_6{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;

        //#BEGIN shared variables defined here
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
                /****User Code BEGIN***/
                /*OpenMP Work Share region (#0) -- START */
                
                {//#BEGIN firstprivate lastprivate reduction variables defined and initialized here
                    //#set implicit barrier here, otherwise unexpected initial value happens
                    PjRuntime.setBarrier();
                    //#END firstprivate lastprivate reduction variables defined and initialized here
                    try{
                        int i=0;
                        int OMP_iterator = 0;
                        int OMP_end = (int)((10)-(0))/(1);
                        if (((10)-(0))%(1) == 0) {
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
                                System.out.println("i=" + i + "==>" + Pyjama.omp_get_thread_num());
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
            } catch (pj.pr.exceptions.OmpParallelRegionLocalCancellationException e) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



}
