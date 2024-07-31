package _07_concurrency._01_threads;

public class _02_CreateThread {

    static class DemoThread extends Thread {
        public void run() {
            System.out.println("we are now in thread " + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before starting a new thread");
        Thread t = new DemoThread();
        t.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " after starting a new thread");
    }
}
