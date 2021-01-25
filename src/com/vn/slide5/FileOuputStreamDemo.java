package com.vn.slide5;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOuputStreamDemo {

	private static final String PATH_FILE = "E:\\FileDemo.txt";
	public static void main(String[] args) throws IOException {
		
		//1. Create output stream to write file
		FileOutputStream outputStream = new FileOutputStream(PATH_FILE);
		
		//2. convert data (string) => byte
		byte[] inputWrite = "Toi la Poly2".getBytes();
		outputStream.write(inputWrite);
		
		//3. Close output stream
		outputStream.close();
		
		System.out.println("Done!");
	}
}
