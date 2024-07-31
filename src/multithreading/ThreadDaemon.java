package multithreadingold;

public class ThreadDaemon extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("I am a Daemon Thread");
        } else {
            System.out.println("I am a User Thread");
        }
    }
    public static void main(String[] args) {
        Thread t1 = new ThreadDaemon();
        Thread t2 = new ThreadDaemon();
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
