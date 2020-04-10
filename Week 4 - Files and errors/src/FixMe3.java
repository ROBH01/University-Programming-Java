import java.util.Scanner;

public class FixMe3 {

	public static void main(String[] args) {
		String[] names = new String[3];
		Scanner scan = new Scanner(System.in);

		System.out.println("Give me three names ....");
		names[0] = scan.nextLine();
		names[1] = scan.nextLine();
		names[2] = scan.nextLine();
		System.out.println("I go for a drink with " + names[1]);
		System.out.println("I revise with " + names[0]);
		System.out.println("I'm in the same seminar group with " + names[2]);

		scan.close();
	}
}
