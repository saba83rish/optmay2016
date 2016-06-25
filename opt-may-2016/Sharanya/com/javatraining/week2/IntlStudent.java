package com.javatraining.week2;

public class IntlStudent extends ClgIntlOffice  {
	
	public int studentID;
	public IntlStudent() {
		super();
		System.out.println("International Student Default Constructor");
	}
	
	

	public IntlStudent(int studentID, int ieltsScore, double gpa, String immigrationCheck, String visa) {
		super(ieltsScore, gpa, immigrationCheck, visa);
		this.studentID = studentID;
		System.out.println("\nStudent Details"+"\nStudent ID:"+studentID+"\nIELTS Score:"+ieltsScore+"\nGPA:"+gpa+"\nImmigration Check:"+immigrationCheck+"\nVISA:"+visa);
	
	}
	
	

	public static void main(String[] args) {
		
		IntlStudent intlStd=new IntlStudent();
		
		IntlStudent intlstudent =new IntlStudent(112345678,6,3.7,"Cleared","F1");
	}



	

}
