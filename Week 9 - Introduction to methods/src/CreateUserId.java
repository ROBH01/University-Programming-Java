import java.util.Scanner;

public class CreateUserId {

	public String nameAndSurname(String firstName, String surname) {
		String userId;
		try {
			userId = firstName.substring(0, 1) + surname.substring(0, 5);
			System.out.println("Your user ID is: " + userId.toLowerCase());
		}
		catch (StringIndexOutOfBoundsException ex) {
			System.out.println("Your user ID is: " + (userId = firstName.substring(0, 1) + surname).toLowerCase());
		}
		return userId;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your firstname: ");
		String firstName = scan.nextLine();
		System.out.print("Enter your surname: ");
		String surname = scan.nextLine();
		CreateUserId process = new CreateUserId();
		process.nameAndSurname(firstName, surname);
		scan.close();
	}	
}