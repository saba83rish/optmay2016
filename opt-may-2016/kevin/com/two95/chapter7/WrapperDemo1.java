package com.two95.chapter7;
import java.lang.Integer;
public class WrapperDemo1 {

	public static void main(String[] args) {
		int i=10;
		Integer ii=new Integer(i);
		add(ii);

	}
	static void add(Integer object){
		int val=object.intValue()+5;
		System.out.println(val);
	}

}
