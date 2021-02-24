package com.vn.slide7;

public class EnumBasicDemo {

	public static void main(String[] args) {

		EnumBasic enumBasic = EnumBasic.valueOf("CAR");

		for (EnumBasic element : EnumBasic.values()) {
			int result = enumBasic.compareTo(element);
			if (result == 0) {
				System.out.println(element.name());
				System.out.println(element.ordinal());
			} else {
				System.out.println("Khong tim thay");
			}
		}

	}

}
