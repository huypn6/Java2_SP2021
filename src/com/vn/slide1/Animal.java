package com.vn.slide1;

public abstract class Animal {

	public String name;
	private int total;
	String alias;
	protected String fullName;

	// hàm tạo - constructor
	public Animal() {

	}

	public Animal(String name) {
		this.name = name;
	}

	// protected method
	public String getName() {
		System.out.println("Parent get name");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	abstract public void speack();
}
