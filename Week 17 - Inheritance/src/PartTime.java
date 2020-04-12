
public class PartTime extends Employee {
	private double proRata;

	PartTime(String firstName, String lastName, String NiNo, double salary, double proRata) {
		super(firstName, lastName, NiNo, salary);
		this.proRata = proRata;
	}
	
	public double getProRata() {
		return proRata;
	}
	
	public void setProRata(double proRata) {
		this.proRata = proRata;
	}
	
	@Override
	public double getMonthlyPay() {
		return super.getMonthlyPay() * proRata;
	}
}
