package com.static_1.practice;

public class Engine extends Car{
	
	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();  // BMW Starts
		
		Car c1 = new Car();
		
		c1.start();  // Car will start
		
		Car c2= new BMW();
		c2.start();  // BMW Starts
		
		
		Engine e = new Engine();
		
		
		
	}

}
