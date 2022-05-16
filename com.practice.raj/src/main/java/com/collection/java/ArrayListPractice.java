package com.collection.java;

import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();
		
		l.add("A");
		l.add("10");
		l.add("B");
		l.add(null);
		
		System.out.println(l);  // A, 10, B, null
		
		l.remove(0);
		
		System.out.println(l);
		
		l.add(2, "B");
		
		l.add("N");
		
		System.out.println(l);
		
		
		
		
	}

}
