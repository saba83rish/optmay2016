/**
 * 
 */
package com.training.chapter2;

/**
 * @author reddy
 *
 */
public class PrimeNumbers {

	/**
	 * Program to find prime numbers from 1 to 100
	 * This program won't work for numbers greater than 169
	 * As the Question is to find prime numbers from 1 to 100 this can be used
	 */
	public static void main(String[] args) {
		System.out.println("The prime numbers from 1 to 100 \n2 \n3 \n5 \n7");
		for(int i = 8; i <= 100; i++)
		{
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
			{
				System.out.println(i);
			}
		}
		}

	}

