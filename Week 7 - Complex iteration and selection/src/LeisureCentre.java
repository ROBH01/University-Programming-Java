import java.util.Scanner;

public class LeisureCentre {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int gold = 25;
		int silver = 15;
		int bronze = 10;
		int extra = 10;
		String membership;
		int age;
		System.out.print("Enter membership: ");
		membership = scan.nextLine();

		System.out.print("Enter age: ");
		age = scan.nextInt();

		if (membership.equals("Gold")) {
			if (age <= 16 || age >= 60) {
				System.out.println("You get " + (gold + extra) + "%");
			}
			else {
				System.out.println("You get " + gold + "%");
			}
		}
		else if (membership.equals("Silver")) {
			if (age <= 16 || age >= 60) {
				System.out.println("You get " + (silver + extra) + "%");
			}
			else {
				System.out.println("You get " + silver + "%");
			}
		}
		else if (membership.equals("Bronze")) {
			if (age <= 16 || age >= 60) {
				System.out.println("You get " + (bronze + extra) + "%");
			}
			else {
				System.out.println("You get " + bronze + "%");
			}
		}
		else {
			System.out.println("Not valid");
		}
		scan.close();
	}
}