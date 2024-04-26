package multithreadingold;

// A java bean class on which threads will work and call wait and notify methods.
class Message {
	String msg;
	public Message(String msg) {
		this.msg = msg;
	}
}

// A class that will wait for other threads to invoke notify methods to complete it’s processing.
// Notice that Waiter thread is owning monitor on Message object using synchronized block.
class Waiter implements Runnable {
	private Message msg;

	public Waiter(Message msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (msg) {
			try {
				System.out.println(name + " waiting to get notified at time:" + System.currentTimeMillis());
				msg.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " waiter thread got notified at time:" + System.currentTimeMillis());
			System.out.println(name + " processed: " + msg.msg);
		}
	}
}

// A class that will process on Message object and then invoke notify method to wake up threads waiting for Message object.
// Notice that synchronized block is used to own the monitor of Message object.
class Notifier implements Runnable {
	private Message msg;

	public Notifier(Message msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try {
			Thread.sleep(1000);
			synchronized (msg) {
				msg.msg = name + " Notifier work done";
//				msg.notify();
				msg.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadWaitNotify {
	public static void main(String[] args) {
		Message msg = new Message("process it");
		Waiter waiter = new Waiter(msg);
		new Thread(waiter,"waiter1").start();

		Waiter waiter1 = new Waiter(msg);
		new Thread(waiter1, "waiter2").start();

		Notifier notifier = new Notifier(msg);
		new Thread(notifier, "notifier").start();
		System.out.println("All the threads are started");
	}
}
