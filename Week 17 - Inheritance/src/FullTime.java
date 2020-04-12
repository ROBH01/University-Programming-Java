
public class FullTime extends Employee{
	private String department;
	
	FullTime(String firstName, String lastName, String NiNo, double salary, String department) {
		super(firstName, lastName, NiNo, salary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
}

