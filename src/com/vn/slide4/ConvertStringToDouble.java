package com.vn.slide4;

public class ConvertStringToDouble {

	public static void main(String[] args) {
		String text = "sab";
		try {
			double diem = Double.parseDouble(text);
			System.out.println(diem);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
