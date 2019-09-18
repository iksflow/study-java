package training.thread.priority;

import training.thread.LoopThread;

public class SetPriorityExam {

	public static void main(String[] args) {
		
		for (int i = 1; i < 3; i++) {
			Thread thread = new LoopThread("Thread" + i);
			if (i == 2) {
				thread.setPriority(Thread.MAX_PRIORITY);
			} else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			thread.start();
		}
	}

}
