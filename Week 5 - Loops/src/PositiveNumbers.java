import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a positive number: ");

		while (scan.nextInt() < 0) {
			System.out.print("Please enter a positive number: ");
		}
		System.out.println("Thank you");
		scan.close();
	}
}