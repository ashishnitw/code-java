package multithreadingold;

class CounterSync {
    int count;
    public synchronized void increment() {
        count++;
    }
}
class Counter {
    int count;
    public void increment() {
        count++;
    }
}

public class ThreadSynchronize {
    public static void main(String[] args) throws InterruptedException {
        // Not Synchronized
        Counter counter1 = new Counter();
        Runnable r = ()->{
            for(int i=0;i<1000;i++) {
                counter1.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count: "+ counter1.count);

        // Synchronized
        CounterSync counter2 = new CounterSync();
        Runnable rsync = ()->{
            for(int i=0;i<1000;i++) {
                counter2.increment();
            }
        };
        Thread t3 = new Thread(rsync);
        Thread t4 = new Thread(rsync);
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println("count: "+ counter2.count);
    }
}