package Utility.JavaCompileHelper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Domain.SettingConstans;

public class JavaCompiler {
	public List<String> buildJava(String filePath, String testNumber)
			throws IOException {
		List<String> commands = new ArrayList<String>(Arrays.asList("javac",
				"-d", "bin", "-cp", "lib/"+SettingConstans.PyjamaJarName+".jar"));
		// "lib/gson-2.2.2.jar"
		// commands.addAll(getJavaFiles("lib/","jar"));	
		commands.addAll(getJavaFiles(filePath, "java", testNumber));
		commands.addAll(getJavaFiles(SettingConstans.COMPILENEEDEDJAVAFILES+"/Domain/Bean/", "java", ""));
		commands.addAll(getJavaFiles(SettingConstans.COMPILENEEDEDJAVAFILES+"/Domain/DataType/", "java", ""));
		commands.addAll(getJavaFiles(SettingConstans.COMPILENEEDEDJAVAFILES+"/Utility/MemoryAndCPUHelper/", "java", ""));
		System.out.println(commands);

		ProcessBuilder probuilder = new ProcessBuilder(commands);
		probuilder.redirectErrorStream(true);
		
		// You can set up your work directory
		probuilder.directory(new File("../"));

		Process process = probuilder.start();

		// Read out dir output
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String line;
		List<String> errors = new ArrayList<String>();
		while ((line = br.readLine()) != null) {
			if (line.contains("error:")) {
				String message = line.substring(line.indexOf("error:"));
				if (!errors.contains(message)) {
					errors.add(message);
				}
			}
		}
		return errors;
	}

	private List<String> getJavaFiles(String path, String fileType,
			String TestNumber) {
		List<String> files = new ArrayList<String>();
		File folder = new File(path);

		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			// check object whether is file
			if (listOfFiles[i].isFile()) {
				String file = listOfFiles[i].getName();
				// check file whether is java file
				if (file.endsWith("." + fileType.toLowerCase())
						|| file.endsWith("." + fileType.toUpperCase())) {
					// check java file is whether help file or target test file 
					if (file.startsWith("_")
							|| file.endsWith(TestNumber + "."
									+ fileType.toUpperCase())
							|| file.endsWith(TestNumber + "."
									+ fileType.toLowerCase())) {
						files.add(path + listOfFiles[i].getName());
						//System.out.println(file);
					}
				}
			}
		}
		return files;
	}
	
	public static boolean validate(int[] actualArray,int[] expectedArray){
		boolean flag=true;
		for (int i = 0; i < actualArray.length; i++) {
			if (actualArray[i]!=expectedArray[i]) {
				flag=false;
			}
		}
		return flag;
	} 
}
