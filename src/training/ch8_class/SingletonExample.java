package training.ch8_class;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singletone s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if (s1 == s2) {
			System.out.println("µø¿œ«— ∞¥√º");
		} else {
			System.out.println("¥Ÿ∏• ∞¥√º");
		}
	}
}
