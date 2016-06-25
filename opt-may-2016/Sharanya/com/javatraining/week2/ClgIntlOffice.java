package com.javatraining.week2;

public class ClgIntlOffice  extends HomeLandSecurity{
	public int ieltsScore;
	public double gpa;
	
	public ClgIntlOffice() {
		super();
		System.out.println("College International Office Default Constructor");
	}
	
	public ClgIntlOffice(int ieltsScore, double gpa,String immigrationCheck,String visa) {
		super(immigrationCheck, visa);
		this.ieltsScore = ieltsScore;
		this.gpa = gpa;
	}

	
	

}
