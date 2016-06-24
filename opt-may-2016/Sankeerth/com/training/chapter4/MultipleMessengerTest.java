package com.training.chapter4;

public class MultipleMessengerTest {

	public static void main(String[] args) {
		MultipleMessenger ms = new MultipleMessenger();
		ms.sendMessage("IDIOT");
		ms.sendMessage("BLITHERING ", "IDIOT");
		ms.sendMessage("FUCKING ", "BLITHERING ", "IDIOT ");

	}

}
