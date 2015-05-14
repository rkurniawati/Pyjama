import java.io.File;
import pj.PyjamaToJavaParser;

public class Generate {
	
	public static void main(String[] args) {
		
		if (args.length < 1)
			usage();
		
		File start = new File(args[0]); 
		String envFlag = (args.length > 1 && args[1].equalsIgnoreCase("A"))? "A":"D";
		
		try {
			if (envFlag.equalsIgnoreCase("A")) {
				//PyjamaToAndroidParser.parse(start);
			}else {
				PyjamaToJavaParser.parse(start); 
			}
		} catch(Exception e) { 			
			System.err.println("*** Failed to process: "+start.getName()+" ****"); 
			e.printStackTrace(); 		
		} 	
	}

	private static void usage() {
		System.out.println("Usage to generate a file MyClass.java from MyClass.pj: ");
		System.out.println("  > java -cp pyjama.jar:. Generate MyClass.pj (A)");
		System.out.println("  > the second parameter means: compiled with Desktop env(default) OR compiled with Android env");
		System.exit(0);
	}
}
