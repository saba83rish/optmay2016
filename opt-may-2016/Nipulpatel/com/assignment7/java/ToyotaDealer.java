/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Assignment 7
 * Scope : ToyotaDealer  which only can sell Toyota Cars.
 * Scope change : none
 * class : Sub class of car 
 ***************************************************************/
package com.assignment7.java;

public class ToyotaDealer extends Car {

	public String CarName = "Toyota";
	public String Model = "RAV4";
	public String EnginType = "2.5 L 4-cylinder";

	@Override
	public String toString() {
		return "ToyotaDealer [CarName=" + CarName + ", Model=" + Model + ", EnginType=" + EnginType + "]";
	}

	ToyotaDealer() {
		System.out.println("This is Toyota Dealer");

	}

	public void ToyotaSell() {

		System.out.println("You can buy a great car with us");
	}

}
