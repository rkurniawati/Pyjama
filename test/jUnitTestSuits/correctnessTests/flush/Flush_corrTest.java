package jUnitTestSuits.correctnessTests.flush;

import static org.junit.Assert.*;
import junit.framework.TestResult;

import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import pj.Version;
import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import PyjamaCode.TestingDirectives.Flush.*;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Flush_corrTest extends TestResult{

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Flush", "CorrectnessJunitResults", false);
	}		

	@Test
	public void FlushTest1() {
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		flush_positive_test1 test = new flush_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case1");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);

		//
		int actual = test.parallel_section_flush(threadNumber);	
		int expected = 2;
		if (expected == actual)
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
	public void FlushTest2() {
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		flush_positive_test1 test = new flush_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case2");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);

		//
		int actual = test.parallel_section_flush(threadNumber);	
		int expected = 2;
		if (expected == actual)
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
	public void FlushTest3() {
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		flush_positive_test1 test = new flush_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case3");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);

		//
		int actual = test.parallel_section_flush(threadNumber);	
		int expected = 2;
		if (expected == actual)
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
	public void FlushTest4() {
		threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		flush_positive_test1 test = new flush_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case4");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);

		//
		int actual = test.parallel_section_flush(threadNumber);	
		int expected = 2;
		if (expected == actual)
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
	public void FlushTest5() {
		threadNumber = 6;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		flush_positive_test1 test = new flush_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case5");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);

		//
		int actual = test.parallel_section_flush(threadNumber);	
		int expected = 2;
		if (expected == actual)
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
	public void FlushTest6() {
		threadNumber = 7;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		flush_positive_test1 test = new flush_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case6");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);

		//
		int actual = test.parallel_section_flush(threadNumber);	
		int expected = 2;
		if (expected == actual)
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
	public void FlushTest7() {
		threadNumber = 8;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		flush_positive_test1 test = new flush_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case7");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);

		//
		int actual = test.parallel_section_flush(threadNumber);	
		int expected = 2;
		if (expected == actual)
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
