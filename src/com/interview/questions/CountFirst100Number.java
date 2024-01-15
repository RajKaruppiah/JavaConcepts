package com.interview.questions;

import java.util.Scanner;

public class CountFirst100Number {

	public static void main(String[] args) {

		
	CountFirst100Number obj = new CountFirst100Number();
//	obj.sumOfFirst100Numbers();
	obj.firstNOddNumber();
	
		
	}

	private void firstNOddNumber() {

		int total = 0;
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int upper=sc.nextInt();
		
		
		while(i<=upper) {
			total = total+i;
			i=i+2;
		}
		
		System.out.println("The total count is " +total);
		
		sc.close();
		
	}

}
