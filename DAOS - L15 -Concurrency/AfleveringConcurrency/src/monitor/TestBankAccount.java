package CriticalSection.monitor;

public class TestBankAccount {

	public static void main(String[] args) throws InterruptedException {
		BankAccount ba = new BankAccount();
			BankAccountTraad bat1 = new BankAccountTraad(ba);
			BankAccountTraad2 bat2 = new BankAccountTraad2(ba);
			
			bat1.start();
			bat2.start();
			try {
				bat1.join();
				bat2.join();
				System.out.println(ba.getBalance());
			} catch (InterruptedException e) {
				throw new InterruptedException();
			}
		}
}
