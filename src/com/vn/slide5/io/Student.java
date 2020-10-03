package com.vn.slide5.io;

import java.io.Serializable;

public class Student implements Serializable {

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}

	private String id;
	private String name;
 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
