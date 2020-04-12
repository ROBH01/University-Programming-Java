
class Employee {
	private String firstName,lastName,job;
	private double salary;
	private int age;
	
	Employee() {  } // allows to create what is accessible to the user = this will only create the empty object
	
	Employee (String firstName, String lastName, String job, int age, double salary) { // this will create the object with the possibility to add data in it.
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
		this.salary = salary;
		this.age = age;
	}
	
	Employee (String firstName, double salary) { // if i want that another class only is allowed to add first name and salary to the object, this should be the only constructor.
		this.firstName = firstName;
		this.salary = salary;
	}
	
	Employee (String firstName) {
		this.firstName = firstName;
		this.salary = 0;
	}
	
	String getFirstName() {
		return firstName;
	}
	
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	String getJob() {
		return job;
	}
	
	void setJob(String job) {
		this.job = job;
	}
	
	double getSalary() {
		return salary;	
	}
	
	void setSalary (double salary) {
		this.salary = salary;
	}
	
	double getMonthlyPay() {
		return salary / 12;
	}
	
	public String toString() {
		return "First name: (" + firstName + ") " + "Last name: (" + lastName + ") " + "Age: (" + age + ") " + "Job: (" + job + ") " + "Salary: (£" + salary + ")";
	}
}
