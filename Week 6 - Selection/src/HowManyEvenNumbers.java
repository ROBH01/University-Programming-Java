import java.io.File;
import java.util.Scanner;

public class HowManyEvenNumbers {

	public static void main(String[] args) throws Exception {
		File myFile = new File ("HowManyEvenNumbers.txt");
		Scanner scan = new Scanner(myFile);
		int count = 0;

		while (scan.hasNextLine()) {
			if (scan.nextInt() % 2 == 0) {
				count++;	
			}
		}
		System.out.println("There are " + count + " even numbers in this file.");
		scan.close();
	}
}