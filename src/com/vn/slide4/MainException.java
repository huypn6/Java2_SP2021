package com.vn.slide4;

public class MainException {

	public static void main(String[] args) {
		chia();
		
	}

//	private static void chia() throws ArithmeticException {
	
	private static void chia() {
		int a = 5, b = 0;
		if(b==0) {
			throw new RuntimeException("Lỗi chương trình");
		}
		int c = a / b;
		System.out.println(c);
		System.out.println("Done!");
	}
}
