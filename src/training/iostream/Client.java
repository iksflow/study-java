package training.iostream;

import java.net.Socket;

public class Client {
	Socket socket;
	
	Client(Socket socket) {
		this.socket = socket;
		receive();
	}
	
	void receive() {
		
	}
	
	void send(String data) {
		
	}
	
}
