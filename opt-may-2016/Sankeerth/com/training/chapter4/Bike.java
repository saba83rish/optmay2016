package com.training.chapter4;

public class Bike extends Vehicle{
	//This is the child class of "Vehicle" Class

	public String BikeName;
	public String BikeModel;
	public String Engine;
	public Bike() {
		super();
	}

	public Bike(String number, String color, String name, String model, String engine) {
		super(number, color);
		BikeName = name;
		BikeModel = model;
		Engine = engine;
		System.out.println("The name of the bike is: " + BikeName);
		System.out.println(BikeName + ". Model: " + BikeModel);
		System.out.println(BikeModel + " has a " + Engine + " engine.");
	}
	

}
