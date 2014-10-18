package jUnitTestSuits.runningTimeAndStabilityTest.parallel;

import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import pj.Version;
import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import PyjamaCode.TestingDirectives.Parallel.parallel_RT;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Parallel_Group3_RtTest {

	private static Data Data= new Data();
	private int processNum = SettingConstans.PROCESSNUM;
	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Parallel","RunningTimeJunitResults",true);
	}
	
	@Test
	public void parallel_region_increment_array_case1() {
		int threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	@Test
	public void parallel_region_increment_array_case2() {
		int threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	@Test
	public void parallel_region_increment_array_case3() {
		int threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	@Test
	public void parallel_region_increment_array_case4() {
		int threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	@Test
	public void parallel_region_increment_array_case5() {
		int threadNumber = 6;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	@Test
	public void parallel_region_increment_array_case6() {
		int threadNumber = 7;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	@Test
	public void parallel_region_increment_array_case7() {
		int threadNumber = 8;
		Assume.assumeTrue(processNum > threadNumber - 2);
		test(threadNumber);
	}
	
	private void test(int threadNumber){
		parallel_RT test = new parallel_RT();
		Result result = new Result();
		result.setTestName("parallel_region_increment_array");		
		result.setThreadCount(threadNumber);
		
		long[] runningTime =test.parallel_region_increment_array(threadNumber);
		result.setTestRunningTime(runningTime[0], runningTime[1]);
		Data.addResult(result);
	}

}
