package _07_concurrency._02_coordination;

public class _01_ThreadTermination {
    public static void main(String[] args) {

        // Blocking thread
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.. Exiting blocking thread");
            }
        });

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.. Exiting main thread");
        }

        thread.interrupt();
    }
}
