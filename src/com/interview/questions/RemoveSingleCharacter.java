package com.interview.questions;

import java.util.Scanner;

public class RemoveSingleCharacter {

	public static void main(String[] args) {

		System.out.println("Enter sentence");
		
		Scanner sc = new Scanner(System.in);
		
		String ss= sc.nextLine();
		
		System.out.println("Which letter to remove?");
		
		Scanner rm = new Scanner(System.in);
		
		char c=rm.next().charAt(0);
		
		for (int i = 0; i < ss.length(); i++) {
			
			if(ss.charAt(i)!=c) {
				System.out.print(ss.charAt(i));
			}
			
		}
		
		sc.close();
		rm.close();
		
		
		
	}

}
