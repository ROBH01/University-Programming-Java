
public class SavingsAccount extends BankAccount {
	private double interestRate;
	
	SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	void payInterest() {
		super.setBalance(super.getBalance() * getInterestRate());
	}
}
