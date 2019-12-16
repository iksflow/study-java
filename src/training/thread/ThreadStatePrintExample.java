package training.thread;

public class ThreadStatePrintExample {

	public static void main(String[] args) {
		TargetThread target = new TargetThread();
		StatePrintThread printerThread = new StatePrintThread(target);
		printerThread.start();
	}

}
