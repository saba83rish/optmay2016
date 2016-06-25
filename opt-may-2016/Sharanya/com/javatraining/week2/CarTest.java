package com.javatraining.week2;

public class CarTest {

	public static void main(String[] args) {
		EcancapsulationCar ecancapsulationcar=new EcancapsulationCar();
		ecancapsulationcar.setCarModel(2012);
		ecancapsulationcar.setSpeed(35);
		System.out.println("Car model"+ecancapsulationcar.getCarModel());
		System.out.println("Car Speed"+ecancapsulationcar.getSpeed());

	}

}
