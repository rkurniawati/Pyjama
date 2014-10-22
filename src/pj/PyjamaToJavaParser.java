package pj;

import java.io.*;

//import pt.compiler.ParaTaskParser;
import pj.parser.ASTParser;
import pj.parser.ast.CompilationUnit;
import pj.parser.ast.symbolscope.SymbolTable;
import pj.parser.ast.visitor.DumpVisitor;
import pj.parser.ast.visitor.PyjamaToJavaVisitor;
import pj.parser.ast.visitor.SymbolScopingVisitor;

 
/**
 * We define the main parser for Desktop Pyjama here.
 * An use class should invoke the static method parse() 
 * on an input .pj file.
 * 
 * The parser logic revolves around forming as AST from the
 * input .pj file, using the Pyjama parser and lexical analyser.
 * Once the AST is former, it is normalised and then translated
 * using the visitor pattern.
 * 
 * @author vikassingh
 * @author Xing Fan
 *
 */
public class PyjamaToJavaParser {

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

		showMsg("Processing 1st Phase: Parse and Normalisation");
		// we form the initial AST here, with normalisation when necessary
		CompilationUnit ast = ASTParser.parse(is);
		
		showMsg("Processing 2nd Phase: Symbol scoping visiting");
		SymbolScopingVisitor symbolVisitor = new SymbolScopingVisitor();
		ast.accept(symbolVisitor, null);
		symbolVisitor.printSymbolTable(); //log info print
		SymbolTable symbolTable = symbolVisitor.getSymbolTable();
		
		showMsg("Processing 3rd Phase: Pyjama code translation visiting");
		PyjamaToJavaVisitor pyjamaVisitor = new PyjamaToJavaVisitor(symbolTable);
		ast.accept(pyjamaVisitor, null);
		
		showMsg("Processing 4th Phase: Generating java code");
		String targetCode = pyjamaVisitor.getSource();
		File paraTaskFile = new File(file.getParent(), file.getName().substring(0,file.getName().lastIndexOf("."))+".java"); 
		writeToFile(paraTaskFile, targetCode);
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

	/*
	 * Utility method to print debug error
	 * @param msg Debug Error String
	 * @note Should use this method instead of System.out/err calls, so that
	 * @note we can switch off/on the debug messages.
	 */
	private void showErr(String err){
		if(true == mDebug){
			System.err.println(err);
		}
	}
}
