
class Staff extends UniversityPeople {
	private String niNo, department;
	private double salary;
	
	Staff(String name, String address, String phoneNumber, String niNo, String department, double salary) {
		super(name, address, phoneNumber);
		this.niNo = niNo;
		this.department = department;
		this.salary = salary;
	}
	
	String getNiNo() {
		return niNo;
	}
	
	String getDepartment() {
		return department;
	}
	
	double getSalary() {
		return salary;
	}
	
	void setNiNo(String niNo) {
		this.niNo = niNo;
	}
	
	void setDepartment(String department) {
		this.department = department;
	}
	
	void setSalary(double salary) {
		this.salary = salary;
	}
}
