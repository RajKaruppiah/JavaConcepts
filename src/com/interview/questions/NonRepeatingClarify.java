package com.interview.questions;

public class NonRepeatingClarify {

	public static void main(String[] args) {

		String s = "abcdabcdf";
		char c=s.charAt(0);
		
		System.out.println(c);
		
		int first=s.indexOf(c);
		System.out.println(first);
		
		int last=s.lastIndexOf(c);
		System.out.println(last);
		
	}

}
