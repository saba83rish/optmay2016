package com.training.chapter4;

public class Oracle implements Database {
	
	static {
		System.out.println("Oracle DB Initiated");
	}
	
	public void getConnection() {
		clearCache();
		System.out.println("Got the connection from Oracle DB");
	}
	public void clearCache() {
		System.out.println("Cache Cleared");
	}
	public void createStatement() {
		System.out.println("Create Oracle Statement");
	}
	public void executeQuery() {
		System.out.println("SQL Executed");
	}
	public void shutDown() {
		System.out.println("Oracle Shutdown Completed");
	}

}
