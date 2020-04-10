/**
 * @name Robert Giurgiulescu
 * @id number 4820793
 * Date: 09/11/2017
 * Week 15
 * Task number 1
 * 
 * This program reads in salaries from a file using the while loop. It displays
 * the total and the average of them. It doesn't matter how many 
 * salaries there are in the file, the program will still run.
 */

import java.io.File;
import java.util.Scanner;

public class AddingUpSalaries {

	public static void main(String[] args) throws Exception {
		File myFile = new File ("Addingupsalaries.txt");
		Scanner scan = new Scanner(myFile);
		double total = 0;
		int count = 0;

		while (scan.hasNextLine()) {
			double number = scan.nextDouble();
			System.out.println(String.format("£" + "%,.2f", number));
			total = total + number; //adding the value of the number to the total.
			count++;   //allows me to calculate the average.
		}
		System.out.println();
		System.out.println("Total of the salaries: £" + total);
		
		if (count == 0) {
			System.out.println("Average of the salaries: 0.0");
		}
		else {
			System.out.printf("Average of the salaries: £" + "%.2f", total / count);
		}
		scan.close();	
	}
}