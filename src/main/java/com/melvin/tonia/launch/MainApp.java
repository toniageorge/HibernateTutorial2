package com.melvin.tonia.launch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.melvin.tonia.model.ThreeWheelerVehicle;
import com.melvin.tonia.model.TwoWheelVehicle;
import com.melvin.tonia.model.Vehicle;

public class MainApp {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.setName("car");
		TwoWheelVehicle twoWheel = new TwoWheelVehicle();
		twoWheel.setName("Bike");
		twoWheel.setSteeringHand("SteeringHand");
		ThreeWheelerVehicle threeWheel = new ThreeWheelerVehicle();
		threeWheel.setName("Bike");
		threeWheel.setSteeringWheel("SteeringHand");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(vehicle);
		session.save(threeWheel);
		session.save(twoWheel);
		session.getTransaction().commit();
		session.close();
	}

}
