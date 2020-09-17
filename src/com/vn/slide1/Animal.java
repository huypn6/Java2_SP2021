package com.vn.slide1;

public abstract class Animal {
	
	public String name;
	private int index;
	String id;
	protected String key;
	
	public Animal() {
		System.out.println("Animal.....");
	}
	
	public Animal(String name, int index, String id, String key) {
		System.out.println("Animal.....");
		this.name = name;
		this.index = index;
		this.id = id;
		this.key = key;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	abstract protected void makeSound();
}	
