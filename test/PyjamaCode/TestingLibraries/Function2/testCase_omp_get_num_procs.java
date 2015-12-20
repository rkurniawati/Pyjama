package PyjamaCode.TestingLibraries.Function2;

import pj.Pyjama;

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

public class testCase_omp_get_num_procs {

    public int omp_get_num_procs(int threadNumber) {{
        Pyjama.omp_set_num_threads(threadNumber);
        return Pyjama.omp_get_num_procs();
    }
    }

}
