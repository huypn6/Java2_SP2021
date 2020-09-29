package com.vn.slide4;

public class TryCatchDemo {
	public static void main(String[] args) {
		
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			
		} finally {
			// TODO: handle finally clause
		}
		
		try {
			Integer a = Integer.parseInt("b");
			System.out.println("Done!");
		} catch (Exception e) {
			System.out.println("catch!");
			e.printStackTrace();
		} finally {
			System.out.println("finally!");
		}
		
		
	}
}
