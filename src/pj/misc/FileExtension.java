package pj.misc;

/**
 * This class specifies the extension type
 * for Pyjama compiler code units
 * 
 * @author vikassingh
 */
public class FileExtension {
	
	/*
	 * we have a singleton class, should not be
	 * instantiated
	 */
	private FileExtension(){
		// nothing to do, cannot be instantiated
	}
	
	/*
	 * The Pyjama file extension
	 */
	private final static String PYJAMA_FILE_EXTENSION = ".pj";
	
	public static String getPyjamaFileExtension(){
		return PYJAMA_FILE_EXTENSION;
	}
}
