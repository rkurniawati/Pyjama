package jUnitTestSuits.correctnessTests.firstPrivate;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import pj.PjRuntime;
import pj.Version;
import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import PyjamaCode.TestingClauses.FirstPrivate.firstPrivate_positive_test1;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class FirstPrivate_Group1_corrTest {
	
	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;
	
	@Before
	public void prepare() {
		PjRuntime.init();
	}
	 
	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Firstprivate", "CorrectnessJunitResults_Group1", false);
	}
	
	@Test
	public void FirstPrivateTest1() {
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		firstPrivate_positive_test1 test = new firstPrivate_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case1");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_firstPrivate(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=threadNumber;
		}
		
		if (validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void FirstPrivateTest2() {
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		firstPrivate_positive_test1 test = new firstPrivate_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case2");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_firstPrivate(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=threadNumber;
		}
		
		if (validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void FirstPrivateTest3() {
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		firstPrivate_positive_test1 test = new firstPrivate_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case3");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_firstPrivate(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=threadNumber;
		}
		
		if (validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.addResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void FirstPrivateTest4() {
		threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		firstPrivate_positive_test1 test = new firstPrivate_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case4");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_firstPrivate(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=threadNumber;
		}
		
		if (validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void FirstPrivateTest5() {
		threadNumber = 6;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		firstPrivate_positive_test1 test = new firstPrivate_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case5");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_firstPrivate(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=threadNumber;
		}
		
		if (validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void FirstPrivateTest6() {
		threadNumber = 7;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		firstPrivate_positive_test1 test = new firstPrivate_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case6");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_firstPrivate(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=threadNumber;
		}
		
		if (validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void FirstPrivateTest7() {
		threadNumber = 8;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		firstPrivate_positive_test1 test = new firstPrivate_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case7");
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		//
		int[] actualArray = test.parallel_firstPrivate(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=threadNumber;
		}
		
		if (validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.ReSetResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	
	
	private boolean validate(int[] actualArray,int[] expectedArray){
		boolean flag=true;
		for (int i = 0; i < actualArray.length; i++) {
			if (actualArray[i]!=expectedArray[i]) {
				flag=false;
			}
		}
		return flag;
	} 

}
