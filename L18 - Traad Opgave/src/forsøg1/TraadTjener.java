package forsøg1;
import forsøg1.*;
import java.util.Queue;

public class TraadTjener implements Runnable {
    private static int antalTjenere = 0;
    private int tjenerNr = antalTjenere;
    private TraadKok kok;
    private Bestilling bestillingHoldt;
    public TraadTjener(TraadKok kok) {
        antalTjenere++;
        this.kok = kok;
    }

    @Override
    public synchronized void run() {
        while (true) {

            try {
                this.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Bestilling bestilling = new Bestilling(Tæller.givTal());
            bestillingHoldt = bestilling;
            kok.addBestilling(bestilling, this);
        }
    }

    @Override
    public String toString() {
        return "TraadTjener " + "(" + tjenerNr + ")";
    }
}
