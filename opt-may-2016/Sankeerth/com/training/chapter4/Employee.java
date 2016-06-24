package com.training.chapter4;

public class Employee {
	
	private String EmployeeName;
	private String EmployeeNumber;
	private String EmployeeStatus;
	
	Employee(String name, String number, String status){
		EmployeeName = name;
		EmployeeNumber = number;
		EmployeeStatus = status;
	}
	
	public void setEmployeeName(String name){
		EmployeeName = name;
	}
	public void setEmployeeNumber(String number){
		EmployeeNumber = number;
	}
	public void setEmployeeStatus(String status){
		EmployeeStatus = status;
	}
	
	public String getEmployeeName() {
		return EmployeeName;
	}
	public String getEmployeeNumber() {
		return EmployeeNumber;
	}
	public String getEmployeeStatus() {
		return EmployeeStatus;
	}

}
