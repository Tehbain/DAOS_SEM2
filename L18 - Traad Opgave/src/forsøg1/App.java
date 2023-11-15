package forsøg1;
import forsøg1.*;
// Det maksimalistiske forsøg. GG
public class App {
    public static void main(String[] args) {

        TraadKok k1 = new TraadKok();

        TraadTjener t1 = new TraadTjener(k1);
        TraadTjener t2 = new TraadTjener(k1);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(k1);

        Thread[] threads = new Thread[]{thread1,thread2,thread3};
        for (Thread thread : threads) {
            thread.start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n Prøver JOIN");

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n JOIN gennemført");

        /*
         for (Thread thread : threads)  {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
         */

    }
}
