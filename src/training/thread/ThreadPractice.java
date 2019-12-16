package training.thread;

public class ThreadPractice {
	public static void main(String[] args) {
		ThreadA thread1 = new ThreadA();
		Thread thread2 = new Thread(new RunnableB());
		thread2.setName("THREADGOD");
		thread1.start();
		thread2.start();
		System.out.println(Thread.currentThread().getName());
	}
}
