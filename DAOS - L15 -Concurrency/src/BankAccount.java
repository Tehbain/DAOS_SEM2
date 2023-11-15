

public class BankAccount {

	private double balance;

	public synchronized void credit (double amount) {
		balance = balance + amount;
		System.out.println("Kredit: " + balance);
		notify();
	}

	public synchronized void debit (double amount) {
		if (balance - amount >= 0) {
			balance = balance - amount;
			System.out.println("Debit: " + amount);
		} else {
			try {
				wait();
				System.out.println("Der ventes...");
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public void setBalance(double amount, String c) {

	}

	public double getBalance() {
		return balance;
	}
}
