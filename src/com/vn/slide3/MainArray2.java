package com.vn.slide3;

public class MainArray2 {
	
	public static void main(String[] args) {
		int a[][] = new int[][]{
			{4, 5, 6},
			{7, 8, 9},
			{10, 11, 12, 13},
		};
		for (int[] is : a) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
	}
	
}
