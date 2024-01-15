package com.string.practice;

public class StringEqualOperator {

	public static void main(String[] args) {

		String s1 = "QTD";
		String s2 = "QTD";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("**************\n\n");
		
		
		
		String s3 = new String("Testing");
		String s4 = new String("Testing");
		
		System.out.println("new string output");
		
		System.out.println(s3==s4);
		
		System.out.println(s3.equals(s4));
		
		
		StringBuffer sb1 = new StringBuffer("signoff");
		StringBuffer sb2 = new StringBuffer("signoff");
		
		System.out.println("*****************\n\n\n\n");
		
		
		System.out.println("output of string buffer");
		
		System.out.println(sb1==sb2);
		System.out.println(s1.equals(sb2));
	}

}
