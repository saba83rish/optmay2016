package com.training.chapter2;

import java.util.Scanner;

public class DaysInAMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		//inputs a month
		System.out.print("Enter a month: ");
		String month = sc.nextLine();
		int days;
		switch (month) {
		//checks for special cases other than months with 31 days
		case "February": days = 29;
			break;
		case "April": days = 30;
			break;
		case "June": days = 30;
			break;
		case "September": days = 30;
			break;
		case "November": days = 30;
			break;
		default: days = 31; //prints every other month as 31 days
			break;
		}
		System.out.println("There are " + days + " days in "+ month + "." );
		sc.close();
	}

}
