package jUnitTestSuits.correctnessTests.parallel;

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
import PyjamaCode.TestingDirectives.Parallel.parallel_positive_test3;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Parallel_Group3_corrTest {

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Parallel","CorrectnessJunitResults_Group3",false);
	}
	
	@Test
	public void parallelTest9() {		
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		parallel_positive_test3 test = new parallel_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case1");		
		result.setThreadCount(threadNumber);
		
		//
		int actual=test.parallel_region_increment_array(threadNumber);
		
		int expected =threadNumber;
		//
		
		if(expected==actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);
		assertEquals(expected, actual);
	}
	
	@Test
	public void parallelTest10() {		
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		parallel_positive_test3 test = new parallel_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case2");		
		result.setThreadCount(threadNumber);
		
		//
		int actual=test.parallel_region_increment_array(threadNumber);
		
		int expected =threadNumber;
		//
		
		if(expected==actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);
		assertEquals(expected, actual);
	}
	
	@Test
	public void parallelTest11() {		
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		parallel_positive_test3 test = new parallel_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case3");		
		result.setThreadCount(threadNumber);
		
		//
		int actual=test.parallel_region_increment_array(threadNumber);
		
		int expected =threadNumber;
		//
		
		if(expected==actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);
		assertEquals(expected, actual);
	}
	
	@Test
	public void parallelTest12() {		
		threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		parallel_positive_test3 test = new parallel_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case4");		
		result.setThreadCount(threadNumber);
		
		//
		int actual=test.parallel_region_increment_array(threadNumber);
		
		int expected =threadNumber;
		//
		
		if(expected==actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);
		assertEquals(expected, actual);
	}

}
