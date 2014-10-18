package jUnitTestSuits.correctnessTests.master;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import pj.Version;
import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import PyjamaCode.TestingDirectives.Master.*;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Master_corrTest {
	
	private int threadNumber;
	private static Data Data = new Data();
	
	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Master", "CorrectnessJunitResults", false);
	}

	@Test
	public void masterTest1() {
		master_positive_test1 test = new master_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case1");
		threadNumber = 2;
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_master(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[0]=1;
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
	public void masterTest2() {
		master_positive_test1 test = new master_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case2");
		threadNumber = 3;
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_master(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[0]=1;
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
	public void masterTest3() {
		master_positive_test1 test = new master_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case3");
		threadNumber = 4;
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_master(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[0]=1;
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
	public void masterTest4() {
		master_positive_test1 test = new master_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case4");
		threadNumber = 5;
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_master(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[0]=1;
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
	public void masterTest5() {
		master_positive_test1 test = new master_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case5");
		threadNumber = 6;
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_master(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[0]=1;
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
	public void masterTest6() {
		master_positive_test1 test = new master_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case6");
		threadNumber = 7;
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_master(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[0]=1;
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
	public void masterTest7() {
		master_positive_test1 test = new master_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case7");
		threadNumber = 8;
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_master(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[0]=1;
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
