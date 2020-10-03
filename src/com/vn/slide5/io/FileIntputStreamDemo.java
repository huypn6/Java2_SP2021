package com.vn.slide5.io;

import java.io.IOException;

import com.vn.utils.FileUtils;

public class FileIntputStreamDemo {

	private static final String FILE_OUTPUT = "E:\\Appache\\test.txt";

	public static void main(String[] args) throws IOException {
		FileUtils.readFile(FILE_OUTPUT);

	}

	
}
