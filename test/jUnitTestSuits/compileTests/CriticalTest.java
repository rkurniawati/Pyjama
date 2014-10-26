package jUnitTestSuits.compileTests;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import Utility.JSONDatabaseHelper.resultWriterHelper;
import Utility.JavaCompileHelper.JavaCompiler;
import pj.PyjamaToJavaParser;
import pj.Version;

/**
 * The CRITICAL directive specifies a region of code that must be executed by
 * only one thread at a time
 * 
 * The critical directive supports no Pyjama clauses.
 */
public class CriticalTest {

	private static Data Data = new Data();

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data, "JsonResult", "Critical", "CompileJunitResults", false);
	}

	@Test
	public void PositiveTest1() {
		if(!positiveTest("PositiveTest1","critical_positive_test1","test1","add expression in critical region"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest2() {
		if(!positiveTest("PositiveTest2","critical_positive_test2","test2","subtraction expression in critical region"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest3() {
		if(!positiveTest("PositiveTest3","critical_positive_test3","test3","multiplication expression in critical region"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest4() {
		if(!positiveTest("PositiveTest4","critical_positive_test4","test4","Find max interger value of array in critical region"))
			fail("Compile Failed");
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*
	 * From Pyjama 1.3, single statement is supported for directives, so does //#omp critical
	 * So the NegativeTests are not available now, become PositiveTests
	 * Xing Fan at 2014.10.22
	 */
	@Test
	public void PositiveTest5() {
		if(!positiveTest("PositiveTest5","critical_positive_test5","test5","Decreasement of atomic interger (counter--)"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest6() {
		if(!positiveTest("PositiveTest6","critical_positive_test6","test6","Increasement of atomic interger (++counter)"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest7() {
		if(!positiveTest("PositiveTest7","critical_positive_test7","test7","Decreasement of atomic interger (--counter)"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest8() {
		if(!positiveTest("PositiveTest8","critical_positive_test8","test8","Increasement of atomic interger (counter++)"))
			fail("Compile Failed");
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private boolean positiveTest(String name,String filename,String test,String remark){
		Result result = new Result();		
		result.setTestName(name);
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/Critical/"+filename+".pj");
		result.setRemark(remark);
		result.setCompileResult("failed");
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/Critical/"+filename+".pj"));
			JavaCompiler builder = new JavaCompiler();
			List<String> error =builder.buildJava(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/Critical/",test);
			if (error.size()>0){
				result.setCompileResult(error.toString());
				result.setJunitResult("notPass");
				Data.ReSetResult(result);
				return false;
			}
			else{
				result.setCompileResult("success");
				result.setJunitResult("Pass");
			}
		} catch (Exception e) {
			e.printStackTrace();
			if(e.getMessage()==null){
				result.setJunitResult("notPass");
			}else{
				result.setCompileResult(e.getMessage());
			
			if(e.getMessage().startsWith("Unsupported"))
				result.setJunitResult("Unsupported");
			else
				result.setJunitResult("notPass");
			}
			Data.ReSetResult(result);
			return false;
		}
		Data.ReSetResult(result);
		return true;
	}
	
	private boolean negativeTest(String name,String filename,String remark){
		Result result = new Result();
		result.setTestName(name);
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/Critical/"+filename+".pj");
		result.setRemark(remark);
		result.setCompileResult("failed");
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/Critical/"+filename+".pj"));
		} catch (Exception e) {
			result.setCompileResult("Should failed");
			result.setJunitResult("Pass");
			Data.ReSetResult(result);
			e.printStackTrace();
			return true;
		}
		result.setCompileResult("Shouldn't success");
		result.setJunitResult("notPass");
		Data.ReSetResult(result);
		return false;
	}

}
