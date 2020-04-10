/**
 * @name Robert Giurgiulescu
 * @id number 4820793
 * Date: 02/12/2017
 * Week 19
 * Upload number 5
 * Task number 2
 * 
 * This program asks the user bits of data about 3 employees. The data
 * are: name, job title, age and salary. The program validates that the age and the salary
 * are the correct data types. Once all the data has been validated, the program
 * writes it to a file.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreatingAFileOfEmployees {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("FileOfEmployees.txt")));
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			out.println("Employee number " + (i + 1)); // Prints employee's number 
			System.out.println("Enter information about employee number " + (i + 1));
			System.out.print("Enter the name: ");
			String name = scan.nextLine(); 
			out.println("Name: " + name);

			System.out.print("Enter job title: ");
			String jobTitle = scan.nextLine();
			out.println("Job title: " + jobTitle);

			System.out.print("Enter the age: ");
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print("Invalid age, please enter a whole number: ");
			}
			int age = scan.nextInt();
			out.println("Age: " + age);

			System.out.print("Enter the salary: ");
			while (!scan.hasNextDouble()) {
				scan.next();
				System.out.print("Invalid salary, please enter a decimal number: ");
			}
			double salary = scan.nextDouble();
			out.println("Salary: £" + String.format("%,.2f", salary));
			out.println("--------------------"); // improving readability of the file
			scan.nextLine(); 
			System.out.println();
		}
		System.out.println("All data written to file.");
		out.close();
		scan.close();
	}
}