package pj.misc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * An implementation to generate the current version 
 * details for the current version of the compiler.
 * 
 * It also contains utility methods to get the
 * current time stamp.
 * 
 * @author vikassingh
 * @author Xing Fan
 */
public class Version {

	/*
	 * This is a singleton class and cannot
	 * be instantiated
	 */
	private Version(){
		// singleton
	}
	
	/*
	 * we use a dependency string, should be updated timely
	 */
	public static final String compilerVersion = "v1.4";
	
	public static String getCompileDate(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	public static String getCompileTime(){
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}
}
