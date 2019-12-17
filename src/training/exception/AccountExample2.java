package training.exception;

import java.util.Scanner;

public class AccountExample2 {
	/* try catch문을 통해 예외처리를 해서 
	 * 예외가 발생하는부분의 메소드에서 예외를 처리하도록 만들었다.
	 * main 메소드의 실행이 멈추지않는다.
	 */
	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("얼마를 인출하시나요?");
			int withdraw = sc.nextInt();
			account.deposit(10000);
			System.out.println("예금액: " + account.getBalance());
			// 출금하기
			try {
				account.withdraw(withdraw);
			} catch (BalanceInsufficientException e) {
				String message = e.getMessage();
				System.out.println(message);
				System.out.println();
				e.printStackTrace();
			}
		}
	}

}
