package jUnitTestSuits.correctnessTests.sections;

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
import PyjamaCode.TestingDirectives.Sections.*;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Sections_corrTest {

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Sections","CorrectnessJunitResults",false);
	}
	
	@Test
	public void sectionsTest1() {		
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		section_positive_test1 test = new section_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case1");		
		result.setThreadCount(threadNumber);
		
		//
		int[] actualArray=test.parallel_sections(threadNumber);
		
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		
		int expected =2;//only two section
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
	public void sectionsTest2() {		
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		section_positive_test1 test = new section_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case2");		
		result.setThreadCount(threadNumber);
		
		//
		int[] actualArray=test.parallel_sections(threadNumber);
		
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		
		int expected =2;//only two section
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
	public void sectionsTest3() {		
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		section_positive_test1 test = new section_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case3");		
		result.setThreadCount(threadNumber);
		
		//
		int[] actualArray=test.parallel_sections(threadNumber);
		
		int actual=0;
		for(int item:actualArray)
			actual+=item;

		int expected =2;//only two section
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
	public void sectionsTest4() {		
		threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		section_positive_test1 test = new section_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case4");		
		result.setThreadCount(threadNumber);
		
		//
		int[] actualArray=test.parallel_sections(threadNumber);
		
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		
		int expected =2;//only two section
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
	/////////////////////////////////////////////////////////////////////////
	@Test
	public void sectionsTest5() {		
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		section_positive_test2 test = new section_positive_test2();
		Result result = new Result();
		result.setTestName("Postive_test2_Case1");		
		result.setThreadCount(threadNumber);
		
		//
		int[] actualArray=test.parallel_sections(threadNumber);
		
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		
		int expected =3;//only three section
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
	public void sectionsTest6() {		
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		section_positive_test2 test = new section_positive_test2();
		Result result = new Result();
		result.setTestName("Postive_test2_Case2");		
		result.setThreadCount(threadNumber);
		
		//
		int[] actualArray=test.parallel_sections(threadNumber);
		
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		
		int expected =3;//only three section
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
	public void sectionsTest7() {		
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		section_positive_test2 test = new section_positive_test2();
		Result result = new Result();
		result.setTestName("Postive_test2_Case3");		
		result.setThreadCount(threadNumber);
		
		//
		int[] actualArray=test.parallel_sections(threadNumber);
		
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		
		int expected =3;//only three section
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
	public void sectionsTest8() {		
		threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		section_positive_test2 test = new section_positive_test2();
		Result result = new Result();
		result.setTestName("Postive_test2_Case4");		
		result.setThreadCount(threadNumber);
		
		//
		int[] actualArray=test.parallel_sections(threadNumber);
		
		int actual=0;
		for(int item:actualArray)
			actual+=item;
		
		int expected =3;//only three section
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
