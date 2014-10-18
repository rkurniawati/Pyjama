package jUnitTestSuits.correctnessTests.libraries;

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
import PyjamaCode.TestingLibraries.Function2.testCase_omp_get_num_procs;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class Omp_get_num_procsTest {

	private int threadNumber;
	private static Data Data = new Data();
	private int processNum = SettingConstans.PROCESSNUM;

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Omp_get_num_procs", "CorrectnessJunitResults", false);
	}

	@Test
	public void LibraryTest1() {
		threadNumber = 2;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_num_procs test = new testCase_omp_get_num_procs();
		Result result = new Result();
		result.setTestName("Omp_get_num_procs_Case1");
		result.setThreadCount(threadNumber);

		//
		int actual = test.omp_get_num_procs(threadNumber);
		int expected = Runtime.getRuntime().availableProcessors();
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
	public void LibraryTest2() {
		threadNumber = 3;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_num_procs test = new testCase_omp_get_num_procs();
		Result result = new Result();
		result.setTestName("Omp_get_num_procs_Case2");
		result.setThreadCount(threadNumber);

		//
		int actual = test.omp_get_num_procs(threadNumber);
		int expected = Runtime.getRuntime().availableProcessors();;
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
	public void LibraryTest3() {
		threadNumber = 4;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_num_procs test = new testCase_omp_get_num_procs();
		Result result = new Result();
		result.setTestName("Omp_get_num_procs_Case3");
		result.setThreadCount(threadNumber);

		//
		int actual = test.omp_get_num_procs(threadNumber);
		int expected = Runtime.getRuntime().availableProcessors();;
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
	public void LibraryTest4() {
		threadNumber = 5;
		Assume.assumeTrue(processNum > threadNumber - 2);
		
		testCase_omp_get_num_procs test = new testCase_omp_get_num_procs();
		Result result = new Result();
		result.setTestName("Omp_get_num_procs_Case4");
		threadNumber = 5;
		result.setThreadCount(threadNumber);

		//
		int actual = test.omp_get_num_procs(threadNumber);
		int expected = Runtime.getRuntime().availableProcessors();;
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
