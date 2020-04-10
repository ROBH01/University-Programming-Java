/**
 * @name Robert Giurgiulescu
 * @id number 4820793
 * Date: 14/12/2017
 * Week 21
 * Task number 3
 * 
 * This program simulates the craps game and to work, it needs the Dice object (Dice.java).
 * The program rolls two dices and calculates the total. Depending of the total number, there are 
 * different scenarios: winning throw, losing throw and draw. If the user gets draw, another throw 
 * can be performed, until the user either loses or wins. 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Craps {
	Scanner scan = new Scanner(System.in);
	Dice dice1 = new Dice();
	Dice dice2 = new Dice();
	int score;

	public void shoot() {
		dice1.roll();
		dice2.roll();
	}

	public void calculateScore() {
		score = dice1.getFaceValue() + dice2.getFaceValue();
	}

	public void displayDetails() {
		System.out.println("Dice 1: " + dice1.getFaceValue());
		System.out.println("Dice 2: " + dice2.getFaceValue());
		System.out.println("Score is: " + score);
	}

	public void decideOutcome() {
		try {
			if (score == 7 || score == 11) {
				System.out.println("Congrats, this was a winning throw.");
			}
			else if (score == 2 || score == 3 || score == 12) {
				System.out.println("Sorry, this was a losing throw.");
			}
			else {
				System.out.print("\nDraw, you get another try. Type 1 to thow again or 2 to quit: ");
				int tryAgain = scan.nextInt();

				while (tryAgain != 1 && tryAgain !=2) {
					System.out.print("Incorrect choice, chose 1 or 2: ");
					tryAgain = scan.nextInt();
				}
				if (tryAgain == 1) {
					System.out.println();
					playAgain();	
				}
				else if (tryAgain == 2) {
					System.out.println("\nThank you for playing.");
					System.exit(0);
				}
			}
		}
		catch (InputMismatchException ex) {
			System.err.println("Wrong data type. Try again");
		}
	}	

	public void playAgain() {
		shoot();
		calculateScore();
		displayDetails();
		decideOutcome();
	}


	public static void main(String[] args) {
		Craps craps = new Craps();
		Scanner scan = new Scanner(System.in);
		String quit;

		do {
			craps.shoot();
			craps.calculateScore();
			craps.displayDetails();
			craps.decideOutcome();
			System.out.print("\nPlay again? yes or no: ");
			quit = scan.nextLine();
			while (!quit.equalsIgnoreCase("no") && !quit.equalsIgnoreCase("yes")) {
				System.out.print("\nPlay again? yes or no: ");
				quit = scan.nextLine();
			}
			System.out.println();
		} while (!quit.equalsIgnoreCase("no"));
		scan.close();
		System.out.println("Thank you for playing.");
	}
}
