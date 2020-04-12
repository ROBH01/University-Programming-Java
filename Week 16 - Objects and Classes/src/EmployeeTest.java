
public class EmployeeTest {

	public static void main(String[] args) {
		Department dept1 = new Department("Accounting", "Chris");
		Department dept2 = new Department("IT", "Robert");
		Employee emp1 = new Employee("Eric", 33000, dept1);
		Employee emp2 = new Employee("Anne", 33000, dept2);
		Employee emp3 = new Employee("Charlie", 22000, dept1);
		
		emp1.setSalary(100);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
	}
}
