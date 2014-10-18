package jUnitTestSuits.correctnessTests.shared;

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
import PyjamaCode.TestingClauses.Shared.shared_positive_test3;
import Utility.JSONDatabaseHelper.resultWriterHelper;
import Utility.JavaCompileHelper.JavaCompiler;

public class Shared_Group3Test {

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Shared", "CorrectnessJunitResults_Group3", false);
	}
	
	@Test
	public void SharedTest1() {
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		shared_positive_test3 test = new shared_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case1");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_sections_shared(threadNumber);
		int[] expectedArray = new int[]{1,1};
		
		if (JavaCompiler.validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!JavaCompiler.validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void SharedTest2() {
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		shared_positive_test3 test = new shared_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case2");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_sections_shared(threadNumber);
		int[] expectedArray = new int[]{1,1};
		
		if (JavaCompiler.validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!JavaCompiler.validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void SharedTest3() {
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		shared_positive_test3 test = new shared_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case3");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_sections_shared(threadNumber);
		int[] expectedArray = new int[]{1,1};
		
		if (JavaCompiler.validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!JavaCompiler.validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void SharedTest4() {
		threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		shared_positive_test3 test = new shared_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case4");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_sections_shared(threadNumber);
		int[] expectedArray = new int[]{1,1};
		
		if (JavaCompiler.validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!JavaCompiler.validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void SharedTest5() {
		threadNumber = 6;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		shared_positive_test3 test = new shared_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case5");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_sections_shared(threadNumber);
		int[] expectedArray = new int[]{1,1};
		
		if (JavaCompiler.validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!JavaCompiler.validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void SharedTest6() {
		threadNumber = 7;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		shared_positive_test3 test = new shared_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case6");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_sections_shared(threadNumber);
		int[] expectedArray = new int[]{1,1};
		
		if (JavaCompiler.validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!JavaCompiler.validate(actualArray,expectedArray)) fail("Test Failed");
	}

	@Test
	public void SharedTest7() {
		threadNumber = 8;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		shared_positive_test3 test = new shared_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case7");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_sections_shared(threadNumber);
		int[] expectedArray = new int[]{1,1};
		
		if (JavaCompiler.validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!JavaCompiler.validate(actualArray,expectedArray)) fail("Test Failed");
	}

}
