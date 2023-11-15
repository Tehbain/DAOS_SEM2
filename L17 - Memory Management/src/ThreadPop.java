import java.util.Random;

public class ThreadPop extends Thread{
    private Stack stack;

    public ThreadPop(Stack stack) {
        this.stack = stack;
    }

    public void run() {
        while (true) {
            try {
                this.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("POP! " + stack.pop());
            System.out.println(stack.toString());
        }
    }

//    public synchronized void run() {
//        while (true) {
//            if (!stack.is_empty()) {
//
//                System.out.println("PUSH! " + stack.pop());
//            } else {
//                try {
//                    this.sleep(300);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }
}
