import java.util.Scanner;

public class CreateUserIdFromEnteredData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first name:> ");
		String firstName = scan.nextLine();

		System.out.print("Enter your surname:> ");
		String surname = scan.nextLine();

		String id = firstName.substring(0, 1) + surname.substring(0, 5); // (0, 1) prints(first letter); (0, 5) prints(first 5 letters).
		System.out.println("Your user ID is: " + id.toLowerCase()); 
		scan.close();
	}
}