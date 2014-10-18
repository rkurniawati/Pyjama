package jUnitTestSuits.correctnessTests.reduction.group7;

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
import PyjamaCode.TestingClauses.Reduction.reduction_positive_test7;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Reduction_Group7_2Test {

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Reduction","CorrectnessJunitResults_Group7", false);
	}

	@Test
	public synchronized void ReductionTest1() {
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		reduction_positive_test7 test = new reduction_positive_test7();
		Result result = new Result();
		try {
			result.setTestName("parallel_Case1");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			boolean actual = test.parallel_reduction(threadNumber);
			boolean expected = false;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected? 1 : 0);
			result.setActualValue(actual? 1 : 0);
			Data.ReSetResult(result);
			assertEquals(expected, actual);
		} catch (Exception e) {
			result.setJunitResult("Failed");
			Data.ReSetResult(result);
			fail("Compile Failed");
			e.printStackTrace();
		}
	}
	
	@Test
	public synchronized void ReductionTest2() {
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		reduction_positive_test7 test = new reduction_positive_test7();
		Result result = new Result();
		try {
			result.setTestName("parallel_Case2");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			boolean actual = test.parallel_reduction(threadNumber);
			boolean expected = false;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected? 1 : 0);
			result.setActualValue(actual? 1 : 0);
			Data.ReSetResult(result);
			assertEquals(expected, actual);
		} catch (Exception e) {
			result.setJunitResult("Failed");
			Data.ReSetResult(result);
			fail("Compile Failed");
			e.printStackTrace();
		}
	}

	@Test
	public synchronized void ReductionTest3() {
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		reduction_positive_test7 test = new reduction_positive_test7();
		Result result = new Result();
		try {
			result.setTestName("parallel_Case3");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			boolean actual = test.parallel_reduction(threadNumber);
			boolean expected = false;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected? 1 : 0);
			result.setActualValue(actual? 1 : 0);
			Data.ReSetResult(result);
			assertEquals(expected, actual);
		} catch (Exception e) {
			result.setJunitResult("Failed");
			Data.ReSetResult(result);
			fail("Compile Failed");
			e.printStackTrace();
		}
	}
	
	@Test
	public synchronized void ReductionTest4() {
		threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		reduction_positive_test7 test = new reduction_positive_test7();
		Result result = new Result();
		try {
			result.setTestName("parallel_Case4");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			boolean actual = test.parallel_reduction(threadNumber);
			boolean expected = false;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected? 1 : 0);
			result.setActualValue(actual? 1 : 0);
			Data.ReSetResult(result);
			assertEquals(expected, actual);
		} catch (Exception e) {
			result.setJunitResult("Failed");
			Data.ReSetResult(result);
			fail("Compile Failed");
			e.printStackTrace();
		}
	}
	
	@Test
	public synchronized void ReductionTest5() {
		threadNumber = 6;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		reduction_positive_test7 test = new reduction_positive_test7();
		Result result = new Result();
		try {
			result.setTestName("parallel_Case5");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			boolean actual = test.parallel_reduction(threadNumber);
			boolean expected = false;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected? 1 : 0);
			result.setActualValue(actual? 1 : 0);
			Data.ReSetResult(result);
			assertEquals(expected, actual);
		} catch (Exception e) {
			result.setJunitResult("Failed");
			Data.ReSetResult(result);
			fail("Compile Failed");
			e.printStackTrace();
		}
	}
	
	@Test
	public synchronized void ReductionTest6() {
		threadNumber = 7;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		reduction_positive_test7 test = new reduction_positive_test7();
		Result result = new Result();
		try {
			result.setTestName("parallel_Case6");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			boolean actual = test.parallel_reduction(threadNumber);
			boolean expected = false;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected? 1 : 0);
			result.setActualValue(actual? 1 : 0);
			Data.ReSetResult(result);
			assertEquals(expected, actual);
		} catch (Exception e) {
			result.setJunitResult("Failed");
			Data.ReSetResult(result);
			fail("Compile Failed");
			e.printStackTrace();
		}
	}
	
	@Test
	public synchronized void ReductionTest7() {
		threadNumber = 8;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		reduction_positive_test7 test = new reduction_positive_test7();
		Result result = new Result();
		try {
			result.setTestName("parallel_Case7");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			boolean actual = test.parallel_reduction(threadNumber);
			boolean expected = false;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected? 1 : 0);
			result.setActualValue(actual? 1 : 0);
			Data.ReSetResult(result);
			assertEquals(expected, actual);
		} catch (Exception e) {
			result.setJunitResult("Failed");
			Data.ReSetResult(result);
			fail("Compile Failed");
			e.printStackTrace();
		}
	}
	
}
