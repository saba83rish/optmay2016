/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Assignment 7
 * Scope : Vehicle->Car->Honda relationship.
 * Scope change : none
 * class : Sub class of car
 ***************************************************************/
package com.assignment7.java;

public class Honda extends Car {
    
	public String CarName = "Honda" ;
	public String Model = "CRV" ;
	public String EnginType = "2.4-liter i-VTEC" ;
	
	
	@Override
	public String toString() {
		return "Honda [CarName=" + CarName + ", Model=" + Model + ", EnginType=" + EnginType + "]";
	}

	

}
