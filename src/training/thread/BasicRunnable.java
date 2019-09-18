package training.thread;

public class BasicRunnable implements Runnable{

	public void run() {
		System.out.println("Running thread is " + Thread.currentThread().getName());
	}
}
