package jUnitTestSuits.correctnessTests.reduction.group6;

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
import PyjamaCode.TestingClauses.Reduction.reduction_positive_test6;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Reduction_Group6_3Test {

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Reduction","CorrectnessJunitResults_Group6", false);
	}

	@Test
	public synchronized void ReductionTest1() {
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		reduction_positive_test6 test = new reduction_positive_test6();
		Result result = new Result();
		try {
			result.setTestName("parallel_section_Case1");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			int actual = test.parallel_sections_reduction(threadNumber);
			int expected = 2;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected);
			result.setActualValue(actual);
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
		
		reduction_positive_test6 test = new reduction_positive_test6();
		Result result = new Result();
		try {
			result.setTestName("parallel_section_Case2");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			int actual = test.parallel_sections_reduction(threadNumber);
			int expected = 2;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected);
			result.setActualValue(actual);
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
		
		reduction_positive_test6 test = new reduction_positive_test6();
		Result result = new Result();
		try {
			result.setTestName("parallel_section_Case3");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			int actual = test.parallel_sections_reduction(threadNumber);
			int expected = 2;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected);
			result.setActualValue(actual);
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
		
		reduction_positive_test6 test = new reduction_positive_test6();
		Result result = new Result();
		try {
			result.setTestName("parallel_section_Case4");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			int actual = test.parallel_sections_reduction(threadNumber);
			int expected = 2;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected);
			result.setActualValue(actual);
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
		
		reduction_positive_test6 test = new reduction_positive_test6();
		Result result = new Result();
		try {
			result.setTestName("parallel_section_Case5");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			int actual = test.parallel_sections_reduction(threadNumber);
			int expected = 2;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected);
			result.setActualValue(actual);
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
		
		reduction_positive_test6 test = new reduction_positive_test6();
		Result result = new Result();
		try {
			result.setTestName("parallel_section_Case6");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			int actual = test.parallel_sections_reduction(threadNumber);
			int expected = 2;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected);
			result.setActualValue(actual);
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
		
		reduction_positive_test6 test = new reduction_positive_test6();
		Result result = new Result();
		try {
			result.setTestName("parallel_section_Case7");
			result.setThreadCount(threadNumber);
			result.setJunitResult("TimeOut");
			Data.addResult(result);
			
			//
			int actual = test.parallel_sections_reduction(threadNumber);
			int expected = 2;
			if (actual == expected)
				result.setJunitResult("Success");
			else
				result.setJunitResult("Failed");

			result.setExpectedValue(expected);
			result.setActualValue(actual);
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
