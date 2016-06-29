
/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Assignment 7(Referential Polymorphism)
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

		Car Ref2 = new Honda();
		System.out.println(Ref2.toString());
		Ref2.carWash();// car wash is only for cars
		Ref2.DMVRegistration(); // DMV registration is loosely coupled.
		System.out.println("---------------------------------");

		Vehicle Ref = new Truck();
		System.out.println(Ref.toString());
		Ref.DMVRegistration();
		System.out.println("---------------------------------");

		Car Ref3 = new ToyotaDealer();
		System.out.println(Ref3.toString());
		Ref3.carWash();
		Ref3.DMVRegistration();
		//Ref3.Toyotasell(); is not possible. throwing error.its tightly coupled.
		// you should go to the Toyota Dealer then
		ToyotaDealer p = new ToyotaDealer();
		p.ToyotaSell();
		System.out.println("---------------------------------");
		
		Car Ref4 = new Suzuki();
		System.out.println(Ref4.toString());
		Ref4.carWash();// car wash is only for cars
		Ref4.DMVRegistration(); // DMV registration is loosely coupled.
		System.out.println("---------------------------------");


	}

}
