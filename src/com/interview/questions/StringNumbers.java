package com.interview.questions;

public class StringNumbers {

	public static void main(String[] args) {
		String s = "3A2B3C";
		int count = 0;
		String r = "";
		String ans = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				r = r + s.charAt(i);
			} else {
				count = Integer.valueOf(r);
				for (int j = 0; j <= count - 1; j++) {
					ans = ans + s.charAt(i);
				}
				r = "";
			}
		}
		System.out.print(ans);
	}

}
