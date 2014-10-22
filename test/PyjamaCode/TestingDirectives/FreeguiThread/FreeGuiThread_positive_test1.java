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
* Test if the certain place is EDT or not
*/
public class FreeGuiThread_positive_test1 {

    private StringBuffer sb = new StringBuffer();

    public String positive_test1() {{
        sb.append(SwingUtilities.isEventDispatchThread());
        try {
            SwingUtilities.invokeAndWait(simulateEDT);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sb.append(SwingUtilities.isEventDispatchThread());
        return sb.toString();
    }
    }


    final Runnable simulateEDT = new Runnable() {

        public void run() {{
            sb.append(SwingUtilities.isEventDispatchThread());

            sb.append(SwingUtilities.isEventDispatchThread());
        }
        }

    };
}
