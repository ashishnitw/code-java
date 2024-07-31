package multithreadingold;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

class MyCallableDemo implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }
}

public class CallableFuture {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<Future<String>>();
        Callable<String> callable = new MyCallableDemo();
        for (int i = 0; i < 100; i++) {
            // submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable);
            // add Future to the list, we can get return value using Future
            list.add(future);
        }
        for (Future<String> f : list) {
            try {
                // print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println(new Date() + "::" + f.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
