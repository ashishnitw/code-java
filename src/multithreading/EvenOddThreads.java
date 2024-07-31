package multithreading;

public class EvenOddThreads {
    private final Object lock = new Object();   // shared resource
    private int current = 1;  // Starting number
    private int max;  // Ending number

    public EvenOddThreads(int max) {
        this.max = max;
    }

    public void printOdd() {
        synchronized (lock) {
            while (current <= max) {
                if (current % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " - " + current);
                current++;
                lock.notify();
            }
        }
    }

    public void printEven() {
        synchronized (lock) {
            while (current <= max) {
                if (current % 2 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " - " + current);
                current++;
                lock.notify();
            }
        }
    }

    public static void main(String[] args) {
        EvenOddThreads eot = new EvenOddThreads(50);
        Thread t1 = new Thread(eot::printOdd, "Odd");
        Thread t2 = new Thread(eot::printEven, "Even");

        t2.start();
        t1.start();
    }

}
