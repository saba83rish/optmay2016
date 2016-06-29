
/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Assignment 7(Referential Polymorphism)
 * Scope : CarWash which can wash all 3 types of Cars.
 * Scope change : none
 * class : Sub class of vehicle 
 ***************************************************************/
package com.assignment7.java;

public class Car extends Vehicle {

	public void carWash() {

		System.out.println("You can go to the carwash");
	}

	public String CarName = "";
	public String Model = "";
	public String EnginType = "";

  	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		this.CarName = carName;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getEnginType() {
		return EnginType;
	}

	public void setEnginType(String enginType) {
		this.EnginType = enginType;
	}

	public String getCarinfo() {
		return (CarName);
	}

	@Override
	public String toString() {
		return "Car [CarName=" + CarName + ", Model=" + Model + ", EnginType=" + EnginType + "]";
	}


}
