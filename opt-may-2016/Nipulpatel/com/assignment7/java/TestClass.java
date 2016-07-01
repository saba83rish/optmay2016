
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
 * Result:
-------------Honda-----------------
Honda [CarName=Honda, Model=CRV, EnginType=2.4-liter i-VTEC]
Car Wash is Ready for Honda CRV
Your Vehicle is authorized for  Registration
-------------Toyota-----------------
ToyotaDealer [CarName=Toyota, Model=RAV4, EnginType=2.5 L 4-cylinder]
Welcome,We have your Toyota dream car
Car Wash is Ready for Toyota RAV4
Your Vehicle is authorized for  Registration
-------------Suzuki-----------------
Suzuki [CarName=Suzuki, Model=SX4, EnginType=1.5 L M15A I4]
Car Wash is Ready for Suzuki SX4
Your Vehicle is authorized for  Registration
-------------Truck--------------------
This is a Truck
Truck [TruckName=Chevrolet, TruckModel=SILVERADO 1500,[
 TruckEnginType= 4.3L FlexFuel EcoTec3 V6]
Your Vehicle is authorized for  Registration
---------------------------------------
***************************************************************/

package com.assignment7.java;

public class TestClass {

	public static void main(String[] args) {

		Car Ref2 = new Honda();
		System.out.println("-------------" + Ref2.getCarName() + "-----------------");
		System.out.println(Ref2.toString());
		Ref2.carWash();// car wash is only for cars
		Ref2.DmvRegistration(); // DMV registration is loosely coupled.

		Car Ref3 = new Toyota();
		System.out.println("-------------" + Ref3.getCarName() + "-----------------");
		// by only changing a reference(same method ,same name) we can Access
		// different class.
		System.out.println(Ref3.toString());
        // Ref3.Toyotasell(); is not possible. throwing error.its tightly coupled.
		// you should go to the Toyota Dealer then.
		ToyotaDealer p = new ToyotaDealer();
		p.ToyotaSell(new ToyotaDealer());
		//p.ToyotaSell(p); This will also print same result.
		//created ToyotaSell method which invokes Sell method .
		//Now by creating a new Toyota object it can invokes ToyotaSell method.
		Ref3.carWash();//Ref3 is for Toyota class
		Ref3.DmvRegistration();
		
		
		Car Ref4 = new Suzuki();
		System.out.println("-------------" + Ref4.getCarName() + "-----------------");
		System.out.println(Ref4.toString());
		Ref4.carWash();// car wash is only for cars
		Ref4.DmvRegistration(); // DMV registration is loosely coupled.
		System.out.println("-------------Truck--------------------");

		Vehicle Ref = new Truck();
		System.out.println(Ref.toString());
		Ref.DmvRegistration();
		System.out.println("---------------------------------------");
	}

}
