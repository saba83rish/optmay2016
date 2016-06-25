package com.javatraining.week2;

public class VasaviClg extends University {
	

	public static void main(String[] args) {
		VasaviClg vasaviclg=new VasaviClg();
		vasaviclg.attendence();
		University university=new VasaviClg();
		university.attendence();
		university.display();
		
		
		

	}

	@Override
	void attendence() {

		System.out.println("Attendence should be above 70 ");
		
	}

}
