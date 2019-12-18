package training.exception;

public class AccountExample {

	public static void main(String[] args) throws Exception {
		Account account = new Account();
		// �����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: " + account.getBalance());
		account.withdraw(30000);
		// ����ϱ�
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}
}
