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

    public static void main(String[] s) {{
        int a = 5;
        int b = 4;
        int c = 0;
        /*OpenMP Target region (#0) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_TargetTaskRegion_0.put("b",b);
        inputlist__OMP_TargetTaskRegion_0.put("a",a);
        inputlist__OMP_TargetTaskRegion_0.put("c",c);
        _OMP_TargetTaskRegion_0 _OMP_TargetTaskRegion_0_in = new _OMP_TargetTaskRegion_0(inputlist__OMP_TargetTaskRegion_0,outputlist__OMP_TargetTaskRegion_0);
        _OMP_TargetTaskRegion_0_in.submitTo("worker");
        /*OpenMP Target region (#0) -- END */

        System.out.println("after Async execution c=" + c);
    }
    }
static class _OMP_TargetTaskRegion_0 extends pj.pr.target.TargetTask{
    private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
    private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
    public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

    //#BEGIN shared variables defined here
    int b = 0;
    int c = 0;
    int a = 0;
    //#END shared variables defined here
    //#BEGIN private/firstprivate reduction variables defined here
    //#END private/firstprivate reduction variables  defined here
    public _OMP_TargetTaskRegion_0(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
        this.OMP_inputList = inputlist;
        this.OMP_outputList = outputlist;
        //#BEGIN shared variables initialised here
        b = (Integer)OMP_inputList.get("b");
        c = (Integer)OMP_inputList.get("c");
        a = (Integer)OMP_inputList.get("a");
        //#END shared variables initialised here
        //#BEGIN firstprivate reduction variables initialised here
        //#END firstprivate reduction variables initialised here
    }

    private void updateOutputListForSharedVars() {
        //BEGIN update outputlist
        OMP_outputList.put("b",b);
        OMP_outputList.put("a",a);
        OMP_outputList.put("c",c);
        //END update outputlist
    }
    @Override
    public ConcurrentHashMap<String,Object> call() {
        try {
            /****User Code BEGIN***/
            {
                int c = a + b;
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
        return null;
    }
}



}
