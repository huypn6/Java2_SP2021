package com.vn.slide7;

public class EnumAdvandDemo {

	public static void main(String[] args) {

		EnumAdvand enumBasic = EnumAdvand.valueOf("CAR");

		for (EnumAdvand element : EnumAdvand.values()) {
			int result = enumBasic.compareTo(element);
			if (result == 0) {
				System.out.println(element.name());
				System.out.println(element.getSpeed());
				System.out.println(element.getName());
				System.out.println(element.ordinal());
			} else {
				System.out.println("Khong tim thay");
			}
		}

	}

}
