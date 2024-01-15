package com.array.examples;

public class ArrayHowManyTimes {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 50, 40, 60, 45, 30, 30 };

		int key = 3;
		int i = 0;
		int count = 0;

		while (i < arr.length) {

			if (key == arr[i]) {
				count++;
			}
			i++;
		}

		if (count > 0) {
			System.out.println(key + " is present " + count + " times");
		} else {
			System.out.println(key + " is not present in the list");
		}
	}

}
