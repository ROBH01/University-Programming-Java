/**
 * @name Robert Giurgiulescu
 * @id number 4820793
 * Date: 11/11/2017
 * Week 15
 * Task number 2
 * 
 * This program reads in 10 names from a user and stores them in an array.
 * The names are then displayed in upper case.
 */

import java.util.Scanner;

public class ReadingInNames {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] names = new String[10];
		System.out.println("Please enter 10 names: ");

		for (int i = 0 ; i < names.length; i++) {
			names[i] = scan.nextLine();
		}
		System.out.println("\nThank you, the names are:\n ");

		for (String name : names) {
			System.out.println(name.toUpperCase());
		}
		scan.close();
	}
}