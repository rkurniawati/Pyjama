package jUnitTestSuits.compileTests;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import pj.PyjamaToJavaParser;
import pj.Version;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import Domain.*;
import Domain.Bean.Data;
import Domain.Bean.Result;
import Utility.JSONDatabaseHelper.resultWriterHelper;
import Utility.JavaCompileHelper.JavaCompiler;
import Utility.StreamGobbler.StreamGobbler;

/**
 * The atomic keyword in OpenMP specifies that the denoted action happens atomically. 
 * It is commonly used to update counters and other simple variables that are accessed by
 * multiple threads simultaneously.
 *
 * 
 * The atomic directive ensures that a specific memory location is updated atomically, rather than exposing
 * it to the possibility of multiple, simultaneous writing threads. 
 *  The syntax of the atomic directive is as follows:
	#pragma omp atomic new-line 
   		expression-stmt
   		
The expression statement must have one of the following forms:
x binop= expr
x++
++x
x--
--x
In the preceding expressions:
x is an lvalue expression with scalar type.
expr is an expression with scalar type, and it does not reference the object designated by x.
binop is not an overloaded operator and is one of +, *, -, /, &, ^, |, <<, or >>.

 * 
 * The atomic directive supports no Pyjama clauses.
 * */
public class AtomicTest {
	
	private static Data Data= new Data();
	
	@Rule
	public Timeout globalTimeout = new Timeout(SettingConstans.TIMEOUT);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Data.setVersion(Version.compilerVersion);
		resultWriterHelper n = new resultWriterHelper();
		n.write(Data,"JsonResult","Atomic","CompileJunitResults",false);
	}
	
	@Test
	public void PositiveTest1() {
		if(!positiveTest("PositiveTest1","atomic_positive_test1","test1","Increasement of atomic interger (counter++)"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest2() {
		if(!positiveTest("PositiveTest2","atomic_positive_test2","test2","Increasement of atomic interger (++counter)"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest3() {
		if(!positiveTest("PositiveTest3","atomic_positive_test3","test3","Decreasement of atomic interger (counter--)"))
			fail("Compile Failed");
	}
	
	@Test
	public void PositiveTest4() {
		if(!positiveTest("PositiveTest4","atomic_positive_test4","test4","Decreasement of atomic interger (--counter)"))
			fail("Compile Failed");
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void NegativeTest1() {
		if(!negativeTest("NegativeTest1","atomic_negative_test1","counter = add expression"))
			fail("Compile Failed");
	}
	
	@Test
	public void NegativeTest2() {
		if(!negativeTest("NegativeTest2","atomic_negative_test2","counter = subtraction expression"))
			fail("Compile Failed");
	}
	
	@Test
	public void NegativeTest3() {
		if(!negativeTest("NegativeTest3","atomic_negative_test3","counter = multiplication expression"))
			fail("Compile Failed");
	}
	
	@Test
	public void NegativeTest4() {
		if(!negativeTest("NegativeTest4","atomic_negative_test4","x += expression"))
			fail("Compile Failed");
	}
	
	@Test
	public void NegativeTest5() {
		if(!negativeTest("NegativeTest5","atomic_negative_test5","x -= expression"))
			fail("Compile Failed");
	}
	
	@Test
	public void NegativeTest6() {
		if(!negativeTest("NegativeTest6","atomic_negative_test6","x *= expression"))
			fail("Compile Failed");
	}
	
	private boolean positiveTest(String name,String filename,String test,String remark){
		Result result = new Result();		
		result.setTestName(name);
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/Atomic/"+filename+".pj");
		result.setRemark(remark);
		result.setCompileResult("failed");
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/Atomic/"+filename+".pj"));
			JavaCompiler builder = new JavaCompiler();
			List<String> error =builder.buildJava(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/Atomic/",test);
			String cmd="javac "+SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/Atomic/"+filename+".java";
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
		result.setCompilePJFilePath(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/Atomic/"+filename+".pj");
		result.setRemark(remark);
		result.setCompileResult("failed");
		result.setJunitResult("TimeOut");
		Data.addResult(result);
		
		try {
			PyjamaToJavaParser.parse(new File(SettingConstans.COMPILETARGETTESTCODEPATH+"/PyjamaCode/TestingDirectives/Atomic/"+filename+".pj"));
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
