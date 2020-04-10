import java.util.Scanner;

public class SalaryReadInProgramRevisited {

	public static void main(String[] args) {
		int salary;
		int newSalary;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Current Salary:> ");
		salary = scan.nextInt();
		newSalary = salary + 200;
		System.out.println("New Salary: £" + newSalary);
		scan.close();  
	}
}