package utils;
import java.io.*;
import pj.*;

public class Generate {
	
	public static void main(String[] args) {
		try {
			pj.PyjamaToJavaParser.parse(new File("src/squares/Squares.pj"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
