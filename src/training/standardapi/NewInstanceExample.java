package training.standardapi;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz1 = Class.forName("training.standardapi.SendAction");
			Action action1 = (Action) clazz1.newInstance();
			action1.execute();
			
			Class clazz2 = Class.forName("training.standardapi.ReceiveAction");
			Action action2 = (Action) clazz2.newInstance();
			action2.execute();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e) {
			
		}
	}

}
