import java.util.Scanner;

public class Introduction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double taxRate;
		double salary;
		double tax;
		double netSalary;
		
		System.out.print("Input a salary: ");
		salary = scan.nextDouble();

		if (salary >= 45000) {
			taxRate = 0.5;
		}
		else if (salary >= 30000) {
			taxRate = 0.3;
		}
		else if (salary >= 20000) {
			taxRate = 0.2;
		}
		else {
			taxRate = 0.15;
		}
		tax = salary * taxRate;
		netSalary = salary - tax;
		System.out.println("Total tax: £" + String.format("%,.2f", tax));
		System.out.println("Net salary: £" + String.format("%,.2f", netSalary));
		scan.close();	
	}
}