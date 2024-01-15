package com.collection.practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorEg1 {

	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<String>();

		l.add("Bala");
		l.add("venky");
		l.add("chiru");
		l.add("nag");

		System.out.println(l);

		ListIterator<String> ltr = l.listIterator();

		while (ltr.hasNext()) {
			String s = ltr.next();

			if (s.equals("venky")) {

				ltr.remove();
			} else if (s.equals("nag")) {
				ltr.add("chaitu");
			}

			else if (s.equals("chiru")) {
				ltr.set("charan");
			}

		}

		System.out.println(l);

	}

}
