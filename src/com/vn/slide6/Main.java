package com.vn.slide6;

public class Main {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunableDemo());
		ThreadDemo t2 = new ThreadDemo();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		
	}
}
