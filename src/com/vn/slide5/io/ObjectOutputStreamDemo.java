package com.vn.slide5.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	
	private static final String FILE_OUTPUT = "E:\\Appache\\testObject.txt";

	public static void main(String[] args) throws IOException{
		//1 create file output stream
		FileOutputStream fileOutputStream = new FileOutputStream(FILE_OUTPUT);
		
		//2 create OjectOutputStream (1)
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		//3. List Oject[]
		Student[] students = new Student[] {
				new Student("1", "Tung"),
				new Student("2", "Tung2")
		};
		
		//4. (2) write(Object[]) => 3
		objectOutputStream.writeObject(students);
		
		//5 close (1) (2)
		objectOutputStream.close();
		fileOutputStream.close();
		
		System.out.println("Done!");
		
	}
}
