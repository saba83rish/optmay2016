package com.training.chapter2;

import java.util.Scanner;

public class SwapNumbersWithout3rdVariable {

	public static void main(String[] args) {
		// Program to swap two numbers without using a third variable

		Scanner sc = new Scanner( System.in );
		System.out.print("Enter the first number: ");
		//input process to take a number
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Initial numbers are " + a + " and " + b);
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("Swapped numbers are " + a + " and " + b);
		sc.close();
	}

}
