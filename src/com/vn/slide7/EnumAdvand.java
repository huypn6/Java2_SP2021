package com.vn.slide7;

public enum EnumAdvand {
	
	CAR("o to", 1000), 
	TRAIN("tau dien", 9000),
	;

	private final String name;
	private final int speed;

	private EnumAdvand(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public int getSpeed() {
		return speed;
	}
}
