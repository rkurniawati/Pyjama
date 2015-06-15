import java.util.ArrayList;
import java.util.Iterator;
import pj.*;

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

public class HelloWorld {

    public static void main(String[] arg) {{
        System.out.println("Hello world from sequential code");
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add("test" + i);
        }
        long startTime = System.currentTimeMillis();
        /*OpenMP Parallel region (#0) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_0 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_0 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_0);
        int _threadNum__OMP_ParallelRegion_0 = icv__OMP_ParallelRegion_0.nthreads_var.get(icv__OMP_ParallelRegion_0.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_0 = new ConcurrentHashMap<String,Object>();
        _OMP_ParallelRegion_0 _OMP_ParallelRegion_0_in = new _OMP_ParallelRegion_0(_threadNum__OMP_ParallelRegion_0,icv__OMP_ParallelRegion_0,inputlist__OMP_ParallelRegion_0,outputlist__OMP_ParallelRegion_0);
        _OMP_ParallelRegion_0_in.runParallelCode();
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_0);
        RuntimeException OMP_ee_0 = (RuntimeException) _OMP_ParallelRegion_0_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee_0 != null) {throw OMP_ee_0;}
        /*OpenMP Parallel region (#0) -- END */

        /*OpenMP Parallel region (#1) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_1 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_1 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_1);
        int _threadNum__OMP_ParallelRegion_1 = icv__OMP_ParallelRegion_1.nthreads_var.get(icv__OMP_ParallelRegion_1.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_1 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_1.put("list",list);
        _OMP_ParallelRegion_1 _OMP_ParallelRegion_1_in = new _OMP_ParallelRegion_1(_threadNum__OMP_ParallelRegion_1,icv__OMP_ParallelRegion_1,inputlist__OMP_ParallelRegion_1,outputlist__OMP_ParallelRegion_1);
        _OMP_ParallelRegion_1_in.runParallelCode();
        list = (ArrayList<String>)outputlist__OMP_ParallelRegion_1.get("list");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_1);
        RuntimeException OMP_ee_1 = (RuntimeException) _OMP_ParallelRegion_1_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee_1 != null) {throw OMP_ee_1;}
        /*OpenMP Parallel region (#1) -- END */

        /*OpenMP Parallel region (#2) -- START */
        InternalControlVariables icv_previous__OMP_ParallelRegion_2 = PjRuntime.getCurrentThreadICV();
        InternalControlVariables icv__OMP_ParallelRegion_2 = PjRuntime.inheritICV(icv_previous__OMP_ParallelRegion_2);
        int _threadNum__OMP_ParallelRegion_2 = icv__OMP_ParallelRegion_2.nthreads_var.get(icv__OMP_ParallelRegion_2.levels_var);
        ConcurrentHashMap<String, Object> inputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_ParallelRegion_2 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_ParallelRegion_2.put("list",list);
        _OMP_ParallelRegion_2 _OMP_ParallelRegion_2_in = new _OMP_ParallelRegion_2(_threadNum__OMP_ParallelRegion_2,icv__OMP_ParallelRegion_2,inputlist__OMP_ParallelRegion_2,outputlist__OMP_ParallelRegion_2);
        _OMP_ParallelRegion_2_in.runParallelCode();
        list = (ArrayList<String>)outputlist__OMP_ParallelRegion_2.get("list");
        PjRuntime.recoverParentICV(icv_previous__OMP_ParallelRegion_2);
        RuntimeException OMP_ee_2 = (RuntimeException) _OMP_ParallelRegion_2_in.OMP_CurrentParallelRegionExceptionSlot.get();
        if (OMP_ee_2 != null) {throw OMP_ee_2;}
        /*OpenMP Parallel region (#2) -- END */

        long duration = (System.currentTimeMillis() - startTime);
        double seconds = duration / 1000.0;
        System.out.println("done " + seconds + "seconds");
    }
    }
static class _OMP_ParallelRegion_0{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        private ParIterator<?> OMP__ParIteratorCreator;
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
                                System.out.println("Hello world from Pyjama simple for " + i);
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


static class _OMP_ParallelRegion_1{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        private ParIterator<?> OMP__ParIteratorCreator;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
        ArrayList<String> list = null;
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
            list = (ArrayList<String>)OMP_inputList.get("list");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("list",list);
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
                        String x = null;
                        ParIterator<String> x_OMP_ParIterator = null;
                        if (0 == Pyjama.omp_get_thread_num()) {
                            OMP__ParIteratorCreator = ParIteratorFactory.createParIterator(list, Pyjama.omp_get_num_threads(), ParIterator.Schedule.DYNAMIC, 1);
                        }
                        PjRuntime.setBarrier();
                        x_OMP_ParIterator = (ParIterator<String>)OMP__ParIteratorCreator;
                        while (x_OMP_ParIterator.hasNext()) {
                            x = x_OMP_ParIterator.next();
                            {
                                System.out.println("Hello world from Pyjama foreach " + x);
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


static class _OMP_ParallelRegion_2{
        private int OMP_threadNumber = 1;
        private InternalControlVariables icv;
        private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
        private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
        private ReentrantLock OMP_lock;
        private ParIterator<?> OMP__ParIteratorCreator;
        public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

        //#BEGIN shared variables defined here
        ArrayList<String> list = null;
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
            list = (ArrayList<String>)OMP_inputList.get("list");
            //#END shared variables initialised here
        }

        private void updateOutputListForSharedVars() {
            //BEGIN update outputlist
            OMP_outputList.put("list",list);
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
                        
                        ParIterator<String> iter = null;
                        if (0 == Pyjama.omp_get_thread_num()) {
                            OMP__ParIteratorCreator = ParIteratorFactory.createParIterator(list, Pyjama.omp_get_num_threads(), ParIterator.Schedule.STATIC, 3);
                        }
                        PjRuntime.setBarrier();
                        iter = (ParIterator<String>)OMP__ParIteratorCreator;
                        while (iter.hasNext()) {
                            {
                                String x = iter.next();
                                System.out.println("Hello world from Pyjama iterator " + x);
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



}
