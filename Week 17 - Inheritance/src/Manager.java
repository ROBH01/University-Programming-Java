
public class Manager extends Employee {
	private double bonus;
	
	Manager(String firstName, String lastName, String NiNo, double salary, double bonus) {
		super(firstName, lastName, NiNo, salary);
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double getMonthlyPay() {
		return super.getMonthlyPay() + bonus;
	}
}
