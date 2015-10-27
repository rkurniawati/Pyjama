import java.io.*;

public class myGenerate extends Object{
	
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		try {
			pj.PyjamaToJavaParser.parse(new File("myTest/asyncTest/AsyncSemanticTest.pj"));
			pj.PyjamaToJavaParser.parse(new File("myTest/asyncTest/AsyncGuiTest.pj"));
			pj.PyjamaToJavaParser.parse(new File("myTest/eventdrivenTest/AsyncGuiTest.pj"));
			//pj.PyjamaToJavaParser.parse(new File("myTest/exceptionTest/EPCCsyncbench.pj"));
			//pj.PyjamaToJavaParser.parse(new File("myTest/asyncTest/AsyncSemanticTest.pj"));
			//pj.PyjamaToJavaParser.parse(new File("myTest/squares/Squares.pj"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Finished tag");

	}

}
