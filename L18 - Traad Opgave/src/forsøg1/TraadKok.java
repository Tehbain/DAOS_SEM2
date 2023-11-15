package forsøg1;
import java.util.PriorityQueue;
import java.util.Queue;

public class TraadKok implements Runnable {
    private final Queue<Bestilling> bestillinger = new PriorityQueue<Bestilling>();

    public TraadKok() {
    }

    @Override
    public synchronized void run() {

        while (true) {
            try {
                this.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tilberedBestillinger();

        }

    }

    public void addBestilling(Bestilling bestilling, TraadTjener tjener) {
        this.bestillinger.add(bestilling);
        System.out.println(tjener.toString() + " HAR AFGIVET BESTILLING:  " + bestilling);
    }

    public Bestilling tilberedBestillinger() {
        Bestilling tilberedning = bestillinger.poll();
        System.out.println("KOKKEN HAR TILBEREDT BESTILLING: " + tilberedning);
        System.out.println("   BESTILLINGER TILBAGE: " + bestillinger);
        return tilberedning;
    }
}
