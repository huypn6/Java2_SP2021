package com.vn.slide6.thread;

public class MainThread {
	
	public static void main(String[] args) {
		ThreadExtends thread1 = new ThreadExtends();
		ThreadImplement thread2 = new ThreadImplement();
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
					for (int i = 1; i <= 10; i++) {
						System.out.println("Thread 3:" + i);
					}
			}
		});
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread1.setPriority(Thread.MIN_PRIORITY);
		//
		thread1.start();
		thread3.start();
		
	}
}
