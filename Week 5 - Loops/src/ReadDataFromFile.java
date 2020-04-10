import java.io.File;
import java.util.Scanner;

public class ReadDataFromFile {

	public static void main(String[] args) throws Exception {
		File myFile = new File ("Names.txt");
		Scanner scan = new Scanner(myFile);
		int count = 0;

		while (scan.hasNextLine()) { // don't know how many lines has
			System.out.println(scan.nextLine()); 
			count++;
		}
		System.out.println("\nCount of the names: " + count);
		scan.close();
	}
}