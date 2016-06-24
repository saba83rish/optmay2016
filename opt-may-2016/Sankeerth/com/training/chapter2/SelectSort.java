package com.training.chapter2;

public class SelectSort {
	
	public static void main(String[] args)
	{
		int [] list = new int[20];
		
		for (int k=0; k < list.length; k ++)
		{
			list[k] = (int)(Math.random() * 10000);
		}
		printList("Original List:",list);
		selectSort(list);
		printList("Sorted List:",list);
		
	}
	
	
	static void printList(String s, int[] a)
	{
		System.out.println(s);
		
		for(int k=0; k<a.length; k++)
		{
			if ((k % 10) == 0)
				System.out.println();
			System.out.println(a[k] + " ");
		}
		System.out.println("\n\n");
	}
	
	static void selectSort(int[] a)
	{
		for(int k = 0; k <= a.length - 2; k++)
		{
			int minIndex = k;
			for (int j = k + 1; j < a.length; j++)
			{
				if (a[j] < a[minIndex])
					minIndex = j;
			}
			
			int temp = a[k];
			a[k] = a[minIndex];
			a[minIndex] = temp;
		}
	}
}
