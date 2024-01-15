package com.repeat.practice;

public class ReverseAString {

	public static void main(String[] args) {

		
		String s = "English";
		
		int len = s.length();
		
		for (int i=len-1; i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		
		
		//thru stringbuffer
		
		System.out.println("=================================");
		
		StringBuffer sf = new StringBuffer(s);
		
		StringBuffer k=sf.reverse();
		 
		System.out.println(k);
		
	}

}
