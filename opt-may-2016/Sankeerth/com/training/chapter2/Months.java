/**
 * 
 */
package com.training.chapter2;

import java.util.Scanner;
/**
 * @author reddy
 *
 */
public class Months {

	/**
	 * Program to find month if number of month is given
	 */
	public static void main(String[] args) {
		Scanner mt = new Scanner( System.in );
		System.out.print("Enter the month number: ");
		int month = mt.nextInt();
		if (month == 1)
		{
			System.out.println("Your Month is January");
		}
		else if (month == 2)
		{
			System.out.println("Your Month is February");
		}
		else if (month == 3)
		{
			System.out.println("Your Month is March");
		}
		else if (month == 4)
		{
			System.out.println("Your Month is April");
		}
		else if (month == 5)
		{
			System.out.println("Your Month is May");
		}
		else if (month == 6)
		{
			System.out.println("Your Month is June");
		}
		else if (month == 7)
		{
			System.out.println("Your Month is July");
		}
		else if (month == 8)
		{
			System.out.println("Your Month is August");
		}
		else if (month == 9)
		{
			System.out.println("Your Month is September");
		}
		else if (month == 10)
		{
			System.out.println("Your Month is October");
		}
		else if (month == 11)
		{
			System.out.println("Your Month is November");
		}
		else if (month == 12)
		{
			System.out.println("Your Month is December");
		}
		else
		{
			System.out.println("Invalid Entry");
		}
		mt.close();
	}

}
