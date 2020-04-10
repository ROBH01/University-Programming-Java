import java.util.Scanner;

public class ExampleDoWhileLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String password;
		do {
			System.out.print("Enter your password: ");
			password = scan.nextLine();
		}
        while (!password.equals("LetMeIn"));
		System.out.println("Password correct, you're in");
        scan.close();
	}
}