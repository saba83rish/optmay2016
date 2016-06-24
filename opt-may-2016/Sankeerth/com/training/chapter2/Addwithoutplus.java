package com.training.chapter2;

import java.util.Scanner;

public class Addwithoutplus {

	public static void main(String[] args) {

		Scanner sc = new Scanner( System.in );
		System.out.print("Enter the first number: ");
		//input process to take a number
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		
		// First Method
		
		int c = a - (-b);
		System.out.println("The sum of "+a+" and "+b+" is: "+c);
		
		// Second Method
		while(b != 0){
			// c is and of bits in a and b
			int carry = a & b;
			// a XOR b
			a = a ^ b;
			//it shifts carry to one step 
			b = carry << 1;
		}
		System.out.println("The sum is " + a);
		sc.close();
	}
}
