package com.FileExceptionHandling.testing;

public class NullPointerException {

	public static void main(String[] args) {

		String s = "Raj";
		System.out.println(s.length());
		
		String s1 = null;
		System.out.println(s1.length()); //null pointer execption
		
	}

}
