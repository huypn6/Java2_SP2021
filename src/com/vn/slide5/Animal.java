package com.vn.slide5;

import java.io.Serializable;

public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String id;
	private String description;

	public Animal(String name, String id, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
