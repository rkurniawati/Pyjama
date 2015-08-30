package asyncTest;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.swing.*;

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

public class AsyncGuiTest extends JFrame implements ActionListener {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    JLabel task1_answer = new JLabel("");

    JLabel task2_answer = new JLabel("");

    JPanel pane = new JPanel();

    JButton task1_button = new JButton("Task1");

    JButton task2_button = new JButton("Task2");

    AsyncGuiTest() {
        super("Event Handler Demo");
        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.add(pane);
        task1_button.addActionListener(this);
        task2_button.addActionListener(this);
        pane.add(task1_answer);
        pane.add(task1_button);
        pane.add(task2_answer);
        pane.add(task2_button);
        System.out.println("In myFrame");
        setVisible(true);
        Pyjama.omp_register_as_virtual_target("edt");
        Pyjama.omp_create_virtual_target("worker");
    }

    public void actionPerformed(ActionEvent event) {{
        Object source = event.getSource();
        if (source == task1_button) {
            task1_answer.setText("Start Processing Task1!");
            System.err.println("Processing task 1");
            long startTime = System.currentTimeMillis();
            /*OpenMP Target region (#0) -- START */
            ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
            inputlist__OMP_TargetTaskRegion_0.put("startTime",startTime);
            _OMP_TargetTaskRegion_0 _OMP_TargetTaskRegion_0_in = new _OMP_TargetTaskRegion_0(inputlist__OMP_TargetTaskRegion_0,outputlist__OMP_TargetTaskRegion_0);
            PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_0_in);
            /*OpenMP Target region (#0) -- END */

        }
        if (source == task2_button) {
            task2_answer.setText("Start Processing Task2!");
            System.out.println("Processing task 2");
            System.out.println("Task 2 finished");
            task2_answer.setText("Task 2 finished");
        }
    }
    }
                        class _OMP_TargetTaskRegion_1 extends pj.pr.target.TargetTask{
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
                                    task1_answer.setText("Task 1 finished");
                                }
                                /****User Code END***/
                            return null;
                        }
                    }


            class _OMP_TargetTaskRegion_0 extends pj.pr.target.TargetTask{
                private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
                private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();

                //#BEGIN shared variables defined here
                long startTime = 0L;
                //#END shared variables defined here
                //#BEGIN private/firstprivate reduction variables defined here
                //#END private/firstprivate reduction variables  defined here
                public _OMP_TargetTaskRegion_0(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
                    this.OMP_inputList = inputlist;
                    this.OMP_outputList = outputlist;
                    //#BEGIN shared variables initialised here
                    startTime = (Long)OMP_inputList.get("startTime");
                    //#END shared variables initialised here
                    //#BEGIN firstprivate reduction variables initialised here
                    //#END firstprivate reduction variables initialised here
                }

                private void updateOutputListForSharedVars() {
                    //BEGIN update outputlist
                    OMP_outputList.put("startTime",startTime);
                    //END update outputlist
                }
                @Override
                public ConcurrentHashMap<String,Object> call() {
                    /****User Code BEGIN***/
                    {
                        computeTask1();
                        long timeSpan = System.currentTimeMillis() - startTime;
                        System.err.println("Task 1 finishes with time span:" + timeSpan);
                        /*OpenMP Target region (#1) -- START */
                        ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_1 = new ConcurrentHashMap<String,Object>();
                        ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_1 = new ConcurrentHashMap<String,Object>();
                        _OMP_TargetTaskRegion_1 _OMP_TargetTaskRegion_1_in = new _OMP_TargetTaskRegion_1(inputlist__OMP_TargetTaskRegion_1,outputlist__OMP_TargetTaskRegion_1);
                        PjRuntime.submitTask(Thread.currentThread(), "edt", _OMP_TargetTaskRegion_1_in);
                        /*OpenMP Target region (#1) -- END */

                    }
                    /****User Code END***/
                return null;
            }
        }




    private int computeTask1() {{
        int i = 0;
        for (i = 1; i <= 5; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*OpenMP Target region (#2) -- START */
            ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_2 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_2 = new ConcurrentHashMap<String,Object>();
            inputlist__OMP_TargetTaskRegion_2.put("i",i);
            _OMP_TargetTaskRegion_2 _OMP_TargetTaskRegion_2_in = new _OMP_TargetTaskRegion_2(inputlist__OMP_TargetTaskRegion_2,outputlist__OMP_TargetTaskRegion_2);
            PjRuntime.submitTask(Thread.currentThread(), "edt", _OMP_TargetTaskRegion_2_in);
            /*OpenMP Target region (#2) -- END */

        }
        return 1;
    }
    }
            class _OMP_TargetTaskRegion_2 extends pj.pr.target.TargetTask{
                private ConcurrentHashMap<String, Object> OMP_inputList = new ConcurrentHashMap<String, Object>();
                private ConcurrentHashMap<String, Object> OMP_outputList = new ConcurrentHashMap<String, Object>();

                //#BEGIN shared variables defined here
                int i = 0;
                //#END shared variables defined here
                //#BEGIN private/firstprivate reduction variables defined here
                //#END private/firstprivate reduction variables  defined here
                public _OMP_TargetTaskRegion_2(ConcurrentHashMap<String, Object> inputlist, ConcurrentHashMap<String, Object> outputlist) {
                    this.OMP_inputList = inputlist;
                    this.OMP_outputList = outputlist;
                    //#BEGIN shared variables initialised here
                    i = (Integer)OMP_inputList.get("i");
                    //#END shared variables initialised here
                    //#BEGIN firstprivate reduction variables initialised here
                    //#END firstprivate reduction variables initialised here
                }

                private void updateOutputListForSharedVars() {
                    //BEGIN update outputlist
                    OMP_outputList.put("i",i);
                    //END update outputlist
                }
                @Override
                public ConcurrentHashMap<String,Object> call() {
                    /****User Code BEGIN***/
                    {
                        task1_answer.setText("Finish " + i + "/5 of task 1");
                        System.out.println("Finish " + i + "/5 of task 1");
                    }
                    /****User Code END***/
                return null;
            }
        }




    public static void main(String args[]) {{
        new AsyncGuiTest();
    }
    }

}
