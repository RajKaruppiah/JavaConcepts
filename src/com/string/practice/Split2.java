package com.string.practice;

public class Split2 {

	public static void main(String[] args) {

		String str = " Hello Welcome to Java world";

		String[] parts = str.split("\\s");
		for (String s2 : parts) {
			System.out.println(s2);

		}

	}

}
