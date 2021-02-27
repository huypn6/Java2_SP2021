package com.vn.slide8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericType<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		//1. Custom generic
		GenericType<Integer> genericType = new GenericType<Integer>();
		genericType.setT(6);
		System.out.println(genericType.getT());
		
		GenericType<String> genericType2 = new GenericType<String>();
		genericType2.setT("Day la vi du ve generic");
		System.out.println(genericType2.getT());
		
		//2. Eg Map - K , V
		HashMap<Integer, String> mapStudent = new HashMap<Integer, String>();
		mapStudent.put(1, "Hùng");
		mapStudent.put(2, "Hưng");
		mapStudent.put(3, "Tùng");
		
		//3. List - Element
		List<Double> list = new ArrayList<Double>();
		list.add(0, 1.0);
		list.add(1, 1.4343);

	}
}
