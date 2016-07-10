package com.two95.chapter7;
import java.util.*;
public class CustomerSortTest1 {

	public static void main(String[] args) {
		
		TreeSet set=new TreeSet(new LastNameComparator1());
		set.add(new Customer1("Kevin","Santhosh",123456));
		set.add(new Customer1("Bessel","Varghese",753159));
		set.add(new Customer1("Merin","Shaji",456189));
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Customer1 customer=(Customer1)itr.next();
			System.out.println(customer.getLastName()+" "+customer.getFirstName()+" "+customer.getSsn());;
		}
		

	}

}
