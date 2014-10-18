package jUnitTestSuits.memoryAndCPUTest.schedule;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import pj.Version;
import Domain.SettingConstans;
import Domain.Bean.MonitorInfoBean;
import Domain.Bean.Data;
import Domain.Bean.Result;
import PyjamaCode.TestingClauses.Schedule.schedule_Monitor;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Schedule_Group5_MacTest {

	private static Data Data= new Data();
	private static int arraySize = 1000;
	private int processNum = SettingConstans.PROCESSNUM;
	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Schedule","MemoryAndCPUJunitResults",true);
	}
	
	@Test
	public void parallel_for_case1() {
		int threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	
	@Test
	public void parallel_for_case2() {
		int threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	
	@Test
	public void parallel_for_case3() {
		int threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	
	@Test
	public void parallel_for_case4() {
		int threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	
	@Test
	public void parallel_for_case5() {
		int threadNumber = 6;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	
	@Test
	public void parallel_for_case6() {
		int threadNumber = 7;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	
	@Test
	public void parallel_for_case7() {
		int threadNumber = 8;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	
	private void test(int threadNumber){
		schedule_Monitor test = new schedule_Monitor();
		Result result = new Result();
		result.setTestName("parallel_for_guided:"+arraySize);		
		result.setThreadCount(threadNumber);
		result.setArraySize(arraySize);
		
		try {
			List<MonitorInfoBean> results =test.parallel_for_guided(threadNumber, arraySize);
			result.setMonitor(results);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Data.addResult(result);
	}

}
