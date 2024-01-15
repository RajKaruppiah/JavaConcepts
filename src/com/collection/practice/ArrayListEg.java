package com.collection.practice;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();
		
		list.add("A");
		
		list.add(10);
		
		System.out.println(list);
		
		list.addAll(list);
		
		System.out.println(list);
		
	}

}
