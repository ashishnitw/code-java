package multithreading;
// package MultiThreading;

import java.util.LinkedList;
import java.util.List;

public class ThreadProdCons {
	private Object lock = new Object();
	private int count = 0;
	private List<Integer> buff = new LinkedList<>();
	private final int MAX_SIZE = 2;
	
	public void produce() throws InterruptedException {
		synchronized(lock) {
			if(buff.size()==MAX_SIZE)
				lock.wait();
			System.out.println("Produce : " + count);
			buff.add(count++);
			lock.notifyAll();
		}
	}
	
	public void consume() throws InterruptedException {
		synchronized(lock) {
			if(buff.size()==0)
				lock.wait();
			int k = buff.remove(0);
			System.out.println("Consume : " + k);
			lock.notifyAll();
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		ThreadProdCons pc = new ThreadProdCons();
		Runnable pr = ()->{
			while(pc.count<100)
				try {pc.produce();} catch (InterruptedException e) {e.printStackTrace();}
		};
		Runnable cr = ()->{
			try {pc.consume();} catch (InterruptedException e) {e.printStackTrace();}
		};
		
		Thread p = new Thread(pr);
		Thread c = new Thread(cr);
		p.start();
		c.start();
		p.join();
		c.join();
		
	}
}
