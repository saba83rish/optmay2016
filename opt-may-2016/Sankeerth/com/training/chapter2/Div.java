package com.training.chapter2;

import java.util.Scanner;

public class Div {
	// Program to divide two numbers without using '/'

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		//input two numbers
		System.out.print("Enter the first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double b = sc.nextDouble();
		double c = a * Math.pow(b, -1); // division is done by c = a * (b ^ -1)
		System.out.println(a + " divided by " + b + " is " + c);
		sc.close();
	}

}
