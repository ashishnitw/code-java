package multithreadingold;

class ThreadDL {
    private Object o1 = new Object();
    private Object o2 = new Object();
    public void a() {
        synchronized(o1){
            System.out.println(Thread.currentThread().getName() + " is inside A");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b();
        }
    }
    public void b() {
        synchronized(o2){
            System.out.println(Thread.currentThread().getName() + " is inside B");
            c();
        }
    }
    public void c() {
        synchronized(o1){
            System.out.println(Thread.currentThread().getName() + " is inside C");
        }
    }
}
public class ThreadDeadlock {
    public static void main(String[] args) throws Exception {
        System.out.println("start of program");

        ThreadDL td = new ThreadDL();
        Runnable r1 = ()->td.a();
        Runnable r2 = ()->td.b();

        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("after deadlock");
    }
}
