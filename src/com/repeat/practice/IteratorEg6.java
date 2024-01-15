package com.repeat.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEg6 {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>();
		
		for (int i = 0; i <=30; i++) {
			l.add(i);
			
			
		}
		
		System.out.print(l);
		
		
		Iterator<Integer> itr =l.iterator();
		
		while (itr.hasNext()) {
			Integer integer = itr.next();
			
			if(integer%2==0) {
				
			System.out.println(integer);
			} else {
				itr.remove();

			}
			
		}
		
	}

}
