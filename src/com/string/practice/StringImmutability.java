package com.string.practice;

public class StringImmutability {

	public static void main(String[] args) {

		
		String s1=new String("durga");
		
		String s2=s1.toUpperCase();
		
		String s3=s1.toLowerCase();
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		
		
		
		
		
	}

}