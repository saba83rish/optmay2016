package com.training.chapter4;

public class SportsCar extends Cars{
	//This class is a Child class of "Cars" class

	private int Bhp;
	public SportsCar() {
		super();
	}

	public SportsCar(String number, String color, String name, int capacity, int bhp) {
		super(number, color, name, capacity);
		Bhp = bhp;
		System.out.println("The " + name + " has a horsepower of " + Bhp + "bhp.");
	}
	
	
}
