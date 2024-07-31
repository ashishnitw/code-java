package _07_concurrency._01_threads;

public class _03_ThreadException {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            throw new RuntimeException("Intentional Exception");
        });
        t.setUncaughtExceptionHandler((thread, exception) -> {
            System.out.println("A critical error happened in thread " + thread.getName() + " with exception " + exception.getMessage());
        });
        t.setName("Misbehaving Thread");
        t.start();
    }
}
