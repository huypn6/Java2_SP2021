package com.vn.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {

	public static void readFile(String filepath) throws IOException {
		// 1. Create FileIntputStream object
		FileInputStream inputStream  = new FileInputStream(filepath);

		// 2. create int character
		int character;
		
		// 3. while => use  inputStream (1) read() != -1, > -1, 0
		while ((character = inputStream.read()) > -1) {
			//3.1 convert (2) -> char
			char c = (char)character;
			System.out.print(c);
		}
		//4. close input
		inputStream.close();
		
		System.out.println("Done!");
	}
	
	public static void writeFile(String data, String file) throws IOException {
		// 1. Create FileOutputStream object
		FileOutputStream outputStream = new FileOutputStream(file);

		// 2. Create data string
		//String data = "Hello Java 5";

		// 3. convert string => byte[]
		byte[] dataBytes = data.getBytes();

		// 4. use FileOutputStream (1) write file
		outputStream.write(dataBytes);

		// 5. Close (1)
		// outputStream.close();

		System.out.println("Done!");
	}
}
