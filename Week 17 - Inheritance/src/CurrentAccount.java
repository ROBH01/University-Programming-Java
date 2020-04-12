
public class CurrentAccount extends BankAccount {
	private double overdraftLimit;

	CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	private double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public double getAvailableBalance() {
		return super.getBalance() + getOverdraftLimit();
	}

	@Override
	public void withdraw(double amount) {
		if (amount > super.getBalance() + overdraftLimit) {
			System.out.println("Sorry, you cannot withdraw this sum because your overdraft limit is £" + overdraftLimit);
		}
		else {
			setBalance(super.getBalance() - amount);	
		}
	}
}
