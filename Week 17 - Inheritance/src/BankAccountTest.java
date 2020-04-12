
public class BankAccountTest {

	public static void main(String[] args) {
				BasicAccount basic = new BasicAccount("0123456789", 1000, "5555555555");
				System.out.println("Balance start " + basic.getBalance());

				System.out.println("Adding deposit of 1000... ");
				basic.deposit(1000);

				System.out.println("Balance after deposit: " + basic.getBalance());

				System.out.println("Deduction of 1500...");
				basic.withdraw(1500);

				System.out.println("Final balance: " + basic.getBalance());
				System.out.println();
		/////////////////////////  END BASIC  /////////////////////////////////////////
				CurrentAccount current = new CurrentAccount("ad5ds5", 1000, 500);
				System.out.println("Balance start " + current.getBalance());

				System.out.println("Adding deposit of 1000... ");
				current.deposit(1000);

				System.out.println("Balance after deposit: " + current.getBalance());

				System.out.println("Deduction of 1500...");
				current.withdraw(1500);

				System.out.println("Final balance: " + current.getBalance());

				System.out.println("Deduction of 500...");
				current.withdraw(500);
				System.out.println("Final balance: " + current.getBalance());

				System.out.println("Deduction of 60...");
				current.withdraw(60);
				System.out.println("Final balance: " + current.getBalance());
				System.out.println();
		///////////////////////// END CURRENT  /////////////////////////////////////////		
			    SavingsAccount savings = new SavingsAccount("gggf5f5", 1000, 1.05);
				System.out.println("Balance start " + savings.getBalance());

				System.out.println("Adding deposit of 1000... ");
				savings.deposit(1000);

				System.out.println("Balance after deposit: " + savings.getBalance());

				System.out.println("Deduction of 1500...");
				savings.withdraw(1500);

				System.out.println("Final balance: " + savings.getBalance());

				double x = savings.getInterestRate() * savings.getBalance() - savings.getBalance();
				System.out.println("Adding the interest rate of £" + x + " to the balance");
				savings.payInterest();

				System.out.println("Final balance: " + savings.getBalance());

				System.out.println("Deduction of 500...");
				savings.withdraw(500);

				System.out.println("Final balance: " + savings.getBalance());

				System.out.println("Deduction of 1500...");
				savings.withdraw(1500);

				System.out.println("Final balance: " + savings.getBalance());
				System.out.println("Interest rate: " + savings.getInterestRate());
				///////////////////////// END SAVINGS  /////////////////////////////////////////		
	}
}