package com.training.chapter4;

public class OverwritingTest {

	public static void main(String[] args) {
		
		MainframeMessenger m1 = new MainframeMessenger();
		m1.sendMessage("Hello");
		
		SAPMessenger s1 = new SAPMessenger();
		s1.sendMessage("BOLO");

	}

}
