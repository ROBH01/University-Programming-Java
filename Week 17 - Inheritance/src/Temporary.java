
class Temporary extends Employee {
	private double hoursWorked;

	Temporary(String firstName, String lastName, String NiNo, double salary, double hoursWorked) {
		super(firstName, lastName, NiNo, salary);
		this.hoursWorked = hoursWorked;
	}

	double getHoursWorked() {
		return hoursWorked;
	}

	void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	double getMonthlyPay() {
		double amountPerHour = super.getSalary() / 52 / 40;
		return Double.parseDouble(String.format("%.2f", amountPerHour * hoursWorked));
	}
}
