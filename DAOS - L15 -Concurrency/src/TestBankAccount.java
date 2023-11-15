

public class TestBankAccount {

	public static void main(String[] args) throws InterruptedException {
		BankAccount ba = new BankAccount();
			BankAccountTraad bat1 = new BankAccountTraad(ba);
			BankAccountTraad2 bat2 = new BankAccountTraad2(ba);
			
			bat1.start();
			bat2.start();

			bat1.join();
			bat2.join();



//			boolean lever = true;
//			boolean hjerteSlår = true;
//			boolean rullesten = true;
//			boolean såVilJegOgsåElskeDig = false;
//			while (lever) {
//				while (hjerteSlår) {
//					boolean elskeDig = true;
//					if (rullesten) {
//						såVilJegOgsåElskeDig = true;
//					}
//				}
//			}
	}
}
