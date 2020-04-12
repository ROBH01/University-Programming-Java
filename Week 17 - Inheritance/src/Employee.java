
public class Employee implements Talkative {
	private String firstName, lastName, NiNo;
	private double salary;
	
	Employee() {  }
	
	Employee(String firstName, String lastName, String NiNo, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.NiNo = NiNo;
		this.salary = salary;
	}
	
	public void talk() {
		System.out.println("Hi, how are you today?");
	}
	
	String getFirstName() {
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	String getNiNo() {
		return NiNo;
	}
	
	double getSalary() {
		return salary;
	}
	
	double getMonthlyPay() {
		return salary / 12;
	}
}
