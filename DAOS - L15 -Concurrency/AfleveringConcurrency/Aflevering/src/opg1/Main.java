package opg1;

public class Main {
    public static void main(String[] args) {
        Faelles f1 = new Faelles();

        MyThread t1 = new MyThread("YEET", f1);
        MyThread t2 = new MyThread("KOBE", f1);

        t1.start();
        t2.start();
    }
}
