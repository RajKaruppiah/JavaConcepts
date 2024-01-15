package com.array.examples;

public class ArraySmallest {

	public static void main(String[] args) {

		
		int[] values = {10,20,30,24,5,10,15};
		
		int smallest = values[0];
		
		for(int i=0; i<values.length; i++) {
			
			if(values[i] < smallest) {
				
				smallest = values[i]  ;
			}
		}

		System.out.println(smallest);
		
		
		

	}
	
}
