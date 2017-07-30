package com.melvin.tonia.model;

import javax.persistence.Entity;

@Entity
public class ThreeWheelerVehicle extends Vehicle {
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

}
