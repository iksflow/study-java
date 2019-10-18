package training.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail", "È«±æµ¿"));
		messageQueue.offer(new Message("sendSMS", "½Å¿ë±Ç"));
		messageQueue.offer(new Message("sendKakaotalk", "È«µÎ±ú"));
		
		while(!messageQueue.isEmpty()) {
			Message msg = messageQueue.poll();
			switch(msg.command) {
				case "sendMail":
					System.out.println(String.format("%s ´Ô¿¡°Ô ¸ÞÀÏÀ» º¸³À´Ï´Ù.", msg.to));
					break;
				case "sendSMS":
					System.out.println(String.format("%s ´Ô¿¡°Ô SMS¸¦ º¸³À´Ï´Ù.", msg.to));
					break;
				case "sendKakaotalk":
					System.out.println(String.format("%s ´Ô¿¡°Ô Ä«Ä«¿ÀÅåÀ» º¸³À´Ï´Ù.", msg.to));
					break;
			}
			
		}
	}

}
