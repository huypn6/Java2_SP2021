package com.vn.slide1.sub;

import com.vn.slide1.Animal;
import com.vn.slide1.interfaces.MyInterface;

public class Dog extends Animal implements MyInterface {
	
	private String newVariable;
	
	public Dog() {
		super();
	}
	
	public Dog(String name, int index, String id, String key, String newVariable) {
		super(name, index, id, key);
		this.newVariable = newVariable;
	}

	public static void main(String[] args) {
		Dog subClass = new Dog();
		subClass.key = "2";
	}
	
	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return super.getKey();
	}
	
	@Override
	public void makeSound() {
		System.out.println("Dog make sound: Go go!!");
	}

	@Override
	public void method1() {
		
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}
