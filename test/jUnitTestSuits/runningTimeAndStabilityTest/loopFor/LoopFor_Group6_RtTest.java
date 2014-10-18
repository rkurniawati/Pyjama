package jUnitTestSuits.runningTimeAndStabilityTest.loopFor;

import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import pj.Version;
import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import PyjamaCode.TestingDirectives.LoopFor.loopFor_RT;
import Utility.JSONDatabaseHelper.resultWriterHelper;


public class LoopFor_Group6_RtTest {

	private static Data Data= new Data();
	private static int arraySize = 10000000;
	private int processNum = SettingConstans.PROCESSNUM;
	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","LoopFor","RunningTimeJunitResults",true);
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
		loopFor_RT test = new loopFor_RT();
		Result result = new Result();
		result.setTestName(arraySize+" size array parallel_for");		
		result.setThreadCount(threadNumber);
		result.setArraySize(arraySize);
		
		long[] runningTime =test.parallel_for(threadNumber, arraySize);
		result.setTestRunningTime(runningTime[0], runningTime[1]);
		Data.addResult(result);
	}

}
