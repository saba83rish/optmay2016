package com.two95.chapter7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {

	public static void main(String[] args){
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		String formattedDate=sdf.format(new Date());
		System.out.println(formattedDate);
		sdf=new SimpleDateFormat("MM/dd/yyyy");
		try{
		Date d=sdf.parse("07/09/2016");
		System.out.println(d);
		}
		catch(ParseException pe){
			System.out.println("Unable to parse Date");
		}

}
}
