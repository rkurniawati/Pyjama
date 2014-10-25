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

public class LoopForTest {

	private static Data Data= new Data();

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","LoopFor","CompileJunitResults",false);
	}
	
	@Test
	public void PositiveTest1() {
		if(!positiveTest("PositiveTest1","loopFor_positive_test1","test1","the LoopFor' expression is greater-than"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest2() {
		if(!positiveTest("PositiveTest2","loopFor_positive_test2","test2","the LoopFor' expression is greater or equal than"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest3() {
		if(!positiveTest("PositiveTest3","loopFor_positive_test3","test3","the LoopFor' expression is less-than"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest4() {
		if(!positiveTest("PositiveTest4","loopFor_positive_test4","test4","the LoopFor' expression is less or equal than"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest5() {
		if(!positiveTest("PositiveTest5","loopFor_positive_test5","test5","expression x?y:z in loopFor initialization"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest6() {
		if(!positiveTest("PositiveTest6","loopFor_positive_test6","test6","operator of addition and subtraction in loopFor initialization"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest7() {
		if(!positiveTest("PositiveTest7","loopFor_positive_test7","test7","operator of multiplication and division in loopFor initialization"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest8() {
		if(!positiveTest("PositiveTest8","loopFor_positive_test8","test8","intergrated transportation in loopFor initialization"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest9() {
		if(!positiveTest("PositiveTest9","loopFor_positive_test9","test9","loopFor accumulator i++"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest10() {
		if(!positiveTest("PositiveTest10","loopFor_positive_test10","test10","loopFor accumulator ++i"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest11() {
		if(!positiveTest("PositiveTest11","loopFor_positive_test11","test11","loopFor accumulator i--"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest12() {
		if(!positiveTest("PositiveTest12","loopFor_positive_test12","test12","loopFor accumulator --i"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest13() {
		if(!positiveTest("PositiveTest13","loopFor_positive_test13","test13","loopFor accumulator i+=1"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest14() {
		if(!positiveTest("PositiveTest14","loopFor_positive_test14","test14","loopFor accumulator i-=1"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest15() {
		if(!positiveTest("PositiveTest15","loopFor_positive_test15","test15","loopFor accumulator i=i+1"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest16() {
		if(!positiveTest("PositiveTest16","loopFor_positive_test16","test16","loopFor accumulator i=i-1"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest17() {
		if(!positiveTest("PositiveTest17","loopFor_positive_test17","test17","loopFor getmax"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest18() {
		if(!positiveTest("PositiveTest18","loopFor_positive_test18","test18","loopFor expression is array.length"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest19() {
		if(!positiveTest("PositiveTest19","loopFor_positive_test19","test19","loopFor expression is Integer.MAX_VALUE"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest20() {
		if(!positiveTest("PositiveTest20","loopFor_positive_test20","test20","loopFor expression is (n-1)"))
			fail("Compile Failed");
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	@Test
	public void NegativeTest1() {		
		if(!negativeTest("NegativeTest1","loopFor_negative_test1","loopFor exprepression include || and equal false"))
			fail("Compile Failed");
	}
	
	@Test
	public void NegativeTest2() {		
		if(!negativeTest("NegativeTest2","loopFor_negative_test2","loopFor exprepression include || and equal true"))
			fail("Compile Failed");
	}
	
	@Test
	public void NegativeTest3() {		
		if(!negativeTest("NegativeTest3","loopFor_negative_test3","loopFor exprepression include && and equal false"))
			fail("Compile Failed");
	}
	
	@Test
	public void NegativeTest4() {		
		if(!negativeTest("NegativeTest4","loopFor_negative_test4","loopFor exprepression include && and equal true"))
			fail("Compile Failed");
	}
	
	@Test
	public void NegativeTest5() {		
		if(!negativeTest("NegativeTest5","loopFor_negative_test5","loopFor exprepression include !="))
			fail("Compile Failed");
	}
		
	@Test
	public void NegativeTest6() {		
		if(!negativeTest("NegativeTest6","loopFor_negative_test6","loopFor exprepression include == and equal false"))
			fail("Compile Failed");
	}
	
	@Test
	public void NegativeTest7() {		
		if(!negativeTest("NegativeTest7","loopFor_negative_test7","loopFor exprepression include == and equal true"))
			fail("Compile Failed");
	}
		
	@Test
	public void NegativeTest8() {
		if(!negativeTest("NegativeTest8","loopFor_negative_test8","loopFor expression is Test.max()"))
			fail("Compile Failed");
	}
	
	@Test
	public void Parallel_RT_Compile() {
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/LoopFor/loopFor_RT.pj"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test
	public void Parallel_RT_Monitor() {
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/LoopFor/loopFor_Monitor.pj"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	
	private boolean positiveTest(String name,String filename,String test,String remark){
		Result result = new Result();		
		result.setTestName(name);
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/LoopFor/"+filename+".pj");
		result.setRemark(remark);
		result.setCompileResult("failed");
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/LoopFor/"+filename+".pj"));
			JavaCompiler builder = new JavaCompiler();
			List<String> error =builder.buildJava(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/LoopFor/",test);
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
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/LoopFor/"+filename+".pj");
		result.setRemark(remark);
		result.setCompileResult("failed");
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/LoopFor/"+filename+".pj"));
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
