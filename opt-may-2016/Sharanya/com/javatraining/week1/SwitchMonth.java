package com.javatraining.week1;

public class SwitchMonth {

	public static void main(String[] args) {
		String month = args[0];
		switch (month) {
		case "January":
			System.out.println("January 31 days");
			break;
		case "Febuary":
			System.out.println("Febuary 28 or 29 days");
			break;
		case "March":
			System.out.println("March 31 days");
			break;
		case "April":
			System.out.println("April 30");
			break;
		case "May":
			System.out.println("May 31 days");
			break;
		case "June":
			System.out.println("June 30 days");
			break;
		case "July":
			System.out.println("July 31 days");
			break;
		case "August":
			System.out.println("August 31 days");
			break;
		case "September":
			System.out.println("September 30 days");
			break;
		case "October":
			System.out.println("October 31 days");
			break;
		case "November":
			System.out.println("November 30 days");
			break;

		case "December":
			System.out.println("December 31 days");
			break;
		default:
			System.out.println("Invalid entry");

		}

	}
}
