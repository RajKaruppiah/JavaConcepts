package com.repeat.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEg2 {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		
		System.out.println(l);
		
		for(int i=0; i<=20; i++) {

			l.add(i);
		}
		System.out.println(l);

		
		Iterator<Integer> itr = l.iterator();
		
		while(itr.hasNext()) {
			Integer I = (Integer)itr.next();
			
			if(I%2==0)
				System.out.println(I);
			else
				itr.remove();
		}
		
		System.out.println(l);
		
		
		
		
	}

}
