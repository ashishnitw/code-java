package multithreadingold;

class JoinDemo extends Thread {
	@Override
	public void run() {
		System.out.println("Thread started:::"+Thread.currentThread().getName());
		for(int i=1;i<=5;i++){
			try { Thread.sleep(500); } catch (Exception e) { System.out.println(e.getMessage()); }
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
public class ThreadJoin {
	public static void main(String[] args) throws Exception {
		JoinDemo t1 = new JoinDemo();
		JoinDemo t2 = new JoinDemo();
		JoinDemo t3 = new JoinDemo();

		t1.start();
		t1.join(1000);
		t2.start();
		t1.join();
		t3.start();
		t1.join();
		t2.join();
		t3.join();

		System.out.println("All threads are dead, exiting main thread");
	}
}
