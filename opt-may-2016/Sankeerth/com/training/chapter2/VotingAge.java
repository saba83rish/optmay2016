/**
 * 
 */
package com.training.chapter2;

import java.util.Scanner;


/**
 * @author reddy
 *
 */
public class VotingAge {

	/**
	 * Program to verify if a person is eligible to vote
	 */

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner( System.in );
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		if(age >= 18)
				{
					System.out.println("Congrats!! You are eligible to Vote");
				}
		else
		{
			System.out.println("You are not eligible to vote");
		}
		sc.close();
	}
}
