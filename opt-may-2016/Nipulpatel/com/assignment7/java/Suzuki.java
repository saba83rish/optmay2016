
/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Assignment 7
 * Scope : Vehicle->Car->Suzuki relationship.
 * Scope change : none
 * class : Sub class of car
 ***************************************************************/
package com.assignment7.java;

public class Suzuki extends Car {

	public String CarName = "Suzuki";
	public String Model = "SX4";
	public String EnginType = "1.5 L M15A I4";

	@Override
	public String toString() {
		return "Suzuki [CarName=" + CarName + ", Model=" + Model + ", EnginType=" + EnginType + "]";
	}

}
