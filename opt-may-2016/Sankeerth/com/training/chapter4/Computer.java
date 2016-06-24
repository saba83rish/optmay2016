package com.training.chapter4;

public class Computer {
	
	int ramSize;
	int hardDiskSize;
	String os;
	
	public Computer(){
		
		ramSize = 512;
		hardDiskSize = 40;
		os = "Windows XP Home";
	}
	
	public Computer(int rs){
		
		ramSize = rs;
		hardDiskSize = 40;
		os = "Windows XP Home";
	}
	
	public Computer(int rs, int hd){
		
		ramSize = rs;
		hardDiskSize = hd;
		os = "Windows X";
	}
	
	public Computer(int rs, int hd, String os1){
		ramSize = rs;
		hardDiskSize = hd;
		os = os1;
	}

	public void compute(){
		System.out.println("Computing with " + os + " with " + ramSize
				+ "MB RAM and " + hardDiskSize + "GB hard disk");
	}
}
