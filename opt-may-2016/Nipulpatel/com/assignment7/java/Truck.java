package com.assignment7.java;

public class Truck extends Vehicle {

	public String TruckName = "Chevrolet";
	public String TruckModel = "SILVERADO 1500";
	public String TruckEnginType = " 4.3L FlexFuel EcoTec3 V6";

	@Override
	public String toString() {
		return "Truck [TruckName=" + TruckName + ", TruckModel=" + TruckModel + ", TruckEnginType=" + TruckEnginType
				+ "]";
	}

	Truck() {
		System.out.println("This is a Truck");

	}

}
