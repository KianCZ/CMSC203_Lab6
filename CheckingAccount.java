package lab6;

public class CheckingAccount extends BankAccount {
	private static double FEE = .15;

	CheckingAccount(String n, double f) {
		super(n, f);
		setAccountNumber(getAccountNumber() + "-10");
	}

	public boolean withdraw(double amount) {
		amount += FEE;
		boolean completed = true;

		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
		} else {
			completed = false;
		}
		return completed;
	}
}
