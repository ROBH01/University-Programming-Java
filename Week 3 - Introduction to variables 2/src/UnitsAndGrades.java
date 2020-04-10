/**
 * @name [Robert Giurgiulescu]
 * @id number [4820793]
 * Date: [15/10/2017]
 * Week 13
 * 
 * This program ask the user to write a grade for each of the six units I study.
 * The six units are stored in one array, and the grades entered by the user are stored in another array.
 * Finally, it displays each unit and the users entered grade and the average of the marks.
 */

import java.util.Scanner;

public class UnitsAndGrades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] units = {"BPI", "RD", "Prog", "C&N", "SAD", "UCWD"};
		int[] grades = new int[6];
		
		System.out.println("Please enter the marks for the following units: ");
		System.out.print(units[0] + ": ");
		grades[0] = scan.nextInt();

		System.out.print(units[1] + ": ");
		grades[1] = scan.nextInt();

		System.out.print(units[2] + ": ");
		grades[2] = scan.nextInt();

		System.out.print(units[3] + ": ");
		grades[3] = scan.nextInt();

		System.out.print(units[4] + ": ");
		grades[4] = scan.nextInt();

		System.out.print(units[5] + ": ");
		grades[5] = scan.nextInt();

		scan.close();
		System.out.println();
		System.out.println("Units and grades are: ");
		System.out.println(units[0] + ":   " + grades[0]);
		System.out.println(units[1] + ":    " + grades[1]);
		System.out.println(units[2] + ":  " + grades[2]);
		System.out.println(units[3] + ":   " + grades[3]);
		System.out.println(units[4] + ":   " + grades[4]);
		System.out.println(units[5] + ":  " + grades[5]);
		System.out.println();

		System.out.println("Average: " + String.format("%,.2f", (grades[0] + grades[1] + grades[2] + grades[3] + grades[4] + grades[5]) / (double)grades.length));
	}
}