package training.thread;

public class RunnableExam implements Runnable{
	public void run() {
		System.out.println("running thread name::" + Thread.currentThread().getName());
	}
}
