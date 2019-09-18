package training;

public class RunnableB implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("RunnableB's current thread is %s\n", Thread.currentThread());
		System.out.println("Runnable B is Running");
	}

}
