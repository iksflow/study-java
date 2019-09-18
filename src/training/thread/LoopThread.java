package training.thread;

public class LoopThread extends Thread{
	
	public LoopThread(String name) {
		this.setName(name);
	}
	public void run() {
		for (int i = 0; i < 2000000000; i++) {
		}
		System.out.println(Thread.currentThread().getName());
	}
}
