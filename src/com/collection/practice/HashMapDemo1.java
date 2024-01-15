package com.collection.practice;

import java.util.*;

public class HashMapDemo1 {

	public static void main(String[] args) {

		HashMap m = new HashMap();

		m.put("Chiru", 700);
		m.put("balaiah", 800);
		m.put("venkatesh", 200);
		m.put("nagarjuna", 500);

		System.out.println(m);

		System.out.println(m.put("Chiru", 1000));

		Set s = m.keySet();

		System.out.println(s);

		Collection c = m.values();

		System.out.println(c);

		Set s1 = m.entrySet();
		
		System.out.println("output of S1******************");

		System.out.println(s1);

		Iterator its = s1.iterator();

		while (its.hasNext()) {

			Map.Entry m1 = (Map.Entry)its.next();

			System.out.println(m1.getKey() + " ........ " + m1.getValue());

			if (m1.getKey().equals("nagarjuna"))
				m1.setValue(100000);

		}

		System.out.println(m);
	}

}
