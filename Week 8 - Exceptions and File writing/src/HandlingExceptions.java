import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingExceptions {

	public static void main(String[] args) {
		try {
			File myFile = new File("IntegerNumbers.txt");
			Scanner scan = new Scanner(myFile);	
			int total = 0;
			int number;

			while (scan.hasNext()) {
				try {
					number = scan.nextInt();
					total = total + number;
					System.out.println(number);
				}
				catch (InputMismatchException ex) {
					System.err.println("Just found this incorrect data type in the file: " + "> " + scan.next() + " <" + " please allow only integer numbers.");
				}
			}
			System.out.println();
			System.out.println("The total is: " + total);
			scan.close();
		}
		catch (FileNotFoundException ex) {
			System.err.println("File not found, make sure the name of the file is correct");
			ex.getStackTrace();
		}
	}
}