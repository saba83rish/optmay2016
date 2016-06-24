/**
 * 
 */
package com.training.chapter2;

/**
 * @author reddy
 *
 */
public class OddNumbers {

	/**
	 * Program to print Odd Numbers from 1 to 100
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) 
			//initializing the for loop for numbers 1 to 100
		{
			if (i % 2 != 0)
			// if statement to check if a number is not divisible by 2
			{
				System.out.println(i);
				//printing the odd numbers
			}
		}

	}

}
