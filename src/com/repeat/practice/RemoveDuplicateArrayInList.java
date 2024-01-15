package com.repeat.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateArrayInList {

	public static void main(String[] args) {

		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,4,5,1,2,3,4));

		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>(numbers); 
		
		System.out.println(l);
		
	}

}
