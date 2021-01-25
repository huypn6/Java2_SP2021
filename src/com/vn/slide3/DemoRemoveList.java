package com.vn.slide3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoRemoveList {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(new Integer[] { 4, 3, 5, 7, 6, 4 });
		ArrayList<Integer> integers2 = new ArrayList<Integer>(integers);
		integers2.remove(3);
		integers2.remove(new Integer(4));
		System.out.println(integers2);

	}

}
