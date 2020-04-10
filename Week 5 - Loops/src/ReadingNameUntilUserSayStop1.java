import java.util.Scanner;

public class ReadingNameUntilUserSayStop1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		int count = 0;
		System.out.println("Type in names, once finished type stop: ");

		while (!name.equalsIgnoreCase("stop")) { // while the name doesn't equal to "stop", continue
			name = scan.nextLine();
			count++;
		}
		System.out.println("Number of names entered: " + (count - 1));
		scan.close();
	}
}