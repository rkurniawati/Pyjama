package pj.misc;

/**
 * This class specifies the utility methods to 
 * parse the compiler error generate by Java compiler.
 * We use this trick to determine the variable types.
 * 
 * Owing to different Java versions, this 
 * implements consists of error parsers for both Oracle(Sun) JAVA and
 * Open JDK.
 * 
 * @author vikassingh, Nasser Giacaman
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ErrorParser {

	public final static String uniqueID_Code = "//#Unique#ID#:";
	public final static String separator = "//#Unique#:";
	
	/*
	 * This is the error strings that we look for
	 */
	public final static String ERR_INCOMPATIBLE_TYPE_STR = "incompatible types";

	public static HashMap<String,IncompatibleType> getIncompatibleTypeErrors(String filePath, String classpath) {
		return getIncompatibleTypeErrors(" -cp "+classpath+" "+filePath);
	}

	public static HashMap<String,IncompatibleType> getIncompatibleTypeErrors(String filePath) {
		HashMap<String,IncompatibleType> map = new HashMap<String,IncompatibleType>();
		return map;
	}

	public static HashMap<String,List<IncompatibleType>> getAllIncompatibleTypeErrors(String filePath, String classpath) {
		return getAllIncompatibleTypeErrors(" -cp "+classpath+" "+filePath);
	}

	public static HashMap<String,List<IncompatibleType>> getAllIncompatibleTypeErrors(String filePath) {
		HashMap<String,List<IncompatibleType>> map = new HashMap<String,List<IncompatibleType>>();

		try {
			String cmd = "javac "+ filePath;
			Process process = Runtime.getRuntime().exec(cmd);
			BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			String s = null;

			while ((s = stdError.readLine()) != null ) {
				try{
					/*
					 * we handle the error posted by the 
					 * Open JDK here.
					 * 
					 * The parsing logic has a dependency on the
					 * error strings that is returned by the compilers.
					 */
					if (s.trim().endsWith(ERR_INCOMPATIBLE_TYPE_STR)) {
						String found = "";
						String required = "";
						String uniqueID = "";
						String varName = "";

						/*
						 * This handles the 2nd line of the error
						 */
						if((s = stdError.readLine()) != null){
							varName = s.substring(0, s.indexOf('='));
							varName = varName.trim();

							uniqueID = s.trim().substring(s.trim().lastIndexOf(separator));
							uniqueID = uniqueID.replaceAll(separator, "");
						}

						/*
						 * This handles the 3rd line of the error
						 */
						if((s = stdError.readLine()) != null){
							// nothing to do
						}

						/*
						 * This handles the 4h line of the error string
						 */
						if((s = stdError.readLine()) != null){
							required = s.trim().substring(s.trim().lastIndexOf(' ')+1);
						}

						/*
						 * This is the fifth line of the error string
						 */
						if((s = stdError.readLine()) != null){
							found = s.trim().substring(s.trim().lastIndexOf(' ')+1);
						}

						List<IncompatibleType> list = map.get(uniqueID); 
						if (list == null) {
							list = new ArrayList<IncompatibleType>();
							map.put(uniqueID, list);
						}
						list.add(new IncompatibleType(uniqueID, varName, found, required));

					}
				}catch(Exception e){
					// error format seen on Sun JDK
					if (s.trim().endsWith("incompatible types")) {
						/*
						 * We handle the error given by Sun JDK here.
						 * The error format is as below:
						 * 
						 * file_path/file_name:line_num:error: incompatible type
						 * code segment
						 *  ^
						 *  required: data_type
						 *  found: data_type
						 *  
						 *  e.g.
						 *  /afs/ec.auckland.ac.nz/users/..../src/xyz.java:13: error: incompatible types
						 *  j = new DummyClassToDetermineVariableType();
						 *     ^
						 *  required: int
						 *  found:    DummyClassToDetermineVariableType
						 */
						
						String found = "";
						String required = "";
						String uniqueID = "";
						String varName = "";

						/*
						 * we handle the 2nd line of error here
						 */
						if ((s = stdError.readLine()) != null ) {

							found = s.trim().substring(s.trim().lastIndexOf(' ')+1);
						}

						/*
						 * we handle the 3rd line of error here
						 */
						if ((s = stdError.readLine()) != null ) {
							//System.out.println(s);
							required = s.trim().substring(s.trim().lastIndexOf(' ')+1);
						}

						/*
						 * we handle the 4th line of error here
						 */
						if ((s = stdError.readLine()) != null ) {

							System.out.println(s);
							varName = s.substring(0, s.indexOf('='));
							varName = varName.trim();

							uniqueID = s.trim().substring(s.trim().lastIndexOf(separator));
							uniqueID = uniqueID.replaceAll(separator, "");
						}

						List<IncompatibleType> list = map.get(uniqueID); 
						if (list == null) {
							list = new ArrayList<IncompatibleType>();
							map.put(uniqueID, list);
						}
						list.add(new IncompatibleType(uniqueID, varName, found, required));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
}
