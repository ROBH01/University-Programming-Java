
public class EmployeeTest {

	public static void main(String[] args) {
		Manager boss = new Manager("Bob", "Smith", "NE111", 60000, 2000);
		FullTime ftEmp = new FullTime("Anne", "Jones", "HG555", 60000, "Finance");
		PartTime ptEmp = new PartTime("Bert", "Johnson", "KL777", 60000, 0.5);
		Employee emp = new Employee("Fred", "Baker", "GH888", 60000);
		Temporary temp = new Temporary("Robert", "Green", "BA301PR", 10000, 35);
		
		System.out.println(boss.getFirstName() + " " + boss.getLastName() + " £" + boss.getMonthlyPay());
		System.out.println(ftEmp.getFirstName() + " " + ftEmp.getLastName() + " £" + ftEmp.getMonthlyPay());
		System.out.println(ptEmp.getFirstName() + " " + ptEmp.getLastName() + " £" + ptEmp.getMonthlyPay());
		System.out.println(emp.getFirstName() + " " + emp.getLastName() + " £" + emp.getMonthlyPay());
		System.out.println(temp.getFirstName() + " " + temp.getLastName() + " £" + temp.getMonthlyPay());
	}
}
