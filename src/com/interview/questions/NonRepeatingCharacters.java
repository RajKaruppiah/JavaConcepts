package com.interview.questions;

public class NonRepeatingCharacters {

	public static void main(String[] args) {

		System.out.println(firstNonRepeatingCharacter("abcdezabcde"));
		

	}
	
	
	
	  public static char firstNonRepeatingCharacter(String s) {
	  
	  for (int i = 0; i < s.length(); i++) {
	  
	  if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
	  
		  return s.charAt(i); 
	  
	  }
	  
 }
	  
	  return 'a';
	  
	  }
	 
}