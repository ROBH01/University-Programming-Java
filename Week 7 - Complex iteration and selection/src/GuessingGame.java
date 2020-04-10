import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int number;
		int guess;
		number = rand.nextInt(99) + 1;
		System.out.print("I've thought of a number between 1 and 100 \nEnter your guess...");
		guess = scan.nextInt();

		while (guess != number) {
			if (guess < number) {
				System.out.println("Higher");
				guess = scan.nextInt();
			}
			if (guess > number)	{
				System.out.println("Lower");
				guess = scan.nextInt();
			}
		}
		System.out.println("Well done, I was thinking about " + guess);
		scan.close();
	}
}