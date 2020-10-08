package com.vn.slide6.thread;

public class ThreadImplement implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread2: " + i);
		}
	}
}
