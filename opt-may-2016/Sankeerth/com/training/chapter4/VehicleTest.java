package com.training.chapter4;

public class VehicleTest {
	/*"This is a test class of vehicle class which is the
	parent class of "cars" and "bike"*/

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle("XDA89D", "Grey");
		v.end();
		Cars c = new Cars("FD32T", "British Racing Green", "Jaguar XF", 5);
		c.end();
		SportsCar s = new SportsCar("JH76F", "Celeste", "Lamborghini Aventador", 2, 690);
		s.end();
		Bike b = new Bike("VC4343", "Vivid Black", "Harley Davidson", "SuperLow", "V-Twin");
		b.end();
	}

}
