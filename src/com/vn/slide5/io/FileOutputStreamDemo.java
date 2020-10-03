package com.vn.slide5.io;

import java.io.FileOutputStream;
import java.io.IOException;

import com.vn.utils.FileUtils;

public class FileOutputStreamDemo {

	private static final String FILE_OUTPUT = "E:\\Appache\\test.txt";

	public static void main(String[] args) throws IOException {
		FileUtils.writeFile("Hello Java 5", FILE_OUTPUT);
		FileUtils.writeFile("Hello Java 2", FILE_OUTPUT);

	}

}
