package com.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListUsingJavaStreamAPI {

	public static void main(String[] args) {

		List<Integer> unsortList = Arrays.asList(10,30,40,20,50,60);
		
		List<Integer> sortedList=unsortList.stream()
								.sorted()
								.collect(Collectors.toList());
		
		System.out.println(sortedList);
	}

}
