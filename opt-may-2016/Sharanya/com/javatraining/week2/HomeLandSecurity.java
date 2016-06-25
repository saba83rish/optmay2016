package com.javatraining.week2;

public class HomeLandSecurity {
	
	public HomeLandSecurity() {

System.out.println("HomeLandSecurity Constructor");
	}


	public String immigrationCheck;
	public String visa;
	
	public void premission()
	{
		System.out.println("approved");
	}
	

	public HomeLandSecurity(String immigrationCheck, String visa) {
		super();
		this.immigrationCheck = immigrationCheck;
		this.visa = visa;
	}
	
	
	

}
