import java.io.*;


public class myGenerate extends Object{
	
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		try {
			pj.misc.PyjamaToJavaParser.parse(new File("myTest/myTest.pj"));
			//pj.PyjamaToJavaParser.parse(new File("myTest/ordered_positive_test1.pj"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Finished tag");

	}

}