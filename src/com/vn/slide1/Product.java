package com.vn.slide1;

import java.util.Scanner;

public class Product {
	static String name;
	static Float price;
	 
	public static void main(String[] args) {
		Float tax = 0.1f;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = (String) scanner.next();
			Float double1 = Float.parseFloat(string);
			Float double2 = double1 * tax;
			System.out.println(double2);
		}
	}
	
}
