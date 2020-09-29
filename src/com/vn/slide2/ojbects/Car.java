package com.vn.slide2.ojbects;

//public class Car {
public class Car {
	
	public static String NAME_OBJECT = "CAR";
	
	static {
		NAME_OBJECT = NAME_OBJECT + " OBJECT";
	}
	
	private static int gear = 5;
	
	static {
		gear++;
	}
	private Integer speed;
	
	public Car(Integer speed) {
		this.speed = speed;
	}

	public Car() {
	}

	public static void main(String[] args) {
		//1. Demo data type
//		String a = "Poly";
//		for (byte element : a.getBytes()) {
//			System.out.println(element);
//		}
		char b = 'P';
		System.out.println((int) b);
		
		//2. Demo Constructor default
		Car c = new Car();
		Car c2 = new Car(2);
		System.out.println(c2.gear);
	}

	public static void method1(Integer speed) {
		System.out.println("Hello");
		System.out.println(NAME_OBJECT);
	}
	
	
}
