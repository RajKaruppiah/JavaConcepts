package loops;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);


		do {


			System.out.println("Enter the number1 : ");
			int number1 = key.nextInt();

			System.out.println("Enter the number2 : ");

			int number2 = key.nextInt();
			
			if (number2==0) {
				break;
//				System.out.println("Number can't be zero, continue Next");
//				continue;
				
			}

			System.out.println(number1 + "/" + number2 +": " +(number1/number2));
			

		} while (true);

		System.out.println("Enter number > 0");
		key.close();


	}


	

}
