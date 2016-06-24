package com.training.chapter4;

public class CustomerTest {

	public static void main(String[] args) {

		Customer cl = new Customer();
		cl.setFirstName("Sankeerth");
		cl.setLastName("Pinninti");
		cl.setAddress("Maple Street, CA");
		
		String s1 = cl.getFirstName();
		String s2 = cl.getLastName();
		String s3 = cl.getAddress();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
