
public class Employee {
	private String firstName;
	private double salary;
	private Department dept;
	private int employeeID;
	
	/**
	 * Static variable that holds the next available Employee ID number. Incremented
	 * automatically by the constructor when the Employee object is created each time.
	 */
	private static int nextID = 1000;
	
	/**
	 * Creates an Employee with a name, salary and the Current Department they work for.
	 * Automatically sets the <code>employeeID</code> as the next available number of nextID.
	 * 
	 * @param firstName Name of Employee
	 * @param salary Salary of the Employee
	 * @param dept Current Department the Employee works for
	 */
	Employee(String firstName, double salary, Department dept) {
		this.firstName = firstName;
		this.salary = salary;
		this.dept = dept;
		employeeID = nextID;
		nextID++;
	}

	/**
	 * Constructor that creates an employee with a name only.
	 * Automatically sets the <code>employeeID</code> as the next available number of nextID.
	 * @param firstName Name of Employee
	 */
	public Employee(String firstName) {
		this.firstName = firstName;
		this.salary = 0;
		employeeID = nextID;
		nextID++;
	}

	/**
	 * Returns a String containing the first name of the employee
	 * @return <code>firstName</code> First name of the employee
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Allows to set the salary of an Employee
	 * @param salary Salary of the Employee
	 */
	void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * Returns the monthly pay of an Employee
	 * @return <code>salary/12</code> monthly pay of the employee
	 */
	public double getMonthlyPay() {
		return salary / 12;
	}

	/**
	 * Sets the Department desired from the existing departments.
	 * @param dept Dept of the employee
	 */
	public void setDept(Department dept) {
		this.dept = dept;
	}

	/**
	 * Takes off the dept of an Employee. Sets it to null.
	 */
	public void takeOffDept() {
		this.dept = null;
	}

	/**
	 * Returns the dept
	 * @return dept
	 */
	public Department dept() {
		return dept;
	}
	
	/**
	 * It returns the <code>nextID</code> for an employee
	 * @return nextID  
	 */
	public static int getNextID() {
		return nextID;
	}

	/**
	 * It returns a formatted String with the information about <code>employeeID</code>,
	 *  <code>firstName</code>, <code>salary</code>, and the Name and Manager of that <code>dept</dept>.
	 */
	public String toString() {
		return "Employee [[" + employeeID + "] " + firstName + ", £" + salary +  ", " + "[dept = " + dept.getDeptName()
				+ ", mgr: " + dept.getManager() + "]]";
	}
}
