package jUnitTestSuits.correctnessTests.freeguiThread;

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
import PyjamaCode.TestingDirectives.FreeguiThread.FreeGuiThread_positive_test1;
import PyjamaCode.TestingDirectives.FreeguiThread.FreeGuiThread_positive_test2;
import PyjamaCode.TestingDirectives.FreeguiThread.FreeGuiThread_positive_test3;
import PyjamaCode.TestingDirectives.Parallel.parallel_positive_test1;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class FreeguiThread_corrTest {

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Parallel","CorrectnessJunitResults_Group1",false);
	}
	
	@Test
	public void parallelTest1() {		
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		FreeGuiThread_positive_test1 test = new FreeGuiThread_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case1");		
		result.setThreadCount(threadNumber);
		
		//
		String actualString=test.positive_test1();
		
		String expected ="falsetruefalse";
		//
		
		if(expected.equals(actualString))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setExpectedString(expected);
		result.setActualString(actualString);
		Data.addResult(result);
		
		assertEquals(expected, actualString);
	}
	
	@Test
	public void parallelTest2() {		
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		FreeGuiThread_positive_test2 test = new FreeGuiThread_positive_test2();
		Result result = new Result();
		result.setTestName("Postive_test2_Case2");		
		result.setThreadCount(threadNumber);
		
		//
		String actualString=test.positive_test2();
		
		String expected ="falsetruefalsefalsetruetruefalse";
		//
		
		if(expected.equals(actualString))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setExpectedString(expected);
		result.setActualString(actualString);
		Data.addResult(result);
		
		assertEquals(expected, actualString);
	}
	
	@Test
	public void parallelTest3() {		
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		FreeGuiThread_positive_test3 test = new FreeGuiThread_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test2_Case2");		
		result.setThreadCount(threadNumber);
		
		//
		String actualString=test.positive_test3(threadNumber);
		
		String expected ="AAAAAAAABBBBBBBBC";
		//
		
		if(expected.equals(actualString))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setExpectedString(expected);
		result.setActualString(actualString);
		Data.addResult(result);
		
		assertEquals(expected, actualString);
	}
	/*
	@Test
	public void parallelTest4() {		
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		FreeGuiThread_positive_test3 test = new FreeGuiThread_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test2_Case2");		
		result.setThreadCount(threadNumber);
		
		//
		String actualString=test.positive_test3(threadNumber);
		
		String expected ="AAABBBC";
		//
		
		if(expected.equals(actualString))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setExpectedString(expected);
		result.setActualString(actualString);
		Data.addResult(result);
		
		assertEquals(expected, actualString);
	}
	
	@Test
	public void parallelTest5() {		
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		FreeGuiThread_positive_test3 test = new FreeGuiThread_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test2_Case2");		
		result.setThreadCount(threadNumber);
		
		//
		String actualString=test.positive_test3(threadNumber);
		
		String expected ="AAAABBBBC";
		//
		
		if(expected.equals(actualString))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setExpectedString(expected);
		result.setActualString(actualString);
		Data.addResult(result);
		
		assertEquals(expected, actualString);
	} */
}
