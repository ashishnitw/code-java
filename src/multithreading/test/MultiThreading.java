package multithreading.test;

import java.util.ArrayList;
import java.util.List;

public class MultiThreading {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("i = " + i + " thread = " + Thread.currentThread());
            }
        };

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            threads.add(new Thread(r));
        }

        for (int i = 0; i < 32; i++) {
            threads.get(i).start();
        }
    }
}