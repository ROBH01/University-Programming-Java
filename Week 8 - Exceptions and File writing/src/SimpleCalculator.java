import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n1: ");
		int n1;
		
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print("Enter an integer (n1): ");
		}
		n1 = scan.nextInt();

		System.out.print("Enter the operator: ");
		String operator = scan.next();

		while (!operator.equalsIgnoreCase("/") && !operator.equalsIgnoreCase("*") && !operator.equalsIgnoreCase("+") && !operator.equalsIgnoreCase("-")) {
			System.out.print("Enter one of those operators (/,*,+,-): ");
			operator = scan.next();
		}
		
		System.out.print("Enter n2: ");
		int n2;
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print("Enter an integer (n2): ");
		}
		n2 = scan.nextInt();

		if (operator.equalsIgnoreCase("+")) {
			int result = n1 + n2;
			System.out.println("The result of " + n1 + operator + n2 + " is " + result);
		}
		else if (operator.equalsIgnoreCase("-")) {
			int result = n1 - n2;
			System.out.println("The result of " + n1 + operator + n2 + " is " + result);
		}
		else if (operator.equalsIgnoreCase("*")) {
			double result = n1 * n2;
			System.out.println("The result of " + n1 + operator + n2 + " is " + result);
		}
		else if (operator.equalsIgnoreCase("/")) {
			double result = n1 / n2;
			System.out.println("The result of " + n1 + operator + n2 + " is " + result);
		}
		scan.close();
	}
}