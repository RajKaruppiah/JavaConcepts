package com.FileExceptionHandling.testing;

public class ArrayIndexOutBound {

	public static void main(String[] args) {

		int[] a = new int[10];
		
		System.out.println(a[0]);
		System.out.println(a[9]);
		System.out.println(a[10]); //index out of bound index error
	}

}
