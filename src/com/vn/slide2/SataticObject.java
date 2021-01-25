package com.vn.slide2;

public class SataticObject {

	static int a = 5;

	static {
		a = a + 5;
		System.out.println("Call static{}...");
	}

	public SataticObject() {
		a = a + 5;
		System.out.println("Call constructor...");
	}

	public static void count() {
		a = a + 5;
		System.out.println("Call method static...");
	}

	public static class InnerClass {

	}

	public static void main(String[] args) {
		SataticObject object = new SataticObject();
		SataticObject.count();
		System.out.println(object.a);
	}

}
