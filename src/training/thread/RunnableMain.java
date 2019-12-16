package training.thread;

public class RunnableMain {

	public static void main(String[] args) {
		Thread BeepThread = new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.printf("%s Compelete\n", Thread.currentThread().getName());		
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread BellThread = new Thread(new Runnable() {
			public void run() {
				
				for(int i=0; i<5; i++) {
					System.out.printf("%s Compelete\n", Thread.currentThread().getName());	
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
				
			}
		});
		BeepThread.setName("Beeper");
		BeepThread.setPriority(Thread.MAX_PRIORITY);
		BellThread.setName("Bell");
		
		BeepThread.start();
		BellThread.start();
	}

}
