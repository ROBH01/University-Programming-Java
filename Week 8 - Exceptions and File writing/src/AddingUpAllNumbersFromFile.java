/**
 * @name Robert Giurgiulescu
 * @id number 4820793
 * Date: 02/12/2017
 * Week 19
 * Upload number 5
 * Task number 1
 * 
 * This program reads integer numbers from a file, displays them, adds them up and displays the total.
 * The program will add up all the valid integers and ignore anything that is not an integer number.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddingUpAllNumbersFromFile {

	public static void main(String[] args) {
		try {
			File myFile = new File ("AddingUpIntegers.txt");
			Scanner scan = new Scanner(myFile);
			int total = 0;

			while (scan.hasNext()) {
				if (scan.hasNextInt()) {
					int number = scan.nextInt();
					total = total+number;
					System.out.println(number);
				}
				else {
					scan.next();
				}
			}
			System.out.println("\nThe total is: " + total);
			scan.close();
		}
		catch (FileNotFoundException ex) {
			System.err.println("File not found, please make sure the name of the file is correct");
		}
	}
}