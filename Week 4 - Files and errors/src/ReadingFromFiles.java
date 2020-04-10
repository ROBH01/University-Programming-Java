import java.io.File;
import java.util.Scanner;

public class ReadingFromFiles {

	public static void main(String[] args) throws Exception {
		File myFile = new File("infile.txt");
		Scanner scan = new Scanner(myFile);

		String firstName;
		firstName = scan.nextLine();
		System.out.println(firstName); // print first line only

		String secondName;
		secondName = scan.nextLine();
		System.out.println(secondName);

		String thirdName;
		thirdName = scan.nextLine();
		System.out.println(thirdName);
		scan.close();
	}
}