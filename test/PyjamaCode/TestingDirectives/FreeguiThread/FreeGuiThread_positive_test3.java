package PyjamaCode.TestingDirectives.FreeguiThread;

import javax.swing.SwingUtilities;
import pj.*;

import pj.pr.*;
import pj.PjRuntime;
import pj.Pyjama;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.SwingUtilities;
import java.lang.reflect.InvocationTargetException;

/**
* Test the explicit and implicit barrier
*/
public class FreeGuiThread_positive_test3 {

    private StringBuffer sb = new StringBuffer();

    public String positive_test3(int threadNumber) {{
        Pyjama.omp_set_num_threads(threadNumber);
        try {
            SwingUtilities.invokeAndWait(simulateEDT);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    }


    final Runnable simulateEDT = new Runnable() {

        public void run() {{

            sb.append("C");
        }
        }

    };
}
