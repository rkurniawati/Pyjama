package jUnitTestSuits.compileTests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import pj.PyjamaToJavaParser;
import pj.Version;
import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import Utility.JSONDatabaseHelper.resultWriterHelper;

/**
 * omp_get_num_threads : Returns the number of threads in the parallel region.
 * omp_get_thread_num : Returns the thread number of the thread executing within its thread team.
 * omp_get_num_procs : Returns the number of processors that are available when the function is called.
 * omp_set_num_threads : Sets the number of threads in subsequent parallel regions, unless overridden
 *                       by a num_threads clause.
 * omp_get_max_threads : Returns an integer that is equal to or greater than the number of threads
 *                       that would be available if a parallel region without num_threads were 
 *                       defined at that point in the code.
 * 
 * */
public class LibrariesTest {

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
		
	@Test
	public void LibraryTest1() {
		Data Data= new Data();
		Result result = new Result();
		result.setTestName("Omp_get_max_threads");
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingLibraries/Function1/testCase_omp_get_max_threads.pj");
		result.setRemark("");
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingLibraries/Function1/testCase_omp_get_max_threads.pj"));
			result.setCompileResult("success");
			result.setJunitResult("Pass");
			
		} catch (Exception e) {
			e.printStackTrace();
			result.setCompileResult("failed");
			result.setJunitResult("notPass");
			Data.addResult(result);
			fail("Compile Failed");
		}
		Data.addResult(result);
		
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Omp_get_max_threads","CompileJunitResults",false);
	}
	
	@Test
	public void LibraryTest2() {
		Data Data= new Data();
		Result result = new Result();
		result.setTestName("Omp_get_num_procs");
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingLibraries/Function2/testCase_omp_get_num_procs.pj");
		result.setRemark("");
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingLibraries/Function2/testCase_omp_get_num_procs.pj"));
			result.setCompileResult("success");
			result.setJunitResult("Pass");
		} catch (Exception e) {
			e.printStackTrace();
			result.setCompileResult("failed");
			result.setJunitResult("notPass");
			Data.addResult(result);
			fail("Compile Failed");
		}
		Data.addResult(result);
		
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Omp_get_num_procs","CompileJunitResults",false);
	}
	
	@Test
	public void LibraryTest3() {
		Data Data= new Data();
		Result result = new Result();
		result.setTestName("Omp_get_num_threads");
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingLibraries/Function3/testCase_omp_get_num_threads.pj");
		result.setRemark("");
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingLibraries/Function3/testCase_omp_get_num_threads.pj"));
			result.setCompileResult("success");
			result.setJunitResult("Pass");
		} catch (Exception e) {
			e.printStackTrace();
			result.setCompileResult("failed");
			result.setJunitResult("notPass");
			Data.addResult(result);
			fail("Compile Failed");
		}
		Data.addResult(result);
		
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Omp_get_num_threads","CompileJunitResults",false);
	}
	
	@Test
	public void LibraryTest4() {
		Data Data= new Data();
		Result result = new Result();
		result.setTestName("Omp_get_thread_num");
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingLibraries/Function4/testCase_omp_get_thread_num.pj");
		result.setRemark("");
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingLibraries/Function4/testCase_omp_get_thread_num.pj"));
			result.setCompileResult("success");
			result.setJunitResult("Pass");
		} catch (Exception e) {
			e.printStackTrace();
			result.setCompileResult("failed");
			result.setJunitResult("notPass");
			Data.addResult(result);
			fail("Compile Failed");
		}
		Data.addResult(result);
		
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Omp_get_thread_num","CompileJunitResults",false);
	}
	
	@Test
	public void LibraryTest5() {
		Data Data= new Data();
		Result result = new Result();
		result.setTestName("Omp_set_num_threads");
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingLibraries/Function5/testCase_omp_set_num_threads.pj");
		result.setRemark("");
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingLibraries/Function5/testCase_omp_set_num_threads.pj"));
			result.setCompileResult("success");
			result.setJunitResult("Pass");
		} catch (Exception e) {
			e.printStackTrace();
			result.setCompileResult("failed");
			result.setJunitResult("notPass");
			Data.addResult(result);
			fail("Compile Failed");
		}
		Data.addResult(result);
		
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Omp_set_num_threads","CompileJunitResults",false);
	}

}
