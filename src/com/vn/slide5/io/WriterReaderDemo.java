package com.vn.slide5.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterReaderDemo {
	private static final String FILE_OUTPUT = "E:\\Appache\\testWriter.txt";
	public static void main(String[] args) throws IOException {
		//1. create writer
		FileWriter writer = new FileWriter(FILE_OUTPUT);
		writer.write("test writer");
		writer.close();
		
		FileReader reader = new FileReader(FILE_OUTPUT);
		int data;
		while( (data = reader.read()) != -1) {
			System.out.print((char)data);
		}
		reader.close();
		
	}
}
