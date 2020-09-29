package com.vn.slide4;

public class MyException extends Exception {
	
	public static void main(String[] args) {
		try {
			throw new MyException(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	int message;

	public MyException(int message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MyException: " + message;
	}
}
