package com.FileExceptionHandling.testing;

import java.io.File;

public class DisplayFileNames {

	public static void main(String[] args) {

		int count = 0;
		
//		File f = new File("/Users/rajkaruppiah/Documents/java/JavaInterview/src/com/FileExceptionHandling/testing");
		File f = new File("/Users/rajkaruppiah/Downloads");
		String[] s= f.list();
		
		for (String s1 : s) {

		File f1= new File(f, s1);
		
		if(f1.isDirectory()) {
			count++;
			System.out.println(s1);
		}
		
		System.out.println(count);
		}
		
		
		
	}

}
