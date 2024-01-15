package com.array.examples;

public class ArrayLargest2 {

	public static void main(String[] args) {

		int[] values = {10,30,45,94,67,8,90};
		
		int largest = values[0];
		
		//System.out.println(values.length);
		
		for(int i=0; i<values.length; i++) {
			
			if (values[i]>largest) {
				largest=values[i];
			}
		}
		
		System.out.println("The largest number in array "+largest);
		
		
		
	}

}
