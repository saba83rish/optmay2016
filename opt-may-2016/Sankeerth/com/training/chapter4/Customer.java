package com.training.chapter4;

public class Customer {

	private String firstName;
	private String lastName;
	private String address;
	
	public void setFirstName(String fname){
		firstName = fname;
	}
	public void setLastName(String lname){
		lastName = lname;
	}
	public void setAddress(String add){
		address = add;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getAddress(){
		return address;
	}
}
