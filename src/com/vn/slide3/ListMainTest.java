package com.vn.slide3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListMainTest {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Tuấn");
		list.add("Nam");
		list.add("Tùng");
		list.add("Hưng");
		list.add("Hoàng");
		list.add("Anh");
		list.add("Anh");
		//Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);
		}
	
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1);
		set1.add(2);
		set1.add(2);
		set1.add(3);
		System.out.println(set1.size());
		
		Set<String> set2 = new HashSet<String>(list);
		System.out.println(set2.size());
		
		System.out.println(list.get(6));
		
	}
}
