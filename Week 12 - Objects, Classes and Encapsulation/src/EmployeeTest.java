
public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee("Anne", 33000); // goes to the constructor with STRING and SALARY (used if user wants to add only those 2 values because rest might be unknown)
		Employee emp3 = new Employee("Bob"); // goes to the constructor with STRING
		System.out.println("Employee number 3: " + emp3.getFirstName() + " " + emp3.getMonthlyPay());

		emp3.setFirstName("Robert");
		emp3.setLastName("G");
		emp3.setAge(24);
		emp3.setJob("CEO");
		emp3.setSalary(50000);
		System.out.println(emp3.toString());

		System.out.println(emp1.getFirstName() + " " + emp1.getMonthlyPay());
		System.out.println(emp2.getFirstName() + " " + emp2.getMonthlyPay());
	}
}
