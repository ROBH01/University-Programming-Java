import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadEmployee {
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Employee> employees = new ArrayList<>();
		File file = new File("employees.txt");
		Scanner fileScan = new Scanner(file);

		Employee emp1 = new Employee(fileScan.next(), fileScan.next(), fileScan.next(), fileScan.nextInt(), fileScan.nextDouble());
		Employee emp2 = new Employee(fileScan.next(), fileScan.next(), fileScan.next(), fileScan.nextInt(), fileScan.nextDouble());
		employees.add(emp1);
		employees.add(emp2);
		System.out.println(emp1);
		System.out.println(emp2);
		fileScan.close();
	}
}
