package PyjamaCode.TestingDirectives.Parallel;

import java.util.ArrayList;
import java.util.List;

import Domain.Bean.*;
import pj.Pyjama;
import Utility.MemoryAndCPUHelper.*;

public class parallel_Monitor {
	public List<MonitorInfoBean> parallel_region(int threadNumber, int n)
			throws Exception {
		Pyjama.omp_set_num_threads(threadNumber);
		int completeNumber = 0;
		int[] array = new int[n];

		MonitorInfo service = new MonitorInfo();
		List<MonitorInfoBean> result = new ArrayList<MonitorInfoBean>();

		//#omp parallel shared(array, result, n, completeNumber, service) 
		{
			while (completeNumber < n) {
				array[completeNumber] = completeNumber;
				completeNumber++;
				try {
					service = new MonitorInfo();
					double complete = (double) completeNumber / n;
					if (complete == 0.1)
						result.add(service.getMonitorInfoBean());
					if (complete == 0.2)
						result.add(service.getMonitorInfoBean());
					if (complete == 0.3)
						result.add(service.getMonitorInfoBean());
					if (complete == 0.4)
						result.add(service.getMonitorInfoBean());
					if (complete == 0.5)
						result.add(service.getMonitorInfoBean());
					if (complete == 0.6)
						result.add(service.getMonitorInfoBean());
					if (complete == 0.7)
						result.add(service.getMonitorInfoBean());
					if (complete == 0.8)
						result.add(service.getMonitorInfoBean());
					if (complete == 0.9)
						result.add(service.getMonitorInfoBean());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		service = new MonitorInfo();
		result.add(service.getMonitorInfoBean());

		return result;
	}

}
