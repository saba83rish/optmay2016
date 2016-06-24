package com.training.chapter4;

public interface Database {
	
	public void getConnection();
	public void createStatement();
	public void executeQuery();
	public void shutDown();

}
