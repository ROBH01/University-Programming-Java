import java.io.File;
import java.util.Scanner;

public class AverageEmployeeSalary {

	public static void main(String[] args) throws Exception {
		File file = new File ("AverageEmployeeSalary.txt");
		Scanner scan = new Scanner(file);
		double[] salary = new double [5];

		salary[0] = scan.nextDouble();
		System.out.println("First salary is: £" + String.format("%,.2f", salary[0]));

		salary[1] = scan.nextDouble();
		System.out.println("Second salary is: £" + String.format("%,.2f", salary[1]));

		salary[2] = scan.nextDouble();
		System.out.println("Third salary is: £" + String.format("%,.2f", salary[2]));

		salary[3] = scan.nextDouble();
		System.out.println("Fourth salary is: £" + String.format("%,.2f", salary[3]));

		salary[4] = scan.nextDouble();
		System.out.println("Fifth salary is: £" + String.format("%,.2f", salary[4]));
		System.out.println();
		System.out.println("The average of the salaries: £" + String.format("%,.2f", (salary[0] + salary[1] + salary[2] + salary[3] + salary[4]) / (double)salary.length));
		scan.close();	
	}
}