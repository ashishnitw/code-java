package multithreading;
// package MultiThreading;

class Parcel{
	private int num;
	boolean valueSet = false;
	public synchronized void consume() throws Exception {
		if(!valueSet)
			wait();
		System.out.println("Get: " + num);
		valueSet = false;
		notify();
	}
	public synchronized void produce() throws Exception {
		if(valueSet)
			wait();
		num++;
		System.out.println("Set: " + num);
		valueSet = true;
		notify();
	}
}

public class ThreadProducerConsumer {
	public static void main(String[] args) {
		Parcel a = new Parcel();
		Thread p = new Thread(() -> {
				while(true) {
					try {a.produce(); Thread.sleep(500);} 
					catch (Exception e) { e.printStackTrace(); }
				}});
		Thread c = new Thread(() -> {
				while(true) {
					try {a.consume(); Thread.sleep(2000);} 
					catch (Exception e) { e.printStackTrace(); }
				}});
		p.start();
		c.start();
	}
}
