import java.util.Scanner;

public class ExtendingTheSalaryReadIn {

	public static void main(String[] args) {
		double salary;
		double increase;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Current Salary:> ");
		salary = scan.nextDouble();
		
		System.out.print("Enter the increase:> ");
		increase = scan.nextDouble();
		
		System.out.println("New Salary: £" + (salary + increase));
		scan.close();
	}
}