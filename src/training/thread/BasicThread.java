package training.thread;

public class BasicThread extends Thread{
	
	public void run() {
		System.out.println("This thread is " + Thread.currentThread().getName());
	}
}
