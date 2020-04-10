import java.io.File;
import java.util.Scanner;

public class TotalEmployeeSalary {

	public static void main(String[] args) throws Exception {
		File file = new File ("TotalEmployeeSalary.txt");
		Scanner scan = new Scanner (file);

		double salary1 = scan.nextDouble();
		System.out.println("First salary: £" + String.format("%,.2f", salary1));

		double salary2 = scan.nextDouble();
		System.out.println("Second salary: £" + String.format("%,.2f", salary2));

		double salary3 = scan.nextDouble();
		System.out.println("Third salary: £" + String.format("%,.2f", salary3));

		double totalSalaries = (salary1 + salary2 + salary3);
		System.out.println("\nThe total is: £" + String.format("%,.2f", totalSalaries));
		scan.close();	
	}
}