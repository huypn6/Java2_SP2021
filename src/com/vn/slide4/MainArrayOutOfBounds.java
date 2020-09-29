package com.vn.slide4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainArrayOutOfBounds {
	
	public static void main(String[] args) {
		// Array, Collection
		//1. Array
		Integer[] a  = new Integer[] {1,2};
//		System.out.println(a[2]);
		
		//2. 
		List<Integer> b = Arrays.asList(new Integer[] {1,2});
		b.get(2);
		System.out.println("Done!");
	}
}
