package com.vn.slide1.sub;

import java.io.Serializable;

import com.vn.slide1.Animal;
import com.vn.slide1.AnimalInterface;

public class Dog extends Animal implements AnimalInterface, Serializable {
	
	public Dog() {
		super("Miu Miu");
		System.out.println("anc");
	}
	
	@Override
	public String getName() {
		super.getName();
		System.out.println("Dog get name");
		return name;
	}
	
	public static void main(String[] args) {
		Animal dog = new Dog();
		//dog.name = "Miu Miu";
		//dog.fullName;
		System.out.println(dog.getName());
	}

	@Override
	public void speack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
	
	
}
