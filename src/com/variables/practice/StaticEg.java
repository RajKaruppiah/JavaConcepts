package com.variables.practice;

public class StaticEg {


	
	static int y; 
	int x=10;
	
	public static void main(String[] args) {

	
		System.out.println(StaticEg.y);
		System.out.println(y);
	}
	
	public void m1()
	{
		System.out.println(y);
	}
	
}
