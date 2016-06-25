package com.javatraining.week1;

public class NumberPattern {

	public static void main(String[] args) {
		// outer for loop
		for (int i = 1; i <= 5; i++) {

			// inner for loop
			for (int j = 1; j <= i; j++)

			{
				System.out.print(j);

			}
			System.out.println("\n");
		}
	}

}
