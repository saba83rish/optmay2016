package com.javatraining.week1;

public class AppleCom {
	
	String iOS;
	
	 public void siri()
	{
		System.out.println("Hey SIRI");
	}
	


}
class IphoneSix extends AppleCom{
	
	public void threeDTouch()
	{
		System.out.println("iphone 6 new feature 3 D touch");
	}
	public static void main(String[] args) {
		IphoneSix iphonesix= new IphoneSix();
		iphonesix.iOS="iOS9.3.2";
		iphonesix.siri();
		iphonesix.threeDTouch();
		
		
		
	}
	
}

