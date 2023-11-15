package opg2;

public class Main {
    private static short turn;
    private static boolean[] flag;




    public static void main(String[] args) {
            flag = new boolean[2];
            flag[0] = false;
            flag[1] = false;
            turn = 1;

        Faelles f1 = new Faelles();

        MyThread1 t1 = new MyThread1("YEET", f1);
        MyThread2 t2 = new MyThread2("KOBE", f1);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(f1.getTæller());
    }

    public static boolean getFlag(int index) {
        return flag[index];
    }

    public static void setFlag(int index, boolean b) {
        flag[index] = b;
    }

    public static int getTurn() {
        return turn;
    }
    public static void setTurn(short setValue) {
        turn = setValue;
    }
}
