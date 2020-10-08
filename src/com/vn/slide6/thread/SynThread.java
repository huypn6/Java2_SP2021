package com.vn.slide6.thread;

public class SynThread implements Runnable {
	
	public static void main(String[] args) {
		Thread synThread1 = new Thread(new SynThread());
		Thread synThread2 = new Thread(new SynThread());
		synThread1.start();
		synThread2.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
