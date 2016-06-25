package com.javatraining.week1;

public class PrimeNumbers 
{

	public static void main(String[] args) 
	{
		int count = 0;
		for (int i = 1; i <= 100; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				if (i % j == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.println(i);
			}
			count = 0;

		}

	}
}
