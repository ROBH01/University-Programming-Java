import java.util.Scanner;

public class TwoDecimalPlaceNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Write the first number: ");
		double n1 = scan.nextDouble();

		System.out.print("Write the second number: ");
		double n2 = scan.nextDouble();

		System.out.println("The sum is: " + (n1 + n2));
		System.out.println("The difference is: " + (n1 - n2));
		System.out.println("The product is: " + (n1 * n2));
		System.out.println("The remainder is: " + (n1 % n2));
		scan.close();
	}
}