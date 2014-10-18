package jUnitTestSuits.correctnessTests.critical;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import pj.Version;
import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import PyjamaCode.TestingDirectives.Critical.*;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Critical_corrTest {

	private int threadNumber;
	private static Data Data = new Data();

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Critical", "CorrectnessJunitResults", false);
	}

	@Test
	public void criticalTest1() {
		critical_positive_test1 test = new critical_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case1");
		threadNumber = 2;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_critical(threadNumber);
		int expected = threadNumber;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void criticalTest2() {
		critical_positive_test1 test = new critical_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case2");
		threadNumber = 3;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_critical(threadNumber);
		int expected = threadNumber;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void criticalTest3() {
		critical_positive_test1 test = new critical_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case3");
		threadNumber = 4;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_critical(threadNumber);
		int expected = threadNumber;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void criticalTest4() {
		critical_positive_test1 test = new critical_positive_test1();
		Result result = new Result();
		result.setTestName("Postive_test1_Case4");
		threadNumber = 5;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_critical(threadNumber);
		int expected = threadNumber;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	/////////////////////////////////////////////////////////////////////////////////
	@Test
	public void criticalTest5() {
		critical_positive_test2 test = new critical_positive_test2();
		Result result = new Result();
		result.setTestName("Postive_test2_Case1");
		threadNumber = 2;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_critical(threadNumber);
		int expected = 0;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void criticalTest6() {
		critical_positive_test2 test = new critical_positive_test2();
		Result result = new Result();
		result.setTestName("Postive_test2_Case2");
		threadNumber = 3;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_critical(threadNumber);
		int expected = 0;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void criticalTest7() {
		critical_positive_test2 test = new critical_positive_test2();
		Result result = new Result();
		result.setTestName("Postive_test2_Case3");
		threadNumber = 4;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_critical(threadNumber);
		int expected = 0;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void criticalTest8() {
		critical_positive_test2 test = new critical_positive_test2();
		Result result = new Result();
		result.setTestName("Postive_test2_Case4");
		threadNumber = 5;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_critical(threadNumber);
		int expected = 0;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	/////////////////////////////////////////////////////////////////////////////////
	@Test
	public void criticalTest9() {
		critical_positive_test3 test = new critical_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case1");
		threadNumber = 2;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_critical(threadNumber);
		int expected = (int) Math.pow(2, threadNumber);
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void criticalTest10() {
		critical_positive_test3 test = new critical_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case2");
		threadNumber = 3;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_critical(threadNumber);
		int expected = (int) Math.pow(2, threadNumber);
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void criticalTest11() {
		critical_positive_test3 test = new critical_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case3");
		threadNumber = 4;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_critical(threadNumber);
		int expected = (int) Math.pow(2, threadNumber);
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void criticalTest12() {
		critical_positive_test3 test = new critical_positive_test3();
		Result result = new Result();
		result.setTestName("Postive_test3_Case4");
		threadNumber = 5;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_critical(threadNumber);
		int expected = (int) Math.pow(2, threadNumber);
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	/////////////////////////////////////////////////////////////////////////////////
	private int Number = 100;
	@Test
	public void criticalTest13() {
		critical_positive_test4 test = new critical_positive_test4();
		Result result = new Result();
		result.setTestName("Postive_test4_Case1");
		threadNumber = 2;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_for_critical(threadNumber, Number);
		int expected = Number;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void criticalTest14() {
		critical_positive_test4 test = new critical_positive_test4();
		Result result = new Result();
		result.setTestName("Postive_test3_Case2");
		threadNumber = 3;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_for_critical(threadNumber, Number);
		int expected = Number;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void criticalTest15() {
		critical_positive_test4 test = new critical_positive_test4();
		Result result = new Result();
		result.setTestName("Postive_test3_Case3");
		threadNumber = 4;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_for_critical(threadNumber, Number);
		int expected = Number;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
	
	@Test
	public void criticalTest16() {
		critical_positive_test4 test = new critical_positive_test4();
		Result result = new Result();
		result.setTestName("Postive_test3_Case4");
		threadNumber = 5;
		result.setThreadCount(threadNumber);

		//
		int actual = test.parallel_for_critical(threadNumber, Number);
		int expected = Number;
		//

		if (expected == actual)
			result.setJunitResult("Success");
		else
			result.setJunitResult("Failed");

		result.setExpectedValue(expected);
		result.setActualValue(actual);
		Data.addResult(result);

		assertEquals(expected, actual);
	}
}
