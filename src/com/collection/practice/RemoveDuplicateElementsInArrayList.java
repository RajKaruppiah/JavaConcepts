package com.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsInArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,1,2,3,4,5,4,5,6,7,6,7));
		
//		System.out.println(numbers + "\n"  + "\n" +"After removing");
		
		
		LinkedHashSet<Integer> linked = new LinkedHashSet<Integer>(numbers);
		
//		System.out.println(linked);
		
		ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1,2,3,1,2,3,4,5,4,5,6,7,6,7));
		
		List<Integer> marksUnique=markList.stream().distinct().toList();
		
		List<Integer> unique = markList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(marksUnique);
		System.out.println(unique);
		
		
	}

}
