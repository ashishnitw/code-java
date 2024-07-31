package multithreading;

class ThreadShutDown extends Thread {
	public void run() {
		System.out.println("shut down hook task completed..");
	}
}
public class ThreadRuntimeShutdown {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();	// singleton class
		r.addShutdownHook(new ThreadShutDown());
		System.out.println("Now main sleeping... press ctrl+c to exit");
		try{
			Thread.sleep(10000);
		} catch (Exception e) {

		}
	}
}
