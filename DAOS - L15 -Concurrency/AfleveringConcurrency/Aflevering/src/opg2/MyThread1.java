package opg2;

public class MyThread1 extends Thread{
    private String navn;
    private Faelles faelles;

    public MyThread1(String navn, Faelles faelles) {
        this.navn = navn;
        this.faelles = faelles;
    }

    public void run() {
        for (int j=0; j<100;j++) {
            Main.setFlag(0, true);
            Main.setTurn((short) 1);
            while(Main.getFlag(1) && Main.getTurn() == 1) {
            }
            faelles.kritiskSektion();
            Main.setFlag(0, false);
            faelles.tagerRandomTid(100);
        }
        System.out.println(faelles.getTæller());
    }
}
