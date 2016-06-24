package com.training.chapter4;

public class Vehicle {
	//This is the Parent Class of sub classes "Cars" and "Bike"
	//"Cars" has a subclass of "SportsCar"
	public String VehicleNumber;
	public String VehicleColor;
	
	public Vehicle(){
	
	}
	public Vehicle(String number, String color) {
		super();
		VehicleNumber = number;
		VehicleColor = color;
		System.out.println("Vehicle Number is: " + number);
		System.out.println("Color: " + color);
	}
	public void end(){
		System.out.println("===========================");
	}
}
