

public class BankAccountTraad extends Thread {

	private BankAccount ba;

	public BankAccountTraad(BankAccount ba) {
		this.ba = ba;
	}

	public void run() {
		int i = 0;
		while (i < 4) {
			try {
				this.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ba.debit(150);
			i++;
		}
		System.out.println("Balancen er: " + ba.getBalance());
	}

}
