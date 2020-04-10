import java.io.File;
import java.util.Scanner;

public class Reading101Names1 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(new File("names.txt"));
		int index = 0;
		String[] names = new String[100];

		while (scan.hasNext()) {
			if (index < names.length) {
				names[index] = scan.nextLine();
				index++;
			}
			else {
				System.err.println("Oops, there are more names in the file than the array can take.");
				System.err.println("Make sure there are no more than " + names.length + " names.");
				System.exit(0);
			}
		}
		System.out.println("Names are: \n");
		
		for (String name:names) {
			System.out.println(name);
		}
		scan.close();
	}
}
