package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner key1 = new Scanner(System.in);

		String answer;
		do {
			System.out.println("Enter the Price ");

			double price = key1.nextDouble();

			System.out.println("Enter the quantity");

			int quantity = key1.nextInt();

			double Total = price * quantity;

			System.out.println("The total price = $" + Total);

			System.out.println("Do you want to continue another one? Yes or No");

			answer = key1.next();
		} while (answer.equalsIgnoreCase("Yes"));
		
		if (answer.equalsIgnoreCase("No")) {
			System.out.println("Thank you for the purchase !");
		}

		key1.close();

	}

}
