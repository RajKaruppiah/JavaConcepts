package com.FileExceptionHandling.testing;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExeception1 {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter pw = new PrintWriter("abc.text");
		
		pw.println("Hellow");
		pw.close();
		
		System.out.println(pw);
	}

}
