package com.vn.slide8;

public class GenericTypeNumber<T extends Number> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	private void compare(GenericTypeNumber<?> e) {
		double a = e.getT().doubleValue();
		double b = this.getT().doubleValue();
		System.out.println(a==b);
	}

	public static void main(String[] args) {
		//1. Custom generic
		GenericTypeNumber<Integer> genericType = new GenericTypeNumber<Integer>();
		genericType.setT(6);
		System.out.println(genericType.getT());
		
		GenericTypeNumber<Double> genericType2 = new GenericTypeNumber<Double>();
		genericType2.setT(6.0);
		System.out.println(genericType.getT());
		
		genericType2.compare(genericType);

	}
}
