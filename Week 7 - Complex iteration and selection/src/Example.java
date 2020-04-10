import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		String OAP;
		String member;
		int ticket;
		Scanner scan = new Scanner(System.in);
		System.out.print("Are you a member? Y/N: ");
		member = scan.nextLine();

		System.out.print("Are you an OAP? Y/N: ");
		OAP = scan.nextLine();

		if (member.equalsIgnoreCase("Y") && OAP.equalsIgnoreCase("Y")) {
			ticket = 10;
		}
		else if (member.equalsIgnoreCase("Y")) {
			ticket = 12;
		}
		else {
			ticket = 15;
		}
		System.out.println("The cost for the ticket is: " + ticket);
		scan.close();
	}
}
