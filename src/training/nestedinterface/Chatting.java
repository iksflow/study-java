package training.nestedinterface;

public class Chatting {
	void startChat(String chatId) {
        String nickName = chatId;
//        nickName = chatId;
        Chat chat = new Chat() {
            @Override
            void start() {
                while(true) {
                    String inputData = "�ȳ��ϼ���";
                    String message = "[" + nickName + "]" + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
    
    class Chat {
        void start() {}
        void sendMessage(String message) { }
    }
}
