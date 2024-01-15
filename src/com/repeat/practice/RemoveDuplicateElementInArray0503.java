package com.repeat.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateElementInArray0503 {

	public static void main(String[] args) {

		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,4,1,2,3,4,6,7,8));
		
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>(numbers);
		
		System.out.println(l);
		
		
	}

}
