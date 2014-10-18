package PyjamaCode.TestingClauses.Schedule;

import java.util.ArrayList;
import java.util.List;

import Utility.MemoryAndCPUHelper.MonitorInfo;
import Domain.Bean.*;
import pj.Pyjama;

public class schedule_Monitor{

	public List<MonitorInfoBean> parallel_for_static(int threadNumber,int n) throws Exception{
		Pyjama.omp_set_num_threads(threadNumber);
		int[] completeNumber= new int[]{0};
		int[] array = new int[n];

		MonitorInfo service = new MonitorInfo(); 
        List<MonitorInfoBean> result = new ArrayList<MonitorInfoBean>();
	
		//#omp parallel for schedule(static) shared(array, completeNumber, n, result, service)
		for(int i = 0; i <n; i++){
			array[i]=i;
			//#omp critical
			{
				completeNumber[0]=completeNumber[0]+1;
			}
			try {
				service = new MonitorInfo();
				double complete = (double)completeNumber[0]/n;
				if(complete == 0.1) result.add(service.getMonitorInfoBean());
				if(complete == 0.2) result.add(service.getMonitorInfoBean());
				if(complete == 0.3) result.add(service.getMonitorInfoBean());
				if(complete == 0.4) result.add(service.getMonitorInfoBean());
				if(complete == 0.5) result.add(service.getMonitorInfoBean());
				if(complete == 0.6) result.add(service.getMonitorInfoBean());
				if(complete == 0.7) result.add(service.getMonitorInfoBean());
				if(complete == 0.8) result.add(service.getMonitorInfoBean());
				if(complete == 0.9) result.add(service.getMonitorInfoBean());
				if(complete == 1) result.add(service.getMonitorInfoBean());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		service = new MonitorInfo();
		result.add(service.getMonitorInfoBean());
		return result;
	}

	public List<MonitorInfoBean> parallel_for_dynamic(int threadNumber,int n) throws Exception{
		Pyjama.omp_set_num_threads(threadNumber);
		int[] completeNumber= new int[]{0};
		int[] array = new int[n];

		MonitorInfo service = new MonitorInfo(); 
        List<MonitorInfoBean> result = new ArrayList<MonitorInfoBean>();
	
		//#omp parallel for schedule(dynamic) shared(array, completeNumber, n, result, service)
		for(int i = 0; i <n; i++){
			array[i]=i;
			
			//#omp critical
			{
				completeNumber[0]=completeNumber[0]+1;
			}
			try {
				service = new MonitorInfo();
				double complete = (double)completeNumber[0]/n;
				if(complete == 0.1) result.add(service.getMonitorInfoBean());
				if(complete == 0.2) result.add(service.getMonitorInfoBean());
				if(complete == 0.3) result.add(service.getMonitorInfoBean());
				if(complete == 0.4) result.add(service.getMonitorInfoBean());
				if(complete == 0.5) result.add(service.getMonitorInfoBean());
				if(complete == 0.6) result.add(service.getMonitorInfoBean());
				if(complete == 0.7) result.add(service.getMonitorInfoBean());
				if(complete == 0.8) result.add(service.getMonitorInfoBean());
				if(complete == 0.9) result.add(service.getMonitorInfoBean());
				if(complete == 1) result.add(service.getMonitorInfoBean());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		service = new MonitorInfo();
		result.add(service.getMonitorInfoBean());
		return result;
	}

	public List<MonitorInfoBean> parallel_for_guided(int threadNumber,int n) throws Exception{
		Pyjama.omp_set_num_threads(threadNumber);
		int[] completeNumber= new int[]{0};
		int[] array = new int[n];

		MonitorInfo service = new MonitorInfo(); 
		List<MonitorInfoBean> result = new ArrayList<MonitorInfoBean>();

		//#omp parallel for schedule(guided) shared(array, completeNumber, n, result, service)
		for(int i = 0; i <n; i++){
			array[i]=i;
			
			//#omp critical
			{
				completeNumber[0]=completeNumber[0]+1;
			}
			try {
				service = new MonitorInfo();
				double complete = (double)completeNumber[0]/n;
				if(complete == 0.1) result.add(service.getMonitorInfoBean());
				if(complete == 0.2) result.add(service.getMonitorInfoBean());
				if(complete == 0.3) result.add(service.getMonitorInfoBean());
				if(complete == 0.4) result.add(service.getMonitorInfoBean());
				if(complete == 0.5) result.add(service.getMonitorInfoBean());
				if(complete == 0.6) result.add(service.getMonitorInfoBean());
				if(complete == 0.7) result.add(service.getMonitorInfoBean());
				if(complete == 0.8) result.add(service.getMonitorInfoBean());
				if(complete == 0.9) result.add(service.getMonitorInfoBean());
				if(complete == 1) result.add(service.getMonitorInfoBean());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		service = new MonitorInfo();
		result.add(service.getMonitorInfoBean());
		return result;
	}
	
}
