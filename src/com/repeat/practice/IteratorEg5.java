package com.repeat.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEg5 {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		
		for(int i=0;i<20;i++)
		{
			l.add(i);
		}
		
		System.out.println(l);
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext()) {
			
			Integer i = (Integer)itr.next();
			
			if(i%2!=0)
				System.out.println(i);
			else
				itr.remove();
			
		}
		
		System.out.println(l);
		
		
		
		
		
		
		
		
		
	}

}
