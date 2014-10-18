package jUnitTestSuits.correctnessTests.libraries;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import pj.Version;
import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import PyjamaCode.TestingLibraries.Function4.testCase_omp_get_thread_num;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Omp_get_thread_numTest {

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Omp_get_thread_num", "CorrectnessJunitResults", false);
	}

	@Test
	public void LibraryTest1() {
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_thread_num test = new testCase_omp_get_thread_num();
		Result result = new Result();
		result.setTestName("Omp_get_thread_num_Case1");
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_omp_get_thread_num(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < expectedArray.length; i++) {
			expectedArray[i]=i;
		}
		//

		if (validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedArrayValue(expectedArray);
		result.setActualArrayValue(actualArray);
		Data.addResult(result);
		
		if(!validate(actualArray,expectedArray))
			fail("Test Failed");

	}
	
	@Test
	public void LibraryTest2() {
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_thread_num test = new testCase_omp_get_thread_num();
		Result result = new Result();
		result.setTestName("Omp_get_thread_num_Case2");
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_omp_get_thread_num(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < expectedArray.length; i++) {
			expectedArray[i]=i;
		}
		//

		if (validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedArrayValue(expectedArray);
		result.setActualArrayValue(actualArray);
		Data.addResult(result);
		
		if(!validate(actualArray,expectedArray))
			fail("Test Failed");

	}
	
	@Test
	public void LibraryTest3() {
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_thread_num test = new testCase_omp_get_thread_num();
		Result result = new Result();
		result.setTestName("Omp_get_thread_num_Case3");
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_omp_get_thread_num(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < expectedArray.length; i++) {
			expectedArray[i]=i;
		}
		//

		if (validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedArrayValue(expectedArray);
		result.setActualArrayValue(actualArray);
		Data.addResult(result);
		
		if(!validate(actualArray,expectedArray))
			fail("Test Failed");

	}
	
	@Test
	public void LibraryTest4() {
		threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_thread_num test = new testCase_omp_get_thread_num();
		Result result = new Result();
		result.setTestName("Omp_get_thread_num_Case4");
		result.setThreadCount(threadNumber);

		//
		int[] actualArray = test.parallel_omp_get_thread_num(threadNumber);
		int[] expectedArray = new int[threadNumber];
		for (int i = 0; i < expectedArray.length; i++) {
			expectedArray[i]=i;
		}
		//

		if (validate(actualArray,expectedArray))
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedArrayValue(expectedArray);
		result.setActualArrayValue(actualArray);
		Data.addResult(result);
		
		if(!validate(actualArray,expectedArray))
			fail("Test Failed");

	}
	
	private boolean validate(int[] actualArray,int[] ecpectedArray){
		for (int i = 0; i < ecpectedArray.length; i++) {
			if(actualArray[i]!=ecpectedArray[i]) return false;
		}
		return true;
	}

}
