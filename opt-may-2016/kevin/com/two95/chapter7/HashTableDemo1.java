package com.two95.chapter7;

import java.util.Hashtable;

public class HashTableDemo1 {

	public static void main(String[] args) {
		Customer1 c1=new Customer1("Kevin","Santhosh",123456);
		Customer1 c2=new Customer1("Bessel","Varghese",789456);
		Customer1 c3=new Customer1("Merin","Shaji",753159);
		Hashtable table=new Hashtable();
		table.put("123456",c1);
		table.put("789456",c2);
		table.put("753159",c3);
		Customer1 customer=(Customer1) table.get("753159");
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+customer.getSsn());
	}

}
