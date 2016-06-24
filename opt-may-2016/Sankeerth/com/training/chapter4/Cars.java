package com.training.chapter4;

public class Cars extends Vehicle{
	/*This is the Child Class of "Cars" Class and further has a
	 * child class of "SportsCar" 
	 */
	
	public String Name;
	public int Capacity;
	public Cars() {
		
	}
	public Cars(String number, String color, String name, int capacity) {
		super(number, color);
		Name = name;
		Capacity = capacity;
		System.out.println("The Car is: " + name);
		System.out.println("Maximum seating capacity of " + name + " is: " + capacity);
		
	}
	

}
