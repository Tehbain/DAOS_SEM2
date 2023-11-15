import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Stack stack = new Stack();
        ThreadPush tPush = new ThreadPush(stack);
        ThreadPop tPop = new ThreadPop(stack);

        tPush.start();
        tPop.start();

        

        try {
            tPush.join();
            tPop.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        int num = 0;
        while (num < 100) {
            tPush.run();
            tPop.run();
            num++;
        }

    }
}
