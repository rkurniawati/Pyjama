package jUnitTestSuits.compileTests;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import pj.PyjamaToJavaParser;
import pj.Version;
import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import Utility.JSONDatabaseHelper.resultWriterHelper;
import Utility.JavaCompileHelper.JavaCompiler;
/**
 * A reduction variable must be shared in the parallel region(s)
 * bound to the worksharing region(s) arising from the construct with the REDUCTION clause.
 * 
 * */
public class ReductionTest {

	private static Data Data= new Data();

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Reduction","CompileJunitResults",false);
	}
	
	@Test
	public void PositiveTest1() {
		if(!positiveTest("PositiveTest1","reduction_positive_test1","test1","Add operation"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest2() {
		if(!positiveTest("PositiveTest2","reduction_positive_test2","test2","Subtraction operation"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest3() {
		if(!positiveTest("PositiveTest3","reduction_positive_test3","test3","Multiplication operation"))
			fail("Compile Failed");
	}

	@Test
	public void PositiveTest4() {
		if(!positiveTest("PositiveTest4","reduction_positive_test4","test4","Bitwise and operation"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest5() {
		if(!positiveTest("PositiveTest5","reduction_positive_test5","test5","Bitwise or operation"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest6() {
		if(!positiveTest("PositiveTest6","reduction_positive_test6","test6","XOR operation"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest7() {
		if(!positiveTest("PositiveTest7","reduction_positive_test7","test7","Logic and operation"))
			fail("Compile Failed");
	}

	@Test
	public void PositiveTest8() {
		if(!positiveTest("PositiveTest8","reduction_positive_test8","test8","Logic or operation"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest9() {
		if(!negativeTest("PositiveTest9","reduction_positive_test9","sum of integer"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest10() {
		if(!positiveTest("PositiveTest10","reduction_positive_test10","test10","sum of double"))
			fail("Compile Failed");
	}
	
	@Test
	public void NegativeTest1() {		
		if(!negativeTest("NegativeTest1","reduction_negative_test1","Undefined variable"))
			fail("Compile Failed");
	}
	
	private boolean positiveTest(String name,String filename,String test,String remark){
		Result result = new Result();		
		result.setTestName(name);
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingClauses/Reduction/"+filename+".pj");
		result.setRemark(remark);
		result.setCompileResult("failed");
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingClauses/Reduction/"+filename+".pj"));
			JavaCompiler builder = new JavaCompiler();
			List<String> error =builder.buildJava(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingClauses/Reduction/",test);
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
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingClauses/Reduction/"+filename+".pj");
		result.setRemark(remark);
		result.setCompileResult("failed");
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingClauses/Reduction/"+filename+".pj"));
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
