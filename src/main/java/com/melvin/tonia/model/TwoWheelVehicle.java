package com.melvin.tonia.model;

import javax.persistence.Entity;

@Entity
public class TwoWheelVehicle extends Vehicle {
	private String steeringHand;

	public String getSteeringHand() {
		return steeringHand;
	}

	public void setSteeringHand(String steeringHand) {
		this.steeringHand = steeringHand;
	}

}
