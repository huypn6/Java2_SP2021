package com.vn.slide3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainList {
	
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(2);
		a.add(1);
		a.add(3);
		a.add(4);
		System.out.println("List............");
//		for (Integer integer : a) {
//			System.out.println(integer);
//		}
		System.out.println("Set............");
		Set<Integer> setB = new HashSet<Integer>();
		setB.add(9);
		setB.add(5);
		setB.add(19);
		setB.add(12);
		setB.addAll(a);
		for (Integer integer : setB) {
			System.out.println(integer);
		}
		System.out.println(setB.contains(12));
		
	}
}
