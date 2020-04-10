import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int pcChoice = rand.nextInt(2);
		System.out.print("Enter 0 for heads or 1 for tails: ");
		int userGuess = scan.nextInt();

		while (userGuess != 0 && userGuess != 1) {
			System.out.print("Please enter 0 for heads or 1 for tails: ");
			userGuess = scan.nextInt();
		}
		if (userGuess == pcChoice) {
			System.out.println("The guess is correct, it was " + pcChoice);
		}
		else {
			System.out.println("The guess is not correct, it was " + pcChoice);
		}
		scan.close();
	}
}