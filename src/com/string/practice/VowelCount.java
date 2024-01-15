package com.string.practice;



public class VowelCount {

	public static void main(String[] args) {

		String s = "This is new vowel";

		s = s.toLowerCase();

		int vCount = 0;
		int cCount = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {

				vCount++;

			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
			
				cCount++;
			}
		
		}
			
			System.out.println("The number of vowels " +vCount  + "and the number of Consonants " +cCount);

		}

	}