package com.vn.slide5;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	private static final String PATH_FILE = "E:\\FileDemo.txt";
	public static void main(String[] args) throws IOException {
		
		//1. Create input stream to read file
		FileInputStream inputStream = new FileInputStream(PATH_FILE);
		
		//2. Read file (int => char => String);
		int charInt;
		StringBuilder builder = new StringBuilder();
		while ((charInt = inputStream.read()) > -1) {
			char charItem =  (char) charInt;
			builder.append(charItem);
		}
		//2.1 show data to console 
		System.out.println(builder.toString());
		
		//3. Close input stream
		inputStream.close();
	}
}
