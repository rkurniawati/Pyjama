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
import Utility.StreamGobbler.StreamGobbler;
import Domain.SettingConstans;
import Domain.Bean.Data;
import Domain.Bean.Result;
import Utility.JSONDatabaseHelper.resultWriterHelper;
import Utility.JavaCompileHelper.JavaCompiler;

public class PrivateTest {

	private static Data Data= new Data();

	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Private","CompileJunitResults",false);
	}
	
	@Test
	public void PositiveTest1() {
		if(!positiveTest("PositiveTest1","private_positive_test1","test1","private variables in prarllel region"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest2() {
		if(!positiveTest("PositiveTest2","private_positive_test2","test2","private variables in prarllel for construct"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest3() {
		if(!positiveTest("PositiveTest3","private_positive_test3","test3","private variables in prarllel section construct"))
			fail("Compile Failed");
	}

	@Test
	public void PositiveTest4() {
		if(!positiveTest("PositiveTest4","private_positive_test4","test4","private variables in prarllel single construct"))
			fail("Compile Failed");
	}
		
	@Test
	public void NegativeTest1() {		
		if(!negativeTest("NegativeTest1","private_negative_test1","Undefined variable"))
			fail("Compile Failed");
	}
	
	@Test
	public void NegativeTest2() {
		if(!negativeTest("NegativeTest2","private_negative_test2","private variables in prarllel region"))
			fail("Compile Failed");
	}
	
	private boolean positiveTest(String name,String filename,String test,String remark){
		Result result = new Result();		
		result.setTestName(name);
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingClauses/Private/"+filename+".pj");
		result.setRemark(remark);
		result.setCompileResult("failed");
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingClauses/Private/"+filename+".pj"));
			JavaCompiler builder = new JavaCompiler();
			List<String> error =builder.buildJava(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingClauses/Private/",test);
			String cmd="javac "+SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingClauses/Private/"+filename+".java";
            Runtime rt = Runtime.getRuntime();
		    Process proc = rt.exec(cmd);
		    StreamGobbler errorGobbler = new StreamGobbler(
					proc.getErrorStream(), "ERROR");
		    errorGobbler.start();
		    errorGobbler.join();
			if (error.size()>0){
				result.setCompileResult(error.toString());
				result.setJunitResult("notPass");
				Data.ReSetResult(result);
				return false;
			}
			else if (!errorGobbler.getMsg().isEmpty()) {
				System.out.println(errorGobbler.getMsg());
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
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingClauses/Private/"+filename+".pj");
		result.setRemark(remark);
		result.setCompileResult("failed");
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingClauses/Private/"+filename+".pj"));
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
