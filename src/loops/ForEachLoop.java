package loops;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {

		
		String[] cars = {"BMW", "Nissan", "Toyata", "Ford"};
		
	
		for (String car : cars) {
			System.out.println(car);
			
		}
		
		char[] letter = {'a', 'b', 'c', 'd'};
		
		for(char char1: letter) {
			System.out.println(char1);
		}
		
		System.out.println("Display for Array List");
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.remove(1);
		
		for(int a : numbers) {
			System.out.println(a);
		}
		
		

	}

}
