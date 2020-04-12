
public class EmployeeTest2 {

	public static void main(String[] args) {
		Manager boss = new Manager("Bob", "Smith", "NE111", 60000, 2000);
		FullTime ftEmp = new FullTime("Anne", "Jones", "HG555", 60000, "Finance");
		PartTime ptEmp = new PartTime("Bert", "Johnson", "KL777", 60000, 0.5);		
		FullTime ftEmp1 = new FullTime("Lizz", "Jann", "HG445", 33000, "HR");
		PartTime ptEmp1 = new PartTime("Sam", "Young", "KL757", 25000, 0.6);
		FullTime ftEmp2 = new FullTime("Carl", "Cross", "HG512", 60000, "Management");
		PartTime ptEmp2 = new PartTime("Jess", "Southon", "KL211", 23000, 0.8);

		Employee[] staff = new Employee[7];
		staff[0] = boss;
		staff[1] = ftEmp;
		staff[2] = ptEmp;
		staff[3] = ftEmp1;
		staff[4] = ptEmp1;
		staff[5] = ftEmp2;
		staff[6] = ptEmp2;

		for (Employee e : staff) {
			System.out.println(e.getFirstName() + " " + e.getLastName() + " £" + e.getMonthlyPay());
		}
	}
}