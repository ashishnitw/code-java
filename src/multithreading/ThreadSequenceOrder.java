package multithreading;

class SequencePrinter implements Runnable{
	
	int id;
	static Object monitor = new Object();
	static int count = 0;
	static int n = 3;
	
	public SequencePrinter(int id) {
		this.id = id;
	}
	@Override
	public void run() {
		print();
	}
	public void print() {
		try {
			while(true) {
				Thread.sleep(1000);
				synchronized(monitor) {
					if(count % 3 != id) {
						monitor.wait();
					}
					else {
						System.out.println("Thread[" + id + "] : " + count);
						count++;
						monitor.notifyAll();
					}
				}
			}
		}
		catch (InterruptedException e){e.printStackTrace();}
	}
	
}

public class ThreadSequenceOrder {
	
	
	public static void main(String[] args) {
		Thread p0 = new Thread(new SequencePrinter(0));
		Thread p1 = new Thread(new SequencePrinter(1));
		Thread p2 = new Thread(new SequencePrinter(2));
		
		p0.start();
		p1.start();
		p2.start();
		
		
	}
}
