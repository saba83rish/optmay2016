package com.two95.chapter7;
import java.util.*;
public class LastNameComparator1 implements Comparator {
	public int compare(Object o1,Object o2){
		Customer1 c1=(Customer1) o1;
		Customer1 c2=(Customer1) o2;
		int index=c1.getLastName().compareTo(c2.getLastName());
		return index;
		
	}

}
