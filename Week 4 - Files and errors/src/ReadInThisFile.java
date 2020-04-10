import java.io.File;
import java.util.Scanner;

public class ReadInThisFile {

	public static void main(String[] args) throws Exception { 
		File employee = new File("Employee.txt");
		Scanner scan = new Scanner(employee);

		String employeeName = scan.nextLine();
		System.out.println("Employee name: " + employeeName);

		String jobTitle = scan.nextLine();
		System.out.println("Job title: " + jobTitle);

		double salary = scan.nextDouble();
		System.out.println("Salary: £" + String.format("%,.2f", salary));

		int age = scan.nextInt();
		System.out.println("Age: " + age);
		scan.close();
	}
}