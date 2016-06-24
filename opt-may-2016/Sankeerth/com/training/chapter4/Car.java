package com.training.chapter4;

public class Car {

	private String carMake;
	private String carName;
	private String registrationNumber;
	
	Car(String make, String name, String number) {
		carMake = make;
		carName = name;
		registrationNumber = number;
	}
	
	public void setCarName(String name){
		carName = name;
	}
	public void setCarMake(String make){
		carMake = make;
	}
	public void setRegistrationNumber(String number){
		registrationNumber = number;
	}
	
	public String getCarName() {
		return carName;
	}
	public String getCarMake() {
		return carMake;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	
}
