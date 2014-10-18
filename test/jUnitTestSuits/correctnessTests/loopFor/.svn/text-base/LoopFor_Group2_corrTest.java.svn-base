package jUnitTestSuits.correctnessTests.loopFor;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import pj.Version;
import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import PyjamaCode.TestingDirectives.LoopFor.*;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class LoopFor_Group2_corrTest {

	private static Data Data = new Data();

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "LoopFor", "CorrectnessJunitResults_Group2", false);
	}
	
	@Test
	public void LoopForTest1() {
		loopFor_positive_test1 test = new loopFor_positive_test1();//>
		Result result = new Result();
		result.setTestName("Postive_test1_Case1");
		int threadNumber = 4;
		
		int InitialValue =500000;
		int EndValue = 0;
		int Stride =-1;
		result.setThreadCount(threadNumber);
		result.setInitialValue(InitialValue+"");
		result.setEndValue(EndValue+"");
		result.setStride(Stride+"");
		result.setOperator(">");
		
		//
		int[] actualArray = test.parallel_loopFor(threadNumber, InitialValue, EndValue, Stride);

		if (validate(actualArray, InitialValue, EndValue, Stride))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		Data.addResult(result);

		if (!validate(actualArray, InitialValue, EndValue, Stride))
			fail("Test Failed");
	}
	
	@Test
	public void LoopForTest2() {
		loopFor_positive_test1 test = new loopFor_positive_test1();//>
		Result result = new Result();
		result.setTestName("Postive_test1_Case2");
		int threadNumber = 4;
		
		int InitialValue =10000;
		int EndValue = 1;
		int Stride =-1;
		result.setThreadCount(threadNumber);
		result.setInitialValue(InitialValue+"");
		result.setEndValue(EndValue+"");
		result.setStride(Stride+"");
		result.setOperator(">");
		
		//
		int[] actualArray = test.parallel_loopFor(threadNumber, InitialValue, EndValue, Stride);

		if (validate(actualArray, InitialValue, EndValue, Stride))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		Data.addResult(result);

		if (!validate(actualArray, InitialValue, EndValue, Stride))
			fail("Test Failed");
	}
	
	@Test
	public void LoopForTest3() {
		loopFor_positive_test1 test = new loopFor_positive_test1();//>
		Result result = new Result();
		result.setTestName("Postive_test1_Case3");
		int threadNumber = 4;
		
		int InitialValue =1000;
		int EndValue = 100;
		int Stride =-1;
		result.setThreadCount(threadNumber);
		result.setInitialValue(InitialValue+"");
		result.setEndValue(EndValue+"");
		result.setStride(Stride+"");
		result.setOperator(">");
		
		//
		int[] actualArray = test.parallel_loopFor(threadNumber, InitialValue, EndValue, Stride);

		if (validate(actualArray, InitialValue, EndValue, Stride))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		Data.addResult(result);

		if (!validate(actualArray, InitialValue, EndValue, Stride))
			fail("Test Failed");
	}
	
	@Test
	public void LoopForTest4() {
		loopFor_positive_test1 test = new loopFor_positive_test1();//>
		Result result = new Result();
		result.setTestName("Postive_test1_Case4");
		int threadNumber = 4;
		
		int InitialValue =500;
		int EndValue = 500;
		int Stride =-1;
		result.setThreadCount(threadNumber);
		result.setInitialValue(InitialValue+"");
		result.setEndValue(EndValue+"");
		result.setStride(Stride+"");
		result.setOperator(">");
		
		//
		int[] actualArray = test.parallel_loopFor(threadNumber, InitialValue, EndValue, Stride);

		if (validate(actualArray, InitialValue, EndValue, Stride))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		Data.addResult(result);

		if (!validate(actualArray, InitialValue, EndValue, Stride))
			fail("Test Failed");
	}
	
	@Test
	public void LoopForTest5() {
		loopFor_positive_test1 test = new loopFor_positive_test1();//>
		Result result = new Result();
		result.setTestName("Postive_test1_Case5");
		int threadNumber = 4;
		
		int InitialValue =10000000;
		int EndValue = 0;
		int Stride =-50;
		result.setThreadCount(threadNumber);
		result.setInitialValue(InitialValue+"");
		result.setEndValue(EndValue+"");
		result.setStride(Stride+"");
		result.setOperator(">");
		
		//
		int[] actualArray = test.parallel_loopFor(threadNumber, InitialValue, EndValue, Stride);

		if (validate(actualArray, InitialValue, EndValue, Stride))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		Data.addResult(result);

		if (!validate(actualArray, InitialValue, EndValue, Stride))
			fail("Test Failed");
	}
	
	@Test
	public void LoopForTest6() {
		loopFor_positive_test1 test = new loopFor_positive_test1();//>
		Result result = new Result();
		result.setTestName("Postive_test1_Case6");
		int threadNumber = 4;
		
		int InitialValue =100000000;
		int EndValue = 1;
		int Stride =-99;
		result.setThreadCount(threadNumber);
		result.setInitialValue(InitialValue+"");
		result.setEndValue(EndValue+"");
		result.setStride(Stride+"");
		result.setOperator(">");
		
		//
		int[] actualArray = test.parallel_loopFor(threadNumber, InitialValue, EndValue, Stride);

		if (validate(actualArray, InitialValue, EndValue, Stride))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		Data.addResult(result);

		if (!validate(actualArray, InitialValue, EndValue, Stride))
			fail("Test Failed");
	}
	
	@Test
	public void LoopForTest7() {
		loopFor_positive_test2 test = new loopFor_positive_test2();//>=
		Result result = new Result();
		result.setTestName("Postive_test2_Case1");
		int threadNumber = 4;
		
		int InitialValue =500000;
		int EndValue = 0;
		int Stride =-1;
		result.setThreadCount(threadNumber);
		result.setInitialValue(InitialValue+"");
		result.setEndValue(EndValue+"");
		result.setStride(Stride+"");
		result.setOperator(">=");
		
		//
		int[] actualArray = test.parallel_loopFor(threadNumber, InitialValue, EndValue, Stride);

		if (validateEqual(actualArray, InitialValue, EndValue, Stride))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		Data.addResult(result);

		if (!validateEqual(actualArray, InitialValue, EndValue, Stride))
			fail("Test Failed");
	}
	
	@Test
	public void LoopForTest8() {
		loopFor_positive_test2 test = new loopFor_positive_test2();//>=
		Result result = new Result();
		result.setTestName("Postive_test2_Case2");
		int threadNumber = 4;
		
		int InitialValue =10000;
		int EndValue = 1;
		int Stride =-1;
		result.setThreadCount(threadNumber);
		result.setInitialValue(InitialValue+"");
		result.setEndValue(EndValue+"");
		result.setStride(Stride+"");
		result.setOperator(">=");
		
		//
		int[] actualArray = test.parallel_loopFor(threadNumber, InitialValue, EndValue, Stride);

		if (validateEqual(actualArray, InitialValue, EndValue, Stride))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		Data.addResult(result);

		if (!validateEqual(actualArray, InitialValue, EndValue, Stride))
			fail("Test Failed");
	}
	
	@Test
	public void LoopForTest9() {
		loopFor_positive_test2 test = new loopFor_positive_test2();//>=
		Result result = new Result();
		result.setTestName("Postive_test2_Case3");
		int threadNumber = 4;
		
		int InitialValue =1000;
		int EndValue = 100;
		int Stride =-1;
		result.setThreadCount(threadNumber);
		result.setInitialValue(InitialValue+"");
		result.setEndValue(EndValue+"");
		result.setStride(Stride+"");
		result.setOperator(">=");
		
		//
		int[] actualArray = test.parallel_loopFor(threadNumber, InitialValue, EndValue, Stride);

		if (validateEqual(actualArray, InitialValue, EndValue, Stride))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		Data.addResult(result);

		if (!validateEqual(actualArray, InitialValue, EndValue, Stride))
			fail("Test Failed");
	}
	
	@Test
	public void LoopForTest10() {
		loopFor_positive_test2 test = new loopFor_positive_test2();//>=
		Result result = new Result();
		result.setTestName("Postive_test2_Case4");
		int threadNumber = 4;
		
		int InitialValue =500;
		int EndValue = 500;
		int Stride =-1;
		result.setThreadCount(threadNumber);
		result.setInitialValue(InitialValue+"");
		result.setEndValue(EndValue+"");
		result.setStride(Stride+"");
		result.setOperator(">=");
		
		//
		int[] actualArray = test.parallel_loopFor(threadNumber, InitialValue, EndValue, Stride);

		if (validateEqual(actualArray, InitialValue, EndValue, Stride))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		Data.addResult(result);

		if (!validateEqual(actualArray, InitialValue, EndValue, Stride))
			fail("Test Failed");
	}
	
	@Test
	public void LoopForTest11() {
		loopFor_positive_test2 test = new loopFor_positive_test2();//>=
		Result result = new Result();
		result.setTestName("Postive_test2_Case5");
		int threadNumber = 4;
		
		int InitialValue =10000000;
		int EndValue = 0;
		int Stride =-50;
		result.setThreadCount(threadNumber);
		result.setInitialValue(InitialValue+"");
		result.setEndValue(EndValue+"");
		result.setStride(Stride+"");
		result.setOperator(">=");
		
		//
		int[] actualArray = test.parallel_loopFor(threadNumber, InitialValue, EndValue, Stride);

		if (validateEqual(actualArray, InitialValue, EndValue, Stride))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		Data.addResult(result);

		if (!validateEqual(actualArray, InitialValue, EndValue, Stride))
			fail("Test Failed");
	}
	
	@Test
	public void LoopForTest12() {
		loopFor_positive_test2 test = new loopFor_positive_test2();//>=
		Result result = new Result();
		result.setTestName("Postive_test2_Case6");
		int threadNumber = 4;
		
		int InitialValue =100000000;
		int EndValue = 1;
		int Stride =-99;
		result.setThreadCount(threadNumber);
		result.setInitialValue(InitialValue+"");
		result.setEndValue(EndValue+"");
		result.setStride(Stride+"");
		result.setOperator(">=");
		
		//
		int[] actualArray = test.parallel_loopFor(threadNumber, InitialValue, EndValue, Stride);

		if (validateEqual(actualArray, InitialValue, EndValue, Stride))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		Data.addResult(result);

		if (!validateEqual(actualArray, InitialValue, EndValue, Stride))
			fail("Test Failed");
	}
	
	
	private boolean validate(int[] actualArray, int InitialValue, int EndValue, int Stride){
		int startIndex = 0;
		if (InitialValue >= 0 && EndValue >= 0)
			startIndex = 0;
		if (InitialValue < 0 && EndValue >= 0)
			startIndex = Math.abs(InitialValue);
		if (InitialValue >= 0 && EndValue < 0)
			startIndex = Math.abs(EndValue);
		if (InitialValue < 0 && EndValue < 0)
			startIndex = Math.max(Math.abs(InitialValue), Math.abs(EndValue));

		for (int i = InitialValue; i > EndValue; i = i + Stride) {
			if(actualArray[startIndex+i]!=i) return false;
		}

		return true;
	}
	private boolean validateEqual(int[] actualArray, int InitialValue, int EndValue, int Stride){
		int startIndex = 0;
		if (InitialValue >= 0 && EndValue >= 0)
			startIndex = 0;
		if (InitialValue < 0 && EndValue >= 0)
			startIndex = Math.abs(InitialValue);
		if (InitialValue >= 0 && EndValue < 0)
			startIndex = Math.abs(EndValue);
		if (InitialValue < 0 && EndValue < 0)
			startIndex = Math.max(Math.abs(InitialValue), Math.abs(EndValue));

		for (int i = InitialValue; i >= EndValue; i = i + Stride) {
			if(actualArray[startIndex+i]!=i) return false;
		}

		return true;
	}
}
