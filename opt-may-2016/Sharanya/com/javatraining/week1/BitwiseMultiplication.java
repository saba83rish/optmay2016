package com.javatraining.week1;

public class BitwiseMultiplication {
	  int add(int frst, int scd)	
	{
		while(scd!=0)
		{
			int carry=frst&scd;
			//System.out.println(carry);
			frst=frst^scd;;
			//System.out.println(frst);
			
			scd=carry<<1;
			//System.out.println(scd);
			
			
			
		}
		return(frst);
	//	System.out.println("Sum of two number is"+frst);
		

	}

	

	public static void main(String[] args) {
		int firstNum = Integer.parseInt(args[0]);
		int ScndNum = Integer.parseInt(args[1]);
		int prdct=0;
		BitwiseMultiplication  bitwisemulti=new BitwiseMultiplication();
		for(int i=0;i<ScndNum;i++)
		{
			prdct=bitwisemulti.add(prdct,firstNum);
		}
		
		//System.out.println((firstNum&firstNum)|(ScndNum&ScndNum));
		System.out.println("Product of two numbers is"+prdct);
		
	
}
	}

