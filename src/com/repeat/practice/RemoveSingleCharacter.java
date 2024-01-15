package com.repeat.practice;

import java.util.Scanner;

public class RemoveSingleCharacter {

	public static void main(String[] args) {

		
		
		System.out.println("Enter the sentence ");
		
		Scanner ss=new Scanner(System.in);
		
		String sentence=ss.nextLine();
		
		System.out.println("Enter the character that needs to be removed");
		
		Scanner rc= new Scanner(System.in);
		
		char remove=rc.next().charAt(0);
		
		for(int i=0; i<sentence.length();i++) {
			
			if(sentence.charAt(i)!=remove) {
				System.out.print(sentence.charAt(i));
			}
		}
		
		System.out.println("Do you want to continue : yes or no");
		Scanner s3=new Scanner(System.in);
		s3.close();
//		String question=s3.nextLine();
		
		
		
	}

}
