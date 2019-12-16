package training.thread;

public class StatePrintThread extends Thread{
	
	private Thread target;
	
	public StatePrintThread(Thread target) {
		this.target = target;
	}
	
	public void run() {
		while(true) {
			Thread.State state = target.getState();
			System.out.println("타겟 스레드 상태:: " + state);
			
			if(state == Thread.State.NEW) {
				target.start();
			}
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
