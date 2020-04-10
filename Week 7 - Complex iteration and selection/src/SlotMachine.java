/**
 * @name Robert Giurgiulescu
 * @id number 4820793
 * Date: 22/11/2017
 * Week 17
 * Task number 1
 * 
 * This program simulates a simple slot machine in which 3 numbers between 
 * 0 and 9 are randomly selected and printed side by side. It prints an 
 * appropriate statement depending on the guess type and continues to ask
 * the user to play again or to stop the program.
 */

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

	public static void main(String[] args) {
		Random rand = new Random();                 
		Scanner scan = new Scanner(System.in);
		String request;
		
		do {
			int number1 = rand.nextInt(10); // Random number between 0 and 9.
			int number2 = rand.nextInt(10);
			int number3 = rand.nextInt(10);
			System.out.println(number1 + " " + number2 + " " + number3);

			if (number1 == number2 && number2 == number3) {
				System.out.println("All three match - JACKPOT");
				System.out.print("Play again? (Y/N): ");
			}
			else if (number1 == number2 || number2 == number3 || number3 == number1) {
				System.out.println("Two numbers match");
				System.out.print("Play again? (Y/N): ");
			}
			else {
				System.out.println("No numbers match");
				System.out.print("Play again? (Y/N): ");
			}
			request = scan.nextLine(); //Request whether keep playing or not.

			while (!request.equalsIgnoreCase("Y") && !request.equalsIgnoreCase("N")) { // Forcing the user to type Y or N.
				System.out.print("Play again? (Y/N): ");
				request = scan.nextLine();
			}
			System.out.println();
		}
		while (!request.equalsIgnoreCase("N"));
		System.out.println("Thank you for playing.");
		scan.close();
	}
}