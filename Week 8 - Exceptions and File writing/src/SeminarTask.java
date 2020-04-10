import java.util.Scanner;

public class SeminarTask {

	public static void main(String[] args) {
		int countCodes = 0;
		int countValid = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your code: ");
		String code = scan.next();

		while (!code.equalsIgnoreCase("XXX")) {
			countCodes++;
			if (code.length() == 5) {
				try {
					Integer.parseInt(code.substring(1, 4)); // check that 2 3 4 are integers
					countValid++;
					System.out.println("Valid code");
				}
				catch (NumberFormatException ex) {
					System.err.println("Invalid code - non-numeric");
				}
			}
			else if (code.length() < 5) {
				System.err.println("Invalid code - too short");
			}
			else {
				System.err.println("Invalid code - too long");
			}
			System.out.print("\nEnter the next code or xxx to exit: ");
			code = scan.next();
		}
		System.out.println("Codes entered = " + countCodes);
		System.out.println("Valid codes entered = " + countValid);
		System.out.println("Invalid codes entered = " + (countCodes-countValid));
		System.out.println("Thank you");
		scan.close();
	}
}