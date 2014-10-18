package jUnitTestSuits.correctnessTests.ordered;

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
import PyjamaCode.TestingDirectives.Ordered.ordered_positive_test1;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Ordered_corrTest {

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Ordered", "CorrectnessJunitResults", false);
	}

	@Test
	public void orderedTest1() {
		threadNumber = 2;

		
		ordered_positive_test1 test = new ordered_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case1");
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_ordered(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=i;
		}
		
		if (validate(actualArray,expectedArray)){
			result.setJunitResult("Success");
			//System.out.println("success1");
		}
		else {
			result.setJunitResult("Failed");
			//System.out.println("failed1");
		}

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.addResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void orderedTest2() {
		threadNumber = 3;
		
		
		ordered_positive_test1 test = new ordered_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case2");
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_ordered(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=i;
		}
		
		if (validate(actualArray,expectedArray)){
			result.setJunitResult("Success");
			//System.out.println("success2");
		}
		else {
			result.setJunitResult("Failed");
			//System.out.println("failed2");
		}
		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.addResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void orderedTest3() {
		threadNumber = 4;
		
		
		ordered_positive_test1 test = new ordered_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case3");
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_ordered(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=i;
		}
		
		if (validate(actualArray,expectedArray)){
			result.setJunitResult("Success");
			//System.out.println("success3");
		}
		else {
			result.setJunitResult("Failed");
			//System.out.println("failed3");
		}

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.addResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void orderedTest4() {
		threadNumber = 5;

		
		ordered_positive_test1 test = new ordered_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case4");
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_ordered(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=i;
		}
		
		if (validate(actualArray,expectedArray)){
			result.setJunitResult("Success");
			//System.out.println("success4");
		}
		else {
			result.setJunitResult("Failed");
			//System.out.println("failed4");
		}

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.addResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void orderedTest5() {
		threadNumber = 6;

		
		ordered_positive_test1 test = new ordered_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case5");
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_ordered(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=i;
			//System.out.println(actualArray[i]);
		}
		
		if (validate(actualArray,expectedArray)){
			result.setJunitResult("Success");
			//System.out.println("success5");
		}
		else {
			result.setJunitResult("Failed");
			System.out.println("failed6");
		}

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.addResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void orderedTest6() {
		threadNumber = 7;
		
		
		ordered_positive_test1 test = new ordered_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case6");
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_ordered(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=i;
		}
		
		if (validate(actualArray,expectedArray)){
			result.setJunitResult("Success");
			//System.out.println("success6");
		}
		else {
			result.setJunitResult("Failed");
			//System.out.println("failed6");
		}

		result.setActualArrayValue(actualArray);
		result.setExpectedArrayValue(expectedArray);
		Data.addResult(result);

		if (!validate(actualArray,expectedArray)) fail("Test Failed");
	}
	
	@Test
	public void orderedTest7() {
		threadNumber = 8;
		
		
		ordered_positive_test1 test = new ordered_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case7");
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_ordered(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < actualArray.length; i++) {
			expectedArray[i]=i;
		}
		
		if (validate(actualArray,expectedArray)){
			result.setJunitResult("Success");
			//System.out.println("success7");
		}
		else {
			result.setJunitResult("Failed");
			//System.out.println("failed7");
		}
			
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
