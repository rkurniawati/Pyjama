import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

import pj.misc.FileExtension;
import pj.misc.Version;
import pj.parser.ASTParser;
import pj.parser.ast.CompilationUnit;
import pj.parser.ast.visitor.*;


public class SymbolTableGenerate {
	/*
	 * set to true, to print debug messages
	 * @see showErr(), showMsg()
	 */
	private static boolean mDebug = true;
	
	static int count = 0;
	
	/**
	 * This is main public utility to parse Pyjama code. It accepts the .pj file as input
	 * and produces the multi-threaded Java version  
	 * @param file The input .pj file to be processed
	 * @throws Exception parse exceptions
	 */
	public static void parse(File file) throws Exception {
		
		showMsg("Pyjama Compiler Version: " + Version.compilerVersion);
		showMsg("-----------------------------------------------------");
		showMsg(Version.getCompileDate() + "\t" + Version.getCompileTime());
		showMsg("-----------------------------------------------------");
		showMsg("Processing file: " + file.toString());
		showMsg("-----------------------------------------------------");
		

		//check if the input file is a valid Pyjama extension
		if(false == validateFile(file.getName())){
			showMsg("Invalid file type");
			showMsg("Processing discontinued");
			showMsg("-----------------------------------------------------");
			return;
		}
		InputStream is = new FileInputStream(file);
		


		showMsg("Processing 1st Phase: Parse");
		// we form the initial AST here
		CompilationUnit ast = ASTParser.parse(is);
		showMsg("Processing 2st Phase: Normalisation print");
		
		SymbolScopingVisitor symbolVisitor = new SymbolScopingVisitor();
		ast.accept(symbolVisitor, null);
		symbolVisitor.printSymbolTable();

		DumpVisitor translationVisitor = new DumpVisitor();
		ast.accept(translationVisitor, null);
		String paraTaskCode = translationVisitor.getSource();
		File paraTaskFile = new File(file.getParent(), file.getName().substring(0,file.getName().lastIndexOf("."))+".java"); 
		writeToFile(paraTaskFile, paraTaskCode);
		showMsg("-----------------------------------------------------");
		showMsg("Processing Done");
	}
	
    /*
     * Utility method to push the contents of string to a file stream
     * @param file Input file name
     * @param contents Buffer contents to be pushed
     */
    private static void writeToFile(File file, String contents) {
        try {
        	Writer output = null;
            output = new BufferedWriter(new FileWriter(file));
			output.write(contents);
	        output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	/*
	 * Utility method which ensures the correct file type
	 * @param fileName input file name
	 * @return
	 */
	private static boolean validateFile(String fileName){
		return 
				fileName.endsWith(FileExtension.getPyjamaFileExtension());
	}
	
	/*
	 * Utility method to print debug message
	 * @param msg Debug Message String
	 * @note Should use this method instead of System.out/err calls, so that
	 * @note we can switch off/on the debug messages.
	 */
	private static void showMsg(String msg){
		if(true == mDebug){
			System.out.println(msg);
		}
	}

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		try {
			parse(new File("myTest/myTest.pj"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Finished tag");

	}
}
