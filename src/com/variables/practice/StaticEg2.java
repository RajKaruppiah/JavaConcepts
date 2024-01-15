package com.variables.practice;

public class StaticEg2 {

	
	
	int x=10;
	static int y=888;
	
	public static void main(String[] args) {

		
	StaticEg2 t = new StaticEg2();
	
	t.x=20;
	t.y=999;
	
	StaticEg2 t2 = new StaticEg2();
	
	System.out.println(t2.x +"----"+t2.y); //10,999
		
		
		
		
		
		
		
		
	}

}
