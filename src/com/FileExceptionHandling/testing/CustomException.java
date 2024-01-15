package com.FileExceptionHandling.testing;

import java.util.Scanner;

class TooYoungException extends RuntimeException
{
	public TooYoungException(String msg) {

		super(msg);
	}
	
}

class TooOldException extends RuntimeException
{
	public TooOldException(String msg) {
	
		super(msg);
	}
}




public class CustomException {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the Age : ");
		
		int age = obj.nextInt();
		
		if (age>60) {
			
			throw new TooOldException("You're too old, but we will give a try");
		}
		
		else if (age<18) {
			throw new TooYoungException("You're too young, focus on studies");
		}
		
		else {
			System.out.println("Thanks for Registration, we will reach out to you soon !");
		}
		

		
	}

}
