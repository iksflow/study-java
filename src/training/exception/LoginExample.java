package training.exception;

public class LoginExample {

	public static void main(String[] args) {
		try {
//			login("blue", "54321");	
			login("white", "12345");
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		try {
//			login("blue", "54321");	
//			login("white", "12345");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		} 
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		if (!id.equals("blue")) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");	
		}
		
		if (!password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�");
		}
	}
}
