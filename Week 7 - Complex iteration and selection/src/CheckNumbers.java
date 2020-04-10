/**
 * @name Robert Giurgiulescu
 * @id number 4820793
 * Date: 20/11/2017
 * Week 17
 * Task number 3
 * 
 * This program prompts the user to enter an integer number. 
 * It checks whether the number is divisible by 
 * both 3 and 7, or by 3 or 7, or by none of them and
 * prints an appropriate statement. It will keep asking the user
 * to check another number without restarting the program until
 * the user chose to stop it.
 */

import java.util.Scanner;

public class CheckNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 3;
		int num2 = 7;
		int userNumber;

		do {
			System.out.print("Enter an integer number: ");
			userNumber = scan.nextInt();

			if (userNumber % num1 == 0 && userNumber % num2 == 0) {
				System.out.println(userNumber + " is divisible by both " + num1 + " and " + num2);
			}
			else if (userNumber % 3 == 0) {
				System.out.println(userNumber + " is divisible by " + num1 + ", but not by " + num2);
			}
			else if (userNumber % 7 == 0) {
				System.out.println(userNumber + " is divisible by " + num2 + ", but not by " + num1);
			}
			else {
				System.out.println(userNumber + " is not divisible by either " + num1 + " or " + num2);	
			}
			System.out.print("\nType 1 to stop or 2 to test another number: ");
			userNumber = scan.nextInt();

			while (userNumber != 1 && userNumber != 2) {
				System.out.print("Type 1 to stop or 2 to test another number: ");
				userNumber = scan.nextInt();
			}
		}
		while (userNumber != 1);
		System.out.println("\nThank you for using the program.");
		scan.close();
	}
}