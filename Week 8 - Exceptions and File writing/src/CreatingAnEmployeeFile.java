import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreatingAnEmployeeFile {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("EmpFile.txt")));
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter information about the employee");

		System.out.print("Enter the name: ");
		String name = scan.next(); 
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		out.println("Name: " + name);
		
		System.out.print("Enter the job title: ");
		String jobTitle = scan.next();
		jobTitle = jobTitle.substring(0, 1).toUpperCase() + jobTitle.substring(1);
		out.println("Job title: " + jobTitle);

		System.out.print("Enter the age: ");
		int age;
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print("Enter the age: ");
		}
		age = scan.nextInt();
		out.println("Age: " + age);

		System.out.print("Enter the salary: ");
		double salary;
		
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Enter the salary: ");
		}
		salary = scan.nextDouble();
		out.println("Salary: £" + String.format("%,.2f", salary));
		out.println(" ");
		
		out.close();
		scan.close();
		System.out.println("\nAll data written to file.");
	}
}