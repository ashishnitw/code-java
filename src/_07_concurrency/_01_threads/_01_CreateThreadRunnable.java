package _07_concurrency._01_threads;

public class _01_CreateThreadRunnable {

    static class DemoRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("we are now in thread " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        // Create a thread using the Thread class

        // 1. Using anonymous class
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("we are now in thread " + Thread.currentThread().getName());
            }
        });

        // 2. Using lambda expression (Easiest way)
        Thread thread2 = new Thread(() -> {
            System.out.println("we are now in thread " + Thread.currentThread().getName());
        });

        // 3. Using the Runnable interface
        Thread thread3 = new Thread(new DemoRunnable());

        // Start the threads
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before starting a new thread");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " after starting a new thread");
    }
}
