package opg3;

import java.util.Random;

public class Faelles {
    private int tæller = 0;

    public void tagerRandomTid(int max) {
        Random r = new Random();
        int nyMax = Math.abs(r.nextInt() % max + 1);

        for (int i = 0; i < 10; i++) {
            int yeet = (int) (Math.random()*100);
            for (int j = 0; j < 100; j++) {
                yeet -= (int) Math.random()*50;
            }
        }
    }

    public int getTæller() {
        return tæller;
    }

    public synchronized void kritiskSektion() {
        int temp;
        temp = getTæller();
        tagerRandomTid(100);
        tæller = temp + 1;
    }
}
