package asyncTest;

import pj.*;

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

public class AsyncSemanticTest {

    static void main(String[] s) {{
        /*OpenMP Target region (#0) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
        _OMP_TargetTaskRegion_0 _OMP_TargetTaskRegion_0_in = new _OMP_TargetTaskRegion_0(inputlist__OMP_TargetTaskRegion_0,outputlist__OMP_TargetTaskRegion_0);
        _OMP_TargetTaskRegion_0_in.runTaskCode();
        /*OpenMP Target region (#0) -- END */

        System.out.println("after Async execution");
    }
    }
static class _OMP_TargetTaskRegion_0{
    private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
    private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
    public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

    //#BEGIN shared variables defined here
    //#END shared variables defined here
    public _OMP_TargetTaskRegion_0(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
        this.OMP_inputList = inputlist;
        this.OMP_outputList = outputlist;
        //#BEGIN shared variables initialised here
        //#END shared variables initialised here
    }

    private void updateOutputListForSharedVars() {
        //BEGIN update outputlist
        //END update outputlist
    }
    class MyCallable implements Callable<ConcurrentHashMap<String,Object>> {
        private ConcurrentHashMap<String, Object> OMP_inputList;
        private ConcurrentHashMap<String, Object> OMP_outputList;
        //#BEGIN private/firstprivate reduction variables defined here
        //#END private/firstprivate reduction variables  defined here
        MyCallable(int id, ConcurrentHashMap<String,Object> inputlist, ConcurrentHashMap<String,Object> outputlist){
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
                    System.out.println("Async execution");
                }
                /****User Code END***/
            } catch (OmpParallelRegionLocalCancellationException e) {
             	PjRuntime.decreaseBarrierCount();
            } catch (Exception e) {
                PjRuntime.decreaseBarrierCount();
            	PjExecutor.cancelCurrentThreadGroup();
            OMP_CurrentParallelRegionExceptionSlot.compareAndSet(null, e);
        }
        updateOutputListForSharedVars();
        return null;
    }
}
public void runTaskCode() {
    Callable<ConcurrentHashMap<String,Object>> slaveThread = new MyCallable(i, OMP_inputList, OMP_outputList);
    PjRuntime.submit(i, slaveThread, icv);
}
}



}
