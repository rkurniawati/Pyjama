package eventdrivenTest;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.ArrayList;
import utils.SimulateWork;
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

public class ParCptOffloadingTest extends JFrame implements ActionListener {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    JPanel pane = new JPanel();

    public JButton task_button = new JButton("Task");

    private volatile long responseCounting = 0;

    ParCptOffloadingTest() {
        super("Event Handler Test");
        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.add(pane);
        task_button.addActionListener(this);
        setVisible(true);
        System.out.println("In myFrame, running constructor, main thread num" + Thread.currentThread().getId());
        Pyjama.omp_register_as_virtual_target("edt");
        Pyjama.omp_create_virtual_target("worker", 5);
    }

    public void actionPerformed(ActionEvent event) {{
        Object source = event.getSource();
        if (source == task_button) {
            /*OpenMP Target region (#0) -- START */
            ConcurrentHashMap<String, Object> inputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
            ConcurrentHashMap<String, Object> outputlist__OMP_TargetTaskRegion_0 = new ConcurrentHashMap<String,Object>();
            _OMP_TargetTaskRegion_0 _OMP_TargetTaskRegion_0_in = new _OMP_TargetTaskRegion_0(inputlist__OMP_TargetTaskRegion_0,outputlist__OMP_TargetTaskRegion_0);
            PjRuntime.submitTask(Thread.currentThread(), "worker", _OMP_TargetTaskRegion_0_in);
            /*OpenMP Target region (#0) -- END */

        }
    }
    }
            class _OMP_TargetTaskRegion_0 extends pj.pr.target.TargetTask{
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
                        computeTask();
                        plusEventFinishCount();
                    }
                    /****User Code END***/
                return null;
            }
        }




    private void plusEventFinishCount() {{
        this.responseCounting++;
    }
    }


    public long getResponsesAccumulated() {{
        return this.responseCounting;
    }
    }


    private int computeTask() {{
        SimulateWork.work(100);
        System.out.println("task finished");
        return 1;
    }
    }


    public static void main(String args[]) {{
        ParCptOffloadingTest a = new ParCptOffloadingTest();
        EventPostingThread ept = new EventPostingThread(5, a, 5);
        ept.start();
        try {
            ept.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long req = ept.getRequestsAccumulated();
        long res = a.getResponsesAccumulated();
        System.out.println("get req/res:" + req + "/" + res);
    }
    }

}
