package training.thread;

public class DiffOfStartAndRunExample {

	public static void main(String[] args) {
		RunnableExam runExam = new RunnableExam();
		Thread thread1 = new Thread(runExam);
		thread1.setName("Thread One");
		
		thread1.start();
		thread1.run();
	}

}
