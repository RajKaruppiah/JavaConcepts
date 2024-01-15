package com.string.practice;

public class StringMethods {

	public static void main(String[] args) {

		String s = "ababab";
		
//		System.out.print(s.repeat(2));
		
		System.out.println(s.replace('a', 'b'));
		
		System.out.println(s.substring(2,5));  // from index 3 to 4
		
		
		
		String s1 = "durga";
		
		System.out.println(s1.indexOf('d'));
		
		System.out.println(s.lastIndexOf('a'));
		
		System.out.println(s.toUpperCase());
		
		String s2="Rajasekaran ";
		
		System.out.println(s2.length());
		System.out.println(s2.trim().length());
		
		String s3 = "Durga Soft";
		
		System.out.println(s3.length());
		
		System.out.println(s3.trim().length());
		
		
		
		
		
		
		
	}

}
