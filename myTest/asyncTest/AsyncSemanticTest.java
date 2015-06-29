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
        int c = 0, d = 0, e = 0;
        /*OpenMP Target region (#0) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_TargetTaskRegion_0.put("a",a);
        inputlist__OMP_TargetTaskRegion_0.put("b",b);
        inputlist__OMP_TargetTaskRegion_0.put("c",c);
        _OMP_TargetTaskRegion_0 _OMP_TargetTaskRegion_0_in = new _OMP_TargetTaskRegion_0(inputlist__OMP_TargetTaskRegion_0,outputlist__OMP_TargetTaskRegion_0);
        PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_0_in);
        /*OpenMP Target region (#0) -- END */

        /*OpenMP Target region (#1) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_1 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_1 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_TargetTaskRegion_1.put("d",d);
        inputlist__OMP_TargetTaskRegion_1.put("b",b);
        inputlist__OMP_TargetTaskRegion_1.put("a",a);
        _OMP_TargetTaskRegion_1 _OMP_TargetTaskRegion_1_in = new _OMP_TargetTaskRegion_1(inputlist__OMP_TargetTaskRegion_1,outputlist__OMP_TargetTaskRegion_1);
        PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_1_in);
        PjRuntime.waitTaskForFinish(_OMP_TargetTaskRegion_1_in);
        /*OpenMP Target region (#1) -- END */

        /*OpenMP Target region (#2) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_2 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_2 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_TargetTaskRegion_2.put("e",e);
        inputlist__OMP_TargetTaskRegion_2.put("b",b);
        inputlist__OMP_TargetTaskRegion_2.put("a",a);
        _OMP_TargetTaskRegion_2 _OMP_TargetTaskRegion_2_in = new _OMP_TargetTaskRegion_2(inputlist__OMP_TargetTaskRegion_2,outputlist__OMP_TargetTaskRegion_2);
        PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_2_in);
        /*OpenMP Target region (#2) -- END */

        System.out.println("after Async execution c=" + c);
        System.out.println("Done");
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
        OMP_outputList.put("a",a);
        OMP_outputList.put("b",b);
        OMP_outputList.put("c",c);
        //END update outputlist
    }
    @Override
    public ConcurrentHashMap<String,Object> call() {
        try {
            /****User Code BEGIN***/
            {
                int c = a + b;
                System.out.println("Async nowait execution c=" + c);
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


static class _OMP_TargetTaskRegion_1 extends pj.pr.target.TargetTask{
    private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
    private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
    public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

    //#BEGIN shared variables defined here
    int d = 0;
    int b = 0;
    int a = 0;
    //#END shared variables defined here
    //#BEGIN private/firstprivate reduction variables defined here
    //#END private/firstprivate reduction variables  defined here
    public _OMP_TargetTaskRegion_1(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
        this.OMP_inputList = inputlist;
        this.OMP_outputList = outputlist;
        //#BEGIN shared variables initialised here
        d = (Integer)OMP_inputList.get("d");
        b = (Integer)OMP_inputList.get("b");
        a = (Integer)OMP_inputList.get("a");
        //#END shared variables initialised here
        //#BEGIN firstprivate reduction variables initialised here
        //#END firstprivate reduction variables initialised here
    }

    private void updateOutputListForSharedVars() {
        //BEGIN update outputlist
        OMP_outputList.put("d",d);
        OMP_outputList.put("b",b);
        OMP_outputList.put("a",a);
        //END update outputlist
    }
    @Override
    public ConcurrentHashMap<String,Object> call() {
        try {
            /****User Code BEGIN***/
            {
                d = a + b;
                System.out.println("Async await execution c=" + d);
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

class main extends pj.pr.target.TargetTask{
    public main(String[] s) {
    }
    int state;
    @Override
    public ConcurrentHashMap<String,Object> call() {
        switch(state) {
        case 0:
            int a = 5;
            int b = 4;
            int c = 0, d = 0, e = 0;
            //#omp target virtual(worker) nowait shared(a, b, c) 
{
    {
        int c = a + b;
        System.out.println("Async nowait execution c=" + c);
    }
}
        case 1:
            //#omp target virtual(worker) astask(axing) shared(e, b, a) 
{
    {
        e = a + b;
        System.out.println("Async execution 2 c=" + e);
    }
}
            System.out.println("after Async execution c=" + c);
            System.out.println("Done");
            default:
            }
        }


static class _OMP_TargetTaskRegion_2 extends pj.pr.target.TargetTask{
    private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
    private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();
    public AtomicReference<Throwable> OMP_CurrentParallelRegionExceptionSlot = new AtomicReference<Throwable>(null);

    //#BEGIN shared variables defined here
    int e = 0;
    int b = 0;
    int a = 0;
    //#END shared variables defined here
    //#BEGIN private/firstprivate reduction variables defined here
    //#END private/firstprivate reduction variables  defined here
    public _OMP_TargetTaskRegion_2(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
        this.OMP_inputList = inputlist;
        this.OMP_outputList = outputlist;
        //#BEGIN shared variables initialised here
        e = (Integer)OMP_inputList.get("e");
        b = (Integer)OMP_inputList.get("b");
        a = (Integer)OMP_inputList.get("a");
        //#END shared variables initialised here
        //#BEGIN firstprivate reduction variables initialised here
        //#END firstprivate reduction variables initialised here
    }

    private void updateOutputListForSharedVars() {
        //BEGIN update outputlist
        OMP_outputList.put("e",e);
        OMP_outputList.put("b",b);
        OMP_outputList.put("a",a);
        //END update outputlist
    }
    @Override
    public ConcurrentHashMap<String,Object> call() {
        try {
            /****User Code BEGIN***/
            {
                e = a + b;
                System.out.println("Async execution 2 c=" + e);
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
