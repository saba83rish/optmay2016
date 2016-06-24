/**
 * 
 */
package com.training.chapter2;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class Marks {

	/**
	 * Program to find the grade of a student
	 */
	public static void main(String[] args) {
		Scanner mk = new Scanner( System.in );
		System.out.print("Enter your marks: ");
		int marks = mk.nextInt();
		if (marks < 0 || marks > 100)
		{
			System.out.println("Your Marks are invalid");
		}
		else if (marks > 0 && marks < 35)
		{
			System.out.println("You received an F");
		}
		else if (marks > 34 && marks < 50)
		{
			System.out.println("You received a C Grade");
		}
		else if (marks > 49 && marks < 60)
		{
			System.out.println("You received a B Grade");
		}
		else if (marks > 59 && marks < 80)
		{
			System.out.println("You received an A Grade");
		}
		else if (marks > 79 && marks < 101)
		{
			System.out.println("You received an A+ Grade");
		}
		mk.close();

	}

}
