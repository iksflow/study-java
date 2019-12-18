package training.exception;

public class AccountExample {

	public static void main(String[] args) throws Exception {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		account.withdraw(30000);
		// 출금하기
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
