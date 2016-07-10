package com.two95.chapter7;

import java.util.StringTokenizer;

public class StringTokenizerDemo1 {

	public static void main(String[] args) {
		String str="Kevin,12345,K,753159,KEVIN";
		StringTokenizer st=new StringTokenizer(str,",");
		while(st.hasMoreTokens()){
			String token=st.nextToken();
			System.out.println(token);
		}

	}

}
