package multithreadingold;

class DemoThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class DemoRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class ThreadBasics {
    public static void main(String[] args) {
        new DemoThread().start();
        new Thread(new DemoRunnable()).start();
        System.out.println("End of program");
    }
}
