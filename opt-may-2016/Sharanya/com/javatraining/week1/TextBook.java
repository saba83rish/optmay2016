package com.javatraining.week1;

 class Calculator {
	// Instance variable
	double result = 0;
	// Instance methods
	public void sum(int i, int k) {
	result = i + k;
	}
	public void multiply(int i, int k) {
	result = i * k;
	}
	}

public class TextBook {

	public static void main(String[] args) {
		 System.out.println("Binary eqivalent of 100 = " + Integer.toString(100, 2));
         System.out.println("Octal eqivalent of 100 = " + Integer.toString(100, 8));
         System.out.println("Decimal eqivalent of 100 = " + Integer.toString(100, 10));
         System.out.println("Hexadecimal eqivalent of 100 = " + Integer.toString(100, 16));
		}

	

}
