package com.javatraining.week1;

public class StudentGrade {

	public static void main(String[] args) {
		
		// input from user as command line argument and type casting using integer wrapper class
		
		int marks = Integer.parseInt(args[0]);
		// Conditional || and && operators
		
		if((marks <0)  || (marks >100))
		{
			System.out.println("Invalid marks");
		}
		else if(marks >=0  && marks <=34)
		{
			System.out.println("Fail");
		}
		else if(marks >=35  && marks <=49)
		{
			System.out.println("C Grade");
		}
		else if(marks >=50  && marks <=59)
		{
			System.out.println("B Grade");
		}
		else if(marks >=60  && marks <=79)
		{
			System.out.println("A Grade");
		}
		
		else if(marks >=80  && marks <=100)
		{
			System.out.println("A +Grade");
		}

	}
}
