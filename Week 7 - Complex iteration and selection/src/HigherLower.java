/**
 * @name Robert Giurgiulescu
 * @id number 4820793
 * Date: 22/11/2017
 * Week 17
 * Task number 2
 * 
 * This program simulates the Higher or Lower card guessing game.
 * The program draws the first card (a random number between 
 * 0 and 13) and displays it to the user. Then the user is asked
 * to guess if the next card is going to be higher or lower. 
 * Then the next card is drawn (another random number between 0 and 13)
 * and if the user is correct, they get another guess and so on,
 * until their guess is incorrect. When the guess is incorrect
 * the program ends and asks the user if play again or not. 
 */

import java.util.Random;
import java.util.Scanner;

public class HigherLower {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner (System.in);
		String guess;
		String continueGame = "Y"; 
		int firstCard = rand.nextInt(13) + 1;
		int nextCard = rand.nextInt(13) + 1;
		System.out.println("Card is: " + firstCard);

		do {
			System.out.print("Higher(H) or Lower(L): ");
			guess = scan.nextLine();

			while (!guess.equalsIgnoreCase("H") && !guess.equalsIgnoreCase("L")) { // Forcing the user to type H or L.
				System.out.print("Higher(H) or Lower(L): ");
				guess = scan.nextLine();
			}
			if (firstCard < nextCard && guess.equalsIgnoreCase("H")) {
				System.out.println("Card is: " + nextCard);
				firstCard = nextCard;
				nextCard = rand.nextInt(13) + 1;
			}
			else if (firstCard > nextCard && guess.equalsIgnoreCase("L")) {
				System.out.println("Card is: " + nextCard);
				firstCard = nextCard;
				nextCard = rand.nextInt(13) + 1;
			}
			else if (firstCard == nextCard && (guess.equalsIgnoreCase("H") || guess.equalsIgnoreCase("L"))) { // Giving another try to the user if the second card is equal to the first card, no matter if the user was wrong or right.
				System.out.println("Card is: " + nextCard);
				firstCard = nextCard;
				nextCard = rand.nextInt(13) + 1;
			}
			else if (firstCard < nextCard && guess.equalsIgnoreCase("L")) {
				System.out.println("Card is: " + nextCard);
				System.out.print("Card was higher, you lose. Play again? (Y/N): ");
				continueGame = scan.nextLine();

				while (!continueGame.equalsIgnoreCase("Y") && !continueGame.equalsIgnoreCase("N")) { // forcing the user to type either Y or N.
					System.out.print("Card was higher, you lose. Play again? (Y/N): ");
					continueGame = scan.nextLine();	
				}
				if (continueGame.equalsIgnoreCase("Y")) { // generating new numbers to be tested at the start of the main loop.
					firstCard = rand.nextInt(13) + 1;
					nextCard = rand.nextInt(13) + 1;
					System.out.println("Card is: " + firstCard);
				}
			}
			else {
				System.out.println("Card is: " + nextCard);
				System.out.print("Card was lower, you lose. Play again? (Y/N): ");
				continueGame = scan.nextLine();

				while (!continueGame.equalsIgnoreCase("Y") && !continueGame.equalsIgnoreCase("N")) {
					System.out.print("Card was lower, you lose. Play again? (Y/N): ");
					continueGame = scan.nextLine();	
				}
				if (continueGame.equalsIgnoreCase("Y")) {
					firstCard = rand.nextInt(13) + 1;
					nextCard = rand.nextInt(13) + 1;
					System.out.println("Card is: " + firstCard);
				}
			}
		} 
		while (continueGame.equalsIgnoreCase("Y"));
		System.out.println("\nThank you for playing");
		scan.close();
	}
}