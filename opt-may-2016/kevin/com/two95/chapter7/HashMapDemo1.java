package com.two95.chapter7;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		Customer1 c1=new Customer1("Kevin","Santhosh",123456);
		Customer1 c2=new Customer1("Bessel","Varghese",789456);
		Customer1 c3=new Customer1("Merin","Shaji",753159);
		HashMap map=new HashMap();
		map.put("123456",c1);
		map.put("789456",c2);
		map.put("753159",c3);
		Customer1 customer=(Customer1) map.get("753159");
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+customer.getSsn());

	}

}
