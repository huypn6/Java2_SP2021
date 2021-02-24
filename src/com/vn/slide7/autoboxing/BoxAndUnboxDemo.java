package com.vn.slide7.autoboxing;

import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class BoxAndUnboxDemo {
	
	public static void main(String[] args) {
		//1. Boxing
		Integer integerObj = Integer.valueOf(2); //=> BOXING
		
		Math.sqrt(4);
		sqrt(4);
		
		//2. Unboxing
		int valueInt = integerObj.intValue();
		System.out.println(valueInt);
		
		//1. Autoboxing
		Integer autoIntegerObj = 2;  // Integer.valueOf(2)
		int b = 4;
		Integer autoIntegerObj2 = b; // Integer.valueOf(b)
		int c = 6;
		Integer autoIntegerObj3 = new Integer(c); // Not - Autoboxing
		
		//2. AutoUnboxing
		int valueInt1 = autoIntegerObj; // autoIntegerObj.intValue();
	}
}
