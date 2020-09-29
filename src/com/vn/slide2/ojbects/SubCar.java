package com.vn.slide2.ojbects;

public class SubCar extends Car {

	public SubCar() {
		super(5);
		super.method1(2);
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		SubCar subCar = new SubCar();
		System.out.println(subCar.NAME_OBJECT);
//		subCar.method1(speed);
		Car.method1(3);
	}
	
}
