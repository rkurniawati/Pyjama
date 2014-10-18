package jUnitTestSuits.correctnessTests.atomic;

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
import PyjamaCode.TestingDirectives.Atomic.atomic_positive_test4;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Atomic_Group4_corrTest {

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Atomic", "CorrectnessJunitResults", false);
	}

	@Test
	public void atomicTest1() {
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		atomic_positive_test4 test = new atomic_positive_test4();
		Result result = new Result();
		result.setTestName("Postive_test4_Case1");
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_atomic(threadNumber);
		int expected = 0;
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
	public void atomicTest2() {
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		atomic_positive_test4 test = new atomic_positive_test4();
		Result result = new Result();
		result.setTestName("Postive_test4_Case2");
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_atomic(threadNumber);
		int expected = 0;
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
	public void atomicTest3() {
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		atomic_positive_test4 test = new atomic_positive_test4();
		Result result = new Result();
		result.setTestName("Postive_test4_Case3");
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_atomic(threadNumber);
		int expected = 0;
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
	public void atomicTest4() {
		threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		atomic_positive_test4 test = new atomic_positive_test4();
		Result result = new Result();
		result.setTestName("Postive_test4_Case4");
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_atomic(threadNumber);
		int expected = 0;
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
	public void atomicTest5() {
		threadNumber = 6;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		atomic_positive_test4 test = new atomic_positive_test4();
		Result result = new Result();
		result.setTestName("Postive_test4_Case5");
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_atomic(threadNumber);
		int expected = 0;
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
	public void atomicTest6() {
		threadNumber = 7;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		atomic_positive_test4 test = new atomic_positive_test4();
		Result result = new Result();
		result.setTestName("Postive_test4_Case6");
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_atomic(threadNumber);
		int expected = 0;
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
	public void atomicTest7() {
		threadNumber = 8;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		atomic_positive_test4 test = new atomic_positive_test4();
		Result result = new Result();
		result.setTestName("Postive_test4_Case7");
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_atomic(threadNumber);
		int expected = 0;
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
