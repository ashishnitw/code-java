package interview.multithreading;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(new HashMap<>());    // synchronizedMap is a wrapper around HashMap
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();   // Recommended: ConcurrentHashMap is a thread-safe map. Better performance than synchronizedMap

        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i= 0; i < 1000; i++) {
            int key = i;
            executor.submit(() -> {
                map.put("A" + key, key);
                concurrentMap.put("A" + key, key);
                synchronizedMap.put("A" + key, key);
            });
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS); // wait for 5 seconds for all threads to finish

        System.out.println(map.size());
        System.out.println(concurrentMap.size());
        System.out.println(synchronizedMap.size());
    }
}
