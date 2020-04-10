import java.util.Scanner;

public class CheckANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstDiv = 3;
		int secondDiv = 7;
		System.out.print("Enter an integer number: ");
		int number = scan.nextInt();

		if (number % firstDiv == 0 && number % secondDiv == 0) {
			System.out.println(number + " is divisible by both " + firstDiv + " and " + secondDiv);
		}
		else if (number % firstDiv == 0) {
			System.out.println(number + " is divisible by " + firstDiv + ", but not by " + secondDiv);
		}
		else if (number % secondDiv == 0) {
			System.out.println(number + " is divisible by " + secondDiv + ", but not by " + firstDiv);
		}
		else {
			System.out.println(number + " is not divisible by either " + firstDiv + " or " + secondDiv);
		}
		scan.close();
	}
}