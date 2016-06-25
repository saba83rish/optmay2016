package com.javatraining.week1;

public class SwapTwoNum {

	public static void main(String[] args) {
		int numOne  = Integer.parseInt(args[0]);
		int  numTwo= Integer.parseInt(args[1]);
		System.out.println("Before Swapping");
		
		numOne=numOne+numTwo;
		numTwo=numOne-numTwo;
		numOne=numOne-numTwo;
		
		System.out.println("After Swapping "+numOne+" "+numTwo);
		
		
		
		
	}

}
