package opg4;

public class Main {
    public static void main(String[] args) {
        Faelles f1 = new Faelles();

        MyThread t1 = new MyThread("YEET", f1);
        MyThread2 t2 = new MyThread2("KOBE", f1);

        t1.start();
        t2.start();
    }
}
