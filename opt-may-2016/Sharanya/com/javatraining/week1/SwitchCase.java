package com.javatraining.week1;

public class SwitchCase {

	public static void main(String[] args) {
		/*command Line arguments from user as input*/
		String num = args[0];
		System.out.println("Enter a number :"+args[0]);
		//Switch case Demo
		switch (num) {
		case "1":
			System.out.println("January");
			break;
		case "2":
			System.out.println("Febuary");
			break;
		case "3":
			System.out.println("March");
			break;
		case "4":
			System.out.println("April");
			break;
		case "5":
			System.out.println("May");
			break;
		case "6":
			System.out.println("June");
			break;
		case "7":
			System.out.println("July");
			break;
		case "8":
			System.out.println("August");
			break;
		case "9":
			System.out.println("September");
			break;
		case "10":
			System.out.println("October");
			break;
		case "11":
			System.out.println("November");
			break;

		case "12":
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid entry");
		}

	}

}
