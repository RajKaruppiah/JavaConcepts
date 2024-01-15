package com.string.practice;

public class StringOperator {

	public static void main(String[] args) {

		String s4 = "you cannot change me";
		String s5 = "you cannot" + " change me";
		
		System.out.println(s5);
		
		System.out.println(s4 == s5);
		
		String s6 = "you cannot";
		String s7= s6 + " change Me";
		System.out.println(s7);
		System.out.println(s4==s7);
		
		final String s8="you cannot";
		
		String s9 = s8+"change me";
		
		System.out.println(s4==s9);
				

		
	}

}
