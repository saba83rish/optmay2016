package com.training.chapter4;

public class SAPMessenger extends MainframeMessenger {
	
	public void sendMessage(String message){
		
		formatMessage(message);
		System.out.println("Message" + message + " sent to SAP system.");
	}

}
