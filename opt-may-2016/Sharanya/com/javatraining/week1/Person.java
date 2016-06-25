package com.javatraining.week1;


public class Person {

	public static void main(String[] args) {
		// Command line arguments

		System.out.println("Enter  you age:" + args[0]);
		
		// casting string argument to integer wapper class
		
		int age = Integer.parseInt(args[0]);
			
		//condition to check age
		if (age >= 18) {
			System.out.println(" Congrats! You are eligible to vote");
		}

	}

}
