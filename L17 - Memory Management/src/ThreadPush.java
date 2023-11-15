import java.util.Random;

public class ThreadPush extends Thread {
    private Stack stack;
    private static Random random = new Random();

    public ThreadPush(Stack stack) {
        this.stack = stack;
    }

    public void run() {
        while (true) {
            try {
                this.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i = random.nextInt(11);
            stack.push(i);
            System.out.println("PUSH! " + i);
            System.out.println(stack.toString());
        }
    }

//    public void run(int num) {
//        while (true) {
//            if (stack.is_empty() || true) {
//                System.out.println("POP! " + num);
//                stack.push(num);
//                notify();
//            } else {
//                try {
//                    sleep(600);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }
}
