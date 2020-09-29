package com.vn.slide4;

public class DetailException {

	public static void main(String[] args) {
		String[] a = null;
		try {
			for (String string : a) {
				Integer.parseInt(string);
			}
		} catch (NumberFormatException e) {
			System.out.println("Format");
		} catch (NullPointerException e) {
			System.out.println("null");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
