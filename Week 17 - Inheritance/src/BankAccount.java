
class BankAccount {
	private String accountNumber;
	private double balance;

	BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	String getAccountNumber() {
		return accountNumber;
	}

	void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	void deposit(double amount) {
		setBalance(getBalance() + amount);
	}

	void withdraw(double amount) {
		if (amount > getBalance()) {
			System.out.println("Sorry, you cannot withdraw this sum because you only have £" + getBalance());
		}
		else {
			setBalance(getBalance() - amount);	
		}
	}
}
