import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

	public static void main(String[] args) {
		//TODO: Incomplete!
		Random rand = new Random();
		int number = rand.nextInt(2);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 0 for heads or 1 for tails: ");
		int choice = scan.nextInt();

		if (choice == number) {
			System.out.println("The guess is correct, it was " + number);
		}
		else {
			System.out.println("The guess is not correct, it was " + number);
		}
		scan.close();
	}
}