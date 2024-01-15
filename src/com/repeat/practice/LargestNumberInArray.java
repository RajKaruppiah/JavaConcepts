package com.repeat.practice;

public class LargestNumberInArray {

	public static void main(String[] args) {

		
		int[] values = {10,40,50,30,80,70};
		
		int largest = values[0];
		
		for(int i=1; i<values.length;i++) {
			
			if(values[i] > largest) {
				largest = values[i];
			}
				
			
		}
		
		System.out.println(largest);
		
	}

}
