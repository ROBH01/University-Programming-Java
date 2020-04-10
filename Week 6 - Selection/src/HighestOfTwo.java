import java.util.Scanner;

public class HighestOfTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number1 = scan.nextInt();

		System.out.print("Enter the second number: ");
		int number2 = scan.nextInt();

		if (number1 > number2) {
			System.out.println("Highest number is: " + number1);
		}
		else if(number1 < number2) {
			System.out.println("Highest number is: " + number2);
		}
		else {
			System.out.println("Numbers are equal");
		}
		scan.close();
	}
}