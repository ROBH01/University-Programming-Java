
public class BasicAccount extends BankAccount {
	private String cardNumber;

	BasicAccount(String accountNumber, double balance, String cardNumber) {
		super(accountNumber, balance);
		this.cardNumber = cardNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
}
