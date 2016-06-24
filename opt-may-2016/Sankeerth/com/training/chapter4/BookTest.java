package com.training.chapter4;

public class BookTest {

	public static void main(String[] args) {
		Book b = new Book();
		b.setPrice(24.99);
		
		displayPrice(b);
	}
	
	static void displayPrice(Book b1) {
		double price = b1.getPrice();
		System.out.println(price);
	}

}
