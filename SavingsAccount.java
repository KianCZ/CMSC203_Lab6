package lab6;

public class SavingsAccount extends BankAccount {
	private double rate = .025;
	private int savingsNumber = 0;
	private int accountNumber;

	SavingsAccount(String n, double b) {
		super(n, b);
		setAccountNumber(getAccountNumber() + "-" + savingsNumber);
	}

	SavingsAccount(SavingsAccount s, double b) {
		super(s, b);
		this.savingsNumber++;
		setAccountNumber(getAccountNumber().substring(0, getAccountNumber().length() - 2) + "-" + savingsNumber);
	}

	public void postInterest() {
		deposit(getBalance() * rate / 12);
	}

	public String getAccountNumber() {
		return super.getAccountNumber();
	}
}
