package com.vn.slide5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectDataDemo2 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		read();
	}

	private static void write() throws IOException {
		//1. FileOuutputStream
		FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
		
		//2 Object ouptut stream (1)
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		
		//3 writeObject 
		 // 3.1 create Animal[]
			List<Animal> demoData = new ArrayList<Animal>();
			demoData.add(new Animal("Dog", "1", "Day la con cho"));
			demoData.add(new Animal("Dog", "1", "Day la con cho"));
			demoData.add(new Animal("Dog", "1", "Day la con cho"));
			demoData.add(new Animal("Dog", "1", "Day la con cho"));
		 // 3.2 write (3.1)
		objectOutputStream.writeObject(demoData);
		
		
		//4. Close
		objectOutputStream.close();
		fileOutputStream.close();
		
		System.out.println("Done!");
		
	}
	
	
	private static void read() throws IOException, ClassNotFoundException {
		//1. FileInputStream
		FileInputStream fileInputStream = new FileInputStream("test.txt");
		
		//2 Object input stream (1)
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		
		
		//3 readObject 
		ArrayList<Animal> data = (ArrayList<Animal>) inputStream.readObject();
		for (Animal animal : data) {
			System.out.println(animal.getName());
		}
		
		//4. Close
		inputStream.close();
		fileInputStream.close();
		
		System.out.println("Done!");
		
	}
}
