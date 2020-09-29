package com.vn.slide3;

import java.util.Arrays;

public class MainArray {
	
	public static void main(String[] args) {
		int a[] = new int[2];
		a[0] = 1;
		a[1] = 2;
		//a[2] = 3; error
		
		//them moi
		int b[] = Arrays.copyOf(a, 3);
		b[2] = 3;
		for (int i : b) {
			System.out.println(i);
		}
		
	}
	
}
