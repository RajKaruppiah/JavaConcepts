package com.array.examples;

public class ArrayLargest {

	public static void main(String[] args) {

		int[] values = {10,20,15,45,86,75,80};
		
		int largest = values[0];
		
		System.out.println(values.length);
		
		for (int i = 0; i < values.length; i++) {
			
			if (values[i] > largest) {
				largest=values[i];
			}
		}
		System.out.println(largest);
		
	}

}
