package training.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�ſ��"));
		messageQueue.offer(new Message("sendKakaotalk", "ȫ�α�"));
		
		while(!messageQueue.isEmpty()) {
			Message msg = messageQueue.poll();
			switch(msg.command) {
				case "sendMail":
					System.out.println(String.format("%s �Կ��� ������ �����ϴ�.", msg.to));
					break;
				case "sendSMS":
					System.out.println(String.format("%s �Կ��� SMS�� �����ϴ�.", msg.to));
					break;
				case "sendKakaotalk":
					System.out.println(String.format("%s �Կ��� īī������ �����ϴ�.", msg.to));
					break;
			}
			
		}
	}

}
