package com.javatraining.week1;

public class BitwiseOprAdd {

	public static void main(String[] args) {
		int firstNum = Integer.parseInt(args[0]);
		int ScndNum = Integer.parseInt(args[1]);
		
		//System.out.println((firstNum&firstNum)|(ScndNum&ScndNum));
		
				
		while(ScndNum!=0)
		{
			int carry=firstNum&ScndNum;
			System.out.println(carry);
			firstNum=firstNum^ScndNum;;
			System.out.println(firstNum);
			
			ScndNum=carry<<1;
			System.out.println(ScndNum);
			
			
			
		}
		System.out.println("Sum of two number is"+firstNum);


	}

}
