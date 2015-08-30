package asyncTest;

import pj.*;
import utils.SimulateWork;

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

public class AsyncSemanticTest {

    public static void main(String[] s) {{
        System.out.println("Start");
        /*OpenMP Target region (#0) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
        _OMP_TargetTaskRegion_0 _OMP_TargetTaskRegion_0_in = new _OMP_TargetTaskRegion_0(inputlist__OMP_TargetTaskRegion_0,outputlist__OMP_TargetTaskRegion_0);
        PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_0_in);
        /*OpenMP Target region (#0) -- END */

        /*OpenMP Target region (#1) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_1 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_1 = new ConcurrentHashMap<String,Object>();
        _OMP_TargetTaskRegion_1 _OMP_TargetTaskRegion_1_in = new _OMP_TargetTaskRegion_1(inputlist__OMP_TargetTaskRegion_1,outputlist__OMP_TargetTaskRegion_1);
        PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_1_in);
        /*OpenMP Target region (#1) -- END */

        /*OpenMP Target region (#2) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_2 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_2 = new ConcurrentHashMap<String,Object>();
        _OMP_TargetTaskRegion_2 _OMP_TargetTaskRegion_2_in = new _OMP_TargetTaskRegion_2(inputlist__OMP_TargetTaskRegion_2,outputlist__OMP_TargetTaskRegion_2);
        PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_2_in);
        PjRuntime.waitTaskForFinish(_OMP_TargetTaskRegion_2_in);
        /*OpenMP Target region (#2) -- END */

        System.out.println("Done");
    }
    }
        static class _OMP_TargetTaskRegion_0 extends pj.pr.target.TargetTask{
            private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
            private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();

            //#BEGIN shared variables defined here
            //#END shared variables defined here
            //#BEGIN private/firstprivate reduction variables defined here
            //#END private/firstprivate reduction variables  defined here
            public _OMP_TargetTaskRegion_0(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
                this.OMP_inputList = inputlist;
                this.OMP_outputList = outputlist;
                //#BEGIN shared variables initialised here
                //#END shared variables initialised here
                //#BEGIN firstprivate reduction variables initialised here
                //#END firstprivate reduction variables initialised here
            }

            private void updateOutputListForSharedVars() {
                //BEGIN update outputlist
                //END update outputlist
            }
            @Override
            public ConcurrentHashMap<String,Object> call() {
                /****User Code BEGIN***/
                {
                    System.out.println("task1 before");
                    asyncTest();
                    System.out.println("task1 after");
                }
                /****User Code END***/
            return null;
        }
    }


        static class _OMP_TargetTaskRegion_1 extends pj.pr.target.TargetTask{
            private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
            private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();

            //#BEGIN shared variables defined here
            //#END shared variables defined here
            //#BEGIN private/firstprivate reduction variables defined here
            //#END private/firstprivate reduction variables  defined here
            public _OMP_TargetTaskRegion_1(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
                this.OMP_inputList = inputlist;
                this.OMP_outputList = outputlist;
                //#BEGIN shared variables initialised here
                //#END shared variables initialised here
                //#BEGIN firstprivate reduction variables initialised here
                //#END firstprivate reduction variables initialised here
            }

            private void updateOutputListForSharedVars() {
                //BEGIN update outputlist
                //END update outputlist
            }
            @Override
            public ConcurrentHashMap<String,Object> call() {
                /****User Code BEGIN***/
                {
                    System.out.println("task2 before");
                    asyncTest();
                    System.out.println("task2 after");
                }
                /****User Code END***/
            return null;
        }
    }


        static class _OMP_TargetTaskRegion_2 extends pj.pr.target.TargetTask{
            private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
            private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();

            //#BEGIN shared variables defined here
            //#END shared variables defined here
            //#BEGIN private/firstprivate reduction variables defined here
            //#END private/firstprivate reduction variables  defined here
            public _OMP_TargetTaskRegion_2(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
                this.OMP_inputList = inputlist;
                this.OMP_outputList = outputlist;
                //#BEGIN shared variables initialised here
                //#END shared variables initialised here
                //#BEGIN firstprivate reduction variables initialised here
                //#END firstprivate reduction variables initialised here
            }

            private void updateOutputListForSharedVars() {
                //BEGIN update outputlist
                //END update outputlist
            }
            @Override
            public ConcurrentHashMap<String,Object> call() {
                /****User Code BEGIN***/
                {
                    System.out.println("task2 before");
                    asyncTest();
                    System.out.println("task2 after");
                }
                /****User Code END***/
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
                    /*OpenMP Target region (#0) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
        _OMP_TargetTaskRegion_0 _OMP_TargetTaskRegion_0_in = new _OMP_TargetTaskRegion_0(inputlist__OMP_TargetTaskRegion_0,outputlist__OMP_TargetTaskRegion_0);
        PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_0_in);
        /*OpenMP Target region (#0) -- END */

                    /*OpenMP Target region (#1) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_1 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_1 = new ConcurrentHashMap<String,Object>();
        _OMP_TargetTaskRegion_1 _OMP_TargetTaskRegion_1_in = new _OMP_TargetTaskRegion_1(inputlist__OMP_TargetTaskRegion_1,outputlist__OMP_TargetTaskRegion_1);
        PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_1_in);
        /*OpenMP Target region (#1) -- END */

                    /*OpenMP Target region (#2) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_2 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_2 = new ConcurrentHashMap<String,Object>();
        _OMP_TargetTaskRegion_2 _OMP_TargetTaskRegion_2_in = new _OMP_TargetTaskRegion_2(inputlist__OMP_TargetTaskRegion_2,outputlist__OMP_TargetTaskRegion_2);
        PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_2_in);
        PjRuntime.waitTaskForFinish(_OMP_TargetTaskRegion_2_in);
        /*OpenMP Target region (#2) -- END */

        case 1:
            default:
            }
            return null;
        }
    }




    public static void test() {{
        int a = 5;
        int b = 4;
        int c = 0, d = 0, e = 0;
        /*OpenMP Target region (#3) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_3 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_3 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_TargetTaskRegion_3.put("c",c);
        inputlist__OMP_TargetTaskRegion_3.put("a",a);
        inputlist__OMP_TargetTaskRegion_3.put("b",b);
        _OMP_TargetTaskRegion_3 _OMP_TargetTaskRegion_3_in = new _OMP_TargetTaskRegion_3(inputlist__OMP_TargetTaskRegion_3,outputlist__OMP_TargetTaskRegion_3);
        PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_3_in);
        /*OpenMP Target region (#3) -- END */

        System.out.println("1------------");
        /*OpenMP Target region (#4) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_4 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_4 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_TargetTaskRegion_4.put("a",a);
        inputlist__OMP_TargetTaskRegion_4.put("d",d);
        inputlist__OMP_TargetTaskRegion_4.put("b",b);
        _OMP_TargetTaskRegion_4 _OMP_TargetTaskRegion_4_in = new _OMP_TargetTaskRegion_4(inputlist__OMP_TargetTaskRegion_4,outputlist__OMP_TargetTaskRegion_4);
        PjRuntime.submitTask(Thread.currentThread(), "worker1", _OMP_TargetTaskRegion_4_in);
        /*OpenMP Target region (#4) -- END */

        System.out.println("2------------");
        /*OpenMP Target region (#5) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_5 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_5 = new ConcurrentHashMap<String,Object>();
        inputlist__OMP_TargetTaskRegion_5.put("e",e);
        inputlist__OMP_TargetTaskRegion_5.put("a",a);
        inputlist__OMP_TargetTaskRegion_5.put("b",b);
        _OMP_TargetTaskRegion_5 _OMP_TargetTaskRegion_5_in = new _OMP_TargetTaskRegion_5(inputlist__OMP_TargetTaskRegion_5,outputlist__OMP_TargetTaskRegion_5);
        PjRuntime.submitTask(Thread.currentThread(), "worker2", _OMP_TargetTaskRegion_5_in);
        /*OpenMP Target region (#5) -- END */

        System.out.println("after Async execution c=" + c);

    }
    }
        static class _OMP_TargetTaskRegion_3 extends pj.pr.target.TargetTask{
            private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
            private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();

            //#BEGIN shared variables defined here
            int a = 0;
            int b = 0;
            int c = 0;
            //#END shared variables defined here
            //#BEGIN private/firstprivate reduction variables defined here
            //#END private/firstprivate reduction variables  defined here
            public _OMP_TargetTaskRegion_3(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
                this.OMP_inputList = inputlist;
                this.OMP_outputList = outputlist;
                //#BEGIN shared variables initialised here
                a = (Integer)OMP_inputList.get("a");
                b = (Integer)OMP_inputList.get("b");
                c = (Integer)OMP_inputList.get("c");
                //#END shared variables initialised here
                //#BEGIN firstprivate reduction variables initialised here
                //#END firstprivate reduction variables initialised here
            }

            private void updateOutputListForSharedVars() {
                //BEGIN update outputlist
                OMP_outputList.put("c",c);
                OMP_outputList.put("a",a);
                OMP_outputList.put("b",b);
                //END update outputlist
            }
            @Override
            public ConcurrentHashMap<String,Object> call() {
                /****User Code BEGIN***/
                {
                    c = a + b;
                    SimulateWork.work(100);
                    System.out.println("Async nowait execution c=" + c);
                }
                /****User Code END***/
            return null;
        }
    }


        static class _OMP_TargetTaskRegion_4 extends pj.pr.target.TargetTask{
            private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
            private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();

            //#BEGIN shared variables defined here
            int a = 0;
            int b = 0;
            int d = 0;
            //#END shared variables defined here
            //#BEGIN private/firstprivate reduction variables defined here
            //#END private/firstprivate reduction variables  defined here
            public _OMP_TargetTaskRegion_4(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
                this.OMP_inputList = inputlist;
                this.OMP_outputList = outputlist;
                //#BEGIN shared variables initialised here
                a = (Integer)OMP_inputList.get("a");
                b = (Integer)OMP_inputList.get("b");
                d = (Integer)OMP_inputList.get("d");
                //#END shared variables initialised here
                //#BEGIN firstprivate reduction variables initialised here
                //#END firstprivate reduction variables initialised here
            }

            private void updateOutputListForSharedVars() {
                //BEGIN update outputlist
                OMP_outputList.put("a",a);
                OMP_outputList.put("d",d);
                OMP_outputList.put("b",b);
                //END update outputlist
            }
            @Override
            public ConcurrentHashMap<String,Object> call() {
                /****User Code BEGIN***/
                {
                    d = a + b;
                    SimulateWork.work(100);
                    System.out.println("Async await execution c=" + d);
                }
                /****User Code END***/
            return null;
        }
    }


        static class _OMP_TargetTaskRegion_5 extends pj.pr.target.TargetTask{
            private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
            private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();

            //#BEGIN shared variables defined here
            int a = 0;
            int b = 0;
            int e = 0;
            //#END shared variables defined here
            //#BEGIN private/firstprivate reduction variables defined here
            //#END private/firstprivate reduction variables  defined here
            public _OMP_TargetTaskRegion_5(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
                this.OMP_inputList = inputlist;
                this.OMP_outputList = outputlist;
                //#BEGIN shared variables initialised here
                a = (Integer)OMP_inputList.get("a");
                b = (Integer)OMP_inputList.get("b");
                e = (Integer)OMP_inputList.get("e");
                //#END shared variables initialised here
                //#BEGIN firstprivate reduction variables initialised here
                //#END firstprivate reduction variables initialised here
            }

            private void updateOutputListForSharedVars() {
                //BEGIN update outputlist
                OMP_outputList.put("e",e);
                OMP_outputList.put("a",a);
                OMP_outputList.put("b",b);
                //END update outputlist
            }
            @Override
            public ConcurrentHashMap<String,Object> call() {
                /****User Code BEGIN***/
                {
                    e = a + b;
                    SimulateWork.work(100);
                    System.out.println("Async execution 2 c=" + e);
                }
                /****User Code END***/
            return null;
        }
    }




    public static void asyncTest() {{
        System.out.println("Async before");
        /*OpenMP Target region (#6) -- START */
        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_6 = new ConcurrentHashMap<String,Object>();
        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_6 = new ConcurrentHashMap<String,Object>();
        _OMP_TargetTaskRegion_6 _OMP_TargetTaskRegion_6_in = new _OMP_TargetTaskRegion_6(inputlist__OMP_TargetTaskRegion_6,outputlist__OMP_TargetTaskRegion_6);
        PjRuntime.submitTask(Thread.currentThread(), "worker1", _OMP_TargetTaskRegion_6_in);
        /*OpenMP Target region (#6) -- END */

        System.out.println("Async after");
    }
    }
        static class _OMP_TargetTaskRegion_6 extends pj.pr.target.TargetTask{
            private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
            private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();

            //#BEGIN shared variables defined here
            //#END shared variables defined here
            //#BEGIN private/firstprivate reduction variables defined here
            //#END private/firstprivate reduction variables  defined here
            public _OMP_TargetTaskRegion_6(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
                this.OMP_inputList = inputlist;
                this.OMP_outputList = outputlist;
                //#BEGIN shared variables initialised here
                //#END shared variables initialised here
                //#BEGIN firstprivate reduction variables initialised here
                //#END firstprivate reduction variables initialised here
            }

            private void updateOutputListForSharedVars() {
                //BEGIN update outputlist
                //END update outputlist
            }
            @Override
            public ConcurrentHashMap<String,Object> call() {
                /****User Code BEGIN***/
                {
                    SimulateWork.work(100);
                    System.out.println("Async await");
                }
                /****User Code END***/
            return null;
        }
    }



}
