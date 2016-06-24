package com.training.chapter4;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		Computer c2 = new Computer(256);
		Computer c3 = new Computer(512, 40);
		Computer c4 = new Computer(1024, 80, "Windows X");
		
		c1.compute();
		c2.compute();
		c3.compute();
		c4.compute();

	}

}
