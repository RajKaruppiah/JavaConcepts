package com.string.practice;

public class Split_1 {

	public static void main(String[] args) {
		
		removeSpace();
	
	}

	public static void removeSpace() {

		String sentence = "Payilagam chn TN ";
		
		String nonSpace1=sentence.replace(" ", "");
		System.out.println(nonSpace1);
		
		String[] splitBySpace=sentence.split("\\s");
		
		for(String s1:splitBySpace)
			System.out.println(s1);
	}

}
