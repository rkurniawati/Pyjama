package jUnitTestSuits.correctnessTests.single;

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
import PyjamaCode.TestingDirectives.Single.*;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Single_corrTest {

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;
	
	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Single","CorrectnessJunitResults",false);
	}
	
	@Test
	public void singleTest1() {		
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		single_positive_test1 test = new single_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case1");		
		threadNumber=2;
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		//
		int[] actualArray=test.parallel_single(threadNumber);
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		int expected =1;//only one single works
		
		if(expected==actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setActualValue(actual);
		result.setExpectedValue(expected);
		//
		
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
	public void singleTest2() {		
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		single_positive_test1 test = new single_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case2");		
		threadNumber=2;
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		//
		int[] actualArray=test.parallel_single(threadNumber);
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		int expected =1;//only one single works
		
		if(expected==actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setActualValue(actual);
		result.setExpectedValue(expected);
		//
		
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
	public void singleTest3() {		
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		single_positive_test1 test = new single_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case3");		
		threadNumber=2;
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		//
		int[] actualArray=test.parallel_single(threadNumber);
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		int expected =1;//only one single works
		
		if(expected==actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setActualValue(actual);
		result.setExpectedValue(expected);
		//
		
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
	public void singleTest4() {		
		threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		single_positive_test1 test = new single_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case4");		
		threadNumber=2;
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		//
		int[] actualArray=test.parallel_single(threadNumber);
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		int expected =1;//only one single works
		
		if(expected==actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setActualValue(actual);
		result.setExpectedValue(expected);
		//
		
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
	public void singleTest5() {		
		threadNumber = 6;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		single_positive_test1 test = new single_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case5");		
		threadNumber=2;
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		//
		int[] actualArray=test.parallel_single(threadNumber);
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		int expected =1;//only one single works
		
		if(expected==actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setActualValue(actual);
		result.setExpectedValue(expected);
		//
		
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
	public void singleTest6() {		
		threadNumber = 7;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		single_positive_test1 test = new single_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case6");		
		threadNumber=2;
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		//
		int[] actualArray=test.parallel_single(threadNumber);
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		int expected =1;//only one single works
		
		if(expected==actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setActualValue(actual);
		result.setExpectedValue(expected);
		//
		
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
	public void singleTest7() {		
		threadNumber = 8;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		single_positive_test1 test = new single_positive_test1();
		Result result = new Result();
		try {
		result.setTestName("Postive_test1_Case7");		
		threadNumber=2;
		result.setThreadCount(threadNumber);
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		//
		int[] actualArray=test.parallel_single(threadNumber);
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		int expected =1;//only one single works
		
		if(expected==actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");
		
		result.setActualValue(actual);
		result.setExpectedValue(expected);
		//
		
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
