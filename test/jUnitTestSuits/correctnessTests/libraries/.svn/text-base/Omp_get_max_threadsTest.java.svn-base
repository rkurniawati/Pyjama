package jUnitTestSuits.correctnessTests.libraries;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import pj.Version;
import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import PyjamaCode.TestingLibraries.Function1.testCase_omp_get_max_threads;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Omp_get_max_threadsTest {

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Omp_get_max_threads", "CorrectnessJunitResults", false);
	}

	@Test
	public void LibraryTest1() {
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_max_threads test = new testCase_omp_get_max_threads();
		Result result = new Result();
		result.setTestName("Omp_get_max_threads_Case1");
		result.setThreadCount(threadNumber);

		//
		int actual = test.omp_get_max_threads(threadNumber);
		int expected = SettingConstans.PROCESSNUM;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void LibraryTest2() {
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_max_threads test = new testCase_omp_get_max_threads();
		Result result = new Result();
		result.setTestName("Omp_get_max_threads_Case2");
		threadNumber = 3;
		result.setThreadCount(threadNumber);

		//
		int actual = test.omp_get_max_threads(threadNumber);
		int expected = SettingConstans.PROCESSNUM;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void LibraryTest3() {
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_max_threads test = new testCase_omp_get_max_threads();
		Result result = new Result();
		result.setTestName("Omp_get_max_threads_Case3");
		result.setThreadCount(threadNumber);

		//
		int actual = test.omp_get_max_threads(threadNumber);
		int expected = SettingConstans.PROCESSNUM;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void LibraryTest4() {
		threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_max_threads test = new testCase_omp_get_max_threads();
		Result result = new Result();
		result.setTestName("Omp_get_max_threads_Case4");
		result.setThreadCount(threadNumber);

		//
		int actual = test.omp_get_max_threads(threadNumber);
		int expected = SettingConstans.PROCESSNUM;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void LibraryTest5() {
		threadNumber = 6;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_max_threads test = new testCase_omp_get_max_threads();
		Result result = new Result();
		result.setTestName("Omp_get_max_threads_Case5");
		result.setThreadCount(threadNumber);

		//
		int actual = test.omp_get_max_threads(threadNumber);
		int expected = SettingConstans.PROCESSNUM;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void LibraryTest6() {
		threadNumber = 7;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_max_threads test = new testCase_omp_get_max_threads();
		Result result = new Result();
		result.setTestName("Omp_get_max_threads_Case6");
		result.setThreadCount(threadNumber);

		//
		int actual = test.omp_get_max_threads(threadNumber);
		int expected = SettingConstans.PROCESSNUM;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void LibraryTest7() {
		threadNumber = 8;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_max_threads test = new testCase_omp_get_max_threads();
		Result result = new Result();
		result.setTestName("Omp_get_max_threads_Case7");
		result.setThreadCount(threadNumber);

		//
		int actual = test.omp_get_max_threads(threadNumber);
		int expected = SettingConstans.PROCESSNUM;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
}
