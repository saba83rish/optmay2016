
/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Assignment 7
 * Scope :assignment :
 * Create a Vehicle->Car->Honda relationship.
                   Car->Toyota
                   Car->Suzuki
                   Vehicle->Truck       
 * Create a CarWash which can wash all 3 types of Cars.
 * Create a ToyotaDealer  which only can sell Toyota Cars.
 * Create a DMV which can register any Vehicles
 * Scope change : none
 * class : Main class (Test class )
 ***************************************************************/

package com.assignment7.java;

public class TestClass {

	public static void main(String[] args) {

		car Ref2 = new Honda();
		Ref2.carwash();// car wash is only for cars
		Ref2.DMVRegistration(); // DMV registration is loosely coupled.
		System.out.println("---------------------------------");

		vehical Ref = new Truck();
		Ref.DMVRegistration();
		System.out.println("---------------------------------");

		car Ref3 = new Toyota();
		Ref3.carwash();
		Ref3.DMVRegistration();
		System.out.println("---------------------------------");

		// if you do not go to the Toyota Dealer then
		Toyota p = new Toyota();
		p.ToyotaSell();

		System.out.println("---------------------------------");
		Toyota p1 = new ToyotaDealer();
		p1.ToyotaSell();

	}

}
