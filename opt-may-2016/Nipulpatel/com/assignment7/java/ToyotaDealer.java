
/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Assignment 7
 * Scope : ToyotaDealer  which only can sell Toyota Cars.
 * Scope change : none
 * class :Stand alone class
 ***************************************************************/

package com.assignment7.java;

public class ToyotaDealer {

	public void ToyotaSell(ToyotaDealer t) {
		t.Sell();

	}
// Creating Reference t which invokes a sell() method of  
// Now when ever we invoke ToyotaSell it automatically invoke Sell method.

	public void Sell(){
		System.out.println("Welcome,We have your Toyota dream car");
		
	}
}

