/**
 generate 2 random cards for the user, from 2 to 11.
 generate 2 random cards for the computer, from 2 to 11.
 
 add user cards together
 add computer cards together
 
 display cards
 
 decide outcome (winner)
 if total user cards = 21, display message of user winning pontoon
 if total computer cards = 21, display message of computer winning pontoon
 if total cards of user is > than total cards computer, USER WINS, else USER LOSE.

 play game until user choses to terminate 
 */

import java.util.Random;
import java.util.Scanner;

class PontoonGame {
	private Random rand = new Random();
	private int card1u, card2u, card1c, card2c;
	private int totalUser, totalComp;

	void userCards() {
		card1u = rand.nextInt(10) + 2;
		card2u = rand.nextInt(10) + 2;
	}

	void computerCards() {
		card1c = rand.nextInt(10) + 2;
		card2c = rand.nextInt(10) + 2;
	}

	void displayCards() {
		System.out.println("Card 1 user: " + card1u);
		System.out.println("Card 2 user: " + card2u);
		System.out.println();
		System.out.println("Card 1 comp: " + card1c);
		System.out.println("Card 2 comp: " + card2c);
	}

	void totals() {
		totalUser = card1u + card2u;
		totalComp = card1c + card2c;
		System.out.println("\nTotal of user's cards: " + totalUser);
		System.out.println("Total of the comp's cards: " + totalComp);
	}

	void winner() {
		int winningNumber = 21;
		if (totalUser == winningNumber) {
			System.out.println("\nCongratulations to the user which has pontoon and therefore is the winner");
		}
		else if (totalComp == winningNumber) {
			System.out.println("\nCongratulations to the comp which has pontoon and therefore is the winner");
		}
		else if (totalUser == winningNumber && totalComp == winningNumber) {
			System.out.println("\nCongratulations, both of you has pontoon therefore is a equal");
		}
		else if (totalUser > totalComp) {
			System.out.println("\nUser wins");
		}
		else if (totalUser < totalComp) {
			System.out.println("\nComp wins");
		}
		else  {
			System.out.println("\nEqual");
		}
	}


	static void main(String[] args) {
		PontoonGame process = new PontoonGame();
		Scanner scan = new Scanner(System.in);
		int request;

		do {
			process.userCards();
			process.computerCards();
			process.displayCards();
			process.totals();
			process.winner();

			System.out.print("\nPress 1 to play again or 2 to quit: ");
			request = scan.nextInt();
			
			while (request != 1 && request != 2) {
				System.out.print("Please, press 1 to play again or 2 to quit: ");
				request = scan.nextInt();
			}
		} while (request == 1);
		scan.close();
		System.out.println("\nThank you for playing");
	}
}
