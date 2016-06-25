package com.javatraining.week1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		/*
		 * int i=34; System.out.println(34%10); System.out.println(34/10);
		 */
		int armNum = Integer.parseInt(args[0]);
		int cpArmNum = armNum;
		int sum = 0;

		while (cpArmNum != 0) {
			int reminder = cpArmNum % 10;

			sum = sum + reminder * reminder * reminder;
			cpArmNum = cpArmNum / 10;

		}

		if (sum == armNum) {
			System.out.println(armNum + " is Armstrong Number");
		} else {

			System.out.println(armNum + "is Not a armstrong Number");
		}

	}

}
