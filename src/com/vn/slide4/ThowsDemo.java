package com.vn.slide4;

import javax.management.RuntimeErrorException;

public class ThowsDemo {
	
	public static void main(String[] args) {
		try {
			methodB();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void methodA() throws RuntimeException, Exception {
		methodB();
	}
	
	public static void methodB() {
		throw new RuntimeException("Thow new exception");
	}
}
