package com.javatraining.week1;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 2, 18, 10, 23, 34, 5 };

		// System.out.println(a.length);

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}//displaying Sorted Array
		for (int k = 0; k <= a.length - 1; k++) {
			System.out.print(" " + a[k] + " ");
		}

	}

}
